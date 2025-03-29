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
 * A representation of the model object '<em><b>TQuantified</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TQuantified#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTQuantified()
 * @model extendedMetaData="name='tQuantified' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TQuantified extends TIterator {
	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfies</em>' containment reference.
	 * @see #setSatisfies(TChildExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTQuantified_Satisfies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='satisfies' namespace='##targetNamespace'"
	 * @generated
	 */
	TChildExpression getSatisfies();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TQuantified#getSatisfies <em>Satisfies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfies</em>' containment reference.
	 * @see #getSatisfies()
	 * @generated
	 */
	void setSatisfies(TChildExpression value);

} // TQuantified
