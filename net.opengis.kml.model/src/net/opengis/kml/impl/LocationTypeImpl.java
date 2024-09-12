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
import net.opengis.kml.LocationType;

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
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LocationTypeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LocationTypeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LocationTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LocationTypeImpl#getLocationSimpleExtensionGroupGroup <em>Location Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LocationTypeImpl#getLocationSimpleExtensionGroup <em>Location Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LocationTypeImpl#getLocationObjectExtensionGroupGroup <em>Location Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LocationTypeImpl#getLocationObjectExtensionGroup <em>Location Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationTypeImpl extends AbstractObjectTypeImpl implements LocationType {
	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected double longitude = LONGITUDE_EDEFAULT;

	/**
	 * This is true if the Longitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longitudeESet;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected double latitude = LATITUDE_EDEFAULT;

	/**
	 * This is true if the Latitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean latitudeESet;

	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected double altitude = ALTITUDE_EDEFAULT;

	/**
	 * This is true if the Altitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeESet;

	/**
	 * The cached value of the '{@link #getLocationSimpleExtensionGroupGroup() <em>Location Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLocationObjectExtensionGroupGroup() <em>Location Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLocationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(double newLongitude) {
		double oldLongitude = longitude;
		longitude = newLongitude;
		boolean oldLongitudeESet = longitudeESet;
		longitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOCATION_TYPE__LONGITUDE, oldLongitude, longitude, !oldLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLongitude() {
		double oldLongitude = longitude;
		boolean oldLongitudeESet = longitudeESet;
		longitude = LONGITUDE_EDEFAULT;
		longitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOCATION_TYPE__LONGITUDE, oldLongitude, LONGITUDE_EDEFAULT, oldLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLongitude() {
		return longitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(double newLatitude) {
		double oldLatitude = latitude;
		latitude = newLatitude;
		boolean oldLatitudeESet = latitudeESet;
		latitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOCATION_TYPE__LATITUDE, oldLatitude, latitude, !oldLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLatitude() {
		double oldLatitude = latitude;
		boolean oldLatitudeESet = latitudeESet;
		latitude = LATITUDE_EDEFAULT;
		latitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOCATION_TYPE__LATITUDE, oldLatitude, LATITUDE_EDEFAULT, oldLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLatitude() {
		return latitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltitude(double newAltitude) {
		double oldAltitude = altitude;
		altitude = newAltitude;
		boolean oldAltitudeESet = altitudeESet;
		altitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOCATION_TYPE__ALTITUDE, oldAltitude, altitude, !oldAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAltitude() {
		double oldAltitude = altitude;
		boolean oldAltitudeESet = altitudeESet;
		altitude = ALTITUDE_EDEFAULT;
		altitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOCATION_TYPE__ALTITUDE, oldAltitude, ALTITUDE_EDEFAULT, oldAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAltitude() {
		return altitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLocationSimpleExtensionGroupGroup() {
		if (locationSimpleExtensionGroupGroup == null) {
			locationSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return locationSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLocationSimpleExtensionGroup() {
		return getLocationSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLocationType_LocationSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLocationObjectExtensionGroupGroup() {
		if (locationObjectExtensionGroupGroup == null) {
			locationObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return locationObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLocationObjectExtensionGroup() {
		return getLocationObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLocationType_LocationObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLocationSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLocationObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLocationObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LOCATION_TYPE__LONGITUDE:
				return getLongitude();
			case KMLPackage.LOCATION_TYPE__LATITUDE:
				return getLatitude();
			case KMLPackage.LOCATION_TYPE__ALTITUDE:
				return getAltitude();
			case KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLocationSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLocationSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP:
				return getLocationSimpleExtensionGroup();
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLocationObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLocationObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP:
				return getLocationObjectExtensionGroup();
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
			case KMLPackage.LOCATION_TYPE__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case KMLPackage.LOCATION_TYPE__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case KMLPackage.LOCATION_TYPE__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLocationSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLocationObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LOCATION_TYPE__LONGITUDE:
				unsetLongitude();
				return;
			case KMLPackage.LOCATION_TYPE__LATITUDE:
				unsetLatitude();
				return;
			case KMLPackage.LOCATION_TYPE__ALTITUDE:
				unsetAltitude();
				return;
			case KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP_GROUP:
				getLocationSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP_GROUP:
				getLocationObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LOCATION_TYPE__LONGITUDE:
				return isSetLongitude();
			case KMLPackage.LOCATION_TYPE__LATITUDE:
				return isSetLatitude();
			case KMLPackage.LOCATION_TYPE__ALTITUDE:
				return isSetAltitude();
			case KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP_GROUP:
				return locationSimpleExtensionGroupGroup != null && !locationSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP:
				return !getLocationSimpleExtensionGroup().isEmpty();
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP_GROUP:
				return locationObjectExtensionGroupGroup != null && !locationObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP:
				return !getLocationObjectExtensionGroup().isEmpty();
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
		result.append(" (longitude: ");
		if (longitudeESet) result.append(longitude); else result.append("<unset>");
		result.append(", latitude: ");
		if (latitudeESet) result.append(latitude); else result.append("<unset>");
		result.append(", altitude: ");
		if (altitudeESet) result.append(altitude); else result.append("<unset>");
		result.append(", locationSimpleExtensionGroupGroup: ");
		result.append(locationSimpleExtensionGroupGroup);
		result.append(", locationObjectExtensionGroupGroup: ");
		result.append(locationObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LocationTypeImpl
