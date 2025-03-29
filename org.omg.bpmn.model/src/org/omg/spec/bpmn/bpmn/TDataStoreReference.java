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

import javax.xml.namespace.QName;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TData Store Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataStoreRef <em>Data Store Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStoreReference()
 * @model extendedMetaData="name='tDataStoreReference' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDataStoreReference extends TFlowElement {
	/**
	 * Returns the value of the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data State</em>' containment reference.
	 * @see #setDataState(TDataState)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStoreReference_DataState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataState' namespace='##targetNamespace'"
	 * @generated
	 */
	TDataState getDataState();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataState <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data State</em>' containment reference.
	 * @see #getDataState()
	 * @generated
	 */
	void setDataState(TDataState value);

	/**
	 * Returns the value of the '<em><b>Data Store Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Store Ref</em>' attribute.
	 * @see #setDataStoreRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStoreReference_DataStoreRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='dataStoreRef'"
	 * @generated
	 */
	QName getDataStoreRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataStoreRef <em>Data Store Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Store Ref</em>' attribute.
	 * @see #getDataStoreRef()
	 * @generated
	 */
	void setDataStoreRef(QName value);

	/**
	 * Returns the value of the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Subject Ref</em>' attribute.
	 * @see #setItemSubjectRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataStoreReference_ItemSubjectRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemSubjectRef'"
	 * @generated
	 */
	QName getItemSubjectRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getItemSubjectRef <em>Item Subject Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Subject Ref</em>' attribute.
	 * @see #getItemSubjectRef()
	 * @generated
	 */
	void setItemSubjectRef(QName value);

} // TDataStoreReference
