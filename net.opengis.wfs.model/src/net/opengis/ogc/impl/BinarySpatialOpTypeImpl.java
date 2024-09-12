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
import net.opengis.gml.EnvelopeType;

import net.opengis.ogc.BinarySpatialOpType;
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
 * An implementation of the model object '<em><b>Binary Spatial Op Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl#getPropertyName1 <em>Property Name1</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl#getEnvelope <em>Envelope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinarySpatialOpTypeImpl extends SpatialOpsTypeImpl implements BinarySpatialOpType {
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
	 * The cached value of the '{@link #getPropertyName1() <em>Property Name1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName1()
	 * @generated
	 * @ordered
	 */
	protected PropertyNameType propertyName1;

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
	 * The cached value of the '{@link #getEnvelopeGroup() <em>Envelope Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelopeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap envelopeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinarySpatialOpTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.BINARY_SPATIAL_OP_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME, oldPropertyName, newPropertyName);
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
				msgs = ((InternalEObject)propertyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME, null, msgs);
			if (newPropertyName != null)
				msgs = ((InternalEObject)newPropertyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME, null, msgs);
			msgs = basicSetPropertyName(newPropertyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME, newPropertyName, newPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNameType getPropertyName1() {
		return propertyName1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyName1(PropertyNameType newPropertyName1, NotificationChain msgs) {
		PropertyNameType oldPropertyName1 = propertyName1;
		propertyName1 = newPropertyName1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1, oldPropertyName1, newPropertyName1);
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
	public void setPropertyName1(PropertyNameType newPropertyName1) {
		if (newPropertyName1 != propertyName1) {
			NotificationChain msgs = null;
			if (propertyName1 != null)
				msgs = ((InternalEObject)propertyName1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1, null, msgs);
			if (newPropertyName1 != null)
				msgs = ((InternalEObject)newPropertyName1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1, null, msgs);
			msgs = basicSetPropertyName1(newPropertyName1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1, newPropertyName1, newPropertyName1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGeometryGroup() {
		if (geometryGroup == null) {
			geometryGroup = new BasicFeatureMap(this, OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP);
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
		return (AbstractGeometryType)getGeometryGroup().get(OGCPackage.Literals.BINARY_SPATIAL_OP_TYPE__GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(AbstractGeometryType newGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGeometryGroup()).basicAdd(OGCPackage.Literals.BINARY_SPATIAL_OP_TYPE__GEOMETRY, newGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getEnvelopeGroup() {
		if (envelopeGroup == null) {
			envelopeGroup = new BasicFeatureMap(this, OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP);
		}
		return envelopeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvelopeType getEnvelope() {
		return (EnvelopeType)getEnvelopeGroup().get(OGCPackage.Literals.BINARY_SPATIAL_OP_TYPE__ENVELOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelope(EnvelopeType newEnvelope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getEnvelopeGroup()).basicAdd(OGCPackage.Literals.BINARY_SPATIAL_OP_TYPE__ENVELOPE, newEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvelope(EnvelopeType newEnvelope) {
		((FeatureMap.Internal)getEnvelopeGroup()).set(OGCPackage.Literals.BINARY_SPATIAL_OP_TYPE__ENVELOPE, newEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME:
				return basicSetPropertyName(null, msgs);
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1:
				return basicSetPropertyName1(null, msgs);
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP:
				return ((InternalEList<?>)getGeometryGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP:
				return ((InternalEList<?>)getEnvelopeGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE:
				return basicSetEnvelope(null, msgs);
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
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME:
				return getPropertyName();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1:
				return getPropertyName1();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP:
				if (coreType) return getGeometryGroup();
				return ((FeatureMap.Internal)getGeometryGroup()).getWrapper();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY:
				return getGeometry();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP:
				if (coreType) return getEnvelopeGroup();
				return ((FeatureMap.Internal)getEnvelopeGroup()).getWrapper();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE:
				return getEnvelope();
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
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME:
				setPropertyName((PropertyNameType)newValue);
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1:
				setPropertyName1((PropertyNameType)newValue);
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP:
				((FeatureMap.Internal)getGeometryGroup()).set(newValue);
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP:
				((FeatureMap.Internal)getEnvelopeGroup()).set(newValue);
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE:
				setEnvelope((EnvelopeType)newValue);
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
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME:
				setPropertyName((PropertyNameType)null);
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1:
				setPropertyName1((PropertyNameType)null);
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP:
				getGeometryGroup().clear();
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP:
				getEnvelopeGroup().clear();
				return;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE:
				setEnvelope((EnvelopeType)null);
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
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME:
				return propertyName != null;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1:
				return propertyName1 != null;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP:
				return geometryGroup != null && !geometryGroup.isEmpty();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__GEOMETRY:
				return getGeometry() != null;
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP:
				return envelopeGroup != null && !envelopeGroup.isEmpty();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE__ENVELOPE:
				return getEnvelope() != null;
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
		result.append(", envelopeGroup: ");
		result.append(envelopeGroup);
		result.append(')');
		return result.toString();
	}

} //BinarySpatialOpTypeImpl
