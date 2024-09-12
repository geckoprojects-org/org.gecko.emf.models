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
package net.opengis.wfs.impl;

import net.opengis.wfs.NativeType;
import net.opengis.wfs.WFSPackage;

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
 * An implementation of the model object '<em><b>Native Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.NativeTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.NativeTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.NativeTypeImpl#isSafeToIgnore <em>Safe To Ignore</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.NativeTypeImpl#getVendorId <em>Vendor Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NativeTypeImpl extends AbstractTransactionActionTypeImpl implements NativeType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #isSafeToIgnore() <em>Safe To Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeToIgnore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFE_TO_IGNORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafeToIgnore() <em>Safe To Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafeToIgnore()
	 * @generated
	 * @ordered
	 */
	protected boolean safeToIgnore = SAFE_TO_IGNORE_EDEFAULT;

	/**
	 * This is true if the Safe To Ignore attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean safeToIgnoreESet;

	/**
	 * The default value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected String vendorId = VENDOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NativeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.NATIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, WFSPackage.NATIVE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(WFSPackage.Literals.NATIVE_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSafeToIgnore() {
		return safeToIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSafeToIgnore(boolean newSafeToIgnore) {
		boolean oldSafeToIgnore = safeToIgnore;
		safeToIgnore = newSafeToIgnore;
		boolean oldSafeToIgnoreESet = safeToIgnoreESet;
		safeToIgnoreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.NATIVE_TYPE__SAFE_TO_IGNORE, oldSafeToIgnore, safeToIgnore, !oldSafeToIgnoreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSafeToIgnore() {
		boolean oldSafeToIgnore = safeToIgnore;
		boolean oldSafeToIgnoreESet = safeToIgnoreESet;
		safeToIgnore = SAFE_TO_IGNORE_EDEFAULT;
		safeToIgnoreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.NATIVE_TYPE__SAFE_TO_IGNORE, oldSafeToIgnore, SAFE_TO_IGNORE_EDEFAULT, oldSafeToIgnoreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSafeToIgnore() {
		return safeToIgnoreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorId() {
		return vendorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorId(String newVendorId) {
		String oldVendorId = vendorId;
		vendorId = newVendorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.NATIVE_TYPE__VENDOR_ID, oldVendorId, vendorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.NATIVE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case WFSPackage.NATIVE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case WFSPackage.NATIVE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case WFSPackage.NATIVE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case WFSPackage.NATIVE_TYPE__SAFE_TO_IGNORE:
				return isSafeToIgnore();
			case WFSPackage.NATIVE_TYPE__VENDOR_ID:
				return getVendorId();
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
			case WFSPackage.NATIVE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case WFSPackage.NATIVE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case WFSPackage.NATIVE_TYPE__SAFE_TO_IGNORE:
				setSafeToIgnore((Boolean)newValue);
				return;
			case WFSPackage.NATIVE_TYPE__VENDOR_ID:
				setVendorId((String)newValue);
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
			case WFSPackage.NATIVE_TYPE__MIXED:
				getMixed().clear();
				return;
			case WFSPackage.NATIVE_TYPE__ANY:
				getAny().clear();
				return;
			case WFSPackage.NATIVE_TYPE__SAFE_TO_IGNORE:
				unsetSafeToIgnore();
				return;
			case WFSPackage.NATIVE_TYPE__VENDOR_ID:
				setVendorId(VENDOR_ID_EDEFAULT);
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
			case WFSPackage.NATIVE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case WFSPackage.NATIVE_TYPE__ANY:
				return !getAny().isEmpty();
			case WFSPackage.NATIVE_TYPE__SAFE_TO_IGNORE:
				return isSetSafeToIgnore();
			case WFSPackage.NATIVE_TYPE__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorId != null : !VENDOR_ID_EDEFAULT.equals(vendorId);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", safeToIgnore: ");
		if (safeToIgnoreESet) result.append(safeToIgnore); else result.append("<unset>");
		result.append(", vendorId: ");
		result.append(vendorId);
		result.append(')');
		return result.toString();
	}

} //NativeTypeImpl
