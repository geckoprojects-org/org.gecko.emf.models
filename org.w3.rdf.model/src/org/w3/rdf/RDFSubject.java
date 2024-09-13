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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subject of the subject RDF statement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.RDFSubject#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRDFSubject()
 * @model
 * @generated
 */
@ProviderType
public interface RDFSubject extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFStatement#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(RDFStatement)
	 * @see org.w3.rdf.RdfPackage#getRDFSubject_Statement()
	 * @see org.w3.rdf.RDFStatement#getSubject
	 * @model opposite="subject" required="true" ordered="false"
	 * @generated
	 */
	RDFStatement getStatement();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFSubject#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(RDFStatement value);

} // RDFSubject
