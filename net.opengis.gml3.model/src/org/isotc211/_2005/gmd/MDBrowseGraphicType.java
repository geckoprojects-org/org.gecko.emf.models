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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Browse Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Graphic that provides an illustration of the dataset (should include a legend for the graphic)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDBrowseGraphicType#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBrowseGraphicType#getFileDescription <em>File Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBrowseGraphicType#getFileType <em>File Type</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDBrowseGraphicType()
 * @model extendedMetaData="name='MD_BrowseGraphic_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDBrowseGraphicType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' containment reference.
	 * @see #setFileName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBrowseGraphicType_FileName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fileName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getFileName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBrowseGraphicType#getFileName <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' containment reference.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>File Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Description</em>' containment reference.
	 * @see #setFileDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBrowseGraphicType_FileDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getFileDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBrowseGraphicType#getFileDescription <em>File Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Description</em>' containment reference.
	 * @see #getFileDescription()
	 * @generated
	 */
	void setFileDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' containment reference.
	 * @see #setFileType(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBrowseGraphicType_FileType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileType' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getFileType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBrowseGraphicType#getFileType <em>File Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' containment reference.
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(CharacterStringPropertyType value);

} // MDBrowseGraphicType
