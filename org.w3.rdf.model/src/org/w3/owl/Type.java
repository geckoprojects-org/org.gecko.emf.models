/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.w3.owl;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The abstract Type class is used to help aggregate things that have either class or data values in OWL 2, to limit extraneous duplication of language in the profile.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.Type#getDisjointUnionOf <em>Disjoint Union Of</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getType()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Type extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Disjoint Union Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Union Of</em>' reference.
	 * @see #setDisjointUnionOf(Type)
	 * @see org.w3.owl.OwlPackage#getType_DisjointUnionOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Type getDisjointUnionOf();

	/**
	 * Sets the value of the '{@link org.w3.owl.Type#getDisjointUnionOf <em>Disjoint Union Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint Union Of</em>' reference.
	 * @see #getDisjointUnionOf()
	 * @generated
	 */
	void setDisjointUnionOf(Type value);

} // Type
