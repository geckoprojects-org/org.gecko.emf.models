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
 * A representation of the model object '<em><b>RDF Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A human-readable name for the subject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.RDFLabel#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFLabel#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getRDFLabel()
 * @model
 * @generated
 */
@ProviderType
public interface RDFLabel extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFResource#getRdfLabel <em>Rdf Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getRDFLabel_Resource()
	 * @see org.w3.rdfs.RDFResource#getRdfLabel
	 * @model opposite="rdfLabel" required="true" transient="false" ordered="false"
	 * @generated
	 */
	RDFResource getResource();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFLabel#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(RDFResource value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(RDFLiteral)
	 * @see org.w3.rdfs.RdfsPackage#getRDFLabel_Label()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RDFLiteral getLabel();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFLabel#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(RDFLiteral value);

} // RDFLabel
