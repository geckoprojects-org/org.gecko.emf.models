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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOutput Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOutputSet#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOutputSet#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TOutputSet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOutputSet()
 * @model extendedMetaData="name='tOutputSet' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TOutputSet extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Data Output Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Refs</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOutputSet_DataOutputRefs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='element' name='dataOutputRefs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDataOutputRefs();

	/**
	 * Returns the value of the '<em><b>Optional Output Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Output Refs</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOutputSet_OptionalOutputRefs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='element' name='optionalOutputRefs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getOptionalOutputRefs();

	/**
	 * Returns the value of the '<em><b>While Executing Output Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Executing Output Refs</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOutputSet_WhileExecutingOutputRefs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='element' name='whileExecutingOutputRefs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getWhileExecutingOutputRefs();

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOutputSet_InputSetRefs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='element' name='inputSetRefs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getInputSetRefs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTOutputSet_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TOutputSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TOutputSet
