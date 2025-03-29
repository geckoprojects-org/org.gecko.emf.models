/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.bpmn.bpmn;

import java.math.BigInteger;

import javax.xml.namespace.QName;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TData Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStore#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStore#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStore#isIsUnlimited <em>Is Unlimited</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStore#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStore#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStore()
 * @model extendedMetaData="name='tDataStore' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDataStore extends TRootElement {
	/**
	 * Returns the value of the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data State</em>' containment reference.
	 * @see #setDataState(TDataState)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStore_DataState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataState' namespace='##targetNamespace'"
	 * @generated
	 */
	TDataState getDataState();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStore#getDataState <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data State</em>' containment reference.
	 * @see #getDataState()
	 * @generated
	 */
	void setDataState(TDataState value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(BigInteger)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStore_Capacity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='capacity'"
	 * @generated
	 */
	BigInteger getCapacity();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStore#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Is Unlimited</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unlimited</em>' attribute.
	 * @see #isSetIsUnlimited()
	 * @see #unsetIsUnlimited()
	 * @see #setIsUnlimited(boolean)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStore_IsUnlimited()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isUnlimited'"
	 * @generated
	 */
	boolean isIsUnlimited();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unlimited</em>' attribute.
	 * @see #isSetIsUnlimited()
	 * @see #unsetIsUnlimited()
	 * @see #isIsUnlimited()
	 * @generated
	 */
	void setIsUnlimited(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUnlimited()
	 * @see #isIsUnlimited()
	 * @see #setIsUnlimited(boolean)
	 * @generated
	 */
	void unsetIsUnlimited();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Unlimited</em>' attribute is set.
	 * @see #unsetIsUnlimited()
	 * @see #isIsUnlimited()
	 * @see #setIsUnlimited(boolean)
	 * @generated
	 */
	boolean isSetIsUnlimited();

	/**
	 * Returns the value of the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Subject Ref</em>' attribute.
	 * @see #setItemSubjectRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStore_ItemSubjectRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemSubjectRef'"
	 * @generated
	 */
	QName getItemSubjectRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStore#getItemSubjectRef <em>Item Subject Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Subject Ref</em>' attribute.
	 * @see #getItemSubjectRef()
	 * @generated
	 */
	void setItemSubjectRef(QName value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStore_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TDataStore
