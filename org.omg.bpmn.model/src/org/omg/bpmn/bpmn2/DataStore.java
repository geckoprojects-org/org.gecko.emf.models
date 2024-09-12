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
package org.omg.bpmn.bpmn2;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.DataStore#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.DataStore#isIsUnlimited <em>Is Unlimited</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.DataStore#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataStore()
 * @model extendedMetaData="name='tDataStore' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataStore extends ItemAwareElement, RootElement {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataStore_Capacity()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='capacity'"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.DataStore#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Is Unlimited</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unlimited</em>' attribute.
	 * @see #setIsUnlimited(boolean)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataStore_IsUnlimited()
	 * @model default="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='isUnlimited'"
	 * @generated
	 */
	boolean isIsUnlimited();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.DataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unlimited</em>' attribute.
	 * @see #isIsUnlimited()
	 * @generated
	 */
	void setIsUnlimited(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataStore_Name()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.DataStore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataStore
