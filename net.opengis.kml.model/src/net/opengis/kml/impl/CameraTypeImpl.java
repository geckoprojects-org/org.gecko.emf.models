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
import net.opengis.kml.CameraType;
import net.opengis.kml.KMLPackage;

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
 * An implementation of the model object '<em><b>Camera Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getTilt <em>Tilt</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getCameraSimpleExtensionGroupGroup <em>Camera Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getCameraSimpleExtensionGroup <em>Camera Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getCameraObjectExtensionGroupGroup <em>Camera Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CameraTypeImpl#getCameraObjectExtensionGroup <em>Camera Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraTypeImpl extends AbstractViewTypeImpl implements CameraType {
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
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final double HEADING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected double heading = HEADING_EDEFAULT;

	/**
	 * This is true if the Heading attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean headingESet;

	/**
	 * The default value of the '{@link #getTilt() <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt()
	 * @generated
	 * @ordered
	 */
	protected static final double TILT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTilt() <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt()
	 * @generated
	 * @ordered
	 */
	protected double tilt = TILT_EDEFAULT;

	/**
	 * This is true if the Tilt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tiltESet;

	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected double roll = ROLL_EDEFAULT;

	/**
	 * This is true if the Roll attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rollESet;

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
	 * The cached value of the '{@link #getCameraSimpleExtensionGroupGroup() <em>Camera Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap cameraSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getCameraObjectExtensionGroupGroup() <em>Camera Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap cameraObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getCameraType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.CAMERA_TYPE__LONGITUDE, oldLongitude, longitude, !oldLongitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.CAMERA_TYPE__LONGITUDE, oldLongitude, LONGITUDE_EDEFAULT, oldLongitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.CAMERA_TYPE__LATITUDE, oldLatitude, latitude, !oldLatitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.CAMERA_TYPE__LATITUDE, oldLatitude, LATITUDE_EDEFAULT, oldLatitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.CAMERA_TYPE__ALTITUDE, oldAltitude, altitude, !oldAltitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.CAMERA_TYPE__ALTITUDE, oldAltitude, ALTITUDE_EDEFAULT, oldAltitudeESet));
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
	public double getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeading(double newHeading) {
		double oldHeading = heading;
		heading = newHeading;
		boolean oldHeadingESet = headingESet;
		headingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.CAMERA_TYPE__HEADING, oldHeading, heading, !oldHeadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHeading() {
		double oldHeading = heading;
		boolean oldHeadingESet = headingESet;
		heading = HEADING_EDEFAULT;
		headingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.CAMERA_TYPE__HEADING, oldHeading, HEADING_EDEFAULT, oldHeadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHeading() {
		return headingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTilt() {
		return tilt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTilt(double newTilt) {
		double oldTilt = tilt;
		tilt = newTilt;
		boolean oldTiltESet = tiltESet;
		tiltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.CAMERA_TYPE__TILT, oldTilt, tilt, !oldTiltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTilt() {
		double oldTilt = tilt;
		boolean oldTiltESet = tiltESet;
		tilt = TILT_EDEFAULT;
		tiltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.CAMERA_TYPE__TILT, oldTilt, TILT_EDEFAULT, oldTiltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTilt() {
		return tiltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoll(double newRoll) {
		double oldRoll = roll;
		roll = newRoll;
		boolean oldRollESet = rollESet;
		rollESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.CAMERA_TYPE__ROLL, oldRoll, roll, !oldRollESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRoll() {
		double oldRoll = roll;
		boolean oldRollESet = rollESet;
		roll = ROLL_EDEFAULT;
		rollESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.CAMERA_TYPE__ROLL, oldRoll, ROLL_EDEFAULT, oldRollESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRoll() {
		return rollESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAltitudeModeGroupGroup() {
		if (altitudeModeGroupGroup == null) {
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP_GROUP);
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
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getCameraType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getCameraType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCameraSimpleExtensionGroupGroup() {
		if (cameraSimpleExtensionGroupGroup == null) {
			cameraSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return cameraSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getCameraSimpleExtensionGroup() {
		return getCameraSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getCameraType_CameraSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCameraObjectExtensionGroupGroup() {
		if (cameraObjectExtensionGroupGroup == null) {
			cameraObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return cameraObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getCameraObjectExtensionGroup() {
		return getCameraObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getCameraType_CameraObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getCameraSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getCameraObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getCameraObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.CAMERA_TYPE__LONGITUDE:
				return getLongitude();
			case KMLPackage.CAMERA_TYPE__LATITUDE:
				return getLatitude();
			case KMLPackage.CAMERA_TYPE__ALTITUDE:
				return getAltitude();
			case KMLPackage.CAMERA_TYPE__HEADING:
				return getHeading();
			case KMLPackage.CAMERA_TYPE__TILT:
				return getTilt();
			case KMLPackage.CAMERA_TYPE__ROLL:
				return getRoll();
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getCameraSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getCameraSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP:
				return getCameraSimpleExtensionGroup();
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getCameraObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getCameraObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP:
				return getCameraObjectExtensionGroup();
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
			case KMLPackage.CAMERA_TYPE__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case KMLPackage.CAMERA_TYPE__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case KMLPackage.CAMERA_TYPE__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case KMLPackage.CAMERA_TYPE__HEADING:
				setHeading((Double)newValue);
				return;
			case KMLPackage.CAMERA_TYPE__TILT:
				setTilt((Double)newValue);
				return;
			case KMLPackage.CAMERA_TYPE__ROLL:
				setRoll((Double)newValue);
				return;
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getCameraSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getCameraObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.CAMERA_TYPE__LONGITUDE:
				unsetLongitude();
				return;
			case KMLPackage.CAMERA_TYPE__LATITUDE:
				unsetLatitude();
				return;
			case KMLPackage.CAMERA_TYPE__ALTITUDE:
				unsetAltitude();
				return;
			case KMLPackage.CAMERA_TYPE__HEADING:
				unsetHeading();
				return;
			case KMLPackage.CAMERA_TYPE__TILT:
				unsetTilt();
				return;
			case KMLPackage.CAMERA_TYPE__ROLL:
				unsetRoll();
				return;
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP_GROUP:
				getCameraSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP_GROUP:
				getCameraObjectExtensionGroupGroup().clear();
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
			case KMLPackage.CAMERA_TYPE__LONGITUDE:
				return isSetLongitude();
			case KMLPackage.CAMERA_TYPE__LATITUDE:
				return isSetLatitude();
			case KMLPackage.CAMERA_TYPE__ALTITUDE:
				return isSetAltitude();
			case KMLPackage.CAMERA_TYPE__HEADING:
				return isSetHeading();
			case KMLPackage.CAMERA_TYPE__TILT:
				return isSetTilt();
			case KMLPackage.CAMERA_TYPE__ROLL:
				return isSetRoll();
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.CAMERA_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP_GROUP:
				return cameraSimpleExtensionGroupGroup != null && !cameraSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP:
				return !getCameraSimpleExtensionGroup().isEmpty();
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP_GROUP:
				return cameraObjectExtensionGroupGroup != null && !cameraObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP:
				return !getCameraObjectExtensionGroup().isEmpty();
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
		result.append(", heading: ");
		if (headingESet) result.append(heading); else result.append("<unset>");
		result.append(", tilt: ");
		if (tiltESet) result.append(tilt); else result.append("<unset>");
		result.append(", roll: ");
		if (rollESet) result.append(roll); else result.append("<unset>");
		result.append(", altitudeModeGroupGroup: ");
		result.append(altitudeModeGroupGroup);
		result.append(", cameraSimpleExtensionGroupGroup: ");
		result.append(cameraSimpleExtensionGroupGroup);
		result.append(", cameraObjectExtensionGroupGroup: ");
		result.append(cameraObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //CameraTypeImpl
