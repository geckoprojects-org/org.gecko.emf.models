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
import net.opengis.kml.LookAtType;

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
 * An implementation of the model object '<em><b>Look At Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getTilt <em>Tilt</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getLookAtSimpleExtensionGroupGroup <em>Look At Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getLookAtSimpleExtensionGroup <em>Look At Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getLookAtObjectExtensionGroupGroup <em>Look At Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LookAtTypeImpl#getLookAtObjectExtensionGroup <em>Look At Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookAtTypeImpl extends AbstractViewTypeImpl implements LookAtType {
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
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final double RANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected double range = RANGE_EDEFAULT;

	/**
	 * This is true if the Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rangeESet;

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
	 * The cached value of the '{@link #getLookAtSimpleExtensionGroupGroup() <em>Look At Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookAtSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lookAtSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLookAtObjectExtensionGroupGroup() <em>Look At Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookAtObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lookAtObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookAtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLookAtType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOOK_AT_TYPE__LONGITUDE, oldLongitude, longitude, !oldLongitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOOK_AT_TYPE__LONGITUDE, oldLongitude, LONGITUDE_EDEFAULT, oldLongitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOOK_AT_TYPE__LATITUDE, oldLatitude, latitude, !oldLatitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOOK_AT_TYPE__LATITUDE, oldLatitude, LATITUDE_EDEFAULT, oldLatitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOOK_AT_TYPE__ALTITUDE, oldAltitude, altitude, !oldAltitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOOK_AT_TYPE__ALTITUDE, oldAltitude, ALTITUDE_EDEFAULT, oldAltitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOOK_AT_TYPE__HEADING, oldHeading, heading, !oldHeadingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOOK_AT_TYPE__HEADING, oldHeading, HEADING_EDEFAULT, oldHeadingESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOOK_AT_TYPE__TILT, oldTilt, tilt, !oldTiltESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOOK_AT_TYPE__TILT, oldTilt, TILT_EDEFAULT, oldTiltESet));
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
	public double getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(double newRange) {
		double oldRange = range;
		range = newRange;
		boolean oldRangeESet = rangeESet;
		rangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOOK_AT_TYPE__RANGE, oldRange, range, !oldRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRange() {
		double oldRange = range;
		boolean oldRangeESet = rangeESet;
		range = RANGE_EDEFAULT;
		rangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOOK_AT_TYPE__RANGE, oldRange, RANGE_EDEFAULT, oldRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRange() {
		return rangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAltitudeModeGroupGroup() {
		if (altitudeModeGroupGroup == null) {
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP_GROUP);
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
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getLookAtType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getLookAtType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLookAtSimpleExtensionGroupGroup() {
		if (lookAtSimpleExtensionGroupGroup == null) {
			lookAtSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return lookAtSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLookAtSimpleExtensionGroup() {
		return getLookAtSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLookAtType_LookAtSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLookAtObjectExtensionGroupGroup() {
		if (lookAtObjectExtensionGroupGroup == null) {
			lookAtObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return lookAtObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLookAtObjectExtensionGroup() {
		return getLookAtObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLookAtType_LookAtObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLookAtSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLookAtObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLookAtObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LOOK_AT_TYPE__LONGITUDE:
				return getLongitude();
			case KMLPackage.LOOK_AT_TYPE__LATITUDE:
				return getLatitude();
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE:
				return getAltitude();
			case KMLPackage.LOOK_AT_TYPE__HEADING:
				return getHeading();
			case KMLPackage.LOOK_AT_TYPE__TILT:
				return getTilt();
			case KMLPackage.LOOK_AT_TYPE__RANGE:
				return getRange();
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLookAtSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLookAtSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP:
				return getLookAtSimpleExtensionGroup();
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLookAtObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLookAtObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP:
				return getLookAtObjectExtensionGroup();
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
			case KMLPackage.LOOK_AT_TYPE__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__HEADING:
				setHeading((Double)newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__TILT:
				setTilt((Double)newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__RANGE:
				setRange((Double)newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLookAtSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLookAtObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LOOK_AT_TYPE__LONGITUDE:
				unsetLongitude();
				return;
			case KMLPackage.LOOK_AT_TYPE__LATITUDE:
				unsetLatitude();
				return;
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE:
				unsetAltitude();
				return;
			case KMLPackage.LOOK_AT_TYPE__HEADING:
				unsetHeading();
				return;
			case KMLPackage.LOOK_AT_TYPE__TILT:
				unsetTilt();
				return;
			case KMLPackage.LOOK_AT_TYPE__RANGE:
				unsetRange();
				return;
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP_GROUP:
				getLookAtSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP_GROUP:
				getLookAtObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LOOK_AT_TYPE__LONGITUDE:
				return isSetLongitude();
			case KMLPackage.LOOK_AT_TYPE__LATITUDE:
				return isSetLatitude();
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE:
				return isSetAltitude();
			case KMLPackage.LOOK_AT_TYPE__HEADING:
				return isSetHeading();
			case KMLPackage.LOOK_AT_TYPE__TILT:
				return isSetTilt();
			case KMLPackage.LOOK_AT_TYPE__RANGE:
				return isSetRange();
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.LOOK_AT_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP_GROUP:
				return lookAtSimpleExtensionGroupGroup != null && !lookAtSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP:
				return !getLookAtSimpleExtensionGroup().isEmpty();
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP_GROUP:
				return lookAtObjectExtensionGroupGroup != null && !lookAtObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP:
				return !getLookAtObjectExtensionGroup().isEmpty();
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
		result.append(", range: ");
		if (rangeESet) result.append(range); else result.append("<unset>");
		result.append(", altitudeModeGroupGroup: ");
		result.append(altitudeModeGroupGroup);
		result.append(", lookAtSimpleExtensionGroupGroup: ");
		result.append(lookAtSimpleExtensionGroupGroup);
		result.append(", lookAtObjectExtensionGroupGroup: ");
		result.append(lookAtObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LookAtTypeImpl
