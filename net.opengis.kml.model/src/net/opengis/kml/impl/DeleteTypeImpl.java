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

import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.DeleteType;
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
 * An implementation of the model object '<em><b>Delete Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.DeleteTypeImpl#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DeleteTypeImpl#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteTypeImpl extends MinimalEObjectImpl.Container implements DeleteType {
	/**
	 * The cached value of the '{@link #getAbstractFeatureGroupGroup() <em>Abstract Feature Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFeatureGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getDeleteType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureGroupGroup() {
		if (abstractFeatureGroupGroup == null) {
			abstractFeatureGroupGroup = new BasicFeatureMap(this, KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP_GROUP);
		}
		return abstractFeatureGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeatureType> getAbstractFeatureGroup() {
		return getAbstractFeatureGroupGroup().list(KMLPackage.eINSTANCE.getDeleteType_AbstractFeatureGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				if (coreType) return getAbstractFeatureGroupGroup();
				return ((FeatureMap.Internal)getAbstractFeatureGroupGroup()).getWrapper();
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP:
				return getAbstractFeatureGroup();
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
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractFeatureGroupGroup()).set(newValue);
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
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				getAbstractFeatureGroupGroup().clear();
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
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return abstractFeatureGroupGroup != null && !abstractFeatureGroupGroup.isEmpty();
			case KMLPackage.DELETE_TYPE__ABSTRACT_FEATURE_GROUP:
				return !getAbstractFeatureGroup().isEmpty();
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
		result.append(" (abstractFeatureGroupGroup: ");
		result.append(abstractFeatureGroupGroup);
		result.append(')');
		return result.toString();
	}

} //DeleteTypeImpl
