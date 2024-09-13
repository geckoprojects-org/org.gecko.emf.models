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

import org.osgi.annotation.versioning.ProviderType;

import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of RDF statements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.RDFStatement#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.w3.rdf.RDFStatement#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3.rdf.RDFStatement#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRDFStatement()
 * @model
 * @generated
 */
@ProviderType
public interface RDFStatement extends RDFResource {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFPredicate#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(RDFPredicate)
	 * @see org.w3.rdf.RdfPackage#getRDFStatement_Predicate()
	 * @see org.w3.rdf.RDFPredicate#getStatement
	 * @model opposite="statement" required="true" ordered="false"
	 * @generated
	 */
	RDFPredicate getPredicate();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFStatement#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(RDFPredicate value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFObject#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(RDFObject)
	 * @see org.w3.rdf.RdfPackage#getRDFStatement_Object()
	 * @see org.w3.rdf.RDFObject#getStatement
	 * @model opposite="statement" required="true" ordered="false"
	 * @generated
	 */
	RDFObject getObject();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFStatement#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(RDFObject value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFSubject#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(RDFSubject)
	 * @see org.w3.rdf.RdfPackage#getRDFStatement_Subject()
	 * @see org.w3.rdf.RDFSubject#getStatement
	 * @model opposite="statement" required="true" ordered="false"
	 * @generated
	 */
	RDFSubject getSubject();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFStatement#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(RDFSubject value);

} // RDFStatement
