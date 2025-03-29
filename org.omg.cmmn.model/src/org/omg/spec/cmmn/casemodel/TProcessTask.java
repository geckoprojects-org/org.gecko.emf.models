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
package org.omg.spec.cmmn.casemodel;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TProcess Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tProcessTask defines the type of element "process"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcessTask#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRefExpression <em>Process Ref Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcessTask()
 * @model extendedMetaData="name='tProcessTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TProcessTask extends TTask {
	/**
	 * Returns the value of the '<em><b>Parameter Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TParameterMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mapping</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcessTask_ParameterMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParameterMapping> getParameterMapping();

	/**
	 * Returns the value of the '<em><b>Process Ref Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 processRefExpression is mutually exclusive to processRef. It allows the selection of a
	 *                 process at runtime via an expression rather then at design time with processRef.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Ref Expression</em>' containment reference.
	 * @see #setProcessRefExpression(TExpression)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcessTask_ProcessRefExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processRefExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getProcessRefExpression();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRefExpression <em>Process Ref Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref Expression</em>' containment reference.
	 * @see #getProcessRefExpression()
	 * @generated
	 */
	void setProcessRefExpression(TExpression value);

	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               processRef refers a "process" element which is re-usable and can
	 *               be imported via some other file. processRef is mutually exclusive to processRefExpression
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Ref</em>' attribute.
	 * @see #setProcessRef(QName)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcessTask_ProcessRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='processRef'"
	 * @generated
	 */
	QName getProcessRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRef <em>Process Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' attribute.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(QName value);

} // TProcessTask
