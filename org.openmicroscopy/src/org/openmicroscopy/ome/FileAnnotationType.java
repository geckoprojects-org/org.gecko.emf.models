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
package org.openmicroscopy.ome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.FileAnnotationType#getBinaryFile <em>Binary File</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getFileAnnotationType()
 * @model extendedMetaData="name='FileAnnotation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FileAnnotationType extends TypeAnnotation {
	/**
	 * Returns the value of the '<em><b>Binary File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a binary file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary File</em>' containment reference.
	 * @see #setBinaryFile(BinaryFileType)
	 * @see org.openmicroscopy.ome.OMEPackage#getFileAnnotationType_BinaryFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BinaryFile' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryFileType getBinaryFile();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FileAnnotationType#getBinaryFile <em>Binary File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary File</em>' containment reference.
	 * @see #getBinaryFile()
	 * @generated
	 */
	void setBinaryFile(BinaryFileType value);

} // FileAnnotationType
