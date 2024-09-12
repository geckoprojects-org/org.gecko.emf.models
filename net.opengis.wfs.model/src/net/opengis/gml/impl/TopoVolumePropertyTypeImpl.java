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
package net.opengis.gml.impl;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.TopoVolumePropertyType;
import net.opengis.gml.TopoVolumeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Volume Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoVolumePropertyTypeImpl#getTopoVolume <em>Topo Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoVolumePropertyTypeImpl extends MinimalEObjectImpl.Container implements TopoVolumePropertyType {
	/**
	 * The cached value of the '{@link #getTopoVolume() <em>Topo Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopoVolume()
	 * @generated
	 * @ordered
	 */
	protected TopoVolumeType topoVolume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoVolumePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoVolumePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoVolumeType getTopoVolume() {
		return topoVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoVolume(TopoVolumeType newTopoVolume, NotificationChain msgs) {
		TopoVolumeType oldTopoVolume = topoVolume;
		topoVolume = newTopoVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, oldTopoVolume, newTopoVolume);
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
	public void setTopoVolume(TopoVolumeType newTopoVolume) {
		if (newTopoVolume != topoVolume) {
			NotificationChain msgs = null;
			if (topoVolume != null)
				msgs = ((InternalEObject)topoVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, null, msgs);
			if (newTopoVolume != null)
				msgs = ((InternalEObject)newTopoVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, null, msgs);
			msgs = basicSetTopoVolume(newTopoVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, newTopoVolume, newTopoVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				return basicSetTopoVolume(null, msgs);
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
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				return getTopoVolume();
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
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)newValue);
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
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)null);
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
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				return topoVolume != null;
		}
		return super.eIsSet(featureID);
	}

} //TopoVolumePropertyTypeImpl
