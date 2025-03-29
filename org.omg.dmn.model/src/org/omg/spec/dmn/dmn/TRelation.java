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
 * A representation of the model object '<em><b>TRelation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TRelation#getColumn <em>Column</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TRelation#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTRelation()
 * @model extendedMetaData="name='tRelation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TRelation extends TExpression {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TInformationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTRelation_Column()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TInformationItem> getColumn();

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTRelation_Row()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TList> getRow();

} // TRelation
