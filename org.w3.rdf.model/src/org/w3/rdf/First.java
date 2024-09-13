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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The first item in the subject RDF list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.First#getParent <em>Parent</em>}</li>
 *   <li>{@link org.w3.rdf.First#getFirst <em>First</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getFirst()
 * @model
 * @generated
 */
@ProviderType
public interface First extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(RDFList)
	 * @see org.w3.rdf.RdfPackage#getFirst_Parent()
	 * @see org.w3.rdf.RDFList#getFirst
	 * @model opposite="first" required="true" ordered="false"
	 * @generated
	 */
	RDFList getParent();

	/**
	 * Sets the value of the '{@link org.w3.rdf.First#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RDFList value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(RDFResource)
	 * @see org.w3.rdf.RdfPackage#getFirst_First()
	 * @model ordered="false"
	 * @generated
	 */
	RDFResource getFirst();

	/**
	 * Sets the value of the '{@link org.w3.rdf.First#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(RDFResource value);

} // First
