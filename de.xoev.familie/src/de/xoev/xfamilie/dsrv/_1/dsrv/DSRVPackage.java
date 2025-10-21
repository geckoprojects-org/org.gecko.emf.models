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
package de.xoev.xfamilie.dsrv._1.dsrv;


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
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DSRVPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/dsrv.ecore", ecoreSourceLocations="/model/dsrv.ecore")
public interface DSRVPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsrv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/dsrv/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsrv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSRVPackage eINSTANCE = de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.AnyTypeFamilieDSRVTypeImpl <em>Any Type Familie DSRV Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.AnyTypeFamilieDSRVTypeImpl
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getAnyTypeFamilieDSRVType()
	 * @generated
	 */
	int ANY_TYPE_FAMILIE_DSRV_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FAMILIE_DSRV_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Any Type Familie DSRV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FAMILIE_DSRV_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Any Type Familie DSRV Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FAMILIE_DSRV_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Dsrv Anfragervbea0401</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401 = 3;

	/**
	 * The feature id for the '<em><b>Dsrv Einkommensdatenrvbea0402</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402 = 4;

	/**
	 * The feature id for the '<em><b>Dsrv Statusantwortrvbea0403</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403 = 5;

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
	 * The meta object id for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl <em>Dsrv Anfragervbea0401 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anforderungsgrund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Einkommens Daten Bis Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Einkommens Daten Von Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__GEBURT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name Natuerliche Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dsrv Anfragervbea0401 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dsrv Anfragervbea0401 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_ANFRAGERVBEA0401_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvEinkommensdatenrvbea0402TypeImpl <em>Dsrv Einkommensdatenrvbea0402 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvEinkommensdatenrvbea0402TypeImpl
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDsrvEinkommensdatenrvbea0402Type()
	 * @generated
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Dxeb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ifd Nr Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsrv Einkommensdatenrvbea0402 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dsrv Einkommensdatenrvbea0402 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_EINKOMMENSDATENRVBEA0402_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvStatusantwortrvbea0403TypeImpl <em>Dsrv Statusantwortrvbea0403 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvStatusantwortrvbea0403TypeImpl
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDsrvStatusantwortrvbea0403Type()
	 * @generated
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__NACHRICHTENKOPF = BaukastenPackage.NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__PRODUKT = BaukastenPackage.NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__PRODUKTHERSTELLER = BaukastenPackage.NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__PRODUKTVERSION = BaukastenPackage.NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__STANDARD = BaukastenPackage.NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__TEST = BaukastenPackage.NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__VERSION = BaukastenPackage.NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rueckmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dsrv Statusantwortrvbea0403 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE_FEATURE_COUNT = BaukastenPackage.NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dsrv Statusantwortrvbea0403 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSRV_STATUSANTWORTRVBEA0403_TYPE_OPERATION_COUNT = BaukastenPackage.NACHRICHT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType <em>Any Type Familie DSRV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type Familie DSRV Type</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType
	 * @generated
	 */
	EClass getAnyTypeFamilieDSRVType();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.AnyTypeFamilieDSRVType#getAny()
	 * @see #getAnyTypeFamilieDSRVType()
	 * @generated
	 */
	EAttribute getAnyTypeFamilieDSRVType_Any();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvAnfragervbea0401 <em>Dsrv Anfragervbea0401</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsrv Anfragervbea0401</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvAnfragervbea0401()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DsrvAnfragervbea0401();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvEinkommensdatenrvbea0402 <em>Dsrv Einkommensdatenrvbea0402</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsrv Einkommensdatenrvbea0402</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvEinkommensdatenrvbea0402()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DsrvEinkommensdatenrvbea0402();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvStatusantwortrvbea0403 <em>Dsrv Statusantwortrvbea0403</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsrv Statusantwortrvbea0403</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvStatusantwortrvbea0403()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DsrvStatusantwortrvbea0403();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type <em>Dsrv Anfragervbea0401 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsrv Anfragervbea0401 Type</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type
	 * @generated
	 */
	EClass getDsrvAnfragervbea0401Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAbfrageID <em>Abfrage ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abfrage ID</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAbfrageID()
	 * @see #getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	EAttribute getDsrvAnfragervbea0401Type_AbfrageID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnforderungsgrund <em>Anforderungsgrund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anforderungsgrund</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnforderungsgrund()
	 * @see #getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	EAttribute getDsrvAnfragervbea0401Type_Anforderungsgrund();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenBisDatum <em>Einkommens Daten Bis Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommens Daten Bis Datum</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenBisDatum()
	 * @see #getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	EAttribute getDsrvAnfragervbea0401Type_EinkommensDatenBisDatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenVonDatum <em>Einkommens Daten Von Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einkommens Daten Von Datum</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getEinkommensDatenVonDatum()
	 * @see #getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	EAttribute getDsrvAnfragervbea0401Type_EinkommensDatenVonDatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getGeburt()
	 * @see #getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	EReference getDsrvAnfragervbea0401Type_Geburt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getNameNatuerlichePerson <em>Name Natuerliche Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Natuerliche Person</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getNameNatuerlichePerson()
	 * @see #getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	EReference getDsrvAnfragervbea0401Type_NameNatuerlichePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type#getAnschrift()
	 * @see #getDsrvAnfragervbea0401Type()
	 * @generated
	 */
	EReference getDsrvAnfragervbea0401Type_Anschrift();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type <em>Dsrv Einkommensdatenrvbea0402 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsrv Einkommensdatenrvbea0402 Type</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type
	 * @generated
	 */
	EClass getDsrvEinkommensdatenrvbea0402Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getDxeb <em>Dxeb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dxeb</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getDxeb()
	 * @see #getDsrvEinkommensdatenrvbea0402Type()
	 * @generated
	 */
	EReference getDsrvEinkommensdatenrvbea0402Type_Dxeb();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifd Nr Arbeitgeber</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getIfdNrArbeitgeber()
	 * @see #getDsrvEinkommensdatenrvbea0402Type()
	 * @generated
	 */
	EAttribute getDsrvEinkommensdatenrvbea0402Type_IfdNrArbeitgeber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getAbfrageID <em>Abfrage ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abfrage ID</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type#getAbfrageID()
	 * @see #getDsrvEinkommensdatenrvbea0402Type()
	 * @generated
	 */
	EAttribute getDsrvEinkommensdatenrvbea0402Type_AbfrageID();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type <em>Dsrv Statusantwortrvbea0403 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsrv Statusantwortrvbea0403 Type</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type
	 * @generated
	 */
	EClass getDsrvStatusantwortrvbea0403Type();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getAbfrageID <em>Abfrage ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abfrage ID</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getAbfrageID()
	 * @see #getDsrvStatusantwortrvbea0403Type()
	 * @generated
	 */
	EAttribute getDsrvStatusantwortrvbea0403Type_AbfrageID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getRueckmeldung <em>Rueckmeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rueckmeldung</em>'.
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getRueckmeldung()
	 * @see #getDsrvStatusantwortrvbea0403Type()
	 * @generated
	 */
	EReference getDsrvStatusantwortrvbea0403Type_Rueckmeldung();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DSRVFactory getDSRVFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.AnyTypeFamilieDSRVTypeImpl <em>Any Type Familie DSRV Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.AnyTypeFamilieDSRVTypeImpl
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getAnyTypeFamilieDSRVType()
		 * @generated
		 */
		EClass ANY_TYPE_FAMILIE_DSRV_TYPE = eINSTANCE.getAnyTypeFamilieDSRVType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_TYPE_FAMILIE_DSRV_TYPE__ANY = eINSTANCE.getAnyTypeFamilieDSRVType_Any();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Dsrv Anfragervbea0401</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401 = eINSTANCE.getDocumentRoot_DsrvAnfragervbea0401();

		/**
		 * The meta object literal for the '<em><b>Dsrv Einkommensdatenrvbea0402</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402 = eINSTANCE.getDocumentRoot_DsrvEinkommensdatenrvbea0402();

		/**
		 * The meta object literal for the '<em><b>Dsrv Statusantwortrvbea0403</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403 = eINSTANCE.getDocumentRoot_DsrvStatusantwortrvbea0403();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl <em>Dsrv Anfragervbea0401 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvAnfragervbea0401TypeImpl
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDsrvAnfragervbea0401Type()
		 * @generated
		 */
		EClass DSRV_ANFRAGERVBEA0401_TYPE = eINSTANCE.getDsrvAnfragervbea0401Type();

		/**
		 * The meta object literal for the '<em><b>Abfrage ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSRV_ANFRAGERVBEA0401_TYPE__ABFRAGE_ID = eINSTANCE.getDsrvAnfragervbea0401Type_AbfrageID();

		/**
		 * The meta object literal for the '<em><b>Anforderungsgrund</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSRV_ANFRAGERVBEA0401_TYPE__ANFORDERUNGSGRUND = eINSTANCE.getDsrvAnfragervbea0401Type_Anforderungsgrund();

		/**
		 * The meta object literal for the '<em><b>Einkommens Daten Bis Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_BIS_DATUM = eINSTANCE.getDsrvAnfragervbea0401Type_EinkommensDatenBisDatum();

		/**
		 * The meta object literal for the '<em><b>Einkommens Daten Von Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSRV_ANFRAGERVBEA0401_TYPE__EINKOMMENS_DATEN_VON_DATUM = eINSTANCE.getDsrvAnfragervbea0401Type_EinkommensDatenVonDatum();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSRV_ANFRAGERVBEA0401_TYPE__GEBURT = eINSTANCE.getDsrvAnfragervbea0401Type_Geburt();

		/**
		 * The meta object literal for the '<em><b>Name Natuerliche Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSRV_ANFRAGERVBEA0401_TYPE__NAME_NATUERLICHE_PERSON = eINSTANCE.getDsrvAnfragervbea0401Type_NameNatuerlichePerson();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSRV_ANFRAGERVBEA0401_TYPE__ANSCHRIFT = eINSTANCE.getDsrvAnfragervbea0401Type_Anschrift();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvEinkommensdatenrvbea0402TypeImpl <em>Dsrv Einkommensdatenrvbea0402 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvEinkommensdatenrvbea0402TypeImpl
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDsrvEinkommensdatenrvbea0402Type()
		 * @generated
		 */
		EClass DSRV_EINKOMMENSDATENRVBEA0402_TYPE = eINSTANCE.getDsrvEinkommensdatenrvbea0402Type();

		/**
		 * The meta object literal for the '<em><b>Dxeb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSRV_EINKOMMENSDATENRVBEA0402_TYPE__DXEB = eINSTANCE.getDsrvEinkommensdatenrvbea0402Type_Dxeb();

		/**
		 * The meta object literal for the '<em><b>Ifd Nr Arbeitgeber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSRV_EINKOMMENSDATENRVBEA0402_TYPE__IFD_NR_ARBEITGEBER = eINSTANCE.getDsrvEinkommensdatenrvbea0402Type_IfdNrArbeitgeber();

		/**
		 * The meta object literal for the '<em><b>Abfrage ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSRV_EINKOMMENSDATENRVBEA0402_TYPE__ABFRAGE_ID = eINSTANCE.getDsrvEinkommensdatenrvbea0402Type_AbfrageID();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvStatusantwortrvbea0403TypeImpl <em>Dsrv Statusantwortrvbea0403 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DsrvStatusantwortrvbea0403TypeImpl
		 * @see de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl#getDsrvStatusantwortrvbea0403Type()
		 * @generated
		 */
		EClass DSRV_STATUSANTWORTRVBEA0403_TYPE = eINSTANCE.getDsrvStatusantwortrvbea0403Type();

		/**
		 * The meta object literal for the '<em><b>Abfrage ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSRV_STATUSANTWORTRVBEA0403_TYPE__ABFRAGE_ID = eINSTANCE.getDsrvStatusantwortrvbea0403Type_AbfrageID();

		/**
		 * The meta object literal for the '<em><b>Rueckmeldung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSRV_STATUSANTWORTRVBEA0403_TYPE__RUECKMELDUNG = eINSTANCE.getDsrvStatusantwortrvbea0403Type_Rueckmeldung();

	}

} //DSRVPackage
