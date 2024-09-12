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

import net.opengis.ogc.AbstractIdType;
import net.opengis.ogc.ComparisonOpsType;
import net.opengis.ogc.FilterType;
import net.opengis.ogc.LogicOpsType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.SpatialOpsType;

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
 * An implementation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getIdGroup <em>Id Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.FilterTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterTypeImpl extends MinimalEObjectImpl.Container implements FilterType {
	/**
	 * The cached value of the '{@link #getSpatialOpsGroup() <em>Spatial Ops Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialOpsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap spatialOpsGroup;

	/**
	 * The cached value of the '{@link #getComparisonOpsGroup() <em>Comparison Ops Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOpsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap comparisonOpsGroup;

	/**
	 * The cached value of the '{@link #getLogicOpsGroup() <em>Logic Ops Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicOpsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap logicOpsGroup;

	/**
	 * The cached value of the '{@link #getIdGroup() <em>Id Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap idGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.FILTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSpatialOpsGroup() {
		if (spatialOpsGroup == null) {
			spatialOpsGroup = new BasicFeatureMap(this, OGCPackage.FILTER_TYPE__SPATIAL_OPS_GROUP);
		}
		return spatialOpsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialOpsType getSpatialOps() {
		return (SpatialOpsType)getSpatialOpsGroup().get(OGCPackage.Literals.FILTER_TYPE__SPATIAL_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialOps(SpatialOpsType newSpatialOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSpatialOpsGroup()).basicAdd(OGCPackage.Literals.FILTER_TYPE__SPATIAL_OPS, newSpatialOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getComparisonOpsGroup() {
		if (comparisonOpsGroup == null) {
			comparisonOpsGroup = new BasicFeatureMap(this, OGCPackage.FILTER_TYPE__COMPARISON_OPS_GROUP);
		}
		return comparisonOpsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOpsType getComparisonOps() {
		return (ComparisonOpsType)getComparisonOpsGroup().get(OGCPackage.Literals.FILTER_TYPE__COMPARISON_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonOps(ComparisonOpsType newComparisonOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getComparisonOpsGroup()).basicAdd(OGCPackage.Literals.FILTER_TYPE__COMPARISON_OPS, newComparisonOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLogicOpsGroup() {
		if (logicOpsGroup == null) {
			logicOpsGroup = new BasicFeatureMap(this, OGCPackage.FILTER_TYPE__LOGIC_OPS_GROUP);
		}
		return logicOpsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicOpsType getLogicOps() {
		return (LogicOpsType)getLogicOpsGroup().get(OGCPackage.Literals.FILTER_TYPE__LOGIC_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicOps(LogicOpsType newLogicOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLogicOpsGroup()).basicAdd(OGCPackage.Literals.FILTER_TYPE__LOGIC_OPS, newLogicOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIdGroup() {
		if (idGroup == null) {
			idGroup = new BasicFeatureMap(this, OGCPackage.FILTER_TYPE__ID_GROUP);
		}
		return idGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractIdType> getId() {
		return getIdGroup().list(OGCPackage.Literals.FILTER_TYPE__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				return ((InternalEList<?>)getSpatialOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS:
				return basicSetSpatialOps(null, msgs);
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				return ((InternalEList<?>)getComparisonOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS:
				return basicSetComparisonOps(null, msgs);
			case OGCPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				return ((InternalEList<?>)getLogicOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.FILTER_TYPE__LOGIC_OPS:
				return basicSetLogicOps(null, msgs);
			case OGCPackage.FILTER_TYPE__ID_GROUP:
				return ((InternalEList<?>)getIdGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.FILTER_TYPE__ID:
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
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				if (coreType) return getSpatialOpsGroup();
				return ((FeatureMap.Internal)getSpatialOpsGroup()).getWrapper();
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS:
				return getSpatialOps();
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				if (coreType) return getComparisonOpsGroup();
				return ((FeatureMap.Internal)getComparisonOpsGroup()).getWrapper();
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS:
				return getComparisonOps();
			case OGCPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				if (coreType) return getLogicOpsGroup();
				return ((FeatureMap.Internal)getLogicOpsGroup()).getWrapper();
			case OGCPackage.FILTER_TYPE__LOGIC_OPS:
				return getLogicOps();
			case OGCPackage.FILTER_TYPE__ID_GROUP:
				if (coreType) return getIdGroup();
				return ((FeatureMap.Internal)getIdGroup()).getWrapper();
			case OGCPackage.FILTER_TYPE__ID:
				return getId();
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
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				((FeatureMap.Internal)getSpatialOpsGroup()).set(newValue);
				return;
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				((FeatureMap.Internal)getComparisonOpsGroup()).set(newValue);
				return;
			case OGCPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				((FeatureMap.Internal)getLogicOpsGroup()).set(newValue);
				return;
			case OGCPackage.FILTER_TYPE__ID_GROUP:
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
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				getSpatialOpsGroup().clear();
				return;
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				getComparisonOpsGroup().clear();
				return;
			case OGCPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				getLogicOpsGroup().clear();
				return;
			case OGCPackage.FILTER_TYPE__ID_GROUP:
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
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				return spatialOpsGroup != null && !spatialOpsGroup.isEmpty();
			case OGCPackage.FILTER_TYPE__SPATIAL_OPS:
				return getSpatialOps() != null;
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				return comparisonOpsGroup != null && !comparisonOpsGroup.isEmpty();
			case OGCPackage.FILTER_TYPE__COMPARISON_OPS:
				return getComparisonOps() != null;
			case OGCPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				return logicOpsGroup != null && !logicOpsGroup.isEmpty();
			case OGCPackage.FILTER_TYPE__LOGIC_OPS:
				return getLogicOps() != null;
			case OGCPackage.FILTER_TYPE__ID_GROUP:
				return idGroup != null && !idGroup.isEmpty();
			case OGCPackage.FILTER_TYPE__ID:
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
		result.append(" (spatialOpsGroup: ");
		result.append(spatialOpsGroup);
		result.append(", comparisonOpsGroup: ");
		result.append(comparisonOpsGroup);
		result.append(", logicOpsGroup: ");
		result.append(logicOpsGroup);
		result.append(", idGroup: ");
		result.append(idGroup);
		result.append(')');
		return result.toString();
	}

} //FilterTypeImpl
