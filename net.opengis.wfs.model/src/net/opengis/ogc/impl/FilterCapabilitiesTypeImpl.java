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
package net.opengis.ogc.impl;

import net.opengis.ogc.FilterCapabilitiesType;
import net.opengis.ogc.IdCapabilitiesType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.ScalarCapabilitiesType;
import net.opengis.ogc.SpatialCapabilitiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.FilterCapabilitiesTypeImpl#getSpatialCapabilities <em>Spatial Capabilities</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterCapabilitiesTypeImpl#getScalarCapabilities <em>Scalar Capabilities</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterCapabilitiesTypeImpl#getIdCapabilities <em>Id Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements FilterCapabilitiesType {
	/**
	 * The cached value of the '{@link #getSpatialCapabilities() <em>Spatial Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialCapabilities()
	 * @generated
	 * @ordered
	 */
	protected SpatialCapabilitiesType spatialCapabilities;

	/**
	 * The cached value of the '{@link #getScalarCapabilities() <em>Scalar Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarCapabilities()
	 * @generated
	 * @ordered
	 */
	protected ScalarCapabilitiesType scalarCapabilities;

	/**
	 * The cached value of the '{@link #getIdCapabilities() <em>Id Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCapabilities()
	 * @generated
	 * @ordered
	 */
	protected IdCapabilitiesType idCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.FILTER_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialCapabilitiesType getSpatialCapabilities() {
		return spatialCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialCapabilities(SpatialCapabilitiesType newSpatialCapabilities, NotificationChain msgs) {
		SpatialCapabilitiesType oldSpatialCapabilities = spatialCapabilities;
		spatialCapabilities = newSpatialCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, oldSpatialCapabilities, newSpatialCapabilities);
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
	public void setSpatialCapabilities(SpatialCapabilitiesType newSpatialCapabilities) {
		if (newSpatialCapabilities != spatialCapabilities) {
			NotificationChain msgs = null;
			if (spatialCapabilities != null)
				msgs = ((InternalEObject)spatialCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, null, msgs);
			if (newSpatialCapabilities != null)
				msgs = ((InternalEObject)newSpatialCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, null, msgs);
			msgs = basicSetSpatialCapabilities(newSpatialCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, newSpatialCapabilities, newSpatialCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalarCapabilitiesType getScalarCapabilities() {
		return scalarCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalarCapabilities(ScalarCapabilitiesType newScalarCapabilities, NotificationChain msgs) {
		ScalarCapabilitiesType oldScalarCapabilities = scalarCapabilities;
		scalarCapabilities = newScalarCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, oldScalarCapabilities, newScalarCapabilities);
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
	public void setScalarCapabilities(ScalarCapabilitiesType newScalarCapabilities) {
		if (newScalarCapabilities != scalarCapabilities) {
			NotificationChain msgs = null;
			if (scalarCapabilities != null)
				msgs = ((InternalEObject)scalarCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, null, msgs);
			if (newScalarCapabilities != null)
				msgs = ((InternalEObject)newScalarCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, null, msgs);
			msgs = basicSetScalarCapabilities(newScalarCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, newScalarCapabilities, newScalarCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdCapabilitiesType getIdCapabilities() {
		return idCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdCapabilities(IdCapabilitiesType newIdCapabilities, NotificationChain msgs) {
		IdCapabilitiesType oldIdCapabilities = idCapabilities;
		idCapabilities = newIdCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, oldIdCapabilities, newIdCapabilities);
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
	public void setIdCapabilities(IdCapabilitiesType newIdCapabilities) {
		if (newIdCapabilities != idCapabilities) {
			NotificationChain msgs = null;
			if (idCapabilities != null)
				msgs = ((InternalEObject)idCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, null, msgs);
			if (newIdCapabilities != null)
				msgs = ((InternalEObject)newIdCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, null, msgs);
			msgs = basicSetIdCapabilities(newIdCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, newIdCapabilities, newIdCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				return basicSetSpatialCapabilities(null, msgs);
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				return basicSetScalarCapabilities(null, msgs);
			case OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				return basicSetIdCapabilities(null, msgs);
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
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				return getSpatialCapabilities();
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				return getScalarCapabilities();
			case OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				return getIdCapabilities();
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
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				setSpatialCapabilities((SpatialCapabilitiesType)newValue);
				return;
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				setScalarCapabilities((ScalarCapabilitiesType)newValue);
				return;
			case OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				setIdCapabilities((IdCapabilitiesType)newValue);
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
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				setSpatialCapabilities((SpatialCapabilitiesType)null);
				return;
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				setScalarCapabilities((ScalarCapabilitiesType)null);
				return;
			case OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				setIdCapabilities((IdCapabilitiesType)null);
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
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				return spatialCapabilities != null;
			case OGCPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				return scalarCapabilities != null;
			case OGCPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				return idCapabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterCapabilitiesTypeImpl
