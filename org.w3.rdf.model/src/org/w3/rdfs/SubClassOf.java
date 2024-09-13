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
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subject is a subclass of a class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.SubClassOf#getRdfClass <em>Rdf Class</em>}</li>
 *   <li>{@link org.w3.rdfs.SubClassOf#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getSubClassOf()
 * @model
 * @generated
 */
@ProviderType
public interface SubClassOf extends EObject {
	/**
	 * Returns the value of the '<em><b>Rdf Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFClass#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Class</em>' reference.
	 * @see #setRdfClass(RDFClass)
	 * @see org.w3.rdfs.RdfsPackage#getSubClassOf_RdfClass()
	 * @see org.w3.rdfs.RDFClass#getSubClassOf
	 * @model opposite="subClassOf" required="true" ordered="false"
	 * @generated
	 */
	RDFClass getRdfClass();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SubClassOf#getRdfClass <em>Rdf Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Class</em>' reference.
	 * @see #getRdfClass()
	 * @generated
	 */
	void setRdfClass(RDFClass value);

	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference.
	 * @see #setSubClassOf(RDFClass)
	 * @see org.w3.rdfs.RdfsPackage#getSubClassOf_SubClassOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFClass getSubClassOf();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SubClassOf#getSubClassOf <em>Sub Class Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class Of</em>' reference.
	 * @see #getSubClassOf()
	 * @generated
	 */
	void setSubClassOf(RDFClass value);

} // SubClassOf
