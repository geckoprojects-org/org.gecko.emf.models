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
package de.xoev.basisnachricht.kommunikation;


import de.xoev.code.CodePackage;

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
 * Diese Schema-Datei enthält die technische Repräsentation der in der DIN SPEC 91379 definierten Datentypen.
 * <!-- end-model-doc -->
 * @see de.xoev.basisnachricht.kommunikation.KommunikationFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = KommunikationPackage.eNS_URI, genModel = "/model/xoev-basisnachricht-kommunikation.genmodel", genModelSourceLocations = {"model/xoev-basisnachricht-kommunikation.genmodel","de.xoev.common/model/xoev-basisnachricht-kommunikation.genmodel"}, ecore="/model/xoev-basisnachricht-kommunikation.ecore", ecoreSourceLocations="/model/xoev-basisnachricht-kommunikation.ecore")
public interface KommunikationPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kommunikation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xoev.de/schemata/basisnachricht/kommunikation/1_0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kommunikation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KommunikationPackage eINSTANCE = de.xoev.basisnachricht.kommunikation.impl.KommunikationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.kommunikation.impl.CodeKommunikationKanalTypeImpl <em>Code Kommunikation Kanal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.kommunikation.impl.CodeKommunikationKanalTypeImpl
	 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationPackageImpl#getCodeKommunikationKanalType()
	 * @generated
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Kommunikation Kanal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Kommunikation Kanal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KOMMUNIKATION_KANAL_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.kommunikation.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.kommunikation.impl.DocumentRootImpl
	 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ERREICHBARKEIT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.kommunikation.impl.KommunikationTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationTypeImpl
	 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationPackageImpl#getKommunikationType()
	 * @generated
	 */
	int KOMMUNIKATION_TYPE = 2;

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
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.kommunikation.CodeKommunikationKanalType <em>Code Kommunikation Kanal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Kommunikation Kanal Type</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.CodeKommunikationKanalType
	 * @generated
	 */
	EClass getCodeKommunikationKanalType();

	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.kommunikation.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.basisnachricht.kommunikation.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.basisnachricht.kommunikation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.basisnachricht.kommunikation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.kommunikation.DocumentRoot#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.DocumentRoot#getErreichbarkeit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Erreichbarkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.kommunikation.KommunikationType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.KommunikationType
	 * @generated
	 */
	EClass getKommunikationType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.kommunikation.KommunikationType#getKanal <em>Kanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kanal</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.KommunikationType#getKanal()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EReference getKommunikationType_Kanal();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.kommunikation.KommunikationType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.KommunikationType#getKennung()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EAttribute getKommunikationType_Kennung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.kommunikation.KommunikationType#getZusatz <em>Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatz</em>'.
	 * @see de.xoev.basisnachricht.kommunikation.KommunikationType#getZusatz()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EAttribute getKommunikationType_Zusatz();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KommunikationFactory getKommunikationFactory();

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
		 * The meta object literal for the '{@link de.xoev.basisnachricht.kommunikation.impl.CodeKommunikationKanalTypeImpl <em>Code Kommunikation Kanal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.kommunikation.impl.CodeKommunikationKanalTypeImpl
		 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationPackageImpl#getCodeKommunikationKanalType()
		 * @generated
		 */
		EClass CODE_KOMMUNIKATION_KANAL_TYPE = eINSTANCE.getCodeKommunikationKanalType();

		/**
		 * The meta object literal for the '{@link de.xoev.basisnachricht.kommunikation.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.kommunikation.impl.DocumentRootImpl
		 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ERREICHBARKEIT = eINSTANCE.getDocumentRoot_Erreichbarkeit();

		/**
		 * The meta object literal for the '{@link de.xoev.basisnachricht.kommunikation.impl.KommunikationTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationTypeImpl
		 * @see de.xoev.basisnachricht.kommunikation.impl.KommunikationPackageImpl#getKommunikationType()
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

	}

} //KommunikationPackage
