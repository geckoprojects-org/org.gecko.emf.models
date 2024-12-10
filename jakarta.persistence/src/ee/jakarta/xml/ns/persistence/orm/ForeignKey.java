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
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface ForeignKey {
 *           String name() default "";
 *           ConstraintMode value() default CONSTRAINT;
 *           String foreign-key-definition() default "";
 *           String options() default "";
 *         }
 * 
 *         Note that the elements that embed the use of the annotation
 *         default this use as @ForeignKey(PROVIDER_DEFAULT).
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getDescription <em>Description</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getConstraintMode <em>Constraint Mode</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getForeignKeyDefinition <em>Foreign Key Definition</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getForeignKey()
 * @model extendedMetaData="name='foreign-key' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getForeignKey_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.orm.ConstraintMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstraintMode
	 * @see #isSetConstraintMode()
	 * @see #unsetConstraintMode()
	 * @see #setConstraintMode(ConstraintMode)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getForeignKey_ConstraintMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='constraint-mode'"
	 * @generated
	 */
	ConstraintMode getConstraintMode();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getConstraintMode <em>Constraint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.ConstraintMode
	 * @see #isSetConstraintMode()
	 * @see #unsetConstraintMode()
	 * @see #getConstraintMode()
	 * @generated
	 */
	void setConstraintMode(ConstraintMode value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getConstraintMode <em>Constraint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstraintMode()
	 * @see #getConstraintMode()
	 * @see #setConstraintMode(ConstraintMode)
	 * @generated
	 */
	void unsetConstraintMode();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getConstraintMode <em>Constraint Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constraint Mode</em>' attribute is set.
	 * @see #unsetConstraintMode()
	 * @see #getConstraintMode()
	 * @see #setConstraintMode(ConstraintMode)
	 * @generated
	 */
	boolean isSetConstraintMode();

	/**
	 * Returns the value of the '<em><b>Foreign Key Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Definition</em>' attribute.
	 * @see #setForeignKeyDefinition(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getForeignKey_ForeignKeyDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='foreign-key-definition'"
	 * @generated
	 */
	String getForeignKeyDefinition();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getForeignKeyDefinition <em>Foreign Key Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Definition</em>' attribute.
	 * @see #getForeignKeyDefinition()
	 * @generated
	 */
	void setForeignKeyDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getForeignKey_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getName <em>Name</em>}' attribute.
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
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getForeignKey_Options()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='options'"
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.ForeignKey#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

} // ForeignKey
