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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.DecimalPropertyType;

import org.isotc211._2005.gmd.EXGeographicBoundingBoxType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EX Geographic Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXGeographicBoundingBoxTypeImpl#getWestBoundLongitude <em>West Bound Longitude</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXGeographicBoundingBoxTypeImpl#getEastBoundLongitude <em>East Bound Longitude</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXGeographicBoundingBoxTypeImpl#getSouthBoundLatitude <em>South Bound Latitude</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXGeographicBoundingBoxTypeImpl#getNorthBoundLatitude <em>North Bound Latitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXGeographicBoundingBoxTypeImpl extends AbstractEXGeographicExtentTypeImpl implements EXGeographicBoundingBoxType {
	/**
	 * The cached value of the '{@link #getWestBoundLongitude() <em>West Bound Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWestBoundLongitude()
	 * @generated
	 * @ordered
	 */
	protected DecimalPropertyType westBoundLongitude;

	/**
	 * The cached value of the '{@link #getEastBoundLongitude() <em>East Bound Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEastBoundLongitude()
	 * @generated
	 * @ordered
	 */
	protected DecimalPropertyType eastBoundLongitude;

	/**
	 * The cached value of the '{@link #getSouthBoundLatitude() <em>South Bound Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouthBoundLatitude()
	 * @generated
	 * @ordered
	 */
	protected DecimalPropertyType southBoundLatitude;

	/**
	 * The cached value of the '{@link #getNorthBoundLatitude() <em>North Bound Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorthBoundLatitude()
	 * @generated
	 * @ordered
	 */
	protected DecimalPropertyType northBoundLatitude;

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
		return GMDPackage.eINSTANCE.getEXGeographicBoundingBoxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalPropertyType getWestBoundLongitude() {
		return westBoundLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWestBoundLongitude(DecimalPropertyType newWestBoundLongitude, NotificationChain msgs) {
		DecimalPropertyType oldWestBoundLongitude = westBoundLongitude;
		westBoundLongitude = newWestBoundLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE, oldWestBoundLongitude, newWestBoundLongitude);
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
	public void setWestBoundLongitude(DecimalPropertyType newWestBoundLongitude) {
		if (newWestBoundLongitude != westBoundLongitude) {
			NotificationChain msgs = null;
			if (westBoundLongitude != null)
				msgs = ((InternalEObject)westBoundLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE, null, msgs);
			if (newWestBoundLongitude != null)
				msgs = ((InternalEObject)newWestBoundLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE, null, msgs);
			msgs = basicSetWestBoundLongitude(newWestBoundLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE, newWestBoundLongitude, newWestBoundLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalPropertyType getEastBoundLongitude() {
		return eastBoundLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEastBoundLongitude(DecimalPropertyType newEastBoundLongitude, NotificationChain msgs) {
		DecimalPropertyType oldEastBoundLongitude = eastBoundLongitude;
		eastBoundLongitude = newEastBoundLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE, oldEastBoundLongitude, newEastBoundLongitude);
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
	public void setEastBoundLongitude(DecimalPropertyType newEastBoundLongitude) {
		if (newEastBoundLongitude != eastBoundLongitude) {
			NotificationChain msgs = null;
			if (eastBoundLongitude != null)
				msgs = ((InternalEObject)eastBoundLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE, null, msgs);
			if (newEastBoundLongitude != null)
				msgs = ((InternalEObject)newEastBoundLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE, null, msgs);
			msgs = basicSetEastBoundLongitude(newEastBoundLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE, newEastBoundLongitude, newEastBoundLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalPropertyType getSouthBoundLatitude() {
		return southBoundLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouthBoundLatitude(DecimalPropertyType newSouthBoundLatitude, NotificationChain msgs) {
		DecimalPropertyType oldSouthBoundLatitude = southBoundLatitude;
		southBoundLatitude = newSouthBoundLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE, oldSouthBoundLatitude, newSouthBoundLatitude);
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
	public void setSouthBoundLatitude(DecimalPropertyType newSouthBoundLatitude) {
		if (newSouthBoundLatitude != southBoundLatitude) {
			NotificationChain msgs = null;
			if (southBoundLatitude != null)
				msgs = ((InternalEObject)southBoundLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE, null, msgs);
			if (newSouthBoundLatitude != null)
				msgs = ((InternalEObject)newSouthBoundLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE, null, msgs);
			msgs = basicSetSouthBoundLatitude(newSouthBoundLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE, newSouthBoundLatitude, newSouthBoundLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalPropertyType getNorthBoundLatitude() {
		return northBoundLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNorthBoundLatitude(DecimalPropertyType newNorthBoundLatitude, NotificationChain msgs) {
		DecimalPropertyType oldNorthBoundLatitude = northBoundLatitude;
		northBoundLatitude = newNorthBoundLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE, oldNorthBoundLatitude, newNorthBoundLatitude);
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
	public void setNorthBoundLatitude(DecimalPropertyType newNorthBoundLatitude) {
		if (newNorthBoundLatitude != northBoundLatitude) {
			NotificationChain msgs = null;
			if (northBoundLatitude != null)
				msgs = ((InternalEObject)northBoundLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE, null, msgs);
			if (newNorthBoundLatitude != null)
				msgs = ((InternalEObject)newNorthBoundLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE, null, msgs);
			msgs = basicSetNorthBoundLatitude(newNorthBoundLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE, newNorthBoundLatitude, newNorthBoundLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				return basicSetWestBoundLongitude(null, msgs);
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				return basicSetEastBoundLongitude(null, msgs);
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				return basicSetSouthBoundLatitude(null, msgs);
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				return basicSetNorthBoundLatitude(null, msgs);
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
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				return getWestBoundLongitude();
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				return getEastBoundLongitude();
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				return getSouthBoundLatitude();
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
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
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				setWestBoundLongitude((DecimalPropertyType)newValue);
				return;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				setEastBoundLongitude((DecimalPropertyType)newValue);
				return;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				setSouthBoundLatitude((DecimalPropertyType)newValue);
				return;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				setNorthBoundLatitude((DecimalPropertyType)newValue);
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
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				setWestBoundLongitude((DecimalPropertyType)null);
				return;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				setEastBoundLongitude((DecimalPropertyType)null);
				return;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				setSouthBoundLatitude((DecimalPropertyType)null);
				return;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				setNorthBoundLatitude((DecimalPropertyType)null);
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
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__WEST_BOUND_LONGITUDE:
				return westBoundLongitude != null;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__EAST_BOUND_LONGITUDE:
				return eastBoundLongitude != null;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__SOUTH_BOUND_LATITUDE:
				return southBoundLatitude != null;
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE__NORTH_BOUND_LATITUDE:
				return northBoundLatitude != null;
		}
		return super.eIsSet(featureID);
	}

} //EXGeographicBoundingBoxTypeImpl
