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
package ee.jakarta.xml.ns.persistence;


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
 * <!-- begin-model-doc -->
 * 
 * 
 *      This is the XML Schema for the persistence configuration file.
 *      The file must be named "META-INF/persistence.xml" in the
 *      persistence archive.
 * 
 *      Persistence configuration files must indicate
 *      the persistence schema by using the persistence namespace:
 * 
 *      https://jakarta.ee/xml/ns/persistence
 * 
 *      and indicate the version of the schema by
 *      using the version element as shown below:
 * 
 *       <persistence xmlns="https://jakarta.ee/xml/ns/persistence"
 *         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *         xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence
 *           https://jakarta.ee/xml/ns/persistence/persistence_3_2.xsd"
 *         version="3.2">
 *           ...
 *       </persistence>
 * 
 *     
 * <!-- end-model-doc -->
 * @see ee.jakarta.xml.ns.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = PersistencePackage.eNS_URI, genModel = "/model/persistence_3_2.genmodel", genModelSourceLocations = {"model/persistence_3_2.genmodel","jakarta.persistence/model/persistence_3_2.genmodel"}, ecore="/model/persistence.ecore", ecoreSourceLocations="/model/persistence.ecore")
public interface PersistencePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jakarta.ee/xml/ns/persistence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.impl.DocumentRootImpl
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSISTENCE = 3;

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
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.impl.PersistenceTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistenceTypeImpl
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceType()
	 * @generated
	 */
	int PERSISTENCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE__PERSISTENCE_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.impl.PersistenceUnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistenceUnitTypeImpl
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitType()
	 * @generated
	 */
	int PERSISTENCE_UNIT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__QUALIFIER = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Jta Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__JTA_DATA_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Non Jta Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__NON_JTA_DATA_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Mapping File</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__MAPPING_FILE = 6;

	/**
	 * The feature id for the '<em><b>Jar File</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__JAR_FILE = 7;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__CLASS = 8;

	/**
	 * The feature id for the '<em><b>Exclude Unlisted Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__EXCLUDE_UNLISTED_CLASSES = 9;

	/**
	 * The feature id for the '<em><b>Shared Cache Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__SHARED_CACHE_MODE = 10;

	/**
	 * The feature id for the '<em><b>Validation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__VALIDATION_MODE = 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__PROPERTIES = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__ANY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__NAME = 14;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE__TRANSACTION_TYPE = 15;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.impl.PropertiesTypeImpl
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.impl.PropertyTypeImpl
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType <em>Unit Caching Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitCachingType()
	 * @generated
	 */
	int PERSISTENCE_UNIT_CACHING_TYPE = 5;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType <em>Unit Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitTransactionType()
	 * @generated
	 */
	int PERSISTENCE_UNIT_TRANSACTION_TYPE = 6;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType <em>Unit Validation Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitValidationModeType()
	 * @generated
	 */
	int PERSISTENCE_UNIT_VALIDATION_MODE_TYPE = 7;

	/**
	 * The meta object id for the '<em>Unit Caching Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitCachingTypeObject()
	 * @generated
	 */
	int PERSISTENCE_UNIT_CACHING_TYPE_OBJECT = 8;

	/**
	 * The meta object id for the '<em>Unit Transaction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitTransactionTypeObject()
	 * @generated
	 */
	int PERSISTENCE_UNIT_TRANSACTION_TYPE_OBJECT = 9;

	/**
	 * The meta object id for the '<em>Unit Validation Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitValidationModeTypeObject()
	 * @generated
	 */
	int PERSISTENCE_UNIT_VALIDATION_MODE_TYPE_OBJECT = 10;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see ee.jakarta.xml.ns.persistence.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see ee.jakarta.xml.ns.persistence.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link ee.jakarta.xml.ns.persistence.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see ee.jakarta.xml.ns.persistence.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link ee.jakarta.xml.ns.persistence.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see ee.jakarta.xml.ns.persistence.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.DocumentRoot#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence</em>'.
	 * @see ee.jakarta.xml.ns.persistence.DocumentRoot#getPersistence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Persistence();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.PersistenceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceType
	 * @generated
	 */
	EClass getPersistenceType();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.PersistenceType#getPersistenceUnit <em>Persistence Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceType#getPersistenceUnit()
	 * @see #getPersistenceType()
	 * @generated
	 */
	EReference getPersistenceType_PersistenceUnit();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceType#getVersion()
	 * @see #getPersistenceType()
	 * @generated
	 */
	EAttribute getPersistenceType_Version();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType
	 * @generated
	 */
	EClass getPersistenceUnitType();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getDescription()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProvider()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_Provider();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getQualifier()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getScope()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getJtaDataSource <em>Jta Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jta Data Source</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getJtaDataSource()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_JtaDataSource();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getNonJtaDataSource <em>Non Jta Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Jta Data Source</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getNonJtaDataSource()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_NonJtaDataSource();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getMappingFile <em>Mapping File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mapping File</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getMappingFile()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_MappingFile();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getJarFile <em>Jar File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Jar File</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getJarFile()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_JarFile();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getClass_()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_Class();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#isExcludeUnlistedClasses <em>Exclude Unlisted Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Unlisted Classes</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#isExcludeUnlistedClasses()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_ExcludeUnlistedClasses();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getSharedCacheMode <em>Shared Cache Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Cache Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getSharedCacheMode()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_SharedCacheMode();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getValidationMode <em>Validation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getValidationMode()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_ValidationMode();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProperties()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EReference getPersistenceUnitType_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getAny()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_Any();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getName()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitType#getTransactionType()
	 * @see #getPersistenceUnitType()
	 * @generated
	 */
	EAttribute getPersistenceUnitType_TransactionType();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.PropertiesType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PropertiesType#getProperty()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_Property();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType <em>Unit Caching Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Caching Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
	 * @generated
	 */
	EEnum getPersistenceUnitCachingType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType <em>Unit Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Transaction Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
	 * @generated
	 */
	EEnum getPersistenceUnitTransactionType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType <em>Unit Validation Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Validation Mode Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
	 * @generated
	 */
	EEnum getPersistenceUnitValidationModeType();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType <em>Unit Caching Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Caching Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType"
	 *        extendedMetaData="name='persistence-unit-caching-type:Object' baseType='persistence-unit-caching-type'"
	 * @generated
	 */
	EDataType getPersistenceUnitCachingTypeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType <em>Unit Transaction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Transaction Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType"
	 *        extendedMetaData="name='persistence-unit-transaction-type:Object' baseType='persistence-unit-transaction-type'"
	 * @generated
	 */
	EDataType getPersistenceUnitTransactionTypeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType <em>Unit Validation Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Validation Mode Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType"
	 *        extendedMetaData="name='persistence-unit-validation-mode-type:Object' baseType='persistence-unit-validation-mode-type'"
	 * @generated
	 */
	EDataType getPersistenceUnitValidationModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[0-9]+(\\.[0-9]+)*'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

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
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.impl.DocumentRootImpl
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSISTENCE = eINSTANCE.getDocumentRoot_Persistence();

		/**
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.impl.PersistenceTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistenceTypeImpl
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceType()
		 * @generated
		 */
		EClass PERSISTENCE_TYPE = eINSTANCE.getPersistenceType();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_TYPE__PERSISTENCE_UNIT = eINSTANCE.getPersistenceType_PersistenceUnit();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_TYPE__VERSION = eINSTANCE.getPersistenceType_Version();

		/**
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.impl.PersistenceUnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistenceUnitTypeImpl
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitType()
		 * @generated
		 */
		EClass PERSISTENCE_UNIT_TYPE = eINSTANCE.getPersistenceUnitType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__DESCRIPTION = eINSTANCE.getPersistenceUnitType_Description();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__PROVIDER = eINSTANCE.getPersistenceUnitType_Provider();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__QUALIFIER = eINSTANCE.getPersistenceUnitType_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__SCOPE = eINSTANCE.getPersistenceUnitType_Scope();

		/**
		 * The meta object literal for the '<em><b>Jta Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__JTA_DATA_SOURCE = eINSTANCE.getPersistenceUnitType_JtaDataSource();

		/**
		 * The meta object literal for the '<em><b>Non Jta Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__NON_JTA_DATA_SOURCE = eINSTANCE.getPersistenceUnitType_NonJtaDataSource();

		/**
		 * The meta object literal for the '<em><b>Mapping File</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__MAPPING_FILE = eINSTANCE.getPersistenceUnitType_MappingFile();

		/**
		 * The meta object literal for the '<em><b>Jar File</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__JAR_FILE = eINSTANCE.getPersistenceUnitType_JarFile();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__CLASS = eINSTANCE.getPersistenceUnitType_Class();

		/**
		 * The meta object literal for the '<em><b>Exclude Unlisted Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__EXCLUDE_UNLISTED_CLASSES = eINSTANCE.getPersistenceUnitType_ExcludeUnlistedClasses();

		/**
		 * The meta object literal for the '<em><b>Shared Cache Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__SHARED_CACHE_MODE = eINSTANCE.getPersistenceUnitType_SharedCacheMode();

		/**
		 * The meta object literal for the '<em><b>Validation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__VALIDATION_MODE = eINSTANCE.getPersistenceUnitType_ValidationMode();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT_TYPE__PROPERTIES = eINSTANCE.getPersistenceUnitType_Properties();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__ANY = eINSTANCE.getPersistenceUnitType_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__NAME = eINSTANCE.getPersistenceUnitType_Name();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_TYPE__TRANSACTION_TYPE = eINSTANCE.getPersistenceUnitType_TransactionType();

		/**
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.impl.PropertiesTypeImpl
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__PROPERTY = eINSTANCE.getPropertiesType_Property();

		/**
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.impl.PropertyTypeImpl
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType <em>Unit Caching Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitCachingType()
		 * @generated
		 */
		EEnum PERSISTENCE_UNIT_CACHING_TYPE = eINSTANCE.getPersistenceUnitCachingType();

		/**
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType <em>Unit Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitTransactionType()
		 * @generated
		 */
		EEnum PERSISTENCE_UNIT_TRANSACTION_TYPE = eINSTANCE.getPersistenceUnitTransactionType();

		/**
		 * The meta object literal for the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType <em>Unit Validation Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitValidationModeType()
		 * @generated
		 */
		EEnum PERSISTENCE_UNIT_VALIDATION_MODE_TYPE = eINSTANCE.getPersistenceUnitValidationModeType();

		/**
		 * The meta object literal for the '<em>Unit Caching Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitCachingTypeObject()
		 * @generated
		 */
		EDataType PERSISTENCE_UNIT_CACHING_TYPE_OBJECT = eINSTANCE.getPersistenceUnitCachingTypeObject();

		/**
		 * The meta object literal for the '<em>Unit Transaction Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitTransactionTypeObject()
		 * @generated
		 */
		EDataType PERSISTENCE_UNIT_TRANSACTION_TYPE_OBJECT = eINSTANCE.getPersistenceUnitTransactionTypeObject();

		/**
		 * The meta object literal for the '<em>Unit Validation Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getPersistenceUnitValidationModeTypeObject()
		 * @generated
		 */
		EDataType PERSISTENCE_UNIT_VALIDATION_MODE_TYPE_OBJECT = eINSTANCE.getPersistenceUnitValidationModeTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ee.jakarta.xml.ns.persistence.impl.PersistencePackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //PersistencePackage
