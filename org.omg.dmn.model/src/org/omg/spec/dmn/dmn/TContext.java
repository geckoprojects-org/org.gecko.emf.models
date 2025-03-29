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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TContext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TContext#getContextEntry <em>Context Entry</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTContext()
 * @model extendedMetaData="name='tContext' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TContext extends TExpression {
	/**
	 * Returns the value of the '<em><b>Context Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TContextEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Entry</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTContext_ContextEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contextEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TContextEntry> getContextEntry();

} // TContext
