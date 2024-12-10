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
 * A representation of the model object '<em><b>Secondary Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Repeatable(SecondaryTables.class)
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface SecondaryTable {
 *           String name();
 *           String catalog() default "";
 *           String schema() default "";
 *           PrimaryKeyJoinColumn[] pkJoinColumns() default {};
 *           ForeignKey foreignKey() default @ForeignKey(ConstraintMode.PROVIDER_DEFAULT);
 *           UniqueConstraint[] uniqueConstraints() default {};
 *           Index[] indexes() default {};
 *           CheckConstraint[] check() default {};
 *           String comment() default "";
 *           String options() default "";
 *         }
 * 
 *        
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getComment <em>Comment</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getUniqueConstraint <em>Unique Constraint</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getIndex <em>Index</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getCheckConstraint <em>Check Constraint</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getOptions <em>Options</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable()
 * @model extendedMetaData="name='secondary-table' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SecondaryTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.PrimaryKeyJoinColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Join Column</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_PrimaryKeyJoinColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primary-key-join-column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn();

	/**
	 * Returns the value of the '<em><b>Primary Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Foreign Key</em>' containment reference.
	 * @see #setPrimaryKeyForeignKey(ForeignKey)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_PrimaryKeyForeignKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primary-key-foreign-key' namespace='##targetNamespace'"
	 * @generated
	 */
	ForeignKey getPrimaryKeyForeignKey();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Foreign Key</em>' containment reference.
	 * @see #getPrimaryKeyForeignKey()
	 * @generated
	 */
	void setPrimaryKeyForeignKey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.UniqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Constraint</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_UniqueConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unique-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UniqueConstraint> getUniqueConstraint();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_Index()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Index> getIndex();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference.
	 * @see #setForeignKey(ForeignKey)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_ForeignKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='foreign-key' namespace='##targetNamespace'"
	 * @generated
	 */
	ForeignKey getForeignKey();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getForeignKey <em>Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' containment reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Check Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.CheckConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Constraint</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_CheckConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='check-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CheckConstraint> getCheckConstraint();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_Catalog()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_Options()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='options'"
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getSecondaryTable_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schema'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.SecondaryTable#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

} // SecondaryTable
