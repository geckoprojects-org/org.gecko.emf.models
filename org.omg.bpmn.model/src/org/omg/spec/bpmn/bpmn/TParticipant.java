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
 * A representation of the model object '<em><b>TParticipant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TParticipant#getInterfaceRef <em>Interface Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TParticipant#getEndPointRef <em>End Point Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TParticipant#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TParticipant#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TParticipant#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipant()
 * @model extendedMetaData="name='tParticipant' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TParticipant extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Interface Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipant_InterfaceRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='interfaceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getInterfaceRef();

	/**
	 * Returns the value of the '<em><b>End Point Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipant_EndPointRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='endPointRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getEndPointRef();

	/**
	 * Returns the value of the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #setParticipantMultiplicity(TParticipantMultiplicity)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipant_ParticipantMultiplicity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantMultiplicity' namespace='##targetNamespace'"
	 * @generated
	 */
	TParticipantMultiplicity getParticipantMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TParticipant#getParticipantMultiplicity <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	void setParticipantMultiplicity(TParticipantMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipant_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TParticipant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ref</em>' attribute.
	 * @see #setProcessRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipant_ProcessRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='processRef'"
	 * @generated
	 */
	QName getProcessRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TParticipant#getProcessRef <em>Process Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' attribute.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(QName value);

} // TParticipant
