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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;


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
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfeFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ErziehungshilfePackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/erziehungshilfen.ecore", ecoreSourceLocations="/model/erziehungshilfen.ecore")
public interface ErziehungshilfePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "erziehungshilfen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/hilfenZurErziehung/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "erziehungshilfen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErziehungshilfePackage eINSTANCE = de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl <em>Angaben Elternteil Eingliederung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenElternteilEingliederungType()
	 * @generated
	 */
	int ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Angaben Geburt Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL = 1;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN = 3;

	/**
	 * The number of structural features of the '<em>Angaben Elternteil Eingliederung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Angaben Elternteil Eingliederung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilHJVTypeImpl <em>Angaben Elternteil HJV Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilHJVTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenElternteilHJVType()
	 * @generated
	 */
	int ANGABEN_ELTERNTEIL_HJV_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_HJV_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_HJV_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_HJV_TYPE__AKTUELLE_ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_HJV_TYPE__KONTAKTDATEN = 3;

	/**
	 * The number of structural features of the '<em>Angaben Elternteil HJV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_HJV_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Angaben Elternteil HJV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ELTERNTEIL_HJV_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenETTypeImpl <em>Angaben ET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenETTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenETType()
	 * @generated
	 */
	int ANGABEN_ET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ET_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ET_TYPE__KONTAKTDATEN = 1;

	/**
	 * The number of structural features of the '<em>Angaben ET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Angaben ET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl <em>Angaben Kind Eingliederung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenKindEingliederungType()
	 * @generated
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT = 2;

	/**
	 * The feature id for the '<em><b>Aufenthaltsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT = 3;

	/**
	 * The feature id for the '<em><b>Jugendlich Aufenthaltsort Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE = 4;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT = 5;

	/**
	 * The feature id for the '<em><b>Anschriftsaenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG = 6;

	/**
	 * The feature id for the '<em><b>Seelische Behinderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG = 7;

	/**
	 * The feature id for the '<em><b>Art Der Behinderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG = 8;

	/**
	 * The feature id for the '<em><b>Aerztlicher Nachweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS = 9;

	/**
	 * The number of structural features of the '<em>Angaben Kind Eingliederung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Angaben Kind Eingliederung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_EINGLIEDERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHJVTypeImpl <em>Angaben Kind HJV Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHJVTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenKindHJVType()
	 * @generated
	 */
	int ANGABEN_KIND_HJV_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE__GESCHLECHT = 2;

	/**
	 * The feature id for the '<em><b>Aufenthaltsort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE__AUFENTHALTSORT = 3;

	/**
	 * The feature id for the '<em><b>Jugendlich Aufenthaltsort Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE = 4;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE__AKTUELLE_ANSCHRIFT = 5;

	/**
	 * The feature id for the '<em><b>Anschriftsaenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE__ANSCHRIFTSAENDERUNG = 6;

	/**
	 * The number of structural features of the '<em>Angaben Kind HJV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Angaben Kind HJV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HJV_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHZETypeImpl <em>Angaben Kind HZE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHZETypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenKindHZEType()
	 * @generated
	 */
	int ANGABEN_KIND_HZE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HZE_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HZE_TYPE__GEBURTSDATUM = 1;

	/**
	 * The number of structural features of the '<em>Angaben Kind HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HZE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Angaben Kind HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_KIND_HZE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl <em>Angaben Zu Jugendlich HZE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenZuJugendlichHZEType()
	 * @generated
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name Der Des Jugendlichen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Anschriftsaenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG = 3;

	/**
	 * The feature id for the '<em><b>Abweichende Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT = 4;

	/**
	 * The number of structural features of the '<em>Angaben Zu Jugendlich HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Angaben Zu Jugendlich HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_HZE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl <em>Angaben Zu Jugendlich Kontaktformular Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenZuJugendlichKontaktformularType()
	 * @generated
	 */
	int ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name Der Des Jugendlichen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Anschrift Stimmt Ueberein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN = 2;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT = 3;

	/**
	 * The number of structural features of the '<em>Angaben Zu Jugendlich Kontaktformular Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Angaben Zu Jugendlich Kontaktformular Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungAnfrageTypeImpl <em>Anliegensklaerung Anfrage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungAnfrageTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAnliegensklaerungAnfrageType()
	 * @generated
	 */
	int ANLIEGENSKLAERUNG_ANFRAGE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Anliegen Verhaeltnis Jugendlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH = 0;

	/**
	 * The feature id for the '<em><b>Sorgeberechtigt Abfrage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE = 1;

	/**
	 * The feature id for the '<em><b>Gemeinsam Sorgeberechtigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT = 2;

	/**
	 * The number of structural features of the '<em>Anliegensklaerung Anfrage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_ANFRAGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Anliegensklaerung Anfrage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_ANFRAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungTypeImpl <em>Anliegensklaerung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAnliegensklaerungType()
	 * @generated
	 */
	int ANLIEGENSKLAERUNG_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Anliegen Verhaeltnis Jugendlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH = 0;

	/**
	 * The feature id for the '<em><b>Gemeinsam Sorgeberechtigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_TYPE__GEMEINSAM_SORGEBERECHTIGT = 1;

	/**
	 * The number of structural features of the '<em>Anliegensklaerung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Anliegensklaerung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLIEGENSKLAERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl <em>Antragstellender ET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAntragstellenderETType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ET_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT = 1;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM = 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE__ADRESSE = 3;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE = 4;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse Perso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO = 5;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN = 6;

	/**
	 * The number of structural features of the '<em>Antragstellender ET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Antragstellender ET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AuswahlBescheidartTypeImpl <em>Auswahl Bescheidart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AuswahlBescheidartTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlBescheidartType()
	 * @generated
	 */
	int AUSWAHL_BESCHEIDART_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWAHL_BESCHEIDART_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWAHL_BESCHEIDART_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWAHL_BESCHEIDART_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWAHL_BESCHEIDART_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Auswahl Bescheidart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWAHL_BESCHEIDART_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auswahl Bescheidart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSWAHL_BESCHEIDART_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.BegruendungDesHilfebedarfsTypeImpl <em>Begruendung Des Hilfebedarfs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.BegruendungDesHilfebedarfsTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getBegruendungDesHilfebedarfsType()
	 * @generated
	 */
	int BEGRUENDUNG_DES_HILFEBEDARFS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Grund Beantragung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG = 0;

	/**
	 * The feature id for the '<em><b>Hilfe Vom Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT = 1;

	/**
	 * The number of structural features of the '<em>Begruendung Des Hilfebedarfs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRUENDUNG_DES_HILFEBEDARFS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Begruendung Des Hilfebedarfs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGRUENDUNG_DES_HILFEBEDARFS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAufenthaltTypeImpl <em>Code Aufenthalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAufenthaltTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeAufenthaltType()
	 * @generated
	 */
	int CODE_AUFENTHALT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Aufenthalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Aufenthalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAuswahlDerHilfeHzETypeImpl <em>Code Auswahl Der Hilfe Hz EType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAuswahlDerHilfeHzETypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeAuswahlDerHilfeHzEType()
	 * @generated
	 */
	int CODE_AUSWAHL_DER_HILFE_HZ_ETYPE = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSWAHL_DER_HILFE_HZ_ETYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSWAHL_DER_HILFE_HZ_ETYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSWAHL_DER_HILFE_HZ_ETYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSWAHL_DER_HILFE_HZ_ETYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Auswahl Der Hilfe Hz EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSWAHL_DER_HILFE_HZ_ETYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Auswahl Der Hilfe Hz EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUSWAHL_DER_HILFE_HZ_ETYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeHZEIchBinTypeImpl <em>Code HZE Ich Bin Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeHZEIchBinTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeHZEIchBinType()
	 * @generated
	 */
	int CODE_HZE_ICH_BIN_TYPE = 15;

	/**
	 * The number of structural features of the '<em>Code HZE Ich Bin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_HZE_ICH_BIN_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Code HZE Ich Bin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_HZE_ICH_BIN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeVerhaeltnisJugendlichHZETypeImpl <em>Code Verhaeltnis Jugendlich HZE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeVerhaeltnisJugendlichHZETypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeVerhaeltnisJugendlichHZEType()
	 * @generated
	 */
	int CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Verhaeltnis Jugendlich HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Verhaeltnis Jugendlich HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 17;

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
	 * The feature id for the '<em><b>Hilfen Zur Erziehung Anfrage HJV0702</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702 = 3;

	/**
	 * The feature id for the '<em><b>Hilfen Zur Erziehung Antrag0701</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701 = 4;

	/**
	 * The feature id for the '<em><b>Hilfen Zur Erziehung Eingliederungshilfe0703</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703 = 5;

	/**
	 * The feature id for the '<em><b>Hilfen Zur Erziehung Nachweisnachricht0711</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711 = 6;

	/**
	 * The feature id for the '<em><b>Hilfen Zur Erziehung Widerspruch0704</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704 = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErreichbarkeitHZETypeImpl <em>Erreichbarkeit HZE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErreichbarkeitHZETypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getErreichbarkeitHZEType()
	 * @generated
	 */
	int ERREICHBARKEIT_HZE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Kanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_HZE_TYPE__KANAL = BaukastenPackage.ERREICHBARKEIT_TYPE__KANAL;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_HZE_TYPE__KENNUNG = BaukastenPackage.ERREICHBARKEIT_TYPE__KENNUNG;

	/**
	 * The feature id for the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_HZE_TYPE__ZUSATZ = BaukastenPackage.ERREICHBARKEIT_TYPE__ZUSATZ;

	/**
	 * The feature id for the '<em><b>Zeit Erreichbarkeit HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE = BaukastenPackage.ERREICHBARKEIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erreichbarkeit HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_HZE_TYPE_FEATURE_COUNT = BaukastenPackage.ERREICHBARKEIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erreichbarkeit HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_HZE_TYPE_OPERATION_COUNT = BaukastenPackage.ERREICHBARKEIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl <em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Auswahl Anfrage HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anliegensklaerung HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persoenliche Angaben HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Begruendung HJV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Angaben Anderer Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Einwilligung Zwischenspeichern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl <em>Hilfen Zur Erziehung Antrag0701 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Auswahl Der Hilfe HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anliegensklaerung HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pruefcode HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anderer Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Angaben Kind HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nachweise HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Zusatz Nachricht HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Einwilligung Zwischenspeichern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Hilfen Zur Erziehung Antrag0701 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Hilfen Zur Erziehung Antrag0701 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl <em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Auswahl Anfrage Eingliederung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anliegensklaerung Eingliederung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angaben Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Begruendung HZE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Angaben Elternteile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Einwilligung Zwischenspeichern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl <em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bearbeitungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Antragsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Zusatznachricht HZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl <em>Hilfen Zur Erziehung Widerspruch0704 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bescheiddatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Begruendung Widerspruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bestaetigung Widerspruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auswahl Bescheidart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hilfen Zur Erziehung Widerspruch0704 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Hilfen Zur Erziehung Widerspruch0704 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseDatenschutzTypeImpl <em>Nachweise Datenschutz Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseDatenschutzTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getNachweiseDatenschutzType()
	 * @generated
	 */
	int NACHWEISE_DATENSCHUTZ_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS = 0;

	/**
	 * The feature id for the '<em><b>Zustimmung ET2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2 = 1;

	/**
	 * The feature id for the '<em><b>Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN = 2;

	/**
	 * The number of structural features of the '<em>Nachweise Datenschutz Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_DATENSCHUTZ_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Nachweise Datenschutz Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_DATENSCHUTZ_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseHZETypeImpl <em>Nachweise HZE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseHZETypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getNachweiseHZEType()
	 * @generated
	 */
	int NACHWEISE_HZE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Sorgerechtsnachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE__SORGERECHTSNACHWEIS = 0;

	/**
	 * The feature id for the '<em><b>Identitaetsnachweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE__IDENTITAETSNACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Weitere Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE__WEITERE_NACHWEISE = 2;

	/**
	 * The feature id for the '<em><b>Nachweis Meldebescheinigung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE__NACHWEIS_MELDEBESCHEINIGUNG = 3;

	/**
	 * The feature id for the '<em><b>Anmerkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE__ANMERKUNGEN = 4;

	/**
	 * The feature id for the '<em><b>Dsgvo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE__DSGVO = 5;

	/**
	 * The feature id for the '<em><b>Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE__RICHTIGKEIT_ANGABEN = 6;

	/**
	 * The number of structural features of the '<em>Nachweise HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Nachweise HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_HZE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweisTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getNachweisType()
	 * @generated
	 */
	int NACHWEIS_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Nachweis Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Dokument</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenEingliederungTypeImpl <em>Persoenliche Angaben Eingliederung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenEingliederungTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Anschriftsaenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG = 3;

	/**
	 * The feature id for the '<em><b>Weicht Anschrift Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__WEICHT_ANSCHRIFT_AB = 4;

	/**
	 * The feature id for the '<em><b>Abweichende Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ABWEICHENDE_ANSCHRIFT = 5;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__KONTAKTDATEN = 6;

	/**
	 * The feature id for the '<em><b>Seelische Behinderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG = 7;

	/**
	 * The feature id for the '<em><b>Art Der Behinderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG = 8;

	/**
	 * The feature id for the '<em><b>Aerztlicher Nachweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS = 9;

	/**
	 * The number of structural features of the '<em>Persoenliche Angaben Eingliederung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Persoenliche Angaben Eingliederung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl <em>Persoenliche Angaben HJV Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Anschriftsaenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG = 3;

	/**
	 * The feature id for the '<em><b>Weicht Anschrift Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB = 4;

	/**
	 * The feature id for the '<em><b>Abweichende Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT = 5;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN = 6;

	/**
	 * The feature id for the '<em><b>Aufenthaltsort Sonstige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE = 7;

	/**
	 * The number of structural features of the '<em>Persoenliche Angaben HJV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Persoenliche Angaben HJV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HJV_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHZETypeImpl <em>Persoenliche Angaben HZE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHZETypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenHZEType()
	 * @generated
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE__GEBURTSDATUM = 1;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE__AKTUELLE_ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Weicht Anschrift Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE__WEICHT_ANSCHRIFT_AB = 3;

	/**
	 * The feature id for the '<em><b>Abweichende Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE__ABWEICHENDE_ANSCHRIFT = 4;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE__KONTAKTDATEN = 5;

	/**
	 * The number of structural features of the '<em>Persoenliche Angaben HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Persoenliche Angaben HZE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_HZE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenKontaktformularTypeImpl <em>Persoenliche Angaben Kontaktformular Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenKontaktformularTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenKontaktformularType()
	 * @generated
	 */
	int PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Aktuelle Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Kontaktdaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__KONTAKTDATEN = 2;

	/**
	 * The number of structural features of the '<em>Persoenliche Angaben Kontaktformular Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Persoenliche Angaben Kontaktformular Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersonIdentifikationTypeImpl <em>Person Identifikation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersonIdentifikationTypeImpl
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersonIdentifikationType()
	 * @generated
	 */
	int PERSON_IDENTIFIKATION_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Namen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENTIFIKATION_TYPE__NAMEN = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENTIFIKATION_TYPE__GEBURTSDATUM = 1;

	/**
	 * The number of structural features of the '<em>Person Identifikation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENTIFIKATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person Identifikation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENTIFIKATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort <em>Aufenthaltsort</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAufenthaltsort()
	 * @generated
	 */
	int AUFENTHALTSORT = 32;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE <em>Auswahl Bescheidart HZE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlBescheidartHZE()
	 * @generated
	 */
	int AUSWAHL_BESCHEIDART_HZE = 33;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze <em>Auswahlderhilfehze</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlderhilfehze()
	 * @generated
	 */
	int AUSWAHLDERHILFEHZE = 34;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze <em>Verhaeltnisjugendlichhze</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getVerhaeltnisjugendlichhze()
	 * @generated
	 */
	int VERHAELTNISJUGENDLICHHZE = 35;

	/**
	 * The meta object id for the '<em>Aufenthaltsort Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAufenthaltsortObject()
	 * @generated
	 */
	int AUFENTHALTSORT_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Auswahl Bescheidart HZE Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlBescheidartHZEObject()
	 * @generated
	 */
	int AUSWAHL_BESCHEIDART_HZE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Auswahlderhilfehze Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlderhilfehzeObject()
	 * @generated
	 */
	int AUSWAHLDERHILFEHZE_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Verhaeltnisjugendlichhze Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getVerhaeltnisjugendlichhzeObject()
	 * @generated
	 */
	int VERHAELTNISJUGENDLICHHZE_OBJECT = 39;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType <em>Angaben Elternteil Eingliederung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Elternteil Eingliederung Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType
	 * @generated
	 */
	EClass getAngabenElternteilEingliederungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getNamen()
	 * @see #getAngabenElternteilEingliederungType()
	 * @generated
	 */
	EReference getAngabenElternteilEingliederungType_Namen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAngabenGeburtElternteil <em>Angaben Geburt Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Geburt Elternteil</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAngabenGeburtElternteil()
	 * @see #getAngabenElternteilEingliederungType()
	 * @generated
	 */
	EReference getAngabenElternteilEingliederungType_AngabenGeburtElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getAktuelleAnschrift()
	 * @see #getAngabenElternteilEingliederungType()
	 * @generated
	 */
	EReference getAngabenElternteilEingliederungType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType#getKontaktdaten()
	 * @see #getAngabenElternteilEingliederungType()
	 * @generated
	 */
	EReference getAngabenElternteilEingliederungType_Kontaktdaten();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType <em>Angaben Elternteil HJV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Elternteil HJV Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType
	 * @generated
	 */
	EClass getAngabenElternteilHJVType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getNamen()
	 * @see #getAngabenElternteilHJVType()
	 * @generated
	 */
	EReference getAngabenElternteilHJVType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getGeburtsdatum()
	 * @see #getAngabenElternteilHJVType()
	 * @generated
	 */
	EAttribute getAngabenElternteilHJVType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getAktuelleAnschrift()
	 * @see #getAngabenElternteilHJVType()
	 * @generated
	 */
	EReference getAngabenElternteilHJVType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType#getKontaktdaten()
	 * @see #getAngabenElternteilHJVType()
	 * @generated
	 */
	EReference getAngabenElternteilHJVType_Kontaktdaten();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType <em>Angaben ET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben ET Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType
	 * @generated
	 */
	EClass getAngabenETType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType#getNamen()
	 * @see #getAngabenETType()
	 * @generated
	 */
	EReference getAngabenETType_Namen();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType#getKontaktdaten()
	 * @see #getAngabenETType()
	 * @generated
	 */
	EReference getAngabenETType_Kontaktdaten();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType <em>Angaben Kind Eingliederung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Kind Eingliederung Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType
	 * @generated
	 */
	EClass getAngabenKindEingliederungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getNamen()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EReference getAngabenKindEingliederungType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getGeburtsdatum()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EAttribute getAngabenKindEingliederungType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getGeschlecht()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EReference getAngabenKindEingliederungType_Geschlecht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getAufenthaltsort <em>Aufenthaltsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsort</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getAufenthaltsort()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EReference getAngabenKindEingliederungType_Aufenthaltsort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getJugendlichAufenthaltsortSonstige <em>Jugendlich Aufenthaltsort Sonstige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jugendlich Aufenthaltsort Sonstige</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getJugendlichAufenthaltsortSonstige()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EAttribute getAngabenKindEingliederungType_JugendlichAufenthaltsortSonstige();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getAktuelleAnschrift()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EReference getAngabenKindEingliederungType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschriftsaenderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#isAnschriftsaenderung()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EAttribute getAngabenKindEingliederungType_Anschriftsaenderung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#isSeelischeBehinderung <em>Seelische Behinderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seelische Behinderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#isSeelischeBehinderung()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EAttribute getAngabenKindEingliederungType_SeelischeBehinderung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getArtDerBehinderung <em>Art Der Behinderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Der Behinderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#getArtDerBehinderung()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EAttribute getAngabenKindEingliederungType_ArtDerBehinderung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#isAerztlicherNachweis <em>Aerztlicher Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aerztlicher Nachweis</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType#isAerztlicherNachweis()
	 * @see #getAngabenKindEingliederungType()
	 * @generated
	 */
	EAttribute getAngabenKindEingliederungType_AerztlicherNachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType <em>Angaben Kind HJV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Kind HJV Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType
	 * @generated
	 */
	EClass getAngabenKindHJVType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getNamen()
	 * @see #getAngabenKindHJVType()
	 * @generated
	 */
	EReference getAngabenKindHJVType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeburtsdatum()
	 * @see #getAngabenKindHJVType()
	 * @generated
	 */
	EAttribute getAngabenKindHJVType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getGeschlecht()
	 * @see #getAngabenKindHJVType()
	 * @generated
	 */
	EReference getAngabenKindHJVType_Geschlecht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAufenthaltsort <em>Aufenthaltsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufenthaltsort</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAufenthaltsort()
	 * @see #getAngabenKindHJVType()
	 * @generated
	 */
	EReference getAngabenKindHJVType_Aufenthaltsort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getJugendlichAufenthaltsortSonstige <em>Jugendlich Aufenthaltsort Sonstige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jugendlich Aufenthaltsort Sonstige</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getJugendlichAufenthaltsortSonstige()
	 * @see #getAngabenKindHJVType()
	 * @generated
	 */
	EAttribute getAngabenKindHJVType_JugendlichAufenthaltsortSonstige();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#getAktuelleAnschrift()
	 * @see #getAngabenKindHJVType()
	 * @generated
	 */
	EReference getAngabenKindHJVType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschriftsaenderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHJVType#isAnschriftsaenderung()
	 * @see #getAngabenKindHJVType()
	 * @generated
	 */
	EAttribute getAngabenKindHJVType_Anschriftsaenderung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType <em>Angaben Kind HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Kind HZE Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType
	 * @generated
	 */
	EClass getAngabenKindHZEType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getNamen()
	 * @see #getAngabenKindHZEType()
	 * @generated
	 */
	EReference getAngabenKindHZEType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType#getGeburtsdatum()
	 * @see #getAngabenKindHZEType()
	 * @generated
	 */
	EAttribute getAngabenKindHZEType_Geburtsdatum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType <em>Angaben Zu Jugendlich HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zu Jugendlich HZE Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType
	 * @generated
	 */
	EClass getAngabenZuJugendlichHZEType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getNameDerDesJugendlichen <em>Name Der Des Jugendlichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Der Des Jugendlichen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getNameDerDesJugendlichen()
	 * @see #getAngabenZuJugendlichHZEType()
	 * @generated
	 */
	EReference getAngabenZuJugendlichHZEType_NameDerDesJugendlichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getGeburtsdatum()
	 * @see #getAngabenZuJugendlichHZEType()
	 * @generated
	 */
	EAttribute getAngabenZuJugendlichHZEType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getAktuelleAnschrift()
	 * @see #getAngabenZuJugendlichHZEType()
	 * @generated
	 */
	EReference getAngabenZuJugendlichHZEType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschriftsaenderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#isAnschriftsaenderung()
	 * @see #getAngabenZuJugendlichHZEType()
	 * @generated
	 */
	EAttribute getAngabenZuJugendlichHZEType_Anschriftsaenderung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abweichende Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType#getAbweichendeAnschrift()
	 * @see #getAngabenZuJugendlichHZEType()
	 * @generated
	 */
	EReference getAngabenZuJugendlichHZEType_AbweichendeAnschrift();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType <em>Angaben Zu Jugendlich Kontaktformular Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zu Jugendlich Kontaktformular Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType
	 * @generated
	 */
	EClass getAngabenZuJugendlichKontaktformularType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getNameDerDesJugendlichen <em>Name Der Des Jugendlichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Der Des Jugendlichen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getNameDerDesJugendlichen()
	 * @see #getAngabenZuJugendlichKontaktformularType()
	 * @generated
	 */
	EReference getAngabenZuJugendlichKontaktformularType_NameDerDesJugendlichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getGeburtsdatum()
	 * @see #getAngabenZuJugendlichKontaktformularType()
	 * @generated
	 */
	EAttribute getAngabenZuJugendlichKontaktformularType_Geburtsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#isAnschriftStimmtUeberein <em>Anschrift Stimmt Ueberein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschrift Stimmt Ueberein</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#isAnschriftStimmtUeberein()
	 * @see #getAngabenZuJugendlichKontaktformularType()
	 * @generated
	 */
	EAttribute getAngabenZuJugendlichKontaktformularType_AnschriftStimmtUeberein();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType#getAktuelleAnschrift()
	 * @see #getAngabenZuJugendlichKontaktformularType()
	 * @generated
	 */
	EReference getAngabenZuJugendlichKontaktformularType_AktuelleAnschrift();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType <em>Anliegensklaerung Anfrage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anliegensklaerung Anfrage Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType
	 * @generated
	 */
	EClass getAnliegensklaerungAnfrageType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType#getAnliegenVerhaeltnisJugendlich <em>Anliegen Verhaeltnis Jugendlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegen Verhaeltnis Jugendlich</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType#getAnliegenVerhaeltnisJugendlich()
	 * @see #getAnliegensklaerungAnfrageType()
	 * @generated
	 */
	EReference getAnliegensklaerungAnfrageType_AnliegenVerhaeltnisJugendlich();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType#isSorgeberechtigtAbfrage <em>Sorgeberechtigt Abfrage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorgeberechtigt Abfrage</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType#isSorgeberechtigtAbfrage()
	 * @see #getAnliegensklaerungAnfrageType()
	 * @generated
	 */
	EAttribute getAnliegensklaerungAnfrageType_SorgeberechtigtAbfrage();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType#isGemeinsamSorgeberechtigt <em>Gemeinsam Sorgeberechtigt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gemeinsam Sorgeberechtigt</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType#isGemeinsamSorgeberechtigt()
	 * @see #getAnliegensklaerungAnfrageType()
	 * @generated
	 */
	EAttribute getAnliegensklaerungAnfrageType_GemeinsamSorgeberechtigt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType <em>Anliegensklaerung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anliegensklaerung Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType
	 * @generated
	 */
	EClass getAnliegensklaerungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#getAnliegenVerhaeltnisJugendlich <em>Anliegen Verhaeltnis Jugendlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegen Verhaeltnis Jugendlich</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#getAnliegenVerhaeltnisJugendlich()
	 * @see #getAnliegensklaerungType()
	 * @generated
	 */
	EReference getAnliegensklaerungType_AnliegenVerhaeltnisJugendlich();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#isGemeinsamSorgeberechtigt <em>Gemeinsam Sorgeberechtigt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gemeinsam Sorgeberechtigt</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType#isGemeinsamSorgeberechtigt()
	 * @see #getAnliegensklaerungType()
	 * @generated
	 */
	EAttribute getAnliegensklaerungType_GemeinsamSorgeberechtigt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType <em>Antragstellender ET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender ET Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType
	 * @generated
	 */
	EClass getAntragstellenderETType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getNamen()
	 * @see #getAntragstellenderETType()
	 * @generated
	 */
	EReference getAntragstellenderETType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsort()
	 * @see #getAntragstellenderETType()
	 * @generated
	 */
	EAttribute getAntragstellenderETType_Geburtsort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getGeburtsdatum()
	 * @see #getAntragstellenderETType()
	 * @generated
	 */
	EAttribute getAntragstellenderETType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresse</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAdresse()
	 * @see #getAntragstellenderETType()
	 * @generated
	 */
	EReference getAntragstellenderETType_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#isAbweichendeAdresse <em>Abweichende Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abweichende Adresse</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#isAbweichendeAdresse()
	 * @see #getAntragstellenderETType()
	 * @generated
	 */
	EAttribute getAntragstellenderETType_AbweichendeAdresse();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abweichende Adresse Perso</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getAbweichendeAdressePerso()
	 * @see #getAntragstellenderETType()
	 * @generated
	 */
	EReference getAntragstellenderETType_AbweichendeAdressePerso();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType#getKontaktdaten()
	 * @see #getAntragstellenderETType()
	 * @generated
	 */
	EReference getAntragstellenderETType_Kontaktdaten();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartType <em>Auswahl Bescheidart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auswahl Bescheidart Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartType
	 * @generated
	 */
	EClass getAuswahlBescheidartType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType <em>Begruendung Des Hilfebedarfs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begruendung Des Hilfebedarfs Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType
	 * @generated
	 */
	EClass getBegruendungDesHilfebedarfsType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getGrundBeantragung <em>Grund Beantragung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grund Beantragung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getGrundBeantragung()
	 * @see #getBegruendungDesHilfebedarfsType()
	 * @generated
	 */
	EAttribute getBegruendungDesHilfebedarfsType_GrundBeantragung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getHilfeVomJugendamt <em>Hilfe Vom Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hilfe Vom Jugendamt</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType#getHilfeVomJugendamt()
	 * @see #getBegruendungDesHilfebedarfsType()
	 * @generated
	 */
	EAttribute getBegruendungDesHilfebedarfsType_HilfeVomJugendamt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAufenthaltType <em>Code Aufenthalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Aufenthalt Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAufenthaltType
	 * @generated
	 */
	EClass getCodeAufenthaltType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType <em>Code Auswahl Der Hilfe Hz EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Auswahl Der Hilfe Hz EType</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType
	 * @generated
	 */
	EClass getCodeAuswahlDerHilfeHzEType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeHZEIchBinType <em>Code HZE Ich Bin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code HZE Ich Bin Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeHZEIchBinType
	 * @generated
	 */
	EClass getCodeHZEIchBinType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeVerhaeltnisJugendlichHZEType <em>Code Verhaeltnis Jugendlich HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Verhaeltnis Jugendlich HZE Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeVerhaeltnisJugendlichHZEType
	 * @generated
	 */
	EClass getCodeVerhaeltnisJugendlichHZEType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAnfrageHJV0702 <em>Hilfen Zur Erziehung Anfrage HJV0702</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hilfen Zur Erziehung Anfrage HJV0702</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAnfrageHJV0702()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HilfenZurErziehungAnfrageHJV0702();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAntrag0701 <em>Hilfen Zur Erziehung Antrag0701</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hilfen Zur Erziehung Antrag0701</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAntrag0701()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HilfenZurErziehungAntrag0701();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungEingliederungshilfe0703 <em>Hilfen Zur Erziehung Eingliederungshilfe0703</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hilfen Zur Erziehung Eingliederungshilfe0703</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungEingliederungshilfe0703()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HilfenZurErziehungEingliederungshilfe0703();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungNachweisnachricht0711 <em>Hilfen Zur Erziehung Nachweisnachricht0711</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hilfen Zur Erziehung Nachweisnachricht0711</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungNachweisnachricht0711()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HilfenZurErziehungNachweisnachricht0711();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungWiderspruch0704 <em>Hilfen Zur Erziehung Widerspruch0704</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hilfen Zur Erziehung Widerspruch0704</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungWiderspruch0704()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HilfenZurErziehungWiderspruch0704();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType <em>Erreichbarkeit HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erreichbarkeit HZE Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType
	 * @generated
	 */
	EClass getErreichbarkeitHZEType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType#getZeitErreichbarkeitHZE <em>Zeit Erreichbarkeit HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeit Erreichbarkeit HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType#getZeitErreichbarkeitHZE()
	 * @see #getErreichbarkeitHZEType()
	 * @generated
	 */
	EAttribute getErreichbarkeitHZEType_ZeitErreichbarkeitHZE();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type <em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type
	 * @generated
	 */
	EClass getHilfenZurErziehungAnfrageHJV0702Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAuswahlAnfrageHJV <em>Auswahl Anfrage HJV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auswahl Anfrage HJV</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAuswahlAnfrageHJV()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAnfrageHJV0702Type_AuswahlAnfrageHJV();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAnliegensklaerungHJV <em>Anliegensklaerung HJV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegensklaerung HJV</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAnliegensklaerungHJV()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAnfrageHJV0702Type_AnliegensklaerungHJV();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getPersoenlicheAngabenHJV <em>Persoenliche Angaben HJV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persoenliche Angaben HJV</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getPersoenlicheAngabenHJV()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAnfrageHJV0702Type_PersoenlicheAngabenHJV();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getBegruendungHJV <em>Begruendung HJV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begruendung HJV</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getBegruendungHJV()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAnfrageHJV0702Type_BegruendungHJV();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAngabenAndererElternteil <em>Angaben Anderer Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Anderer Elternteil</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getAngabenAndererElternteil()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAnfrageHJV0702Type_AngabenAndererElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#getDsgvo()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAnfrageHJV0702Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Richtigkeit Angaben</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isRichtigkeitAngaben()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungAnfrageHJV0702Type_RichtigkeitAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung Zwischenspeichern</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type#isEinwilligungZwischenspeichern()
	 * @see #getHilfenZurErziehungAnfrageHJV0702Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungAnfrageHJV0702Type_EinwilligungZwischenspeichern();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type <em>Hilfen Zur Erziehung Antrag0701 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hilfen Zur Erziehung Antrag0701 Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type
	 * @generated
	 */
	EClass getHilfenZurErziehungAntrag0701Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAuswahlDerHilfeHZE <em>Auswahl Der Hilfe HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auswahl Der Hilfe HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAuswahlDerHilfeHZE()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAntrag0701Type_AuswahlDerHilfeHZE();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAnliegensklaerungHZE <em>Anliegensklaerung HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegensklaerung HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAnliegensklaerungHZE()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAntrag0701Type_AnliegensklaerungHZE();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPruefcodeHZE <em>Pruefcode HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pruefcode HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPruefcodeHZE()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungAntrag0701Type_PruefcodeHZE();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persoenliche Angaben Zu Ihrer Person</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getPersoenlicheAngabenZuIhrerPerson()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAntrag0701Type_PersoenlicheAngabenZuIhrerPerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAndererElternteil <em>Anderer Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anderer Elternteil</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAndererElternteil()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAntrag0701Type_AndererElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAngabenKindHZE <em>Angaben Kind HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Kind HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getAngabenKindHZE()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAntrag0701Type_AngabenKindHZE();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getNachweiseHZE <em>Nachweise HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweise HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getNachweiseHZE()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAntrag0701Type_NachweiseHZE();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getDsgvo()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungAntrag0701Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getZusatzNachrichtHZE <em>Zusatz Nachricht HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatz Nachricht HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#getZusatzNachrichtHZE()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungAntrag0701Type_ZusatzNachrichtHZE();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung Zwischenspeichern</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type#isEinwilligungZwischenspeichern()
	 * @see #getHilfenZurErziehungAntrag0701Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungAntrag0701Type_EinwilligungZwischenspeichern();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type <em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type
	 * @generated
	 */
	EClass getHilfenZurErziehungEingliederungshilfe0703Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAuswahlAnfrageEingliederung <em>Auswahl Anfrage Eingliederung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auswahl Anfrage Eingliederung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAuswahlAnfrageEingliederung()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungEingliederungshilfe0703Type_AuswahlAnfrageEingliederung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAnliegensklaerungEingliederung <em>Anliegensklaerung Eingliederung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anliegensklaerung Eingliederung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAnliegensklaerungEingliederung()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungEingliederungshilfe0703Type_AnliegensklaerungEingliederung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persoenliche Angaben Zu Ihrer Person</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getPersoenlicheAngabenZuIhrerPerson()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungEingliederungshilfe0703Type_PersoenlicheAngabenZuIhrerPerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAngabenKind <em>Angaben Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Kind</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAngabenKind()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungEingliederungshilfe0703Type_AngabenKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getBegruendungHZE <em>Begruendung HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begruendung HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getBegruendungHZE()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungEingliederungshilfe0703Type_BegruendungHZE();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAngabenElternteile <em>Angaben Elternteile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Elternteile</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getAngabenElternteile()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungEingliederungshilfe0703Type_AngabenElternteile();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#getDsgvo()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungEingliederungshilfe0703Type_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Richtigkeit Angaben</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isRichtigkeitAngaben()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungEingliederungshilfe0703Type_RichtigkeitAngaben();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung Zwischenspeichern</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type#isEinwilligungZwischenspeichern()
	 * @see #getHilfenZurErziehungEingliederungshilfe0703Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungEingliederungshilfe0703Type_EinwilligungZwischenspeichern();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type <em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type
	 * @generated
	 */
	EClass getHilfenZurErziehungNachweisnachricht0711Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persoenliche Angaben Zu Ihrer Person</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getPersoenlicheAngabenZuIhrerPerson()
	 * @see #getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungNachweisnachricht0711Type_PersoenlicheAngabenZuIhrerPerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAngabenKind <em>Angaben Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Kind</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAngabenKind()
	 * @see #getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungNachweisnachricht0711Type_AngabenKind();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getJugendamt <em>Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jugendamt</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getJugendamt()
	 * @see #getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungNachweisnachricht0711Type_Jugendamt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bearbeitungsnummer</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getBearbeitungsnummer()
	 * @see #getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungNachweisnachricht0711Type_Bearbeitungsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAntragsdatum <em>Antragsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Antragsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getAntragsdatum()
	 * @see #getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungNachweisnachricht0711Type_Antragsdatum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getNachweis()
	 * @see #getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungNachweisnachricht0711Type_Nachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getZusatznachrichtHZE <em>Zusatznachricht HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatznachricht HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type#getZusatznachrichtHZE()
	 * @see #getHilfenZurErziehungNachweisnachricht0711Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungNachweisnachricht0711Type_ZusatznachrichtHZE();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type <em>Hilfen Zur Erziehung Widerspruch0704 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hilfen Zur Erziehung Widerspruch0704 Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type
	 * @generated
	 */
	EClass getHilfenZurErziehungWiderspruch0704Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persoenliche Angaben Zu Ihrer Person</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getPersoenlicheAngabenZuIhrerPerson()
	 * @see #getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungWiderspruch0704Type_PersoenlicheAngabenZuIhrerPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAktenzeichen <em>Aktenzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAktenzeichen()
	 * @see #getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungWiderspruch0704Type_Aktenzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBescheiddatum <em>Bescheiddatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bescheiddatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBescheiddatum()
	 * @see #getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungWiderspruch0704Type_Bescheiddatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBegruendungWiderspruch <em>Begruendung Widerspruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begruendung Widerspruch</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getBegruendungWiderspruch()
	 * @see #getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungWiderspruch0704Type_BegruendungWiderspruch();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#isBestaetigungWiderspruch <em>Bestaetigung Widerspruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bestaetigung Widerspruch</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#isBestaetigungWiderspruch()
	 * @see #getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	EAttribute getHilfenZurErziehungWiderspruch0704Type_BestaetigungWiderspruch();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getNachweis()
	 * @see #getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungWiderspruch0704Type_Nachweis();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAuswahlBescheidart <em>Auswahl Bescheidart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auswahl Bescheidart</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type#getAuswahlBescheidart()
	 * @see #getHilfenZurErziehungWiderspruch0704Type()
	 * @generated
	 */
	EReference getHilfenZurErziehungWiderspruch0704Type_AuswahlBescheidart();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType <em>Nachweise Datenschutz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweise Datenschutz Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType
	 * @generated
	 */
	EClass getNachweiseDatenschutzType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#getNachweis()
	 * @see #getNachweiseDatenschutzType()
	 * @generated
	 */
	EReference getNachweiseDatenschutzType_Nachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isZustimmungET2 <em>Zustimmung ET2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung ET2</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isZustimmungET2()
	 * @see #getNachweiseDatenschutzType()
	 * @generated
	 */
	EAttribute getNachweiseDatenschutzType_ZustimmungET2();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Richtigkeit Angaben</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType#isRichtigkeitAngaben()
	 * @see #getNachweiseDatenschutzType()
	 * @generated
	 */
	EAttribute getNachweiseDatenschutzType_RichtigkeitAngaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType <em>Nachweise HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweise HZE Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType
	 * @generated
	 */
	EClass getNachweiseHZEType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getSorgerechtsnachweis <em>Sorgerechtsnachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorgerechtsnachweis</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getSorgerechtsnachweis()
	 * @see #getNachweiseHZEType()
	 * @generated
	 */
	EReference getNachweiseHZEType_Sorgerechtsnachweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getIdentitaetsnachweis <em>Identitaetsnachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identitaetsnachweis</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getIdentitaetsnachweis()
	 * @see #getNachweiseHZEType()
	 * @generated
	 */
	EReference getNachweiseHZEType_Identitaetsnachweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getWeitereNachweise <em>Weitere Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weitere Nachweise</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getWeitereNachweise()
	 * @see #getNachweiseHZEType()
	 * @generated
	 */
	EReference getNachweiseHZEType_WeitereNachweise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getNachweisMeldebescheinigung <em>Nachweis Meldebescheinigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Meldebescheinigung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getNachweisMeldebescheinigung()
	 * @see #getNachweiseHZEType()
	 * @generated
	 */
	EReference getNachweiseHZEType_NachweisMeldebescheinigung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getAnmerkungen <em>Anmerkungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anmerkungen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getAnmerkungen()
	 * @see #getNachweiseHZEType()
	 * @generated
	 */
	EAttribute getNachweiseHZEType_Anmerkungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getDsgvo <em>Dsgvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsgvo</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#getDsgvo()
	 * @see #getNachweiseHZEType()
	 * @generated
	 */
	EReference getNachweiseHZEType_Dsgvo();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Richtigkeit Angaben</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType#isRichtigkeitAngaben()
	 * @see #getNachweiseHZEType()
	 * @generated
	 */
	EAttribute getNachweiseHZEType_RichtigkeitAngaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweis Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType
	 * @generated
	 */
	EClass getNachweisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisBeschreibung <em>Nachweis Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachweis Beschreibung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisBeschreibung()
	 * @see #getNachweisType()
	 * @generated
	 */
	EAttribute getNachweisType_NachweisBeschreibung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisDokument <em>Nachweis Dokument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis Dokument</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType#getNachweisDokument()
	 * @see #getNachweisType()
	 * @generated
	 */
	EReference getNachweisType_NachweisDokument();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType <em>Persoenliche Angaben Eingliederung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persoenliche Angaben Eingliederung Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType
	 * @generated
	 */
	EClass getPersoenlicheAngabenEingliederungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getNamen()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenEingliederungType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getGeburtsdatum()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenEingliederungType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAktuelleAnschrift()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenEingliederungType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschriftsaenderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAnschriftsaenderung()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenEingliederungType_Anschriftsaenderung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weicht Anschrift Ab</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isWeichtAnschriftAb()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenEingliederungType_WeichtAnschriftAb();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abweichende Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getAbweichendeAnschrift()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenEingliederungType_AbweichendeAnschrift();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getKontaktdaten()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenEingliederungType_Kontaktdaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isSeelischeBehinderung <em>Seelische Behinderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seelische Behinderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isSeelischeBehinderung()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenEingliederungType_SeelischeBehinderung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getArtDerBehinderung <em>Art Der Behinderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Der Behinderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#getArtDerBehinderung()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenEingliederungType_ArtDerBehinderung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAerztlicherNachweis <em>Aerztlicher Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aerztlicher Nachweis</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType#isAerztlicherNachweis()
	 * @see #getPersoenlicheAngabenEingliederungType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenEingliederungType_AerztlicherNachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType <em>Persoenliche Angaben HJV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persoenliche Angaben HJV Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType
	 * @generated
	 */
	EClass getPersoenlicheAngabenHJVType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getNamen()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHJVType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getGeburtsdatum()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenHJVType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getAktuelleAnschrift()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHJVType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#isAnschriftsaenderung <em>Anschriftsaenderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschriftsaenderung</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#isAnschriftsaenderung()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenHJVType_Anschriftsaenderung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weicht Anschrift Ab</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#isWeichtAnschriftAb()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenHJVType_WeichtAnschriftAb();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abweichende Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getAbweichendeAnschrift()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHJVType_AbweichendeAnschrift();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getKontaktdaten()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHJVType_Kontaktdaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getAufenthaltsortSonstige <em>Aufenthaltsort Sonstige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aufenthaltsort Sonstige</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType#getAufenthaltsortSonstige()
	 * @see #getPersoenlicheAngabenHJVType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenHJVType_AufenthaltsortSonstige();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType <em>Persoenliche Angaben HZE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persoenliche Angaben HZE Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType
	 * @generated
	 */
	EClass getPersoenlicheAngabenHZEType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getNamen()
	 * @see #getPersoenlicheAngabenHZEType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHZEType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getGeburtsdatum()
	 * @see #getPersoenlicheAngabenHZEType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenHZEType_Geburtsdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getAktuelleAnschrift()
	 * @see #getPersoenlicheAngabenHZEType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHZEType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weicht Anschrift Ab</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#isWeichtAnschriftAb()
	 * @see #getPersoenlicheAngabenHZEType()
	 * @generated
	 */
	EAttribute getPersoenlicheAngabenHZEType_WeichtAnschriftAb();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abweichende Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getAbweichendeAnschrift()
	 * @see #getPersoenlicheAngabenHZEType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHZEType_AbweichendeAnschrift();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType#getKontaktdaten()
	 * @see #getPersoenlicheAngabenHZEType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenHZEType_Kontaktdaten();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType <em>Persoenliche Angaben Kontaktformular Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persoenliche Angaben Kontaktformular Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType
	 * @generated
	 */
	EClass getPersoenlicheAngabenKontaktformularType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType#getNamen()
	 * @see #getPersoenlicheAngabenKontaktformularType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenKontaktformularType_Namen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktuelle Anschrift</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType#getAktuelleAnschrift()
	 * @see #getPersoenlicheAngabenKontaktformularType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenKontaktformularType_AktuelleAnschrift();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType#getKontaktdaten <em>Kontaktdaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontaktdaten</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenKontaktformularType#getKontaktdaten()
	 * @see #getPersoenlicheAngabenKontaktformularType()
	 * @generated
	 */
	EReference getPersoenlicheAngabenKontaktformularType_Kontaktdaten();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType <em>Person Identifikation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Identifikation Type</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType
	 * @generated
	 */
	EClass getPersonIdentifikationType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType#getNamen <em>Namen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namen</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType#getNamen()
	 * @see #getPersonIdentifikationType()
	 * @generated
	 */
	EReference getPersonIdentifikationType_Namen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersonIdentifikationType#getGeburtsdatum()
	 * @see #getPersonIdentifikationType()
	 * @generated
	 */
	EAttribute getPersonIdentifikationType_Geburtsdatum();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort <em>Aufenthaltsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aufenthaltsort</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort
	 * @generated
	 */
	EEnum getAufenthaltsort();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE <em>Auswahl Bescheidart HZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auswahl Bescheidart HZE</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE
	 * @generated
	 */
	EEnum getAuswahlBescheidartHZE();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze <em>Auswahlderhilfehze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auswahlderhilfehze</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze
	 * @generated
	 */
	EEnum getAuswahlderhilfehze();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze <em>Verhaeltnisjugendlichhze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verhaeltnisjugendlichhze</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze
	 * @generated
	 */
	EEnum getVerhaeltnisjugendlichhze();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort <em>Aufenthaltsort Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aufenthaltsort Object</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort
	 * @model instanceClass="de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort"
	 *        extendedMetaData="name='aufenthaltsort:Object' baseType='aufenthaltsort'"
	 * @generated
	 */
	EDataType getAufenthaltsortObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE <em>Auswahl Bescheidart HZE Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Auswahl Bescheidart HZE Object</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE
	 * @model instanceClass="de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE"
	 *        extendedMetaData="name='auswahlBescheidartHZE:Object' baseType='auswahlBescheidartHZE'"
	 * @generated
	 */
	EDataType getAuswahlBescheidartHZEObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze <em>Auswahlderhilfehze Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Auswahlderhilfehze Object</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze
	 * @model instanceClass="de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze"
	 *        extendedMetaData="name='auswahlderhilfehze:Object' baseType='auswahlderhilfehze'"
	 * @generated
	 */
	EDataType getAuswahlderhilfehzeObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze <em>Verhaeltnisjugendlichhze Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Verhaeltnisjugendlichhze Object</em>'.
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze
	 * @model instanceClass="de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze"
	 *        extendedMetaData="name='verhaeltnisjugendlichhze:Object' baseType='verhaeltnisjugendlichhze'"
	 * @generated
	 */
	EDataType getVerhaeltnisjugendlichhzeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErziehungshilfeFactory getErziehungshilfeFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl <em>Angaben Elternteil Eingliederung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenElternteilEingliederungType()
		 * @generated
		 */
		EClass ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE = eINSTANCE.getAngabenElternteilEingliederungType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN = eINSTANCE.getAngabenElternteilEingliederungType_Namen();

		/**
		 * The meta object literal for the '<em><b>Angaben Geburt Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL = eINSTANCE.getAngabenElternteilEingliederungType_AngabenGeburtElternteil();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getAngabenElternteilEingliederungType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN = eINSTANCE.getAngabenElternteilEingliederungType_Kontaktdaten();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilHJVTypeImpl <em>Angaben Elternteil HJV Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilHJVTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenElternteilHJVType()
		 * @generated
		 */
		EClass ANGABEN_ELTERNTEIL_HJV_TYPE = eINSTANCE.getAngabenElternteilHJVType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ELTERNTEIL_HJV_TYPE__NAMEN = eINSTANCE.getAngabenElternteilHJVType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ELTERNTEIL_HJV_TYPE__GEBURTSDATUM = eINSTANCE.getAngabenElternteilHJVType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ELTERNTEIL_HJV_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getAngabenElternteilHJVType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ELTERNTEIL_HJV_TYPE__KONTAKTDATEN = eINSTANCE.getAngabenElternteilHJVType_Kontaktdaten();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenETTypeImpl <em>Angaben ET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenETTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenETType()
		 * @generated
		 */
		EClass ANGABEN_ET_TYPE = eINSTANCE.getAngabenETType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ET_TYPE__NAMEN = eINSTANCE.getAngabenETType_Namen();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ET_TYPE__KONTAKTDATEN = eINSTANCE.getAngabenETType_Kontaktdaten();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl <em>Angaben Kind Eingliederung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenKindEingliederungType()
		 * @generated
		 */
		EClass ANGABEN_KIND_EINGLIEDERUNG_TYPE = eINSTANCE.getAngabenKindEingliederungType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN = eINSTANCE.getAngabenKindEingliederungType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM = eINSTANCE.getAngabenKindEingliederungType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Geschlecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT = eINSTANCE.getAngabenKindEingliederungType_Geschlecht();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT = eINSTANCE.getAngabenKindEingliederungType_Aufenthaltsort();

		/**
		 * The meta object literal for the '<em><b>Jugendlich Aufenthaltsort Sonstige</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE = eINSTANCE.getAngabenKindEingliederungType_JugendlichAufenthaltsortSonstige();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getAngabenKindEingliederungType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Anschriftsaenderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG = eINSTANCE.getAngabenKindEingliederungType_Anschriftsaenderung();

		/**
		 * The meta object literal for the '<em><b>Seelische Behinderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG = eINSTANCE.getAngabenKindEingliederungType_SeelischeBehinderung();

		/**
		 * The meta object literal for the '<em><b>Art Der Behinderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG = eINSTANCE.getAngabenKindEingliederungType_ArtDerBehinderung();

		/**
		 * The meta object literal for the '<em><b>Aerztlicher Nachweis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS = eINSTANCE.getAngabenKindEingliederungType_AerztlicherNachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHJVTypeImpl <em>Angaben Kind HJV Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHJVTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenKindHJVType()
		 * @generated
		 */
		EClass ANGABEN_KIND_HJV_TYPE = eINSTANCE.getAngabenKindHJVType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_HJV_TYPE__NAMEN = eINSTANCE.getAngabenKindHJVType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_HJV_TYPE__GEBURTSDATUM = eINSTANCE.getAngabenKindHJVType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Geschlecht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_HJV_TYPE__GESCHLECHT = eINSTANCE.getAngabenKindHJVType_Geschlecht();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_HJV_TYPE__AUFENTHALTSORT = eINSTANCE.getAngabenKindHJVType_Aufenthaltsort();

		/**
		 * The meta object literal for the '<em><b>Jugendlich Aufenthaltsort Sonstige</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_HJV_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE = eINSTANCE.getAngabenKindHJVType_JugendlichAufenthaltsortSonstige();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_HJV_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getAngabenKindHJVType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Anschriftsaenderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_HJV_TYPE__ANSCHRIFTSAENDERUNG = eINSTANCE.getAngabenKindHJVType_Anschriftsaenderung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHZETypeImpl <em>Angaben Kind HZE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindHZETypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenKindHZEType()
		 * @generated
		 */
		EClass ANGABEN_KIND_HZE_TYPE = eINSTANCE.getAngabenKindHZEType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_KIND_HZE_TYPE__NAMEN = eINSTANCE.getAngabenKindHZEType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_KIND_HZE_TYPE__GEBURTSDATUM = eINSTANCE.getAngabenKindHZEType_Geburtsdatum();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl <em>Angaben Zu Jugendlich HZE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenZuJugendlichHZEType()
		 * @generated
		 */
		EClass ANGABEN_ZU_JUGENDLICH_HZE_TYPE = eINSTANCE.getAngabenZuJugendlichHZEType();

		/**
		 * The meta object literal for the '<em><b>Name Der Des Jugendlichen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN = eINSTANCE.getAngabenZuJugendlichHZEType_NameDerDesJugendlichen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM = eINSTANCE.getAngabenZuJugendlichHZEType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getAngabenZuJugendlichHZEType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Anschriftsaenderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG = eINSTANCE.getAngabenZuJugendlichHZEType_Anschriftsaenderung();

		/**
		 * The meta object literal for the '<em><b>Abweichende Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT = eINSTANCE.getAngabenZuJugendlichHZEType_AbweichendeAnschrift();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl <em>Angaben Zu Jugendlich Kontaktformular Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAngabenZuJugendlichKontaktformularType()
		 * @generated
		 */
		EClass ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE = eINSTANCE.getAngabenZuJugendlichKontaktformularType();

		/**
		 * The meta object literal for the '<em><b>Name Der Des Jugendlichen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN = eINSTANCE.getAngabenZuJugendlichKontaktformularType_NameDerDesJugendlichen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM = eINSTANCE.getAngabenZuJugendlichKontaktformularType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Anschrift Stimmt Ueberein</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN = eINSTANCE.getAngabenZuJugendlichKontaktformularType_AnschriftStimmtUeberein();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getAngabenZuJugendlichKontaktformularType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungAnfrageTypeImpl <em>Anliegensklaerung Anfrage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungAnfrageTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAnliegensklaerungAnfrageType()
		 * @generated
		 */
		EClass ANLIEGENSKLAERUNG_ANFRAGE_TYPE = eINSTANCE.getAnliegensklaerungAnfrageType();

		/**
		 * The meta object literal for the '<em><b>Anliegen Verhaeltnis Jugendlich</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH = eINSTANCE.getAnliegensklaerungAnfrageType_AnliegenVerhaeltnisJugendlich();

		/**
		 * The meta object literal for the '<em><b>Sorgeberechtigt Abfrage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE = eINSTANCE.getAnliegensklaerungAnfrageType_SorgeberechtigtAbfrage();

		/**
		 * The meta object literal for the '<em><b>Gemeinsam Sorgeberechtigt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT = eINSTANCE.getAnliegensklaerungAnfrageType_GemeinsamSorgeberechtigt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungTypeImpl <em>Anliegensklaerung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAnliegensklaerungType()
		 * @generated
		 */
		EClass ANLIEGENSKLAERUNG_TYPE = eINSTANCE.getAnliegensklaerungType();

		/**
		 * The meta object literal for the '<em><b>Anliegen Verhaeltnis Jugendlich</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLIEGENSKLAERUNG_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH = eINSTANCE.getAnliegensklaerungType_AnliegenVerhaeltnisJugendlich();

		/**
		 * The meta object literal for the '<em><b>Gemeinsam Sorgeberechtigt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLIEGENSKLAERUNG_TYPE__GEMEINSAM_SORGEBERECHTIGT = eINSTANCE.getAnliegensklaerungType_GemeinsamSorgeberechtigt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl <em>Antragstellender ET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAntragstellenderETType()
		 * @generated
		 */
		EClass ANTRAGSTELLENDER_ET_TYPE = eINSTANCE.getAntragstellenderETType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ET_TYPE__NAMEN = eINSTANCE.getAntragstellenderETType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT = eINSTANCE.getAntragstellenderETType_Geburtsort();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM = eINSTANCE.getAntragstellenderETType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ET_TYPE__ADRESSE = eINSTANCE.getAntragstellenderETType_Adresse();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE = eINSTANCE.getAntragstellenderETType_AbweichendeAdresse();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse Perso</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO = eINSTANCE.getAntragstellenderETType_AbweichendeAdressePerso();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN = eINSTANCE.getAntragstellenderETType_Kontaktdaten();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AuswahlBescheidartTypeImpl <em>Auswahl Bescheidart Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AuswahlBescheidartTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlBescheidartType()
		 * @generated
		 */
		EClass AUSWAHL_BESCHEIDART_TYPE = eINSTANCE.getAuswahlBescheidartType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.BegruendungDesHilfebedarfsTypeImpl <em>Begruendung Des Hilfebedarfs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.BegruendungDesHilfebedarfsTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getBegruendungDesHilfebedarfsType()
		 * @generated
		 */
		EClass BEGRUENDUNG_DES_HILFEBEDARFS_TYPE = eINSTANCE.getBegruendungDesHilfebedarfsType();

		/**
		 * The meta object literal for the '<em><b>Grund Beantragung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG = eINSTANCE.getBegruendungDesHilfebedarfsType_GrundBeantragung();

		/**
		 * The meta object literal for the '<em><b>Hilfe Vom Jugendamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT = eINSTANCE.getBegruendungDesHilfebedarfsType_HilfeVomJugendamt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAufenthaltTypeImpl <em>Code Aufenthalt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAufenthaltTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeAufenthaltType()
		 * @generated
		 */
		EClass CODE_AUFENTHALT_TYPE = eINSTANCE.getCodeAufenthaltType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAuswahlDerHilfeHzETypeImpl <em>Code Auswahl Der Hilfe Hz EType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeAuswahlDerHilfeHzETypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeAuswahlDerHilfeHzEType()
		 * @generated
		 */
		EClass CODE_AUSWAHL_DER_HILFE_HZ_ETYPE = eINSTANCE.getCodeAuswahlDerHilfeHzEType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeHZEIchBinTypeImpl <em>Code HZE Ich Bin Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeHZEIchBinTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeHZEIchBinType()
		 * @generated
		 */
		EClass CODE_HZE_ICH_BIN_TYPE = eINSTANCE.getCodeHZEIchBinType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeVerhaeltnisJugendlichHZETypeImpl <em>Code Verhaeltnis Jugendlich HZE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.CodeVerhaeltnisJugendlichHZETypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getCodeVerhaeltnisJugendlichHZEType()
		 * @generated
		 */
		EClass CODE_VERHAELTNIS_JUGENDLICH_HZE_TYPE = eINSTANCE.getCodeVerhaeltnisJugendlichHZEType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Hilfen Zur Erziehung Anfrage HJV0702</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702 = eINSTANCE.getDocumentRoot_HilfenZurErziehungAnfrageHJV0702();

		/**
		 * The meta object literal for the '<em><b>Hilfen Zur Erziehung Antrag0701</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701 = eINSTANCE.getDocumentRoot_HilfenZurErziehungAntrag0701();

		/**
		 * The meta object literal for the '<em><b>Hilfen Zur Erziehung Eingliederungshilfe0703</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703 = eINSTANCE.getDocumentRoot_HilfenZurErziehungEingliederungshilfe0703();

		/**
		 * The meta object literal for the '<em><b>Hilfen Zur Erziehung Nachweisnachricht0711</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711 = eINSTANCE.getDocumentRoot_HilfenZurErziehungNachweisnachricht0711();

		/**
		 * The meta object literal for the '<em><b>Hilfen Zur Erziehung Widerspruch0704</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704 = eINSTANCE.getDocumentRoot_HilfenZurErziehungWiderspruch0704();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErreichbarkeitHZETypeImpl <em>Erreichbarkeit HZE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErreichbarkeitHZETypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getErreichbarkeitHZEType()
		 * @generated
		 */
		EClass ERREICHBARKEIT_HZE_TYPE = eINSTANCE.getErreichbarkeitHZEType();

		/**
		 * The meta object literal for the '<em><b>Zeit Erreichbarkeit HZE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE = eINSTANCE.getErreichbarkeitHZEType_ZeitErreichbarkeitHZE();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl <em>Hilfen Zur Erziehung Anfrage HJV0702 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungAnfrageHJV0702Type()
		 * @generated
		 */
		EClass HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type();

		/**
		 * The meta object literal for the '<em><b>Auswahl Anfrage HJV</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_AuswahlAnfrageHJV();

		/**
		 * The meta object literal for the '<em><b>Anliegensklaerung HJV</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_AnliegensklaerungHJV();

		/**
		 * The meta object literal for the '<em><b>Persoenliche Angaben HJV</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_PersoenlicheAngabenHJV();

		/**
		 * The meta object literal for the '<em><b>Begruendung HJV</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_BegruendungHJV();

		/**
		 * The meta object literal for the '<em><b>Angaben Anderer Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_AngabenAndererElternteil();

		/**
		 * The meta object literal for the '<em><b>Dsgvo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_Dsgvo();

		/**
		 * The meta object literal for the '<em><b>Richtigkeit Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_RichtigkeitAngaben();

		/**
		 * The meta object literal for the '<em><b>Einwilligung Zwischenspeichern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN = eINSTANCE.getHilfenZurErziehungAnfrageHJV0702Type_EinwilligungZwischenspeichern();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl <em>Hilfen Zur Erziehung Antrag0701 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungAntrag0701Type()
		 * @generated
		 */
		EClass HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE = eINSTANCE.getHilfenZurErziehungAntrag0701Type();

		/**
		 * The meta object literal for the '<em><b>Auswahl Der Hilfe HZE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE = eINSTANCE.getHilfenZurErziehungAntrag0701Type_AuswahlDerHilfeHZE();

		/**
		 * The meta object literal for the '<em><b>Anliegensklaerung HZE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE = eINSTANCE.getHilfenZurErziehungAntrag0701Type_AnliegensklaerungHZE();

		/**
		 * The meta object literal for the '<em><b>Pruefcode HZE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE = eINSTANCE.getHilfenZurErziehungAntrag0701Type_PruefcodeHZE();

		/**
		 * The meta object literal for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = eINSTANCE.getHilfenZurErziehungAntrag0701Type_PersoenlicheAngabenZuIhrerPerson();

		/**
		 * The meta object literal for the '<em><b>Anderer Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL = eINSTANCE.getHilfenZurErziehungAntrag0701Type_AndererElternteil();

		/**
		 * The meta object literal for the '<em><b>Angaben Kind HZE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE = eINSTANCE.getHilfenZurErziehungAntrag0701Type_AngabenKindHZE();

		/**
		 * The meta object literal for the '<em><b>Nachweise HZE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE = eINSTANCE.getHilfenZurErziehungAntrag0701Type_NachweiseHZE();

		/**
		 * The meta object literal for the '<em><b>Dsgvo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO = eINSTANCE.getHilfenZurErziehungAntrag0701Type_Dsgvo();

		/**
		 * The meta object literal for the '<em><b>Zusatz Nachricht HZE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE = eINSTANCE.getHilfenZurErziehungAntrag0701Type_ZusatzNachrichtHZE();

		/**
		 * The meta object literal for the '<em><b>Einwilligung Zwischenspeichern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN = eINSTANCE.getHilfenZurErziehungAntrag0701Type_EinwilligungZwischenspeichern();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl <em>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungEingliederungshilfe0703Type()
		 * @generated
		 */
		EClass HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type();

		/**
		 * The meta object literal for the '<em><b>Auswahl Anfrage Eingliederung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_AuswahlAnfrageEingliederung();

		/**
		 * The meta object literal for the '<em><b>Anliegensklaerung Eingliederung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_AnliegensklaerungEingliederung();

		/**
		 * The meta object literal for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_PersoenlicheAngabenZuIhrerPerson();

		/**
		 * The meta object literal for the '<em><b>Angaben Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_AngabenKind();

		/**
		 * The meta object literal for the '<em><b>Begruendung HZE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_BegruendungHZE();

		/**
		 * The meta object literal for the '<em><b>Angaben Elternteile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_AngabenElternteile();

		/**
		 * The meta object literal for the '<em><b>Dsgvo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_Dsgvo();

		/**
		 * The meta object literal for the '<em><b>Richtigkeit Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_RichtigkeitAngaben();

		/**
		 * The meta object literal for the '<em><b>Einwilligung Zwischenspeichern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN = eINSTANCE.getHilfenZurErziehungEingliederungshilfe0703Type_EinwilligungZwischenspeichern();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl <em>Hilfen Zur Erziehung Nachweisnachricht0711 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungNachweisnachricht0711Type()
		 * @generated
		 */
		EClass HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type();

		/**
		 * The meta object literal for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type_PersoenlicheAngabenZuIhrerPerson();

		/**
		 * The meta object literal for the '<em><b>Angaben Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type_AngabenKind();

		/**
		 * The meta object literal for the '<em><b>Jugendamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type_Jugendamt();

		/**
		 * The meta object literal for the '<em><b>Bearbeitungsnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type_Bearbeitungsnummer();

		/**
		 * The meta object literal for the '<em><b>Antragsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type_Antragsdatum();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type_Nachweis();

		/**
		 * The meta object literal for the '<em><b>Zusatznachricht HZE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE = eINSTANCE.getHilfenZurErziehungNachweisnachricht0711Type_ZusatznachrichtHZE();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl <em>Hilfen Zur Erziehung Widerspruch0704 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getHilfenZurErziehungWiderspruch0704Type()
		 * @generated
		 */
		EClass HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type();

		/**
		 * The meta object literal for the '<em><b>Persoenliche Angaben Zu Ihrer Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type_PersoenlicheAngabenZuIhrerPerson();

		/**
		 * The meta object literal for the '<em><b>Aktenzeichen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type_Aktenzeichen();

		/**
		 * The meta object literal for the '<em><b>Bescheiddatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type_Bescheiddatum();

		/**
		 * The meta object literal for the '<em><b>Begruendung Widerspruch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type_BegruendungWiderspruch();

		/**
		 * The meta object literal for the '<em><b>Bestaetigung Widerspruch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type_BestaetigungWiderspruch();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type_Nachweis();

		/**
		 * The meta object literal for the '<em><b>Auswahl Bescheidart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART = eINSTANCE.getHilfenZurErziehungWiderspruch0704Type_AuswahlBescheidart();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseDatenschutzTypeImpl <em>Nachweise Datenschutz Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseDatenschutzTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getNachweiseDatenschutzType()
		 * @generated
		 */
		EClass NACHWEISE_DATENSCHUTZ_TYPE = eINSTANCE.getNachweiseDatenschutzType();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS = eINSTANCE.getNachweiseDatenschutzType_Nachweis();

		/**
		 * The meta object literal for the '<em><b>Zustimmung ET2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2 = eINSTANCE.getNachweiseDatenschutzType_ZustimmungET2();

		/**
		 * The meta object literal for the '<em><b>Richtigkeit Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN = eINSTANCE.getNachweiseDatenschutzType_RichtigkeitAngaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseHZETypeImpl <em>Nachweise HZE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseHZETypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getNachweiseHZEType()
		 * @generated
		 */
		EClass NACHWEISE_HZE_TYPE = eINSTANCE.getNachweiseHZEType();

		/**
		 * The meta object literal for the '<em><b>Sorgerechtsnachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_HZE_TYPE__SORGERECHTSNACHWEIS = eINSTANCE.getNachweiseHZEType_Sorgerechtsnachweis();

		/**
		 * The meta object literal for the '<em><b>Identitaetsnachweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_HZE_TYPE__IDENTITAETSNACHWEIS = eINSTANCE.getNachweiseHZEType_Identitaetsnachweis();

		/**
		 * The meta object literal for the '<em><b>Weitere Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_HZE_TYPE__WEITERE_NACHWEISE = eINSTANCE.getNachweiseHZEType_WeitereNachweise();

		/**
		 * The meta object literal for the '<em><b>Nachweis Meldebescheinigung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_HZE_TYPE__NACHWEIS_MELDEBESCHEINIGUNG = eINSTANCE.getNachweiseHZEType_NachweisMeldebescheinigung();

		/**
		 * The meta object literal for the '<em><b>Anmerkungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_HZE_TYPE__ANMERKUNGEN = eINSTANCE.getNachweiseHZEType_Anmerkungen();

		/**
		 * The meta object literal for the '<em><b>Dsgvo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_HZE_TYPE__DSGVO = eINSTANCE.getNachweiseHZEType_Dsgvo();

		/**
		 * The meta object literal for the '<em><b>Richtigkeit Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_HZE_TYPE__RICHTIGKEIT_ANGABEN = eINSTANCE.getNachweiseHZEType_RichtigkeitAngaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweisTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getNachweisType()
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
		 * The meta object literal for the '<em><b>Nachweis Dokument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEIS_TYPE__NACHWEIS_DOKUMENT = eINSTANCE.getNachweisType_NachweisDokument();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenEingliederungTypeImpl <em>Persoenliche Angaben Eingliederung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenEingliederungTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenEingliederungType()
		 * @generated
		 */
		EClass PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE = eINSTANCE.getPersoenlicheAngabenEingliederungType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__NAMEN = eINSTANCE.getPersoenlicheAngabenEingliederungType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__GEBURTSDATUM = eINSTANCE.getPersoenlicheAngabenEingliederungType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getPersoenlicheAngabenEingliederungType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Anschriftsaenderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG = eINSTANCE.getPersoenlicheAngabenEingliederungType_Anschriftsaenderung();

		/**
		 * The meta object literal for the '<em><b>Weicht Anschrift Ab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__WEICHT_ANSCHRIFT_AB = eINSTANCE.getPersoenlicheAngabenEingliederungType_WeichtAnschriftAb();

		/**
		 * The meta object literal for the '<em><b>Abweichende Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ABWEICHENDE_ANSCHRIFT = eINSTANCE.getPersoenlicheAngabenEingliederungType_AbweichendeAnschrift();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__KONTAKTDATEN = eINSTANCE.getPersoenlicheAngabenEingliederungType_Kontaktdaten();

		/**
		 * The meta object literal for the '<em><b>Seelische Behinderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG = eINSTANCE.getPersoenlicheAngabenEingliederungType_SeelischeBehinderung();

		/**
		 * The meta object literal for the '<em><b>Art Der Behinderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG = eINSTANCE.getPersoenlicheAngabenEingliederungType_ArtDerBehinderung();

		/**
		 * The meta object literal for the '<em><b>Aerztlicher Nachweis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS = eINSTANCE.getPersoenlicheAngabenEingliederungType_AerztlicherNachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl <em>Persoenliche Angaben HJV Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenHJVType()
		 * @generated
		 */
		EClass PERSOENLICHE_ANGABEN_HJV_TYPE = eINSTANCE.getPersoenlicheAngabenHJVType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN = eINSTANCE.getPersoenlicheAngabenHJVType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM = eINSTANCE.getPersoenlicheAngabenHJVType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getPersoenlicheAngabenHJVType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Anschriftsaenderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG = eINSTANCE.getPersoenlicheAngabenHJVType_Anschriftsaenderung();

		/**
		 * The meta object literal for the '<em><b>Weicht Anschrift Ab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB = eINSTANCE.getPersoenlicheAngabenHJVType_WeichtAnschriftAb();

		/**
		 * The meta object literal for the '<em><b>Abweichende Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT = eINSTANCE.getPersoenlicheAngabenHJVType_AbweichendeAnschrift();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN = eINSTANCE.getPersoenlicheAngabenHJVType_Kontaktdaten();

		/**
		 * The meta object literal for the '<em><b>Aufenthaltsort Sonstige</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE = eINSTANCE.getPersoenlicheAngabenHJVType_AufenthaltsortSonstige();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHZETypeImpl <em>Persoenliche Angaben HZE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHZETypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenHZEType()
		 * @generated
		 */
		EClass PERSOENLICHE_ANGABEN_HZE_TYPE = eINSTANCE.getPersoenlicheAngabenHZEType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HZE_TYPE__NAMEN = eINSTANCE.getPersoenlicheAngabenHZEType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_HZE_TYPE__GEBURTSDATUM = eINSTANCE.getPersoenlicheAngabenHZEType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HZE_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getPersoenlicheAngabenHZEType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Weicht Anschrift Ab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSOENLICHE_ANGABEN_HZE_TYPE__WEICHT_ANSCHRIFT_AB = eINSTANCE.getPersoenlicheAngabenHZEType_WeichtAnschriftAb();

		/**
		 * The meta object literal for the '<em><b>Abweichende Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HZE_TYPE__ABWEICHENDE_ANSCHRIFT = eINSTANCE.getPersoenlicheAngabenHZEType_AbweichendeAnschrift();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_HZE_TYPE__KONTAKTDATEN = eINSTANCE.getPersoenlicheAngabenHZEType_Kontaktdaten();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenKontaktformularTypeImpl <em>Persoenliche Angaben Kontaktformular Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenKontaktformularTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersoenlicheAngabenKontaktformularType()
		 * @generated
		 */
		EClass PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE = eINSTANCE.getPersoenlicheAngabenKontaktformularType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__NAMEN = eINSTANCE.getPersoenlicheAngabenKontaktformularType_Namen();

		/**
		 * The meta object literal for the '<em><b>Aktuelle Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT = eINSTANCE.getPersoenlicheAngabenKontaktformularType_AktuelleAnschrift();

		/**
		 * The meta object literal for the '<em><b>Kontaktdaten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSOENLICHE_ANGABEN_KONTAKTFORMULAR_TYPE__KONTAKTDATEN = eINSTANCE.getPersoenlicheAngabenKontaktformularType_Kontaktdaten();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersonIdentifikationTypeImpl <em>Person Identifikation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersonIdentifikationTypeImpl
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getPersonIdentifikationType()
		 * @generated
		 */
		EClass PERSON_IDENTIFIKATION_TYPE = eINSTANCE.getPersonIdentifikationType();

		/**
		 * The meta object literal for the '<em><b>Namen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_IDENTIFIKATION_TYPE__NAMEN = eINSTANCE.getPersonIdentifikationType_Namen();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_IDENTIFIKATION_TYPE__GEBURTSDATUM = eINSTANCE.getPersonIdentifikationType_Geburtsdatum();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort <em>Aufenthaltsort</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAufenthaltsort()
		 * @generated
		 */
		EEnum AUFENTHALTSORT = eINSTANCE.getAufenthaltsort();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE <em>Auswahl Bescheidart HZE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlBescheidartHZE()
		 * @generated
		 */
		EEnum AUSWAHL_BESCHEIDART_HZE = eINSTANCE.getAuswahlBescheidartHZE();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze <em>Auswahlderhilfehze</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlderhilfehze()
		 * @generated
		 */
		EEnum AUSWAHLDERHILFEHZE = eINSTANCE.getAuswahlderhilfehze();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze <em>Verhaeltnisjugendlichhze</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getVerhaeltnisjugendlichhze()
		 * @generated
		 */
		EEnum VERHAELTNISJUGENDLICHHZE = eINSTANCE.getVerhaeltnisjugendlichhze();

		/**
		 * The meta object literal for the '<em>Aufenthaltsort Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Aufenthaltsort
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAufenthaltsortObject()
		 * @generated
		 */
		EDataType AUFENTHALTSORT_OBJECT = eINSTANCE.getAufenthaltsortObject();

		/**
		 * The meta object literal for the '<em>Auswahl Bescheidart HZE Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartHZE
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlBescheidartHZEObject()
		 * @generated
		 */
		EDataType AUSWAHL_BESCHEIDART_HZE_OBJECT = eINSTANCE.getAuswahlBescheidartHZEObject();

		/**
		 * The meta object literal for the '<em>Auswahlderhilfehze Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Auswahlderhilfehze
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getAuswahlderhilfehzeObject()
		 * @generated
		 */
		EDataType AUSWAHLDERHILFEHZE_OBJECT = eINSTANCE.getAuswahlderhilfehzeObject();

		/**
		 * The meta object literal for the '<em>Verhaeltnisjugendlichhze Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.Verhaeltnisjugendlichhze
		 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl#getVerhaeltnisjugendlichhzeObject()
		 * @generated
		 */
		EDataType VERHAELTNISJUGENDLICHHZE_OBJECT = eINSTANCE.getVerhaeltnisjugendlichhzeObject();

	}

} //ErziehungshilfePackage
