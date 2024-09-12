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
 * A representation of the model object '<em><b>Data Store Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataStoreReference()
 * @model extendedMetaData="name='tDataStoreReference' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataStoreReference extends FlowElement, ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Data Store Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Store Ref</em>' reference.
	 * @see #setDataStoreRef(DataStore)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataStoreReference_DataStoreRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='dataStoreRef'"
	 * @generated
	 */
	DataStore getDataStoreRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Store Ref</em>' reference.
	 * @see #getDataStoreRef()
	 * @generated
	 */
	void setDataStoreRef(DataStore value);

} // DataStoreReference
