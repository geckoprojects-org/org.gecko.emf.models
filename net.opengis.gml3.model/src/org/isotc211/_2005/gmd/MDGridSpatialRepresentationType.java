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

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Grid Spatial Representation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Types and numbers of raster spatial objects in the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType#getNumberOfDimensions <em>Number Of Dimensions</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType#getAxisDimensionProperties <em>Axis Dimension Properties</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType#getCellGeometry <em>Cell Geometry</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType#getTransformationParameterAvailability <em>Transformation Parameter Availability</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDGridSpatialRepresentationType()
 * @model extendedMetaData="name='MD_GridSpatialRepresentation_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDGridSpatialRepresentationType extends AbstractMDSpatialRepresentationType {
	/**
	 * Returns the value of the '<em><b>Number Of Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Dimensions</em>' containment reference.
	 * @see #setNumberOfDimensions(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGridSpatialRepresentationType_NumberOfDimensions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numberOfDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getNumberOfDimensions();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType#getNumberOfDimensions <em>Number Of Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Dimensions</em>' containment reference.
	 * @see #getNumberOfDimensions()
	 * @generated
	 */
	void setNumberOfDimensions(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Axis Dimension Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDDimensionPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Dimension Properties</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGridSpatialRepresentationType_AxisDimensionProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='axisDimensionProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDDimensionPropertyType> getAxisDimensionProperties();

	/**
	 * Returns the value of the '<em><b>Cell Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Geometry</em>' containment reference.
	 * @see #setCellGeometry(MDCellGeometryCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGridSpatialRepresentationType_CellGeometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cellGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	MDCellGeometryCodePropertyType getCellGeometry();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType#getCellGeometry <em>Cell Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Geometry</em>' containment reference.
	 * @see #getCellGeometry()
	 * @generated
	 */
	void setCellGeometry(MDCellGeometryCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Transformation Parameter Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Parameter Availability</em>' containment reference.
	 * @see #setTransformationParameterAvailability(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGridSpatialRepresentationType_TransformationParameterAvailability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformationParameterAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getTransformationParameterAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType#getTransformationParameterAvailability <em>Transformation Parameter Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Parameter Availability</em>' containment reference.
	 * @see #getTransformationParameterAvailability()
	 * @generated
	 */
	void setTransformationParameterAvailability(BooleanPropertyType value);

} // MDGridSpatialRepresentationType
