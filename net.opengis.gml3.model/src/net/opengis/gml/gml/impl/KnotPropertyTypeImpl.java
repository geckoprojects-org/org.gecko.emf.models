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

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.KnotPropertyType;
import net.opengis.gml.gml.KnotType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knot Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.KnotPropertyTypeImpl#getKnot <em>Knot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnotPropertyTypeImpl extends MinimalEObjectImpl.Container implements KnotPropertyType {
	/**
	 * The cached value of the '{@link #getKnot() <em>Knot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnot()
	 * @generated
	 * @ordered
	 */
	protected KnotType knot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnotPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getKnotPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnotType getKnot() {
		return knot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnot(KnotType newKnot, NotificationChain msgs) {
		KnotType oldKnot = knot;
		knot = newKnot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.KNOT_PROPERTY_TYPE__KNOT, oldKnot, newKnot);
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
	public void setKnot(KnotType newKnot) {
		if (newKnot != knot) {
			NotificationChain msgs = null;
			if (knot != null)
				msgs = ((InternalEObject)knot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.KNOT_PROPERTY_TYPE__KNOT, null, msgs);
			if (newKnot != null)
				msgs = ((InternalEObject)newKnot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.KNOT_PROPERTY_TYPE__KNOT, null, msgs);
			msgs = basicSetKnot(newKnot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.KNOT_PROPERTY_TYPE__KNOT, newKnot, newKnot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.KNOT_PROPERTY_TYPE__KNOT:
				return basicSetKnot(null, msgs);
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
			case GMLPackage.KNOT_PROPERTY_TYPE__KNOT:
				return getKnot();
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
			case GMLPackage.KNOT_PROPERTY_TYPE__KNOT:
				setKnot((KnotType)newValue);
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
			case GMLPackage.KNOT_PROPERTY_TYPE__KNOT:
				setKnot((KnotType)null);
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
			case GMLPackage.KNOT_PROPERTY_TYPE__KNOT:
				return knot != null;
		}
		return super.eIsSet(featureID);
	}

} //KnotPropertyTypeImpl
