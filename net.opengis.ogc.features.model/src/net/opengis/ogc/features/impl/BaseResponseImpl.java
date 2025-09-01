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
package net.opengis.ogc.features.impl;

import net.opengis.ogc.features.BaseResponse;
import net.opengis.ogc.features.OGCFeaturesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.impl.BaseResponseImpl#getService <em>Service</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.BaseResponseImpl#getUpdateSequence <em>Update Sequence</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.BaseResponseImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseResponseImpl extends MinimalEObjectImpl.Container implements BaseResponse {
	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected String service = SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateSequence() <em>Update Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateSequence() <em>Update Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSequence()
	 * @generated
	 * @ordered
	 */
	protected String updateSequence = UPDATE_SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCFeaturesPackage.Literals.BASE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(String newService) {
		String oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.BASE_RESPONSE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdateSequence() {
		return updateSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateSequence(String newUpdateSequence) {
		String oldUpdateSequence = updateSequence;
		updateSequence = newUpdateSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.BASE_RESPONSE__UPDATE_SEQUENCE, oldUpdateSequence, updateSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.BASE_RESPONSE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OGCFeaturesPackage.BASE_RESPONSE__SERVICE:
				return getService();
			case OGCFeaturesPackage.BASE_RESPONSE__UPDATE_SEQUENCE:
				return getUpdateSequence();
			case OGCFeaturesPackage.BASE_RESPONSE__VERSION:
				return getVersion();
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
			case OGCFeaturesPackage.BASE_RESPONSE__SERVICE:
				setService((String)newValue);
				return;
			case OGCFeaturesPackage.BASE_RESPONSE__UPDATE_SEQUENCE:
				setUpdateSequence((String)newValue);
				return;
			case OGCFeaturesPackage.BASE_RESPONSE__VERSION:
				setVersion((String)newValue);
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
			case OGCFeaturesPackage.BASE_RESPONSE__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case OGCFeaturesPackage.BASE_RESPONSE__UPDATE_SEQUENCE:
				setUpdateSequence(UPDATE_SEQUENCE_EDEFAULT);
				return;
			case OGCFeaturesPackage.BASE_RESPONSE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case OGCFeaturesPackage.BASE_RESPONSE__SERVICE:
				return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
			case OGCFeaturesPackage.BASE_RESPONSE__UPDATE_SEQUENCE:
				return UPDATE_SEQUENCE_EDEFAULT == null ? updateSequence != null : !UPDATE_SEQUENCE_EDEFAULT.equals(updateSequence);
			case OGCFeaturesPackage.BASE_RESPONSE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (service: ");
		result.append(service);
		result.append(", updateSequence: ");
		result.append(updateSequence);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //BaseResponseImpl
