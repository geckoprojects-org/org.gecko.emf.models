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
package ee.jakarta.xml.ns.persistence.orm;


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
 *        This is the XML Schema for the persistence object/relational mapping file.
 *        The file may be named "META-INF/orm.xml" in the persistence
 *        archive or it may be named some other name which would be
 *        used to locate the file as resource on the classpath.
 * 
 *        Object/relational mapping files must indicate the object/relational
 *        mapping file schema by using the persistence namespace:
 * 
 *        https://jakarta.ee/xml/ns/persistence/orm
 * 
 *        and indicate the version of the schema by
 *        using the version element as shown below:
 * 
 *       <entity-mappings xmlns="https://jakarta.ee/xml/ns/persistence/orm"
 *         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *         xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence/orm
 *           https://jakarta.ee/xml/ns/persistence/orm/orm_3_2.xsd"
 *         version="3.2">
 *           ...
 *       </entity-mappings>
 * 
 * 
 *      
 * <!-- end-model-doc -->
 * @see ee.jakarta.xml.ns.persistence.orm.OrmFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = OrmPackage.eNS_URI, genModel = "/model/persistence_3_2.genmodel", genModelSourceLocations = {"model/persistence_3_2.genmodel","jakarta.persistence/model/persistence_3_2.genmodel"}, ecore="/model/orm.ecore", ecoreSourceLocations="/model/orm.ecore")
