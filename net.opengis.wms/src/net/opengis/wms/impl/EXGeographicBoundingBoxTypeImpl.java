/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms.impl;

import net.opengis.wms.EXGeographicBoundingBoxType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EX Geographic Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl#getWestBoundLongitude <em>West Bound Longitude</em>}</li>
 *   <li>{@link net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl#getEastBoundLongitude <em>East Bound Longitude</em>}</li>
 *   <li>{@link net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl#getSouthBoundLatitude <em>South Bound Latitude</em>}</li>
 *   <li>{@link net.opengis.wms.impl.EXGeographicBoundingBoxTypeImpl#getNorthBoundLatitude <em>North Bound Latitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXGeographicBoundingBoxTypeImpl extends MinimalEObjectImpl.Container implements EXGeographicBoundingBoxType {
	/**
	 * The default value of the '{@link #getWestBoundLongitude() <em>West Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWestBoundLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double WEST_BOUND_LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWestBoundLongitude() <em>West Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWestBoundLongitude()
	 * @generated
	 * @ordered
	 */
	protected double westBoundLongitude = WEST_BOUND_LONGITUDE_EDEFAULT;

	/**
	 * This is true if the West Bound Longitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean westBoundLongitudeESet;

	/**
	 * The default value of the '{@link #getEastBoundLongitude() <em>East Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEastBoundLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double EAST_BOUND_LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEastBoundLongitude() <em>East Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEastBoundLongitude()
	 * @generated
	 * @ordered
	 */
	protected double eastBoundLongitude = EAST_BOUND_LONGITUDE_EDEFAULT;

	/**
	 * This is true if the East Bound Longitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eastBoundLongitudeESet;

	/**
	 * The default value of the '{@link #getSouthBoundLatitude() <em>South Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouthBoundLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double SOUTH_BOUND_LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSouthBoundLatitude() <em>South Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouthBoundLatitude()
	 * @generated
	 * @ordered
	 */
	protected double southBoundLatitude = SOUTH_BOUND_LATITUDE_EDEFAULT;

	/**
	 * This is true if the South Bound Latitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean southBoundLatitudeESet;

	/**
	 * The default value of the '{@link #getNorthBoundLatitude() <em>North Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorthBoundLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double NORTH_BOUND_LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNorthBoundLatitude() <em>North Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorthBoundLatitude()
	 * @generated
	 * @ordered
	 */
	protected double northBoundLatitude = NORTH_BOUND_LATITUDE_EDEFAULT;

	/**
	 * This is true if the North Bound Latitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean northBoundLatitudeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXGeographicBoundingBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWestBoundLongitude() {
		return westBoundLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWestBoundLongitude(double newWestBoundLongitude) {
		double oldWestBoundLongitude = westBoundLongitude;
		westBoundLongitude = newWestBoundLongitude;
		boolean oldWestBoundLongitudeESet = westBoundLongitudeESet;
		westBoundLongitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE, oldWestBoundLongitude, westBoundLongitude, !oldWestBoundLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWestBoundLongitude() {
		double oldWestBoundLongitude = westBoundLongitude;
		boolean oldWestBoundLongitudeESet = westBoundLongitudeESet;
		westBoundLongitude = WEST_BOUND_LONGITUDE_EDEFAULT;
		westBoundLongitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE, oldWestBoundLongitude, WEST_BOUND_LONGITUDE_EDEFAULT, oldWestBoundLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWestBoundLongitude() {
		return westBoundLongitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEastBoundLongitude() {
		return eastBoundLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEastBoundLongitude(double newEastBoundLongitude) {
		double oldEastBoundLongitude = eastBoundLongitude;
		eastBoundLongitude = newEastBoundLongitude;
		boolean oldEastBoundLongitudeESet = eastBoundLongitudeESet;
		eastBoundLongitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE, oldEastBoundLongitude, eastBoundLongitude, !oldEastBoundLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEastBoundLongitude() {
		double oldEastBoundLongitude = eastBoundLongitude;
		boolean oldEastBoundLongitudeESet = eastBoundLongitudeESet;
		eastBoundLongitude = EAST_BOUND_LONGITUDE_EDEFAULT;
		eastBoundLongitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE, oldEastBoundLongitude, EAST_BOUND_LONGITUDE_EDEFAULT, oldEastBoundLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEastBoundLongitude() {
		return eastBoundLongitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSouthBoundLatitude() {
		return southBoundLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSouthBoundLatitude(double newSouthBoundLatitude) {
		double oldSouthBoundLatitude = southBoundLatitude;
		southBoundLatitude = newSouthBoundLatitude;
		boolean oldSouthBoundLatitudeESet = southBoundLatitudeESet;
		southBoundLatitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE, oldSouthBoundLatitude, southBoundLatitude, !oldSouthBoundLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSouthBoundLatitude() {
		double oldSouthBoundLatitude = southBoundLatitude;
		boolean oldSouthBoundLatitudeESet = southBoundLatitudeESet;
		southBoundLatitude = SOUTH_BOUND_LATITUDE_EDEFAULT;
		southBoundLatitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE, oldSouthBoundLatitude, SOUTH_BOUND_LATITUDE_EDEFAULT, oldSouthBoundLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSouthBoundLatitude() {
		return southBoundLatitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNorthBoundLatitude() {
		return northBoundLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNorthBoundLatitude(double newNorthBoundLatitude) {
		double oldNorthBoundLatitude = northBoundLatitude;
		northBoundLatitude = newNorthBoundLatitude;
		boolean oldNorthBoundLatitudeESet = northBoundLatitudeESet;
		northBoundLatitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE, oldNorthBoundLatitude, northBoundLatitude, !oldNorthBoundLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNorthBoundLatitude() {
		double oldNorthBoundLatitude = northBoundLatitude;
		boolean oldNorthBoundLatitudeESet = northBoundLatitudeESet;
		northBoundLatitude = NORTH_BOUND_LATITUDE_EDEFAULT;
		northBoundLatitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE, oldNorthBoundLatitude, NORTH_BOUND_LATITUDE_EDEFAULT, oldNorthBoundLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNorthBoundLatitude() {
		return northBoundLatitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				return getWestBoundLongitude();
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				return getEastBoundLongitude();
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				return getSouthBoundLatitude();
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				return getNorthBoundLatitude();
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
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				setWestBoundLongitude((Double)newValue);
				return;
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				setEastBoundLongitude((Double)newValue);
				return;
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				setSouthBoundLatitude((Double)newValue);
				return;
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				setNorthBoundLatitude((Double)newValue);
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
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				unsetWestBoundLongitude();
				return;
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				unsetEastBoundLongitude();
				return;
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				unsetSouthBoundLatitude();
				return;
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				unsetNorthBoundLatitude();
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
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				return isSetWestBoundLongitude();
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				return isSetEastBoundLongitude();
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				return isSetSouthBoundLatitude();
			case WMSPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				return isSetNorthBoundLatitude();
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
		result.append(" (westBoundLongitude: ");
		if (westBoundLongitudeESet) result.append(westBoundLongitude); else result.append("<unset>");
		result.append(", eastBoundLongitude: ");
		if (eastBoundLongitudeESet) result.append(eastBoundLongitude); else result.append("<unset>");
		result.append(", southBoundLatitude: ");
		if (southBoundLatitudeESet) result.append(southBoundLatitude); else result.append("<unset>");
		result.append(", northBoundLatitude: ");
		if (northBoundLatitudeESet) result.append(northBoundLatitude); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EXGeographicBoundingBoxTypeImpl
