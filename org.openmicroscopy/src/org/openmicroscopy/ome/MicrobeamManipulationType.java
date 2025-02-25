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
 * A representation of the model object '<em><b>Microbeam Manipulation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.MicrobeamManipulationType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.MicrobeamManipulationType#getROIRef <em>ROI Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.MicrobeamManipulationType#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.MicrobeamManipulationType#getLightSourceSettings <em>Light Source Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.MicrobeamManipulationType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.MicrobeamManipulationType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getMicrobeamManipulationType()
 * @model extendedMetaData="name='MicrobeamManipulation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MicrobeamManipulationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the Microbeam Manipulation. [plain-text multi-line string]
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getMicrobeamManipulationType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType3"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>ROI Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ROIRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROI Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getMicrobeamManipulationType_ROIRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ROIRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROIRefType> getROIRef();

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
	 * @see org.openmicroscopy.ome.OMEPackage#getMicrobeamManipulationType_ExperimenterRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExperimenterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterRefType getExperimenterRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getExperimenterRef <em>Experimenter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #getExperimenterRef()
	 * @generated
	 */
	void setExperimenterRef(ExperimenterRefType value);

	/**
	 * Returns the value of the '<em><b>Light Source Settings</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.LightSourceSettingsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Source Settings</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getMicrobeamManipulationType_LightSourceSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LightSourceSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LightSourceSettingsType> getLightSourceSettings();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getMicrobeamManipulationType_ID()
	 * @model dataType="org.openmicroscopy.ome.MicrobeamManipulationID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getID <em>ID</em>}' attribute.
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
	 *             The type of manipulation performed.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(List)
	 * @see org.openmicroscopy.ome.OMEPackage#getMicrobeamManipulationType_Type()
	 * @model dataType="org.openmicroscopy.ome.TypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	List<TypeTypeItem1> getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.MicrobeamManipulationType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(List<TypeTypeItem1> value);

} // MicrobeamManipulationType
