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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDPixelOrientationCodePropertyType;
import org.isotc211._2005.gmd.MDPixelOrientationCodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Pixel Orientation Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDPixelOrientationCodePropertyTypeImpl#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDPixelOrientationCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDPixelOrientationCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements MDPixelOrientationCodePropertyType {
	/**
	 * The default value of the '{@link #getMDPixelOrientationCode() <em>MD Pixel Orientation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDPixelOrientationCode()
	 * @generated
	 * @ordered
	 */
	protected static final MDPixelOrientationCodeType MD_PIXEL_ORIENTATION_CODE_EDEFAULT = MDPixelOrientationCodeType.CENTER;

	/**
	 * The cached value of the '{@link #getMDPixelOrientationCode() <em>MD Pixel Orientation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDPixelOrientationCode()
	 * @generated
	 * @ordered
	 */
	protected MDPixelOrientationCodeType mDPixelOrientationCode = MD_PIXEL_ORIENTATION_CODE_EDEFAULT;

	/**
	 * This is true if the MD Pixel Orientation Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mDPixelOrientationCodeESet;

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
	protected MDPixelOrientationCodePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDPixelOrientationCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDPixelOrientationCodeType getMDPixelOrientationCode() {
		return mDPixelOrientationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDPixelOrientationCode(MDPixelOrientationCodeType newMDPixelOrientationCode) {
		MDPixelOrientationCodeType oldMDPixelOrientationCode = mDPixelOrientationCode;
		mDPixelOrientationCode = newMDPixelOrientationCode == null ? MD_PIXEL_ORIENTATION_CODE_EDEFAULT : newMDPixelOrientationCode;
		boolean oldMDPixelOrientationCodeESet = mDPixelOrientationCodeESet;
		mDPixelOrientationCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__MD_PIXEL_ORIENTATION_CODE, oldMDPixelOrientationCode, mDPixelOrientationCode, !oldMDPixelOrientationCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMDPixelOrientationCode() {
		MDPixelOrientationCodeType oldMDPixelOrientationCode = mDPixelOrientationCode;
		boolean oldMDPixelOrientationCodeESet = mDPixelOrientationCodeESet;
		mDPixelOrientationCode = MD_PIXEL_ORIENTATION_CODE_EDEFAULT;
		mDPixelOrientationCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__MD_PIXEL_ORIENTATION_CODE, oldMDPixelOrientationCode, MD_PIXEL_ORIENTATION_CODE_EDEFAULT, oldMDPixelOrientationCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMDPixelOrientationCode() {
		return mDPixelOrientationCodeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__MD_PIXEL_ORIENTATION_CODE:
				return getMDPixelOrientationCode();
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__MD_PIXEL_ORIENTATION_CODE:
				setMDPixelOrientationCode((MDPixelOrientationCodeType)newValue);
				return;
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__MD_PIXEL_ORIENTATION_CODE:
				unsetMDPixelOrientationCode();
				return;
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__MD_PIXEL_ORIENTATION_CODE:
				return isSetMDPixelOrientationCode();
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
		result.append(" (mDPixelOrientationCode: ");
		if (mDPixelOrientationCodeESet) result.append(mDPixelOrientationCode); else result.append("<unset>");
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //MDPixelOrientationCodePropertyTypeImpl
