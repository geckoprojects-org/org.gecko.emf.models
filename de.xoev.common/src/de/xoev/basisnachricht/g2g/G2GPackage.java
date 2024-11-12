/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.xoev.basisnachricht.g2g;


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
 * Diese Schema-Datei enthält die technische Repräsentation der in der DIN SPEC 91379 definierten Datentypen.
 * <!-- end-model-doc -->
 * @see de.xoev.basisnachricht.g2g.G2GFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = G2GPackage.eNS_URI, genModel = "/model/xoev-basisnachricht-g2g.genmodel", genModelSourceLocations = {"model/xoev-basisnachricht-g2g.genmodel","de.xoev.common/model/xoev-basisnachricht-g2g.genmodel"}, ecore="/model/xoev-basisnachricht-g2g.ecore", ecoreSourceLocations="/model/xoev-basisnachricht-g2g.ecore")
public interface G2GPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "g2g";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xoev.de/schemata/basisnachricht/g2g/1_0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "g2g";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	G2GPackage eINSTANCE = de.xoev.basisnachricht.g2g.impl.G2GPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.g2g.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.g2g.impl.DocumentRootImpl
	 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Autor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTOR = 3;

	/**
	 * The feature id for the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT = 4;

	/**
	 * The feature id for the '<em><b>Leser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LESER = 5;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf G2g</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NACHRICHTENKOPF_G2G = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.g2g.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.g2g.impl.IdentifikationNachrichtTypeImpl
	 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getIdentifikationNachrichtType()
	 * @generated
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE = 1;

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
	 * The meta object id for the '{@link de.xoev.basisnachricht.g2g.impl.NachrichtenkopfG2GTypeImpl <em>Nachrichtenkopf G2G Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.g2g.impl.NachrichtenkopfG2GTypeImpl
	 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getNachrichtenkopfG2GType()
	 * @generated
	 */
	int NACHRICHTENKOPF_G2G_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT = 0;

	/**
	 * The feature id for the '<em><b>Leser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_G2G_TYPE__LESER = 1;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_G2G_TYPE__AUTOR = 2;

	/**
	 * The number of structural features of the '<em>Nachrichtenkopf G2G Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_G2G_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Nachrichtenkopf G2G Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_G2G_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.g2g.impl.NachrichtG2GTypeImpl <em>Nachricht G2G Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.g2g.impl.NachrichtG2GTypeImpl
	 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getNachrichtG2GType()
	 * @generated
	 */
	int NACHRICHT_G2G_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf G2g</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G = 0;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE__PRODUKT = 1;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER = 2;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE__PRODUKTVERSION = 3;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE__STANDARD = 4;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE__TEST = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE__VERSION = 6;

	/**
	 * The number of structural features of the '<em>Nachricht G2G Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Nachricht G2G Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_G2G_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 4;


	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.g2g.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.basisnachricht.g2g.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.basisnachricht.g2g.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.basisnachricht.g2g.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.DocumentRoot#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autor</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot#getAutor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Autor();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.DocumentRoot#getIdentifikationNachricht <em>Identifikation Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation Nachricht</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot#getIdentifikationNachricht()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IdentifikationNachricht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.DocumentRoot#getLeser <em>Leser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leser</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot#getLeser()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Leser();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.DocumentRoot#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtenkopf G2g</em>'.
	 * @see de.xoev.basisnachricht.g2g.DocumentRoot#getNachrichtenkopfG2g()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NachrichtenkopfG2g();

	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifikation Nachricht Type</em>'.
	 * @see de.xoev.basisnachricht.g2g.IdentifikationNachrichtType
	 * @generated
	 */
	EClass getIdentifikationNachrichtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtenUUID <em>Nachrichten UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachrichten UUID</em>'.
	 * @see de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtenUUID()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EAttribute getIdentifikationNachrichtType_NachrichtenUUID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtentyp <em>Nachrichtentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtentyp</em>'.
	 * @see de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtentyp()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EReference getIdentifikationNachrichtType_Nachrichtentyp();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erstellungszeitpunkt</em>'.
	 * @see de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getErstellungszeitpunkt()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EAttribute getIdentifikationNachrichtType_Erstellungszeitpunkt();

	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType <em>Nachrichtenkopf G2G Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachrichtenkopf G2G Type</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType
	 * @generated
	 */
	EClass getNachrichtenkopfG2GType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation Nachricht</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType#getIdentifikationNachricht()
	 * @see #getNachrichtenkopfG2GType()
	 * @generated
	 */
	EReference getNachrichtenkopfG2GType_IdentifikationNachricht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType#getLeser <em>Leser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leser</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType#getLeser()
	 * @see #getNachrichtenkopfG2GType()
	 * @generated
	 */
	EReference getNachrichtenkopfG2GType_Leser();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autor</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType#getAutor()
	 * @see #getNachrichtenkopfG2GType()
	 * @generated
	 */
	EReference getNachrichtenkopfG2GType_Autor();

	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType <em>Nachricht G2G Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachricht G2G Type</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType
	 * @generated
	 */
	EClass getNachrichtG2GType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtenkopf G2g</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType#getNachrichtenkopfG2g()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EReference getNachrichtG2GType_NachrichtenkopfG2g();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType#getProdukt <em>Produkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkt</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType#getProdukt()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Produkt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType#getProdukthersteller <em>Produkthersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkthersteller</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType#getProdukthersteller()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Produkthersteller();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType#getProduktversion <em>Produktversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produktversion</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType#getProduktversion()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Produktversion();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType#getStandard()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Standard();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType#getTest()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Test();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.g2g.NachrichtG2GType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.xoev.basisnachricht.g2g.NachrichtG2GType#getVersion()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Version();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ein „Universally Unique IDentifier (UUID)“ entsprechend rfc4122.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>UUID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UUID' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' pattern='[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}'"
	 * @generated
	 */
	EDataType getUUID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	G2GFactory getG2GFactory();

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
		 * The meta object literal for the '{@link de.xoev.basisnachricht.g2g.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.g2g.impl.DocumentRootImpl
		 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Autor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTOR = eINSTANCE.getDocumentRoot_Autor();

		/**
		 * The meta object literal for the '<em><b>Identifikation Nachricht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT = eINSTANCE.getDocumentRoot_IdentifikationNachricht();

		/**
		 * The meta object literal for the '<em><b>Leser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LESER = eINSTANCE.getDocumentRoot_Leser();

		/**
		 * The meta object literal for the '<em><b>Nachrichtenkopf G2g</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NACHRICHTENKOPF_G2G = eINSTANCE.getDocumentRoot_NachrichtenkopfG2g();

		/**
		 * The meta object literal for the '{@link de.xoev.basisnachricht.g2g.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.g2g.impl.IdentifikationNachrichtTypeImpl
		 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getIdentifikationNachrichtType()
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
		 * The meta object literal for the '{@link de.xoev.basisnachricht.g2g.impl.NachrichtenkopfG2GTypeImpl <em>Nachrichtenkopf G2G Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.g2g.impl.NachrichtenkopfG2GTypeImpl
		 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getNachrichtenkopfG2GType()
		 * @generated
		 */
		EClass NACHRICHTENKOPF_G2G_TYPE = eINSTANCE.getNachrichtenkopfG2GType();

		/**
		 * The meta object literal for the '<em><b>Identifikation Nachricht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT = eINSTANCE.getNachrichtenkopfG2GType_IdentifikationNachricht();

		/**
		 * The meta object literal for the '<em><b>Leser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_G2G_TYPE__LESER = eINSTANCE.getNachrichtenkopfG2GType_Leser();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_G2G_TYPE__AUTOR = eINSTANCE.getNachrichtenkopfG2GType_Autor();

		/**
		 * The meta object literal for the '{@link de.xoev.basisnachricht.g2g.impl.NachrichtG2GTypeImpl <em>Nachricht G2G Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.g2g.impl.NachrichtG2GTypeImpl
		 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getNachrichtG2GType()
		 * @generated
		 */
		EClass NACHRICHT_G2G_TYPE = eINSTANCE.getNachrichtG2GType();

		/**
		 * The meta object literal for the '<em><b>Nachrichtenkopf G2g</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G = eINSTANCE.getNachrichtG2GType_NachrichtenkopfG2g();

		/**
		 * The meta object literal for the '<em><b>Produkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_G2G_TYPE__PRODUKT = eINSTANCE.getNachrichtG2GType_Produkt();

		/**
		 * The meta object literal for the '<em><b>Produkthersteller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER = eINSTANCE.getNachrichtG2GType_Produkthersteller();

		/**
		 * The meta object literal for the '<em><b>Produktversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_G2G_TYPE__PRODUKTVERSION = eINSTANCE.getNachrichtG2GType_Produktversion();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_G2G_TYPE__STANDARD = eINSTANCE.getNachrichtG2GType_Standard();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_G2G_TYPE__TEST = eINSTANCE.getNachrichtG2GType_Test();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_G2G_TYPE__VERSION = eINSTANCE.getNachrichtG2GType_Version();

		/**
		 * The meta object literal for the '<em>UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.basisnachricht.g2g.impl.G2GPackageImpl#getUUID()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUUID();

	}

} //G2GPackage
