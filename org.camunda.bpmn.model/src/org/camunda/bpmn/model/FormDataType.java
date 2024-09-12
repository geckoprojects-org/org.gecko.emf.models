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
package org.camunda.bpmn.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.FormDataType#getFormField <em>Form Field</em>}</li>
 * </ul>
 *
 * @see org.camunda.bpmn.model.CamundaPackage#getFormDataType()
 * @model extendedMetaData="name='formData_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FormDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Form Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.camunda.bpmn.model.FormFieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Field</em>' containment reference list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getFormDataType_FormField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formField' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormFieldType> getFormField();

} // FormDataType
