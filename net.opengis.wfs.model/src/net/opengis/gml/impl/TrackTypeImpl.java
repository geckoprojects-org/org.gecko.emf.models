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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.MovingObjectStatusType;
import net.opengis.gml.TrackType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TrackTypeImpl#getMovingObjectStatus <em>Moving Object Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackTypeImpl extends HistoryPropertyTypeImpl implements TrackType {
	/**
	 * The cached value of the '{@link #getMovingObjectStatus() <em>Moving Object Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovingObjectStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<MovingObjectStatusType> movingObjectStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTrackType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MovingObjectStatusType> getMovingObjectStatus() {
		if (movingObjectStatus == null) {
			movingObjectStatus = new EObjectContainmentEList<MovingObjectStatusType>(MovingObjectStatusType.class, this, GMLPackage.TRACK_TYPE__MOVING_OBJECT_STATUS);
		}
		return movingObjectStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TRACK_TYPE__MOVING_OBJECT_STATUS:
				return ((InternalEList<?>)getMovingObjectStatus()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.TRACK_TYPE__MOVING_OBJECT_STATUS:
				return getMovingObjectStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMLPackage.TRACK_TYPE__MOVING_OBJECT_STATUS:
				getMovingObjectStatus().clear();
				getMovingObjectStatus().addAll((Collection<? extends MovingObjectStatusType>)newValue);
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
			case GMLPackage.TRACK_TYPE__MOVING_OBJECT_STATUS:
				getMovingObjectStatus().clear();
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
			case GMLPackage.TRACK_TYPE__MOVING_OBJECT_STATUS:
				return movingObjectStatus != null && !movingObjectStatus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrackTypeImpl
