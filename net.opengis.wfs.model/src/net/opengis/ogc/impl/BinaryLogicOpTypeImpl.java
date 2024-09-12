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
package net.opengis.ogc.impl;

import java.util.Collection;

import net.opengis.ogc.BinaryLogicOpType;
import net.opengis.ogc.ComparisonOpsType;
import net.opengis.ogc.FunctionType;
import net.opengis.ogc.LogicOpsType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.SpatialOpsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Logic Op Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryLogicOpTypeImpl extends LogicOpsTypeImpl implements BinaryLogicOpType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryLogicOpTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.BINARY_LOGIC_OP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OGCPackage.BINARY_LOGIC_OP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getComparisonOpsGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(OGCPackage.Literals.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComparisonOpsType> getComparisonOps() {
		return getComparisonOpsGroup().list(OGCPackage.Literals.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSpatialOpsGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(OGCPackage.Literals.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpatialOpsType> getSpatialOps() {
		return getSpatialOpsGroup().list(OGCPackage.Literals.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLogicOpsGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(OGCPackage.Literals.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicOpsType> getLogicOps() {
		return getLogicOpsGroup().list(OGCPackage.Literals.BINARY_LOGIC_OP_TYPE__LOGIC_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionType> getFunction() {
		return getGroup().list(OGCPackage.Literals.BINARY_LOGIC_OP_TYPE__FUNCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.BINARY_LOGIC_OP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				return ((InternalEList<?>)getComparisonOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return ((InternalEList<?>)getComparisonOps()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				return ((InternalEList<?>)getSpatialOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return ((InternalEList<?>)getSpatialOps()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				return ((InternalEList<?>)getLogicOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return ((InternalEList<?>)getLogicOps()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
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
			case OGCPackage.BINARY_LOGIC_OP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				if (coreType) return getComparisonOpsGroup();
				return ((FeatureMap.Internal)getComparisonOpsGroup()).getWrapper();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return getComparisonOps();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				if (coreType) return getSpatialOpsGroup();
				return ((FeatureMap.Internal)getSpatialOpsGroup()).getWrapper();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return getSpatialOps();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				if (coreType) return getLogicOpsGroup();
				return ((FeatureMap.Internal)getLogicOpsGroup()).getWrapper();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return getLogicOps();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				return getFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OGCPackage.BINARY_LOGIC_OP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				((FeatureMap.Internal)getComparisonOpsGroup()).set(newValue);
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				((FeatureMap.Internal)getSpatialOpsGroup()).set(newValue);
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				((FeatureMap.Internal)getLogicOpsGroup()).set(newValue);
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends FunctionType>)newValue);
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
			case OGCPackage.BINARY_LOGIC_OP_TYPE__GROUP:
				getGroup().clear();
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				getComparisonOpsGroup().clear();
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				getSpatialOpsGroup().clear();
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				getLogicOpsGroup().clear();
				return;
			case OGCPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				getFunction().clear();
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
			case OGCPackage.BINARY_LOGIC_OP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				return !getComparisonOpsGroup().isEmpty();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return !getComparisonOps().isEmpty();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				return !getSpatialOpsGroup().isEmpty();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return !getSpatialOps().isEmpty();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				return !getLogicOpsGroup().isEmpty();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return !getLogicOps().isEmpty();
			case OGCPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				return !getFunction().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //BinaryLogicOpTypeImpl
