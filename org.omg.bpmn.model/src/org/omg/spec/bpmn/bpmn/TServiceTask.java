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
 * A representation of the model object '<em><b>TService Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TServiceTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TServiceTask#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTServiceTask()
 * @model extendedMetaData="name='tServiceTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TServiceTask extends TTask {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * The default value is <code>"##WebService"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #isSetImplementation()
	 * @see #unsetImplementation()
	 * @see #setImplementation(Object)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTServiceTask_Implementation()
	 * @model default="##WebService" unsettable="true" dataType="org.omg.spec.bpmn.bpmn.TImplementation"
	 *        extendedMetaData="kind='attribute' name='implementation'"
	 * @generated
	 */
	Object getImplementation();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TServiceTask#getImplementation <em>Implementation</em>}' attribute.
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
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TServiceTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImplementation()
	 * @see #getImplementation()
	 * @see #setImplementation(Object)
	 * @generated
	 */
	void unsetImplementation();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TServiceTask#getImplementation <em>Implementation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Implementation</em>' attribute is set.
	 * @see #unsetImplementation()
	 * @see #getImplementation()
	 * @see #setImplementation(Object)
	 * @generated
	 */
	boolean isSetImplementation();

	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' attribute.
	 * @see #setOperationRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTServiceTask_OperationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='operationRef'"
	 * @generated
	 */
	QName getOperationRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TServiceTask#getOperationRef <em>Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' attribute.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(QName value);

} // TServiceTask
