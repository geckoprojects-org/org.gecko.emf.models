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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Native Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Repeatable(NamedNativeQueries.class)
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface NamedNativeQuery {
 *           String name();
 *           String query();
 *           QueryHint[] hints() default {};
 *           Class<?> resultClass() default void.class;
 *           String resultSetMapping() default ""; //named SqlResultSetMapping
 *           EntityResult[] entities() default {};
 *           ConstructorResult[] classes() default {};
 *           ColumnResult[] columns() default {};
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getDescription <em>Description</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getQuery <em>Query</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getHint <em>Hint</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getEntityResult <em>Entity Result</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getConstructorResult <em>Constructor Result</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getColumnResult <em>Column Result</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery()
 * @model extendedMetaData="name='named-native-query' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NamedNativeQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_Query()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.QueryHint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_Hint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryHint> getHint();

	/**
	 * Returns the value of the '<em><b>Entity Result</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.EntityResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Result</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_EntityResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity-result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityResult> getEntityResult();

	/**
	 * Returns the value of the '<em><b>Constructor Result</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.ConstructorResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Result</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_ConstructorResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constructor-result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConstructorResult> getConstructorResult();

	/**
	 * Returns the value of the '<em><b>Column Result</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.ColumnResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Result</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_ColumnResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column-result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColumnResult> getColumnResult();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Class</em>' attribute.
	 * @see #setResultClass(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_ResultClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='result-class'"
	 * @generated
	 */
	String getResultClass();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultClass <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Class</em>' attribute.
	 * @see #getResultClass()
	 * @generated
	 */
	void setResultClass(String value);

	/**
	 * Returns the value of the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Set Mapping</em>' attribute.
	 * @see #setResultSetMapping(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedNativeQuery_ResultSetMapping()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='result-set-mapping'"
	 * @generated
	 */
	String getResultSetMapping();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Set Mapping</em>' attribute.
	 * @see #getResultSetMapping()
	 * @generated
	 */
	void setResultSetMapping(String value);

} // NamedNativeQuery
