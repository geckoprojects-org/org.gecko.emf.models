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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;


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
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = AllgemeineNachrichtenPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/allgemeinenachrichten.ecore", ecoreSourceLocations="/model/allgemeinenachrichten.ecore")
public interface AllgemeineNachrichtenPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allgemeinenachrichten";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/allgemeinenachrichten/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "allgemeinenachrichten";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllgemeineNachrichtenPackage eINSTANCE = de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenQuittung0011TypeImpl <em>Allgemeinenachrichten Quittung0011 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenQuittung0011TypeImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getAllgemeinenachrichtenQuittung0011Type()
	 * @generated
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allgemeinenachrichten Quittung0011 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Allgemeinenachrichten Quittung0011 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl <em>Allgemeinenachrichten Rueckweisung0001 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getAllgemeinenachrichtenRueckweisung0001Type()
	 * @generated
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Rueckweisende Stelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rueckweisungsgrund</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transportinformationen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nachricht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Allgemeinenachrichten Rueckweisung0001 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Allgemeinenachrichten Rueckweisung0001 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.CodeRueckweisungsgrundTypeImpl <em>Code Rueckweisungsgrund Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.CodeRueckweisungsgrundTypeImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getCodeRueckweisungsgrundType()
	 * @generated
	 */
	int CODE_RUECKWEISUNGSGRUND_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RUECKWEISUNGSGRUND_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RUECKWEISUNGSGRUND_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RUECKWEISUNGSGRUND_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RUECKWEISUNGSGRUND_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Rueckweisungsgrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RUECKWEISUNGSGRUND_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Rueckweisungsgrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_RUECKWEISUNGSGRUND_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Allgemeinenachrichten Quittung0011</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011 = 3;

	/**
	 * The feature id for the '<em><b>Allgemeinenachrichten Rueckweisung0001</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001 = 4;

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
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisendeStelleTypeImpl <em>Rueckweisende Stelle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisendeStelleTypeImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisendeStelleType()
	 * @generated
	 */
	int RUECKWEISENDE_STELLE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Pruefinstanz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ = 0;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT = 1;

	/**
	 * The number of structural features of the '<em>Rueckweisende Stelle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISENDE_STELLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rueckweisende Stelle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISENDE_STELLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundSpezifischTypeImpl <em>Rueckweisungsgrund Spezifisch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundSpezifischTypeImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgrundSpezifischType()
	 * @generated
	 */
	int RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG = 1;

	/**
	 * The number of structural features of the '<em>Rueckweisungsgrund Spezifisch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rueckweisungsgrund Spezifisch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundTypeImpl <em>Rueckweisungsgrund Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundTypeImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgrundType()
	 * @generated
	 */
	int RUECKWEISUNGSGRUND_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Grund</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_TYPE__GRUND = 0;

	/**
	 * The feature id for the '<em><b>Grund Spezifisch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH = 1;

	/**
	 * The number of structural features of the '<em>Rueckweisungsgrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rueckweisungsgrund Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUECKWEISUNGSGRUND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl <em>Transportinformationen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getTransportinformationenType()
	 * @generated
	 */
	int TRANSPORTINFORMATIONEN_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Nachrichten Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID = 0;

	/**
	 * The feature id for the '<em><b>Betreff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTINFORMATIONEN_TYPE__BETREFF = 1;

	/**
	 * The feature id for the '<em><b>Sendezeitpunkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT = 2;

	/**
	 * The feature id for the '<em><b>Ergaenzende Hinweise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE = 3;

	/**
	 * The number of structural features of the '<em>Transportinformationen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTINFORMATIONEN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transportinformationen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTINFORMATIONEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende <em>Rueckweisungsgruende</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgruende()
	 * @generated
	 */
	int RUECKWEISUNGSGRUENDE = 8;

	/**
	 * The meta object id for the '<em>Rueckweisungsgruende Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgruendeObject()
	 * @generated
	 */
	int RUECKWEISUNGSGRUENDE_OBJECT = 9;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type <em>Allgemeinenachrichten Quittung0011 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeinenachrichten Quittung0011 Type</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type
	 * @generated
	 */
	EClass getAllgemeinenachrichtenQuittung0011Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type#getIdentifikationNachricht <em>Identifikation Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation Nachricht</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type#getIdentifikationNachricht()
	 * @see #getAllgemeinenachrichtenQuittung0011Type()
	 * @generated
	 */
	EReference getAllgemeinenachrichtenQuittung0011Type_IdentifikationNachricht();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type <em>Allgemeinenachrichten Rueckweisung0001 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeinenachrichten Rueckweisung0001 Type</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type
	 * @generated
	 */
	EClass getAllgemeinenachrichtenRueckweisung0001Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getRueckweisendeStelle <em>Rueckweisende Stelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rueckweisende Stelle</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getRueckweisendeStelle()
	 * @see #getAllgemeinenachrichtenRueckweisung0001Type()
	 * @generated
	 */
	EReference getAllgemeinenachrichtenRueckweisung0001Type_RueckweisendeStelle();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getRueckweisungsgrund <em>Rueckweisungsgrund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rueckweisungsgrund</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getRueckweisungsgrund()
	 * @see #getAllgemeinenachrichtenRueckweisung0001Type()
	 * @generated
	 */
	EReference getAllgemeinenachrichtenRueckweisung0001Type_Rueckweisungsgrund();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getTransportinformationen <em>Transportinformationen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transportinformationen</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getTransportinformationen()
	 * @see #getAllgemeinenachrichtenRueckweisung0001Type()
	 * @generated
	 */
	EReference getAllgemeinenachrichtenRueckweisung0001Type_Transportinformationen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getIdentifikationNachricht <em>Identifikation Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation Nachricht</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getIdentifikationNachricht()
	 * @see #getAllgemeinenachrichtenRueckweisung0001Type()
	 * @generated
	 */
	EReference getAllgemeinenachrichtenRueckweisung0001Type_IdentifikationNachricht();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getNachricht <em>Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachricht</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getNachricht()
	 * @see #getAllgemeinenachrichtenRueckweisung0001Type()
	 * @generated
	 */
	EAttribute getAllgemeinenachrichtenRueckweisung0001Type_Nachricht();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.CodeRueckweisungsgrundType <em>Code Rueckweisungsgrund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Rueckweisungsgrund Type</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.CodeRueckweisungsgrundType
	 * @generated
	 */
	EClass getCodeRueckweisungsgrundType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenQuittung0011 <em>Allgemeinenachrichten Quittung0011</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeinenachrichten Quittung0011</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenQuittung0011()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AllgemeinenachrichtenQuittung0011();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenRueckweisung0001 <em>Allgemeinenachrichten Rueckweisung0001</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeinenachrichten Rueckweisung0001</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenRueckweisung0001()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AllgemeinenachrichtenRueckweisung0001();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType <em>Rueckweisende Stelle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rueckweisende Stelle Type</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType
	 * @generated
	 */
	EClass getRueckweisendeStelleType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType#getPruefinstanz <em>Pruefinstanz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pruefinstanz</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType#getPruefinstanz()
	 * @see #getRueckweisendeStelleType()
	 * @generated
	 */
	EAttribute getRueckweisendeStelleType_Pruefinstanz();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType#getErreichbarkeit()
	 * @see #getRueckweisendeStelleType()
	 * @generated
	 */
	EReference getRueckweisendeStelleType_Erreichbarkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType <em>Rueckweisungsgrund Spezifisch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rueckweisungsgrund Spezifisch Type</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType
	 * @generated
	 */
	EClass getRueckweisungsgrundSpezifischType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getCode()
	 * @see #getRueckweisungsgrundSpezifischType()
	 * @generated
	 */
	EReference getRueckweisungsgrundSpezifischType_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType#getBeschreibung()
	 * @see #getRueckweisungsgrundSpezifischType()
	 * @generated
	 */
	EAttribute getRueckweisungsgrundSpezifischType_Beschreibung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType <em>Rueckweisungsgrund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rueckweisungsgrund Type</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType
	 * @generated
	 */
	EClass getRueckweisungsgrundType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType#getGrund <em>Grund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grund</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType#getGrund()
	 * @see #getRueckweisungsgrundType()
	 * @generated
	 */
	EReference getRueckweisungsgrundType_Grund();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType#getGrundSpezifisch <em>Grund Spezifisch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grund Spezifisch</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType#getGrundSpezifisch()
	 * @see #getRueckweisungsgrundType()
	 * @generated
	 */
	EReference getRueckweisungsgrundType_GrundSpezifisch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType <em>Transportinformationen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportinformationen Type</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType
	 * @generated
	 */
	EClass getTransportinformationenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getNachrichtenId <em>Nachrichten Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachrichten Id</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getNachrichtenId()
	 * @see #getTransportinformationenType()
	 * @generated
	 */
	EAttribute getTransportinformationenType_NachrichtenId();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getBetreff <em>Betreff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betreff</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getBetreff()
	 * @see #getTransportinformationenType()
	 * @generated
	 */
	EAttribute getTransportinformationenType_Betreff();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getSendezeitpunkt <em>Sendezeitpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sendezeitpunkt</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getSendezeitpunkt()
	 * @see #getTransportinformationenType()
	 * @generated
	 */
	EAttribute getTransportinformationenType_Sendezeitpunkt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getErgaenzendeHinweise <em>Ergaenzende Hinweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ergaenzende Hinweise</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType#getErgaenzendeHinweise()
	 * @see #getTransportinformationenType()
	 * @generated
	 */
	EAttribute getTransportinformationenType_ErgaenzendeHinweise();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende <em>Rueckweisungsgruende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rueckweisungsgruende</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende
	 * @generated
	 */
	EEnum getRueckweisungsgruende();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende <em>Rueckweisungsgruende Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rueckweisungsgruende Object</em>'.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende
	 * @model instanceClass="de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende"
	 *        extendedMetaData="name='rueckweisungsgruende:Object' baseType='rueckweisungsgruende'"
	 * @generated
	 */
	EDataType getRueckweisungsgruendeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllgemeineNachrichtenFactory getAllgemeineNachrichtenFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenQuittung0011TypeImpl <em>Allgemeinenachrichten Quittung0011 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenQuittung0011TypeImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getAllgemeinenachrichtenQuittung0011Type()
		 * @generated
		 */
		EClass ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE = eINSTANCE.getAllgemeinenachrichtenQuittung0011Type();

		/**
		 * The meta object literal for the '<em><b>Identifikation Nachricht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE__IDENTIFIKATION_NACHRICHT = eINSTANCE.getAllgemeinenachrichtenQuittung0011Type_IdentifikationNachricht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl <em>Allgemeinenachrichten Rueckweisung0001 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getAllgemeinenachrichtenRueckweisung0001Type()
		 * @generated
		 */
		EClass ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE = eINSTANCE.getAllgemeinenachrichtenRueckweisung0001Type();

		/**
		 * The meta object literal for the '<em><b>Rueckweisende Stelle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE = eINSTANCE.getAllgemeinenachrichtenRueckweisung0001Type_RueckweisendeStelle();

		/**
		 * The meta object literal for the '<em><b>Rueckweisungsgrund</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND = eINSTANCE.getAllgemeinenachrichtenRueckweisung0001Type_Rueckweisungsgrund();

		/**
		 * The meta object literal for the '<em><b>Transportinformationen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN = eINSTANCE.getAllgemeinenachrichtenRueckweisung0001Type_Transportinformationen();

		/**
		 * The meta object literal for the '<em><b>Identifikation Nachricht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT = eINSTANCE.getAllgemeinenachrichtenRueckweisung0001Type_IdentifikationNachricht();

		/**
		 * The meta object literal for the '<em><b>Nachricht</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT = eINSTANCE.getAllgemeinenachrichtenRueckweisung0001Type_Nachricht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.CodeRueckweisungsgrundTypeImpl <em>Code Rueckweisungsgrund Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.CodeRueckweisungsgrundTypeImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getCodeRueckweisungsgrundType()
		 * @generated
		 */
		EClass CODE_RUECKWEISUNGSGRUND_TYPE = eINSTANCE.getCodeRueckweisungsgrundType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Allgemeinenachrichten Quittung0011</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011 = eINSTANCE.getDocumentRoot_AllgemeinenachrichtenQuittung0011();

		/**
		 * The meta object literal for the '<em><b>Allgemeinenachrichten Rueckweisung0001</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001 = eINSTANCE.getDocumentRoot_AllgemeinenachrichtenRueckweisung0001();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisendeStelleTypeImpl <em>Rueckweisende Stelle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisendeStelleTypeImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisendeStelleType()
		 * @generated
		 */
		EClass RUECKWEISENDE_STELLE_TYPE = eINSTANCE.getRueckweisendeStelleType();

		/**
		 * The meta object literal for the '<em><b>Pruefinstanz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ = eINSTANCE.getRueckweisendeStelleType_Pruefinstanz();

		/**
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT = eINSTANCE.getRueckweisendeStelleType_Erreichbarkeit();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundSpezifischTypeImpl <em>Rueckweisungsgrund Spezifisch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundSpezifischTypeImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgrundSpezifischType()
		 * @generated
		 */
		EClass RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE = eINSTANCE.getRueckweisungsgrundSpezifischType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE = eINSTANCE.getRueckweisungsgrundSpezifischType_Code();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG = eINSTANCE.getRueckweisungsgrundSpezifischType_Beschreibung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundTypeImpl <em>Rueckweisungsgrund Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundTypeImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgrundType()
		 * @generated
		 */
		EClass RUECKWEISUNGSGRUND_TYPE = eINSTANCE.getRueckweisungsgrundType();

		/**
		 * The meta object literal for the '<em><b>Grund</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUECKWEISUNGSGRUND_TYPE__GRUND = eINSTANCE.getRueckweisungsgrundType_Grund();

		/**
		 * The meta object literal for the '<em><b>Grund Spezifisch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUECKWEISUNGSGRUND_TYPE__GRUND_SPEZIFISCH = eINSTANCE.getRueckweisungsgrundType_GrundSpezifisch();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl <em>Transportinformationen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getTransportinformationenType()
		 * @generated
		 */
		EClass TRANSPORTINFORMATIONEN_TYPE = eINSTANCE.getTransportinformationenType();

		/**
		 * The meta object literal for the '<em><b>Nachrichten Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID = eINSTANCE.getTransportinformationenType_NachrichtenId();

		/**
		 * The meta object literal for the '<em><b>Betreff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTINFORMATIONEN_TYPE__BETREFF = eINSTANCE.getTransportinformationenType_Betreff();

		/**
		 * The meta object literal for the '<em><b>Sendezeitpunkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT = eINSTANCE.getTransportinformationenType_Sendezeitpunkt();

		/**
		 * The meta object literal for the '<em><b>Ergaenzende Hinweise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE = eINSTANCE.getTransportinformationenType_ErgaenzendeHinweise();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende <em>Rueckweisungsgruende</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgruende()
		 * @generated
		 */
		EEnum RUECKWEISUNGSGRUENDE = eINSTANCE.getRueckweisungsgruende();

		/**
		 * The meta object literal for the '<em>Rueckweisungsgruende Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.Rueckweisungsgruende
		 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl#getRueckweisungsgruendeObject()
		 * @generated
		 */
		EDataType RUECKWEISUNGSGRUENDE_OBJECT = eINSTANCE.getRueckweisungsgruendeObject();

	}

} //AllgemeineNachrichtenPackage
