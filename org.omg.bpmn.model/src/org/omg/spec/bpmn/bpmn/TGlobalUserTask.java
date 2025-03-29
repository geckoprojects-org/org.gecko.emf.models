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
 * A representation of the model object '<em><b>TGlobal User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGlobalUserTask()
 * @model extendedMetaData="name='tGlobalUserTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TGlobalUserTask extends TGlobalTask {
	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TRendering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGlobalUserTask_Rendering()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rendering' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TRendering> getRendering();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * The default value is <code>"##unspecified"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #isSetImplementation()
	 * @see #unsetImplementation()
	 * @see #setImplementation(Object)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGlobalUserTask_Implementation()
	 * @model default="##unspecified" unsettable="true" dataType="org.omg.spec.bpmn.bpmn.TImplementation"
	 *        extendedMetaData="kind='attribute' name='implementation'"
	 * @generated
	 */
	Object getImplementation();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #isSetImplementation()
	 * @see #unsetImplementation()
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Object value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImplementation()
	 * @see #getImplementation()
	 * @see #setImplementation(Object)
	 * @generated
	 */
	void unsetImplementation();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask#getImplementation <em>Implementation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Implementation</em>' attribute is set.
	 * @see #unsetImplementation()
	 * @see #getImplementation()
	 * @see #setImplementation(Object)
	 * @generated
	 */
	boolean isSetImplementation();

} // TGlobalUserTask
