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

import net.opengis.gml.ArrayAssociationType;
import net.opengis.gml.GMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.ArrayAssociationTypeImpl#getObjectGroup <em>Object Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.ArrayAssociationTypeImpl#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayAssociationTypeImpl extends MinimalEObjectImpl.Container implements ArrayAssociationType {
	/**
	 * The cached value of the '{@link #getObjectGroup() <em>Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap objectGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getArrayAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getObjectGroup() {
		if (objectGroup == null) {
			objectGroup = new BasicFeatureMap(this, GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT_GROUP);
		}
		return objectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getObject() {
		return getObjectGroup().list(GMLPackage.eINSTANCE.getArrayAssociationType_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT_GROUP:
				return ((InternalEList<?>)getObjectGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT_GROUP:
				if (coreType) return getObjectGroup();
				return ((FeatureMap.Internal)getObjectGroup()).getWrapper();
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT:
				return getObject();
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
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT_GROUP:
				((FeatureMap.Internal)getObjectGroup()).set(newValue);
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
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT_GROUP:
				getObjectGroup().clear();
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
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT_GROUP:
				return objectGroup != null && !objectGroup.isEmpty();
			case GMLPackage.ARRAY_ASSOCIATION_TYPE__OBJECT:
				return !getObject().isEmpty();
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
		result.append(" (objectGroup: ");
		result.append(objectGroup);
		result.append(')');
		return result.toString();
	}

} //ArrayAssociationTypeImpl
