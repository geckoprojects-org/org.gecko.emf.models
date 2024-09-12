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

import org.isotc211._2005.gco.CodeListValueType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDMaintenanceFrequencyCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Maintenance Frequency Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceFrequencyCodePropertyTypeImpl#getMDMaintenanceFrequencyCode <em>MD Maintenance Frequency Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMaintenanceFrequencyCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDMaintenanceFrequencyCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements MDMaintenanceFrequencyCodePropertyType {
	/**
	 * The cached value of the '{@link #getMDMaintenanceFrequencyCode() <em>MD Maintenance Frequency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDMaintenanceFrequencyCode()
	 * @generated
	 * @ordered
	 */
	protected CodeListValueType mDMaintenanceFrequencyCode;

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
	protected MDMaintenanceFrequencyCodePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDMaintenanceFrequencyCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDMaintenanceFrequencyCode() {
		return mDMaintenanceFrequencyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMaintenanceFrequencyCode(CodeListValueType newMDMaintenanceFrequencyCode, NotificationChain msgs) {
		CodeListValueType oldMDMaintenanceFrequencyCode = mDMaintenanceFrequencyCode;
		mDMaintenanceFrequencyCode = newMDMaintenanceFrequencyCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE, oldMDMaintenanceFrequencyCode, newMDMaintenanceFrequencyCode);
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
	public void setMDMaintenanceFrequencyCode(CodeListValueType newMDMaintenanceFrequencyCode) {
		if (newMDMaintenanceFrequencyCode != mDMaintenanceFrequencyCode) {
			NotificationChain msgs = null;
			if (mDMaintenanceFrequencyCode != null)
				msgs = ((InternalEObject)mDMaintenanceFrequencyCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE, null, msgs);
			if (newMDMaintenanceFrequencyCode != null)
				msgs = ((InternalEObject)newMDMaintenanceFrequencyCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE, null, msgs);
			msgs = basicSetMDMaintenanceFrequencyCode(newMDMaintenanceFrequencyCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE, newMDMaintenanceFrequencyCode, newMDMaintenanceFrequencyCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE:
				return basicSetMDMaintenanceFrequencyCode(null, msgs);
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
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE:
				return getMDMaintenanceFrequencyCode();
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE:
				setMDMaintenanceFrequencyCode((CodeListValueType)newValue);
				return;
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE:
				setMDMaintenanceFrequencyCode((CodeListValueType)null);
				return;
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__MD_MAINTENANCE_FREQUENCY_CODE:
				return mDMaintenanceFrequencyCode != null;
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE__NIL_REASON:
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

} //MDMaintenanceFrequencyCodePropertyTypeImpl
