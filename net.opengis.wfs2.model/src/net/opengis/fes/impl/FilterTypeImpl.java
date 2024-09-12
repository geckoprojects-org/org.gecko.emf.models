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

import net.opengis.fes.AbstractIdType;
import net.opengis.fes.ComparisonOpsType;
import net.opengis.fes.ExtensionOpsType;
import net.opengis.fes.FESPackage;
import net.opengis.fes.FilterType;
import net.opengis.fes.FunctionType;
import net.opengis.fes.LogicOpsType;
import net.opengis.fes.SpatialOpsType;
import net.opengis.fes.TemporalOpsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getTemporalOpsGroup <em>Temporal Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getTemporalOps <em>Temporal Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getExtensionOpsGroup <em>Extension Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getExtensionOps <em>Extension Ops</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getIdGroup <em>Id Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterTypeImpl extends AbstractSelectionClauseTypeImpl implements FilterType {
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
	 * The cached value of the '{@link #getSpatialOpsGroup() <em>Spatial Ops Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialOpsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap spatialOpsGroup;

	/**
	 * The cached value of the '{@link #getTemporalOpsGroup() <em>Temporal Ops Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOpsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap temporalOpsGroup;

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
	 * The cached value of the '{@link #getExtensionOpsGroup() <em>Extension Ops Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionOpsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap extensionOpsGroup;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionType function;

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
		return FESPackage.Literals.FILTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getComparisonOpsGroup() {
		if (comparisonOpsGroup == null) {
			comparisonOpsGroup = new BasicFeatureMap(this, FESPackage.FILTER_TYPE__COMPARISON_OPS_GROUP);
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
		return (ComparisonOpsType)getComparisonOpsGroup().get(FESPackage.Literals.FILTER_TYPE__COMPARISON_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonOps(ComparisonOpsType newComparisonOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getComparisonOpsGroup()).basicAdd(FESPackage.Literals.FILTER_TYPE__COMPARISON_OPS, newComparisonOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSpatialOpsGroup() {
		if (spatialOpsGroup == null) {
			spatialOpsGroup = new BasicFeatureMap(this, FESPackage.FILTER_TYPE__SPATIAL_OPS_GROUP);
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
		return (SpatialOpsType)getSpatialOpsGroup().get(FESPackage.Literals.FILTER_TYPE__SPATIAL_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialOps(SpatialOpsType newSpatialOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSpatialOpsGroup()).basicAdd(FESPackage.Literals.FILTER_TYPE__SPATIAL_OPS, newSpatialOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTemporalOpsGroup() {
		if (temporalOpsGroup == null) {
			temporalOpsGroup = new BasicFeatureMap(this, FESPackage.FILTER_TYPE__TEMPORAL_OPS_GROUP);
		}
		return temporalOpsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOpsType getTemporalOps() {
		return (TemporalOpsType)getTemporalOpsGroup().get(FESPackage.Literals.FILTER_TYPE__TEMPORAL_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalOps(TemporalOpsType newTemporalOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTemporalOpsGroup()).basicAdd(FESPackage.Literals.FILTER_TYPE__TEMPORAL_OPS, newTemporalOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLogicOpsGroup() {
		if (logicOpsGroup == null) {
			logicOpsGroup = new BasicFeatureMap(this, FESPackage.FILTER_TYPE__LOGIC_OPS_GROUP);
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
		return (LogicOpsType)getLogicOpsGroup().get(FESPackage.Literals.FILTER_TYPE__LOGIC_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicOps(LogicOpsType newLogicOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLogicOpsGroup()).basicAdd(FESPackage.Literals.FILTER_TYPE__LOGIC_OPS, newLogicOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExtensionOpsGroup() {
		if (extensionOpsGroup == null) {
			extensionOpsGroup = new BasicFeatureMap(this, FESPackage.FILTER_TYPE__EXTENSION_OPS_GROUP);
		}
		return extensionOpsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionOpsType getExtensionOps() {
		return (ExtensionOpsType)getExtensionOpsGroup().get(FESPackage.Literals.FILTER_TYPE__EXTENSION_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionOps(ExtensionOpsType newExtensionOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExtensionOpsGroup()).basicAdd(FESPackage.Literals.FILTER_TYPE__EXTENSION_OPS, newExtensionOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionType getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(FunctionType newFunction, NotificationChain msgs) {
		FunctionType oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_TYPE__FUNCTION, oldFunction, newFunction);
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
	public void setFunction(FunctionType newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_TYPE__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_TYPE__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_TYPE__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getIdGroup() {
		if (idGroup == null) {
			idGroup = new BasicFeatureMap(this, FESPackage.FILTER_TYPE__ID_GROUP);
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
		return getIdGroup().list(FESPackage.Literals.FILTER_TYPE__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				return ((InternalEList<?>)getComparisonOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.FILTER_TYPE__COMPARISON_OPS:
				return basicSetComparisonOps(null, msgs);
			case FESPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				return ((InternalEList<?>)getSpatialOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.FILTER_TYPE__SPATIAL_OPS:
				return basicSetSpatialOps(null, msgs);
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS_GROUP:
				return ((InternalEList<?>)getTemporalOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS:
				return basicSetTemporalOps(null, msgs);
			case FESPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				return ((InternalEList<?>)getLogicOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.FILTER_TYPE__LOGIC_OPS:
				return basicSetLogicOps(null, msgs);
			case FESPackage.FILTER_TYPE__EXTENSION_OPS_GROUP:
				return ((InternalEList<?>)getExtensionOpsGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.FILTER_TYPE__EXTENSION_OPS:
				return basicSetExtensionOps(null, msgs);
			case FESPackage.FILTER_TYPE__FUNCTION:
				return basicSetFunction(null, msgs);
			case FESPackage.FILTER_TYPE__ID_GROUP:
				return ((InternalEList<?>)getIdGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.FILTER_TYPE__ID:
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
			case FESPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				if (coreType) return getComparisonOpsGroup();
				return ((FeatureMap.Internal)getComparisonOpsGroup()).getWrapper();
			case FESPackage.FILTER_TYPE__COMPARISON_OPS:
				return getComparisonOps();
			case FESPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				if (coreType) return getSpatialOpsGroup();
				return ((FeatureMap.Internal)getSpatialOpsGroup()).getWrapper();
			case FESPackage.FILTER_TYPE__SPATIAL_OPS:
				return getSpatialOps();
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS_GROUP:
				if (coreType) return getTemporalOpsGroup();
				return ((FeatureMap.Internal)getTemporalOpsGroup()).getWrapper();
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS:
				return getTemporalOps();
			case FESPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				if (coreType) return getLogicOpsGroup();
				return ((FeatureMap.Internal)getLogicOpsGroup()).getWrapper();
			case FESPackage.FILTER_TYPE__LOGIC_OPS:
				return getLogicOps();
			case FESPackage.FILTER_TYPE__EXTENSION_OPS_GROUP:
				if (coreType) return getExtensionOpsGroup();
				return ((FeatureMap.Internal)getExtensionOpsGroup()).getWrapper();
			case FESPackage.FILTER_TYPE__EXTENSION_OPS:
				return getExtensionOps();
			case FESPackage.FILTER_TYPE__FUNCTION:
				return getFunction();
			case FESPackage.FILTER_TYPE__ID_GROUP:
				if (coreType) return getIdGroup();
				return ((FeatureMap.Internal)getIdGroup()).getWrapper();
			case FESPackage.FILTER_TYPE__ID:
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
			case FESPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				((FeatureMap.Internal)getComparisonOpsGroup()).set(newValue);
				return;
			case FESPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				((FeatureMap.Internal)getSpatialOpsGroup()).set(newValue);
				return;
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS_GROUP:
				((FeatureMap.Internal)getTemporalOpsGroup()).set(newValue);
				return;
			case FESPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				((FeatureMap.Internal)getLogicOpsGroup()).set(newValue);
				return;
			case FESPackage.FILTER_TYPE__EXTENSION_OPS_GROUP:
				((FeatureMap.Internal)getExtensionOpsGroup()).set(newValue);
				return;
			case FESPackage.FILTER_TYPE__FUNCTION:
				setFunction((FunctionType)newValue);
				return;
			case FESPackage.FILTER_TYPE__ID_GROUP:
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
			case FESPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				getComparisonOpsGroup().clear();
				return;
			case FESPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				getSpatialOpsGroup().clear();
				return;
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS_GROUP:
				getTemporalOpsGroup().clear();
				return;
			case FESPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				getLogicOpsGroup().clear();
				return;
			case FESPackage.FILTER_TYPE__EXTENSION_OPS_GROUP:
				getExtensionOpsGroup().clear();
				return;
			case FESPackage.FILTER_TYPE__FUNCTION:
				setFunction((FunctionType)null);
				return;
			case FESPackage.FILTER_TYPE__ID_GROUP:
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
			case FESPackage.FILTER_TYPE__COMPARISON_OPS_GROUP:
				return comparisonOpsGroup != null && !comparisonOpsGroup.isEmpty();
			case FESPackage.FILTER_TYPE__COMPARISON_OPS:
				return getComparisonOps() != null;
			case FESPackage.FILTER_TYPE__SPATIAL_OPS_GROUP:
				return spatialOpsGroup != null && !spatialOpsGroup.isEmpty();
			case FESPackage.FILTER_TYPE__SPATIAL_OPS:
				return getSpatialOps() != null;
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS_GROUP:
				return temporalOpsGroup != null && !temporalOpsGroup.isEmpty();
			case FESPackage.FILTER_TYPE__TEMPORAL_OPS:
				return getTemporalOps() != null;
			case FESPackage.FILTER_TYPE__LOGIC_OPS_GROUP:
				return logicOpsGroup != null && !logicOpsGroup.isEmpty();
			case FESPackage.FILTER_TYPE__LOGIC_OPS:
				return getLogicOps() != null;
			case FESPackage.FILTER_TYPE__EXTENSION_OPS_GROUP:
				return extensionOpsGroup != null && !extensionOpsGroup.isEmpty();
			case FESPackage.FILTER_TYPE__EXTENSION_OPS:
				return getExtensionOps() != null;
			case FESPackage.FILTER_TYPE__FUNCTION:
				return function != null;
			case FESPackage.FILTER_TYPE__ID_GROUP:
				return idGroup != null && !idGroup.isEmpty();
			case FESPackage.FILTER_TYPE__ID:
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
		result.append(" (comparisonOpsGroup: ");
		result.append(comparisonOpsGroup);
		result.append(", spatialOpsGroup: ");
		result.append(spatialOpsGroup);
		result.append(", temporalOpsGroup: ");
		result.append(temporalOpsGroup);
		result.append(", logicOpsGroup: ");
		result.append(logicOpsGroup);
		result.append(", extensionOpsGroup: ");
		result.append(extensionOpsGroup);
		result.append(", idGroup: ");
		result.append(idGroup);
		result.append(')');
		return result.toString();
	}

} //FilterTypeImpl
