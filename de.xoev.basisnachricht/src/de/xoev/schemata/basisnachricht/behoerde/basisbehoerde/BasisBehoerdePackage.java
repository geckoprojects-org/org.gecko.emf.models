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
package de.xoev.schemata.basisnachricht.behoerde.basisbehoerde;


import de.xoev.schemata.code.code.Code10Package;

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
 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BasisBehoerdeFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BasisBehoerdePackage.eNS_URI, genModel = "/model/basisnachricht.genmodel", genModelSourceLocations = {"model/basisnachricht.genmodel","de.xoev.basisnachricht/model/basisnachricht.genmodel"}, ecore="/model/basisnachricht-behoerde.ecore", ecoreSourceLocations="/model/basisnachricht-behoerde.ecore")
public interface BasisBehoerdePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basisbehoerde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xoev.de/schemata/basisnachricht/behoerde/1_0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basisbehoerde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasisBehoerdePackage eINSTANCE = de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BehoerdeTypeImpl <em>Behoerde Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BehoerdeTypeImpl
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdePackageImpl#getBehoerdeType()
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
	 * The meta object id for the '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.CodeVerzeichnisdienstTypeImpl <em>Code Verzeichnisdienst Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.CodeVerzeichnisdienstTypeImpl
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdePackageImpl#getCodeVerzeichnisdienstType()
	 * @generated
	 */
	int CODE_VERZEICHNISDIENST_TYPE = 1;

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
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType <em>Behoerde Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behoerde Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType
	 * @generated
	 */
	EClass getBehoerdeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verzeichnisdienst</em>'.
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getVerzeichnisdienst()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EReference getBehoerdeType_Verzeichnisdienst();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getKennung()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EAttribute getBehoerdeType_Kennung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getName()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EAttribute getBehoerdeType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType#getErreichbarkeit()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EReference getBehoerdeType_Erreichbarkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.CodeVerzeichnisdienstType <em>Code Verzeichnisdienst Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Verzeichnisdienst Type</em>'.
	 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.CodeVerzeichnisdienstType
	 * @generated
	 */
	EClass getCodeVerzeichnisdienstType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasisBehoerdeFactory getBasisBehoerdeFactory();

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
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BehoerdeTypeImpl <em>Behoerde Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BehoerdeTypeImpl
		 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdePackageImpl#getBehoerdeType()
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
		 * The meta object literal for the '{@link de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.CodeVerzeichnisdienstTypeImpl <em>Code Verzeichnisdienst Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.CodeVerzeichnisdienstTypeImpl
		 * @see de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdePackageImpl#getCodeVerzeichnisdienstType()
		 * @generated
		 */
		EClass CODE_VERZEICHNISDIENST_TYPE = eINSTANCE.getCodeVerzeichnisdienstType();

	}

} //BasisBehoerdePackage
