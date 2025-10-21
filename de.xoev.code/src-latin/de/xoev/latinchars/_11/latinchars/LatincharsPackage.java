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
package de.xoev.latinchars._11.latinchars;


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
 * Diese Schema-Datei ist Bestandteil des von der KoSIT in XÖV herausgebenen Standards "Lateinische Zeichen in Unicode".
 * <!-- end-model-doc -->
 * @see de.xoev.latinchars._11.latinchars.LatincharsFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = LatincharsPackage.eNS_URI, genModel = "/model/latinchars.genmodel", genModelSourceLocations = {"model/latinchars.genmodel","de.xoev.code/model/latinchars.genmodel"}, ecore="/model/latinchars.ecore", ecoreSourceLocations="/model/latinchars.ecore")
public interface LatincharsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "latinchars";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xoev.de/latinchars/1_1/datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "latinchars";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LatincharsPackage eINSTANCE = de.xoev.latinchars._11.latinchars.impl.LatincharsPackageImpl.init();

	/**
	 * The meta object id for the '<em>String Latin</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.latinchars._11.latinchars.impl.LatincharsPackageImpl#getStringLatin()
	 * @generated
	 */
	int STRING_LATIN = 0;


	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Latin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Einschränkung auf lateinischen Zeichen.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>String Latin</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='String.Latin' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(([\t-\n\r%20-~\241-\254\256-\u0107\u010a-\u011b\u011e-\u0123\u0126-\u0131\u0134-\u015b\u015e-\u016b\u016e-\u017e\u018f\u01a0-\u01a1\u01af-\u01b0\u01b7\u01cd-\u01d4\u01de-\u01df\u01e4-\u01f0\u01f4-\u01f5\u01fa-\u01ff\u0218-\u021b\u021e-\u021f\u022a-\u022b\u022e-\u0233\u0259\u0292\u1e02-\u1e03\u1e0a-\u1e0b\u1e10-\u1e11\u1e1e-\u1e21\u1e24-\u1e27\u1e30-\u1e31\u1e40-\u1e41\u1e44-\u1e45\u1e56-\u1e57\u1e60-\u1e63\u1e6a-\u1e6b\u1e80-\u1e85\u1e8c-\u1e93\u1e9e\u1ea0-\u1ea7\u1eaa-\u1eac\u1eae-\u1ec1\u1ec4-\u1ed3\u1ed6-\u1edd\u1ee4-\u1ef9\u20ac])|(M\u0302|N\u0302|m\u0302|n\u0302|D\u0302|d\u0302|J\u030c|L\u0302|l\u0302))*'"
	 * @generated
	 */
	EDataType getStringLatin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LatincharsFactory getLatincharsFactory();

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
		 * The meta object literal for the '<em>String Latin</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.latinchars._11.latinchars.impl.LatincharsPackageImpl#getStringLatin()
		 * @generated
		 */
		EDataType STRING_LATIN = eINSTANCE.getStringLatin();

	}

} //LatincharsPackage
