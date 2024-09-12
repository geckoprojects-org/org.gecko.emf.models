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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.DataObjectReference#getDataObjectRef <em>Data Object Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataObjectReference()
 * @model extendedMetaData="name='tDataObjectReference' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataObjectReference extends FlowElement, ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Data Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Ref</em>' reference.
	 * @see #setDataObjectRef(DataObject)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataObjectReference_DataObjectRef()
	 * @model resolveProxies="false" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='dataObjectRef'"
	 * @generated
	 */
	DataObject getDataObjectRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.DataObjectReference#getDataObjectRef <em>Data Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Ref</em>' reference.
	 * @see #getDataObjectRef()
	 * @generated
	 */
	void setDataObjectRef(DataObject value);

} // DataObjectReference
