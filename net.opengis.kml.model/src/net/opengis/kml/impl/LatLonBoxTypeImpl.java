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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LatLonBoxType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LatLonBoxTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonBoxTypeImpl#getLatLonBoxSimpleExtensionGroupGroup <em>Lat Lon Box Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonBoxTypeImpl#getLatLonBoxSimpleExtensionGroup <em>Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonBoxTypeImpl#getLatLonBoxObjectExtensionGroupGroup <em>Lat Lon Box Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonBoxTypeImpl#getLatLonBoxObjectExtensionGroup <em>Lat Lon Box Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatLonBoxTypeImpl extends AbstractLatLonBoxTypeImpl implements LatLonBoxType {
	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected double rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The cached value of the '{@link #getLatLonBoxSimpleExtensionGroupGroup() <em>Lat Lon Box Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonBoxSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap latLonBoxSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLatLonBoxObjectExtensionGroupGroup() <em>Lat Lon Box Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonBoxObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap latLonBoxObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatLonBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLatLonBoxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(double newRotation) {
		double oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LAT_LON_BOX_TYPE__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRotation() {
		double oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LAT_LON_BOX_TYPE__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLatLonBoxSimpleExtensionGroupGroup() {
		if (latLonBoxSimpleExtensionGroupGroup == null) {
			latLonBoxSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return latLonBoxSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLatLonBoxSimpleExtensionGroup() {
		return getLatLonBoxSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLatLonBoxType_LatLonBoxSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLatLonBoxObjectExtensionGroupGroup() {
		if (latLonBoxObjectExtensionGroupGroup == null) {
			latLonBoxObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return latLonBoxObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLatLonBoxObjectExtensionGroup() {
		return getLatLonBoxObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLatLonBoxType_LatLonBoxObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLatLonBoxSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLatLonBoxObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLatLonBoxObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LAT_LON_BOX_TYPE__ROTATION:
				return getRotation();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLatLonBoxSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLatLonBoxSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return getLatLonBoxSimpleExtensionGroup();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLatLonBoxObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLatLonBoxObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return getLatLonBoxObjectExtensionGroup();
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
			case KMLPackage.LAT_LON_BOX_TYPE__ROTATION:
				setRotation((Double)newValue);
				return;
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLatLonBoxSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLatLonBoxObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LAT_LON_BOX_TYPE__ROTATION:
				unsetRotation();
				return;
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				getLatLonBoxSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				getLatLonBoxObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LAT_LON_BOX_TYPE__ROTATION:
				return isSetRotation();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				return latLonBoxSimpleExtensionGroupGroup != null && !latLonBoxSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return !getLatLonBoxSimpleExtensionGroup().isEmpty();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				return latLonBoxObjectExtensionGroupGroup != null && !latLonBoxObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return !getLatLonBoxObjectExtensionGroup().isEmpty();
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
		result.append(" (rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", latLonBoxSimpleExtensionGroupGroup: ");
		result.append(latLonBoxSimpleExtensionGroupGroup);
		result.append(", latLonBoxObjectExtensionGroupGroup: ");
		result.append(latLonBoxObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LatLonBoxTypeImpl
