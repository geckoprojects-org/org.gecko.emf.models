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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discriminator Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface DiscriminatorColumn {
 *           String name() default "DTYPE";
 *           DiscriminatorType discriminatorType() default STRING;
 *           String columnDefinition() default "";
 *           String options() default "";
 *           int length() default 31;
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getLength <em>Length</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getDiscriminatorColumn()
 * @model extendedMetaData="name='discriminator-column' kind='empty'"
 * @generated
 */
@ProviderType
public interface DiscriminatorColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Definition</em>' attribute.
	 * @see #setColumnDefinition(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getDiscriminatorColumn_ColumnDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column-definition'"
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Type</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorType
	 * @see #isSetDiscriminatorType()
	 * @see #unsetDiscriminatorType()
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getDiscriminatorColumn_DiscriminatorType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='discriminator-type'"
	 * @generated
	 */
	DiscriminatorType getDiscriminatorType();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Type</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.DiscriminatorType
	 * @see #isSetDiscriminatorType()
	 * @see #unsetDiscriminatorType()
	 * @see #getDiscriminatorType()
	 * @generated
	 */
	void setDiscriminatorType(DiscriminatorType value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscriminatorType()
	 * @see #getDiscriminatorType()
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @generated
	 */
	void unsetDiscriminatorType();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discriminator Type</em>' attribute is set.
	 * @see #unsetDiscriminatorType()
	 * @see #getDiscriminatorType()
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @generated
	 */
	boolean isSetDiscriminatorType();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(int)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getDiscriminatorColumn_Length()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='length'"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	boolean isSetLength();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getDiscriminatorColumn_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getName <em>Name</em>}' attribute.
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
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getDiscriminatorColumn_Options()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='options'"
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.DiscriminatorColumn#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

} // DiscriminatorColumn
