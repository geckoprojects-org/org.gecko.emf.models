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
import org.isotc211._2005.gmd.MDObligationCodePropertyType;
import org.isotc211._2005.gmd.MDObligationCodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Obligation Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDObligationCodePropertyTypeImpl#getMDObligationCode <em>MD Obligation Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDObligationCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDObligationCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements MDObligationCodePropertyType {
	/**
	 * The default value of the '{@link #getMDObligationCode() <em>MD Obligation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDObligationCode()
	 * @generated
	 * @ordered
	 */
	protected static final MDObligationCodeType MD_OBLIGATION_CODE_EDEFAULT = MDObligationCodeType.MANDATORY;

	/**
	 * The cached value of the '{@link #getMDObligationCode() <em>MD Obligation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDObligationCode()
	 * @generated
	 * @ordered
	 */
	protected MDObligationCodeType mDObligationCode = MD_OBLIGATION_CODE_EDEFAULT;

	/**
	 * This is true if the MD Obligation Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mDObligationCodeESet;

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
	protected MDObligationCodePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDObligationCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDObligationCodeType getMDObligationCode() {
		return mDObligationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDObligationCode(MDObligationCodeType newMDObligationCode) {
		MDObligationCodeType oldMDObligationCode = mDObligationCode;
		mDObligationCode = newMDObligationCode == null ? MD_OBLIGATION_CODE_EDEFAULT : newMDObligationCode;
		boolean oldMDObligationCodeESet = mDObligationCodeESet;
		mDObligationCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__MD_OBLIGATION_CODE, oldMDObligationCode, mDObligationCode, !oldMDObligationCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMDObligationCode() {
		MDObligationCodeType oldMDObligationCode = mDObligationCode;
		boolean oldMDObligationCodeESet = mDObligationCodeESet;
		mDObligationCode = MD_OBLIGATION_CODE_EDEFAULT;
		mDObligationCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__MD_OBLIGATION_CODE, oldMDObligationCode, MD_OBLIGATION_CODE_EDEFAULT, oldMDObligationCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMDObligationCode() {
		return mDObligationCodeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__MD_OBLIGATION_CODE:
				return getMDObligationCode();
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__MD_OBLIGATION_CODE:
				setMDObligationCode((MDObligationCodeType)newValue);
				return;
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__MD_OBLIGATION_CODE:
				unsetMDObligationCode();
				return;
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__MD_OBLIGATION_CODE:
				return isSetMDObligationCode();
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE__NIL_REASON:
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
		result.append(" (mDObligationCode: ");
		if (mDObligationCodeESet) result.append(mDObligationCode); else result.append("<unset>");
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //MDObligationCodePropertyTypeImpl
