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
 * A representation of the model object '<em><b>Bin Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.BinDataType#getValue <em>Value</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinDataType#isBigEndian <em>Big Endian</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinDataType#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinDataType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getBinDataType()
 * @model extendedMetaData="name='BinData_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface BinDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see org.openmicroscopy.ome.OMEPackage#getBinDataType_Value()
	 * @model dataType="org.openmicroscopy.ome.Base64Binary"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinDataType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>Big Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 This is true if the binary data was written in BigEndian order. This is dependent on the system architecture of the machine that wrote the pixels. True for essentially all modern CPUs other than Intel and Alpha. All Binary data must be written in the same endian order.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big Endian</em>' attribute.
	 * @see #isSetBigEndian()
	 * @see #unsetBigEndian()
	 * @see #setBigEndian(boolean)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinDataType_BigEndian()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='BigEndian'"
	 * @generated
	 */
	boolean isBigEndian();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinDataType#isBigEndian <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Endian</em>' attribute.
	 * @see #isSetBigEndian()
	 * @see #unsetBigEndian()
	 * @see #isBigEndian()
	 * @generated
	 */
	void setBigEndian(boolean value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.BinDataType#isBigEndian <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBigEndian()
	 * @see #isBigEndian()
	 * @see #setBigEndian(boolean)
	 * @generated
	 */
	void unsetBigEndian();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.BinDataType#isBigEndian <em>Big Endian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Big Endian</em>' attribute is set.
	 * @see #unsetBigEndian()
	 * @see #isBigEndian()
	 * @see #setBigEndian(boolean)
	 * @generated
	 */
	boolean isSetBigEndian();

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.CompressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the compression scheme used to encode the data. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see org.openmicroscopy.ome.CompressionType
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #setCompression(CompressionType)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinDataType_Compression()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Compression'"
	 * @generated
	 */
	CompressionType getCompression();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinDataType#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see org.openmicroscopy.ome.CompressionType
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(CompressionType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.BinDataType#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompression()
	 * @see #getCompression()
	 * @see #setCompression(CompressionType)
	 * @generated
	 */
	void unsetCompression();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.BinDataType#getCompression <em>Compression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression</em>' attribute is set.
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @see #setCompression(CompressionType)
	 * @generated
	 */
	boolean isSetCompression();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Character count attribute for the BinData field. This is the length of the base-64 encoded block. It allows easy skipping of the block when parsing the file. [unit:bytes]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(long)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinDataType_Length()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.LengthType" required="true"
	 *        extendedMetaData="kind='attribute' name='Length'"
	 * @generated
	 */
	long getLength();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinDataType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(long value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.BinDataType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(long)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.BinDataType#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(long)
	 * @generated
	 */
	boolean isSetLength();

} // BinDataType
