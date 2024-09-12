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
package net.opengis.fes.impl;

import net.opengis.fes.FESPackage;
import net.opengis.fes.GeometryOperandsType;
import net.opengis.fes.SpatialCapabilitiesType;
import net.opengis.fes.SpatialOperatorsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.SpatialCapabilitiesTypeImpl#getGeometryOperands <em>Geometry Operands</em>}</li>
 *   <li>{@link net.opengis.fes.impl.SpatialCapabilitiesTypeImpl#getSpatialOperators <em>Spatial Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpatialCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements SpatialCapabilitiesType {
	/**
	 * The cached value of the '{@link #getGeometryOperands() <em>Geometry Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryOperands()
	 * @generated
	 * @ordered
	 */
	protected GeometryOperandsType geometryOperands;

	/**
	 * The cached value of the '{@link #getSpatialOperators() <em>Spatial Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialOperators()
	 * @generated
	 * @ordered
	 */
	protected SpatialOperatorsType spatialOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.SPATIAL_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryOperandsType getGeometryOperands() {
		return geometryOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryOperands(GeometryOperandsType newGeometryOperands, NotificationChain msgs) {
		GeometryOperandsType oldGeometryOperands = geometryOperands;
		geometryOperands = newGeometryOperands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS, oldGeometryOperands, newGeometryOperands);
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
	public void setGeometryOperands(GeometryOperandsType newGeometryOperands) {
		if (newGeometryOperands != geometryOperands) {
			NotificationChain msgs = null;
			if (geometryOperands != null)
				msgs = ((InternalEObject)geometryOperands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS, null, msgs);
			if (newGeometryOperands != null)
				msgs = ((InternalEObject)newGeometryOperands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS, null, msgs);
			msgs = basicSetGeometryOperands(newGeometryOperands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS, newGeometryOperands, newGeometryOperands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialOperatorsType getSpatialOperators() {
		return spatialOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialOperators(SpatialOperatorsType newSpatialOperators, NotificationChain msgs) {
		SpatialOperatorsType oldSpatialOperators = spatialOperators;
		spatialOperators = newSpatialOperators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS, oldSpatialOperators, newSpatialOperators);
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
	public void setSpatialOperators(SpatialOperatorsType newSpatialOperators) {
		if (newSpatialOperators != spatialOperators) {
			NotificationChain msgs = null;
			if (spatialOperators != null)
				msgs = ((InternalEObject)spatialOperators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS, null, msgs);
			if (newSpatialOperators != null)
				msgs = ((InternalEObject)newSpatialOperators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS, null, msgs);
			msgs = basicSetSpatialOperators(newSpatialOperators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS, newSpatialOperators, newSpatialOperators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS:
				return basicSetGeometryOperands(null, msgs);
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS:
				return basicSetSpatialOperators(null, msgs);
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
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS:
				return getGeometryOperands();
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS:
				return getSpatialOperators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS:
				setGeometryOperands((GeometryOperandsType)newValue);
				return;
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS:
				setSpatialOperators((SpatialOperatorsType)newValue);
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
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS:
				setGeometryOperands((GeometryOperandsType)null);
				return;
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS:
				setSpatialOperators((SpatialOperatorsType)null);
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
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS:
				return geometryOperands != null;
			case FESPackage.SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS:
				return spatialOperators != null;
		}
		return super.eIsSet(featureID);
	}

} //SpatialCapabilitiesTypeImpl
