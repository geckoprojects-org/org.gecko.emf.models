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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.FilterType#getTransmittanceRange <em>Transmittance Range</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FilterType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FilterType#getFilterWheel <em>Filter Wheel</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FilterType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FilterType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getFilterType()
 * @model extendedMetaData="name='Filter_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilterType extends ManufacturerSpec {
	/**
	 * Returns the value of the '<em><b>Transmittance Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This records the range of wavelengths that are transmitted by the filter. It also records the maximum amount of light transmitted.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmittance Range</em>' containment reference.
	 * @see #setTransmittanceRange(TransmittanceRangeType)
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterType_TransmittanceRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransmittanceRange' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmittanceRangeType getTransmittanceRange();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FilterType#getTransmittanceRange <em>Transmittance Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmittance Range</em>' containment reference.
	 * @see #getTransmittanceRange()
	 * @generated
	 */
	void setTransmittanceRange(TransmittanceRangeType value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Filter Wheel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A filter 'wheel' in OME can refer to any arrangement of filters in a filter holder of any shape. It could, for example, be a filter slider. [plain text string]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Wheel</em>' attribute.
	 * @see #setFilterWheel(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterType_FilterWheel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FilterWheel'"
	 * @generated
	 */
	String getFilterWheel();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FilterType#getFilterWheel <em>Filter Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Wheel</em>' attribute.
	 * @see #getFilterWheel()
	 * @generated
	 */
	void setFilterWheel(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterType_ID()
	 * @model dataType="org.openmicroscopy.ome.FilterID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FilterType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.TypeType6}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType6
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType6)
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	TypeType6 getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FilterType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType6
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType6 value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.FilterType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType6)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.FilterType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType6)
	 * @generated
	 */
	boolean isSetType();

} // FilterType
