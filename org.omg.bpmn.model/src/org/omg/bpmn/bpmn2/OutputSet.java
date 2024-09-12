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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.OutputSet#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.OutputSet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOutputSet()
 * @model extendedMetaData="name='tOutputSet' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OutputSet extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data Output Refs</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.DataOutput}.
	 * It is bidirectional and its opposite is '{@link org.omg.bpmn.bpmn2.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Refs</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOutputSet_DataOutputRefs()
	 * @see org.omg.bpmn.bpmn2.DataOutput#getOutputSetRefs
	 * @model opposite="outputSetRefs" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element' name='dataOutputRefs' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<DataOutput> getDataOutputRefs();

	/**
	 * Returns the value of the '<em><b>Optional Output Refs</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.DataOutput}.
	 * It is bidirectional and its opposite is '{@link org.omg.bpmn.bpmn2.DataOutput#getOutputSetWithOptional <em>Output Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Output Refs</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOutputSet_OptionalOutputRefs()
	 * @see org.omg.bpmn.bpmn2.DataOutput#getOutputSetWithOptional
	 * @model opposite="outputSetWithOptional" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element' name='optionalOutputRefs' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<DataOutput> getOptionalOutputRefs();

	/**
	 * Returns the value of the '<em><b>While Executing Output Refs</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.DataOutput}.
	 * It is bidirectional and its opposite is '{@link org.omg.bpmn.bpmn2.DataOutput#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Executing Output Refs</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOutputSet_WhileExecutingOutputRefs()
	 * @see org.omg.bpmn.bpmn2.DataOutput#getOutputSetWithWhileExecuting
	 * @model opposite="outputSetWithWhileExecuting" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element' name='whileExecutingOutputRefs' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<DataOutput> getWhileExecutingOutputRefs();

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.omg.bpmn.bpmn2.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOutputSet_InputSetRefs()
	 * @see org.omg.bpmn.bpmn2.InputSet#getOutputSetRefs
	 * @model opposite="outputSetRefs" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element' name='inputSetRefs' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<InputSet> getInputSetRefs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOutputSet_Name()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.OutputSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OutputSet
