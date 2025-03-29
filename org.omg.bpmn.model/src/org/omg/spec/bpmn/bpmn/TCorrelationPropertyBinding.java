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
 * A representation of the model object '<em><b>TCorrelation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationPropertyBinding()
 * @model extendedMetaData="name='tCorrelationPropertyBinding' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCorrelationPropertyBinding extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' containment reference.
	 * @see #setDataPath(TFormalExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationPropertyBinding_DataPath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataPath' namespace='##targetNamespace'"
	 * @generated
	 */
	TFormalExpression getDataPath();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getDataPath <em>Data Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' containment reference.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(TFormalExpression value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' attribute.
	 * @see #setCorrelationPropertyRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCorrelationPropertyBinding_CorrelationPropertyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='correlationPropertyRef'"
	 * @generated
	 */
	QName getCorrelationPropertyRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Ref</em>' attribute.
	 * @see #getCorrelationPropertyRef()
	 * @generated
	 */
	void setCorrelationPropertyRef(QName value);

} // TCorrelationPropertyBinding
