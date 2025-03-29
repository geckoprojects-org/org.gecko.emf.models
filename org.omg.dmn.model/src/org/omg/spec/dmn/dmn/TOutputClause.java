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
package org.omg.spec.dmn.dmn;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOutput Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TOutputClause#getOutputValues <em>Output Values</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TOutputClause#getDefaultOutputEntry <em>Default Output Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TOutputClause#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TOutputClause#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOutputClause()
 * @model extendedMetaData="name='tOutputClause' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TOutputClause extends TDMNElement {
	/**
	 * Returns the value of the '<em><b>Output Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Values</em>' containment reference.
	 * @see #setOutputValues(TUnaryTests)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOutputClause_OutputValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputValues' namespace='##targetNamespace'"
	 * @generated
	 */
	TUnaryTests getOutputValues();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TOutputClause#getOutputValues <em>Output Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Values</em>' containment reference.
	 * @see #getOutputValues()
	 * @generated
	 */
	void setOutputValues(TUnaryTests value);

	/**
	 * Returns the value of the '<em><b>Default Output Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Output Entry</em>' containment reference.
	 * @see #setDefaultOutputEntry(TLiteralExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOutputClause_DefaultOutputEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultOutputEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	TLiteralExpression getDefaultOutputEntry();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TOutputClause#getDefaultOutputEntry <em>Default Output Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Output Entry</em>' containment reference.
	 * @see #getDefaultOutputEntry()
	 * @generated
	 */
	void setDefaultOutputEntry(TLiteralExpression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOutputClause_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TOutputClause#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' attribute.
	 * @see #setTypeRef(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOutputClause_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='typeRef'"
	 * @generated
	 */
	String getTypeRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TOutputClause#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(String value);

} // TOutputClause
