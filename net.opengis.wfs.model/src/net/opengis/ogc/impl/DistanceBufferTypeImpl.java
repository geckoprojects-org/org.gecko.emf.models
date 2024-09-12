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

import net.opengis.gml.AbstractGeometryType;

import net.opengis.ogc.DistanceBufferType;
import net.opengis.ogc.DistanceType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.PropertyNameType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Buffer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.DistanceBufferTypeImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DistanceBufferTypeImpl#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DistanceBufferTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DistanceBufferTypeImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceBufferTypeImpl extends SpatialOpsTypeImpl implements DistanceBufferType {
	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected PropertyNameType propertyName;

	/**
	 * The cached value of the '{@link #getGeometryGroup() <em>Geometry Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap geometryGroup;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected DistanceType distance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceBufferTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.DISTANCE_BUFFER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNameType getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyName(PropertyNameType newPropertyName, NotificationChain msgs) {
		PropertyNameType oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME, oldPropertyName, newPropertyName);
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
	public void setPropertyName(PropertyNameType newPropertyName) {
		if (newPropertyName != propertyName) {
			NotificationChain msgs = null;
			if (propertyName != null)
				msgs = ((InternalEObject)propertyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME, null, msgs);
			if (newPropertyName != null)
				msgs = ((InternalEObject)newPropertyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME, null, msgs);
			msgs = basicSetPropertyName(newPropertyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME, newPropertyName, newPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGeometryGroup() {
		if (geometryGroup == null) {
			geometryGroup = new BasicFeatureMap(this, OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP);
		}
		return geometryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeometryType getGeometry() {
		return (AbstractGeometryType)getGeometryGroup().get(OGCPackage.Literals.DISTANCE_BUFFER_TYPE__GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(AbstractGeometryType newGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGeometryGroup()).basicAdd(OGCPackage.Literals.DISTANCE_BUFFER_TYPE__GEOMETRY, newGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistanceType getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(DistanceType newDistance, NotificationChain msgs) {
		DistanceType oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE, oldDistance, newDistance);
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
	public void setDistance(DistanceType newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject)distance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE, null, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject)newDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE, null, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE, newDistance, newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME:
				return basicSetPropertyName(null, msgs);
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP:
				return ((InternalEList<?>)getGeometryGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE:
				return basicSetDistance(null, msgs);
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
			case OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME:
				return getPropertyName();
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP:
				if (coreType) return getGeometryGroup();
				return ((FeatureMap.Internal)getGeometryGroup()).getWrapper();
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY:
				return getGeometry();
			case OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE:
				return getDistance();
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
			case OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME:
				setPropertyName((PropertyNameType)newValue);
				return;
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP:
				((FeatureMap.Internal)getGeometryGroup()).set(newValue);
				return;
			case OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE:
				setDistance((DistanceType)newValue);
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
			case OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME:
				setPropertyName((PropertyNameType)null);
				return;
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP:
				getGeometryGroup().clear();
				return;
			case OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE:
				setDistance((DistanceType)null);
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
			case OGCPackage.DISTANCE_BUFFER_TYPE__PROPERTY_NAME:
				return propertyName != null;
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP:
				return geometryGroup != null && !geometryGroup.isEmpty();
			case OGCPackage.DISTANCE_BUFFER_TYPE__GEOMETRY:
				return getGeometry() != null;
			case OGCPackage.DISTANCE_BUFFER_TYPE__DISTANCE:
				return distance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (geometryGroup: ");
		result.append(geometryGroup);
		result.append(')');
		return result.toString();
	}

} //DistanceBufferTypeImpl
