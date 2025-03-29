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
 * A representation of the model object '<em><b>TConditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TConditional#getIf <em>If</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TConditional#getThen <em>Then</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TConditional#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTConditional()
 * @model extendedMetaData="name='tConditional' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TConditional extends TExpression {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(TChildExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTConditional_If()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace'"
	 * @generated
	 */
	TChildExpression getIf();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TConditional#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(TChildExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(TChildExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTConditional_Then()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='then' namespace='##targetNamespace'"
	 * @generated
	 */
	TChildExpression getThen();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TConditional#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(TChildExpression value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(TChildExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTConditional_Else()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='else' namespace='##targetNamespace'"
	 * @generated
	 */
	TChildExpression getElse();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TConditional#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(TChildExpression value);

} // TConditional
