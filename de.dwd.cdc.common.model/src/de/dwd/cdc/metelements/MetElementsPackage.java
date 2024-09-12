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
package de.dwd.cdc.metelements;


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
 * @see de.dwd.cdc.metelements.MetElementsFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
@ProviderType
@EPackage(uri = MetElementsPackage.eNS_URI, genModel = "/model/met-elements.genmodel", genModelSourceLocations = {"model/met-elements.genmodel","de.dwd.cdc.common.model/model/met-elements.genmodel"}, ecore="/model/met-elements.ecore", ecoreSourceLocations="/model/met-elements.ecore")
public interface MetElementsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metelements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cdc.dwd.de/common/metelements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MetElementDefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetElementsPackage eINSTANCE = de.dwd.cdc.metelements.impl.MetElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dwd.cdc.metelements.impl.MetDefRootImpl <em>Met Def Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.metelements.impl.MetDefRootImpl
	 * @see de.dwd.cdc.metelements.impl.MetElementsPackageImpl#getMetDefRoot()
	 * @generated
	 */
	int MET_DEF_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_DEF_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_DEF_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_DEF_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Met Element Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_DEF_ROOT__MET_ELEMENT_DEFINITION = 3;

	/**
	 * The number of structural features of the '<em>Met Def Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_DEF_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Met Def Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_DEF_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.metelements.impl.MetElementDefinitionTypeImpl <em>Met Element Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.metelements.impl.MetElementDefinitionTypeImpl
	 * @see de.dwd.cdc.metelements.impl.MetElementsPackageImpl#getMetElementDefinitionType()
	 * @generated
	 */
	int MET_ELEMENT_DEFINITION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Met Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Met Element Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_DEFINITION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Met Element Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.metelements.impl.MetElementTypeImpl <em>Met Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.metelements.impl.MetElementTypeImpl
	 * @see de.dwd.cdc.metelements.impl.MetElementsPackageImpl#getMetElementType()
	 * @generated
	 */
	int MET_ELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_TYPE__SHORT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit Of Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Met Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Met Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MET_ELEMENT_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.metelements.MetDefRoot <em>Met Def Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Met Def Root</em>'.
	 * @see de.dwd.cdc.metelements.MetDefRoot
	 * @generated
	 */
	EClass getMetDefRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.dwd.cdc.metelements.MetDefRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dwd.cdc.metelements.MetDefRoot#getMixed()
	 * @see #getMetDefRoot()
	 * @generated
	 */
	EAttribute getMetDefRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.dwd.cdc.metelements.MetDefRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.dwd.cdc.metelements.MetDefRoot#getXMLNSPrefixMap()
	 * @see #getMetDefRoot()
	 * @generated
	 */
	EReference getMetDefRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.dwd.cdc.metelements.MetDefRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.dwd.cdc.metelements.MetDefRoot#getXSISchemaLocation()
	 * @see #getMetDefRoot()
	 * @generated
	 */
	EReference getMetDefRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.metelements.MetDefRoot#getMetElementDefinition <em>Met Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Met Element Definition</em>'.
	 * @see de.dwd.cdc.metelements.MetDefRoot#getMetElementDefinition()
	 * @see #getMetDefRoot()
	 * @generated
	 */
	EReference getMetDefRoot_MetElementDefinition();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.metelements.MetElementDefinitionType <em>Met Element Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Met Element Definition Type</em>'.
	 * @see de.dwd.cdc.metelements.MetElementDefinitionType
	 * @generated
	 */
	EClass getMetElementDefinitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dwd.cdc.metelements.MetElementDefinitionType#getMetElement <em>Met Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Met Element</em>'.
	 * @see de.dwd.cdc.metelements.MetElementDefinitionType#getMetElement()
	 * @see #getMetElementDefinitionType()
	 * @generated
	 */
	EReference getMetElementDefinitionType_MetElement();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.metelements.MetElementType <em>Met Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Met Element Type</em>'.
	 * @see de.dwd.cdc.metelements.MetElementType
	 * @generated
	 */
	EClass getMetElementType();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.metelements.MetElementType#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see de.dwd.cdc.metelements.MetElementType#getShortName()
	 * @see #getMetElementType()
	 * @generated
	 */
	EAttribute getMetElementType_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.metelements.MetElementType#getUnitOfMeasurement <em>Unit Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measurement</em>'.
	 * @see de.dwd.cdc.metelements.MetElementType#getUnitOfMeasurement()
	 * @see #getMetElementType()
	 * @generated
	 */
	EAttribute getMetElementType_UnitOfMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.metelements.MetElementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dwd.cdc.metelements.MetElementType#getDescription()
	 * @see #getMetElementType()
	 * @generated
	 */
	EAttribute getMetElementType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetElementsFactory getMetElementsFactory();

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
		 * The meta object literal for the '{@link de.dwd.cdc.metelements.impl.MetDefRootImpl <em>Met Def Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.metelements.impl.MetDefRootImpl
		 * @see de.dwd.cdc.metelements.impl.MetElementsPackageImpl#getMetDefRoot()
		 * @generated
		 */
		EClass MET_DEF_ROOT = eINSTANCE.getMetDefRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MET_DEF_ROOT__MIXED = eINSTANCE.getMetDefRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MET_DEF_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getMetDefRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MET_DEF_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getMetDefRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Met Element Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MET_DEF_ROOT__MET_ELEMENT_DEFINITION = eINSTANCE.getMetDefRoot_MetElementDefinition();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.metelements.impl.MetElementDefinitionTypeImpl <em>Met Element Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.metelements.impl.MetElementDefinitionTypeImpl
		 * @see de.dwd.cdc.metelements.impl.MetElementsPackageImpl#getMetElementDefinitionType()
		 * @generated
		 */
		EClass MET_ELEMENT_DEFINITION_TYPE = eINSTANCE.getMetElementDefinitionType();

		/**
		 * The meta object literal for the '<em><b>Met Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT = eINSTANCE.getMetElementDefinitionType_MetElement();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.metelements.impl.MetElementTypeImpl <em>Met Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.metelements.impl.MetElementTypeImpl
		 * @see de.dwd.cdc.metelements.impl.MetElementsPackageImpl#getMetElementType()
		 * @generated
		 */
		EClass MET_ELEMENT_TYPE = eINSTANCE.getMetElementType();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MET_ELEMENT_TYPE__SHORT_NAME = eINSTANCE.getMetElementType_ShortName();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT = eINSTANCE.getMetElementType_UnitOfMeasurement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MET_ELEMENT_TYPE__DESCRIPTION = eINSTANCE.getMetElementType_Description();

	}

} //MetElementsPackage
