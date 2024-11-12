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
package de.xoev.basisnachricht.behoerde;


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
 * @see de.xoev.basisnachricht.behoerde.BehoerdeFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BehoerdePackage.eNS_URI, genModel = "/model/xoev-basisnachricht-behoerde.genmodel", genModelSourceLocations = {"model/xoev-basisnachricht-behoerde.genmodel","de.xoev.common/model/xoev-basisnachricht-behoerde.genmodel"}, ecore="/model/xoev-basisnachricht-behoerde.ecore", ecoreSourceLocations="/model/xoev-basisnachricht-behoerde.ecore")
public interface BehoerdePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behoerde";

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
	String eNS_PREFIX = "behoerde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehoerdePackage eINSTANCE = de.xoev.basisnachricht.behoerde.impl.BehoerdePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.behoerde.impl.BehoerdeTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.behoerde.impl.BehoerdeTypeImpl
	 * @see de.xoev.basisnachricht.behoerde.impl.BehoerdePackageImpl#getBehoerdeType()
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
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.basisnachricht.behoerde.impl.CodeVerzeichnisdienstTypeImpl <em>Code Verzeichnisdienst Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.basisnachricht.behoerde.impl.CodeVerzeichnisdienstTypeImpl
	 * @see de.xoev.basisnachricht.behoerde.impl.BehoerdePackageImpl#getCodeVerzeichnisdienstType()
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
	int CODE_VERZEICHNISDIENST_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Verzeichnisdienst Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Verzeichnisdienst Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERZEICHNISDIENST_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.behoerde.BehoerdeType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.xoev.basisnachricht.behoerde.BehoerdeType
	 * @generated
	 */
	EClass getBehoerdeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.basisnachricht.behoerde.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verzeichnisdienst</em>'.
	 * @see de.xoev.basisnachricht.behoerde.BehoerdeType#getVerzeichnisdienst()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EReference getBehoerdeType_Verzeichnisdienst();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.behoerde.BehoerdeType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.basisnachricht.behoerde.BehoerdeType#getKennung()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EAttribute getBehoerdeType_Kennung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.basisnachricht.behoerde.BehoerdeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.basisnachricht.behoerde.BehoerdeType#getName()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EAttribute getBehoerdeType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.basisnachricht.behoerde.BehoerdeType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.basisnachricht.behoerde.BehoerdeType#getErreichbarkeit()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EReference getBehoerdeType_Erreichbarkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.basisnachricht.behoerde.CodeVerzeichnisdienstType <em>Code Verzeichnisdienst Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Verzeichnisdienst Type</em>'.
	 * @see de.xoev.basisnachricht.behoerde.CodeVerzeichnisdienstType
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
	BehoerdeFactory getBehoerdeFactory();

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
		 * The meta object literal for the '{@link de.xoev.basisnachricht.behoerde.impl.BehoerdeTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.behoerde.impl.BehoerdeTypeImpl
		 * @see de.xoev.basisnachricht.behoerde.impl.BehoerdePackageImpl#getBehoerdeType()
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
		 * The meta object literal for the '{@link de.xoev.basisnachricht.behoerde.impl.CodeVerzeichnisdienstTypeImpl <em>Code Verzeichnisdienst Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.basisnachricht.behoerde.impl.CodeVerzeichnisdienstTypeImpl
		 * @see de.xoev.basisnachricht.behoerde.impl.BehoerdePackageImpl#getCodeVerzeichnisdienstType()
		 * @generated
		 */
		EClass CODE_VERZEICHNISDIENST_TYPE = eINSTANCE.getCodeVerzeichnisdienstType();

	}

} //BehoerdePackage
