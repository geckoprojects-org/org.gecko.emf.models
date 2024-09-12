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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDCellGeometryCodePropertyType;
import org.isotc211._2005.gmd.MDDimensionPropertyType;
import org.isotc211._2005.gmd.MDGridSpatialRepresentationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Grid Spatial Representation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGridSpatialRepresentationTypeImpl#getNumberOfDimensions <em>Number Of Dimensions</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGridSpatialRepresentationTypeImpl#getAxisDimensionProperties <em>Axis Dimension Properties</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGridSpatialRepresentationTypeImpl#getCellGeometry <em>Cell Geometry</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGridSpatialRepresentationTypeImpl#getTransformationParameterAvailability <em>Transformation Parameter Availability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDGridSpatialRepresentationTypeImpl extends AbstractMDSpatialRepresentationTypeImpl implements MDGridSpatialRepresentationType {
	/**
	 * The cached value of the '{@link #getNumberOfDimensions() <em>Number Of Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDimensions()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType numberOfDimensions;

	/**
	 * The cached value of the '{@link #getAxisDimensionProperties() <em>Axis Dimension Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisDimensionProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MDDimensionPropertyType> axisDimensionProperties;

	/**
	 * The cached value of the '{@link #getCellGeometry() <em>Cell Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellGeometry()
	 * @generated
	 * @ordered
	 */
	protected MDCellGeometryCodePropertyType cellGeometry;

	/**
	 * The cached value of the '{@link #getTransformationParameterAvailability() <em>Transformation Parameter Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationParameterAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType transformationParameterAvailability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDGridSpatialRepresentationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDGridSpatialRepresentationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getNumberOfDimensions() {
		return numberOfDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfDimensions(IntegerPropertyType newNumberOfDimensions, NotificationChain msgs) {
		IntegerPropertyType oldNumberOfDimensions = numberOfDimensions;
		numberOfDimensions = newNumberOfDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS, oldNumberOfDimensions, newNumberOfDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfDimensions(IntegerPropertyType newNumberOfDimensions) {
		if (newNumberOfDimensions != numberOfDimensions) {
			NotificationChain msgs = null;
			if (numberOfDimensions != null)
				msgs = ((InternalEObject)numberOfDimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS, null, msgs);
			if (newNumberOfDimensions != null)
				msgs = ((InternalEObject)newNumberOfDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS, null, msgs);
			msgs = basicSetNumberOfDimensions(newNumberOfDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS, newNumberOfDimensions, newNumberOfDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDDimensionPropertyType> getAxisDimensionProperties() {
		if (axisDimensionProperties == null) {
			axisDimensionProperties = new EObjectContainmentEList<MDDimensionPropertyType>(MDDimensionPropertyType.class, this, GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__AXIS_DIMENSION_PROPERTIES);
		}
		return axisDimensionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCellGeometryCodePropertyType getCellGeometry() {
		return cellGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellGeometry(MDCellGeometryCodePropertyType newCellGeometry, NotificationChain msgs) {
		MDCellGeometryCodePropertyType oldCellGeometry = cellGeometry;
		cellGeometry = newCellGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY, oldCellGeometry, newCellGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellGeometry(MDCellGeometryCodePropertyType newCellGeometry) {
		if (newCellGeometry != cellGeometry) {
			NotificationChain msgs = null;
			if (cellGeometry != null)
				msgs = ((InternalEObject)cellGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY, null, msgs);
			if (newCellGeometry != null)
				msgs = ((InternalEObject)newCellGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY, null, msgs);
			msgs = basicSetCellGeometry(newCellGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY, newCellGeometry, newCellGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getTransformationParameterAvailability() {
		return transformationParameterAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationParameterAvailability(BooleanPropertyType newTransformationParameterAvailability, NotificationChain msgs) {
		BooleanPropertyType oldTransformationParameterAvailability = transformationParameterAvailability;
		transformationParameterAvailability = newTransformationParameterAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY, oldTransformationParameterAvailability, newTransformationParameterAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformationParameterAvailability(BooleanPropertyType newTransformationParameterAvailability) {
		if (newTransformationParameterAvailability != transformationParameterAvailability) {
			NotificationChain msgs = null;
			if (transformationParameterAvailability != null)
				msgs = ((InternalEObject)transformationParameterAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY, null, msgs);
			if (newTransformationParameterAvailability != null)
				msgs = ((InternalEObject)newTransformationParameterAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY, null, msgs);
			msgs = basicSetTransformationParameterAvailability(newTransformationParameterAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY, newTransformationParameterAvailability, newTransformationParameterAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS:
				return basicSetNumberOfDimensions(null, msgs);
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__AXIS_DIMENSION_PROPERTIES:
				return ((InternalEList<?>)getAxisDimensionProperties()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY:
				return basicSetCellGeometry(null, msgs);
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY:
				return basicSetTransformationParameterAvailability(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS:
				return getNumberOfDimensions();
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__AXIS_DIMENSION_PROPERTIES:
				return getAxisDimensionProperties();
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY:
				return getCellGeometry();
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY:
				return getTransformationParameterAvailability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS:
				setNumberOfDimensions((IntegerPropertyType)newValue);
				return;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__AXIS_DIMENSION_PROPERTIES:
				getAxisDimensionProperties().clear();
				getAxisDimensionProperties().addAll((Collection<? extends MDDimensionPropertyType>)newValue);
				return;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY:
				setCellGeometry((MDCellGeometryCodePropertyType)newValue);
				return;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY:
				setTransformationParameterAvailability((BooleanPropertyType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS:
				setNumberOfDimensions((IntegerPropertyType)null);
				return;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__AXIS_DIMENSION_PROPERTIES:
				getAxisDimensionProperties().clear();
				return;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY:
				setCellGeometry((MDCellGeometryCodePropertyType)null);
				return;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY:
				setTransformationParameterAvailability((BooleanPropertyType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__NUMBER_OF_DIMENSIONS:
				return numberOfDimensions != null;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__AXIS_DIMENSION_PROPERTIES:
				return axisDimensionProperties != null && !axisDimensionProperties.isEmpty();
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__CELL_GEOMETRY:
				return cellGeometry != null;
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE__TRANSFORMATION_PARAMETER_AVAILABILITY:
				return transformationParameterAvailability != null;
		}
		return super.eIsSet(featureID);
	}

} //MDGridSpatialRepresentationTypeImpl
