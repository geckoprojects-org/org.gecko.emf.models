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
 * A representation of the model object '<em><b>TFilter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TFilter#getIn <em>In</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TFilter#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFilter()
 * @model extendedMetaData="name='tFilter' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TFilter extends TExpression {
	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(TChildExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFilter_In()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='in' namespace='##targetNamespace'"
	 * @generated
	 */
	TChildExpression getIn();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TFilter#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(TChildExpression value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference.
	 * @see #setMatch(TChildExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFilter_Match()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='match' namespace='##targetNamespace'"
	 * @generated
	 */
	TChildExpression getMatch();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TFilter#getMatch <em>Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' containment reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(TChildExpression value);

} // TFilter
