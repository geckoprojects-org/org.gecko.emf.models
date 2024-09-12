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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.DirectPositionType;
import net.opengis.gml.gml.DirectionPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GeometryPropertyType;
import net.opengis.gml.gml.LocationPropertyType;
import net.opengis.gml.gml.MeasureType;
import net.opengis.gml.gml.MovingObjectStatusType;
import net.opengis.gml.gml.ReferenceType;
import net.opengis.gml.gml.StringOrRefType;

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
 * An implementation of the model object '<em><b>Moving Object Status Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getLocationGroup <em>Location Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getBearing <em>Bearing</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.MovingObjectStatusTypeImpl#getStatusReference <em>Status Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovingObjectStatusTypeImpl extends AbstractTimeSliceTypeImpl implements MovingObjectStatusType {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType position;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected DirectPositionType pos;

	/**
	 * The cached value of the '{@link #getLocationName() <em>Location Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected CodeType locationName;

	/**
	 * The cached value of the '{@link #getLocationReference() <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType locationReference;

	/**
	 * The cached value of the '{@link #getLocationGroup() <em>Location Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationGroup;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected MeasureType speed;

	/**
	 * The cached value of the '{@link #getBearing() <em>Bearing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearing()
	 * @generated
	 * @ordered
	 */
	protected DirectionPropertyType bearing;

	/**
	 * The cached value of the '{@link #getAcceleration() <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleration()
	 * @generated
	 * @ordered
	 */
	protected MeasureType acceleration;

	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected MeasureType elevation;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType status;

	/**
	 * The cached value of the '{@link #getStatusReference() <em>Status Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType statusReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovingObjectStatusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMovingObjectStatusType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryPropertyType getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(GeometryPropertyType newPosition, NotificationChain msgs) {
		GeometryPropertyType oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION, oldPosition, newPosition);
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
	public void setPosition(GeometryPropertyType newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectPositionType getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPos(DirectPositionType newPos, NotificationChain msgs) {
		DirectPositionType oldPos = pos;
		pos = newPos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS, oldPos, newPos);
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
	public void setPos(DirectPositionType newPos) {
		if (newPos != pos) {
			NotificationChain msgs = null;
			if (pos != null)
				msgs = ((InternalEObject)pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS, null, msgs);
			if (newPos != null)
				msgs = ((InternalEObject)newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS, null, msgs);
			msgs = basicSetPos(newPos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS, newPos, newPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getLocationName() {
		return locationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationName(CodeType newLocationName, NotificationChain msgs) {
		CodeType oldLocationName = locationName;
		locationName = newLocationName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME, oldLocationName, newLocationName);
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
	public void setLocationName(CodeType newLocationName) {
		if (newLocationName != locationName) {
			NotificationChain msgs = null;
			if (locationName != null)
				msgs = ((InternalEObject)locationName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME, null, msgs);
			if (newLocationName != null)
				msgs = ((InternalEObject)newLocationName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME, null, msgs);
			msgs = basicSetLocationName(newLocationName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME, newLocationName, newLocationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getLocationReference() {
		return locationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationReference(ReferenceType newLocationReference, NotificationChain msgs) {
		ReferenceType oldLocationReference = locationReference;
		locationReference = newLocationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE, oldLocationReference, newLocationReference);
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
	public void setLocationReference(ReferenceType newLocationReference) {
		if (newLocationReference != locationReference) {
			NotificationChain msgs = null;
			if (locationReference != null)
				msgs = ((InternalEObject)locationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE, null, msgs);
			if (newLocationReference != null)
				msgs = ((InternalEObject)newLocationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE, null, msgs);
			msgs = basicSetLocationReference(newLocationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE, newLocationReference, newLocationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLocationGroup() {
		if (locationGroup == null) {
			locationGroup = new BasicFeatureMap(this, GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_GROUP);
		}
		return locationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationPropertyType getLocation() {
		return (LocationPropertyType)getLocationGroup().get(GMLPackage.eINSTANCE.getMovingObjectStatusType_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationPropertyType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLocationGroup()).basicAdd(GMLPackage.eINSTANCE.getMovingObjectStatusType_Location(), newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(LocationPropertyType newLocation) {
		((FeatureMap.Internal)getLocationGroup()).set(GMLPackage.eINSTANCE.getMovingObjectStatusType_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeed(MeasureType newSpeed, NotificationChain msgs) {
		MeasureType oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED, oldSpeed, newSpeed);
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
	public void setSpeed(MeasureType newSpeed) {
		if (newSpeed != speed) {
			NotificationChain msgs = null;
			if (speed != null)
				msgs = ((InternalEObject)speed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED, null, msgs);
			if (newSpeed != null)
				msgs = ((InternalEObject)newSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED, null, msgs);
			msgs = basicSetSpeed(newSpeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED, newSpeed, newSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionPropertyType getBearing() {
		return bearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearing(DirectionPropertyType newBearing, NotificationChain msgs) {
		DirectionPropertyType oldBearing = bearing;
		bearing = newBearing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING, oldBearing, newBearing);
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
	public void setBearing(DirectionPropertyType newBearing) {
		if (newBearing != bearing) {
			NotificationChain msgs = null;
			if (bearing != null)
				msgs = ((InternalEObject)bearing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING, null, msgs);
			if (newBearing != null)
				msgs = ((InternalEObject)newBearing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING, null, msgs);
			msgs = basicSetBearing(newBearing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING, newBearing, newBearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getAcceleration() {
		return acceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceleration(MeasureType newAcceleration, NotificationChain msgs) {
		MeasureType oldAcceleration = acceleration;
		acceleration = newAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION, oldAcceleration, newAcceleration);
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
	public void setAcceleration(MeasureType newAcceleration) {
		if (newAcceleration != acceleration) {
			NotificationChain msgs = null;
			if (acceleration != null)
				msgs = ((InternalEObject)acceleration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION, null, msgs);
			if (newAcceleration != null)
				msgs = ((InternalEObject)newAcceleration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION, null, msgs);
			msgs = basicSetAcceleration(newAcceleration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION, newAcceleration, newAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElevation(MeasureType newElevation, NotificationChain msgs) {
		MeasureType oldElevation = elevation;
		elevation = newElevation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION, oldElevation, newElevation);
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
	public void setElevation(MeasureType newElevation) {
		if (newElevation != elevation) {
			NotificationChain msgs = null;
			if (elevation != null)
				msgs = ((InternalEObject)elevation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION, null, msgs);
			if (newElevation != null)
				msgs = ((InternalEObject)newElevation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION, null, msgs);
			msgs = basicSetElevation(newElevation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION, newElevation, newElevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StringOrRefType newStatus, NotificationChain msgs) {
		StringOrRefType oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS, oldStatus, newStatus);
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
	public void setStatus(StringOrRefType newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getStatusReference() {
		return statusReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReference(ReferenceType newStatusReference, NotificationChain msgs) {
		ReferenceType oldStatusReference = statusReference;
		statusReference = newStatusReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE, oldStatusReference, newStatusReference);
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
	public void setStatusReference(ReferenceType newStatusReference) {
		if (newStatusReference != statusReference) {
			NotificationChain msgs = null;
			if (statusReference != null)
				msgs = ((InternalEObject)statusReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE, null, msgs);
			if (newStatusReference != null)
				msgs = ((InternalEObject)newStatusReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE, null, msgs);
			msgs = basicSetStatusReference(newStatusReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE, newStatusReference, newStatusReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION:
				return basicSetPosition(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS:
				return basicSetPos(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME:
				return basicSetLocationName(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE:
				return basicSetLocationReference(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_GROUP:
				return ((InternalEList<?>)getLocationGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED:
				return basicSetSpeed(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING:
				return basicSetBearing(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION:
				return basicSetAcceleration(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION:
				return basicSetElevation(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS:
				return basicSetStatus(null, msgs);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE:
				return basicSetStatusReference(null, msgs);
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
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION:
				return getPosition();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS:
				return getPos();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME:
				return getLocationName();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE:
				return getLocationReference();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_GROUP:
				if (coreType) return getLocationGroup();
				return ((FeatureMap.Internal)getLocationGroup()).getWrapper();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION:
				return getLocation();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED:
				return getSpeed();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING:
				return getBearing();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION:
				return getAcceleration();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION:
				return getElevation();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS:
				return getStatus();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE:
				return getStatusReference();
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
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION:
				setPosition((GeometryPropertyType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS:
				setPos((DirectPositionType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME:
				setLocationName((CodeType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE:
				setLocationReference((ReferenceType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_GROUP:
				((FeatureMap.Internal)getLocationGroup()).set(newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION:
				setLocation((LocationPropertyType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED:
				setSpeed((MeasureType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING:
				setBearing((DirectionPropertyType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION:
				setAcceleration((MeasureType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION:
				setElevation((MeasureType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS:
				setStatus((StringOrRefType)newValue);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE:
				setStatusReference((ReferenceType)newValue);
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
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION:
				setPosition((GeometryPropertyType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS:
				setPos((DirectPositionType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME:
				setLocationName((CodeType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE:
				setLocationReference((ReferenceType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_GROUP:
				getLocationGroup().clear();
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION:
				setLocation((LocationPropertyType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED:
				setSpeed((MeasureType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING:
				setBearing((DirectionPropertyType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION:
				setAcceleration((MeasureType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION:
				setElevation((MeasureType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS:
				setStatus((StringOrRefType)null);
				return;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE:
				setStatusReference((ReferenceType)null);
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
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POSITION:
				return position != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__POS:
				return pos != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_NAME:
				return locationName != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_REFERENCE:
				return locationReference != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION_GROUP:
				return locationGroup != null && !locationGroup.isEmpty();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__LOCATION:
				return getLocation() != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__SPEED:
				return speed != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__BEARING:
				return bearing != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ACCELERATION:
				return acceleration != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__ELEVATION:
				return elevation != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS:
				return status != null;
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE__STATUS_REFERENCE:
				return statusReference != null;
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
		result.append(" (locationGroup: ");
		result.append(locationGroup);
		result.append(')');
		return result.toString();
	}

} //MovingObjectStatusTypeImpl
