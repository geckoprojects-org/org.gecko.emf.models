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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TThrow Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinitionGroup <em>Event Definition Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinitionRef <em>Event Definition Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTThrowEvent()
 * @model abstract="true"
 *        extendedMetaData="name='tThrowEvent' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TThrowEvent extends TEvent {
	/**
	 * Returns the value of the '<em><b>Data Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TDataInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTThrowEvent_DataInput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataInput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDataInput> getDataInput();

	/**
	 * Returns the value of the '<em><b>Data Input Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TDataInputAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Association</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTThrowEvent_DataInputAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataInputAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDataInputAssociation> getDataInputAssociation();

	/**
	 * Returns the value of the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set</em>' containment reference.
	 * @see #setInputSet(TInputSet)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTThrowEvent_InputSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputSet' namespace='##targetNamespace'"
	 * @generated
	 */
	TInputSet getInputSet();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getInputSet <em>Input Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Set</em>' containment reference.
	 * @see #getInputSet()
	 * @generated
	 */
	void setInputSet(TInputSet value);

	/**
	 * Returns the value of the '<em><b>Event Definition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition Group</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTThrowEvent_EventDefinitionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='eventDefinition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEventDefinitionGroup();

	/**
	 * Returns the value of the '<em><b>Event Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TEventDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTThrowEvent_EventDefinition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='eventDefinition' namespace='##targetNamespace' group='eventDefinition:group'"
	 * @generated
	 */
	EList<TEventDefinition> getEventDefinition();

	/**
	 * Returns the value of the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTThrowEvent_EventDefinitionRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='eventDefinitionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getEventDefinitionRef();

} // TThrowEvent
