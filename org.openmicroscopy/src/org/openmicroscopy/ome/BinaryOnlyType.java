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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Only Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.BinaryOnlyType#getMetadataFile <em>Metadata File</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinaryOnlyType#getUUID <em>UUID</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getBinaryOnlyType()
 * @model extendedMetaData="name='BinaryOnly_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface BinaryOnlyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Filename of the OME-XML metadata file for
	 *                   this binary data. If the file cannot be found, a search can
	 *                   be performed based on the UUID. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata File</em>' attribute.
	 * @see #setMetadataFile(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinaryOnlyType_MetadataFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='MetadataFile'"
	 * @generated
	 */
	String getMetadataFile();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinaryOnlyType#getMetadataFile <em>Metadata File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata File</em>' attribute.
	 * @see #getMetadataFile()
	 * @generated
	 */
	void setMetadataFile(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The unique identifier of another OME-XML
	 *                   block whose metadata describes the binary data in this file.
	 *                   This UUID is considered authoritative regardless of
	 *                   mismatches in the filename. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinaryOnlyType_UUID()
	 * @model dataType="org.openmicroscopy.ome.UniversallyUniqueIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='UUID'"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinaryOnlyType#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

} // BinaryOnlyType
