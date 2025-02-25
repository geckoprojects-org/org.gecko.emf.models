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
 * A representation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ProjectType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ProjectType#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ProjectType#getExperimenterGroupRef <em>Experimenter Group Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ProjectType#getDatasetRef <em>Dataset Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ProjectType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ProjectType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ProjectType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getProjectType()
 * @model extendedMetaData="name='Project_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the project. [plain-text multi-line string]
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getProjectType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType5"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ProjectType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This empty element has a required Experimenter ID and an optional DocumentID attribute which refers to one of the Experimenters defined within OME.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #setExperimenterRef(ExperimenterRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getProjectType_ExperimenterRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExperimenterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterRefType getExperimenterRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ProjectType#getExperimenterRef <em>Experimenter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #getExperimenterRef()
	 * @generated
	 */
	void setExperimenterRef(ExperimenterRefType value);

	/**
	 * Returns the value of the '<em><b>Experimenter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This empty element has a reference (the ExperimenterGroup ID attribute) to a ExperimenterGroup defined within OME.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Group Ref</em>' containment reference.
	 * @see #setExperimenterGroupRef(ExperimenterGroupRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getProjectType_ExperimenterGroupRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExperimenterGroupRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterGroupRefType getExperimenterGroupRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ProjectType#getExperimenterGroupRef <em>Experimenter Group Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Group Ref</em>' containment reference.
	 * @see #getExperimenterGroupRef()
	 * @generated
	 */
	void setExperimenterGroupRef(ExperimenterGroupRefType value);

	/**
	 * Returns the value of the '<em><b>Dataset Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.DatasetRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The DatasetRef element refers to a Dataset by specifying the Dataset ID attribute.
	 *         One or more DatasetRef elements may be listed within the Image element to specify what Datasets
	 *         the Image belongs to.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getProjectType_DatasetRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DatasetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatasetRefType> getDatasetRef();

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
	 * @see org.openmicroscopy.ome.OMEPackage#getProjectType_AnnotationRef()
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
	 * @see org.openmicroscopy.ome.OMEPackage#getProjectType_ID()
	 * @model dataType="org.openmicroscopy.ome.ProjectID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ProjectType#getID <em>ID</em>}' attribute.
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
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getProjectType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ProjectType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ProjectType
