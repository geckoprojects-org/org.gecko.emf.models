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
 * A representation of the model object '<em><b>TCall Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCallChoreography#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCallChoreography()
 * @model extendedMetaData="name='tCallChoreography' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCallChoreography extends TChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Participant Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Association</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCallChoreography_ParticipantAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParticipantAssociation> getParticipantAssociation();

	/**
	 * Returns the value of the '<em><b>Called Choreography Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Choreography Ref</em>' attribute.
	 * @see #setCalledChoreographyRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCallChoreography_CalledChoreographyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='calledChoreographyRef'"
	 * @generated
	 */
	QName getCalledChoreographyRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Choreography Ref</em>' attribute.
	 * @see #getCalledChoreographyRef()
	 * @generated
	 */
	void setCalledChoreographyRef(QName value);

} // TCallChoreography
