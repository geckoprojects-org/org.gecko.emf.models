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

import net.opengis.ogc.ComparisonOpsType;
import net.opengis.ogc.FunctionType;
import net.opengis.ogc.LogicOpsType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.SpatialOpsType;
import net.opengis.ogc.UnaryLogicOpType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Logic Op Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryLogicOpTypeImpl extends LogicOpsTypeImpl implements UnaryLogicOpType {
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
	 * The cached value of the '{@link #getLogicOpsGroup() <em>Logic Ops Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicOpsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap logicOpsGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryLogicOpTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.UNARY_LOGIC_OP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getComparisonOpsGroup() {
		if (comparisonOpsGroup == null) {
			comparisonOpsGroup = new BasicFeatureMap(this, OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP);
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
		return (ComparisonOpsType)getComparisonOpsGroup().get(OGCPackage.Literals.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonOps(ComparisonOpsType newComparisonOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getComparisonOpsGroup()).basicAdd(OGCPackage.Literals.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS, newComparisonOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSpatialOpsGroup() {
		if (spatialOpsGroup == null) {
			spatialOpsGroup = new BasicFeatureMap(this, OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP);
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
		return (SpatialOpsType)getSpatialOpsGroup().get(OGCPackage.Literals.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialOps(SpatialOpsType newSpatialOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSpatialOpsGroup()).basicAdd(OGCPackage.Literals.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS, newSpatialOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLogicOpsGroup() {
		if (logicOpsGroup == null) {
			logicOpsGroup = new BasicFeatureMap(this, OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP);
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
		return (LogicOpsType)getLogicOpsGroup().get(OGCPackage.Literals.UNARY_LOGIC_OP_TYPE__LOGIC_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicOps(LogicOpsType newLogicOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLogicOpsGroup()).basicAdd(OGCPackage.Literals.UNARY_LOGIC_OP_TYPE__LOGIC_OPS, newLogicOps, msgs);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION, oldFunction, newFunction);
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
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				return ((InternalEList<?>)getComparisonOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return basicSetComparisonOps(null, msgs);
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				return ((InternalEList<?>)getSpatialOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return basicSetSpatialOps(null, msgs);
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				return ((InternalEList<?>)getLogicOpsGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return basicSetLogicOps(null, msgs);
			case OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION:
				return basicSetFunction(null, msgs);
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
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				if (coreType) return getComparisonOpsGroup();
				return ((FeatureMap.Internal)getComparisonOpsGroup()).getWrapper();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return getComparisonOps();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				if (coreType) return getSpatialOpsGroup();
				return ((FeatureMap.Internal)getSpatialOpsGroup()).getWrapper();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return getSpatialOps();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				if (coreType) return getLogicOpsGroup();
				return ((FeatureMap.Internal)getLogicOpsGroup()).getWrapper();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return getLogicOps();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION:
				return getFunction();
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
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				((FeatureMap.Internal)getComparisonOpsGroup()).set(newValue);
				return;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				((FeatureMap.Internal)getSpatialOpsGroup()).set(newValue);
				return;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				((FeatureMap.Internal)getLogicOpsGroup()).set(newValue);
				return;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION:
				setFunction((FunctionType)newValue);
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
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				getComparisonOpsGroup().clear();
				return;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				getSpatialOpsGroup().clear();
				return;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				getLogicOpsGroup().clear();
				return;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION:
				setFunction((FunctionType)null);
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
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP:
				return comparisonOpsGroup != null && !comparisonOpsGroup.isEmpty();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__COMPARISON_OPS:
				return getComparisonOps() != null;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP:
				return spatialOpsGroup != null && !spatialOpsGroup.isEmpty();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__SPATIAL_OPS:
				return getSpatialOps() != null;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP:
				return logicOpsGroup != null && !logicOpsGroup.isEmpty();
			case OGCPackage.UNARY_LOGIC_OP_TYPE__LOGIC_OPS:
				return getLogicOps() != null;
			case OGCPackage.UNARY_LOGIC_OP_TYPE__FUNCTION:
				return function != null;
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
		result.append(", logicOpsGroup: ");
		result.append(logicOpsGroup);
		result.append(')');
		return result.toString();
	}

} //UnaryLogicOpTypeImpl
