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
 * A representation of the model object '<em><b>TProcess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tProcess defines the type of element "process"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcess#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcess#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcess#getExternalRef <em>External Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcess#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TProcess#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcess()
 * @model extendedMetaData="name='tProcess' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TProcess extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcess_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TProcessParameter> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcess_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TProcessParameter> getOutput();

	/**
	 * Returns the value of the '<em><b>External Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ref</em>' attribute.
	 * @see #setExternalRef(QName)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcess_ExternalRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='externalRef'"
	 * @generated
	 */
	QName getExternalRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TProcess#getExternalRef <em>External Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ref</em>' attribute.
	 * @see #getExternalRef()
	 * @generated
	 */
	void setExternalRef(QName value);

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' attribute.
	 * The default value is <code>"http://www.omg.org/spec/CMMN/ProcessType/Unspecified"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' attribute.
	 * @see #isSetImplementationType()
	 * @see #unsetImplementationType()
	 * @see #setImplementationType(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcess_ImplementationType()
	 * @model default="http://www.omg.org/spec/CMMN/ProcessType/Unspecified" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='implementationType'"
	 * @generated
	 */
	String getImplementationType();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TProcess#getImplementationType <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' attribute.
	 * @see #isSetImplementationType()
	 * @see #unsetImplementationType()
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(String value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.casemodel.TProcess#getImplementationType <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImplementationType()
	 * @see #getImplementationType()
	 * @see #setImplementationType(String)
	 * @generated
	 */
	void unsetImplementationType();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.casemodel.TProcess#getImplementationType <em>Implementation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Implementation Type</em>' attribute is set.
	 * @see #unsetImplementationType()
	 * @see #getImplementationType()
	 * @see #setImplementationType(String)
	 * @generated
	 */
	boolean isSetImplementationType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTProcess_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TProcess
