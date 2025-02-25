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

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ExperimentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimentType#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimentType#getMicrobeamManipulation <em>Microbeam Manipulation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimentType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ExperimentType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getExperimentType()
 * @model extendedMetaData="name='Experiment_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExperimentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the experiment. [plain-text multi-line string]
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimentType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimentType#getDescription <em>Description</em>}' attribute.
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
	 *               This is a link to the Experimenter who conducted the experiment
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #setExperimenterRef(ExperimenterRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimentType_ExperimenterRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExperimenterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterRefType getExperimenterRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimentType#getExperimenterRef <em>Experimenter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #getExperimenterRef()
	 * @generated
	 */
	void setExperimenterRef(ExperimenterRefType value);

	/**
	 * Returns the value of the '<em><b>Microbeam Manipulation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.MicrobeamManipulationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Defines a microbeam operation type and the region of the image it was applied to.
	 *         The LightSourceRef element is a reference to a LightSource specified in the Instrument element which was used for a technique other than illumination for
	 *         the purpose of imaging. For example, a laser used for photobleaching.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Microbeam Manipulation</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimentType_MicrobeamManipulation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MicrobeamManipulation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MicrobeamManipulationType> getMicrobeamManipulation();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimentType_ID()
	 * @model dataType="org.openmicroscopy.ome.ExperimentID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimentType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A term to describe the type of experiment.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(List)
	 * @see org.openmicroscopy.ome.OMEPackage#getExperimentType_Type()
	 * @model dataType="org.openmicroscopy.ome.TypeType1" many="false"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	List<TypeTypeItem> getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ExperimentType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(List<TypeTypeItem> value);

} // ExperimentType
