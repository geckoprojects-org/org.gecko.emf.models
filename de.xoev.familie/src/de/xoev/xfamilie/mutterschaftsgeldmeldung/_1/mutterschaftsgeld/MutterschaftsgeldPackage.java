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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld;


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
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = MutterschaftsgeldPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/mutterschaftsgeld.ecore", ecoreSourceLocations="/model/mutterschaftsgeld.ecore")
public interface MutterschaftsgeldPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mutterschaftsgeld";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/mutterschaftsgeldmeldung/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mutterschaftsgeld";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MutterschaftsgeldPackage eINSTANCE = de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenEntbindungTypeImpl <em>Angaben Entbindung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenEntbindungTypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAngabenEntbindungType()
	 * @generated
	 */
	int ANGABEN_ENTBINDUNG_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Angaben Mutterschaftsgeld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD = 0;

	/**
	 * The feature id for the '<em><b>Entbindungstag Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE = 1;

	/**
	 * The number of structural features of the '<em>Angaben Entbindung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ENTBINDUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Angaben Entbindung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ENTBINDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenMutterschaftsgeldTypeImpl <em>Angaben Mutterschaftsgeld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenMutterschaftsgeldTypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAngabenMutterschaftsgeldType()
	 * @generated
	 */
	int ANGABEN_MUTTERSCHAFTSGELD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldzahlung Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB = 0;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldzahlung Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS = 1;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldzahlung Hoehe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE = 2;

	/**
	 * The number of structural features of the '<em>Angaben Mutterschaftsgeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_MUTTERSCHAFTSGELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Angaben Mutterschaftsgeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_MUTTERSCHAFTSGELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Krankenversichertennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER = 2;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungTypeImpl <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungTypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAntragstellenderElternteilMutterschaftsgeldmeldungType()
	 * @generated
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__GEBURT = 1;

	/**
	 * The feature id for the '<em><b>Entbindungstag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__ENTBINDUNGSTAG = 2;

	/**
	 * The feature id for the '<em><b>Kennzeichen Mehrlingsgeburt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__KENNZEICHEN_MEHRLINGSGEBURT = 3;

	/**
	 * The feature id for the '<em><b>Krankenversichertennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__KRANKENVERSICHERTENNUMMER = 4;

	/**
	 * The number of structural features of the '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.CodeKennzeichenMutterschaftsgeldTypeImpl <em>Code Kennzeichen Mutterschaftsgeld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.CodeKennzeichenMutterschaftsgeldTypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getCodeKennzeichenMutterschaftsgeldType()
	 * @generated
	 */
	int CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Kennzeichen Mutterschaftsgeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Kennzeichen Mutterschaftsgeld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Mutterschaftsgeldmeldung Anforderung0501</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501 = 3;

	/**
	 * The feature id for the '<em><b>Mutterschaftsgeldmeldung Rueckmeldung0502</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502 = 4;

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
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl <em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getMutterschaftsgeldmeldungAnforderung0501Type()
	 * @generated
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Aktenzeichen Elterngeldstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Einwilligung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stornierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl <em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getMutterschaftsgeldmeldungRueckmeldung0502Type()
	 * @generated
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Aktenzeichen Elterngeldstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angaben Entbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stornierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kennzeichen Mutterschaftsgeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungTypeImpl <em>Stornierung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungTypeImpl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getStornierungType()
	 * @generated
	 */
	int STORNIERUNG_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Stornokennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE__STORNOKENNZEICHEN = 0;

	/**
	 * The feature id for the '<em><b>Datensatz ID Ursprungsmeldung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG = 1;

	/**
	 * The number of structural features of the '<em>Stornierung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stornierung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungType1Impl <em>Stornierung Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungType1Impl
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getStornierungType1()
	 * @generated
	 */
	int STORNIERUNG_TYPE1 = 9;

	/**
	 * The feature id for the '<em><b>Stornokennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE1__STORNOKENNZEICHEN = 0;

	/**
	 * The feature id for the '<em><b>Datensatz ID Ursprungsmeldung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE1__DATENSATZ_ID_URSPRUNGSMELDUNG = 1;

	/**
	 * The number of structural features of the '<em>Stornierung Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stornierung Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORNIERUNG_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld <em>Kennzeichenmutterschaftsgeld</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getKennzeichenmutterschaftsgeld()
	 * @generated
	 */
	int KENNZEICHENMUTTERSCHAFTSGELD = 10;

	/**
	 * The meta object id for the '<em>Kennzeichenmutterschaftsgeld Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getKennzeichenmutterschaftsgeldObject()
	 * @generated
	 */
	int KENNZEICHENMUTTERSCHAFTSGELD_OBJECT = 11;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType <em>Angaben Entbindung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Entbindung Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType
	 * @generated
	 */
	EClass getAngabenEntbindungType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType#getAngabenMutterschaftsgeld <em>Angaben Mutterschaftsgeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Angaben Mutterschaftsgeld</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType#getAngabenMutterschaftsgeld()
	 * @see #getAngabenEntbindungType()
	 * @generated
	 */
	EReference getAngabenEntbindungType_AngabenMutterschaftsgeld();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType#getEntbindungstagKrankenkasse <em>Entbindungstag Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entbindungstag Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType#getEntbindungstagKrankenkasse()
	 * @see #getAngabenEntbindungType()
	 * @generated
	 */
	EAttribute getAngabenEntbindungType_EntbindungstagKrankenkasse();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType <em>Angaben Mutterschaftsgeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Mutterschaftsgeld Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType
	 * @generated
	 */
	EClass getAngabenMutterschaftsgeldType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungAb <em>Mutterschaftsgeldzahlung Ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeldzahlung Ab</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungAb()
	 * @see #getAngabenMutterschaftsgeldType()
	 * @generated
	 */
	EAttribute getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungAb();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungBis <em>Mutterschaftsgeldzahlung Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeldzahlung Bis</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungBis()
	 * @see #getAngabenMutterschaftsgeldType()
	 * @generated
	 */
	EAttribute getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungBis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungHoehe <em>Mutterschaftsgeldzahlung Hoehe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutterschaftsgeldzahlung Hoehe</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType#getMutterschaftsgeldzahlungHoehe()
	 * @see #getAngabenMutterschaftsgeldType()
	 * @generated
	 */
	EAttribute getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungHoehe();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType
	 * @generated
	 */
	EClass getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType#getName()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType#getGeburt()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType#getKrankenversichertennummer <em>Krankenversichertennummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Krankenversichertennummer</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType#getKrankenversichertennummer()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Krankenversichertennummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType
	 * @generated
	 */
	EClass getAntragstellenderElternteilMutterschaftsgeldmeldungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getName()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilMutterschaftsgeldmeldungType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getGeburt()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungType()
	 * @generated
	 */
	EReference getAntragstellenderElternteilMutterschaftsgeldmeldungType_Geburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getEntbindungstag <em>Entbindungstag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entbindungstag</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getEntbindungstag()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungType_Entbindungstag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#isKennzeichenMehrlingsgeburt <em>Kennzeichen Mehrlingsgeburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennzeichen Mehrlingsgeburt</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#isKennzeichenMehrlingsgeburt()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungType_KennzeichenMehrlingsgeburt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getKrankenversichertennummer <em>Krankenversichertennummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Krankenversichertennummer</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getKrankenversichertennummer()
	 * @see #getAntragstellenderElternteilMutterschaftsgeldmeldungType()
	 * @generated
	 */
	EAttribute getAntragstellenderElternteilMutterschaftsgeldmeldungType_Krankenversichertennummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.CodeKennzeichenMutterschaftsgeldType <em>Code Kennzeichen Mutterschaftsgeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Kennzeichen Mutterschaftsgeld Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.CodeKennzeichenMutterschaftsgeldType
	 * @generated
	 */
	EClass getCodeKennzeichenMutterschaftsgeldType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungAnforderung0501 <em>Mutterschaftsgeldmeldung Anforderung0501</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mutterschaftsgeldmeldung Anforderung0501</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungAnforderung0501()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MutterschaftsgeldmeldungAnforderung0501();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungRueckmeldung0502 <em>Mutterschaftsgeldmeldung Rueckmeldung0502</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mutterschaftsgeldmeldung Rueckmeldung0502</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungRueckmeldung0502()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MutterschaftsgeldmeldungRueckmeldung0502();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type <em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type
	 * @generated
	 */
	EClass getMutterschaftsgeldmeldungAnforderung0501Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen Elterngeldstelle</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAktenzeichenElterngeldstelle()
	 * @see #getMutterschaftsgeldmeldungAnforderung0501Type()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldmeldungAnforderung0501Type_AktenzeichenElterngeldstelle();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellender Elternteil</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAntragstellenderElternteil()
	 * @see #getMutterschaftsgeldmeldungAnforderung0501Type()
	 * @generated
	 */
	EReference getMutterschaftsgeldmeldungAnforderung0501Type_AntragstellenderElternteil();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#isEinwilligung <em>Einwilligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#isEinwilligung()
	 * @see #getMutterschaftsgeldmeldungAnforderung0501Type()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldmeldungAnforderung0501Type_Einwilligung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getStornierung <em>Stornierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stornierung</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getStornierung()
	 * @see #getMutterschaftsgeldmeldungAnforderung0501Type()
	 * @generated
	 */
	EReference getMutterschaftsgeldmeldungAnforderung0501Type_Stornierung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type <em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type
	 * @generated
	 */
	EClass getMutterschaftsgeldmeldungRueckmeldung0502Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen Elterngeldstelle</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAktenzeichenElterngeldstelle()
	 * @see #getMutterschaftsgeldmeldungRueckmeldung0502Type()
	 * @generated
	 */
	EAttribute getMutterschaftsgeldmeldungRueckmeldung0502Type_AktenzeichenElterngeldstelle();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellender Elternteil</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAntragstellenderElternteil()
	 * @see #getMutterschaftsgeldmeldungRueckmeldung0502Type()
	 * @generated
	 */
	EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_AntragstellenderElternteil();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAngabenEntbindung <em>Angaben Entbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Entbindung</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAngabenEntbindung()
	 * @see #getMutterschaftsgeldmeldungRueckmeldung0502Type()
	 * @generated
	 */
	EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_AngabenEntbindung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getStornierung <em>Stornierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stornierung</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getStornierung()
	 * @see #getMutterschaftsgeldmeldungRueckmeldung0502Type()
	 * @generated
	 */
	EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_Stornierung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getKennzeichenMutterschaftsgeld <em>Kennzeichen Mutterschaftsgeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kennzeichen Mutterschaftsgeld</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getKennzeichenMutterschaftsgeld()
	 * @see #getMutterschaftsgeldmeldungRueckmeldung0502Type()
	 * @generated
	 */
	EReference getMutterschaftsgeldmeldungRueckmeldung0502Type_KennzeichenMutterschaftsgeld();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType <em>Stornierung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stornierung Type</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType
	 * @generated
	 */
	EClass getStornierungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#isStornokennzeichen <em>Stornokennzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stornokennzeichen</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#isStornokennzeichen()
	 * @see #getStornierungType()
	 * @generated
	 */
	EAttribute getStornierungType_Stornokennzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#getDatensatzIDUrsprungsmeldung <em>Datensatz ID Ursprungsmeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datensatz ID Ursprungsmeldung</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType#getDatensatzIDUrsprungsmeldung()
	 * @see #getStornierungType()
	 * @generated
	 */
	EAttribute getStornierungType_DatensatzIDUrsprungsmeldung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1 <em>Stornierung Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stornierung Type1</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1
	 * @generated
	 */
	EClass getStornierungType1();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1#isStornokennzeichen <em>Stornokennzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stornokennzeichen</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1#isStornokennzeichen()
	 * @see #getStornierungType1()
	 * @generated
	 */
	EAttribute getStornierungType1_Stornokennzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1#getDatensatzIDUrsprungsmeldung <em>Datensatz ID Ursprungsmeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datensatz ID Ursprungsmeldung</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1#getDatensatzIDUrsprungsmeldung()
	 * @see #getStornierungType1()
	 * @generated
	 */
	EAttribute getStornierungType1_DatensatzIDUrsprungsmeldung();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld <em>Kennzeichenmutterschaftsgeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kennzeichenmutterschaftsgeld</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld
	 * @generated
	 */
	EEnum getKennzeichenmutterschaftsgeld();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld <em>Kennzeichenmutterschaftsgeld Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kennzeichenmutterschaftsgeld Object</em>'.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld
	 * @model instanceClass="de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld"
	 *        extendedMetaData="name='kennzeichenmutterschaftsgeld:Object' baseType='kennzeichenmutterschaftsgeld'"
	 * @generated
	 */
	EDataType getKennzeichenmutterschaftsgeldObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MutterschaftsgeldFactory getMutterschaftsgeldFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenEntbindungTypeImpl <em>Angaben Entbindung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenEntbindungTypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAngabenEntbindungType()
		 * @generated
		 */
		EClass ANGABEN_ENTBINDUNG_TYPE = eINSTANCE.getAngabenEntbindungType();

		/**
		 * The meta object literal for the '<em><b>Angaben Mutterschaftsgeld</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ENTBINDUNG_TYPE__ANGABEN_MUTTERSCHAFTSGELD = eINSTANCE.getAngabenEntbindungType_AngabenMutterschaftsgeld();

		/**
		 * The meta object literal for the '<em><b>Entbindungstag Krankenkasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ENTBINDUNG_TYPE__ENTBINDUNGSTAG_KRANKENKASSE = eINSTANCE.getAngabenEntbindungType_EntbindungstagKrankenkasse();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenMutterschaftsgeldTypeImpl <em>Angaben Mutterschaftsgeld Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenMutterschaftsgeldTypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAngabenMutterschaftsgeldType()
		 * @generated
		 */
		EClass ANGABEN_MUTTERSCHAFTSGELD_TYPE = eINSTANCE.getAngabenMutterschaftsgeldType();

		/**
		 * The meta object literal for the '<em><b>Mutterschaftsgeldzahlung Ab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB = eINSTANCE.getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungAb();

		/**
		 * The meta object literal for the '<em><b>Mutterschaftsgeldzahlung Bis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS = eINSTANCE.getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungBis();

		/**
		 * The meta object literal for the '<em><b>Mutterschaftsgeldzahlung Hoehe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE = eINSTANCE.getAngabenMutterschaftsgeldType_MutterschaftsgeldzahlungHoehe();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungRueckTypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType()
		 * @generated
		 */
		EClass ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__NAME = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Name();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__GEBURT = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Krankenversichertennummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE__KRANKENVERSICHERTENNUMMER = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungRueckType_Krankenversichertennummer();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungTypeImpl <em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AntragstellenderElternteilMutterschaftsgeldmeldungTypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getAntragstellenderElternteilMutterschaftsgeldmeldungType()
		 * @generated
		 */
		EClass ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__NAME = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungType_Name();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__GEBURT = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Entbindungstag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__ENTBINDUNGSTAG = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungType_Entbindungstag();

		/**
		 * The meta object literal for the '<em><b>Kennzeichen Mehrlingsgeburt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__KENNZEICHEN_MEHRLINGSGEBURT = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungType_KennzeichenMehrlingsgeburt();

		/**
		 * The meta object literal for the '<em><b>Krankenversichertennummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE__KRANKENVERSICHERTENNUMMER = eINSTANCE.getAntragstellenderElternteilMutterschaftsgeldmeldungType_Krankenversichertennummer();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.CodeKennzeichenMutterschaftsgeldTypeImpl <em>Code Kennzeichen Mutterschaftsgeld Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.CodeKennzeichenMutterschaftsgeldTypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getCodeKennzeichenMutterschaftsgeldType()
		 * @generated
		 */
		EClass CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE = eINSTANCE.getCodeKennzeichenMutterschaftsgeldType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Mutterschaftsgeldmeldung Anforderung0501</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501 = eINSTANCE.getDocumentRoot_MutterschaftsgeldmeldungAnforderung0501();

		/**
		 * The meta object literal for the '<em><b>Mutterschaftsgeldmeldung Rueckmeldung0502</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502 = eINSTANCE.getDocumentRoot_MutterschaftsgeldmeldungRueckmeldung0502();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl <em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getMutterschaftsgeldmeldungAnforderung0501Type()
		 * @generated
		 */
		EClass MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE = eINSTANCE.getMutterschaftsgeldmeldungAnforderung0501Type();

		/**
		 * The meta object literal for the '<em><b>Aktenzeichen Elterngeldstelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE = eINSTANCE.getMutterschaftsgeldmeldungAnforderung0501Type_AktenzeichenElterngeldstelle();

		/**
		 * The meta object literal for the '<em><b>Antragstellender Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = eINSTANCE.getMutterschaftsgeldmeldungAnforderung0501Type_AntragstellenderElternteil();

		/**
		 * The meta object literal for the '<em><b>Einwilligung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG = eINSTANCE.getMutterschaftsgeldmeldungAnforderung0501Type_Einwilligung();

		/**
		 * The meta object literal for the '<em><b>Stornierung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG = eINSTANCE.getMutterschaftsgeldmeldungAnforderung0501Type_Stornierung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl <em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getMutterschaftsgeldmeldungRueckmeldung0502Type()
		 * @generated
		 */
		EClass MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE = eINSTANCE.getMutterschaftsgeldmeldungRueckmeldung0502Type();

		/**
		 * The meta object literal for the '<em><b>Aktenzeichen Elterngeldstelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE = eINSTANCE.getMutterschaftsgeldmeldungRueckmeldung0502Type_AktenzeichenElterngeldstelle();

		/**
		 * The meta object literal for the '<em><b>Antragstellender Elternteil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL = eINSTANCE.getMutterschaftsgeldmeldungRueckmeldung0502Type_AntragstellenderElternteil();

		/**
		 * The meta object literal for the '<em><b>Angaben Entbindung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG = eINSTANCE.getMutterschaftsgeldmeldungRueckmeldung0502Type_AngabenEntbindung();

		/**
		 * The meta object literal for the '<em><b>Stornierung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG = eINSTANCE.getMutterschaftsgeldmeldungRueckmeldung0502Type_Stornierung();

		/**
		 * The meta object literal for the '<em><b>Kennzeichen Mutterschaftsgeld</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD = eINSTANCE.getMutterschaftsgeldmeldungRueckmeldung0502Type_KennzeichenMutterschaftsgeld();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungTypeImpl <em>Stornierung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungTypeImpl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getStornierungType()
		 * @generated
		 */
		EClass STORNIERUNG_TYPE = eINSTANCE.getStornierungType();

		/**
		 * The meta object literal for the '<em><b>Stornokennzeichen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORNIERUNG_TYPE__STORNOKENNZEICHEN = eINSTANCE.getStornierungType_Stornokennzeichen();

		/**
		 * The meta object literal for the '<em><b>Datensatz ID Ursprungsmeldung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG = eINSTANCE.getStornierungType_DatensatzIDUrsprungsmeldung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungType1Impl <em>Stornierung Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungType1Impl
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getStornierungType1()
		 * @generated
		 */
		EClass STORNIERUNG_TYPE1 = eINSTANCE.getStornierungType1();

		/**
		 * The meta object literal for the '<em><b>Stornokennzeichen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORNIERUNG_TYPE1__STORNOKENNZEICHEN = eINSTANCE.getStornierungType1_Stornokennzeichen();

		/**
		 * The meta object literal for the '<em><b>Datensatz ID Ursprungsmeldung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORNIERUNG_TYPE1__DATENSATZ_ID_URSPRUNGSMELDUNG = eINSTANCE.getStornierungType1_DatensatzIDUrsprungsmeldung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld <em>Kennzeichenmutterschaftsgeld</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getKennzeichenmutterschaftsgeld()
		 * @generated
		 */
		EEnum KENNZEICHENMUTTERSCHAFTSGELD = eINSTANCE.getKennzeichenmutterschaftsgeld();

		/**
		 * The meta object literal for the '<em>Kennzeichenmutterschaftsgeld Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.Kennzeichenmutterschaftsgeld
		 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl#getKennzeichenmutterschaftsgeldObject()
		 * @generated
		 */
		EDataType KENNZEICHENMUTTERSCHAFTSGELD_OBJECT = eINSTANCE.getKennzeichenmutterschaftsgeldObject();

	}

} //MutterschaftsgeldPackage