public interface OrmPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jakarta.ee/xml/ns/persistence/orm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrmPackage eINSTANCE = ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.AssociationOverrideImpl <em>Association Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.AssociationOverrideImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getAssociationOverride()
	 * @generated
	 */
	int ASSOCIATION_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__JOIN_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__JOIN_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Association Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Association Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.AttributeOverrideImpl <em>Attribute Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.AttributeOverrideImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getAttributeOverride()
	 * @generated
	 */
	int ATTRIBUTE_OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Attribute Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.AttributesImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ID = 1;

	/**
	 * The feature id for the '<em><b>Embedded Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EMBEDDED_ID = 2;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__BASIC = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__MANY_TO_ONE = 5;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ONE_TO_MANY = 6;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ONE_TO_ONE = 7;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__MANY_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Element Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ELEMENT_COLLECTION = 9;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EMBEDDED = 10;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__TRANSIENT = 11;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.BasicImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 3;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__LOB = 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__TEMPORAL = 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__ENUMERATED = 3;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__CONVERT = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__FETCH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__NAME = 7;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__OPTIONAL = 8;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.CascadeTypeImpl <em>Cascade Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.CascadeTypeImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getCascadeType()
	 * @generated
	 */
	int CASCADE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cascade All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_ALL = 0;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Cascade Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_MERGE = 2;

	/**
	 * The feature id for the '<em><b>Cascade Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Cascade Refresh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_REFRESH = 4;

	/**
	 * The feature id for the '<em><b>Cascade Detach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_DETACH = 5;

	/**
	 * The number of structural features of the '<em>Cascade Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cascade Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.CheckConstraintImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getCheckConstraint()
	 * @generated
	 */
	int CHECK_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Check Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Check Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.CollectionTableImpl <em>Collection Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.CollectionTableImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getCollectionTable()
	 * @generated
	 */
	int COLLECTION_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__UNIQUE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__INDEX = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__OPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__SCHEMA = 7;

	/**
	 * The number of structural features of the '<em>Collection Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Collection Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ColumnImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CHECK_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INSERTABLE = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 5;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = 6;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OPTIONS = 7;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = 8;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCALE = 9;

	/**
	 * The feature id for the '<em><b>Second Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SECOND_PRECISION = 10;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = 11;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE = 12;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UPDATABLE = 13;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ColumnResultImpl <em>Column Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ColumnResultImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getColumnResult()
	 * @generated
	 */
	int COLUMN_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Column Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ConstructorResultImpl <em>Constructor Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ConstructorResultImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getConstructorResult()
	 * @generated
	 */
	int CONSTRUCTOR_RESULT = 9;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT__TARGET_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Constructor Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constructor Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ConvertImpl <em>Convert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ConvertImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getConvert()
	 * @generated
	 */
	int CONVERT = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__ATTRIBUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__CONVERTER = 2;

	/**
	 * The feature id for the '<em><b>Disable Conversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__DISABLE_CONVERSION = 3;

	/**
	 * The number of structural features of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ConverterImpl <em>Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ConverterImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getConverter()
	 * @generated
	 */
	int CONVERTER = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Auto Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__AUTO_APPLY = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CLASS = 2;

	/**
	 * The number of structural features of the '<em>Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.DiscriminatorColumnImpl <em>Discriminator Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.DiscriminatorColumnImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getDiscriminatorColumn()
	 * @generated
	 */
	int DISCRIMINATOR_COLUMN = 12;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__OPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Discriminator Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Discriminator Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.DocumentRootImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 13;

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
	 * The feature id for the '<em><b>Entity Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_MAPPINGS = 3;

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
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ElementCollectionImpl <em>Element Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ElementCollectionImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getElementCollection()
	 * @generated
	 */
	int ELEMENT_COLLECTION = 14;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Order Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ORDER_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY = 2;

	/**
	 * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_TEMPORAL = 4;

	/**
	 * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_ENUMERATED = 5;

	/**
	 * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE = 6;

	/**
	 * The feature id for the '<em><b>Map Key Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_CONVERT = 7;

	/**
	 * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Map Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_FOREIGN_KEY = 10;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__TEMPORAL = 12;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ENUMERATED = 13;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__LOB = 14;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE = 15;

	/**
	 * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE = 16;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__CONVERT = 17;

	/**
	 * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__COLLECTION_TABLE = 18;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ACCESS = 19;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__FETCH = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__NAME = 21;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__TARGET_CLASS = 22;

	/**
	 * The number of structural features of the '<em>Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EmbeddableImpl <em>Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EmbeddableImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEmbeddable()
	 * @generated
	 */
	int EMBEDDABLE = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__METADATA_COMPLETE = 4;

	/**
	 * The number of structural features of the '<em>Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EmbeddableAttributesImpl <em>Embeddable Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EmbeddableAttributesImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEmbeddableAttributes()
	 * @generated
	 */
	int EMBEDDABLE_ATTRIBUTES = 16;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__BASIC = 0;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__MANY_TO_ONE = 1;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__ONE_TO_MANY = 2;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__ONE_TO_ONE = 3;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__MANY_TO_MANY = 4;

	/**
	 * The feature id for the '<em><b>Element Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__ELEMENT_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__EMBEDDED = 6;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__TRANSIENT = 7;

	/**
	 * The number of structural features of the '<em>Embeddable Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Embeddable Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EmbeddedImpl <em>Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EmbeddedImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEmbedded()
	 * @generated
	 */
	int EMBEDDED = 17;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__ATTRIBUTE_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__ASSOCIATION_OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__CONVERT = 2;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__NAME = 4;

	/**
	 * The number of structural features of the '<em>Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EmbeddedIdImpl <em>Embedded Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EmbeddedIdImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEmbeddedId()
	 * @generated
	 */
	int EMBEDDED_ID = 18;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__ATTRIBUTE_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__NAME = 2;

	/**
	 * The number of structural features of the '<em>Embedded Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Embedded Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EmptyTypeImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EntityImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Secondary Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SECONDARY_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARY_KEY_JOIN_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Primary Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARY_KEY_FOREIGN_KEY = 4;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERITANCE = 6;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SEQUENCE_GENERATOR = 9;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_GENERATOR = 10;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_NATIVE_QUERY = 12;

	/**
	 * The feature id for the '<em><b>Named Stored Procedure Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_STORED_PROCEDURE_QUERY = 13;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SQL_RESULT_SET_MAPPING = 14;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXCLUDE_DEFAULT_LISTENERS = 15;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = 16;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_LISTENERS = 17;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_PERSIST = 18;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_PERSIST = 19;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_REMOVE = 20;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_REMOVE = 21;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_UPDATE = 22;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_UPDATE = 23;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_LOAD = 24;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE_OVERRIDE = 25;

	/**
	 * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSOCIATION_OVERRIDE = 26;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONVERT = 27;

	/**
	 * The feature id for the '<em><b>Named Entity Graph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_ENTITY_GRAPH = 28;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 29;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ACCESS = 30;

	/**
	 * The feature id for the '<em><b>Cacheable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CACHEABLE = 31;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CLASS = 32;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__METADATA_COMPLETE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 34;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EntityListenerImpl <em>Entity Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EntityListenerImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEntityListener()
	 * @generated
	 */
	int ENTITY_LISTENER = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_PERSIST = 2;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_REMOVE = 4;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_UPDATE = 6;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_LOAD = 7;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__CLASS = 8;

	/**
	 * The number of structural features of the '<em>Entity Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Entity Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EntityListenersImpl <em>Entity Listeners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EntityListenersImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEntityListeners()
	 * @generated
	 */
	int ENTITY_LISTENERS = 22;

	/**
	 * The feature id for the '<em><b>Entity Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS__ENTITY_LISTENER = 0;

	/**
	 * The number of structural features of the '<em>Entity Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EntityMappingsTypeImpl <em>Entity Mappings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EntityMappingsTypeImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEntityMappingsType()
	 * @generated
	 */
	int ENTITY_MAPPINGS_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR = 7;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Named Stored Procedure Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY = 10;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Mapped Superclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS = 12;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__ENTITY = 13;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__EMBEDDABLE = 14;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__CONVERTER = 15;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__VERSION = 16;

	/**
	 * The number of structural features of the '<em>Entity Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Entity Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.EntityResultImpl <em>Entity Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.EntityResultImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEntityResult()
	 * @generated
	 */
	int ENTITY_RESULT = 24;

	/**
	 * The feature id for the '<em><b>Lock Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__LOCK_MODE = 0;

	/**
	 * The feature id for the '<em><b>Field Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__FIELD_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__DISCRIMINATOR_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__ENTITY_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Entity Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entity Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.FieldResultImpl <em>Field Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.FieldResultImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getFieldResult()
	 * @generated
	 */
	int FIELD_RESULT = 25;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Field Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ForeignKeyImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Constraint Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__CONSTRAINT_MODE = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__FOREIGN_KEY_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__OPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.GeneratedValueImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getGeneratedValue()
	 * @generated
	 */
	int GENERATED_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.IdImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getId()
	 * @generated
	 */
	int ID = 28;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__GENERATED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TEMPORAL = 2;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TABLE_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__SEQUENCE_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = 6;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.IdClassImpl <em>Id Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.IdClassImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getIdClass()
	 * @generated
	 */
	int ID_CLASS = 29;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Id Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Id Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.IndexImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Column List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COLUMN_LIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__UNIQUE = 4;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.InheritanceImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 31;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.JoinColumnImpl <em>Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.JoinColumnImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getJoinColumn()
	 * @generated
	 */
	int JOIN_COLUMN = 32;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__CHECK_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__COLUMN_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__INSERTABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NAME = 5;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NULLABLE = 6;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__OPTIONS = 7;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__REFERENCED_COLUMN_NAME = 8;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__TABLE = 9;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UNIQUE = 10;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UPDATABLE = 11;

	/**
	 * The number of structural features of the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.JoinTableImpl <em>Join Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.JoinTableImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getJoinTable()
	 * @generated
	 */
	int JOIN_TABLE = 33;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__JOIN_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Inverse Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INVERSE_JOIN_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Inverse Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INVERSE_FOREIGN_KEY = 4;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__UNIQUE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INDEX = 6;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__CHECK_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__CATALOG = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__OPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__SCHEMA = 11;

	/**
	 * The number of structural features of the '<em>Join Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Join Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.LobImpl <em>Lob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.LobImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getLob()
	 * @generated
	 */
	int LOB = 34;

	/**
	 * The number of structural features of the '<em>Lob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ManyToManyImpl <em>Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ManyToManyImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getManyToMany()
	 * @generated
	 */
	int MANY_TO_MANY = 35;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Order Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ORDER_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY = 2;

	/**
	 * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_TEMPORAL = 4;

	/**
	 * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_ENUMERATED = 5;

	/**
	 * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE = 6;

	/**
	 * The feature id for the '<em><b>Map Key Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_CONVERT = 7;

	/**
	 * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_JOIN_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Map Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_FOREIGN_KEY = 10;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__JOIN_TABLE = 11;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__CASCADE = 12;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FETCH = 14;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAPPED_BY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__NAME = 16;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__TARGET_ENTITY = 17;

	/**
	 * The number of structural features of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.ManyToOneImpl <em>Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.ManyToOneImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getManyToOne()
	 * @generated
	 */
	int MANY_TO_ONE = 36;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__JOIN_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__CASCADE = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FETCH = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__ID = 6;

	/**
	 * The feature id for the '<em><b>Maps Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__MAPS_ID = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OPTIONAL = 9;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__TARGET_ENTITY = 10;

	/**
	 * The number of structural features of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.MapKeyImpl <em>Map Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.MapKeyImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getMapKey()
	 * @generated
	 */
	int MAP_KEY = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.MapKeyClassImpl <em>Map Key Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.MapKeyClassImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getMapKeyClass()
	 * @generated
	 */
	int MAP_KEY_CLASS = 38;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_CLASS__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Map Key Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map Key Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.MapKeyColumnImpl <em>Map Key Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.MapKeyColumnImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getMapKeyColumn()
	 * @generated
	 */
	int MAP_KEY_COLUMN = 39;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__PRECISION = 6;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__SCALE = 7;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__TABLE = 8;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__UNIQUE = 9;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__UPDATABLE = 10;

	/**
	 * The number of structural features of the '<em>Map Key Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Map Key Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.MapKeyJoinColumnImpl <em>Map Key Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.MapKeyJoinColumnImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getMapKeyJoinColumn()
	 * @generated
	 */
	int MAP_KEY_JOIN_COLUMN = 40;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__FOREIGN_KEY = 0;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__INSERTABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__TABLE = 7;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__UNIQUE = 8;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__UPDATABLE = 9;

	/**
	 * The number of structural features of the '<em>Map Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Map Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.MappedSuperclassImpl <em>Mapped Superclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.MappedSuperclassImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getMappedSuperclass()
	 * @generated
	 */
	int MAPPED_SUPERCLASS = 41;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ID_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = 3;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ENTITY_LISTENERS = 4;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_PERSIST = 5;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_PERSIST = 6;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_REMOVE = 7;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_REMOVE = 8;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_UPDATE = 9;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_UPDATE = 10;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_LOAD = 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ATTRIBUTES = 12;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__CLASS = 14;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__METADATA_COMPLETE = 15;

	/**
	 * The number of structural features of the '<em>Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedAttributeNodeImpl <em>Named Attribute Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.NamedAttributeNodeImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getNamedAttributeNode()
	 * @generated
	 */
	int NAMED_ATTRIBUTE_NODE = 42;

	/**
	 * The feature id for the '<em><b>Key Subgraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE__KEY_SUBGRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Subgraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE__SUBGRAPH = 2;

	/**
	 * The number of structural features of the '<em>Named Attribute Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Attribute Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedEntityGraphImpl <em>Named Entity Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.NamedEntityGraphImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getNamedEntityGraph()
	 * @generated
	 */
	int NAMED_ENTITY_GRAPH = 43;

	/**
	 * The feature id for the '<em><b>Named Attribute Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__NAMED_ATTRIBUTE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Subgraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__SUBGRAPH = 1;

	/**
	 * The feature id for the '<em><b>Subclass Subgraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__SUBCLASS_SUBGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Include All Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__INCLUDE_ALL_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__NAME = 4;

	/**
	 * The number of structural features of the '<em>Named Entity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Named Entity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getNamedNativeQuery()
	 * @generated
	 */
	int NAMED_NATIVE_QUERY = 44;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__HINT = 2;

	/**
	 * The feature id for the '<em><b>Entity Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__ENTITY_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Constructor Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__CONSTRUCTOR_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Column Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__COLUMN_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__NAME = 6;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = 8;

	/**
	 * The number of structural features of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedQueryImpl <em>Named Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.NamedQueryImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getNamedQuery()
	 * @generated
	 */
	int NAMED_QUERY = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Lock Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__LOCK_MODE = 2;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__HINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__NAME = 4;

	/**
	 * The number of structural features of the '<em>Named Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Named Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedStoredProcedureQueryImpl <em>Named Stored Procedure Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.NamedStoredProcedureQueryImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getNamedStoredProcedureQuery()
	 * @generated
	 */
	int NAMED_STORED_PROCEDURE_QUERY = 46;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__HINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Procedure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Named Stored Procedure Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Named Stored Procedure Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedSubgraphImpl <em>Named Subgraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.NamedSubgraphImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getNamedSubgraph()
	 * @generated
	 */
	int NAMED_SUBGRAPH = 47;

	/**
	 * The feature id for the '<em><b>Named Attribute Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH__NAMED_ATTRIBUTE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH__NAME = 2;

	/**
	 * The number of structural features of the '<em>Named Subgraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Subgraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.OneToManyImpl <em>One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OneToManyImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getOneToMany()
	 * @generated
	 */
	int ONE_TO_MANY = 48;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Order Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ORDER_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY = 2;

	/**
	 * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_TEMPORAL = 4;

	/**
	 * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_ENUMERATED = 5;

	/**
	 * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE = 6;

	/**
	 * The feature id for the '<em><b>Map Key Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_CONVERT = 7;

	/**
	 * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_JOIN_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Map Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_FOREIGN_KEY = 10;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__JOIN_TABLE = 11;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__JOIN_COLUMN = 12;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__FOREIGN_KEY = 13;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__CASCADE = 14;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ACCESS = 15;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__FETCH = 16;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAPPED_BY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__NAME = 18;

	/**
	 * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ORPHAN_REMOVAL = 19;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__TARGET_ENTITY = 20;

	/**
	 * The number of structural features of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.OneToOneImpl <em>One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OneToOneImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getOneToOne()
	 * @generated
	 */
	int ONE_TO_ONE = 49;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Primary Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__PRIMARY_KEY_FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__JOIN_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__JOIN_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CASCADE = 5;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ACCESS = 6;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FETCH = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ID = 8;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__MAPPED_BY = 9;

	/**
	 * The feature id for the '<em><b>Maps Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__MAPS_ID = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__NAME = 11;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__OPTIONAL = 12;

	/**
	 * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ORPHAN_REMOVAL = 13;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__TARGET_ENTITY = 14;

	/**
	 * The number of structural features of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.OrderColumnImpl <em>Order Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrderColumnImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getOrderColumn()
	 * @generated
	 */
	int ORDER_COLUMN = 50;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__OPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__UPDATABLE = 5;

	/**
	 * The number of structural features of the '<em>Order Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Order Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PersistenceUnitDefaultsImpl <em>Persistence Unit Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PersistenceUnitDefaultsImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPersistenceUnitDefaults()
	 * @generated
	 */
	int PERSISTENCE_UNIT_DEFAULTS = 51;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Delimited Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST = 5;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS = 6;

	/**
	 * The number of structural features of the '<em>Persistence Unit Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Persistence Unit Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PersistenceUnitMetadataImpl <em>Persistence Unit Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PersistenceUnitMetadataImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPersistenceUnitMetadata()
	 * @generated
	 */
	int PERSISTENCE_UNIT_METADATA = 52;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Xml Mapping Metadata Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = 2;

	/**
	 * The number of structural features of the '<em>Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PostLoadImpl <em>Post Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PostLoadImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPostLoad()
	 * @generated
	 */
	int POST_LOAD = 53;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PostPersistImpl <em>Post Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PostPersistImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPostPersist()
	 * @generated
	 */
	int POST_PERSIST = 54;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PostRemoveImpl <em>Post Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PostRemoveImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPostRemove()
	 * @generated
	 */
	int POST_REMOVE = 55;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PostUpdateImpl <em>Post Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PostUpdateImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPostUpdate()
	 * @generated
	 */
	int POST_UPDATE = 56;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PrePersistImpl <em>Pre Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PrePersistImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPrePersist()
	 * @generated
	 */
	int PRE_PERSIST = 57;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Pre Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PreRemoveImpl <em>Pre Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PreRemoveImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPreRemove()
	 * @generated
	 */
	int PRE_REMOVE = 58;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Pre Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PreUpdateImpl <em>Pre Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PreUpdateImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPreUpdate()
	 * @generated
	 */
	int PRE_UPDATE = 59;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Pre Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.PrimaryKeyJoinColumnImpl <em>Primary Key Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.PrimaryKeyJoinColumnImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getPrimaryKeyJoinColumn()
	 * @generated
	 */
	int PRIMARY_KEY_JOIN_COLUMN = 60;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__FOREIGN_KEY = 0;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = 4;

	/**
	 * The number of structural features of the '<em>Primary Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Primary Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.QueryHintImpl <em>Query Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.QueryHintImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getQueryHint()
	 * @generated
	 */
	int QUERY_HINT = 61;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Query Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.SecondaryTableImpl <em>Secondary Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.SecondaryTableImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getSecondaryTable()
	 * @generated
	 */
	int SECONDARY_TABLE = 62;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Primary Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__PRIMARY_KEY_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__UNIQUE_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__INDEX = 4;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__FOREIGN_KEY = 5;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__CHECK_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__CATALOG = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__OPTIONS = 9;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__SCHEMA = 10;

	/**
	 * The number of structural features of the '<em>Secondary Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Secondary Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.SequenceGeneratorImpl <em>Sequence Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.SequenceGeneratorImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getSequenceGenerator()
	 * @generated
	 */
	int SEQUENCE_GENERATOR = 63;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__ALLOCATION_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__INITIAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__NAME = 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__SCHEMA = 6;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__SEQUENCE_NAME = 7;

	/**
	 * The number of structural features of the '<em>Sequence Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Sequence Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.SqlResultSetMappingImpl <em>Sql Result Set Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.SqlResultSetMappingImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getSqlResultSetMapping()
	 * @generated
	 */
	int SQL_RESULT_SET_MAPPING = 64;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Entity Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__ENTITY_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Constructor Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__CONSTRUCTOR_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Column Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__COLUMN_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__NAME = 4;

	/**
	 * The number of structural features of the '<em>Sql Result Set Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sql Result Set Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.StoredProcedureParameterImpl <em>Stored Procedure Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.StoredProcedureParameterImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getStoredProcedureParameter()
	 * @generated
	 */
	int STORED_PROCEDURE_PARAMETER = 65;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__MODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Stored Procedure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Stored Procedure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.TableImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 66;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UNIQUE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CHECK_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = 7;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.TableGeneratorImpl <em>Table Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.TableGeneratorImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getTableGenerator()
	 * @generated
	 */
	int TABLE_GENERATOR = 67;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__UNIQUE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__CHECK_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__ALLOCATION_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__CATALOG = 5;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__INITIAL_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__NAME = 7;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__OPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Pk Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_NAME = 9;

	/**
	 * The feature id for the '<em><b>Pk Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__SCHEMA = 11;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__TABLE = 12;

	/**
	 * The feature id for the '<em><b>Value Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__VALUE_COLUMN_NAME = 13;

	/**
	 * The number of structural features of the '<em>Table Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Table Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.TransientImpl <em>Transient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.TransientImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getTransient()
	 * @generated
	 */
	int TRANSIENT = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.UniqueConstraintImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 69;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.VersionImpl
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 70;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__TEMPORAL = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.AccessType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 71;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.ConstraintMode <em>Constraint Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstraintMode
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getConstraintMode()
	 * @generated
	 */
	int CONSTRAINT_MODE = 72;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorType <em>Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getDiscriminatorType()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE = 73;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.EnumType <em>Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.EnumType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 74;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.FetchType <em>Fetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.FetchType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getFetchType()
	 * @generated
	 */
	int FETCH_TYPE = 75;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.GenerationType <em>Generation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.GenerationType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getGenerationType()
	 * @generated
	 */
	int GENERATION_TYPE = 76;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.InheritanceType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getInheritanceType()
	 * @generated
	 */
	int INHERITANCE_TYPE = 77;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.LockModeType <em>Lock Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.LockModeType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getLockModeType()
	 * @generated
	 */
	int LOCK_MODE_TYPE = 78;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.ParameterMode
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 79;

	/**
	 * The meta object id for the '{@link ee.jakarta.xml.ns.persistence.orm.TemporalType <em>Temporal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.TemporalType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getTemporalType()
	 * @generated
	 */
	int TEMPORAL_TYPE = 80;

	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.AccessType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Constraint Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstraintMode
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getConstraintModeObject()
	 * @generated
	 */
	int CONSTRAINT_MODE_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Discriminator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getDiscriminatorTypeObject()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Discriminator Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getDiscriminatorValue()
	 * @generated
	 */
	int DISCRIMINATOR_VALUE = 84;

	/**
	 * The meta object id for the '<em>Enumerated</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.EnumType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 85;

	/**
	 * The meta object id for the '<em>Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.EnumType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getEnumTypeObject()
	 * @generated
	 */
	int ENUM_TYPE_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Fetch Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.FetchType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getFetchTypeObject()
	 * @generated
	 */
	int FETCH_TYPE_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Generation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.GenerationType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getGenerationTypeObject()
	 * @generated
	 */
	int GENERATION_TYPE_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Inheritance Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.InheritanceType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getInheritanceTypeObject()
	 * @generated
	 */
	int INHERITANCE_TYPE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Lock Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.LockModeType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getLockModeTypeObject()
	 * @generated
	 */
	int LOCK_MODE_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Order By</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getOrderBy()
	 * @generated
	 */
	int ORDER_BY = 91;

	/**
	 * The meta object id for the '<em>Parameter Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.ParameterMode
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getParameterModeObject()
	 * @generated
	 */
	int PARAMETER_MODE_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Temporal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.TemporalType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 93;

	/**
	 * The meta object id for the '<em>Temporal Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ee.jakarta.xml.ns.persistence.orm.TemporalType
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getTemporalTypeObject()
	 * @generated
	 */
	int TEMPORAL_TYPE_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ee.jakarta.xml.ns.persistence.orm.impl.OrmPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 95;


	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.AssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AssociationOverride
	 * @generated
	 */
	EClass getAssociationOverride();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getDescription()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EAttribute getAssociationOverride_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getJoinColumn()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getForeignKey()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getJoinTable()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_JoinTable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AssociationOverride#getName()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EAttribute getAssociationOverride_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.AttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AttributeOverride
	 * @generated
	 */
	EClass getAttributeOverride();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.AttributeOverride#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AttributeOverride#getDescription()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EAttribute getAttributeOverride_Description();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.AttributeOverride#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AttributeOverride#getColumn()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EReference getAttributeOverride_Column();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.AttributeOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AttributeOverride#getName()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EAttribute getAttributeOverride_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getDescription()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getId()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Id();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getEmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getEmbeddedId()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_EmbeddedId();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getBasic()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Basic();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getVersion()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getManyToOne()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Many</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getOneToMany()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_OneToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getOneToOne()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To Many</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getManyToMany()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Collection</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getElementCollection()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ElementCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getEmbedded()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Embedded();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Attributes#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Attributes#getTransient()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Transient();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getColumn()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Column();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getLob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lob</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getLob()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Lob();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getTemporal()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getEnumerated()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Enumerated();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getConvert()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Convert();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getAccess()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getFetch()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Basic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#getName()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Basic#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Basic#isOptional()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Optional();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.CascadeType <em>Cascade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CascadeType
	 * @generated
	 */
	EClass getCascadeType();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeAll <em>Cascade All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade All</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeAll()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeAll();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadePersist()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadePersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeMerge <em>Cascade Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Merge</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeMerge()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeMerge();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeRemove <em>Cascade Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeRemove()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeRemove();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Refresh</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeRefresh()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeRefresh();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeDetach <em>Cascade Detach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Detach</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CascadeType#getCascadeDetach()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeDetach();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.CheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CheckConstraint
	 * @generated
	 */
	EClass getCheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.CheckConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CheckConstraint#getConstraint()
	 * @see #getCheckConstraint()
	 * @generated
	 */
	EAttribute getCheckConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.CheckConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CheckConstraint#getName()
	 * @see #getCheckConstraint()
	 * @generated
	 */
	EAttribute getCheckConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.CheckConstraint#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CheckConstraint#getOptions()
	 * @see #getCheckConstraint()
	 * @generated
	 */
	EAttribute getCheckConstraint_Options();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable <em>Collection Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable
	 * @generated
	 */
	EClass getCollectionTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getJoinColumn()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getForeignKey()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_ForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getUniqueConstraint()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getIndex()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getCatalog()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EAttribute getCollectionTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getName()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EAttribute getCollectionTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getOptions()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EAttribute getCollectionTable_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.CollectionTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.CollectionTable#getSchema()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EAttribute getCollectionTable_Schema();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getComment()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Column#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getCheckConstraint()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_CheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getColumnDefinition()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#isInsertable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#isNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getOptions()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getScale()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getSecondPrecision <em>Second Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Precision</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getSecondPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_SecondPrecision();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#isUnique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Column#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Column#isUpdatable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.ColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ColumnResult
	 * @generated
	 */
	EClass getColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ColumnResult#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ColumnResult#getClass_()
	 * @see #getColumnResult()
	 * @generated
	 */
	EAttribute getColumnResult_Class();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ColumnResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ColumnResult#getName()
	 * @see #getColumnResult()
	 * @generated
	 */
	EAttribute getColumnResult_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.ConstructorResult <em>Constructor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstructorResult
	 * @generated
	 */
	EClass getConstructorResult();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ConstructorResult#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstructorResult#getColumn()
	 * @see #getConstructorResult()
	 * @generated
	 */
	EReference getConstructorResult_Column();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ConstructorResult#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstructorResult#getTargetClass()
	 * @see #getConstructorResult()
	 * @generated
	 */
	EAttribute getConstructorResult_TargetClass();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Convert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Convert
	 * @generated
	 */
	EClass getConvert();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Convert#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Convert#getDescription()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Convert#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Convert#getAttributeName()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Convert#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Convert#getConverter()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_Converter();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Convert#isDisableConversion <em>Disable Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Conversion</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Convert#isDisableConversion()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_DisableConversion();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Converter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Converter</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Converter
	 * @generated
	 */
	EClass getConverter();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Converter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Converter#getDescription()
	 * @see #getConverter()
	 * @generated
	 */
	EAttribute getConverter_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Converter#isAutoApply <em>Auto Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Apply</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Converter#isAutoApply()
	 * @see #getConverter()
	 * @generated
	 */
	EAttribute getConverter_AutoApply();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Converter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Converter#getClass_()
	 * @see #getConverter()
	 * @generated
	 */
	EAttribute getConverter_Class();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discriminator Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn
	 * @generated
	 */
	EClass getDiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getColumnDefinition()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getDiscriminatorType()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_DiscriminatorType();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getLength()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getName()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getOptions()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Options();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getEntityMappings <em>Entity Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Mappings</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DocumentRoot#getEntityMappings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityMappings();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Collection</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection
	 * @generated
	 */
	EClass getElementCollection();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getOrderBy()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getOrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getOrderColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_OrderColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKey()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyClass()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyTemporal <em>Map Key Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyTemporal()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_MapKeyTemporal();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyEnumerated()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_MapKeyEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyAttributeOverride()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyAttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyConvert <em>Map Key Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyConvert()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyConvert();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyJoinColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyForeignKey <em>Map Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getMapKeyForeignKey()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_Column();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getTemporal()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getEnumerated()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Enumerated();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getLob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lob</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getLob()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_Lob();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getAttributeOverride()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_AttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getAssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getAssociationOverride()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_AssociationOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getConvert()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_Convert();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getCollectionTable <em>Collection Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getCollectionTable()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_CollectionTable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getAccess()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getFetch()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getName()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ElementCollection#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ElementCollection#getTargetClass()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_TargetClass();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Embeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embeddable
	 * @generated
	 */
	EClass getEmbeddable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Embeddable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embeddable#getDescription()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Description();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Embeddable#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embeddable#getAttributes()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EReference getEmbeddable_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Embeddable#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embeddable#getAccess()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Embeddable#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embeddable#getClass_()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Class();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Embeddable#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embeddable#isMetadataComplete()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_MetadataComplete();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes <em>Embeddable Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable Attributes</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes
	 * @generated
	 */
	EClass getEmbeddableAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getBasic()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Basic();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getManyToOne()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Many</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getOneToMany()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_OneToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getOneToOne()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To Many</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getManyToMany()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_ManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Collection</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getElementCollection()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_ElementCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getEmbedded()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Embedded();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddableAttributes#getTransient()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Transient();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Embedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embedded
	 * @generated
	 */
	EClass getEmbedded();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Embedded#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embedded#getAttributeOverride()
	 * @see #getEmbedded()
	 * @generated
	 */
	EReference getEmbedded_AttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Embedded#getAssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embedded#getAssociationOverride()
	 * @see #getEmbedded()
	 * @generated
	 */
	EReference getEmbedded_AssociationOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Embedded#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embedded#getConvert()
	 * @see #getEmbedded()
	 * @generated
	 */
	EReference getEmbedded_Convert();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Embedded#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embedded#getAccess()
	 * @see #getEmbedded()
	 * @generated
	 */
	EAttribute getEmbedded_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Embedded#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Embedded#getName()
	 * @see #getEmbedded()
	 * @generated
	 */
	EAttribute getEmbedded_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddedId
	 * @generated
	 */
	EClass getEmbeddedId();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddedId#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddedId#getAttributeOverride()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EReference getEmbeddedId_AttributeOverride();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddedId#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddedId#getAccess()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EAttribute getEmbeddedId_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EmbeddedId#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmbeddedId#getName()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EAttribute getEmbeddedId_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getDescription()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Description();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getTable()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getSecondaryTable <em>Secondary Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getSecondaryTable()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SecondaryTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPrimaryKeyJoinColumn()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPrimaryKeyForeignKey()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrimaryKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getIdClass()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IdClass();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getInheritance()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Inheritance();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getDiscriminatorValue()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_DiscriminatorValue();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discriminator Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getDiscriminatorColumn()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DiscriminatorColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getSequenceGenerator()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getTableGenerator()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_TableGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getNamedQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getNamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getNamedNativeQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedNativeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Stored Procedure Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getNamedStoredProcedureQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedStoredProcedureQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getSqlResultSetMapping()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SqlResultSetMapping();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getExcludeDefaultListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ExcludeDefaultListeners();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getExcludeSuperclassListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ExcludeSuperclassListeners();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getEntityListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityListeners();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPrePersist()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPostPersist()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPreRemove()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPostRemove()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPreUpdate()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPostUpdate()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getPostLoad()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getAttributeOverride()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getAssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getAssociationOverride()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AssociationOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getConvert()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Convert();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getNamedEntityGraph <em>Named Entity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Entity Graph</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getNamedEntityGraph()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedEntityGraph();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getAccess()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Entity#isCacheable <em>Cacheable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cacheable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#isCacheable()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Cacheable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getClass_()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Class();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Entity#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#isMetadataComplete()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_MetadataComplete();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listener</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener
	 * @generated
	 */
	EClass getEntityListener();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getDescription()
	 * @see #getEntityListener()
	 * @generated
	 */
	EAttribute getEntityListener_Description();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getPrePersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostPersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getPreRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getPreUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getPostLoad()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostLoad();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityListener#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListener#getClass_()
	 * @see #getEntityListener()
	 * @generated
	 */
	EAttribute getEntityListener_Class();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.EntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListeners
	 * @generated
	 */
	EClass getEntityListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityListeners#getEntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Listener</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityListeners#getEntityListener()
	 * @see #getEntityListeners()
	 * @generated
	 */
	EReference getEntityListeners_EntityListener();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType <em>Entity Mappings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Mappings Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType
	 * @generated
	 */
	EClass getEntityMappingsType();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getDescription()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Metadata</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getPersistenceUnitMetadata()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_PersistenceUnitMetadata();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getPackage()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Package();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getSchema()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Schema();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getCatalog()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getAccess()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Access();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getSequenceGenerator()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getTableGenerator()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_TableGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getNamedQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getNamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getNamedNativeQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedNativeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Stored Procedure Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getNamedStoredProcedureQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedStoredProcedureQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getSqlResultSetMapping()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_SqlResultSetMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getMappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Superclass</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getMappedSuperclass()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_MappedSuperclass();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getEntity()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embeddable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getEmbeddable()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Embeddable();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Converter</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getConverter()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Converter();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityMappingsType#getVersion()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Version();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityResult
	 * @generated
	 */
	EClass getEntityResult();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getLockMode <em>Lock Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityResult#getLockMode()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_LockMode();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getFieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityResult#getFieldResult()
	 * @see #getEntityResult()
	 * @generated
	 */
	EReference getEntityResult_FieldResult();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityResult#getDiscriminatorColumn()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_DiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getEntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EntityResult#getEntityClass()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_EntityClass();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.FieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.FieldResult
	 * @generated
	 */
	EClass getFieldResult();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.FieldResult#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.FieldResult#getColumn()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Column();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.FieldResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.FieldResult#getName()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ForeignKey#getDescription()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getConstraintMode <em>Constraint Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ForeignKey#getConstraintMode()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_ConstraintMode();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getForeignKeyDefinition <em>Foreign Key Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ForeignKey#getForeignKeyDefinition()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_ForeignKeyDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ForeignKey#getName()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ForeignKey#getOptions()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Options();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.GeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.GeneratedValue
	 * @generated
	 */
	EClass getGeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.GeneratedValue#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.GeneratedValue#getGenerator()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Generator();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.GeneratedValue#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.GeneratedValue#getStrategy()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Strategy();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Id#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id#getColumn()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Column();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Id#getGeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generated Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id#getGeneratedValue()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_GeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Id#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id#getTemporal()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Temporal();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Id#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id#getTableGenerator()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_TableGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Id#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id#getSequenceGenerator()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_SequenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Id#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id#getAccess()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Id#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Id#getName()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.IdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.IdClass
	 * @generated
	 */
	EClass getIdClass();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.IdClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.IdClass#getClass_()
	 * @see #getIdClass()
	 * @generated
	 */
	EAttribute getIdClass_Class();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Index#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Index#getDescription()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Index#getColumnList <em>Column List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column List</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Index#getColumnList()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_ColumnList();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Index#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Index#getName()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Index#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Index#getOptions()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Index#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Index#isUnique()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Unique();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Inheritance#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Inheritance#getStrategy()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Strategy();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn
	 * @generated
	 */
	EClass getJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getComment()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getForeignKey()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EReference getJoinColumn_ForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getCheckConstraint()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EReference getJoinColumn_CheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getColumnDefinition()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#isInsertable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#isNullable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getOptions()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getReferencedColumnName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#getTable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#isUnique()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinColumn#isUpdatable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable
	 * @generated
	 */
	EClass getJoinTable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getComment()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getJoinColumn()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getForeignKey()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_ForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getInverseJoinColumn <em>Inverse Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverse Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getInverseJoinColumn()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_InverseJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getInverseForeignKey <em>Inverse Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverse Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getInverseForeignKey()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_InverseForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getUniqueConstraint()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getIndex()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getCheckConstraint()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_CheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getCatalog()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getName()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getOptions()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.JoinTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.JoinTable#getSchema()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Schema();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Lob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lob</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Lob
	 * @generated
	 */
	EClass getLob();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany
	 * @generated
	 */
	EClass getManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getOrderBy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getOrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getOrderColumn()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_OrderColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKey()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyClass()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyTemporal <em>Map Key Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyTemporal()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MapKeyTemporal();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyEnumerated()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MapKeyEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyAttributeOverride()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyAttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyConvert <em>Map Key Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyConvert()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyConvert();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyColumn()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyJoinColumn()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyForeignKey <em>Map Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMapKeyForeignKey()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getJoinTable()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getCascade()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getAccess()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getFetch()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getMappedBy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getName()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToMany#getTargetEntity()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_TargetEntity();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne
	 * @generated
	 */
	EClass getManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getJoinColumn()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getForeignKey()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getJoinTable()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getCascade()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getAccess()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getFetch()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#isId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#isId()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Id();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getMapsId <em>Maps Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getMapsId()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_MapsId();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getName()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#isOptional()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.ManyToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ManyToOne#getTargetEntity()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_TargetEntity();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKey
	 * @generated
	 */
	EClass getMapKey();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKey#getName()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyClass
	 * @generated
	 */
	EClass getMapKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyClass#getClass_()
	 * @see #getMapKeyClass()
	 * @generated
	 */
	EAttribute getMapKeyClass_Class();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn
	 * @generated
	 */
	EClass getMapKeyColumn();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getColumnDefinition()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isInsertable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getLength()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getName()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isNullable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getOptions()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getPrecision()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getScale()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#getTable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isUnique()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyColumn#isUpdatable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn
	 * @generated
	 */
	EClass getMapKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getForeignKey()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EReference getMapKeyJoinColumn_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getColumnDefinition()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isInsertable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getName()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isNullable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getOptions()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getReferencedColumnName()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#getTable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isUnique()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MapKeyJoinColumn#isUpdatable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Superclass</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass
	 * @generated
	 */
	EClass getMappedSuperclass();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getDescription()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Description();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getIdClass()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_IdClass();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getExcludeDefaultListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_ExcludeDefaultListeners();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getExcludeSuperclassListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_ExcludeSuperclassListeners();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getEntityListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_EntityListeners();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPrePersist()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostPersist()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPreRemove()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostRemove()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPreUpdate()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostUpdate()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getPostLoad()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostLoad();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getAttributes()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getAccess()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#getClass_()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Class();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.MappedSuperclass#isMetadataComplete()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_MetadataComplete();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode <em>Named Attribute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Attribute Node</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode
	 * @generated
	 */
	EClass getNamedAttributeNode();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode#getKeySubgraph <em>Key Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Subgraph</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode#getKeySubgraph()
	 * @see #getNamedAttributeNode()
	 * @generated
	 */
	EAttribute getNamedAttributeNode_KeySubgraph();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode#getName()
	 * @see #getNamedAttributeNode()
	 * @generated
	 */
	EAttribute getNamedAttributeNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode#getSubgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subgraph</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode#getSubgraph()
	 * @see #getNamedAttributeNode()
	 * @generated
	 */
	EAttribute getNamedAttributeNode_Subgraph();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph <em>Named Entity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity Graph</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph
	 * @generated
	 */
	EClass getNamedEntityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getNamedAttributeNode <em>Named Attribute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Attribute Node</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getNamedAttributeNode()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EReference getNamedEntityGraph_NamedAttributeNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getSubgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraph</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getSubgraph()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EReference getNamedEntityGraph_Subgraph();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getSubclassSubgraph <em>Subclass Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subclass Subgraph</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getSubclassSubgraph()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EReference getNamedEntityGraph_SubclassSubgraph();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#isIncludeAllAttributes <em>Include All Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include All Attributes</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#isIncludeAllAttributes()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EAttribute getNamedEntityGraph_IncludeAllAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedEntityGraph#getName()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EAttribute getNamedEntityGraph_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery
	 * @generated
	 */
	EClass getNamedNativeQuery();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getDescription()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getQuery()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getHint()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EReference getNamedNativeQuery_Hint();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getEntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getEntityResult()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EReference getNamedNativeQuery_EntityResult();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getConstructorResult <em>Constructor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructor Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getConstructorResult()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EReference getNamedNativeQuery_ConstructorResult();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getColumnResult()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EReference getNamedNativeQuery_ColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getName()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultClass()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultClass();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultSetMapping()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultSetMapping();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.NamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedQuery
	 * @generated
	 */
	EClass getNamedQuery();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedQuery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedQuery#getDescription()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedQuery#getQuery()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Query();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedQuery#getLockMode <em>Lock Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedQuery#getLockMode()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_LockMode();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedQuery#getHint()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EReference getNamedQuery_Hint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedQuery#getName()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Stored Procedure Query</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery
	 * @generated
	 */
	EClass getNamedStoredProcedureQuery();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getDescription()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getParameter()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EReference getNamedStoredProcedureQuery_Parameter();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Result Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getResultClass()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_ResultClass();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Result Set Mapping</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getResultSetMapping()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_ResultSetMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getHint()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EReference getNamedStoredProcedureQuery_Hint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getName()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedStoredProcedureQuery#getProcedureName()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_ProcedureName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph <em>Named Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Subgraph</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedSubgraph
	 * @generated
	 */
	EClass getNamedSubgraph();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getNamedAttributeNode <em>Named Attribute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Attribute Node</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getNamedAttributeNode()
	 * @see #getNamedSubgraph()
	 * @generated
	 */
	EReference getNamedSubgraph_NamedAttributeNode();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getClass_()
	 * @see #getNamedSubgraph()
	 * @generated
	 */
	EAttribute getNamedSubgraph_Class();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getName()
	 * @see #getNamedSubgraph()
	 * @generated
	 */
	EAttribute getNamedSubgraph_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany
	 * @generated
	 */
	EClass getOneToMany();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderBy()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getOrderColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_OrderColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKey()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyClass()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyTemporal <em>Map Key Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyTemporal()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MapKeyTemporal();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyEnumerated()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MapKeyEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyAttributeOverride()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyAttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyConvert <em>Map Key Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Convert</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyConvert()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyConvert();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyJoinColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyForeignKey <em>Map Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMapKeyForeignKey()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getJoinTable()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_JoinTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getJoinColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getForeignKey()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getCascade()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getAccess()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getFetch()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getMappedBy()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getName()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#isOrphanRemoval <em>Orphan Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphan Removal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#isOrphanRemoval()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_OrphanRemoval();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToMany#getTargetEntity()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_TargetEntity();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne
	 * @generated
	 */
	EClass getOneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getPrimaryKeyJoinColumn()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getPrimaryKeyForeignKey()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_PrimaryKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getJoinColumn()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getForeignKey()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getJoinTable()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getCascade()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getAccess()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getFetch()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#isId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#isId()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Id();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getMappedBy()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getMapsId <em>Maps Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps Id</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getMapsId()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_MapsId();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getName()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#isOptional()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#isOrphanRemoval <em>Orphan Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphan Removal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#isOrphanRemoval()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_OrphanRemoval();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OneToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OneToOne#getTargetEntity()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_TargetEntity();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.OrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrderColumn
	 * @generated
	 */
	EClass getOrderColumn();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OrderColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrderColumn#getColumnDefinition()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OrderColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrderColumn#isInsertable()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OrderColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrderColumn#getName()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OrderColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrderColumn#isNullable()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OrderColumn#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrderColumn#getOptions()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.OrderColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrderColumn#isUpdatable()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Defaults</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults
	 * @generated
	 */
	EClass getPersistenceUnitDefaults();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getDescription()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getSchema()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Schema();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getCatalog()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getDelimitedIdentifiers <em>Delimited Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delimited Identifiers</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getDelimitedIdentifiers()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_DelimitedIdentifiers();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getAccess()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Access();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getCascadePersist()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_CascadePersist();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitDefaults#getEntityListeners()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_EntityListeners();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Metadata</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata
	 * @generated
	 */
	EClass getPersistenceUnitMetadata();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata#getDescription()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EAttribute getPersistenceUnitMetadata_Description();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete <em>Xml Mapping Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Mapping Metadata Complete</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EReference getPersistenceUnitMetadata_XmlMappingMetadataComplete();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Defaults</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EReference getPersistenceUnitMetadata_PersistenceUnitDefaults();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Load</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostLoad
	 * @generated
	 */
	EClass getPostLoad();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostLoad#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostLoad#getDescription()
	 * @see #getPostLoad()
	 * @generated
	 */
	EAttribute getPostLoad_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostLoad#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostLoad#getMethodName()
	 * @see #getPostLoad()
	 * @generated
	 */
	EAttribute getPostLoad_MethodName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostPersist
	 * @generated
	 */
	EClass getPostPersist();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostPersist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostPersist#getDescription()
	 * @see #getPostPersist()
	 * @generated
	 */
	EAttribute getPostPersist_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostPersist#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostPersist#getMethodName()
	 * @see #getPostPersist()
	 * @generated
	 */
	EAttribute getPostPersist_MethodName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostRemove
	 * @generated
	 */
	EClass getPostRemove();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostRemove#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostRemove#getDescription()
	 * @see #getPostRemove()
	 * @generated
	 */
	EAttribute getPostRemove_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostRemove#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostRemove#getMethodName()
	 * @see #getPostRemove()
	 * @generated
	 */
	EAttribute getPostRemove_MethodName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostUpdate
	 * @generated
	 */
	EClass getPostUpdate();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostUpdate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostUpdate#getDescription()
	 * @see #getPostUpdate()
	 * @generated
	 */
	EAttribute getPostUpdate_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PostUpdate#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PostUpdate#getMethodName()
	 * @see #getPostUpdate()
	 * @generated
	 */
	EAttribute getPostUpdate_MethodName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Persist</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrePersist
	 * @generated
	 */
	EClass getPrePersist();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PrePersist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrePersist#getDescription()
	 * @see #getPrePersist()
	 * @generated
	 */
	EAttribute getPrePersist_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PrePersist#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrePersist#getMethodName()
	 * @see #getPrePersist()
	 * @generated
	 */
	EAttribute getPrePersist_MethodName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Remove</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PreRemove
	 * @generated
	 */
	EClass getPreRemove();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PreRemove#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PreRemove#getDescription()
	 * @see #getPreRemove()
	 * @generated
	 */
	EAttribute getPreRemove_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PreRemove#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PreRemove#getMethodName()
	 * @see #getPreRemove()
	 * @generated
	 */
	EAttribute getPreRemove_MethodName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Update</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PreUpdate
	 * @generated
	 */
	EClass getPreUpdate();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PreUpdate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PreUpdate#getDescription()
	 * @see #getPreUpdate()
	 * @generated
	 */
	EAttribute getPreUpdate_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PreUpdate#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PreUpdate#getMethodName()
	 * @see #getPreUpdate()
	 * @generated
	 */
	EAttribute getPreUpdate_MethodName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn
	 * @generated
	 */
	EClass getPrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getForeignKey()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EReference getPrimaryKeyJoinColumn_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getColumnDefinition()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getOptions()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn#getReferencedColumnName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.QueryHint <em>Query Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Hint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.QueryHint
	 * @generated
	 */
	EClass getQueryHint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.QueryHint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.QueryHint#getDescription()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.QueryHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.QueryHint#getName()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.QueryHint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.QueryHint#getValue()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Value();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable <em>Secondary Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable
	 * @generated
	 */
	EClass getSecondaryTable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getComment()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getPrimaryKeyJoinColumn()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getPrimaryKeyForeignKey()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_PrimaryKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getUniqueConstraint()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getIndex()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_Index();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getForeignKey()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_ForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getCheckConstraint()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_CheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getCatalog()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getName()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getOptions()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getSchema()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Schema();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator
	 * @generated
	 */
	EClass getSequenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getDescription()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getAllocationSize()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_AllocationSize();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getCatalog()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getInitialValue()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getOptions()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getSchema()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Schema();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SequenceGenerator#getSequenceName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_SequenceName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Result Set Mapping</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping
	 * @generated
	 */
	EClass getSqlResultSetMapping();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getDescription()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EAttribute getSqlResultSetMapping_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getEntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getEntityResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_EntityResult();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getConstructorResult <em>Constructor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructor Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getConstructorResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_ConstructorResult();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Result</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getColumnResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_ColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.SqlResultSetMapping#getName()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EAttribute getSqlResultSetMapping_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter <em>Stored Procedure Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Procedure Parameter</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter
	 * @generated
	 */
	EClass getStoredProcedureParameter();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getDescription()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EAttribute getStoredProcedureParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getClass_()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EAttribute getStoredProcedureParameter_Class();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getMode()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EAttribute getStoredProcedureParameter_Mode();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getName()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EAttribute getStoredProcedureParameter_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Table#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getComment()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Table#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getUniqueConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Table#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getIndex()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.Table#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getCheckConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_CheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Table#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getCatalog()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Table#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getOptions()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Schema();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Generator</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator
	 * @generated
	 */
	EClass getTableGenerator();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getDescription()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getUniqueConstraint()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EReference getTableGenerator_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getIndex()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EReference getTableGenerator_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getCheckConstraint()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EReference getTableGenerator_CheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getAllocationSize()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_AllocationSize();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getCatalog()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getInitialValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getOptions()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Options();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getPkColumnName <em>Pk Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getPkColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnName();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getPkColumnValue <em>Pk Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Value</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getPkColumnValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnValue();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getSchema()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Schema();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getTable()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Table();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.TableGenerator#getValueColumnName <em>Value Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Column Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TableGenerator#getValueColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_ValueColumnName();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Transient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Transient
	 * @generated
	 */
	EClass getTransient();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Transient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Transient#getName()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Name();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link ee.jakarta.xml.ns.persistence.orm.UniqueConstraint#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.UniqueConstraint#getColumnName()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.UniqueConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.UniqueConstraint#getName()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.UniqueConstraint#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.UniqueConstraint#getOptions()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_Options();

	/**
	 * Returns the meta object for class '{@link ee.jakarta.xml.ns.persistence.orm.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the containment reference '{@link ee.jakarta.xml.ns.persistence.orm.Version#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Version#getColumn()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Column();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Version#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Version#getTemporal()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Version#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Version#getAccess()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Access();

	/**
	 * Returns the meta object for the attribute '{@link ee.jakarta.xml.ns.persistence.orm.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.ConstraintMode <em>Constraint Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstraintMode
	 * @generated
	 */
	EEnum getConstraintMode();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discriminator Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorType
	 * @generated
	 */
	EEnum getDiscriminatorType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EnumType
	 * @generated
	 */
	EEnum getEnumType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.FetchType <em>Fetch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.FetchType
	 * @generated
	 */
	EEnum getFetchType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.GenerationType <em>Generation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.GenerationType
	 * @generated
	 */
	EEnum getGenerationType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.InheritanceType
	 * @generated
	 */
	EEnum getInheritanceType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.LockModeType <em>Lock Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Mode Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.LockModeType
	 * @generated
	 */
	EEnum getLockModeType();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link ee.jakarta.xml.ns.persistence.orm.TemporalType <em>Temporal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Type</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TemporalType
	 * @generated
	 */
	EEnum getTemporalType();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.AccessType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.AccessType"
	 *        extendedMetaData="name='access-type:Object' baseType='access-type'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.ConstraintMode <em>Constraint Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constraint Mode Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstraintMode
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.ConstraintMode"
	 *        extendedMetaData="name='constraint-mode:Object' baseType='constraint-mode'"
	 * @generated
	 */
	EDataType getConstraintModeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorType <em>Discriminator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Discriminator Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.DiscriminatorType"
	 *        extendedMetaData="name='discriminator-type:Object' baseType='discriminator-type'"
	 * @generated
	 */
	EDataType getDiscriminatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({TYPE}) @Retention(RUNTIME)
     *         public @interface DiscriminatorValue {
     *           String value();
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Discriminator Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='discriminator-value' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDiscriminatorValue();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.EnumType <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
     *         public @interface Enumerated {
     *           EnumType value() default ORDINAL;
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Enumerated</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EnumType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.EnumType"
	 *        extendedMetaData="name='enumerated' baseType='enum-type'"
	 * @generated
	 */
	EDataType getEnumerated();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.EnumType <em>Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enum Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.EnumType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.EnumType"
	 *        extendedMetaData="name='enum-type:Object' baseType='enum-type'"
	 * @generated
	 */
	EDataType getEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.FetchType <em>Fetch Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fetch Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.FetchType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.FetchType"
	 *        extendedMetaData="name='fetch-type:Object' baseType='fetch-type'"
	 * @generated
	 */
	EDataType getFetchTypeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.GenerationType <em>Generation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generation Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.GenerationType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.GenerationType"
	 *        extendedMetaData="name='generation-type:Object' baseType='generation-type'"
	 * @generated
	 */
	EDataType getGenerationTypeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.InheritanceType <em>Inheritance Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inheritance Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.InheritanceType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.InheritanceType"
	 *        extendedMetaData="name='inheritance-type:Object' baseType='inheritance-type'"
	 * @generated
	 */
	EDataType getInheritanceTypeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.LockModeType <em>Lock Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lock Mode Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.LockModeType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.LockModeType"
	 *        extendedMetaData="name='lock-mode-type:Object' baseType='lock-mode-type'"
	 * @generated
	 */
	EDataType getLockModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
     *         public @interface OrderBy {
     *           String value() default "";
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Order By</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='order-by' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getOrderBy();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.ParameterMode <em>Parameter Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parameter Mode Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.ParameterMode
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.ParameterMode"
	 *        extendedMetaData="name='parameter-mode:Object' baseType='parameter-mode'"
	 * @generated
	 */
	EDataType getParameterModeObject();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.TemporalType <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
     *         public @interface Temporal {
     *           TemporalType value();
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Temporal</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TemporalType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.TemporalType"
	 *        extendedMetaData="name='temporal' baseType='temporal-type'"
	 * @generated
	 */
	EDataType getTemporal();

	/**
	 * Returns the meta object for data type '{@link ee.jakarta.xml.ns.persistence.orm.TemporalType <em>Temporal Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temporal Type Object</em>'.
	 * @see ee.jakarta.xml.ns.persistence.orm.TemporalType
	 * @model instanceClass="ee.jakarta.xml.ns.persistence.orm.TemporalType"
	 *        extendedMetaData="name='temporal-type:Object' baseType='temporal-type'"
	 * @generated
	 */
	EDataType getTemporalTypeObject();

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
	OrmFactory getOrmFactory();

} //OrmPackage
