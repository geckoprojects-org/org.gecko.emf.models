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
 * A representation of the model object '<em><b>TEscalation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TEscalation#getEscalationCode <em>Escalation Code</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TEscalation#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TEscalation#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEscalation()
 * @model extendedMetaData="name='tEscalation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TEscalation extends TRootElement {
	/**
	 * Returns the value of the '<em><b>Escalation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escalation Code</em>' attribute.
	 * @see #setEscalationCode(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEscalation_EscalationCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='escalationCode'"
	 * @generated
	 */
	String getEscalationCode();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TEscalation#getEscalationCode <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation Code</em>' attribute.
	 * @see #getEscalationCode()
	 * @generated
	 */
	void setEscalationCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEscalation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TEscalation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Structure Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Ref</em>' attribute.
	 * @see #setStructureRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEscalation_StructureRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='structureRef'"
	 * @generated
	 */
	QName getStructureRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TEscalation#getStructureRef <em>Structure Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Ref</em>' attribute.
	 * @see #getStructureRef()
	 * @generated
	 */
	void setStructureRef(QName value);

} // TEscalation
