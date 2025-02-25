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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.FolderType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FolderType#getFolderRef <em>Folder Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FolderType#getImageRef <em>Image Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FolderType#getROIRef <em>ROI Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FolderType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FolderType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FolderType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getFolderType()
 * @model extendedMetaData="name='Folder_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FolderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the folder. [plain-text multi-line string]
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getFolderType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType2"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FolderType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Folder Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FolderRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The FolderRef element refers to a Folder by specifying the Folder ID attribute.
	 *         One or more FolderRef elements may be listed within the Folder element to specify what Folders
	 *         the Folder contains. This tree hierarchy must be acyclic.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Folder Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getFolderType_FolderRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FolderRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FolderRefType> getFolderRef();

	/**
	 * Returns the value of the '<em><b>Image Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ImageRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ImageRef element is a reference to an Image element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getFolderType_ImageRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageRefType> getImageRef();

	/**
	 * Returns the value of the '<em><b>ROI Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ROIRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROI Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getFolderType_ROIRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROIRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROIRefType> getROIRef();

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.AnnotationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getFolderType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getFolderType_ID()
	 * @model dataType="org.openmicroscopy.ome.FolderID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FolderType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A name for the folder that is suitable for presentation to the user.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getFolderType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FolderType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FolderType
