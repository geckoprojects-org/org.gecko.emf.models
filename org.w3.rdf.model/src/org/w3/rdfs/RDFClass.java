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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.RDFClass#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getRDFClass()
 * @model
 * @generated
 */
@ProviderType
public interface RDFClass extends RDFResource {
	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.SubClassOf#getRdfClass <em>Rdf Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference.
	 * @see #setSubClassOf(SubClassOf)
	 * @see org.w3.rdfs.RdfsPackage#getRDFClass_SubClassOf()
	 * @see org.w3.rdfs.SubClassOf#getRdfClass
	 * @model opposite="rdfClass" required="true" ordered="false"
	 * @generated
	 */
	SubClassOf getSubClassOf();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFClass#getSubClassOf <em>Sub Class Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class Of</em>' reference.
	 * @see #getSubClassOf()
	 * @generated
	 */
	void setSubClassOf(SubClassOf value);

} // RDFClass
