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
package org.w3.rdf;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of RDF Lists.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.RDFList#getRest <em>Rest</em>}</li>
 *   <li>{@link org.w3.rdf.RDFList#getFirst <em>First</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRDFList()
 * @model
 * @generated
 */
@ProviderType
public interface RDFList extends RDFResource {
	/**
	 * Returns the value of the '<em><b>Rest</b></em>' reference list.
	 * The list contents are of type {@link org.w3.rdf.Rest}.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.Rest#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' reference list.
	 * @see org.w3.rdf.RdfPackage#getRDFList_Rest()
	 * @see org.w3.rdf.Rest#getParent
	 * @model opposite="parent" ordered="false"
	 * @generated
	 */
	EList<Rest> getRest();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.First#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(First)
	 * @see org.w3.rdf.RdfPackage#getRDFList_First()
	 * @see org.w3.rdf.First#getParent
	 * @model opposite="parent" ordered="false"
	 * @generated
	 */
	First getFirst();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFList#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(First value);

} // RDFList
