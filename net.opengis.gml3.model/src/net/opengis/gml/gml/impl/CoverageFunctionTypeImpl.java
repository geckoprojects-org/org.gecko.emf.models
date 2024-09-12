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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.CoverageFunctionType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GridFunctionType;
import net.opengis.gml.gml.MappingRuleType;
import net.opengis.gml.gml.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.CoverageFunctionTypeImpl#getMappingRule <em>Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CoverageFunctionTypeImpl#getCoverageMappingRule <em>Coverage Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CoverageFunctionTypeImpl#getGridFunction <em>Grid Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageFunctionTypeImpl extends MinimalEObjectImpl.Container implements CoverageFunctionType {
	/**
	 * The cached value of the '{@link #getMappingRule() <em>Mapping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRule()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType mappingRule;

	/**
	 * The cached value of the '{@link #getCoverageMappingRule() <em>Coverage Mapping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageMappingRule()
	 * @generated
	 * @ordered
	 */
	protected MappingRuleType coverageMappingRule;

	/**
	 * The cached value of the '{@link #getGridFunction() <em>Grid Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridFunction()
	 * @generated
	 * @ordered
	 */
	protected GridFunctionType gridFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCoverageFunctionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getMappingRule() {
		return mappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingRule(StringOrRefType newMappingRule, NotificationChain msgs) {
		StringOrRefType oldMappingRule = mappingRule;
		mappingRule = newMappingRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, oldMappingRule, newMappingRule);
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
	public void setMappingRule(StringOrRefType newMappingRule) {
		if (newMappingRule != mappingRule) {
			NotificationChain msgs = null;
			if (mappingRule != null)
				msgs = ((InternalEObject)mappingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, null, msgs);
			if (newMappingRule != null)
				msgs = ((InternalEObject)newMappingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, null, msgs);
			msgs = basicSetMappingRule(newMappingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, newMappingRule, newMappingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingRuleType getCoverageMappingRule() {
		return coverageMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageMappingRule(MappingRuleType newCoverageMappingRule, NotificationChain msgs) {
		MappingRuleType oldCoverageMappingRule = coverageMappingRule;
		coverageMappingRule = newCoverageMappingRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE, oldCoverageMappingRule, newCoverageMappingRule);
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
	public void setCoverageMappingRule(MappingRuleType newCoverageMappingRule) {
		if (newCoverageMappingRule != coverageMappingRule) {
			NotificationChain msgs = null;
			if (coverageMappingRule != null)
				msgs = ((InternalEObject)coverageMappingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE, null, msgs);
			if (newCoverageMappingRule != null)
				msgs = ((InternalEObject)newCoverageMappingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE, null, msgs);
			msgs = basicSetCoverageMappingRule(newCoverageMappingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE, newCoverageMappingRule, newCoverageMappingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridFunctionType getGridFunction() {
		return gridFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridFunction(GridFunctionType newGridFunction, NotificationChain msgs) {
		GridFunctionType oldGridFunction = gridFunction;
		gridFunction = newGridFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION, oldGridFunction, newGridFunction);
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
	public void setGridFunction(GridFunctionType newGridFunction) {
		if (newGridFunction != gridFunction) {
			NotificationChain msgs = null;
			if (gridFunction != null)
				msgs = ((InternalEObject)gridFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION, null, msgs);
			if (newGridFunction != null)
				msgs = ((InternalEObject)newGridFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION, null, msgs);
			msgs = basicSetGridFunction(newGridFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION, newGridFunction, newGridFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				return basicSetMappingRule(null, msgs);
			case GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE:
				return basicSetCoverageMappingRule(null, msgs);
			case GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				return basicSetGridFunction(null, msgs);
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
			case GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				return getMappingRule();
			case GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE:
				return getCoverageMappingRule();
			case GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				return getGridFunction();
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
			case GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				setMappingRule((StringOrRefType)newValue);
				return;
			case GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE:
				setCoverageMappingRule((MappingRuleType)newValue);
				return;
			case GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				setGridFunction((GridFunctionType)newValue);
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
			case GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				setMappingRule((StringOrRefType)null);
				return;
			case GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE:
				setCoverageMappingRule((MappingRuleType)null);
				return;
			case GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				setGridFunction((GridFunctionType)null);
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
			case GMLPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				return mappingRule != null;
			case GMLPackage.COVERAGE_FUNCTION_TYPE__COVERAGE_MAPPING_RULE:
				return coverageMappingRule != null;
			case GMLPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				return gridFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageFunctionTypeImpl
