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
 * A representation of the model object '<em><b>TInput Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TInputClause#getInputExpression <em>Input Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TInputClause#getInputValues <em>Input Values</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTInputClause()
 * @model extendedMetaData="name='tInputClause' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TInputClause extends TDMNElement {
	/**
	 * Returns the value of the '<em><b>Input Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Expression</em>' containment reference.
	 * @see #setInputExpression(TLiteralExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTInputClause_InputExpression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inputExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	TLiteralExpression getInputExpression();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TInputClause#getInputExpression <em>Input Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Expression</em>' containment reference.
	 * @see #getInputExpression()
	 * @generated
	 */
	void setInputExpression(TLiteralExpression value);

	/**
	 * Returns the value of the '<em><b>Input Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values</em>' containment reference.
	 * @see #setInputValues(TUnaryTests)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTInputClause_InputValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputValues' namespace='##targetNamespace'"
	 * @generated
	 */
	TUnaryTests getInputValues();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TInputClause#getInputValues <em>Input Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Values</em>' containment reference.
	 * @see #getInputValues()
	 * @generated
	 */
	void setInputValues(TUnaryTests value);

} // TInputClause
