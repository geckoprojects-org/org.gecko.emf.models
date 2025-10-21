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
package de.xoev.xfamilie.geburt._1.geburt;


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
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = GeburtPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/geburt.ecore", ecoreSourceLocations="/model/geburt.ecore")
public interface GeburtPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geburt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/geburt/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geburt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeburtPackage eINSTANCE = de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl <em>Angaben Gesetzlicher Vertreter Elternteil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenGesetzlicherVertreterElternteilType()
	 * @generated
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Anschrift Ausland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND = 3;

	/**
	 * The feature id for the '<em><b>Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT = 4;

	/**
	 * The number of structural features of the '<em>Angaben Gesetzlicher Vertreter Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Angaben Gesetzlicher Vertreter Elternteil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil1TypeImpl <em>Angaben Zum Elternteil1 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil1TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenZumElternteil1Type()
	 * @generated
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name Elternteil1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__NAME_ELTERNTEIL1 = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__STAATSANGEHOERIGKEIT = 2;

	/**
	 * The feature id for the '<em><b>Dolmetscher Benoetigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__DOLMETSCHER_BENOETIGT = 3;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT = 4;

	/**
	 * The feature id for the '<em><b>Anschrift Ausland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT_AUSLAND = 5;

	/**
	 * The feature id for the '<em><b>Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__KONTAKT = 6;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__FAMILIENSTAND = 7;

	/**
	 * The feature id for the '<em><b>Anschrift Postalisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT_POSTALISCH = 8;

	/**
	 * The number of structural features of the '<em>Angaben Zum Elternteil1 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Angaben Zum Elternteil1 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL1_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl <em>Angaben Zum Elternteil2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenZumElternteil2Type()
	 * @generated
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name Elternteil2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2 = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Dolmetscher Benoetigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT = 2;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT = 3;

	/**
	 * The feature id for the '<em><b>Anschrift Ausland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND = 4;

	/**
	 * The feature id for the '<em><b>Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT = 5;

	/**
	 * The feature id for the '<em><b>Aenderung Anschrift Letzte5 Jahre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE = 6;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND = 7;

	/**
	 * The feature id for the '<em><b>Anschrift Postalisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH = 8;

	/**
	 * The number of structural features of the '<em>Angaben Zum Elternteil2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Angaben Zum Elternteil2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_ELTERNTEIL2_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumKindTypeImpl <em>Angaben Zum Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumKindTypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenZumKindType()
	 * @generated
	 */
	int ANGABEN_ZUM_KIND_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Nachgeburtliche Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND = 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind Vor Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT = 1;

	/**
	 * The number of structural features of the '<em>Angaben Zum Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Angaben Zum Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUM_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.CodeAlleinsorgeEintragungTypeImpl <em>Code Alleinsorge Eintragung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.CodeAlleinsorgeEintragungTypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getCodeAlleinsorgeEintragungType()
	 * @generated
	 */
	int CODE_ALLEINSORGE_EINTRAGUNG_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ALLEINSORGE_EINTRAGUNG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ALLEINSORGE_EINTRAGUNG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ALLEINSORGE_EINTRAGUNG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ALLEINSORGE_EINTRAGUNG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Alleinsorge Eintragung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ALLEINSORGE_EINTRAGUNG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Alleinsorge Eintragung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ALLEINSORGE_EINTRAGUNG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Sorge Alleinsorge Antrag0801</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801 = 3;

	/**
	 * The feature id for the '<em><b>Sorge Alleinsorge Auskunft0803</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803 = 4;

	/**
	 * The feature id for the '<em><b>Sorge Erklaerung Vorbeitung0802</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802 = 5;

	/**
	 * The feature id for the '<em><b>Sorge Nachweisregister Eintragung0804</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804 = 6;

	/**
	 * The feature id for the '<em><b>Sorge Nachweisregister Korrektur0805</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805 = 7;

	/**
	 * The feature id for the '<em><b>Sorge Nachweisregister Loeschung0806</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806 = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl <em>Eintragung Nachweisregister Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getEintragungNachweisregisterType()
	 * @generated
	 */
	int EINTRAGUNG_NACHWEISREGISTER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Eintragung Vorhanden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN = 0;

	/**
	 * The feature id for the '<em><b>Eintragung Sorgeregister Art</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART = 1;

	/**
	 * The feature id for the '<em><b>Wohnort Jugendamt Mutter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER = 2;

	/**
	 * The feature id for the '<em><b>Registerfuerhrendes Jugendamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT = 3;

	/**
	 * The number of structural features of the '<em>Eintragung Nachweisregister Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAGUNG_NACHWEISREGISTER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Eintragung Nachweisregister Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTRAGUNG_NACHWEISREGISTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl <em>Nachgeburtliche Angaben Zum Kind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name Des Kindes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES = 0;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT = 1;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT = 2;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM = 3;

	/**
	 * The feature id for the '<em><b>Geburtsregister Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER = 4;

	/**
	 * The feature id for the '<em><b>Geburtsstandesamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT = 5;

	/**
	 * The feature id for the '<em><b>Registerfuehrende Stelle ARS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS = 6;

	/**
	 * The number of structural features of the '<em>Nachgeburtliche Angaben Zum Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Nachgeburtliche Angaben Zum Kind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAntrag0801TypeImpl <em>Sorge Alleinsorge Antrag0801 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAntrag0801TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeAlleinsorgeAntrag0801Type()
	 * @generated
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ANGABEN_ZUR_MUTTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ANGABEN_ZUM_KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ZUSATZANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminwuensche</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE__TERMINWUENSCHE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sorge Alleinsorge Antrag0801 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sorge Alleinsorge Antrag0801 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_ANTRAG0801_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAuskunft0803TypeImpl <em>Sorge Alleinsorge Auskunft0803 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAuskunft0803TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeAlleinsorgeAuskunft0803Type()
	 * @generated
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ANGABEN_ZUR_MUTTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ANGABEN_ZUM_KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ZUSATZANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eintragung Nachweisregister</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__EINTRAGUNG_NACHWEISREGISTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sorge Alleinsorge Auskunft0803 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sorge Alleinsorge Auskunft0803 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl <em>Sorge Erklaerung Vorbeitung0802 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeErklaerungVorbeitung0802Type()
	 * @generated
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Angaben Zum Vater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Gesetzlicher Vertreter Vater</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angaben Gesetzlicher Vertreter Mutter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Terminwunsch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sorge Erklaerung Vorbeitung0802 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Sorge Erklaerung Vorbeitung0802 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterEintragung0804TypeImpl <em>Sorge Nachweisregister Eintragung0804 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterEintragung0804TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeNachweisregisterEintragung0804Type()
	 * @generated
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ANGABEN_ZUR_MUTTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ANGABEN_ZUM_KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Eintragung Nachweisregister</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__EINTRAGUNG_NACHWEISREGISTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sorge Nachweisregister Eintragung0804 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sorge Nachweisregister Eintragung0804 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl <em>Sorge Nachweisregister Korrektur0805 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeNachweisregisterKorrektur0805Type()
	 * @generated
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Angaben Zur Mutter Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Eintragung Nachweisregister Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angaben Zur Mutter Neu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind Neu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eintragung Nachweisregister Neu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sorge Nachweisregister Korrektur0805 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Sorge Nachweisregister Korrektur0805 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterLoeschung0806TypeImpl <em>Sorge Nachweisregister Loeschung0806 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterLoeschung0806TypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeNachweisregisterLoeschung0806Type()
	 * @generated
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sorge Nachweisregister Loeschung0806 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sorge Nachweisregister Loeschung0806 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl <em>Zusatzangaben Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getZusatzangabenType()
	 * @generated
	 */
	int ZUSATZANGABEN_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Mutter Ist War Mit Vater Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET = 0;

	/**
	 * The feature id for the '<em><b>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE = 1;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZANGABEN_TYPE__NACHWEISE = 2;

	/**
	 * The feature id for the '<em><b>Mutter Zum Zeitpunkt Der Geburt Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET = 3;

	/**
	 * The feature id for the '<em><b>Gemeinsame Sorgeerklaerung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG = 4;

	/**
	 * The number of structural features of the '<em>Zusatzangaben Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZANGABEN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Zusatzangaben Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZANGABEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung <em>Alleinsorge Eintragung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAlleinsorgeEintragung()
	 * @generated
	 */
	int ALLEINSORGE_EINTRAGUNG = 15;

	/**
	 * The meta object id for the '<em>Alleinsorge Eintragung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung
	 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAlleinsorgeEintragungObject()
	 * @generated
	 */
	int ALLEINSORGE_EINTRAGUNG_OBJECT = 16;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType <em>Angaben Gesetzlicher Vertreter Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Gesetzlicher Vertreter Elternteil Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType
	 * @generated
	 */
	EClass getAngabenGesetzlicherVertreterElternteilType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getName()
	 * @see #getAngabenGesetzlicherVertreterElternteilType()
	 * @generated
	 */
	EReference getAngabenGesetzlicherVertreterElternteilType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getGeburt()
	 * @see #getAngabenGesetzlicherVertreterElternteilType()
	 * @generated
	 */
	EReference getAngabenGesetzlicherVertreterElternteilType_Geburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschrift()
	 * @see #getAngabenGesetzlicherVertreterElternteilType()
	 * @generated
	 */
	EReference getAngabenGesetzlicherVertreterElternteilType_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschriftAusland <em>Anschrift Ausland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Ausland</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschriftAusland()
	 * @see #getAngabenGesetzlicherVertreterElternteilType()
	 * @generated
	 */
	EReference getAngabenGesetzlicherVertreterElternteilType_AnschriftAusland();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getKontakt <em>Kontakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontakt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getKontakt()
	 * @see #getAngabenGesetzlicherVertreterElternteilType()
	 * @generated
	 */
	EReference getAngabenGesetzlicherVertreterElternteilType_Kontakt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type <em>Angaben Zum Elternteil1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zum Elternteil1 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type
	 * @generated
	 */
	EClass getAngabenZumElternteil1Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getNameElternteil1 <em>Name Elternteil1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Elternteil1</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getNameElternteil1()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_NameElternteil1();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getGeburt()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_Geburt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getStaatsangehoerigkeit()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#isDolmetscherBenoetigt <em>Dolmetscher Benoetigt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dolmetscher Benoetigt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#isDolmetscherBenoetigt()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EAttribute getAngabenZumElternteil1Type_DolmetscherBenoetigt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschrift()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftAusland <em>Anschrift Ausland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Ausland</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftAusland()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_AnschriftAusland();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getKontakt <em>Kontakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontakt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getKontakt()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_Kontakt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getFamilienstand()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_Familienstand();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftPostalisch <em>Anschrift Postalisch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Postalisch</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftPostalisch()
	 * @see #getAngabenZumElternteil1Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil1Type_AnschriftPostalisch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type <em>Angaben Zum Elternteil2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zum Elternteil2 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type
	 * @generated
	 */
	EClass getAngabenZumElternteil2Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getNameElternteil2 <em>Name Elternteil2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Elternteil2</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getNameElternteil2()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil2Type_NameElternteil2();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getGeburt()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil2Type_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#isDolmetscherBenoetigt <em>Dolmetscher Benoetigt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dolmetscher Benoetigt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#isDolmetscherBenoetigt()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EAttribute getAngabenZumElternteil2Type_DolmetscherBenoetigt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getAnschrift()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil2Type_Anschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getAnschriftAusland <em>Anschrift Ausland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Ausland</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getAnschriftAusland()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil2Type_AnschriftAusland();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getKontakt <em>Kontakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontakt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getKontakt()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil2Type_Kontakt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#isAenderungAnschriftLetzte5Jahre <em>Aenderung Anschrift Letzte5 Jahre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aenderung Anschrift Letzte5 Jahre</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#isAenderungAnschriftLetzte5Jahre()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EAttribute getAngabenZumElternteil2Type_AenderungAnschriftLetzte5Jahre();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getFamilienstand()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil2Type_Familienstand();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getAnschriftPostalisch <em>Anschrift Postalisch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Postalisch</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type#getAnschriftPostalisch()
	 * @see #getAngabenZumElternteil2Type()
	 * @generated
	 */
	EReference getAngabenZumElternteil2Type_AnschriftPostalisch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType <em>Angaben Zum Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zum Kind Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType
	 * @generated
	 */
	EClass getAngabenZumKindType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getNachgeburtlicheAngabenZumKind <em>Nachgeburtliche Angaben Zum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachgeburtliche Angaben Zum Kind</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getNachgeburtlicheAngabenZumKind()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EReference getAngabenZumKindType_NachgeburtlicheAngabenZumKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getAngabenZumKindVorGeburt <em>Angaben Zum Kind Vor Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind Vor Geburt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType#getAngabenZumKindVorGeburt()
	 * @see #getAngabenZumKindType()
	 * @generated
	 */
	EReference getAngabenZumKindType_AngabenZumKindVorGeburt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.CodeAlleinsorgeEintragungType <em>Code Alleinsorge Eintragung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Alleinsorge Eintragung Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.CodeAlleinsorgeEintragungType
	 * @generated
	 */
	EClass getCodeAlleinsorgeEintragungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAntrag0801 <em>Sorge Alleinsorge Antrag0801</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorge Alleinsorge Antrag0801</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAntrag0801()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SorgeAlleinsorgeAntrag0801();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAuskunft0803 <em>Sorge Alleinsorge Auskunft0803</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorge Alleinsorge Auskunft0803</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAuskunft0803()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SorgeAlleinsorgeAuskunft0803();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeErklaerungVorbeitung0802 <em>Sorge Erklaerung Vorbeitung0802</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorge Erklaerung Vorbeitung0802</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeErklaerungVorbeitung0802()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SorgeErklaerungVorbeitung0802();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterEintragung0804 <em>Sorge Nachweisregister Eintragung0804</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorge Nachweisregister Eintragung0804</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterEintragung0804()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SorgeNachweisregisterEintragung0804();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterKorrektur0805 <em>Sorge Nachweisregister Korrektur0805</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorge Nachweisregister Korrektur0805</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterKorrektur0805()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SorgeNachweisregisterKorrektur0805();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterLoeschung0806 <em>Sorge Nachweisregister Loeschung0806</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorge Nachweisregister Loeschung0806</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterLoeschung0806()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SorgeNachweisregisterLoeschung0806();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType <em>Eintragung Nachweisregister Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eintragung Nachweisregister Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType
	 * @generated
	 */
	EClass getEintragungNachweisregisterType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#isEintragungVorhanden <em>Eintragung Vorhanden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eintragung Vorhanden</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#isEintragungVorhanden()
	 * @see #getEintragungNachweisregisterType()
	 * @generated
	 */
	EAttribute getEintragungNachweisregisterType_EintragungVorhanden();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getEintragungSorgeregisterArt <em>Eintragung Sorgeregister Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eintragung Sorgeregister Art</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getEintragungSorgeregisterArt()
	 * @see #getEintragungNachweisregisterType()
	 * @generated
	 */
	EReference getEintragungNachweisregisterType_EintragungSorgeregisterArt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getWohnortJugendamtMutter <em>Wohnort Jugendamt Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort Jugendamt Mutter</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getWohnortJugendamtMutter()
	 * @see #getEintragungNachweisregisterType()
	 * @generated
	 */
	EAttribute getEintragungNachweisregisterType_WohnortJugendamtMutter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getRegisterfuerhrendesJugendamt <em>Registerfuerhrendes Jugendamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registerfuerhrendes Jugendamt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType#getRegisterfuerhrendesJugendamt()
	 * @see #getEintragungNachweisregisterType()
	 * @generated
	 */
	EAttribute getEintragungNachweisregisterType_RegisterfuerhrendesJugendamt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType <em>Nachgeburtliche Angaben Zum Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachgeburtliche Angaben Zum Kind Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType
	 * @generated
	 */
	EClass getNachgeburtlicheAngabenZumKindType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getNameDesKindes <em>Name Des Kindes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Des Kindes</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getNameDesKindes()
	 * @see #getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	EReference getNachgeburtlicheAngabenZumKindType_NameDesKindes();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsort()
	 * @see #getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	EAttribute getNachgeburtlicheAngabenZumKindType_Geburtsort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsortStaat <em>Geburtsort Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsort Staat</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsortStaat()
	 * @see #getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	EReference getNachgeburtlicheAngabenZumKindType_GeburtsortStaat();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsdatum()
	 * @see #getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	EReference getNachgeburtlicheAngabenZumKindType_Geburtsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsregisterNummer <em>Geburtsregister Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsregister Nummer</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsregisterNummer()
	 * @see #getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	EAttribute getNachgeburtlicheAngabenZumKindType_GeburtsregisterNummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsstandesamt <em>Geburtsstandesamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsstandesamt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsstandesamt()
	 * @see #getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	EAttribute getNachgeburtlicheAngabenZumKindType_Geburtsstandesamt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getRegisterfuehrendeStelleARS <em>Registerfuehrende Stelle ARS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registerfuehrende Stelle ARS</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getRegisterfuehrendeStelleARS()
	 * @see #getNachgeburtlicheAngabenZumKindType()
	 * @generated
	 */
	EReference getNachgeburtlicheAngabenZumKindType_RegisterfuehrendeStelleARS();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type <em>Sorge Alleinsorge Antrag0801 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorge Alleinsorge Antrag0801 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type
	 * @generated
	 */
	EClass getSorgeAlleinsorgeAntrag0801Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Mutter</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZurMutter()
	 * @see #getSorgeAlleinsorgeAntrag0801Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAntrag0801Type_AngabenZurMutter();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZumKind <em>Angaben Zum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getAngabenZumKind()
	 * @see #getSorgeAlleinsorgeAntrag0801Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAntrag0801Type_AngabenZumKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getZusatzangaben <em>Zusatzangaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zusatzangaben</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getZusatzangaben()
	 * @see #getSorgeAlleinsorgeAntrag0801Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAntrag0801Type_Zusatzangaben();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getTerminwuensche <em>Terminwuensche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminwuensche</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type#getTerminwuensche()
	 * @see #getSorgeAlleinsorgeAntrag0801Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAntrag0801Type_Terminwuensche();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type <em>Sorge Alleinsorge Auskunft0803 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorge Alleinsorge Auskunft0803 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type
	 * @generated
	 */
	EClass getSorgeAlleinsorgeAuskunft0803Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Mutter</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZurMutter()
	 * @see #getSorgeAlleinsorgeAuskunft0803Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAuskunft0803Type_AngabenZurMutter();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZumKind <em>Angaben Zum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getAngabenZumKind()
	 * @see #getSorgeAlleinsorgeAuskunft0803Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAuskunft0803Type_AngabenZumKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getZusatzangaben <em>Zusatzangaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zusatzangaben</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getZusatzangaben()
	 * @see #getSorgeAlleinsorgeAuskunft0803Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAuskunft0803Type_Zusatzangaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getEintragungNachweisregister <em>Eintragung Nachweisregister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eintragung Nachweisregister</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type#getEintragungNachweisregister()
	 * @see #getSorgeAlleinsorgeAuskunft0803Type()
	 * @generated
	 */
	EReference getSorgeAlleinsorgeAuskunft0803Type_EintragungNachweisregister();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type <em>Sorge Erklaerung Vorbeitung0802 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorge Erklaerung Vorbeitung0802 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type
	 * @generated
	 */
	EClass getSorgeErklaerungVorbeitung0802Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumVater <em>Angaben Zum Vater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Vater</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumVater()
	 * @see #getSorgeErklaerungVorbeitung0802Type()
	 * @generated
	 */
	EReference getSorgeErklaerungVorbeitung0802Type_AngabenZumVater();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenGesetzlicherVertreterVater <em>Angaben Gesetzlicher Vertreter Vater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Gesetzlicher Vertreter Vater</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenGesetzlicherVertreterVater()
	 * @see #getSorgeErklaerungVorbeitung0802Type()
	 * @generated
	 */
	EReference getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterVater();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Mutter</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZurMutter()
	 * @see #getSorgeErklaerungVorbeitung0802Type()
	 * @generated
	 */
	EReference getSorgeErklaerungVorbeitung0802Type_AngabenZurMutter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenGesetzlicherVertreterMutter <em>Angaben Gesetzlicher Vertreter Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Gesetzlicher Vertreter Mutter</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenGesetzlicherVertreterMutter()
	 * @see #getSorgeErklaerungVorbeitung0802Type()
	 * @generated
	 */
	EReference getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterMutter();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumKind <em>Angaben Zum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumKind()
	 * @see #getSorgeErklaerungVorbeitung0802Type()
	 * @generated
	 */
	EReference getSorgeErklaerungVorbeitung0802Type_AngabenZumKind();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getTerminwunsch <em>Terminwunsch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminwunsch</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getTerminwunsch()
	 * @see #getSorgeErklaerungVorbeitung0802Type()
	 * @generated
	 */
	EReference getSorgeErklaerungVorbeitung0802Type_Terminwunsch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type <em>Sorge Nachweisregister Eintragung0804 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorge Nachweisregister Eintragung0804 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type
	 * @generated
	 */
	EClass getSorgeNachweisregisterEintragung0804Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Mutter</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZurMutter()
	 * @see #getSorgeNachweisregisterEintragung0804Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterEintragung0804Type_AngabenZurMutter();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZumKind <em>Angaben Zum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getAngabenZumKind()
	 * @see #getSorgeNachweisregisterEintragung0804Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterEintragung0804Type_AngabenZumKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getEintragungNachweisregister <em>Eintragung Nachweisregister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eintragung Nachweisregister</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type#getEintragungNachweisregister()
	 * @see #getSorgeNachweisregisterEintragung0804Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterEintragung0804Type_EintragungNachweisregister();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type <em>Sorge Nachweisregister Korrektur0805 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorge Nachweisregister Korrektur0805 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type
	 * @generated
	 */
	EClass getSorgeNachweisregisterKorrektur0805Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterAlt <em>Angaben Zur Mutter Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Mutter Alt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterAlt()
	 * @see #getSorgeNachweisregisterKorrektur0805Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterAlt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindAlt <em>Angaben Zum Kind Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind Alt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindAlt()
	 * @see #getSorgeNachweisregisterKorrektur0805Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindAlt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterAlt <em>Eintragung Nachweisregister Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eintragung Nachweisregister Alt</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterAlt()
	 * @see #getSorgeNachweisregisterKorrektur0805Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterAlt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterNeu <em>Angaben Zur Mutter Neu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Mutter Neu</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZurMutterNeu()
	 * @see #getSorgeNachweisregisterKorrektur0805Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterNeu();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindNeu <em>Angaben Zum Kind Neu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind Neu</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getAngabenZumKindNeu()
	 * @see #getSorgeNachweisregisterKorrektur0805Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindNeu();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterNeu <em>Eintragung Nachweisregister Neu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eintragung Nachweisregister Neu</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type#getEintragungNachweisregisterNeu()
	 * @see #getSorgeNachweisregisterKorrektur0805Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterNeu();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type <em>Sorge Nachweisregister Loeschung0806 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorge Nachweisregister Loeschung0806 Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type
	 * @generated
	 */
	EClass getSorgeNachweisregisterLoeschung0806Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Mutter</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type#getAngabenZurMutter()
	 * @see #getSorgeNachweisregisterLoeschung0806Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterLoeschung0806Type_AngabenZurMutter();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type#getAngabenZumKind <em>Angaben Zum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zum Kind</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type#getAngabenZumKind()
	 * @see #getSorgeNachweisregisterLoeschung0806Type()
	 * @generated
	 */
	EReference getSorgeNachweisregisterLoeschung0806Type_AngabenZumKind();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType <em>Zusatzangaben Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zusatzangaben Type</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType
	 * @generated
	 */
	EClass getZusatzangabenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterIstWarMitVaterVerheiratet <em>Mutter Ist War Mit Vater Verheiratet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutter Ist War Mit Vater Verheiratet</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterIstWarMitVaterVerheiratet()
	 * @see #getZusatzangabenType()
	 * @generated
	 */
	EAttribute getZusatzangabenType_MutterIstWarMitVaterVerheiratet();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @see #getZusatzangabenType()
	 * @generated
	 */
	EAttribute getZusatzangabenType_GerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#getNachweise()
	 * @see #getZusatzangabenType()
	 * @generated
	 */
	EReference getZusatzangabenType_Nachweise();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterZumZeitpunktDerGeburtVerheiratet <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isMutterZumZeitpunktDerGeburtVerheiratet()
	 * @see #getZusatzangabenType()
	 * @generated
	 */
	EAttribute getZusatzangabenType_MutterZumZeitpunktDerGeburtVerheiratet();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGemeinsameSorgeerklaerung <em>Gemeinsame Sorgeerklaerung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gemeinsame Sorgeerklaerung</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType#isGemeinsameSorgeerklaerung()
	 * @see #getZusatzangabenType()
	 * @generated
	 */
	EAttribute getZusatzangabenType_GemeinsameSorgeerklaerung();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung <em>Alleinsorge Eintragung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alleinsorge Eintragung</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung
	 * @generated
	 */
	EEnum getAlleinsorgeEintragung();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung <em>Alleinsorge Eintragung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alleinsorge Eintragung Object</em>'.
	 * @see de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung
	 * @model instanceClass="de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung"
	 *        extendedMetaData="name='alleinsorgeEintragung:Object' baseType='alleinsorgeEintragung'"
	 * @generated
	 */
	EDataType getAlleinsorgeEintragungObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeburtFactory getGeburtFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl <em>Angaben Gesetzlicher Vertreter Elternteil Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenGesetzlicherVertreterElternteilTypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenGesetzlicherVertreterElternteilType()
		 * @generated
		 */
		EClass ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE = eINSTANCE.getAngabenGesetzlicherVertreterElternteilType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__NAME = eINSTANCE.getAngabenGesetzlicherVertreterElternteilType_Name();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__GEBURT = eINSTANCE.getAngabenGesetzlicherVertreterElternteilType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT = eINSTANCE.getAngabenGesetzlicherVertreterElternteilType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Anschrift Ausland</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__ANSCHRIFT_AUSLAND = eINSTANCE.getAngabenGesetzlicherVertreterElternteilType_AnschriftAusland();

		/**
		 * The meta object literal for the '<em><b>Kontakt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE__KONTAKT = eINSTANCE.getAngabenGesetzlicherVertreterElternteilType_Kontakt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil1TypeImpl <em>Angaben Zum Elternteil1 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil1TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenZumElternteil1Type()
		 * @generated
		 */
		EClass ANGABEN_ZUM_ELTERNTEIL1_TYPE = eINSTANCE.getAngabenZumElternteil1Type();

		/**
		 * The meta object literal for the '<em><b>Name Elternteil1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__NAME_ELTERNTEIL1 = eINSTANCE.getAngabenZumElternteil1Type_NameElternteil1();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__GEBURT = eINSTANCE.getAngabenZumElternteil1Type_Geburt();

		/**
		 * The meta object literal for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__STAATSANGEHOERIGKEIT = eINSTANCE.getAngabenZumElternteil1Type_Staatsangehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Dolmetscher Benoetigt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_ELTERNTEIL1_TYPE__DOLMETSCHER_BENOETIGT = eINSTANCE.getAngabenZumElternteil1Type_DolmetscherBenoetigt();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT = eINSTANCE.getAngabenZumElternteil1Type_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Anschrift Ausland</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT_AUSLAND = eINSTANCE.getAngabenZumElternteil1Type_AnschriftAusland();

		/**
		 * The meta object literal for the '<em><b>Kontakt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__KONTAKT = eINSTANCE.getAngabenZumElternteil1Type_Kontakt();

		/**
		 * The meta object literal for the '<em><b>Familienstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__FAMILIENSTAND = eINSTANCE.getAngabenZumElternteil1Type_Familienstand();

		/**
		 * The meta object literal for the '<em><b>Anschrift Postalisch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL1_TYPE__ANSCHRIFT_POSTALISCH = eINSTANCE.getAngabenZumElternteil1Type_AnschriftPostalisch();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl <em>Angaben Zum Elternteil2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenZumElternteil2Type()
		 * @generated
		 */
		EClass ANGABEN_ZUM_ELTERNTEIL2_TYPE = eINSTANCE.getAngabenZumElternteil2Type();

		/**
		 * The meta object literal for the '<em><b>Name Elternteil2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2 = eINSTANCE.getAngabenZumElternteil2Type_NameElternteil2();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT = eINSTANCE.getAngabenZumElternteil2Type_Geburt();

		/**
		 * The meta object literal for the '<em><b>Dolmetscher Benoetigt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT = eINSTANCE.getAngabenZumElternteil2Type_DolmetscherBenoetigt();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT = eINSTANCE.getAngabenZumElternteil2Type_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Anschrift Ausland</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND = eINSTANCE.getAngabenZumElternteil2Type_AnschriftAusland();

		/**
		 * The meta object literal for the '<em><b>Kontakt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT = eINSTANCE.getAngabenZumElternteil2Type_Kontakt();

		/**
		 * The meta object literal for the '<em><b>Aenderung Anschrift Letzte5 Jahre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE = eINSTANCE.getAngabenZumElternteil2Type_AenderungAnschriftLetzte5Jahre();

		/**
		 * The meta object literal for the '<em><b>Familienstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND = eINSTANCE.getAngabenZumElternteil2Type_Familienstand();

		/**
		 * The meta object literal for the '<em><b>Anschrift Postalisch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH = eINSTANCE.getAngabenZumElternteil2Type_AnschriftPostalisch();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumKindTypeImpl <em>Angaben Zum Kind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumKindTypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAngabenZumKindType()
		 * @generated
		 */
		EClass ANGABEN_ZUM_KIND_TYPE = eINSTANCE.getAngabenZumKindType();

		/**
		 * The meta object literal for the '<em><b>Nachgeburtliche Angaben Zum Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_TYPE__NACHGEBURTLICHE_ANGABEN_ZUM_KIND = eINSTANCE.getAngabenZumKindType_NachgeburtlicheAngabenZumKind();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind Vor Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUM_KIND_TYPE__ANGABEN_ZUM_KIND_VOR_GEBURT = eINSTANCE.getAngabenZumKindType_AngabenZumKindVorGeburt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.CodeAlleinsorgeEintragungTypeImpl <em>Code Alleinsorge Eintragung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.CodeAlleinsorgeEintragungTypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getCodeAlleinsorgeEintragungType()
		 * @generated
		 */
		EClass CODE_ALLEINSORGE_EINTRAGUNG_TYPE = eINSTANCE.getCodeAlleinsorgeEintragungType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Sorge Alleinsorge Antrag0801</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801 = eINSTANCE.getDocumentRoot_SorgeAlleinsorgeAntrag0801();

		/**
		 * The meta object literal for the '<em><b>Sorge Alleinsorge Auskunft0803</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803 = eINSTANCE.getDocumentRoot_SorgeAlleinsorgeAuskunft0803();

		/**
		 * The meta object literal for the '<em><b>Sorge Erklaerung Vorbeitung0802</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802 = eINSTANCE.getDocumentRoot_SorgeErklaerungVorbeitung0802();

		/**
		 * The meta object literal for the '<em><b>Sorge Nachweisregister Eintragung0804</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804 = eINSTANCE.getDocumentRoot_SorgeNachweisregisterEintragung0804();

		/**
		 * The meta object literal for the '<em><b>Sorge Nachweisregister Korrektur0805</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805 = eINSTANCE.getDocumentRoot_SorgeNachweisregisterKorrektur0805();

		/**
		 * The meta object literal for the '<em><b>Sorge Nachweisregister Loeschung0806</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806 = eINSTANCE.getDocumentRoot_SorgeNachweisregisterLoeschung0806();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl <em>Eintragung Nachweisregister Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getEintragungNachweisregisterType()
		 * @generated
		 */
		EClass EINTRAGUNG_NACHWEISREGISTER_TYPE = eINSTANCE.getEintragungNachweisregisterType();

		/**
		 * The meta object literal for the '<em><b>Eintragung Vorhanden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN = eINSTANCE.getEintragungNachweisregisterType_EintragungVorhanden();

		/**
		 * The meta object literal for the '<em><b>Eintragung Sorgeregister Art</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART = eINSTANCE.getEintragungNachweisregisterType_EintragungSorgeregisterArt();

		/**
		 * The meta object literal for the '<em><b>Wohnort Jugendamt Mutter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER = eINSTANCE.getEintragungNachweisregisterType_WohnortJugendamtMutter();

		/**
		 * The meta object literal for the '<em><b>Registerfuerhrendes Jugendamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT = eINSTANCE.getEintragungNachweisregisterType_RegisterfuerhrendesJugendamt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl <em>Nachgeburtliche Angaben Zum Kind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.NachgeburtlicheAngabenZumKindTypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getNachgeburtlicheAngabenZumKindType()
		 * @generated
		 */
		EClass NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE = eINSTANCE.getNachgeburtlicheAngabenZumKindType();

		/**
		 * The meta object literal for the '<em><b>Name Des Kindes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES = eINSTANCE.getNachgeburtlicheAngabenZumKindType_NameDesKindes();

		/**
		 * The meta object literal for the '<em><b>Geburtsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT = eINSTANCE.getNachgeburtlicheAngabenZumKindType_Geburtsort();

		/**
		 * The meta object literal for the '<em><b>Geburtsort Staat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSORT_STAAT = eINSTANCE.getNachgeburtlicheAngabenZumKindType_GeburtsortStaat();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSDATUM = eINSTANCE.getNachgeburtlicheAngabenZumKindType_Geburtsdatum();

		/**
		 * The meta object literal for the '<em><b>Geburtsregister Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSREGISTER_NUMMER = eINSTANCE.getNachgeburtlicheAngabenZumKindType_GeburtsregisterNummer();

		/**
		 * The meta object literal for the '<em><b>Geburtsstandesamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__GEBURTSSTANDESAMT = eINSTANCE.getNachgeburtlicheAngabenZumKindType_Geburtsstandesamt();

		/**
		 * The meta object literal for the '<em><b>Registerfuehrende Stelle ARS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE__REGISTERFUEHRENDE_STELLE_ARS = eINSTANCE.getNachgeburtlicheAngabenZumKindType_RegisterfuehrendeStelleARS();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAntrag0801TypeImpl <em>Sorge Alleinsorge Antrag0801 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAntrag0801TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeAlleinsorgeAntrag0801Type()
		 * @generated
		 */
		EClass SORGE_ALLEINSORGE_ANTRAG0801_TYPE = eINSTANCE.getSorgeAlleinsorgeAntrag0801Type();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Mutter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ANGABEN_ZUR_MUTTER = eINSTANCE.getSorgeAlleinsorgeAntrag0801Type_AngabenZurMutter();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ANGABEN_ZUM_KIND = eINSTANCE.getSorgeAlleinsorgeAntrag0801Type_AngabenZumKind();

		/**
		 * The meta object literal for the '<em><b>Zusatzangaben</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_ANTRAG0801_TYPE__ZUSATZANGABEN = eINSTANCE.getSorgeAlleinsorgeAntrag0801Type_Zusatzangaben();

		/**
		 * The meta object literal for the '<em><b>Terminwuensche</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_ANTRAG0801_TYPE__TERMINWUENSCHE = eINSTANCE.getSorgeAlleinsorgeAntrag0801Type_Terminwuensche();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAuskunft0803TypeImpl <em>Sorge Alleinsorge Auskunft0803 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeAlleinsorgeAuskunft0803TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeAlleinsorgeAuskunft0803Type()
		 * @generated
		 */
		EClass SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE = eINSTANCE.getSorgeAlleinsorgeAuskunft0803Type();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Mutter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ANGABEN_ZUR_MUTTER = eINSTANCE.getSorgeAlleinsorgeAuskunft0803Type_AngabenZurMutter();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ANGABEN_ZUM_KIND = eINSTANCE.getSorgeAlleinsorgeAuskunft0803Type_AngabenZumKind();

		/**
		 * The meta object literal for the '<em><b>Zusatzangaben</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__ZUSATZANGABEN = eINSTANCE.getSorgeAlleinsorgeAuskunft0803Type_Zusatzangaben();

		/**
		 * The meta object literal for the '<em><b>Eintragung Nachweisregister</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE__EINTRAGUNG_NACHWEISREGISTER = eINSTANCE.getSorgeAlleinsorgeAuskunft0803Type_EintragungNachweisregister();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl <em>Sorge Erklaerung Vorbeitung0802 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeErklaerungVorbeitung0802Type()
		 * @generated
		 */
		EClass SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE = eINSTANCE.getSorgeErklaerungVorbeitung0802Type();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Vater</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER = eINSTANCE.getSorgeErklaerungVorbeitung0802Type_AngabenZumVater();

		/**
		 * The meta object literal for the '<em><b>Angaben Gesetzlicher Vertreter Vater</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER = eINSTANCE.getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterVater();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Mutter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER = eINSTANCE.getSorgeErklaerungVorbeitung0802Type_AngabenZurMutter();

		/**
		 * The meta object literal for the '<em><b>Angaben Gesetzlicher Vertreter Mutter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER = eINSTANCE.getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterMutter();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND = eINSTANCE.getSorgeErklaerungVorbeitung0802Type_AngabenZumKind();

		/**
		 * The meta object literal for the '<em><b>Terminwunsch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH = eINSTANCE.getSorgeErklaerungVorbeitung0802Type_Terminwunsch();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterEintragung0804TypeImpl <em>Sorge Nachweisregister Eintragung0804 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterEintragung0804TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeNachweisregisterEintragung0804Type()
		 * @generated
		 */
		EClass SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE = eINSTANCE.getSorgeNachweisregisterEintragung0804Type();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Mutter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ANGABEN_ZUR_MUTTER = eINSTANCE.getSorgeNachweisregisterEintragung0804Type_AngabenZurMutter();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__ANGABEN_ZUM_KIND = eINSTANCE.getSorgeNachweisregisterEintragung0804Type_AngabenZumKind();

		/**
		 * The meta object literal for the '<em><b>Eintragung Nachweisregister</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE__EINTRAGUNG_NACHWEISREGISTER = eINSTANCE.getSorgeNachweisregisterEintragung0804Type_EintragungNachweisregister();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl <em>Sorge Nachweisregister Korrektur0805 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeNachweisregisterKorrektur0805Type()
		 * @generated
		 */
		EClass SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE = eINSTANCE.getSorgeNachweisregisterKorrektur0805Type();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Mutter Alt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT = eINSTANCE.getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterAlt();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind Alt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT = eINSTANCE.getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindAlt();

		/**
		 * The meta object literal for the '<em><b>Eintragung Nachweisregister Alt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT = eINSTANCE.getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterAlt();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Mutter Neu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU = eINSTANCE.getSorgeNachweisregisterKorrektur0805Type_AngabenZurMutterNeu();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind Neu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU = eINSTANCE.getSorgeNachweisregisterKorrektur0805Type_AngabenZumKindNeu();

		/**
		 * The meta object literal for the '<em><b>Eintragung Nachweisregister Neu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU = eINSTANCE.getSorgeNachweisregisterKorrektur0805Type_EintragungNachweisregisterNeu();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterLoeschung0806TypeImpl <em>Sorge Nachweisregister Loeschung0806 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterLoeschung0806TypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getSorgeNachweisregisterLoeschung0806Type()
		 * @generated
		 */
		EClass SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE = eINSTANCE.getSorgeNachweisregisterLoeschung0806Type();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Mutter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER = eINSTANCE.getSorgeNachweisregisterLoeschung0806Type_AngabenZurMutter();

		/**
		 * The meta object literal for the '<em><b>Angaben Zum Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND = eINSTANCE.getSorgeNachweisregisterLoeschung0806Type_AngabenZumKind();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl <em>Zusatzangaben Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getZusatzangabenType()
		 * @generated
		 */
		EClass ZUSATZANGABEN_TYPE = eINSTANCE.getZusatzangabenType();

		/**
		 * The meta object literal for the '<em><b>Mutter Ist War Mit Vater Verheiratet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET = eINSTANCE.getZusatzangabenType_MutterIstWarMitVaterVerheiratet();

		/**
		 * The meta object literal for the '<em><b>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE = eINSTANCE.getZusatzangabenType_GerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSATZANGABEN_TYPE__NACHWEISE = eINSTANCE.getZusatzangabenType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Mutter Zum Zeitpunkt Der Geburt Verheiratet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET = eINSTANCE.getZusatzangabenType_MutterZumZeitpunktDerGeburtVerheiratet();

		/**
		 * The meta object literal for the '<em><b>Gemeinsame Sorgeerklaerung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG = eINSTANCE.getZusatzangabenType_GemeinsameSorgeerklaerung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung <em>Alleinsorge Eintragung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAlleinsorgeEintragung()
		 * @generated
		 */
		EEnum ALLEINSORGE_EINTRAGUNG = eINSTANCE.getAlleinsorgeEintragung();

		/**
		 * The meta object literal for the '<em>Alleinsorge Eintragung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.geburt._1.geburt.AlleinsorgeEintragung
		 * @see de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl#getAlleinsorgeEintragungObject()
		 * @generated
		 */
		EDataType ALLEINSORGE_EINTRAGUNG_OBJECT = eINSTANCE.getAlleinsorgeEintragungObject();

	}

} //GeburtPackage
