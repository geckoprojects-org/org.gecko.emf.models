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
package de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht;


import de.xoev.schemata.code.code.Code10Package;

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
 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BasisnachrichtUnqualifiedPackage.eNS_URI, genModel = "/model/basisnachricht-unqualified.genmodel", genModelSourceLocations = {"model/basisnachricht-unqualified.genmodel","de.xoev.basisnachricht/model/basisnachricht-unqualified.genmodel"}, ecore="/model/basisnachricht-unqualified.ecore", ecoreSourceLocations="/model/basisnachricht-unqualified.ecore")
public interface BasisnachrichtUnqualifiedPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basisnachricht";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xoev.de/schemata/basisnachricht/unqualified/g2g/1_0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basisnachricht";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasisnachrichtUnqualifiedPackage eINSTANCE = de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl <em>Behoerde Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getBehoerdeType()
	 * @generated
	 */
	int BEHOERDE_TYPE = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE__ERREICHBARKEIT = 3;

	/**
	 * The number of structural features of the '<em>Behoerde Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Behoerde Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeKommunikationKanalTypeImpl <em>Code Kommunikation Kanal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeKommunikationKanalTypeImpl
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getCodeKommunikationKanalType()
	 * @generated
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Kommunikation Kanal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Kommunikation Kanal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeVerzeichnisdienstTypeImpl <em>Code Verzeichnisdienst Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeVerzeichnisdienstTypeImpl
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getCodeVerzeichnisdienstType()
	 * @generated
	 */
	int CODE_VERZEICHNISDIENST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Verzeichnisdienst Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Verzeichnisdienst Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.IdentifikationNachrichtTypeImpl
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getIdentifikationNachrichtType()
	 * @generated
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE = 3;

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
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.KommunikationTypeImpl <em>Kommunikation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.KommunikationTypeImpl
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getKommunikationType()
	 * @generated
	 */
	int KOMMUNIKATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Kanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__KANAL = 0;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__KENNUNG = 1;

	/**
	 * The feature id for the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__ZUSATZ = 2;

	/**
	 * The number of structural features of the '<em>Kommunikation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kommunikation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtenkopfG2GTypeImpl <em>Nachrichtenkopf G2G Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtenkopfG2GTypeImpl
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getNachrichtenkopfG2GType()
	 * @generated
	 */
	int NACHRICHTENKOPF_G2G_TYPE = 5;

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
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtG2GTypeImpl <em>Nachricht G2G Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtG2GTypeImpl
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getNachrichtG2GType()
	 * @generated
	 */
	int NACHRICHT_G2G_TYPE = 6;

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
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 7;


	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType <em>Behoerde Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behoerde Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType
	 * @generated
	 */
	EClass getBehoerdeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verzeichnisdienst</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getVerzeichnisdienst()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EReference getBehoerdeType_Verzeichnisdienst();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getKennung()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EAttribute getBehoerdeType_Kennung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getName()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EAttribute getBehoerdeType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getErreichbarkeit()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EReference getBehoerdeType_Erreichbarkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.CodeKommunikationKanalType <em>Code Kommunikation Kanal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Kommunikation Kanal Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.CodeKommunikationKanalType
	 * @generated
	 */
	EClass getCodeKommunikationKanalType();

	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.CodeVerzeichnisdienstType <em>Code Verzeichnisdienst Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Verzeichnisdienst Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.CodeVerzeichnisdienstType
	 * @generated
	 */
	EClass getCodeVerzeichnisdienstType();

	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifikation Nachricht Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType
	 * @generated
	 */
	EClass getIdentifikationNachrichtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType#getNachrichtenUUID <em>Nachrichten UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachrichten UUID</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType#getNachrichtenUUID()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EAttribute getIdentifikationNachrichtType_NachrichtenUUID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType#getNachrichtentyp <em>Nachrichtentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtentyp</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType#getNachrichtentyp()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EReference getIdentifikationNachrichtType_Nachrichtentyp();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erstellungszeitpunkt</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.IdentifikationNachrichtType#getErstellungszeitpunkt()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EAttribute getIdentifikationNachrichtType_Erstellungszeitpunkt();

	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType <em>Kommunikation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kommunikation Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType
	 * @generated
	 */
	EClass getKommunikationType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKanal <em>Kanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kanal</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKanal()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EReference getKommunikationType_Kanal();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKennung()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EAttribute getKommunikationType_Kennung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getZusatz <em>Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatz</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getZusatz()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EAttribute getKommunikationType_Zusatz();

	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType <em>Nachrichtenkopf G2G Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachrichtenkopf G2G Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType
	 * @generated
	 */
	EClass getNachrichtenkopfG2GType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation Nachricht</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType#getIdentifikationNachricht()
	 * @see #getNachrichtenkopfG2GType()
	 * @generated
	 */
	EReference getNachrichtenkopfG2GType_IdentifikationNachricht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType#getLeser <em>Leser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leser</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType#getLeser()
	 * @see #getNachrichtenkopfG2GType()
	 * @generated
	 */
	EReference getNachrichtenkopfG2GType_Leser();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autor</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtenkopfG2GType#getAutor()
	 * @see #getNachrichtenkopfG2GType()
	 * @generated
	 */
	EReference getNachrichtenkopfG2GType_Autor();

	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType <em>Nachricht G2G Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachricht G2G Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType
	 * @generated
	 */
	EClass getNachrichtG2GType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtenkopf G2g</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getNachrichtenkopfG2g()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EReference getNachrichtG2GType_NachrichtenkopfG2g();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getProdukt <em>Produkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkt</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getProdukt()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Produkt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getProdukthersteller <em>Produkthersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkthersteller</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getProdukthersteller()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Produkthersteller();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getProduktversion <em>Produktversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produktversion</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getProduktversion()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Produktversion();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getStandard()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Standard();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getTest()
	 * @see #getNachrichtG2GType()
	 * @generated
	 */
	EAttribute getNachrichtG2GType_Test();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.NachrichtG2GType#getVersion()
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
	BasisnachrichtUnqualifiedFactory getBasisnachrichtUnqualifiedFactory();

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
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl <em>Behoerde Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BehoerdeTypeImpl
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getBehoerdeType()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHOERDE_TYPE__NAME = eINSTANCE.getBehoerdeType_Name();

		/**
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHOERDE_TYPE__ERREICHBARKEIT = eINSTANCE.getBehoerdeType_Erreichbarkeit();

		/**
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeKommunikationKanalTypeImpl <em>Code Kommunikation Kanal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeKommunikationKanalTypeImpl
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getCodeKommunikationKanalType()
		 * @generated
		 */
		EClass CODE_KOMMUNIKATION_KANAL_TYPE = eINSTANCE.getCodeKommunikationKanalType();

		/**
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeVerzeichnisdienstTypeImpl <em>Code Verzeichnisdienst Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.CodeVerzeichnisdienstTypeImpl
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getCodeVerzeichnisdienstType()
		 * @generated
		 */
		EClass CODE_VERZEICHNISDIENST_TYPE = eINSTANCE.getCodeVerzeichnisdienstType();

		/**
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.IdentifikationNachrichtTypeImpl
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getIdentifikationNachrichtType()
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
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.KommunikationTypeImpl <em>Kommunikation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.KommunikationTypeImpl
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getKommunikationType()
		 * @generated
		 */
		EClass KOMMUNIKATION_TYPE = eINSTANCE.getKommunikationType();

		/**
		 * The meta object literal for the '<em><b>Kanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOMMUNIKATION_TYPE__KANAL = eINSTANCE.getKommunikationType_Kanal();

		/**
		 * The meta object literal for the '<em><b>Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMUNIKATION_TYPE__KENNUNG = eINSTANCE.getKommunikationType_Kennung();

		/**
		 * The meta object literal for the '<em><b>Zusatz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMUNIKATION_TYPE__ZUSATZ = eINSTANCE.getKommunikationType_Zusatz();

		/**
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtenkopfG2GTypeImpl <em>Nachrichtenkopf G2G Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtenkopfG2GTypeImpl
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getNachrichtenkopfG2GType()
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
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtG2GTypeImpl <em>Nachricht G2G Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.NachrichtG2GTypeImpl
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getNachrichtG2GType()
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
		 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.impl.BasisnachrichtUnqualifiedPackageImpl#getUUID()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUUID();

	}

} //BasisnachrichtUnqualifiedPackage
