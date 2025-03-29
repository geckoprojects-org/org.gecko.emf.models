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
 * A representation of the model object '<em><b>TMessage Flow Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTMessageFlowAssociation()
 * @model extendedMetaData="name='tMessageFlowAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TMessageFlowAssociation extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Message Flow Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Message Flow Ref</em>' attribute.
	 * @see #setInnerMessageFlowRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTMessageFlowAssociation_InnerMessageFlowRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='innerMessageFlowRef'"
	 * @generated
	 */
	QName getInnerMessageFlowRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Message Flow Ref</em>' attribute.
	 * @see #getInnerMessageFlowRef()
	 * @generated
	 */
	void setInnerMessageFlowRef(QName value);

	/**
	 * Returns the value of the '<em><b>Outer Message Flow Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Message Flow Ref</em>' attribute.
	 * @see #setOuterMessageFlowRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTMessageFlowAssociation_OuterMessageFlowRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='outerMessageFlowRef'"
	 * @generated
	 */
	QName getOuterMessageFlowRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Message Flow Ref</em>' attribute.
	 * @see #getOuterMessageFlowRef()
	 * @generated
	 */
	void setOuterMessageFlowRef(QName value);

} // TMessageFlowAssociation
