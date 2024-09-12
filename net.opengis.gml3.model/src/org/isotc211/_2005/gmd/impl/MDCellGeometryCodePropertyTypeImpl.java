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
import org.isotc211._2005.gmd.MDCellGeometryCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Cell Geometry Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCellGeometryCodePropertyTypeImpl#getMDCellGeometryCode <em>MD Cell Geometry Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDCellGeometryCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDCellGeometryCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements MDCellGeometryCodePropertyType {
	/**
	 * The cached value of the '{@link #getMDCellGeometryCode() <em>MD Cell Geometry Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDCellGeometryCode()
	 * @generated
	 * @ordered
	 */
	protected CodeListValueType mDCellGeometryCode;

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
	protected MDCellGeometryCodePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDCellGeometryCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDCellGeometryCode() {
		return mDCellGeometryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDCellGeometryCode(CodeListValueType newMDCellGeometryCode, NotificationChain msgs) {
		CodeListValueType oldMDCellGeometryCode = mDCellGeometryCode;
		mDCellGeometryCode = newMDCellGeometryCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE, oldMDCellGeometryCode, newMDCellGeometryCode);
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
	public void setMDCellGeometryCode(CodeListValueType newMDCellGeometryCode) {
		if (newMDCellGeometryCode != mDCellGeometryCode) {
			NotificationChain msgs = null;
			if (mDCellGeometryCode != null)
				msgs = ((InternalEObject)mDCellGeometryCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE, null, msgs);
			if (newMDCellGeometryCode != null)
				msgs = ((InternalEObject)newMDCellGeometryCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE, null, msgs);
			msgs = basicSetMDCellGeometryCode(newMDCellGeometryCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE, newMDCellGeometryCode, newMDCellGeometryCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE:
				return basicSetMDCellGeometryCode(null, msgs);
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
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE:
				return getMDCellGeometryCode();
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE:
				setMDCellGeometryCode((CodeListValueType)newValue);
				return;
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE:
				setMDCellGeometryCode((CodeListValueType)null);
				return;
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__MD_CELL_GEOMETRY_CODE:
				return mDCellGeometryCode != null;
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE__NIL_REASON:
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

} //MDCellGeometryCodePropertyTypeImpl
