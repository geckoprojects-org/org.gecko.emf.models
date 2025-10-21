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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;


import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

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
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BeistandschaftPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/beistandschaft.ecore", ecoreSourceLocations="/model/beistandschaft.ecore")
public interface BeistandschaftPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "beistandschaft";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/beistandschaft/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "beistandschaft";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BeistandschaftPackage eINSTANCE = de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl <em>Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAndererElternteilType()
	 * @generated
	 */
	int ANDERER_ELTERNTEIL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Anderen Elternteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL = 0;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__NAMEN = 1;

	/**
	 * The feature id for the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN = 2;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND = 3;

	/**
	 * The feature id for the '<em><b>Angaben Zur Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE = 4;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ADRESSE = 5;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT = 6;

	/**
	 * The feature id for the '<em><b>Anerkennung Vaterschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT = 7;

	/**
	 * The feature id for the '<em><b>Weitere Angabenzum Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL = 8;

	/**
	 * The number of structural features of the '<em>Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl <em>Angaben Zum Kind Beendigung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAngabenZumKindBeendigungType()
	 * @generated
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name Des Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN = 1;

	/**
	 * The feature id for the '<em><b>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN = 2;

	/**
	 * The feature id for the '<em><b>Kind Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE = 3;

	/**
	 * The feature id for the '<em><b>Aktenzeichen Vorgangsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER = 4;

	/**
	 * The number of structural features of the '<em>Angaben Zum Kind Beendigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Angaben Zum Kind Beendigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl <em>Angaben Zum Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAngabenZumKindType()
	 * @generated
	 */
	int ANGABEN_ZUM_KIND_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Kind Bereits Geboren</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN = 0;

	/**
	 * The feature id for the '<em><b>Voraussichtlicher Entbindungstermin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN = 1;

	/**
	 * The feature id for the '<em><b>Name Des Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES = 2;

	/**
	 * The feature id for the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN = 3;

	/**
	 * The feature id for the '<em><b>Geburtenregisternummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER = 4;

	/**
	 * The feature id for the '<em><b>Kind Wohnhaft Bei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI = 5;

	/**
	 * The feature id for the '<em><b>Kind Lebt Bei Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE = 6;

	/**
	 * The feature id for the '<em><b>Ausbildung Und Einkuenfte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE = 7;

	/**
	 * The feature id for the '<em><b>Weitere Kinder Im Haushalt</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT = 8;

	/**
	 * The feature id for the '<em><b>Weitere Kinder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER = 9;

	/**
	 * The number of structural features of the '<em>Angaben Zum Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Angaben Zum Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl <em>Angaben Zum Unterhalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAngabenZumUnterhaltType()
	 * @generated
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Angaben Zum Unterhaltstitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL = 0;

	/**
	 * The feature id for the '<em><b>Bemuehung Unterhaltszahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG = 1;

	/**
	 * The feature id for the '<em><b>Bisherige Bemuehungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN = 2;

	/**
	 * The feature id for the '<em><b>Zahlt Bereits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS = 3;

	/**
	 * The feature id for the '<em><b>Hoehe Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG = 4;

	/**
	 * The feature id for the '<em><b>Letzte Zahlung Am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM = 5;

	/**
	 * The feature id for the '<em><b>Regelmaessige Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG = 6;

	/**
	 * The feature id for the '<em><b>Angaben Zur Zahlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG = 7;

	/**
	 * The feature id for the '<em><b>Geltendmachung Unterhaltsrueckstaende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE = 8;

	/**
	 * The feature id for the '<em><b>Angabe Unterhaltsrueckstaende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE = 9;

	/**
	 * The feature id for the '<em><b>Freiwilliger Verzicht Auf Unterhalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT = 10;

	/**
	 * The feature id for the '<em><b>Unterhalt Verzicht Zeitraum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM = 11;

	/**
	 * The feature id for the '<em><b>Zahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG = 12;

	/**
	 * The feature id for the '<em><b>Bankverbindung Zahlung Jugendamt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT = 13;

	/**
	 * The feature id for the '<em><b>Bankverbindung Direktzahlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG = 14;

	/**
	 * The number of structural features of the '<em>Angaben Zum Unterhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Angaben Zum Unterhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_UNTERHALT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AnliegensklaerungBSSTypeImpl <em>Anliegensklaerung BSS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AnliegensklaerungBSSTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAnliegensklaerungBSSType()
	 * @generated
	 */
	int ANLIEGENSKLAERUNG_BSS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Anliegen Beistandschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT = 0;

	/**
	 * The feature id for the '<em><b>Vaterschaft Anerkannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT = 1;

	/**
	 * The feature id for the '<em><b>Inhaber Elterliche Sorge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE = 2;

	/**
	 * The number of structural features of the '<em>Anliegensklaerung BSS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_BSS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Anliegensklaerung BSS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_BSS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl <em>Antragstellender Elternteil Beendigung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAntragstellenderElternteilBeendigungType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE = 3;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse Perso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO = 4;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS = 5;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Beendigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Beendigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilTypeImpl <em>Antragstellender Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAntragstellenderElternteilType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__GEBURTSDATEN = 1;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__FAMILIENSTAND = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ADRESSE = 3;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ABWEICHENDE_ADRESSE = 4;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse Perso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ABWEICHENDE_ADRESSE_PERSO = 5;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ERREICHBARKEIT = 6;

	/**
	 * The feature id for the '<em><b>Oeffentliche Leistungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__OEFFENTLICHE_LEISTUNGEN = 7;

	/**
	 * The feature id for the '<em><b>Sonstige Leistungen Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE__SONSTIGE_LEISTUNGEN_BESCHREIBUNG = 8;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl <em>Ausbildung Und Einkuenfte Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAusbildungUndEinkuenfteType()
	 * @generated
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Kind In Ausbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG = 0;

	/**
	 * The feature id for the '<em><b>Ausbildungsjahr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR = 1;

	/**
	 * The feature id for the '<em><b>Einkuenfte Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND = 2;

	/**
	 * The feature id for the '<em><b>Einkuenfte Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART = 3;

	/**
	 * The feature id for the '<em><b>Kindergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD = 4;

	/**
	 * The number of structural features of the '<em>Ausbildung Und Einkuenfte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ausbildung Und Einkuenfte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSBILDUNG_UND_EINKUENFTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl <em>Antrag0601 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Anliegensklaerung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angaben Zum Anderen Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Angaben Zum Unterhalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Warten Auf Unterschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Richtigkeit Der Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pdf Antrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Merkblatt UVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Antrag0601 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Antrag0601 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_ANTRAG0601_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl <em>Beendigung0604 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBeistandschaftBeendigung0604Type()
	 * @generated
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Antragstellender Elternteil Beendigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind Beendigung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Beendigung Bestaetigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Richtigkeit Der Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Warten Auf Unterschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Beendigung0604 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Beendigung0604 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEISTANDSCHAFT_BEENDIGUNG0604_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeAnliegenBeistandschaftTypeImpl <em>Code Anliegen Beistandschaft Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeAnliegenBeistandschaftTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeAnliegenBeistandschaftType()
	 * @generated
	 */
	int CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Anliegen Beistandschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Anliegen Beistandschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeBezugOeffentlicherLeistungenTypeImpl <em>Code Bezug Oeffentlicher Leistungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeBezugOeffentlicherLeistungenTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeBezugOeffentlicherLeistungenType()
	 * @generated
	 */
	int CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Bezug Oeffentlicher Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Bezug Oeffentlicher Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeEinkommenAndererElternteilTypeImpl <em>Code Einkommen Anderer Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeEinkommenAndererElternteilTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeEinkommenAndererElternteilType()
	 * @generated
	 */
	int CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Einkommen Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Einkommen Anderer Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeInhaberElterlicheSorgeTypeImpl <em>Code Inhaber Elterliche Sorge Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeInhaberElterlicheSorgeTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeInhaberElterlicheSorgeType()
	 * @generated
	 */
	int CODE_INHABER_ELTERLICHE_SORGE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_INHABER_ELTERLICHE_SORGE_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_INHABER_ELTERLICHE_SORGE_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_INHABER_ELTERLICHE_SORGE_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_INHABER_ELTERLICHE_SORGE_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Inhaber Elterliche Sorge Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_INHABER_ELTERLICHE_SORGE_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Inhaber Elterliche Sorge Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_INHABER_ELTERLICHE_SORGE_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeUnterhaltstitelBestehtTypeImpl <em>Code Unterhaltstitel Besteht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeUnterhaltstitelBestehtTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeUnterhaltstitelBestehtType()
	 * @generated
	 */
	int CODE_UNTERHALTSTITEL_BESTEHT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSTITEL_BESTEHT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSTITEL_BESTEHT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSTITEL_BESTEHT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSTITEL_BESTEHT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Unterhaltstitel Besteht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSTITEL_BESTEHT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Unterhaltstitel Besteht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNTERHALTSTITEL_BESTEHT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeZahlungsartBSSTypeImpl <em>Code Zahlungsart BSS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeZahlungsartBSSTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeZahlungsartBSSType()
	 * @generated
	 */
	int CODE_ZAHLUNGSART_BSS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZAHLUNGSART_BSS_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZAHLUNGSART_BSS_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZAHLUNGSART_BSS_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZAHLUNGSART_BSS_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Zahlungsart BSS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZAHLUNGSART_BSS_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Zahlungsart BSS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZAHLUNGSART_BSS_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 16;

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
	 * The feature id for the '<em><b>Beistandschaft Antrag0601</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEISTANDSCHAFT_ANTRAG0601 = 3;

	/**
	 * The feature id for the '<em><b>Beistandschaft Beendigung0604</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEISTANDSCHAFT_BEENDIGUNG0604 = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.GeburtTypeImpl <em>Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.GeburtTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getGeburtType()
	 * @generated
	 */
	int GEBURT_TYPE = 17;

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
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl <em>Nachweise BSS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getNachweiseBSSType()
	 * @generated
	 */
	int NACHWEISE_BSS_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Sorgerechtsnachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS = 0;

	/**
	 * The feature id for the '<em><b>Identitaetsnachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Weitere Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Meldebescheinigung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG = 3;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE__ANMERKUNGEN = 4;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE__DSGVO = 5;

	/**
	 * The number of structural features of the '<em>Nachweise BSS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Nachweise BSS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BSS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweisTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getNachweisType()
	 * @generated
	 */
	int NACHWEIS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Nachweis Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Dokument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__NACHWEIS_DOKUMENT = 1;

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
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl <em>Weitere Angaben Zum Anderen Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Berufausausbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG = 0;

	/**
	 * The feature id for the '<em><b>Angaben Berufsausbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG = 1;

	/**
	 * The feature id for the '<em><b>Einkommensverhaeltnisse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE = 2;

	/**
	 * The feature id for the '<em><b>Nettoeinkommen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN = 3;

	/**
	 * The feature id for the '<em><b>Einkommen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN = 4;

	/**
	 * The feature id for the '<em><b>Weitere Kinder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER = 5;

	/**
	 * The feature id for the '<em><b>Weitere Kinder Im Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT = 6;

	/**
	 * The feature id for the '<em><b>Weitere Kinder Angaben</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN = 7;

	/**
	 * The number of structural features of the '<em>Weitere Angaben Zum Anderen Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Weitere Angaben Zum Anderen Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereKinderTypeImpl <em>Weitere Kinder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereKinderTypeImpl
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getWeitereKinderType()
	 * @generated
	 */
	int WEITERE_KINDER_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE__GEBURTSDATUM = 1;

	/**
	 * The number of structural features of the '<em>Weitere Kinder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Weitere Kinder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEITERE_KINDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft <em>Anliegenbeistandschaft</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAnliegenbeistandschaft()
	 * @generated
	 */
	int ANLIEGENBEISTANDSCHAFT = 22;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen <em>Bezugoeffentlicherleistungen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBezugoeffentlicherleistungen()
	 * @generated
	 */
	int BEZUGOEFFENTLICHERLEISTUNGEN = 23;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil <em>Einkommenandererelternteil</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getEinkommenandererelternteil()
	 * @generated
	 */
	int EINKOMMENANDERERELTERNTEIL = 24;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge <em>Inhaberelterlichesorge</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getInhaberelterlichesorge()
	 * @generated
	 */
	int INHABERELTERLICHESORGE = 25;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht <em>Unterhaltstitelbesteht</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getUnterhaltstitelbesteht()
	 * @generated
	 */
	int UNTERHALTSTITELBESTEHT = 26;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss <em>Zahlungsartbss</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getZahlungsartbss()
	 * @generated
	 */
	int ZAHLUNGSARTBSS = 27;

	/**
	 * The meta object id for the '<em>Anliegenbeistandschaft Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAnliegenbeistandschaftObject()
	 * @generated
	 */
	int ANLIEGENBEISTANDSCHAFT_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Bezugoeffentlicherleistungen Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBezugoeffentlicherleistungenObject()
	 * @generated
	 */
	int BEZUGOEFFENTLICHERLEISTUNGEN_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Einkommenandererelternteil Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getEinkommenandererelternteilObject()
	 * @generated
	 */
	int EINKOMMENANDERERELTERNTEIL_OBJECT = 30;

	/**
	 * The meta object id for the '<em>Inhaberelterlichesorge Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getInhaberelterlichesorgeObject()
	 * @generated
	 */
	int INHABERELTERLICHESORGE_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Unterhaltstitelbesteht Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getUnterhaltstitelbestehtObject()
	 * @generated
	 */
	int UNTERHALTSTITELBESTEHT_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Zahlungsartbss Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getZahlungsartbssObject()
	 * @generated
	 */
	int ZAHLUNGSARTBSS_OBJECT = 33;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType <em>Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType
	 * @generated
	 */
	EClass getAndererElternteilType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angaben Zum Anderen Elternteil</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZumAnderenElternteil()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EAttribute getAndererElternteilType_AngabenZumAnderenElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getNamen()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EReference getAndererElternteilType_Namen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getGeburtsdaten <em>Geburtsdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdaten</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getGeburtsdaten()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EReference getAndererElternteilType_Geburtsdaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getFamilienstand()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EReference getAndererElternteilType_Familienstand();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZurAdresse <em>Angaben Zur Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angaben Zur Adresse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAngabenZurAdresse()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EAttribute getAndererElternteilType_AngabenZurAdresse();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getAdresse()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EReference getAndererElternteilType_Adresse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getErreichbarkeit()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EReference getAndererElternteilType_Erreichbarkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAnerkennungVaterschaft <em>Anerkennung Vaterschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anerkennung Vaterschaft</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#isAnerkennungVaterschaft()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EAttribute getAndererElternteilType_AnerkennungVaterschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getWeitereAngabenzumAnderenElternteil <em>Weitere Angabenzum Anderen Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weitere Angabenzum Anderen Elternteil</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType#getWeitereAngabenzumAnderenElternteil()
	 * @see #getAndererElternteilType()
	 * @generated
	 */
	EReference getAndererElternteilType_WeitereAngabenzumAnderenElternteil();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType <em>Angaben Zum Kind Beendigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zum Kind Beendigung Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType
	 * @generated
	 */
	EClass getAngabenZumKindBeendigungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getNameDesKindes <em>Name Des Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Des Kindes</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getNameDesKindes()
	 * @see #getAngabenZumKindBeendigungType()
	 * @generated
	 */
	EReference getAngabenZumKindBeendigungType_NameDesKindes();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getGeburtsdaten <em>Geburtsdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdaten</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getGeburtsdaten()
	 * @see #getAngabenZumKindBeendigungType()
	 * @generated
	 */
	EReference getAngabenZumKindBeendigungType_Geburtsdaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#isAnschriftStimmtMitAntragstellendemElternteilUeberein <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#isAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @see #getAngabenZumKindBeendigungType()
	 * @generated
	 */
	EAttribute getAngabenZumKindBeendigungType_AnschriftStimmtMitAntragstellendemElternteilUeberein();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getKindAdresse <em>Kind Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind Adresse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getKindAdresse()
	 * @see #getAngabenZumKindBeendigungType()
	 * @generated
	 */
	EReference getAngabenZumKindBeendigungType_KindAdresse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getAktenzeichenVorgangsnummer <em>Aktenzeichen Vorgangsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen Vorgangsnummer</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType#getAktenzeichenVorgangsnummer()
	 * @see #getAngabenZumKindBeendigungType()
	 * @generated
	 */
	EAttribute getAngabenZumKindBeendigungType_AktenzeichenVorgangsnummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType <em>Angaben Zum Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zum Kind Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType
	 * @generated
	 */
	EClass getAngabenZumKindType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#isKindBereitsGeboren <em>Kind Bereits Geboren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Bereits Geboren</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#isKindBereitsGeboren()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EAttribute getAngabenZumKindType_KindBereitsGeboren();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getVoraussichtlicherEntbindungstermin <em>Voraussichtlicher Entbindungstermin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voraussichtlicher Entbindungstermin</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getVoraussichtlicherEntbindungstermin()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EAttribute getAngabenZumKindType_VoraussichtlicherEntbindungstermin();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getNameDesKindes <em>Name Des Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Des Kindes</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getNameDesKindes()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EReference getAngabenZumKindType_NameDesKindes();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtsdaten <em>Geburtsdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdaten</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtsdaten()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EReference getAngabenZumKindType_Geburtsdaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtenregisternummer <em>Geburtenregisternummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtenregisternummer</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getGeburtenregisternummer()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EAttribute getAngabenZumKindType_Geburtenregisternummer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindWohnhaftBei <em>Kind Wohnhaft Bei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind Wohnhaft Bei</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindWohnhaftBei()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EReference getAngabenZumKindType_KindWohnhaftBei();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindLebtBeiSonstige <em>Kind Lebt Bei Sonstige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Lebt Bei Sonstige</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getKindLebtBeiSonstige()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EAttribute getAngabenZumKindType_KindLebtBeiSonstige();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getAusbildungUndEinkuenfte <em>Ausbildung Und Einkuenfte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ausbildung Und Einkuenfte</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getAusbildungUndEinkuenfte()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EReference getAngabenZumKindType_AusbildungUndEinkuenfte();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weitere Kinder Im Haushalt</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getWeitereKinderImHaushalt()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EAttribute getAngabenZumKindType_WeitereKinderImHaushalt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getWeitereKinder <em>Weitere Kinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Kinder</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType#getWeitereKinder()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EReference getAngabenZumKindType_WeitereKinder();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType <em>Angaben Zum Unterhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zum Unterhalt Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType
	 * @generated
	 */
	EClass getAngabenZumUnterhaltType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZumUnterhaltstitel <em>Angaben Zum Unterhaltstitel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Unterhaltstitel</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZumUnterhaltstitel()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EReference getAngabenZumUnterhaltType_AngabenZumUnterhaltstitel();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isBemuehungUnterhaltszahlung <em>Bemuehung Unterhaltszahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bemuehung Unterhaltszahlung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isBemuehungUnterhaltszahlung()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_BemuehungUnterhaltszahlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBisherigeBemuehungen <em>Bisherige Bemuehungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bisherige Bemuehungen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBisherigeBemuehungen()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_BisherigeBemuehungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isZahltBereits <em>Zahlt Bereits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zahlt Bereits</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isZahltBereits()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_ZahltBereits();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getHoeheZahlung <em>Hoehe Zahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe Zahlung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getHoeheZahlung()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_HoeheZahlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getLetzteZahlungAm <em>Letzte Zahlung Am</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letzte Zahlung Am</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getLetzteZahlungAm()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_LetzteZahlungAm();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isRegelmaessigeZahlung <em>Regelmaessige Zahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regelmaessige Zahlung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isRegelmaessigeZahlung()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_RegelmaessigeZahlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZurZahlung <em>Angaben Zur Zahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angaben Zur Zahlung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabenZurZahlung()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_AngabenZurZahlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isGeltendmachungUnterhaltsrueckstaende <em>Geltendmachung Unterhaltsrueckstaende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geltendmachung Unterhaltsrueckstaende</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isGeltendmachungUnterhaltsrueckstaende()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_GeltendmachungUnterhaltsrueckstaende();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabeUnterhaltsrueckstaende <em>Angabe Unterhaltsrueckstaende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angabe Unterhaltsrueckstaende</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getAngabeUnterhaltsrueckstaende()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_AngabeUnterhaltsrueckstaende();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isFreiwilligerVerzichtAufUnterhalt <em>Freiwilliger Verzicht Auf Unterhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freiwilliger Verzicht Auf Unterhalt</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#isFreiwilligerVerzichtAufUnterhalt()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_FreiwilligerVerzichtAufUnterhalt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getUnterhaltVerzichtZeitraum <em>Unterhalt Verzicht Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unterhalt Verzicht Zeitraum</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getUnterhaltVerzichtZeitraum()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EAttribute getAngabenZumUnterhaltType_UnterhaltVerzichtZeitraum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getZahlung <em>Zahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zahlung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getZahlung()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EReference getAngabenZumUnterhaltType_Zahlung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungZahlungJugendamt <em>Bankverbindung Zahlung Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bankverbindung Zahlung Jugendamt</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungZahlungJugendamt()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EReference getAngabenZumUnterhaltType_BankverbindungZahlungJugendamt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungDirektzahlung <em>Bankverbindung Direktzahlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bankverbindung Direktzahlung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType#getBankverbindungDirektzahlung()
	 * @see #getAngabenZumUnterhaltType()
	 * @generated
	 */
	EReference getAngabenZumUnterhaltType_BankverbindungDirektzahlung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType <em>Anliegensklaerung BSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anliegensklaerung BSS Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType
	 * @generated
	 */
	EClass getAnliegensklaerungBSSType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getAnliegenBeistandschaft <em>Anliegen Beistandschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegen Beistandschaft</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getAnliegenBeistandschaft()
	 * @see #getAnliegensklaerungBSSType()
	 * @generated
	 */
	EReference getAnliegensklaerungBSSType_AnliegenBeistandschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#isVaterschaftAnerkannt <em>Vaterschaft Anerkannt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vaterschaft Anerkannt</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#isVaterschaftAnerkannt()
	 * @see #getAnliegensklaerungBSSType()
	 * @generated
	 */
	EAttribute getAnliegensklaerungBSSType_VaterschaftAnerkannt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getInhaberElterlicheSorge <em>Inhaber Elterliche Sorge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inhaber Elterliche Sorge</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getInhaberElterlicheSorge()
	 * @see #getAnliegensklaerungBSSType()
	 * @generated
	 */
	EReference getAnliegensklaerungBSSType_InhaberElterlicheSorge();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType <em>Antragstellender Elternteil Beendigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Beendigung Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType
	 * @generated
	 */
	EClass getAntragstellenderElternteilBeendigungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getNamen()
	 * @see #getAntragstellenderElternteilBeendigungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBeendigungType_Namen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getGeburtsdaten <em>Geburtsdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdaten</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getGeburtsdaten()
	 * @see #getAntragstellenderElternteilBeendigungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBeendigungType_Geburtsdaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAdresse()
	 * @see #getAntragstellenderElternteilBeendigungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBeendigungType_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#isAbweichendeAdresse <em>Abweichende Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abweichende Adresse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#isAbweichendeAdresse()
	 * @see #getAntragstellenderElternteilBeendigungType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilBeendigungType_AbweichendeAdresse();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abweichende Adresse Perso</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAbweichendeAdressePerso()
	 * @see #getAntragstellenderElternteilBeendigungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBeendigungType_AbweichendeAdressePerso();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAbweichendeAdresseNachweis <em>Abweichende Adresse Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abweichende Adresse Nachweis</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType#getAbweichendeAdresseNachweis()
	 * @see #getAntragstellenderElternteilBeendigungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilBeendigungType_AbweichendeAdresseNachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType <em>Antragstellender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType
	 * @generated
	 */
	EClass getAntragstellenderElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getNamen()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilType_Namen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getGeburtsdaten <em>Geburtsdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdaten</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getGeburtsdaten()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilType_Geburtsdaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getFamilienstand()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilType_Familienstand();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAdresse()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilType_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#isAbweichendeAdresse <em>Abweichende Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abweichende Adresse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#isAbweichendeAdresse()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilType_AbweichendeAdresse();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abweichende Adresse Perso</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getAbweichendeAdressePerso()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilType_AbweichendeAdressePerso();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getErreichbarkeit()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilType_Erreichbarkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getOeffentlicheLeistungen <em>Oeffentliche Leistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oeffentliche Leistungen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getOeffentlicheLeistungen()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilType_OeffentlicheLeistungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getSonstigeLeistungenBeschreibung <em>Sonstige Leistungen Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sonstige Leistungen Beschreibung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType#getSonstigeLeistungenBeschreibung()
	 * @see #getAntragstellenderElternteilType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilType_SonstigeLeistungenBeschreibung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType <em>Ausbildung Und Einkuenfte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ausbildung Und Einkuenfte Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType
	 * @generated
	 */
	EClass getAusbildungUndEinkuenfteType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindInAusbildung <em>Kind In Ausbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind In Ausbildung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindInAusbildung()
	 * @see #getAusbildungUndEinkuenfteType()
	 * @generated
	 */
	EAttribute getAusbildungUndEinkuenfteType_KindInAusbildung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getAusbildungsjahr <em>Ausbildungsjahr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ausbildungsjahr</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getAusbildungsjahr()
	 * @see #getAusbildungUndEinkuenfteType()
	 * @generated
	 */
	EAttribute getAusbildungUndEinkuenfteType_Ausbildungsjahr();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isEinkuenfteKind <em>Einkuenfte Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkuenfte Kind</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isEinkuenfteKind()
	 * @see #getAusbildungUndEinkuenfteType()
	 * @generated
	 */
	EAttribute getAusbildungUndEinkuenfteType_EinkuenfteKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getEinkuenfteArt <em>Einkuenfte Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkuenfte Art</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#getEinkuenfteArt()
	 * @see #getAusbildungUndEinkuenfteType()
	 * @generated
	 */
	EAttribute getAusbildungUndEinkuenfteType_EinkuenfteArt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindergeld <em>Kindergeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kindergeld</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType#isKindergeld()
	 * @see #getAusbildungUndEinkuenfteType()
	 * @generated
	 */
	EAttribute getAusbildungUndEinkuenfteType_Kindergeld();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type <em>Antrag0601 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antrag0601 Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type
	 * @generated
	 */
	EClass getBeistandschaftAntrag0601Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAnliegensklaerung <em>Anliegensklaerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegensklaerung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAnliegensklaerung()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_Anliegensklaerung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellender Elternteil</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAntragstellenderElternteil()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_AntragstellenderElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumKind <em>Angaben Zum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumKind()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_AngabenZumKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Anderen Elternteil</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumAnderenElternteil()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_AngabenZumAnderenElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumUnterhalt <em>Angaben Zum Unterhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Unterhalt</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getAngabenZumUnterhalt()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_AngabenZumUnterhalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getNachweise()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_Nachweise();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warten Auf Unterschrift</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isWartenAufUnterschrift()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EAttribute getBeistandschaftAntrag0601Type_WartenAufUnterschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getDsgvo()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Richtigkeit Der Angaben</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isRichtigkeitDerAngaben()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EAttribute getBeistandschaftAntrag0601Type_RichtigkeitDerAngaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getPdfAntrag <em>Pdf Antrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pdf Antrag</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#getPdfAntrag()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EReference getBeistandschaftAntrag0601Type_PdfAntrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isMerkblattUVG <em>Merkblatt UVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merkblatt UVG</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type#isMerkblattUVG()
	 * @see #getBeistandschaftAntrag0601Type()
	 * @generated
	 */
	EAttribute getBeistandschaftAntrag0601Type_MerkblattUVG();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type <em>Beendigung0604 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beendigung0604 Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type
	 * @generated
	 */
	EClass getBeistandschaftBeendigung0604Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getAntragstellenderElternteilBeendigung <em>Antragstellender Elternteil Beendigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellender Elternteil Beendigung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getAntragstellenderElternteilBeendigung()
	 * @see #getBeistandschaftBeendigung0604Type()
	 * @generated
	 */
	EReference getBeistandschaftBeendigung0604Type_AntragstellenderElternteilBeendigung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getAngabenZumKindBeendigung <em>Angaben Zum Kind Beendigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Zum Kind Beendigung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getAngabenZumKindBeendigung()
	 * @see #getBeistandschaftBeendigung0604Type()
	 * @generated
	 */
	EReference getBeistandschaftBeendigung0604Type_AngabenZumKindBeendigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isBeendigungBestaetigung <em>Beendigung Bestaetigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beendigung Bestaetigung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isBeendigungBestaetigung()
	 * @see #getBeistandschaftBeendigung0604Type()
	 * @generated
	 */
	EAttribute getBeistandschaftBeendigung0604Type_BeendigungBestaetigung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#getDsgvo()
	 * @see #getBeistandschaftBeendigung0604Type()
	 * @generated
	 */
	EReference getBeistandschaftBeendigung0604Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Richtigkeit Der Angaben</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isRichtigkeitDerAngaben()
	 * @see #getBeistandschaftBeendigung0604Type()
	 * @generated
	 */
	EAttribute getBeistandschaftBeendigung0604Type_RichtigkeitDerAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warten Auf Unterschrift</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type#isWartenAufUnterschrift()
	 * @see #getBeistandschaftBeendigung0604Type()
	 * @generated
	 */
	EAttribute getBeistandschaftBeendigung0604Type_WartenAufUnterschrift();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeAnliegenBeistandschaftType <em>Code Anliegen Beistandschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Anliegen Beistandschaft Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeAnliegenBeistandschaftType
	 * @generated
	 */
	EClass getCodeAnliegenBeistandschaftType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeBezugOeffentlicherLeistungenType <em>Code Bezug Oeffentlicher Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Bezug Oeffentlicher Leistungen Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeBezugOeffentlicherLeistungenType
	 * @generated
	 */
	EClass getCodeBezugOeffentlicherLeistungenType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeEinkommenAndererElternteilType <em>Code Einkommen Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Einkommen Anderer Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeEinkommenAndererElternteilType
	 * @generated
	 */
	EClass getCodeEinkommenAndererElternteilType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeInhaberElterlicheSorgeType <em>Code Inhaber Elterliche Sorge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Inhaber Elterliche Sorge Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeInhaberElterlicheSorgeType
	 * @generated
	 */
	EClass getCodeInhaberElterlicheSorgeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeUnterhaltstitelBestehtType <em>Code Unterhaltstitel Besteht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Unterhaltstitel Besteht Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeUnterhaltstitelBestehtType
	 * @generated
	 */
	EClass getCodeUnterhaltstitelBestehtType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeZahlungsartBSSType <em>Code Zahlungsart BSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Zahlungsart BSS Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeZahlungsartBSSType
	 * @generated
	 */
	EClass getCodeZahlungsartBSSType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getBeistandschaftAntrag0601 <em>Beistandschaft Antrag0601</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beistandschaft Antrag0601</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getBeistandschaftAntrag0601()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BeistandschaftAntrag0601();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getBeistandschaftBeendigung0604 <em>Beistandschaft Beendigung0604</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beistandschaft Beendigung0604</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.DocumentRoot#getBeistandschaftBeendigung0604()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BeistandschaftBeendigung0604();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType
	 * @generated
	 */
	EClass getGeburtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsort()
	 * @see #getGeburtType()
	 * @generated
	 */
	EAttribute getGeburtType_Geburtsort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsortStaat <em>Geburtsort Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsort Staat</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsortStaat()
	 * @see #getGeburtType()
	 * @generated
	 */
	EReference getGeburtType_GeburtsortStaat();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsdatum()
	 * @see #getGeburtType()
	 * @generated
	 */
	EReference getGeburtType_Geburtsdatum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType <em>Nachweise BSS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweise BSS Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType
	 * @generated
	 */
	EClass getNachweiseBSSType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getSorgerechtsnachweis <em>Sorgerechtsnachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorgerechtsnachweis</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getSorgerechtsnachweis()
	 * @see #getNachweiseBSSType()
	 * @generated
	 */
	EReference getNachweiseBSSType_Sorgerechtsnachweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getIdentitaetsnachweis <em>Identitaetsnachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identitaetsnachweis</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getIdentitaetsnachweis()
	 * @see #getNachweiseBSSType()
	 * @generated
	 */
	EReference getNachweiseBSSType_Identitaetsnachweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getWeitereNachweise <em>Weitere Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Nachweise</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getWeitereNachweise()
	 * @see #getNachweiseBSSType()
	 * @generated
	 */
	EReference getNachweiseBSSType_WeitereNachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getNachweisMeldebescheinigung <em>Nachweis Meldebescheinigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Meldebescheinigung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getNachweisMeldebescheinigung()
	 * @see #getNachweiseBSSType()
	 * @generated
	 */
	EReference getNachweiseBSSType_NachweisMeldebescheinigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getAnmerkungen <em>Anmerkungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anmerkungen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getAnmerkungen()
	 * @see #getNachweiseBSSType()
	 * @generated
	 */
	EAttribute getNachweiseBSSType_Anmerkungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType#getDsgvo()
	 * @see #getNachweiseBSSType()
	 * @generated
	 */
	EReference getNachweiseBSSType_Dsgvo();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweis Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType
	 * @generated
	 */
	EClass getNachweisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType#getNachweisBeschreibung <em>Nachweis Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachweis Beschreibung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType#getNachweisBeschreibung()
	 * @see #getNachweisType()
	 * @generated
	 */
	EAttribute getNachweisType_NachweisBeschreibung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType#getNachweisDokument <em>Nachweis Dokument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Dokument</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType#getNachweisDokument()
	 * @see #getNachweisType()
	 * @generated
	 */
	EReference getNachweisType_NachweisDokument();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType <em>Weitere Angaben Zum Anderen Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weitere Angaben Zum Anderen Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType
	 * @generated
	 */
	EClass getWeitereAngabenZumAnderenElternteilType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isBerufausausbildung <em>Berufausausbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Berufausausbildung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isBerufausausbildung()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EAttribute getWeitereAngabenZumAnderenElternteilType_Berufausausbildung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getAngabenBerufsausbildung <em>Angaben Berufsausbildung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angaben Berufsausbildung</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getAngabenBerufsausbildung()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EAttribute getWeitereAngabenZumAnderenElternteilType_AngabenBerufsausbildung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isEinkommensverhaeltnisse <em>Einkommensverhaeltnisse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommensverhaeltnisse</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isEinkommensverhaeltnisse()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EAttribute getWeitereAngabenZumAnderenElternteilType_Einkommensverhaeltnisse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getNettoeinkommen <em>Nettoeinkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nettoeinkommen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getNettoeinkommen()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EAttribute getWeitereAngabenZumAnderenElternteilType_Nettoeinkommen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getEinkommen <em>Einkommen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Einkommen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getEinkommen()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EReference getWeitereAngabenZumAnderenElternteilType_Einkommen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinder <em>Weitere Kinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weitere Kinder</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinder()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EAttribute getWeitereAngabenZumAnderenElternteilType_WeitereKinder();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weitere Kinder Im Haushalt</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinderImHaushalt()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EAttribute getWeitereAngabenZumAnderenElternteilType_WeitereKinderImHaushalt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getWeitereKinderAngaben <em>Weitere Kinder Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Kinder Angaben</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getWeitereKinderAngaben()
	 * @see #getWeitereAngabenZumAnderenElternteilType()
	 * @generated
	 */
	EReference getWeitereAngabenZumAnderenElternteilType_WeitereKinderAngaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType <em>Weitere Kinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weitere Kinder Type</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType
	 * @generated
	 */
	EClass getWeitereKinderType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType#getName()
	 * @see #getWeitereKinderType()
	 * @generated
	 */
	EReference getWeitereKinderType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType#getGeburtsdatum()
	 * @see #getWeitereKinderType()
	 * @generated
	 */
	EAttribute getWeitereKinderType_Geburtsdatum();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft <em>Anliegenbeistandschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anliegenbeistandschaft</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft
	 * @generated
	 */
	EEnum getAnliegenbeistandschaft();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen <em>Bezugoeffentlicherleistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bezugoeffentlicherleistungen</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen
	 * @generated
	 */
	EEnum getBezugoeffentlicherleistungen();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil <em>Einkommenandererelternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Einkommenandererelternteil</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil
	 * @generated
	 */
	EEnum getEinkommenandererelternteil();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge <em>Inhaberelterlichesorge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inhaberelterlichesorge</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge
	 * @generated
	 */
	EEnum getInhaberelterlichesorge();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht <em>Unterhaltstitelbesteht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unterhaltstitelbesteht</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht
	 * @generated
	 */
	EEnum getUnterhaltstitelbesteht();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss <em>Zahlungsartbss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Zahlungsartbss</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss
	 * @generated
	 */
	EEnum getZahlungsartbss();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft <em>Anliegenbeistandschaft Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anliegenbeistandschaft Object</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft
	 * @model instanceClass="de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft"
	 *        extendedMetaData="name='anliegenbeistandschaft:Object' baseType='anliegenbeistandschaft'"
	 * @generated
	 */
	EDataType getAnliegenbeistandschaftObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen <em>Bezugoeffentlicherleistungen Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bezugoeffentlicherleistungen Object</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen
	 * @model instanceClass="de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen"
	 *        extendedMetaData="name='bezugoeffentlicherleistungen:Object' baseType='bezugoeffentlicherleistungen'"
	 * @generated
	 */
	EDataType getBezugoeffentlicherleistungenObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil <em>Einkommenandererelternteil Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Einkommenandererelternteil Object</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil
	 * @model instanceClass="de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil"
	 *        extendedMetaData="name='einkommenandererelternteil:Object' baseType='einkommenandererelternteil'"
	 * @generated
	 */
	EDataType getEinkommenandererelternteilObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge <em>Inhaberelterlichesorge Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inhaberelterlichesorge Object</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge
	 * @model instanceClass="de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge"
	 *        extendedMetaData="name='inhaberelterlichesorge:Object' baseType='inhaberelterlichesorge'"
	 * @generated
	 */
	EDataType getInhaberelterlichesorgeObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht <em>Unterhaltstitelbesteht Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unterhaltstitelbesteht Object</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht
	 * @model instanceClass="de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht"
	 *        extendedMetaData="name='unterhaltstitelbesteht:Object' baseType='unterhaltstitelbesteht'"
	 * @generated
	 */
	EDataType getUnterhaltstitelbestehtObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss <em>Zahlungsartbss Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zahlungsartbss Object</em>'.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss
	 * @model instanceClass="de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss"
	 *        extendedMetaData="name='zahlungsartbss:Object' baseType='zahlungsartbss'"
	 * @generated
	 */
	EDataType getZahlungsartbssObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BeistandschaftFactory getBeistandschaftFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl <em>Anderer Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAndererElternteilType()
		 * @generated
		 */
		EClass ANDERER_ELTERNTEIL_TYPE = eINSTANCE.getAndererElternteilType();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Anderen Elternteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL = eINSTANCE.getAndererElternteilType_AngabenZumAnderenElternteil();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDERER_ELTERNTEIL_TYPE__NAMEN = eINSTANCE.getAndererElternteilType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN = eINSTANCE.getAndererElternteilType_Geburtsdaten();

		/**
		 * The meta object literal for the '<em><b>Familienstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND = eINSTANCE.getAndererElternteilType_Familienstand();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE = eINSTANCE.getAndererElternteilType_AngabenZurAdresse();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDERER_ELTERNTEIL_TYPE__ADRESSE = eINSTANCE.getAndererElternteilType_Adresse();

		/**
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT = eINSTANCE.getAndererElternteilType_Erreichbarkeit();

		/**
		 * The meta object literal for the '<em><b>Anerkennung Vaterschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT = eINSTANCE.getAndererElternteilType_AnerkennungVaterschaft();

		/**
		 * The meta object literal for the '<em><b>Weitere Angabenzum Anderen Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL = eINSTANCE.getAndererElternteilType_WeitereAngabenzumAnderenElternteil();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl <em>Angaben Zum Kind Beendigung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAngabenZumKindBeendigungType()
		 * @generated
		 */
		EClass ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE = eINSTANCE.getAngabenZumKindBeendigungType();

		/**
		 * The meta object literal for the '<em><b>Name Des Kindes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES = eINSTANCE.getAngabenZumKindBeendigungType_NameDesKindes();

		/**
		 * The meta object literal for the '<em><b>Geburtsdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN = eINSTANCE.getAngabenZumKindBeendigungType_Geburtsdaten();

		/**
		 * The meta object literal for the '<em><b>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN = eINSTANCE.getAngabenZumKindBeendigungType_AnschriftStimmtMitAntragstellendemElternteilUeberein();

		/**
		 * The meta object literal for the '<em><b>Kind Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE = eINSTANCE.getAngabenZumKindBeendigungType_KindAdresse();

		/**
		 * The meta object literal for the '<em><b>Aktenzeichen Vorgangsnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER = eINSTANCE.getAngabenZumKindBeendigungType_AktenzeichenVorgangsnummer();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl <em>Angaben Zum Kind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAngabenZumKindType()
		 * @generated
		 */
		EClass ANGABEN_ZUM_KIND_TYPE = eINSTANCE.getAngabenZumKindType();

		/**
		 * The meta object literal for the '<em><b>Kind Bereits Geboren</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN = eINSTANCE.getAngabenZumKindType_KindBereitsGeboren();

		/**
		 * The meta object literal for the '<em><b>Voraussichtlicher Entbindungstermin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN = eINSTANCE.getAngabenZumKindType_VoraussichtlicherEntbindungstermin();

		/**
		 * The meta object literal for the '<em><b>Name Des Kindes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES = eINSTANCE.getAngabenZumKindType_NameDesKindes();

		/**
		 * The meta object literal for the '<em><b>Geburtsdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN = eINSTANCE.getAngabenZumKindType_Geburtsdaten();

		/**
		 * The meta object literal for the '<em><b>Geburtenregisternummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER = eINSTANCE.getAngabenZumKindType_Geburtenregisternummer();

		/**
		 * The meta object literal for the '<em><b>Kind Wohnhaft Bei</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI = eINSTANCE.getAngabenZumKindType_KindWohnhaftBei();

		/**
		 * The meta object literal for the '<em><b>Kind Lebt Bei Sonstige</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE = eINSTANCE.getAngabenZumKindType_KindLebtBeiSonstige();

		/**
		 * The meta object literal for the '<em><b>Ausbildung Und Einkuenfte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE = eINSTANCE.getAngabenZumKindType_AusbildungUndEinkuenfte();

		/**
		 * The meta object literal for the '<em><b>Weitere Kinder Im Haushalt</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT = eINSTANCE.getAngabenZumKindType_WeitereKinderImHaushalt();

		/**
		 * The meta object literal for the '<em><b>Weitere Kinder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER = eINSTANCE.getAngabenZumKindType_WeitereKinder();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl <em>Angaben Zum Unterhalt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAngabenZumUnterhaltType()
		 * @generated
		 */
		EClass ANGABEN_ZUM_UNTERHALT_TYPE = eINSTANCE.getAngabenZumUnterhaltType();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Unterhaltstitel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL = eINSTANCE.getAngabenZumUnterhaltType_AngabenZumUnterhaltstitel();

		/**
		 * The meta object literal for the '<em><b>Bemuehung Unterhaltszahlung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG = eINSTANCE.getAngabenZumUnterhaltType_BemuehungUnterhaltszahlung();

		/**
		 * The meta object literal for the '<em><b>Bisherige Bemuehungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN = eINSTANCE.getAngabenZumUnterhaltType_BisherigeBemuehungen();

		/**
		 * The meta object literal for the '<em><b>Zahlt Bereits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS = eINSTANCE.getAngabenZumUnterhaltType_ZahltBereits();

		/**
		 * The meta object literal for the '<em><b>Hoehe Zahlung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG = eINSTANCE.getAngabenZumUnterhaltType_HoeheZahlung();

		/**
		 * The meta object literal for the '<em><b>Letzte Zahlung Am</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM = eINSTANCE.getAngabenZumUnterhaltType_LetzteZahlungAm();

		/**
		 * The meta object literal for the '<em><b>Regelmaessige Zahlung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG = eINSTANCE.getAngabenZumUnterhaltType_RegelmaessigeZahlung();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Zahlung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG = eINSTANCE.getAngabenZumUnterhaltType_AngabenZurZahlung();

		/**
		 * The meta object literal for the '<em><b>Geltendmachung Unterhaltsrueckstaende</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE = eINSTANCE.getAngabenZumUnterhaltType_GeltendmachungUnterhaltsrueckstaende();

		/**
		 * The meta object literal for the '<em><b>Angabe Unterhaltsrueckstaende</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE = eINSTANCE.getAngabenZumUnterhaltType_AngabeUnterhaltsrueckstaende();

		/**
		 * The meta object literal for the '<em><b>Freiwilliger Verzicht Auf Unterhalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT = eINSTANCE.getAngabenZumUnterhaltType_FreiwilligerVerzichtAufUnterhalt();

		/**
		 * The meta object literal for the '<em><b>Unterhalt Verzicht Zeitraum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM = eINSTANCE.getAngabenZumUnterhaltType_UnterhaltVerzichtZeitraum();

		/**
		 * The meta object literal for the '<em><b>Zahlung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG = eINSTANCE.getAngabenZumUnterhaltType_Zahlung();

		/**
		 * The meta object literal for the '<em><b>Bankverbindung Zahlung Jugendamt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT = eINSTANCE.getAngabenZumUnterhaltType_BankverbindungZahlungJugendamt();

		/**
		 * The meta object literal for the '<em><b>Bankverbindung Direktzahlung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG = eINSTANCE.getAngabenZumUnterhaltType_BankverbindungDirektzahlung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AnliegensklaerungBSSTypeImpl <em>Anliegensklaerung BSS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AnliegensklaerungBSSTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAnliegensklaerungBSSType()
		 * @generated
		 */
		EClass ANLIEGENSKLAERUNG_BSS_TYPE = eINSTANCE.getAnliegensklaerungBSSType();

		/**
		 * The meta object literal for the '<em><b>Anliegen Beistandschaft</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT = eINSTANCE.getAnliegensklaerungBSSType_AnliegenBeistandschaft();

		/**
		 * The meta object literal for the '<em><b>Vaterschaft Anerkannt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT = eINSTANCE.getAnliegensklaerungBSSType_VaterschaftAnerkannt();

		/**
		 * The meta object literal for the '<em><b>Inhaber Elterliche Sorge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE = eINSTANCE.getAnliegensklaerungBSSType_InhaberElterlicheSorge();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl <em>Antragstellender Elternteil Beendigung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAntragstellenderElternteilBeendigungType()
		 * @generated
		 */
		EClass ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE = eINSTANCE.getAntragstellenderElternteilBeendigungType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN = eINSTANCE.getAntragstellenderElternteilBeendigungType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN = eINSTANCE.getAntragstellenderElternteilBeendigungType_Geburtsdaten();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE = eINSTANCE.getAntragstellenderElternteilBeendigungType_Adresse();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE = eINSTANCE.getAntragstellenderElternteilBeendigungType_AbweichendeAdresse();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse Perso</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO = eINSTANCE.getAntragstellenderElternteilBeendigungType_AbweichendeAdressePerso();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse Nachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS = eINSTANCE.getAntragstellenderElternteilBeendigungType_AbweichendeAdresseNachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilTypeImpl <em>Antragstellender Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAntragstellenderElternteilType()
		 * @generated
		 */
		EClass ANTRAGSTELLENDER_ELTERNTEIL_TYPE = eINSTANCE.getAntragstellenderElternteilType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_TYPE__NAMEN = eINSTANCE.getAntragstellenderElternteilType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_TYPE__GEBURTSDATEN = eINSTANCE.getAntragstellenderElternteilType_Geburtsdaten();

		/**
		 * The meta object literal for the '<em><b>Familienstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_TYPE__FAMILIENSTAND = eINSTANCE.getAntragstellenderElternteilType_Familienstand();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ADRESSE = eINSTANCE.getAntragstellenderElternteilType_Adresse();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ABWEICHENDE_ADRESSE = eINSTANCE.getAntragstellenderElternteilType_AbweichendeAdresse();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse Perso</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ABWEICHENDE_ADRESSE_PERSO = eINSTANCE.getAntragstellenderElternteilType_AbweichendeAdressePerso();

		/**
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_TYPE__ERREICHBARKEIT = eINSTANCE.getAntragstellenderElternteilType_Erreichbarkeit();

		/**
		 * The meta object literal for the '<em><b>Oeffentliche Leistungen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_TYPE__OEFFENTLICHE_LEISTUNGEN = eINSTANCE.getAntragstellenderElternteilType_OeffentlicheLeistungen();

		/**
		 * The meta object literal for the '<em><b>Sonstige Leistungen Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ELTERNTEIL_TYPE__SONSTIGE_LEISTUNGEN_BESCHREIBUNG = eINSTANCE.getAntragstellenderElternteilType_SonstigeLeistungenBeschreibung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl <em>Ausbildung Und Einkuenfte Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAusbildungUndEinkuenfteType()
		 * @generated
		 */
		EClass AUSBILDUNG_UND_EINKUENFTE_TYPE = eINSTANCE.getAusbildungUndEinkuenfteType();

		/**
		 * The meta object literal for the '<em><b>Kind In Ausbildung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG = eINSTANCE.getAusbildungUndEinkuenfteType_KindInAusbildung();

		/**
		 * The meta object literal for the '<em><b>Ausbildungsjahr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR = eINSTANCE.getAusbildungUndEinkuenfteType_Ausbildungsjahr();

		/**
		 * The meta object literal for the '<em><b>Einkuenfte Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND = eINSTANCE.getAusbildungUndEinkuenfteType_EinkuenfteKind();

		/**
		 * The meta object literal for the '<em><b>Einkuenfte Art</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART = eINSTANCE.getAusbildungUndEinkuenfteType_EinkuenfteArt();

		/**
		 * The meta object literal for the '<em><b>Kindergeld</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD = eINSTANCE.getAusbildungUndEinkuenfteType_Kindergeld();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl <em>Antrag0601 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBeistandschaftAntrag0601Type()
		 * @generated
		 */
		EClass BEISTANDSCHAFT_ANTRAG0601_TYPE = eINSTANCE.getBeistandschaftAntrag0601Type();

		/**
		 * The meta object literal for the '<em><b>Anliegensklaerung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG = eINSTANCE.getBeistandschaftAntrag0601Type_Anliegensklaerung();

		/**
		 * The meta object literal for the '<em><b>Antragstellender Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = eINSTANCE.getBeistandschaftAntrag0601Type_AntragstellenderElternteil();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND = eINSTANCE.getBeistandschaftAntrag0601Type_AngabenZumKind();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Anderen Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL = eINSTANCE.getBeistandschaftAntrag0601Type_AngabenZumAnderenElternteil();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Unterhalt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT = eINSTANCE.getBeistandschaftAntrag0601Type_AngabenZumUnterhalt();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE = eINSTANCE.getBeistandschaftAntrag0601Type_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Warten Auf Unterschrift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT = eINSTANCE.getBeistandschaftAntrag0601Type_WartenAufUnterschrift();

		/**
		 * The meta object literal for the '<em><b>Dsgvo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO = eINSTANCE.getBeistandschaftAntrag0601Type_Dsgvo();

		/**
		 * The meta object literal for the '<em><b>Richtigkeit Der Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN = eINSTANCE.getBeistandschaftAntrag0601Type_RichtigkeitDerAngaben();

		/**
		 * The meta object literal for the '<em><b>Pdf Antrag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG = eINSTANCE.getBeistandschaftAntrag0601Type_PdfAntrag();

		/**
		 * The meta object literal for the '<em><b>Merkblatt UVG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG = eINSTANCE.getBeistandschaftAntrag0601Type_MerkblattUVG();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl <em>Beendigung0604 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBeistandschaftBeendigung0604Type()
		 * @generated
		 */
		EClass BEISTANDSCHAFT_BEENDIGUNG0604_TYPE = eINSTANCE.getBeistandschaftBeendigung0604Type();

		/**
		 * The meta object literal for the '<em><b>Antragstellender Elternteil Beendigung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG = eINSTANCE.getBeistandschaftBeendigung0604Type_AntragstellenderElternteilBeendigung();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind Beendigung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG = eINSTANCE.getBeistandschaftBeendigung0604Type_AngabenZumKindBeendigung();

		/**
		 * The meta object literal for the '<em><b>Beendigung Bestaetigung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG = eINSTANCE.getBeistandschaftBeendigung0604Type_BeendigungBestaetigung();

		/**
		 * The meta object literal for the '<em><b>Dsgvo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO = eINSTANCE.getBeistandschaftBeendigung0604Type_Dsgvo();

		/**
		 * The meta object literal for the '<em><b>Richtigkeit Der Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN = eINSTANCE.getBeistandschaftBeendigung0604Type_RichtigkeitDerAngaben();

		/**
		 * The meta object literal for the '<em><b>Warten Auf Unterschrift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT = eINSTANCE.getBeistandschaftBeendigung0604Type_WartenAufUnterschrift();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeAnliegenBeistandschaftTypeImpl <em>Code Anliegen Beistandschaft Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeAnliegenBeistandschaftTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeAnliegenBeistandschaftType()
		 * @generated
		 */
		EClass CODE_ANLIEGEN_BEISTANDSCHAFT_TYPE = eINSTANCE.getCodeAnliegenBeistandschaftType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeBezugOeffentlicherLeistungenTypeImpl <em>Code Bezug Oeffentlicher Leistungen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeBezugOeffentlicherLeistungenTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeBezugOeffentlicherLeistungenType()
		 * @generated
		 */
		EClass CODE_BEZUG_OEFFENTLICHER_LEISTUNGEN_TYPE = eINSTANCE.getCodeBezugOeffentlicherLeistungenType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeEinkommenAndererElternteilTypeImpl <em>Code Einkommen Anderer Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeEinkommenAndererElternteilTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeEinkommenAndererElternteilType()
		 * @generated
		 */
		EClass CODE_EINKOMMEN_ANDERER_ELTERNTEIL_TYPE = eINSTANCE.getCodeEinkommenAndererElternteilType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeInhaberElterlicheSorgeTypeImpl <em>Code Inhaber Elterliche Sorge Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeInhaberElterlicheSorgeTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeInhaberElterlicheSorgeType()
		 * @generated
		 */
		EClass CODE_INHABER_ELTERLICHE_SORGE_TYPE = eINSTANCE.getCodeInhaberElterlicheSorgeType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeUnterhaltstitelBestehtTypeImpl <em>Code Unterhaltstitel Besteht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeUnterhaltstitelBestehtTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeUnterhaltstitelBestehtType()
		 * @generated
		 */
		EClass CODE_UNTERHALTSTITEL_BESTEHT_TYPE = eINSTANCE.getCodeUnterhaltstitelBestehtType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeZahlungsartBSSTypeImpl <em>Code Zahlungsart BSS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.CodeZahlungsartBSSTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getCodeZahlungsartBSSType()
		 * @generated
		 */
		EClass CODE_ZAHLUNGSART_BSS_TYPE = eINSTANCE.getCodeZahlungsartBSSType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Beistandschaft Antrag0601</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BEISTANDSCHAFT_ANTRAG0601 = eINSTANCE.getDocumentRoot_BeistandschaftAntrag0601();

		/**
		 * The meta object literal for the '<em><b>Beistandschaft Beendigung0604</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BEISTANDSCHAFT_BEENDIGUNG0604 = eINSTANCE.getDocumentRoot_BeistandschaftBeendigung0604();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.GeburtTypeImpl <em>Geburt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.GeburtTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getGeburtType()
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
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl <em>Nachweise BSS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getNachweiseBSSType()
		 * @generated
		 */
		EClass NACHWEISE_BSS_TYPE = eINSTANCE.getNachweiseBSSType();

		/**
		 * The meta object literal for the '<em><b>Sorgerechtsnachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS = eINSTANCE.getNachweiseBSSType_Sorgerechtsnachweis();

		/**
		 * The meta object literal for the '<em><b>Identitaetsnachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS = eINSTANCE.getNachweiseBSSType_Identitaetsnachweis();

		/**
		 * The meta object literal for the '<em><b>Weitere Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE = eINSTANCE.getNachweiseBSSType_WeitereNachweise();

		/**
		 * The meta object literal for the '<em><b>Nachweis Meldebescheinigung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG = eINSTANCE.getNachweiseBSSType_NachweisMeldebescheinigung();

		/**
		 * The meta object literal for the '<em><b>Anmerkungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_BSS_TYPE__ANMERKUNGEN = eINSTANCE.getNachweiseBSSType_Anmerkungen();

		/**
		 * The meta object literal for the '<em><b>Dsgvo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_BSS_TYPE__DSGVO = eINSTANCE.getNachweiseBSSType_Dsgvo();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweisTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getNachweisType()
		 * @generated
		 */
		EClass NACHWEIS_TYPE = eINSTANCE.getNachweisType();

		/**
		 * The meta object literal for the '<em><b>Nachweis Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG = eINSTANCE.getNachweisType_NachweisBeschreibung();

		/**
		 * The meta object literal for the '<em><b>Nachweis Dokument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEIS_TYPE__NACHWEIS_DOKUMENT = eINSTANCE.getNachweisType_NachweisDokument();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl <em>Weitere Angaben Zum Anderen Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getWeitereAngabenZumAnderenElternteilType()
		 * @generated
		 */
		EClass WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE = eINSTANCE.getWeitereAngabenZumAnderenElternteilType();

		/**
		 * The meta object literal for the '<em><b>Berufausausbildung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_Berufausausbildung();

		/**
		 * The meta object literal for the '<em><b>Angaben Berufsausbildung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_AngabenBerufsausbildung();

		/**
		 * The meta object literal for the '<em><b>Einkommensverhaeltnisse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_Einkommensverhaeltnisse();

		/**
		 * The meta object literal for the '<em><b>Nettoeinkommen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_Nettoeinkommen();

		/**
		 * The meta object literal for the '<em><b>Einkommen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_Einkommen();

		/**
		 * The meta object literal for the '<em><b>Weitere Kinder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_WeitereKinder();

		/**
		 * The meta object literal for the '<em><b>Weitere Kinder Im Haushalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_WeitereKinderImHaushalt();

		/**
		 * The meta object literal for the '<em><b>Weitere Kinder Angaben</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN = eINSTANCE.getWeitereAngabenZumAnderenElternteilType_WeitereKinderAngaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereKinderTypeImpl <em>Weitere Kinder Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereKinderTypeImpl
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getWeitereKinderType()
		 * @generated
		 */
		EClass WEITERE_KINDER_TYPE = eINSTANCE.getWeitereKinderType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEITERE_KINDER_TYPE__NAME = eINSTANCE.getWeitereKinderType_Name();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEITERE_KINDER_TYPE__GEBURTSDATUM = eINSTANCE.getWeitereKinderType_Geburtsdatum();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft <em>Anliegenbeistandschaft</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAnliegenbeistandschaft()
		 * @generated
		 */
		EEnum ANLIEGENBEISTANDSCHAFT = eINSTANCE.getAnliegenbeistandschaft();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen <em>Bezugoeffentlicherleistungen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBezugoeffentlicherleistungen()
		 * @generated
		 */
		EEnum BEZUGOEFFENTLICHERLEISTUNGEN = eINSTANCE.getBezugoeffentlicherleistungen();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil <em>Einkommenandererelternteil</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getEinkommenandererelternteil()
		 * @generated
		 */
		EEnum EINKOMMENANDERERELTERNTEIL = eINSTANCE.getEinkommenandererelternteil();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge <em>Inhaberelterlichesorge</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getInhaberelterlichesorge()
		 * @generated
		 */
		EEnum INHABERELTERLICHESORGE = eINSTANCE.getInhaberelterlichesorge();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht <em>Unterhaltstitelbesteht</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getUnterhaltstitelbesteht()
		 * @generated
		 */
		EEnum UNTERHALTSTITELBESTEHT = eINSTANCE.getUnterhaltstitelbesteht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss <em>Zahlungsartbss</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getZahlungsartbss()
		 * @generated
		 */
		EEnum ZAHLUNGSARTBSS = eINSTANCE.getZahlungsartbss();

		/**
		 * The meta object literal for the '<em>Anliegenbeistandschaft Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Anliegenbeistandschaft
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getAnliegenbeistandschaftObject()
		 * @generated
		 */
		EDataType ANLIEGENBEISTANDSCHAFT_OBJECT = eINSTANCE.getAnliegenbeistandschaftObject();

		/**
		 * The meta object literal for the '<em>Bezugoeffentlicherleistungen Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Bezugoeffentlicherleistungen
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getBezugoeffentlicherleistungenObject()
		 * @generated
		 */
		EDataType BEZUGOEFFENTLICHERLEISTUNGEN_OBJECT = eINSTANCE.getBezugoeffentlicherleistungenObject();

		/**
		 * The meta object literal for the '<em>Einkommenandererelternteil Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Einkommenandererelternteil
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getEinkommenandererelternteilObject()
		 * @generated
		 */
		EDataType EINKOMMENANDERERELTERNTEIL_OBJECT = eINSTANCE.getEinkommenandererelternteilObject();

		/**
		 * The meta object literal for the '<em>Inhaberelterlichesorge Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Inhaberelterlichesorge
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getInhaberelterlichesorgeObject()
		 * @generated
		 */
		EDataType INHABERELTERLICHESORGE_OBJECT = eINSTANCE.getInhaberelterlichesorgeObject();

		/**
		 * The meta object literal for the '<em>Unterhaltstitelbesteht Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Unterhaltstitelbesteht
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getUnterhaltstitelbestehtObject()
		 * @generated
		 */
		EDataType UNTERHALTSTITELBESTEHT_OBJECT = eINSTANCE.getUnterhaltstitelbestehtObject();

		/**
		 * The meta object literal for the '<em>Zahlungsartbss Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.Zahlungsartbss
		 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl#getZahlungsartbssObject()
		 * @generated
		 */
		EDataType ZAHLUNGSARTBSS_OBJECT = eINSTANCE.getZahlungsartbssObject();

	}

} //BeistandschaftPackage
