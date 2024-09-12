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
 * A representation of the model object '<em><b>Call Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.CallChoreography#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.CallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallChoreography()
 * @model extendedMetaData="name='tCallChoreography' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CallChoreography extends ChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.ParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Associations</em>' containment reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallChoreography_ParticipantAssociations()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='participantAssociation' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<ParticipantAssociation> getParticipantAssociations();

	/**
	 * Returns the value of the '<em><b>Called Choreography Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Choreography Ref</em>' reference.
	 * @see #setCalledChoreographyRef(Choreography)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallChoreography_CalledChoreographyRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='calledChoreographyRef'"
	 * @generated
	 */
	Choreography getCalledChoreographyRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.CallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Choreography Ref</em>' reference.
	 * @see #getCalledChoreographyRef()
	 * @generated
	 */
	void setCalledChoreographyRef(Choreography value);

} // CallChoreography
