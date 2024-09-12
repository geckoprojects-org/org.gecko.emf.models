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
package net.opengis.fes.impl;

import java.util.Collection;

import net.opengis.fes.AbstractIdType;
import net.opengis.fes.BinaryLogicOpType;
import net.opengis.fes.ComparisonOpsType;
import net.opengis.fes.ExtensionOpsType;
import net.opengis.fes.FESPackage;
import net.opengis.fes.FunctionType;
import net.opengis.fes.LogicOpsType;
import net.opengis.fes.SpatialOpsType;
import net.opengis.fes.TemporalOpsType;

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
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getFilterPredicates <em>Filter Predicates</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getTemporalOpsGroup <em>Temporal Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getTemporalOps <em>Temporal Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getExtensionOpsGroup <em>Extension Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getExtensionOps <em>Extension Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getIdGroup <em>Id Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.BinaryLogicOpTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryLogicOpTypeImpl extends LogicOpsTypeImpl implements BinaryLogicOpType {
	/**
	 * The cached value of the '{@link #getFilterPredicates() <em>Filter Predicates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterPredicates()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap filterPredicates;

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
		return FESPackage.Literals.BINARY_LOGIC_OP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFilterPredicates() {
		if (filterPredicates == null) {
			filterPredicates = new BasicFeatureMap(this, FESPackage.BINARY_LOGIC_OP_TYPE__FILTER_PREDICATES);
		}
		return filterPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getComparisonOpsGroup() {
		return (FeatureMap)getFilterPredicates().<FeatureMap.Entry>list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComparisonOpsType> getComparisonOps() {
		return getComparisonOpsGroup().list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSpatialOpsGroup() {
		return (FeatureMap)getFilterPredicates().<FeatureMap.Entry>list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpatialOpsType> getSpatialOps() {
		return getSpatialOpsGroup().list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTemporalOpsGroup() {
		return (FeatureMap)getFilterPredicates().<FeatureMap.Entry>list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalOpsType> getTemporalOps() {
		return getTemporalOpsGroup().list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLogicOpsGroup() {
		return (FeatureMap)getFilterPredicates().<FeatureMap.Entry>list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicOpsType> getLogicOps() {
		return getLogicOpsGroup().list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__LOGIC_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExtensionOpsGroup() {
		return (FeatureMap)getFilterPredicates().<FeatureMap.Entry>list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtensionOpsType> getExtensionOps() {
		return getExtensionOpsGroup().list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionType> getFunction() {
		return getFilterPredicates().list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__FUNCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIdGroup() {
		return (FeatureMap)getFilterPredicates().<FeatureMap.Entry>list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__ID_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractIdType> getId() {
		return getIdGroup().list(FESPackage.Literals.BINARY_LOGIC_OP_TYPE__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.BINARY_LOGIC_OP_TYPE__FILTER_PREDICATES:
				return ((InternalEList<?>)getFilterPredicates()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				return ((InternalEList<?>)getComparisonOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return ((InternalEList<?>)getComparisonOps()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				return ((InternalEList<?>)getSpatialOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return ((InternalEList<?>)getSpatialOps()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS_GROUP:
				return ((InternalEList<?>)getTemporalOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS:
				return ((InternalEList<?>)getTemporalOps()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				return ((InternalEList<?>)getLogicOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return ((InternalEList<?>)getLogicOps()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS_GROUP:
				return ((InternalEList<?>)getExtensionOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS:
				return ((InternalEList<?>)getExtensionOps()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID_GROUP:
				return ((InternalEList<?>)getIdGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
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
			case FESPackage.BINARY_LOGIC_OP_TYPE__FILTER_PREDICATES:
				if (coreType) return getFilterPredicates();
				return ((FeatureMap.Internal)getFilterPredicates()).getWrapper();
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				if (coreType) return getComparisonOpsGroup();
				return ((FeatureMap.Internal)getComparisonOpsGroup()).getWrapper();
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return getComparisonOps();
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				if (coreType) return getSpatialOpsGroup();
				return ((FeatureMap.Internal)getSpatialOpsGroup()).getWrapper();
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return getSpatialOps();
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS_GROUP:
				if (coreType) return getTemporalOpsGroup();
				return ((FeatureMap.Internal)getTemporalOpsGroup()).getWrapper();
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS:
				return getTemporalOps();
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				if (coreType) return getLogicOpsGroup();
				return ((FeatureMap.Internal)getLogicOpsGroup()).getWrapper();
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return getLogicOps();
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS_GROUP:
				if (coreType) return getExtensionOpsGroup();
				return ((FeatureMap.Internal)getExtensionOpsGroup()).getWrapper();
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS:
				return getExtensionOps();
			case FESPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				return getFunction();
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID_GROUP:
				if (coreType) return getIdGroup();
				return ((FeatureMap.Internal)getIdGroup()).getWrapper();
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID:
				return getId();
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
			case FESPackage.BINARY_LOGIC_OP_TYPE__FILTER_PREDICATES:
				((FeatureMap.Internal)getFilterPredicates()).set(newValue);
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				((FeatureMap.Internal)getComparisonOpsGroup()).set(newValue);
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				((FeatureMap.Internal)getSpatialOpsGroup()).set(newValue);
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS_GROUP:
				((FeatureMap.Internal)getTemporalOpsGroup()).set(newValue);
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				((FeatureMap.Internal)getLogicOpsGroup()).set(newValue);
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS_GROUP:
				((FeatureMap.Internal)getExtensionOpsGroup()).set(newValue);
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends FunctionType>)newValue);
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID_GROUP:
				((FeatureMap.Internal)getIdGroup()).set(newValue);
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
			case FESPackage.BINARY_LOGIC_OP_TYPE__FILTER_PREDICATES:
				getFilterPredicates().clear();
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				getComparisonOpsGroup().clear();
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				getSpatialOpsGroup().clear();
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS_GROUP:
				getTemporalOpsGroup().clear();
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				getLogicOpsGroup().clear();
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS_GROUP:
				getExtensionOpsGroup().clear();
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID_GROUP:
				getIdGroup().clear();
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
			case FESPackage.BINARY_LOGIC_OP_TYPE__FILTER_PREDICATES:
				return filterPredicates != null && !filterPredicates.isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				return !getComparisonOpsGroup().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return !getComparisonOps().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				return !getSpatialOpsGroup().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return !getSpatialOps().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS_GROUP:
				return !getTemporalOpsGroup().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__TEMPORAL_OPS:
				return !getTemporalOps().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				return !getLogicOpsGroup().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return !getLogicOps().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS_GROUP:
				return !getExtensionOpsGroup().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__EXTENSION_OPS:
				return !getExtensionOps().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__FUNCTION:
				return !getFunction().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID_GROUP:
				return !getIdGroup().isEmpty();
			case FESPackage.BINARY_LOGIC_OP_TYPE__ID:
				return !getId().isEmpty();
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
		result.append(" (filterPredicates: ");
		result.append(filterPredicates);
		result.append(')');
		return result.toString();
	}

} //BinaryLogicOpTypeImpl
