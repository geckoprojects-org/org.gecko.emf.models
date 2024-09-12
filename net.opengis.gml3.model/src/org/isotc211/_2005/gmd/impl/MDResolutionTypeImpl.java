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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211._2005.gco.DistancePropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDRepresentativeFractionPropertyType;
import org.isotc211._2005.gmd.MDResolutionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Resolution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDResolutionTypeImpl#getEquivalentScale <em>Equivalent Scale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDResolutionTypeImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDResolutionTypeImpl extends MinimalEObjectImpl.Container implements MDResolutionType {
	/**
	 * The cached value of the '{@link #getEquivalentScale() <em>Equivalent Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentScale()
	 * @generated
	 * @ordered
	 */
	protected MDRepresentativeFractionPropertyType equivalentScale;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected DistancePropertyType distance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDResolutionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDResolutionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRepresentativeFractionPropertyType getEquivalentScale() {
		return equivalentScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalentScale(MDRepresentativeFractionPropertyType newEquivalentScale, NotificationChain msgs) {
		MDRepresentativeFractionPropertyType oldEquivalentScale = equivalentScale;
		equivalentScale = newEquivalentScale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE, oldEquivalentScale, newEquivalentScale);
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
	public void setEquivalentScale(MDRepresentativeFractionPropertyType newEquivalentScale) {
		if (newEquivalentScale != equivalentScale) {
			NotificationChain msgs = null;
			if (equivalentScale != null)
				msgs = ((InternalEObject)equivalentScale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE, null, msgs);
			if (newEquivalentScale != null)
				msgs = ((InternalEObject)newEquivalentScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE, null, msgs);
			msgs = basicSetEquivalentScale(newEquivalentScale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE, newEquivalentScale, newEquivalentScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistancePropertyType getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(DistancePropertyType newDistance, NotificationChain msgs) {
		DistancePropertyType oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RESOLUTION_TYPE__DISTANCE, oldDistance, newDistance);
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
	public void setDistance(DistancePropertyType newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject)distance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RESOLUTION_TYPE__DISTANCE, null, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject)newDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RESOLUTION_TYPE__DISTANCE, null, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RESOLUTION_TYPE__DISTANCE, newDistance, newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE:
				return basicSetEquivalentScale(null, msgs);
			case GMDPackage.MD_RESOLUTION_TYPE__DISTANCE:
				return basicSetDistance(null, msgs);
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
			case GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE:
				return getEquivalentScale();
			case GMDPackage.MD_RESOLUTION_TYPE__DISTANCE:
				return getDistance();
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
			case GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE:
				setEquivalentScale((MDRepresentativeFractionPropertyType)newValue);
				return;
			case GMDPackage.MD_RESOLUTION_TYPE__DISTANCE:
				setDistance((DistancePropertyType)newValue);
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
			case GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE:
				setEquivalentScale((MDRepresentativeFractionPropertyType)null);
				return;
			case GMDPackage.MD_RESOLUTION_TYPE__DISTANCE:
				setDistance((DistancePropertyType)null);
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
			case GMDPackage.MD_RESOLUTION_TYPE__EQUIVALENT_SCALE:
				return equivalentScale != null;
			case GMDPackage.MD_RESOLUTION_TYPE__DISTANCE:
				return distance != null;
		}
		return super.eIsSet(featureID);
	}

} //MDResolutionTypeImpl
