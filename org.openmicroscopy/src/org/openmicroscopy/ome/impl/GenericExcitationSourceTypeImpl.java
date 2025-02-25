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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openmicroscopy.ome.GenericExcitationSourceType;
import org.openmicroscopy.ome.Map;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Excitation Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.GenericExcitationSourceTypeImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericExcitationSourceTypeImpl extends LightSourceImpl implements GenericExcitationSourceType {
	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map map;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericExcitationSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getGenericExcitationSourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(Map newMap, NotificationChain msgs) {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP, oldMap, newMap);
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
	public void setMap(Map newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP, null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP, null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP:
				return basicSetMap(null, msgs);
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
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP:
				return getMap();
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
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP:
				setMap((Map)newValue);
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
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP:
				setMap((Map)null);
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
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE__MAP:
				return map != null;
		}
		return super.eIsSet(featureID);
	}

} //GenericExcitationSourceTypeImpl
