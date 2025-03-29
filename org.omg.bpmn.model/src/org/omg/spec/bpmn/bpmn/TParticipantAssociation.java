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
 * A representation of the model object '<em><b>TParticipant Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipantAssociation()
 * @model extendedMetaData="name='tParticipantAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TParticipantAssociation extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Participant Ref</em>' attribute.
	 * @see #setInnerParticipantRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipantAssociation_InnerParticipantRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='innerParticipantRef' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getInnerParticipantRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Participant Ref</em>' attribute.
	 * @see #getInnerParticipantRef()
	 * @generated
	 */
	void setInnerParticipantRef(QName value);

	/**
	 * Returns the value of the '<em><b>Outer Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Participant Ref</em>' attribute.
	 * @see #setOuterParticipantRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTParticipantAssociation_OuterParticipantRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='outerParticipantRef' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getOuterParticipantRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Participant Ref</em>' attribute.
	 * @see #getOuterParticipantRef()
	 * @generated
	 */
	void setOuterParticipantRef(QName value);

} // TParticipantAssociation
