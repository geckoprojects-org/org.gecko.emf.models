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
 * A representation of the model object '<em><b>TDecision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tDecision defines the type of element "decision"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecision#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecision#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecision#getExternalRef <em>External Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecision#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecision#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecision()
 * @model extendedMetaData="name='tDecision' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDecision extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TDecisionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecision_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDecisionParameter> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TDecisionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecision_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDecisionParameter> getOutput();

	/**
	 * Returns the value of the '<em><b>External Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ref</em>' attribute.
	 * @see #setExternalRef(QName)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecision_ExternalRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='externalRef'"
	 * @generated
	 */
	QName getExternalRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TDecision#getExternalRef <em>External Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ref</em>' attribute.
	 * @see #getExternalRef()
	 * @generated
	 */
	void setExternalRef(QName value);

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' attribute.
	 * The default value is <code>"http://www.omg.org/spec/CMMN/DecisionType/Unspecified"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' attribute.
	 * @see #isSetImplementationType()
	 * @see #unsetImplementationType()
	 * @see #setImplementationType(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecision_ImplementationType()
	 * @model default="http://www.omg.org/spec/CMMN/DecisionType/Unspecified" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='implementationType'"
	 * @generated
	 */
	String getImplementationType();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TDecision#getImplementationType <em>Implementation Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.omg.spec.cmmn.casemodel.TDecision#getImplementationType <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImplementationType()
	 * @see #getImplementationType()
	 * @see #setImplementationType(String)
	 * @generated
	 */
	void unsetImplementationType();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.casemodel.TDecision#getImplementationType <em>Implementation Type</em>}' attribute is set.
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
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecision_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TDecision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TDecision
