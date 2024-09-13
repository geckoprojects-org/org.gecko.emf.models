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
 * A representation of the model object '<em><b>Is Defined By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of the subject resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.IsDefinedBy#getIsDefinedBy <em>Is Defined By</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getIsDefinedBy()
 * @model
 * @generated
 */
@ProviderType
public interface IsDefinedBy extends SeeAlso {
	/**
	 * Returns the value of the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Defined By</em>' reference.
	 * @see #setIsDefinedBy(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getIsDefinedBy_IsDefinedBy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFResource getIsDefinedBy();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.IsDefinedBy#getIsDefinedBy <em>Is Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defined By</em>' reference.
	 * @see #getIsDefinedBy()
	 * @generated
	 */
	void setIsDefinedBy(RDFResource value);

} // IsDefinedBy
