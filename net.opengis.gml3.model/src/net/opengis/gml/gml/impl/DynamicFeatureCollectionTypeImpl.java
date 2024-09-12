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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.DynamicFeatureCollectionType;
import net.opengis.gml.gml.DynamicFeatureMemberType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.DynamicFeatureCollectionTypeImpl#getDynamicMembers <em>Dynamic Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicFeatureCollectionTypeImpl extends DynamicFeatureTypeImpl implements DynamicFeatureCollectionType {
	/**
	 * The cached value of the '{@link #getDynamicMembers() <em>Dynamic Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicMembers()
	 * @generated
	 * @ordered
	 */
	protected DynamicFeatureMemberType dynamicMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicFeatureCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDynamicFeatureCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFeatureMemberType getDynamicMembers() {
		return dynamicMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicMembers(DynamicFeatureMemberType newDynamicMembers, NotificationChain msgs) {
		DynamicFeatureMemberType oldDynamicMembers = dynamicMembers;
		dynamicMembers = newDynamicMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS, oldDynamicMembers, newDynamicMembers);
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
	public void setDynamicMembers(DynamicFeatureMemberType newDynamicMembers) {
		if (newDynamicMembers != dynamicMembers) {
			NotificationChain msgs = null;
			if (dynamicMembers != null)
				msgs = ((InternalEObject)dynamicMembers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS, null, msgs);
			if (newDynamicMembers != null)
				msgs = ((InternalEObject)newDynamicMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS, null, msgs);
			msgs = basicSetDynamicMembers(newDynamicMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS, newDynamicMembers, newDynamicMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS:
				return basicSetDynamicMembers(null, msgs);
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
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS:
				return getDynamicMembers();
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
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS:
				setDynamicMembers((DynamicFeatureMemberType)newValue);
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
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS:
				setDynamicMembers((DynamicFeatureMemberType)null);
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
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE__DYNAMIC_MEMBERS:
				return dynamicMembers != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicFeatureCollectionTypeImpl
