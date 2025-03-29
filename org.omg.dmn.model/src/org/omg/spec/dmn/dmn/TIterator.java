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
 * A representation of the model object '<em><b>TIterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TIterator#getIn <em>In</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TIterator#getIteratorVariable <em>Iterator Variable</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTIterator()
 * @model extendedMetaData="name='tIterator' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TIterator extends TExpression {
	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(TTypedChildExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTIterator_In()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='in' namespace='##targetNamespace'"
	 * @generated
	 */
	TTypedChildExpression getIn();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TIterator#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(TTypedChildExpression value);

	/**
	 * Returns the value of the '<em><b>Iterator Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Variable</em>' attribute.
	 * @see #setIteratorVariable(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTIterator_IteratorVariable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='iteratorVariable'"
	 * @generated
	 */
	String getIteratorVariable();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TIterator#getIteratorVariable <em>Iterator Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Variable</em>' attribute.
	 * @see #getIteratorVariable()
	 * @generated
	 */
	void setIteratorVariable(String value);

} // TIterator
