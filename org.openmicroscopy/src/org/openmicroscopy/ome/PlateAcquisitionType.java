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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plate Acquisition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getWellSampleRef <em>Well Sample Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getMaximumFieldCount <em>Maximum Field Count</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PlateAcquisitionType#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType()
 * @model extendedMetaData="name='PlateAcquisition_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PlateAcquisitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the PlateAcquisition.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType6"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Well Sample Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.WellSampleRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The WellSampleRef element is a reference to a WellSample element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Sample Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_WellSampleRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WellSampleRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WellSampleRefType> getWellSampleRef();

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
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Time when the last image of this acquisition was collected
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(XMLGregorianCalendar)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='EndTime'"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_ID()
	 * @model dataType="org.openmicroscopy.ome.PlateAcquisitionID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Field Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The maximum number of fields (well samples) in any well
	 *             in this PlateAcquisition.
	 *             This is only used to speed up user interaction by stopping
	 *             the reading of every well sample.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Field Count</em>' attribute.
	 * @see #isSetMaximumFieldCount()
	 * @see #unsetMaximumFieldCount()
	 * @see #setMaximumFieldCount(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_MaximumFieldCount()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='MaximumFieldCount'"
	 * @generated
	 */
	int getMaximumFieldCount();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getMaximumFieldCount <em>Maximum Field Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Field Count</em>' attribute.
	 * @see #isSetMaximumFieldCount()
	 * @see #unsetMaximumFieldCount()
	 * @see #getMaximumFieldCount()
	 * @generated
	 */
	void setMaximumFieldCount(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getMaximumFieldCount <em>Maximum Field Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumFieldCount()
	 * @see #getMaximumFieldCount()
	 * @see #setMaximumFieldCount(int)
	 * @generated
	 */
	void unsetMaximumFieldCount();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getMaximumFieldCount <em>Maximum Field Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Field Count</em>' attribute is set.
	 * @see #unsetMaximumFieldCount()
	 * @see #getMaximumFieldCount()
	 * @see #setMaximumFieldCount(int)
	 * @generated
	 */
	boolean isSetMaximumFieldCount();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Time when the first image of this acquisition was collected
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see org.openmicroscopy.ome.OMEPackage#getPlateAcquisitionType_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='StartTime'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PlateAcquisitionType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(XMLGregorianCalendar value);

} // PlateAcquisitionType
