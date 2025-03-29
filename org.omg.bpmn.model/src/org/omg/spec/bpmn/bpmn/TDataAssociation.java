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
 * A representation of the model object '<em><b>TData Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataAssociation()
 * @model extendedMetaData="name='tDataAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDataAssociation extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataAssociation_SourceRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='element' name='sourceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSourceRef();

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' attribute.
	 * @see #setTargetRef(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataAssociation_TargetRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='element' name='targetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getTargetRef <em>Target Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' attribute.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(String value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TFormalExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataAssociation_Transformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TFormalExpression getTransformation();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TFormalExpression value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDataAssociation_Assignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assignment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TAssignment> getAssignment();

} // TDataAssociation
