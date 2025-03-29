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
 * A representation of the model object '<em><b>TCorrelation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationPropertyRetrievalExpression()
 * @model extendedMetaData="name='tCorrelationPropertyRetrievalExpression' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCorrelationPropertyRetrievalExpression extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Message Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Path</em>' containment reference.
	 * @see #setMessagePath(TFormalExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationPropertyRetrievalExpression_MessagePath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='messagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	TFormalExpression getMessagePath();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Path</em>' containment reference.
	 * @see #getMessagePath()
	 * @generated
	 */
	void setMessagePath(TFormalExpression value);

	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref</em>' attribute.
	 * @see #setMessageRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationPropertyRetrievalExpression_MessageRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='messageRef'"
	 * @generated
	 */
	QName getMessageRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' attribute.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(QName value);

} // TCorrelationPropertyRetrievalExpression
