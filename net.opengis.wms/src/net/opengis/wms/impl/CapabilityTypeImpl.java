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

import net.opengis.wms.CapabilityType;
import net.opengis.wms.ExceptionType;
import net.opengis.wms.LayerType;
import net.opengis.wms.RequestType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.CapabilityTypeImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link net.opengis.wms.impl.CapabilityTypeImpl#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.wms.impl.CapabilityTypeImpl#getExtendedCapabilitiesGroup <em>Extended Capabilities Group</em>}</li>
 *   <li>{@link net.opengis.wms.impl.CapabilityTypeImpl#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.impl.CapabilityTypeImpl#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityTypeImpl extends MinimalEObjectImpl.Container implements CapabilityType {
	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected RequestType request;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected ExceptionType exception;

	/**
	 * The cached value of the '{@link #getExtendedCapabilitiesGroup() <em>Extended Capabilities Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCapabilitiesGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap extendedCapabilitiesGroup;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected LayerType layer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.CAPABILITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestType getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(RequestType newRequest, NotificationChain msgs) {
		RequestType oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.CAPABILITY_TYPE__REQUEST, oldRequest, newRequest);
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
	public void setRequest(RequestType newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CAPABILITY_TYPE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CAPABILITY_TYPE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CAPABILITY_TYPE__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionType getException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(ExceptionType newException, NotificationChain msgs) {
		ExceptionType oldException = exception;
		exception = newException;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.CAPABILITY_TYPE__EXCEPTION, oldException, newException);
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
	public void setException(ExceptionType newException) {
		if (newException != exception) {
			NotificationChain msgs = null;
			if (exception != null)
				msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CAPABILITY_TYPE__EXCEPTION, null, msgs);
			if (newException != null)
				msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CAPABILITY_TYPE__EXCEPTION, null, msgs);
			msgs = basicSetException(newException, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CAPABILITY_TYPE__EXCEPTION, newException, newException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExtendedCapabilitiesGroup() {
		if (extendedCapabilitiesGroup == null) {
			extendedCapabilitiesGroup = new BasicFeatureMap(this, WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP);
		}
		return extendedCapabilitiesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getExtendedCapabilities() {
		return getExtendedCapabilitiesGroup().list(WMSPackage.Literals.CAPABILITY_TYPE__EXTENDED_CAPABILITIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerType getLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayer(LayerType newLayer, NotificationChain msgs) {
		LayerType oldLayer = layer;
		layer = newLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.CAPABILITY_TYPE__LAYER, oldLayer, newLayer);
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
	public void setLayer(LayerType newLayer) {
		if (newLayer != layer) {
			NotificationChain msgs = null;
			if (layer != null)
				msgs = ((InternalEObject)layer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CAPABILITY_TYPE__LAYER, null, msgs);
			if (newLayer != null)
				msgs = ((InternalEObject)newLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CAPABILITY_TYPE__LAYER, null, msgs);
			msgs = basicSetLayer(newLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CAPABILITY_TYPE__LAYER, newLayer, newLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.CAPABILITY_TYPE__REQUEST:
				return basicSetRequest(null, msgs);
			case WMSPackage.CAPABILITY_TYPE__EXCEPTION:
				return basicSetException(null, msgs);
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP:
				return ((InternalEList<?>)getExtendedCapabilitiesGroup()).basicRemove(otherEnd, msgs);
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES:
				return ((InternalEList<?>)getExtendedCapabilities()).basicRemove(otherEnd, msgs);
			case WMSPackage.CAPABILITY_TYPE__LAYER:
				return basicSetLayer(null, msgs);
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
			case WMSPackage.CAPABILITY_TYPE__REQUEST:
				return getRequest();
			case WMSPackage.CAPABILITY_TYPE__EXCEPTION:
				return getException();
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP:
				if (coreType) return getExtendedCapabilitiesGroup();
				return ((FeatureMap.Internal)getExtendedCapabilitiesGroup()).getWrapper();
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES:
				return getExtendedCapabilities();
			case WMSPackage.CAPABILITY_TYPE__LAYER:
				return getLayer();
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
			case WMSPackage.CAPABILITY_TYPE__REQUEST:
				setRequest((RequestType)newValue);
				return;
			case WMSPackage.CAPABILITY_TYPE__EXCEPTION:
				setException((ExceptionType)newValue);
				return;
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP:
				((FeatureMap.Internal)getExtendedCapabilitiesGroup()).set(newValue);
				return;
			case WMSPackage.CAPABILITY_TYPE__LAYER:
				setLayer((LayerType)newValue);
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
			case WMSPackage.CAPABILITY_TYPE__REQUEST:
				setRequest((RequestType)null);
				return;
			case WMSPackage.CAPABILITY_TYPE__EXCEPTION:
				setException((ExceptionType)null);
				return;
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP:
				getExtendedCapabilitiesGroup().clear();
				return;
			case WMSPackage.CAPABILITY_TYPE__LAYER:
				setLayer((LayerType)null);
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
			case WMSPackage.CAPABILITY_TYPE__REQUEST:
				return request != null;
			case WMSPackage.CAPABILITY_TYPE__EXCEPTION:
				return exception != null;
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES_GROUP:
				return extendedCapabilitiesGroup != null && !extendedCapabilitiesGroup.isEmpty();
			case WMSPackage.CAPABILITY_TYPE__EXTENDED_CAPABILITIES:
				return !getExtendedCapabilities().isEmpty();
			case WMSPackage.CAPABILITY_TYPE__LAYER:
				return layer != null;
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
		result.append(" (extendedCapabilitiesGroup: ");
		result.append(extendedCapabilitiesGroup);
		result.append(')');
		return result.toString();
	}

} //CapabilityTypeImpl
