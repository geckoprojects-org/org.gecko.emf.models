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
 * A representation of the model object '<em><b>External Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ExternalType#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExternalType#getHref <em>Href</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExternalType#getSHA1 <em>SHA1</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getExternalType()
 * @model extendedMetaData="name='External_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface ExternalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.CompressionType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the compression scheme used to encode the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see org.openmicroscopy.ome.CompressionType1
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #setCompression(CompressionType1)
	 * @see org.openmicroscopy.ome.OMEPackage#getExternalType_Compression()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Compression'"
	 * @generated
	 */
	CompressionType1 getCompression();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExternalType#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see org.openmicroscopy.ome.CompressionType1
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(CompressionType1 value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ExternalType#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompression()
	 * @see #getCompression()
	 * @see #setCompression(CompressionType1)
	 * @generated
	 */
	void unsetCompression();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ExternalType#getCompression <em>Compression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression</em>' attribute is set.
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @see #setCompression(CompressionType1)
	 * @generated
	 */
	boolean isSetCompression();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * file location
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExternalType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExternalType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>SHA1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The digest of the file specified in href.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHA1</em>' attribute.
	 * @see #setSHA1(byte[])
	 * @see org.openmicroscopy.ome.OMEPackage#getExternalType_SHA1()
	 * @model dataType="org.openmicroscopy.ome.Hex40" required="true"
	 *        extendedMetaData="kind='attribute' name='SHA1'"
	 * @generated
	 */
	byte[] getSHA1();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExternalType#getSHA1 <em>SHA1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHA1</em>' attribute.
	 * @see #getSHA1()
	 * @generated
	 */
	void setSHA1(byte[] value);

} // ExternalType
