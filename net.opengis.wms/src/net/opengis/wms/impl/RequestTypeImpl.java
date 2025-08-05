/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms.impl;

import net.opengis.wms.OperationType;
import net.opengis.wms.RequestType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.RequestTypeImpl#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.impl.RequestTypeImpl#getGetMap <em>Get Map</em>}</li>
 *   <li>{@link net.opengis.wms.impl.RequestTypeImpl#getGetFeatureInfo <em>Get Feature Info</em>}</li>
 *   <li>{@link net.opengis.wms.impl.RequestTypeImpl#getExtendedOperationGroup <em>Extended Operation Group</em>}</li>
 *   <li>{@link net.opengis.wms.impl.RequestTypeImpl#getExtendedOperation <em>Extended Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestTypeImpl extends MinimalEObjectImpl.Container implements RequestType {
	/**
	 * The cached value of the '{@link #getGetCapabilities() <em>Get Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetCapabilities()
	 * @generated
	 * @ordered
	 */
	protected OperationType getCapabilities;

	/**
	 * The cached value of the '{@link #getGetMap() <em>Get Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetMap()
	 * @generated
	 * @ordered
	 */
	protected OperationType getMap;

	/**
	 * The cached value of the '{@link #getGetFeatureInfo() <em>Get Feature Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetFeatureInfo()
	 * @generated
	 * @ordered
	 */
	protected OperationType getFeatureInfo;

	/**
	 * The cached value of the '{@link #getExtendedOperationGroup() <em>Extended Operation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedOperationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap extendedOperationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.REQUEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getGetCapabilities() {
		return getCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCapabilities(OperationType newGetCapabilities, NotificationChain msgs) {
		OperationType oldGetCapabilities = getCapabilities;
		getCapabilities = newGetCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.REQUEST_TYPE__GET_CAPABILITIES, oldGetCapabilities, newGetCapabilities);
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
	public void setGetCapabilities(OperationType newGetCapabilities) {
		if (newGetCapabilities != getCapabilities) {
			NotificationChain msgs = null;
			if (getCapabilities != null)
				msgs = ((InternalEObject)getCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.REQUEST_TYPE__GET_CAPABILITIES, null, msgs);
			if (newGetCapabilities != null)
				msgs = ((InternalEObject)newGetCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.REQUEST_TYPE__GET_CAPABILITIES, null, msgs);
			msgs = basicSetGetCapabilities(newGetCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.REQUEST_TYPE__GET_CAPABILITIES, newGetCapabilities, newGetCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getGetMap() {
		return getMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetMap(OperationType newGetMap, NotificationChain msgs) {
		OperationType oldGetMap = getMap;
		getMap = newGetMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.REQUEST_TYPE__GET_MAP, oldGetMap, newGetMap);
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
	public void setGetMap(OperationType newGetMap) {
		if (newGetMap != getMap) {
			NotificationChain msgs = null;
			if (getMap != null)
				msgs = ((InternalEObject)getMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.REQUEST_TYPE__GET_MAP, null, msgs);
			if (newGetMap != null)
				msgs = ((InternalEObject)newGetMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.REQUEST_TYPE__GET_MAP, null, msgs);
			msgs = basicSetGetMap(newGetMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.REQUEST_TYPE__GET_MAP, newGetMap, newGetMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getGetFeatureInfo() {
		return getFeatureInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetFeatureInfo(OperationType newGetFeatureInfo, NotificationChain msgs) {
		OperationType oldGetFeatureInfo = getFeatureInfo;
		getFeatureInfo = newGetFeatureInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO, oldGetFeatureInfo, newGetFeatureInfo);
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
	public void setGetFeatureInfo(OperationType newGetFeatureInfo) {
		if (newGetFeatureInfo != getFeatureInfo) {
			NotificationChain msgs = null;
			if (getFeatureInfo != null)
				msgs = ((InternalEObject)getFeatureInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO, null, msgs);
			if (newGetFeatureInfo != null)
				msgs = ((InternalEObject)newGetFeatureInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO, null, msgs);
			msgs = basicSetGetFeatureInfo(newGetFeatureInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO, newGetFeatureInfo, newGetFeatureInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExtendedOperationGroup() {
		if (extendedOperationGroup == null) {
			extendedOperationGroup = new BasicFeatureMap(this, WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION_GROUP);
		}
		return extendedOperationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationType> getExtendedOperation() {
		return getExtendedOperationGroup().list(WMSPackage.Literals.REQUEST_TYPE__EXTENDED_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.REQUEST_TYPE__GET_CAPABILITIES:
				return basicSetGetCapabilities(null, msgs);
			case WMSPackage.REQUEST_TYPE__GET_MAP:
				return basicSetGetMap(null, msgs);
			case WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO:
				return basicSetGetFeatureInfo(null, msgs);
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION_GROUP:
				return ((InternalEList<?>)getExtendedOperationGroup()).basicRemove(otherEnd, msgs);
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION:
				return ((InternalEList<?>)getExtendedOperation()).basicRemove(otherEnd, msgs);
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
			case WMSPackage.REQUEST_TYPE__GET_CAPABILITIES:
				return getGetCapabilities();
			case WMSPackage.REQUEST_TYPE__GET_MAP:
				return getGetMap();
			case WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO:
				return getGetFeatureInfo();
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION_GROUP:
				if (coreType) return getExtendedOperationGroup();
				return ((FeatureMap.Internal)getExtendedOperationGroup()).getWrapper();
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION:
				return getExtendedOperation();
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
			case WMSPackage.REQUEST_TYPE__GET_CAPABILITIES:
				setGetCapabilities((OperationType)newValue);
				return;
			case WMSPackage.REQUEST_TYPE__GET_MAP:
				setGetMap((OperationType)newValue);
				return;
			case WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO:
				setGetFeatureInfo((OperationType)newValue);
				return;
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION_GROUP:
				((FeatureMap.Internal)getExtendedOperationGroup()).set(newValue);
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
			case WMSPackage.REQUEST_TYPE__GET_CAPABILITIES:
				setGetCapabilities((OperationType)null);
				return;
			case WMSPackage.REQUEST_TYPE__GET_MAP:
				setGetMap((OperationType)null);
				return;
			case WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO:
				setGetFeatureInfo((OperationType)null);
				return;
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION_GROUP:
				getExtendedOperationGroup().clear();
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
			case WMSPackage.REQUEST_TYPE__GET_CAPABILITIES:
				return getCapabilities != null;
			case WMSPackage.REQUEST_TYPE__GET_MAP:
				return getMap != null;
			case WMSPackage.REQUEST_TYPE__GET_FEATURE_INFO:
				return getFeatureInfo != null;
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION_GROUP:
				return extendedOperationGroup != null && !extendedOperationGroup.isEmpty();
			case WMSPackage.REQUEST_TYPE__EXTENDED_OPERATION:
				return !getExtendedOperation().isEmpty();
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
		result.append(" (extendedOperationGroup: ");
		result.append(extendedOperationGroup);
		result.append(')');
		return result.toString();
	}

} //RequestTypeImpl
