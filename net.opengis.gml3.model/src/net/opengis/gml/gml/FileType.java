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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.FileType#getRangeParameters <em>Range Parameters</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FileType#getFileName <em>File Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FileType#getFileReference <em>File Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FileType#getFileStructure <em>File Structure</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FileType#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FileType#getCompression <em>Compression</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getFileType()
 * @model extendedMetaData="name='FileType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FileType extends EObject {
	/**
	 * Returns the value of the '<em><b>Range Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Parameters</em>' containment reference.
	 * @see #setRangeParameters(AssociationRoleType)
	 * @see net.opengis.gml.gml.GMLPackage#getFileType_RangeParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rangeParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationRoleType getRangeParameters();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FileType#getRangeParameters <em>Range Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Parameters</em>' containment reference.
	 * @see #getRangeParameters()
	 * @generated
	 */
	void setRangeParameters(AssociationRoleType value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see net.opengis.gml.gml.GMLPackage#getFileType_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='fileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FileType#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>File Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Reference</em>' attribute.
	 * @see #setFileReference(String)
	 * @see net.opengis.gml.gml.GMLPackage#getFileType_FileReference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='fileReference' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FileType#getFileReference <em>File Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Reference</em>' attribute.
	 * @see #getFileReference()
	 * @generated
	 */
	void setFileReference(String value);

	/**
	 * Returns the value of the '<em><b>File Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Structure</em>' containment reference.
	 * @see #setFileStructure(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getFileType_FileStructure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fileStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getFileStructure();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FileType#getFileStructure <em>File Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Structure</em>' containment reference.
	 * @see #getFileStructure()
	 * @generated
	 */
	void setFileStructure(CodeType value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see net.opengis.gml.gml.GMLPackage#getFileType_MimeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='mimeType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FileType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see #setCompression(String)
	 * @see net.opengis.gml.gml.GMLPackage#getFileType_Compression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='compression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompression();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FileType#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(String value);

} // FileType
