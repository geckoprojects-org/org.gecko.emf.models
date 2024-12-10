/**
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
package ee.jakarta.xml.ns.persistence.impl;

import ee.jakarta.xml.ns.persistence.DocumentRoot;
import ee.jakarta.xml.ns.persistence.PersistenceFactory;
import ee.jakarta.xml.ns.persistence.PersistencePackage;
import ee.jakarta.xml.ns.persistence.PersistenceType;
import ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType;
import ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType;
import ee.jakarta.xml.ns.persistence.PersistenceUnitType;
import ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType;
import ee.jakarta.xml.ns.persistence.PropertiesType;
import ee.jakarta.xml.ns.persistence.PropertyType;

import ee.jakarta.xml.ns.persistence.orm.OrmPackage;

import ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl;

import ee.jakarta.xml.ns.persistence.util.PersistenceValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistencePackageImpl extends EPackageImpl implements PersistencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceUnitCachingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceUnitTransactionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceUnitValidationModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType persistenceUnitCachingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType persistenceUnitTransactionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType persistenceUnitValidationModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersistencePackageImpl() {
		super(eNS_URI, PersistenceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PersistencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersistencePackage init() {
		if (isInited) return (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPersistencePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PersistencePackageImpl thePersistencePackage = registeredPersistencePackage instanceof PersistencePackageImpl ? (PersistencePackageImpl)registeredPersistencePackage : new PersistencePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);
		OrmPackageImpl theOrmPackage = (OrmPackageImpl)(registeredPackage instanceof OrmPackageImpl ? registeredPackage : OrmPackage.eINSTANCE);

		// Load packages
		theOrmPackage.loadPackage();

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();

		// Fix loaded packages
		theOrmPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePersistencePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return PersistenceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePersistencePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, thePersistencePackage);
		return thePersistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Persistence() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistenceType() {
		return persistenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistenceType_PersistenceUnit() {
		return (EReference)persistenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceType_Version() {
		return (EAttribute)persistenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistenceUnitType() {
		return persistenceUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_Description() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_Provider() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_Qualifier() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_Scope() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_JtaDataSource() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_NonJtaDataSource() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_MappingFile() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_JarFile() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_Class() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_ExcludeUnlistedClasses() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_SharedCacheMode() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_ValidationMode() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistenceUnitType_Properties() {
		return (EReference)persistenceUnitTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_Any() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_Name() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceUnitType_TransactionType() {
		return (EAttribute)persistenceUnitTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertiesType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertiesType_Property() {
		return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyType_Name() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyType_Value() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPersistenceUnitCachingType() {
		return persistenceUnitCachingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPersistenceUnitTransactionType() {
		return persistenceUnitTransactionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPersistenceUnitValidationModeType() {
		return persistenceUnitValidationModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPersistenceUnitCachingTypeObject() {
		return persistenceUnitCachingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPersistenceUnitTransactionTypeObject() {
		return persistenceUnitTransactionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPersistenceUnitValidationModeTypeObject() {
		return persistenceUnitValidationModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistenceFactory getPersistenceFactory() {
		return (PersistenceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSISTENCE);

		persistenceTypeEClass = createEClass(PERSISTENCE_TYPE);
		createEReference(persistenceTypeEClass, PERSISTENCE_TYPE__PERSISTENCE_UNIT);
		createEAttribute(persistenceTypeEClass, PERSISTENCE_TYPE__VERSION);

		persistenceUnitTypeEClass = createEClass(PERSISTENCE_UNIT_TYPE);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__DESCRIPTION);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__PROVIDER);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__QUALIFIER);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__SCOPE);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__JTA_DATA_SOURCE);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__NON_JTA_DATA_SOURCE);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__MAPPING_FILE);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__JAR_FILE);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__CLASS);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__EXCLUDE_UNLISTED_CLASSES);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__SHARED_CACHE_MODE);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__VALIDATION_MODE);
		createEReference(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__PROPERTIES);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__ANY);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__NAME);
		createEAttribute(persistenceUnitTypeEClass, PERSISTENCE_UNIT_TYPE__TRANSACTION_TYPE);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEReference(propertiesTypeEClass, PROPERTIES_TYPE__PROPERTY);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);

		// Create enums
		persistenceUnitCachingTypeEEnum = createEEnum(PERSISTENCE_UNIT_CACHING_TYPE);
		persistenceUnitTransactionTypeEEnum = createEEnum(PERSISTENCE_UNIT_TRANSACTION_TYPE);
		persistenceUnitValidationModeTypeEEnum = createEEnum(PERSISTENCE_UNIT_VALIDATION_MODE_TYPE);

		// Create data types
		persistenceUnitCachingTypeObjectEDataType = createEDataType(PERSISTENCE_UNIT_CACHING_TYPE_OBJECT);
		persistenceUnitTransactionTypeObjectEDataType = createEDataType(PERSISTENCE_UNIT_TRANSACTION_TYPE_OBJECT);
		persistenceUnitValidationModeTypeObjectEDataType = createEDataType(PERSISTENCE_UNIT_VALIDATION_MODE_TYPE_OBJECT);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Persistence(), this.getPersistenceType(), null, "persistence", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(persistenceTypeEClass, PersistenceType.class, "PersistenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistenceType_PersistenceUnit(), this.getPersistenceUnitType(), null, "persistenceUnit", null, 1, -1, PersistenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceType_Version(), this.getVersionType(), "version", "3.2", 1, 1, PersistenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceUnitTypeEClass, PersistenceUnitType.class, "PersistenceUnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceUnitType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_Provider(), theXMLTypePackage.getString(), "provider", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_Qualifier(), theXMLTypePackage.getString(), "qualifier", null, 0, -1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_Scope(), theXMLTypePackage.getString(), "scope", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_JtaDataSource(), theXMLTypePackage.getString(), "jtaDataSource", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_NonJtaDataSource(), theXMLTypePackage.getString(), "nonJtaDataSource", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_MappingFile(), theXMLTypePackage.getString(), "mappingFile", null, 0, -1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_JarFile(), theXMLTypePackage.getString(), "jarFile", null, 0, -1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_Class(), theXMLTypePackage.getString(), "class", null, 0, -1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_ExcludeUnlistedClasses(), theXMLTypePackage.getBoolean(), "excludeUnlistedClasses", "true", 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_SharedCacheMode(), this.getPersistenceUnitCachingType(), "sharedCacheMode", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_ValidationMode(), this.getPersistenceUnitValidationModeType(), "validationMode", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistenceUnitType_Properties(), this.getPropertiesType(), null, "properties", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitType_TransactionType(), this.getPersistenceUnitTransactionType(), "transactionType", null, 0, 1, PersistenceUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertiesType_Property(), this.getPropertyType(), null, "property", null, 0, -1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(persistenceUnitCachingTypeEEnum, PersistenceUnitCachingType.class, "PersistenceUnitCachingType");
		addEEnumLiteral(persistenceUnitCachingTypeEEnum, PersistenceUnitCachingType.ALL);
		addEEnumLiteral(persistenceUnitCachingTypeEEnum, PersistenceUnitCachingType.NONE);
		addEEnumLiteral(persistenceUnitCachingTypeEEnum, PersistenceUnitCachingType.ENABLESELECTIVE);
		addEEnumLiteral(persistenceUnitCachingTypeEEnum, PersistenceUnitCachingType.DISABLESELECTIVE);
		addEEnumLiteral(persistenceUnitCachingTypeEEnum, PersistenceUnitCachingType.UNSPECIFIED);

		initEEnum(persistenceUnitTransactionTypeEEnum, PersistenceUnitTransactionType.class, "PersistenceUnitTransactionType");
		addEEnumLiteral(persistenceUnitTransactionTypeEEnum, PersistenceUnitTransactionType.JTA);
		addEEnumLiteral(persistenceUnitTransactionTypeEEnum, PersistenceUnitTransactionType.RESOURCELOCAL);

		initEEnum(persistenceUnitValidationModeTypeEEnum, PersistenceUnitValidationModeType.class, "PersistenceUnitValidationModeType");
		addEEnumLiteral(persistenceUnitValidationModeTypeEEnum, PersistenceUnitValidationModeType.AUTO);
		addEEnumLiteral(persistenceUnitValidationModeTypeEEnum, PersistenceUnitValidationModeType.CALLBACK);
		addEEnumLiteral(persistenceUnitValidationModeTypeEEnum, PersistenceUnitValidationModeType.NONE);

		// Initialize data types
		initEDataType(persistenceUnitCachingTypeObjectEDataType, PersistenceUnitCachingType.class, "PersistenceUnitCachingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(persistenceUnitTransactionTypeObjectEDataType, PersistenceUnitTransactionType.class, "PersistenceUnitTransactionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(persistenceUnitValidationModeTypeObjectEDataType, PersistenceUnitValidationModeType.class, "PersistenceUnitValidationModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Persistence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "persistence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (persistenceTypeEClass,
		   source,
		   new String[] {
			   "name", "persistence_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersistenceType_PersistenceUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "persistence-unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (persistenceUnitCachingTypeEEnum,
		   source,
		   new String[] {
			   "name", "persistence-unit-caching-type"
		   });
		addAnnotation
		  (persistenceUnitCachingTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "persistence-unit-caching-type:Object",
			   "baseType", "persistence-unit-caching-type"
		   });
		addAnnotation
		  (persistenceUnitTransactionTypeEEnum,
		   source,
		   new String[] {
			   "name", "persistence-unit-transaction-type"
		   });
		addAnnotation
		  (persistenceUnitTransactionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "persistence-unit-transaction-type:Object",
			   "baseType", "persistence-unit-transaction-type"
		   });
		addAnnotation
		  (persistenceUnitTypeEClass,
		   source,
		   new String[] {
			   "name", "persistence-unit_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersistenceUnitType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_Provider(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "provider",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_Qualifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "qualifier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_Scope(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scope",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_JtaDataSource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jta-data-source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_NonJtaDataSource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "non-jta-data-source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_MappingFile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mapping-file",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_JarFile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jar-file",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_Class(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "class",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_ExcludeUnlistedClasses(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "exclude-unlisted-classes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_SharedCacheMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "shared-cache-mode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_ValidationMode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validation-mode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersistenceUnitType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":13",
			   "processing", "lax"
		   });
		addAnnotation
		  (getPersistenceUnitType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getPersistenceUnitType_TransactionType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "transaction-type"
		   });
		addAnnotation
		  (persistenceUnitValidationModeTypeEEnum,
		   source,
		   new String[] {
			   "name", "persistence-unit-validation-mode-type"
		   });
		addAnnotation
		  (persistenceUnitValidationModeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "persistence-unit-validation-mode-type:Object",
			   "baseType", "persistence-unit-validation-mode-type"
		   });
		addAnnotation
		  (propertiesTypeEClass,
		   source,
		   new String[] {
			   "name", "properties_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPropertiesType_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (propertyTypeEClass,
		   source,
		   new String[] {
			   "name", "property_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPropertyType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getPropertyType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (versionTypeEDataType,
		   source,
		   new String[] {
			   "name", "versionType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			   "pattern", "[0-9]+(\\.[0-9]+)*"
		   });
	}

} //PersistencePackageImpl
