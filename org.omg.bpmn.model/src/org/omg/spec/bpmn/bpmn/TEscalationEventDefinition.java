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
 * A representation of the model object '<em><b>TEscalation Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TEscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEscalationEventDefinition()
 * @model extendedMetaData="name='tEscalationEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TEscalationEventDefinition extends TEventDefinition {
	/**
	 * Returns the value of the '<em><b>Escalation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escalation Ref</em>' attribute.
	 * @see #setEscalationRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEscalationEventDefinition_EscalationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='escalationRef'"
	 * @generated
	 */
	QName getEscalationRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TEscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation Ref</em>' attribute.
	 * @see #getEscalationRef()
	 * @generated
	 */
	void setEscalationRef(QName value);

} // TEscalationEventDefinition
