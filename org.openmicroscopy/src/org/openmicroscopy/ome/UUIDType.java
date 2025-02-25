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
 * A representation of the model object '<em><b>UUID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.UUIDType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.UUIDType#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getUUIDType()
 * @model extendedMetaData="name='UUID_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface UUIDType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getUUIDType_Value()
	 * @model dataType="org.openmicroscopy.ome.UniversallyUniqueIdentifier"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.UUIDType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                       This can be used when the IFDs are located in another file.
	 *                       The / (forward slash) is used as the path separator.
	 *                       A relative path is recommended. However an absolute path can be specified.
	 *                       Default is to use the file the ome-xml data has been pulled from.
	 *                       Note: It is permissible for this to be self referential. The file image1.tiff
	 *                       may contain ome-xml data that has FilePath="image1.tiff" or "./image1.tiff"
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getUUIDType_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FileName'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.UUIDType#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // UUIDType
