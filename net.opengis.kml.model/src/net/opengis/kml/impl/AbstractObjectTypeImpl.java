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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;

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
 * An implementation of the model object '<em><b>Abstract Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractObjectTypeImpl#getObjectSimpleExtensionGroupGroup <em>Object Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractObjectTypeImpl#getObjectSimpleExtensionGroup <em>Object Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractObjectTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractObjectTypeImpl#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractObjectTypeImpl extends MinimalEObjectImpl.Container implements AbstractObjectType {
	/**
	 * The cached value of the '{@link #getObjectSimpleExtensionGroupGroup() <em>Object Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap objectSimpleExtensionGroupGroup;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected String targetId = TARGET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractObjectType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getObjectSimpleExtensionGroupGroup() {
		if (objectSimpleExtensionGroupGroup == null) {
			objectSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return objectSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getObjectSimpleExtensionGroup() {
		return getObjectSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractObjectType_ObjectSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_OBJECT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetId(String newTargetId) {
		String oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_OBJECT_TYPE__TARGET_ID, oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getObjectSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getObjectSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getObjectSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP:
				return getObjectSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_OBJECT_TYPE__ID:
				return getId();
			case KMLPackage.ABSTRACT_OBJECT_TYPE__TARGET_ID:
				return getTargetId();
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
			case KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getObjectSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_OBJECT_TYPE__ID:
				setId((String)newValue);
				return;
			case KMLPackage.ABSTRACT_OBJECT_TYPE__TARGET_ID:
				setTargetId((String)newValue);
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
			case KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP:
				getObjectSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_OBJECT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case KMLPackage.ABSTRACT_OBJECT_TYPE__TARGET_ID:
				setTargetId(TARGET_ID_EDEFAULT);
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
			case KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP:
				return objectSimpleExtensionGroupGroup != null && !objectSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP:
				return !getObjectSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_OBJECT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case KMLPackage.ABSTRACT_OBJECT_TYPE__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? targetId != null : !TARGET_ID_EDEFAULT.equals(targetId);
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
		result.append(" (objectSimpleExtensionGroupGroup: ");
		result.append(objectSimpleExtensionGroupGroup);
		result.append(", id: ");
		result.append(id);
		result.append(", targetId: ");
		result.append(targetId);
		result.append(')');
		return result.toString();
	}

} //AbstractObjectTypeImpl
