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
 * A representation of the model object '<em><b>Stored Procedure Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface StoredProcedureParameter {
 *           String name() default "";
 *           ParameterMode mode() default ParameterMode.IN;
 *           Class<?> type();
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getClass_ <em>Class</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getMode <em>Mode</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getStoredProcedureParameter()
 * @model extendedMetaData="name='stored-procedure-parameter' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StoredProcedureParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getStoredProcedureParameter_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getStoredProcedureParameter_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.orm.ParameterMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.ParameterMode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(ParameterMode)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getStoredProcedureParameter_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode'"
	 * @generated
	 */
	ParameterMode getMode();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.ParameterMode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ParameterMode value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(ParameterMode)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(ParameterMode)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getStoredProcedureParameter_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.StoredProcedureParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StoredProcedureParameter
