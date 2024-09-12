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
import net.opengis.kml.GroundOverlayType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LatLonBoxType;

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
 * An implementation of the model object '<em><b>Ground Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getLatLonBox <em>Lat Lon Box</em>}</li>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getGroundOverlaySimpleExtensionGroupGroup <em>Ground Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getGroundOverlaySimpleExtensionGroup <em>Ground Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getGroundOverlayObjectExtensionGroupGroup <em>Ground Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.GroundOverlayTypeImpl#getGroundOverlayObjectExtensionGroup <em>Ground Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundOverlayTypeImpl extends AbstractOverlayTypeImpl implements GroundOverlayType {
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
	 * The cached value of the '{@link #getAltitudeModeGroupGroup() <em>Altitude Mode Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeModeGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap altitudeModeGroupGroup;

	/**
	 * The cached value of the '{@link #getLatLonBox() <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonBox()
	 * @generated
	 * @ordered
	 */
	protected LatLonBoxType latLonBox;

	/**
	 * The cached value of the '{@link #getGroundOverlaySimpleExtensionGroupGroup() <em>Ground Overlay Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundOverlaySimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap groundOverlaySimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getGroundOverlayObjectExtensionGroupGroup() <em>Ground Overlay Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundOverlayObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap groundOverlayObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundOverlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getGroundOverlayType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE, oldAltitude, altitude, !oldAltitudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE, oldAltitude, ALTITUDE_EDEFAULT, oldAltitudeESet));
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
	public FeatureMap getAltitudeModeGroupGroup() {
		if (altitudeModeGroupGroup == null) {
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP_GROUP);
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
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getGroundOverlayType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getGroundOverlayType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatLonBoxType getLatLonBox() {
		return latLonBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonBox(LatLonBoxType newLatLonBox, NotificationChain msgs) {
		LatLonBoxType oldLatLonBox = latLonBox;
		latLonBox = newLatLonBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX, oldLatLonBox, newLatLonBox);
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
	public void setLatLonBox(LatLonBoxType newLatLonBox) {
		if (newLatLonBox != latLonBox) {
			NotificationChain msgs = null;
			if (latLonBox != null)
				msgs = ((InternalEObject)latLonBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX, null, msgs);
			if (newLatLonBox != null)
				msgs = ((InternalEObject)newLatLonBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX, null, msgs);
			msgs = basicSetLatLonBox(newLatLonBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX, newLatLonBox, newLatLonBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroundOverlaySimpleExtensionGroupGroup() {
		if (groundOverlaySimpleExtensionGroupGroup == null) {
			groundOverlaySimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return groundOverlaySimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getGroundOverlaySimpleExtensionGroup() {
		return getGroundOverlaySimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getGroundOverlayType_GroundOverlaySimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroundOverlayObjectExtensionGroupGroup() {
		if (groundOverlayObjectExtensionGroupGroup == null) {
			groundOverlayObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return groundOverlayObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getGroundOverlayObjectExtensionGroup() {
		return getGroundOverlayObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getGroundOverlayType_GroundOverlayObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				return basicSetLatLonBox(null, msgs);
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getGroundOverlaySimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getGroundOverlayObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getGroundOverlayObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE:
				return getAltitude();
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				return getLatLonBox();
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getGroundOverlaySimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getGroundOverlaySimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getGroundOverlaySimpleExtensionGroup();
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getGroundOverlayObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getGroundOverlayObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getGroundOverlayObjectExtensionGroup();
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
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)newValue);
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getGroundOverlaySimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getGroundOverlayObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE:
				unsetAltitude();
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)null);
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				getGroundOverlaySimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				getGroundOverlayObjectExtensionGroupGroup().clear();
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
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE:
				return isSetAltitude();
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				return latLonBox != null;
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return groundOverlaySimpleExtensionGroupGroup != null && !groundOverlaySimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return !getGroundOverlaySimpleExtensionGroup().isEmpty();
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return groundOverlayObjectExtensionGroupGroup != null && !groundOverlayObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP:
				return !getGroundOverlayObjectExtensionGroup().isEmpty();
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
		result.append(" (altitude: ");
		if (altitudeESet) result.append(altitude); else result.append("<unset>");
		result.append(", altitudeModeGroupGroup: ");
		result.append(altitudeModeGroupGroup);
		result.append(", groundOverlaySimpleExtensionGroupGroup: ");
		result.append(groundOverlaySimpleExtensionGroupGroup);
		result.append(", groundOverlayObjectExtensionGroupGroup: ");
		result.append(groundOverlayObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //GroundOverlayTypeImpl
