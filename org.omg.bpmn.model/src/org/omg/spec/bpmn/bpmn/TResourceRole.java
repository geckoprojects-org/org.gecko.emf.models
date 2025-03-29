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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TResource Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TResourceRole#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResourceRole()
 * @model extendedMetaData="name='tResourceRole' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TResourceRole extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' attribute.
	 * @see #setResourceRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResourceRole_ResourceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='resourceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getResourceRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceRef <em>Resource Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Ref</em>' attribute.
	 * @see #getResourceRef()
	 * @generated
	 */
	void setResourceRef(QName value);

	/**
	 * Returns the value of the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TResourceParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter Binding</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResourceRole_ResourceParameterBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceParameterBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TResourceParameterBinding> getResourceParameterBinding();

	/**
	 * Returns the value of the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #setResourceAssignmentExpression(TResourceAssignmentExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResourceRole_ResourceAssignmentExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceAssignmentExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	TResourceAssignmentExpression getResourceAssignmentExpression();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 */
	void setResourceAssignmentExpression(TResourceAssignmentExpression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTResourceRole_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TResourceRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TResourceRole
