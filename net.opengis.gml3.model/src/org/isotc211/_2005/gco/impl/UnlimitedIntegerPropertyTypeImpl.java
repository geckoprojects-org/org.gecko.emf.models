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
package org.isotc211._2005.gco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211._2005.gco.GCOPackage;
import org.isotc211._2005.gco.UnlimitedIntegerPropertyType;
import org.isotc211._2005.gco.UnlimitedIntegerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unlimited Integer Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.UnlimitedIntegerPropertyTypeImpl#getUnlimitedInteger <em>Unlimited Integer</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.UnlimitedIntegerPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnlimitedIntegerPropertyTypeImpl extends MinimalEObjectImpl.Container implements UnlimitedIntegerPropertyType {
	/**
	 * The cached value of the '{@link #getUnlimitedInteger() <em>Unlimited Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlimitedInteger()
	 * @generated
	 * @ordered
	 */
	protected UnlimitedIntegerType unlimitedInteger;

	/**
	 * This is true if the Unlimited Integer containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unlimitedIntegerESet;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnlimitedIntegerPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.UNLIMITED_INTEGER_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlimitedIntegerType getUnlimitedInteger() {
		return unlimitedInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnlimitedInteger(UnlimitedIntegerType newUnlimitedInteger, NotificationChain msgs) {
		UnlimitedIntegerType oldUnlimitedInteger = unlimitedInteger;
		unlimitedInteger = newUnlimitedInteger;
		boolean oldUnlimitedIntegerESet = unlimitedIntegerESet;
		unlimitedIntegerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER, oldUnlimitedInteger, newUnlimitedInteger, !oldUnlimitedIntegerESet);
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
	public void setUnlimitedInteger(UnlimitedIntegerType newUnlimitedInteger) {
		if (newUnlimitedInteger != unlimitedInteger) {
			NotificationChain msgs = null;
			if (unlimitedInteger != null)
				msgs = ((InternalEObject)unlimitedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER, null, msgs);
			if (newUnlimitedInteger != null)
				msgs = ((InternalEObject)newUnlimitedInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER, null, msgs);
			msgs = basicSetUnlimitedInteger(newUnlimitedInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUnlimitedIntegerESet = unlimitedIntegerESet;
			unlimitedIntegerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER, newUnlimitedInteger, newUnlimitedInteger, !oldUnlimitedIntegerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUnlimitedInteger(NotificationChain msgs) {
		UnlimitedIntegerType oldUnlimitedInteger = unlimitedInteger;
		unlimitedInteger = null;
		boolean oldUnlimitedIntegerESet = unlimitedIntegerESet;
		unlimitedIntegerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER, oldUnlimitedInteger, null, oldUnlimitedIntegerESet);
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
	public void unsetUnlimitedInteger() {
		if (unlimitedInteger != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)unlimitedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER, null, msgs);
			msgs = basicUnsetUnlimitedInteger(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUnlimitedIntegerESet = unlimitedIntegerESet;
			unlimitedIntegerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER, null, null, oldUnlimitedIntegerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnlimitedInteger() {
		return unlimitedIntegerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER:
				return basicUnsetUnlimitedInteger(msgs);
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
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER:
				return getUnlimitedInteger();
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
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
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER:
				setUnlimitedInteger((UnlimitedIntegerType)newValue);
				return;
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
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
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER:
				unsetUnlimitedInteger();
				return;
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER:
				return isSetUnlimitedInteger();
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
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
		result.append(" (nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //UnlimitedIntegerPropertyTypeImpl
