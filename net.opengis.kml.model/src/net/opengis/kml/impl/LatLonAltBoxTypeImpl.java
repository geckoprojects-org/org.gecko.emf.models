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
import net.opengis.kml.LatLonAltBoxType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon Alt Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getLatLonAltBoxSimpleExtensionGroupGroup <em>Lat Lon Alt Box Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getLatLonAltBoxSimpleExtensionGroup <em>Lat Lon Alt Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getLatLonAltBoxObjectExtensionGroupGroup <em>Lat Lon Alt Box Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl#getLatLonAltBoxObjectExtensionGroup <em>Lat Lon Alt Box Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatLonAltBoxTypeImpl extends AbstractLatLonBoxTypeImpl implements LatLonAltBoxType {
	/**
	 * The default value of the '{@link #getMinAltitude() <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinAltitude() <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAltitude()
	 * @generated
	 * @ordered
	 */
	protected double minAltitude = MIN_ALTITUDE_EDEFAULT;

	/**
	 * This is true if the Min Altitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minAltitudeESet;

	/**
	 * The default value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected double maxAltitude = MAX_ALTITUDE_EDEFAULT;

	/**
	 * This is true if the Max Altitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAltitudeESet;

	/**
	 * The cached value of the '{@link #getAltitudeModeGroupGroup() <em>Altitude Mode Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeModeGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap altitudeModeGroupGroup;

	/**
	 * The cached value of the '{@link #getLatLonAltBoxSimpleExtensionGroupGroup() <em>Lat Lon Alt Box Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonAltBoxSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap latLonAltBoxSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLatLonAltBoxObjectExtensionGroupGroup() <em>Lat Lon Alt Box Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonAltBoxObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap latLonAltBoxObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatLonAltBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLatLonAltBoxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinAltitude() {
		return minAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAltitude(double newMinAltitude) {
		double oldMinAltitude = minAltitude;
		minAltitude = newMinAltitude;
		boolean oldMinAltitudeESet = minAltitudeESet;
		minAltitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE, oldMinAltitude, minAltitude, !oldMinAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinAltitude() {
		double oldMinAltitude = minAltitude;
		boolean oldMinAltitudeESet = minAltitudeESet;
		minAltitude = MIN_ALTITUDE_EDEFAULT;
		minAltitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE, oldMinAltitude, MIN_ALTITUDE_EDEFAULT, oldMinAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinAltitude() {
		return minAltitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxAltitude() {
		return maxAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAltitude(double newMaxAltitude) {
		double oldMaxAltitude = maxAltitude;
		maxAltitude = newMaxAltitude;
		boolean oldMaxAltitudeESet = maxAltitudeESet;
		maxAltitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE, oldMaxAltitude, maxAltitude, !oldMaxAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxAltitude() {
		double oldMaxAltitude = maxAltitude;
		boolean oldMaxAltitudeESet = maxAltitudeESet;
		maxAltitude = MAX_ALTITUDE_EDEFAULT;
		maxAltitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE, oldMaxAltitude, MAX_ALTITUDE_EDEFAULT, oldMaxAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxAltitude() {
		return maxAltitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAltitudeModeGroupGroup() {
		if (altitudeModeGroupGroup == null) {
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP_GROUP);
		}
		return altitudeModeGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAltitudeModeGroup() {
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getLatLonAltBoxType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getLatLonAltBoxType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLatLonAltBoxSimpleExtensionGroupGroup() {
		if (latLonAltBoxSimpleExtensionGroupGroup == null) {
			latLonAltBoxSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return latLonAltBoxSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLatLonAltBoxSimpleExtensionGroup() {
		return getLatLonAltBoxSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLatLonAltBoxType_LatLonAltBoxSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLatLonAltBoxObjectExtensionGroupGroup() {
		if (latLonAltBoxObjectExtensionGroupGroup == null) {
			latLonAltBoxObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return latLonAltBoxObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLatLonAltBoxObjectExtensionGroup() {
		return getLatLonAltBoxObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLatLonAltBoxType_LatLonAltBoxObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLatLonAltBoxSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLatLonAltBoxObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLatLonAltBoxObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				return getMinAltitude();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				return getMaxAltitude();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLatLonAltBoxSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLatLonAltBoxSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP:
				return getLatLonAltBoxSimpleExtensionGroup();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLatLonAltBoxObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLatLonAltBoxObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP:
				return getLatLonAltBoxObjectExtensionGroup();
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
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				setMinAltitude((Double)newValue);
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				setMaxAltitude((Double)newValue);
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLatLonAltBoxSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLatLonAltBoxObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				unsetMinAltitude();
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				unsetMaxAltitude();
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				getLatLonAltBoxSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				getLatLonAltBoxObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				return isSetMinAltitude();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				return isSetMaxAltitude();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				return latLonAltBoxSimpleExtensionGroupGroup != null && !latLonAltBoxSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP:
				return !getLatLonAltBoxSimpleExtensionGroup().isEmpty();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				return latLonAltBoxObjectExtensionGroupGroup != null && !latLonAltBoxObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP:
				return !getLatLonAltBoxObjectExtensionGroup().isEmpty();
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
		result.append(" (minAltitude: ");
		if (minAltitudeESet) result.append(minAltitude); else result.append("<unset>");
		result.append(", maxAltitude: ");
		if (maxAltitudeESet) result.append(maxAltitude); else result.append("<unset>");
		result.append(", altitudeModeGroupGroup: ");
		result.append(altitudeModeGroupGroup);
		result.append(", latLonAltBoxSimpleExtensionGroupGroup: ");
		result.append(latLonAltBoxSimpleExtensionGroupGroup);
		result.append(", latLonAltBoxObjectExtensionGroupGroup: ");
		result.append(latLonAltBoxObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LatLonAltBoxTypeImpl
