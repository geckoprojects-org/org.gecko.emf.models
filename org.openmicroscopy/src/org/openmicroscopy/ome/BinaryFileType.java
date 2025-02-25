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
 * A representation of the model object '<em><b>Binary File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.BinaryFileType#getExternal <em>External</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinaryFileType#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinaryFileType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinaryFileType#getMIMEType <em>MIME Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.BinaryFileType#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getBinaryFileType()
 * @model extendedMetaData="name='BinaryFile_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BinaryFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a file location.  Can optionally specify a portion of a file using Offset and a ReadLength.
	 *       If Offset and ReadLength are specified in conjuction with Compression, then they point into the uncompressed file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External</em>' containment reference.
	 * @see #setExternal(ExternalType)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinaryFileType_External()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='External' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalType getExternal();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinaryFileType#getExternal <em>External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' containment reference.
	 * @see #getExternal()
	 * @generated
	 */
	void setExternal(ExternalType value);

	/**
	 * Returns the value of the '<em><b>Bin Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contents of this element are base64-encoded.  These are not CDATA sections, just a base64 stream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bin Data</em>' containment reference.
	 * @see #setBinData(BinDataType)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinaryFileType_BinData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinData' namespace='##targetNamespace'"
	 * @generated
	 */
	BinDataType getBinData();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinaryFileType#getBinData <em>Bin Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Data</em>' containment reference.
	 * @see #getBinData()
	 * @generated
	 */
	void setBinData(BinDataType value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinaryFileType_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='FileName'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinaryFileType#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>MIME Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIME Type</em>' attribute.
	 * @see #setMIMEType(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinaryFileType_MIMEType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MIMEType'"
	 * @generated
	 */
	String getMIMEType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinaryFileType#getMIMEType <em>MIME Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIME Type</em>' attribute.
	 * @see #getMIMEType()
	 * @generated
	 */
	void setMIMEType(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Size of the uncompressed file. [unit:bytes]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(long)
	 * @see org.openmicroscopy.ome.OMEPackage#getBinaryFileType_Size()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeLong" required="true"
	 *        extendedMetaData="kind='attribute' name='Size'"
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.BinaryFileType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.BinaryFileType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(long)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.BinaryFileType#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(long)
	 * @generated
	 */
	boolean isSetSize();

} // BinaryFileType
