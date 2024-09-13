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

import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Different</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of collections of pairwise different individuals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.AllDifferent#getDistinctMembers <em>Distinct Members</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getAllDifferent()
 * @model
 * @generated
 */
@ProviderType
public interface AllDifferent extends RDFResource {
	/**
	 * Returns the value of the '<em><b>Distinct Members</b></em>' reference list.
	 * The list contents are of type {@link org.w3.owl.Thing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct Members</em>' reference list.
	 * @see org.w3.owl.OwlPackage#getAllDifferent_DistinctMembers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Thing> getDistinctMembers();

} // AllDifferent
