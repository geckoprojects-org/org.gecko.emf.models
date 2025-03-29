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
 * A representation of the model object '<em><b>TResource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TResource#getResourceParameter <em>Resource Parameter</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TResource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResource()
 * @model extendedMetaData="name='tResource' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TResource extends TRootElement {
	/**
	 * Returns the value of the '<em><b>Resource Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TResourceParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResource_ResourceParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TResourceParameter> getResourceParameter();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResource_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TResource
