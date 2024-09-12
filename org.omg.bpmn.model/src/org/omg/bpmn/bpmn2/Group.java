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
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.Group#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getGroup()
 * @model extendedMetaData="name='tGroup' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Group extends Artifact {
	/**
	 * Returns the value of the '<em><b>Category Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value Ref</em>' reference.
	 * @see #setCategoryValueRef(CategoryValue)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getGroup_CategoryValueRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='categoryValueRef'"
	 * @generated
	 */
	CategoryValue getCategoryValueRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Group#getCategoryValueRef <em>Category Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Value Ref</em>' reference.
	 * @see #getCategoryValueRef()
	 * @generated
	 */
	void setCategoryValueRef(CategoryValue value);

} // Group
