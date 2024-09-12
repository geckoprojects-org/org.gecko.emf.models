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
package de.dwd.cdc.forecast.pointforecast;


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
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = PointforecastPackage.eNS_URI, genModel = "/model/cdc-forecast.genmodel", genModelSourceLocations = {"model/cdc-forecast.genmodel","de.dwd.cdc.forecast.model/model/cdc-forecast.genmodel"}, ecore="/model/cdc-forecast.ecore", ecoreSourceLocations="/model/cdc-forecast.ecore")
public interface PointforecastPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pointforecast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://opendata.dwd.de/weather/lib/pointforecast_dwd_extension_V1_0.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forecast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PointforecastPackage eINSTANCE = de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.DocumentRootImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Forecast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORECAST = 3;

	/**
	 * The feature id for the '<em><b>Product Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_DEFINITION = 4;

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
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ForecastTimeStepsTypeImpl <em>Forecast Time Steps Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.ForecastTimeStepsTypeImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getForecastTimeStepsType()
	 * @generated
	 */
	int FORECAST_TIME_STEPS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_TIME_STEPS_TYPE__TIME_STEP = 0;

	/**
	 * The number of structural features of the '<em>Forecast Time Steps Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_TIME_STEPS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Forecast Time Steps Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_TIME_STEPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ForecastTypeImpl <em>Forecast Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.ForecastTypeImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getForecastType()
	 * @generated
	 */
	int FORECAST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_TYPE__ELEMENT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Forecast Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Forecast Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORECAST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.FormatCfgTypeImpl <em>Format Cfg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.FormatCfgTypeImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFormatCfgType()
	 * @generated
	 */
	int FORMAT_CFG_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Default Undef Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN = 0;

	/**
	 * The number of structural features of the '<em>Format Cfg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_CFG_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Format Cfg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_CFG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.ModelTypeImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reference Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__REFERENCE_TIME = 1;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl <em>Product Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getProductDefinitionType()
	 * @generated
	 */
	int PRODUCT_DEFINITION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__ISSUER = 0;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__PRODUCT_ID = 1;

	/**
	 * The feature id for the '<em><b>Generating Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Issue Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__ISSUE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Referenced Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Forecast Time Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS = 5;

	/**
	 * The feature id for the '<em><b>Format Cfg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__FORMAT_CFG = 6;

	/**
	 * The feature id for the '<em><b>Met Element Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION = 7;

	/**
	 * The number of structural features of the '<em>Product Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Product Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ReferencedModelTypeImpl <em>Referenced Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.ReferencedModelTypeImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getReferencedModelType()
	 * @generated
	 */
	int REFERENCED_MODEL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_TYPE__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Referenced Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Referenced Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.ValueTypeImpl
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.forecast.pointforecast.ProductIDType <em>Product ID Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getProductIDType()
	 * @generated
	 */
	int PRODUCT_ID_TYPE = 8;

	/**
	 * The meta object id for the '<em>Float List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatList()
	 * @generated
	 */
	int FLOAT_LIST = 9;

	/**
	 * The meta object id for the '<em>Float With New Undef Sign</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSign()
	 * @generated
	 */
	int FLOAT_WITH_NEW_UNDEF_SIGN = 10;

	/**
	 * The meta object id for the '<em>Float With New Undef Sign Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSignMember0()
	 * @generated
	 */
	int FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0 = 11;

	/**
	 * The meta object id for the '<em>Float With New Undef Sign Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSignMember0Object()
	 * @generated
	 */
	int FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Float With New Undef Sign Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSignMember1()
	 * @generated
	 */
	int FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1 = 13;

	/**
	 * The meta object id for the '<em>Product ID Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getProductIDTypeObject()
	 * @generated
	 */
	int PRODUCT_ID_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Undef Char</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getUndefChar()
	 * @generated
	 */
	int UNDEF_CHAR = 15;


	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getForecast <em>Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forecast</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.DocumentRoot#getForecast()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Forecast();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getProductDefinition <em>Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Definition</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.DocumentRoot#getProductDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProductDefinition();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType <em>Forecast Time Steps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forecast Time Steps Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType
	 * @generated
	 */
	EClass getForecastTimeStepsType();

	/**
	 * Returns the meta object for the attribute list '{@link de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Step</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType#getTimeStep()
	 * @see #getForecastTimeStepsType()
	 * @generated
	 */
	EAttribute getForecastTimeStepsType_TimeStep();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.ForecastType <em>Forecast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forecast Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ForecastType
	 * @generated
	 */
	EClass getForecastType();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.forecast.pointforecast.ForecastType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ForecastType#getValue()
	 * @see #getForecastType()
	 * @generated
	 */
	EReference getForecastType_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ForecastType#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ForecastType#getElementName()
	 * @see #getForecastType()
	 * @generated
	 */
	EAttribute getForecastType_ElementName();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.FormatCfgType <em>Format Cfg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format Cfg Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.FormatCfgType
	 * @generated
	 */
	EClass getFormatCfgType();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.FormatCfgType#getDefaultUndefSign <em>Default Undef Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Undef Sign</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.FormatCfgType#getDefaultUndefSign()
	 * @see #getFormatCfgType()
	 * @generated
	 */
	EAttribute getFormatCfgType_DefaultUndefSign();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ModelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ModelType#getName()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ModelType#getReferenceTime <em>Reference Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Time</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ModelType#getReferenceTime()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_ReferenceTime();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType <em>Product Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Definition Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType
	 * @generated
	 */
	EClass getProductDefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssuer()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EAttribute getProductDefinitionType_Issuer();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getProductID()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EAttribute getProductDefinitionType_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getGeneratingProcess <em>Generating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generating Process</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getGeneratingProcess()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EAttribute getProductDefinitionType_GeneratingProcess();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssueTime <em>Issue Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Time</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssueTime()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EAttribute getProductDefinitionType_IssueTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Model</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getReferencedModel()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EReference getProductDefinitionType_ReferencedModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getForecastTimeSteps <em>Forecast Time Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forecast Time Steps</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getForecastTimeSteps()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EReference getProductDefinitionType_ForecastTimeSteps();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getFormatCfg <em>Format Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format Cfg</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getFormatCfg()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EReference getProductDefinitionType_FormatCfg();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getMetElementDefinition <em>Met Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Met Element Definition</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getMetElementDefinition()
	 * @see #getProductDefinitionType()
	 * @generated
	 */
	EAttribute getProductDefinitionType_MetElementDefinition();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.ReferencedModelType <em>Referenced Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Model Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ReferencedModelType
	 * @generated
	 */
	EClass getReferencedModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dwd.cdc.forecast.pointforecast.ReferencedModelType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ReferencedModelType#getModel()
	 * @see #getReferencedModelType()
	 * @generated
	 */
	EReference getReferencedModelType_Model();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.forecast.pointforecast.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.forecast.pointforecast.ValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ValueType#getValue()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Value();

	/**
	 * Returns the meta object for enum '{@link de.dwd.cdc.forecast.pointforecast.ProductIDType <em>Product ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product ID Type</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
	 * @generated
	 */
	EEnum getProductIDType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Float List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='floatList' itemType='floatWithNewUndefSign'"
	 * @generated
	 */
	EDataType getFloatList();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Float With New Undef Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float With New Undef Sign</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='floatWithNewUndefSign' memberTypes='floatWithNewUndefSign_._member_._0 floatWithNewUndefSign_._member_._1'"
	 * @generated
	 */
	EDataType getFloatWithNewUndefSign();

	/**
	 * Returns the meta object for data type '<em>Float With New Undef Sign Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float With New Undef Sign Member0</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='floatWithNewUndefSign_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#float'"
	 * @generated
	 */
	EDataType getFloatWithNewUndefSignMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Float With New Undef Sign Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float With New Undef Sign Member0 Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='floatWithNewUndefSign_._member_._0:Object' baseType='floatWithNewUndefSign_._member_._0'"
	 * @generated
	 */
	EDataType getFloatWithNewUndefSignMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Float With New Undef Sign Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float With New Undef Sign Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='floatWithNewUndefSign_._member_._1' baseType='UndefChar'"
	 * @generated
	 */
	EDataType getFloatWithNewUndefSignMember1();

	/**
	 * Returns the meta object for data type '{@link de.dwd.cdc.forecast.pointforecast.ProductIDType <em>Product ID Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product ID Type Object</em>'.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
	 * @model instanceClass="de.dwd.cdc.forecast.pointforecast.ProductIDType"
	 *        extendedMetaData="name='ProductID_._type:Object' baseType='ProductID_._type'"
	 * @generated
	 */
	EDataType getProductIDTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Undef Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Undef Char</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UndefChar' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='1'"
	 * @generated
	 */
	EDataType getUndefChar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PointforecastFactory getPointforecastFactory();

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
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.DocumentRootImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Forecast</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORECAST = eINSTANCE.getDocumentRoot_Forecast();

		/**
		 * The meta object literal for the '<em><b>Product Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRODUCT_DEFINITION = eINSTANCE.getDocumentRoot_ProductDefinition();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ForecastTimeStepsTypeImpl <em>Forecast Time Steps Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.ForecastTimeStepsTypeImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getForecastTimeStepsType()
		 * @generated
		 */
		EClass FORECAST_TIME_STEPS_TYPE = eINSTANCE.getForecastTimeStepsType();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_TIME_STEPS_TYPE__TIME_STEP = eINSTANCE.getForecastTimeStepsType_TimeStep();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ForecastTypeImpl <em>Forecast Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.ForecastTypeImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getForecastType()
		 * @generated
		 */
		EClass FORECAST_TYPE = eINSTANCE.getForecastType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORECAST_TYPE__VALUE = eINSTANCE.getForecastType_Value();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORECAST_TYPE__ELEMENT_NAME = eINSTANCE.getForecastType_ElementName();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.FormatCfgTypeImpl <em>Format Cfg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.FormatCfgTypeImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFormatCfgType()
		 * @generated
		 */
		EClass FORMAT_CFG_TYPE = eINSTANCE.getFormatCfgType();

		/**
		 * The meta object literal for the '<em><b>Default Undef Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN = eINSTANCE.getFormatCfgType_DefaultUndefSign();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.ModelTypeImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__NAME = eINSTANCE.getModelType_Name();

		/**
		 * The meta object literal for the '<em><b>Reference Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__REFERENCE_TIME = eINSTANCE.getModelType_ReferenceTime();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl <em>Product Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.ProductDefinitionTypeImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getProductDefinitionType()
		 * @generated
		 */
		EClass PRODUCT_DEFINITION_TYPE = eINSTANCE.getProductDefinitionType();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DEFINITION_TYPE__ISSUER = eINSTANCE.getProductDefinitionType_Issuer();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DEFINITION_TYPE__PRODUCT_ID = eINSTANCE.getProductDefinitionType_ProductID();

		/**
		 * The meta object literal for the '<em><b>Generating Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DEFINITION_TYPE__GENERATING_PROCESS = eINSTANCE.getProductDefinitionType_GeneratingProcess();

		/**
		 * The meta object literal for the '<em><b>Issue Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DEFINITION_TYPE__ISSUE_TIME = eINSTANCE.getProductDefinitionType_IssueTime();

		/**
		 * The meta object literal for the '<em><b>Referenced Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DEFINITION_TYPE__REFERENCED_MODEL = eINSTANCE.getProductDefinitionType_ReferencedModel();

		/**
		 * The meta object literal for the '<em><b>Forecast Time Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DEFINITION_TYPE__FORECAST_TIME_STEPS = eINSTANCE.getProductDefinitionType_ForecastTimeSteps();

		/**
		 * The meta object literal for the '<em><b>Format Cfg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DEFINITION_TYPE__FORMAT_CFG = eINSTANCE.getProductDefinitionType_FormatCfg();

		/**
		 * The meta object literal for the '<em><b>Met Element Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DEFINITION_TYPE__MET_ELEMENT_DEFINITION = eINSTANCE.getProductDefinitionType_MetElementDefinition();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ReferencedModelTypeImpl <em>Referenced Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.ReferencedModelTypeImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getReferencedModelType()
		 * @generated
		 */
		EClass REFERENCED_MODEL_TYPE = eINSTANCE.getReferencedModelType();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_MODEL_TYPE__MODEL = eINSTANCE.getReferencedModelType_Model();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.ValueTypeImpl
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__VALUE = eINSTANCE.getValueType_Value();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.forecast.pointforecast.ProductIDType <em>Product ID Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getProductIDType()
		 * @generated
		 */
		EEnum PRODUCT_ID_TYPE = eINSTANCE.getProductIDType();

		/**
		 * The meta object literal for the '<em>Float List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatList()
		 * @generated
		 */
		EDataType FLOAT_LIST = eINSTANCE.getFloatList();

		/**
		 * The meta object literal for the '<em>Float With New Undef Sign</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSign()
		 * @generated
		 */
		EDataType FLOAT_WITH_NEW_UNDEF_SIGN = eINSTANCE.getFloatWithNewUndefSign();

		/**
		 * The meta object literal for the '<em>Float With New Undef Sign Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSignMember0()
		 * @generated
		 */
		EDataType FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0 = eINSTANCE.getFloatWithNewUndefSignMember0();

		/**
		 * The meta object literal for the '<em>Float With New Undef Sign Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSignMember0Object()
		 * @generated
		 */
		EDataType FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0_OBJECT = eINSTANCE.getFloatWithNewUndefSignMember0Object();

		/**
		 * The meta object literal for the '<em>Float With New Undef Sign Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getFloatWithNewUndefSignMember1()
		 * @generated
		 */
		EDataType FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1 = eINSTANCE.getFloatWithNewUndefSignMember1();

		/**
		 * The meta object literal for the '<em>Product ID Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getProductIDTypeObject()
		 * @generated
		 */
		EDataType PRODUCT_ID_TYPE_OBJECT = eINSTANCE.getProductIDTypeObject();

		/**
		 * The meta object literal for the '<em>Undef Char</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dwd.cdc.forecast.pointforecast.impl.PointforecastPackageImpl#getUndefChar()
		 * @generated
		 */
		EDataType UNDEF_CHAR = eINSTANCE.getUndefChar();

	}

} //PointforecastPackage
