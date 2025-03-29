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
 * A representation of the model object '<em><b>TGroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TGroup#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGroup()
 * @model extendedMetaData="name='tGroup' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TGroup extends TArtifact {
	/**
	 * Returns the value of the '<em><b>Category Value Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value Ref</em>' attribute.
	 * @see #setCategoryValueRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGroup_CategoryValueRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='categoryValueRef'"
	 * @generated
	 */
	QName getCategoryValueRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TGroup#getCategoryValueRef <em>Category Value Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Value Ref</em>' attribute.
	 * @see #getCategoryValueRef()
	 * @generated
	 */
	void setCategoryValueRef(QName value);

} // TGroup
