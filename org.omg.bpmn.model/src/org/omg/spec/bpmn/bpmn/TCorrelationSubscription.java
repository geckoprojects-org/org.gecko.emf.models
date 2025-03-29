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
 * A representation of the model object '<em><b>TCorrelation Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationSubscription()
 * @model extendedMetaData="name='tCorrelationSubscription' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCorrelationSubscription extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Correlation Property Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Binding</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationSubscription_CorrelationPropertyBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correlationPropertyBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCorrelationPropertyBinding> getCorrelationPropertyBinding();

	/**
	 * Returns the value of the '<em><b>Correlation Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Key Ref</em>' attribute.
	 * @see #setCorrelationKeyRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationSubscription_CorrelationKeyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='correlationKeyRef'"
	 * @generated
	 */
	QName getCorrelationKeyRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Key Ref</em>' attribute.
	 * @see #getCorrelationKeyRef()
	 * @generated
	 */
	void setCorrelationKeyRef(QName value);

} // TCorrelationSubscription
