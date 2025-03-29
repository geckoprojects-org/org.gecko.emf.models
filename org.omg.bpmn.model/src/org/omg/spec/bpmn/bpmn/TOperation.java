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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOperation#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOperation#getOutMessageRef <em>Out Message Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOperation#getErrorRef <em>Error Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOperation#getImplementationRef <em>Implementation Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOperation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOperation()
 * @model extendedMetaData="name='tOperation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TOperation extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>In Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Message Ref</em>' attribute.
	 * @see #setInMessageRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOperation_InMessageRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='inMessageRef' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getInMessageRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TOperation#getInMessageRef <em>In Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Message Ref</em>' attribute.
	 * @see #getInMessageRef()
	 * @generated
	 */
	void setInMessageRef(QName value);

	/**
	 * Returns the value of the '<em><b>Out Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Message Ref</em>' attribute.
	 * @see #setOutMessageRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOperation_OutMessageRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='outMessageRef' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getOutMessageRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TOperation#getOutMessageRef <em>Out Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Message Ref</em>' attribute.
	 * @see #getOutMessageRef()
	 * @generated
	 */
	void setOutMessageRef(QName value);

	/**
	 * Returns the value of the '<em><b>Error Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOperation_ErrorRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='errorRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getErrorRef();

	/**
	 * Returns the value of the '<em><b>Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Ref</em>' attribute.
	 * @see #setImplementationRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOperation_ImplementationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='implementationRef'"
	 * @generated
	 */
	QName getImplementationRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TOperation#getImplementationRef <em>Implementation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Ref</em>' attribute.
	 * @see #getImplementationRef()
	 * @generated
	 */
	void setImplementationRef(QName value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOperation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TOperation
