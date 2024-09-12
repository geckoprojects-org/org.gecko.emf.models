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
import net.opengis.kml.ChangeType;
import net.opengis.kml.KMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ChangeTypeImpl#getAbstractObjectGroupGroup <em>Abstract Object Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ChangeTypeImpl#getAbstractObjectGroup <em>Abstract Object Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeTypeImpl extends MinimalEObjectImpl.Container implements ChangeType {
	/**
	 * The cached value of the '{@link #getAbstractObjectGroupGroup() <em>Abstract Object Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractObjectGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractObjectGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getChangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractObjectGroupGroup() {
		if (abstractObjectGroupGroup == null) {
			abstractObjectGroupGroup = new BasicFeatureMap(this, KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP_GROUP);
		}
		return abstractObjectGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractObjectGroup() {
		return getAbstractObjectGroupGroup().list(KMLPackage.eINSTANCE.getChangeType_AbstractObjectGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractObjectGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP:
				return ((InternalEList<?>)getAbstractObjectGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP_GROUP:
				if (coreType) return getAbstractObjectGroupGroup();
				return ((FeatureMap.Internal)getAbstractObjectGroupGroup()).getWrapper();
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP:
				return getAbstractObjectGroup();
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
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractObjectGroupGroup()).set(newValue);
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
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP_GROUP:
				getAbstractObjectGroupGroup().clear();
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
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP_GROUP:
				return abstractObjectGroupGroup != null && !abstractObjectGroupGroup.isEmpty();
			case KMLPackage.CHANGE_TYPE__ABSTRACT_OBJECT_GROUP:
				return !getAbstractObjectGroup().isEmpty();
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
		result.append(" (abstractObjectGroupGroup: ");
		result.append(abstractObjectGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ChangeTypeImpl
