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
import org.isotc211._2005.gmd.MDMediumFormatCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Medium Format Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumFormatCodePropertyTypeImpl#getMDMediumFormatCode <em>MD Medium Format Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumFormatCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDMediumFormatCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements MDMediumFormatCodePropertyType {
	/**
	 * The cached value of the '{@link #getMDMediumFormatCode() <em>MD Medium Format Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDMediumFormatCode()
	 * @generated
	 * @ordered
	 */
	protected CodeListValueType mDMediumFormatCode;

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
	protected MDMediumFormatCodePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDMediumFormatCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDMediumFormatCode() {
		return mDMediumFormatCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMediumFormatCode(CodeListValueType newMDMediumFormatCode, NotificationChain msgs) {
		CodeListValueType oldMDMediumFormatCode = mDMediumFormatCode;
		mDMediumFormatCode = newMDMediumFormatCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE, oldMDMediumFormatCode, newMDMediumFormatCode);
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
	public void setMDMediumFormatCode(CodeListValueType newMDMediumFormatCode) {
		if (newMDMediumFormatCode != mDMediumFormatCode) {
			NotificationChain msgs = null;
			if (mDMediumFormatCode != null)
				msgs = ((InternalEObject)mDMediumFormatCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE, null, msgs);
			if (newMDMediumFormatCode != null)
				msgs = ((InternalEObject)newMDMediumFormatCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE, null, msgs);
			msgs = basicSetMDMediumFormatCode(newMDMediumFormatCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE, newMDMediumFormatCode, newMDMediumFormatCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE:
				return basicSetMDMediumFormatCode(null, msgs);
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
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE:
				return getMDMediumFormatCode();
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE:
				setMDMediumFormatCode((CodeListValueType)newValue);
				return;
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE:
				setMDMediumFormatCode((CodeListValueType)null);
				return;
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__MD_MEDIUM_FORMAT_CODE:
				return mDMediumFormatCode != null;
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE__NIL_REASON:
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

} //MDMediumFormatCodePropertyTypeImpl
