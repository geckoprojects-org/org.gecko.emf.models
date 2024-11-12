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
package de.xoev.datentyp.din91379;


import org.eclipse.emf.ecore.EDataType;

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
 * @see de.xoev.datentyp.din91379.DIN91379Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DIN91379Package.eNS_URI, genModel = "/model/din-91379-datatypes.genmodel", genModelSourceLocations = {"model/din-91379-datatypes.genmodel","de.xoev.common/model/din-91379-datatypes.genmodel"}, ecore="/model/din-91379-datatypes.ecore", ecoreSourceLocations="/model/din-91379-datatypes.ecore")
public interface DIN91379Package extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "din91379";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "din91379";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DIN91379Package eINSTANCE = de.xoev.datentyp.din91379.impl.DIN91379PackageImpl.init();

	/**
	 * The meta object id for the '<em>Datatype A</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeA()
	 * @generated
	 */
	int DATATYPE_A = 0;

	/**
	 * The meta object id for the '<em>Datatype B</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeB()
	 * @generated
	 */
	int DATATYPE_B = 1;

	/**
	 * The meta object id for the '<em>Datatype C</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeC()
	 * @generated
	 */
	int DATATYPE_C = 2;

	/**
	 * The meta object id for the '<em>Datatype D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeD()
	 * @generated
	 */
	int DATATYPE_D = 3;

	/**
	 * The meta object id for the '<em>Datatype E</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeE()
	 * @generated
	 */
	int DATATYPE_E = 4;


	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp A gibt wieder, welche Schriftzeichen in hoheitlichen Dokumenten für Namen natürlicher Personen verwendet werden.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype A</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeA' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDatatypeA();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp B wurde vor allem für sonstige Namen, wie z. B. Ortsnamen und Straßennamen mit Hausnummer, entworfen.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype B</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeB' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDatatypeB();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp C wurde für alle normativen Schriftzeichen der DIN SPEC entworfen. Er ist somit die technische Umsetzung der Schnittstellenvereinbarung Alle nach DIN SPEC 91379 normativen Schriftzeichen. Texte mit griechischen oder kyrillischen Buchstaben oder mit erweiterten (nicht-normativen) Nicht-Buchstaben sind unzulässig.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype C</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeC' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDatatypeC();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp D wurde vor allem für Namen juristischer Personen und für Produktnamen entworfen.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype D</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeD' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDatatypeD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Datatype E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp E wurde für alle normativen und erweiterten Schriftzeichen der DIN SPEC entworfen. Ein Einsatzgebiet dieses Datentyps kann der grenzüberschreitende Datenaustausch sein, wenn auch griechische und kyrillische Buchstaben benötigt werden. Er ist somit die technische Umsetzung der Schnittstellenvereinbarung Alle nach DIN SPEC 91379 normativen und nicht-normativen Schriftzeichen. Texte mit Buchstaben oder Nicht-Buchstaben, die in der DIN SPEC nicht enthalten sind, wie z. B. asiatische oder arabische Buchstaben, sind unzulässig.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Datatype E</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='datatypeE' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDatatypeE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DIN91379Factory getDIN91379Factory();

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
		 * The meta object literal for the '<em>Datatype A</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeA()
		 * @generated
		 */
		EDataType DATATYPE_A = eINSTANCE.getDatatypeA();

		/**
		 * The meta object literal for the '<em>Datatype B</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeB()
		 * @generated
		 */
		EDataType DATATYPE_B = eINSTANCE.getDatatypeB();

		/**
		 * The meta object literal for the '<em>Datatype C</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeC()
		 * @generated
		 */
		EDataType DATATYPE_C = eINSTANCE.getDatatypeC();

		/**
		 * The meta object literal for the '<em>Datatype D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeD()
		 * @generated
		 */
		EDataType DATATYPE_D = eINSTANCE.getDatatypeD();

		/**
		 * The meta object literal for the '<em>Datatype E</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.datentyp.din91379.impl.DIN91379PackageImpl#getDatatypeE()
		 * @generated
		 */
		EDataType DATATYPE_E = eINSTANCE.getDatatypeE();

	}

} //DIN91379Package
