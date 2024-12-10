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
 * A representation of the model object '<em><b>Entity Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface EntityResult {
 *           Class<?> entityClass();
 *           LockModeType lockMode() default LockModeType.OPTIMISTIC;
 *           FieldResult[] fields() default {};
 *           String discriminatorColumn() default "";
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getLockMode <em>Lock Mode</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getFieldResult <em>Field Result</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getEntityClass <em>Entity Class</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getEntityResult()
 * @model extendedMetaData="name='entity-result' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EntityResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Lock Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.orm.LockModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.LockModeType
	 * @see #isSetLockMode()
	 * @see #unsetLockMode()
	 * @see #setLockMode(LockModeType)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getEntityResult_LockMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='lock-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	LockModeType getLockMode();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getLockMode <em>Lock Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.orm.LockModeType
	 * @see #isSetLockMode()
	 * @see #unsetLockMode()
	 * @see #getLockMode()
	 * @generated
	 */
	void setLockMode(LockModeType value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getLockMode <em>Lock Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLockMode()
	 * @see #getLockMode()
	 * @see #setLockMode(LockModeType)
	 * @generated
	 */
	void unsetLockMode();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getLockMode <em>Lock Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lock Mode</em>' attribute is set.
	 * @see #unsetLockMode()
	 * @see #getLockMode()
	 * @see #setLockMode(LockModeType)
	 * @generated
	 */
	boolean isSetLockMode();

	/**
	 * Returns the value of the '<em><b>Field Result</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.FieldResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Result</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getEntityResult_FieldResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='field-result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FieldResult> getFieldResult();

	/**
	 * Returns the value of the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column</em>' attribute.
	 * @see #setDiscriminatorColumn(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getEntityResult_DiscriminatorColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='discriminator-column'"
	 * @generated
	 */
	String getDiscriminatorColumn();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column</em>' attribute.
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	void setDiscriminatorColumn(String value);

	/**
	 * Returns the value of the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Class</em>' attribute.
	 * @see #setEntityClass(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getEntityResult_EntityClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='entity-class'"
	 * @generated
	 */
	String getEntityClass();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.EntityResult#getEntityClass <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Class</em>' attribute.
	 * @see #getEntityClass()
	 * @generated
	 */
	void setEntityClass(String value);

} // EntityResult
