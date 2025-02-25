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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.Shape;
import org.openmicroscopy.ome.UnionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.UnionTypeImpl#getShapeGroupGroup <em>Shape Group Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.UnionTypeImpl#getShapeGroup <em>Shape Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnionTypeImpl extends MinimalEObjectImpl.Container implements UnionType {
	/**
	 * The cached value of the '{@link #getShapeGroupGroup() <em>Shape Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap shapeGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getUnionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getShapeGroupGroup() {
		if (shapeGroupGroup == null) {
			shapeGroupGroup = new BasicFeatureMap(this, OMEPackage.UNION_TYPE__SHAPE_GROUP_GROUP);
		}
		return shapeGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Shape> getShapeGroup() {
		return getShapeGroupGroup().list(OMEPackage.eINSTANCE.getUnionType_ShapeGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.UNION_TYPE__SHAPE_GROUP_GROUP:
				return ((InternalEList<?>)getShapeGroupGroup()).basicRemove(otherEnd, msgs);
			case OMEPackage.UNION_TYPE__SHAPE_GROUP:
				return ((InternalEList<?>)getShapeGroup()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.UNION_TYPE__SHAPE_GROUP_GROUP:
				if (coreType) return getShapeGroupGroup();
				return ((FeatureMap.Internal)getShapeGroupGroup()).getWrapper();
			case OMEPackage.UNION_TYPE__SHAPE_GROUP:
				return getShapeGroup();
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
			case OMEPackage.UNION_TYPE__SHAPE_GROUP_GROUP:
				((FeatureMap.Internal)getShapeGroupGroup()).set(newValue);
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
			case OMEPackage.UNION_TYPE__SHAPE_GROUP_GROUP:
				getShapeGroupGroup().clear();
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
			case OMEPackage.UNION_TYPE__SHAPE_GROUP_GROUP:
				return shapeGroupGroup != null && !shapeGroupGroup.isEmpty();
			case OMEPackage.UNION_TYPE__SHAPE_GROUP:
				return !getShapeGroup().isEmpty();
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
		result.append(" (shapeGroupGroup: ");
		result.append(shapeGroupGroup);
		result.append(')');
		return result.toString();
	}

} //UnionTypeImpl
