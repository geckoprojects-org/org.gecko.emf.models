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

import org.w3.rdf.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A domain of the subject property. If a property has a name "type", then the domain defines the namespace, the type property belongs to. E.g. "Child" (domain) hasParent "Mother", "Father" (range). "Mother" (domain) hasChild "Child" (range).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.Domain#getProperty <em>Property</em>}</li>
 *   <li>{@link org.w3.rdfs.Domain#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getDomain()
 * @model
 * @generated
 */
@ProviderType
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(RDFProperty)
	 * @see org.w3.rdfs.RdfsPackage#getDomain_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFProperty getProperty();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.Domain#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(RDFProperty value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(RDFClass)
	 * @see org.w3.rdfs.RdfsPackage#getDomain_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFClass getDomain();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.Domain#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(RDFClass value);

} // Domain
