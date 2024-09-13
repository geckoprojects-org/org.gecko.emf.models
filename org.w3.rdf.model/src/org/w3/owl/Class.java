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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

import org.w3.rdf.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of OWL classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.Class#getHasKey <em>Has Key</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getClass_()
 * @model
 * @generated
 */
@ProviderType
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Has Key</b></em>' reference list.
	 * The list contents are of type {@link org.w3.rdf.RDFProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key</em>' reference list.
	 * @see org.w3.owl.OwlPackage#getClass_HasKey()
	 * @model
	 * @generated
	 */
	EList<RDFProperty> getHasKey();

} // Class
