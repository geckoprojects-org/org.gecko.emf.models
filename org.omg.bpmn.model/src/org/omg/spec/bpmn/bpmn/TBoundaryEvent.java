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
 * A representation of the model object '<em><b>TBoundary Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#isCancelActivity <em>Cancel Activity</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTBoundaryEvent()
 * @model extendedMetaData="name='tBoundaryEvent' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TBoundaryEvent extends TCatchEvent {
	/**
	 * Returns the value of the '<em><b>Attached To Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached To Ref</em>' attribute.
	 * @see #setAttachedToRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTBoundaryEvent_AttachedToRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='attachedToRef'"
	 * @generated
	 */
	QName getAttachedToRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached To Ref</em>' attribute.
	 * @see #getAttachedToRef()
	 * @generated
	 */
	void setAttachedToRef(QName value);

	/**
	 * Returns the value of the '<em><b>Cancel Activity</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Activity</em>' attribute.
	 * @see #isSetCancelActivity()
	 * @see #unsetCancelActivity()
	 * @see #setCancelActivity(boolean)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTBoundaryEvent_CancelActivity()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='cancelActivity'"
	 * @generated
	 */
	boolean isCancelActivity();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Activity</em>' attribute.
	 * @see #isSetCancelActivity()
	 * @see #unsetCancelActivity()
	 * @see #isCancelActivity()
	 * @generated
	 */
	void setCancelActivity(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCancelActivity()
	 * @see #isCancelActivity()
	 * @see #setCancelActivity(boolean)
	 * @generated
	 */
	void unsetCancelActivity();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cancel Activity</em>' attribute is set.
	 * @see #unsetCancelActivity()
	 * @see #isCancelActivity()
	 * @see #setCancelActivity(boolean)
	 * @generated
	 */
	boolean isSetCancelActivity();

} // TBoundaryEvent
