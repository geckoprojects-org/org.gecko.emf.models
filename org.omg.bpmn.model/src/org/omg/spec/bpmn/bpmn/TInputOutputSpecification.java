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
 * A representation of the model object '<em><b>TInput Output Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getOutputSet <em>Output Set</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputSpecification()
 * @model extendedMetaData="name='tInputOutputSpecification' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TInputOutputSpecification extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Data Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TDataInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputSpecification_DataInput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataInput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDataInput> getDataInput();

	/**
	 * Returns the value of the '<em><b>Data Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TDataOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputSpecification_DataOutput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDataOutput> getDataOutput();

	/**
	 * Returns the value of the '<em><b>Input Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TInputSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputSpecification_InputSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inputSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TInputSet> getInputSet();

	/**
	 * Returns the value of the '<em><b>Output Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TOutputSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputSpecification_OutputSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outputSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TOutputSet> getOutputSet();

} // TInputOutputSpecification
