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

import net.opengis.ogc.ArithmeticOperatorsType;
import net.opengis.ogc.ComparisonOperatorsType;
import net.opengis.ogc.LogicalOperatorsType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.ScalarCapabilitiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.ScalarCapabilitiesTypeImpl#getLogicalOperators <em>Logical Operators</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.ScalarCapabilitiesTypeImpl#getComparisonOperators <em>Comparison Operators</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.ScalarCapabilitiesTypeImpl#getArithmeticOperators <em>Arithmetic Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalarCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements ScalarCapabilitiesType {
	/**
	 * The cached value of the '{@link #getLogicalOperators() <em>Logical Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperators()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperatorsType logicalOperators;

	/**
	 * The cached value of the '{@link #getComparisonOperators() <em>Comparison Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperators()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperatorsType comparisonOperators;

	/**
	 * The cached value of the '{@link #getArithmeticOperators() <em>Arithmetic Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticOperators()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticOperatorsType arithmeticOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.SCALAR_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperatorsType getLogicalOperators() {
		return logicalOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalOperators(LogicalOperatorsType newLogicalOperators, NotificationChain msgs) {
		LogicalOperatorsType oldLogicalOperators = logicalOperators;
		logicalOperators = newLogicalOperators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS, oldLogicalOperators, newLogicalOperators);
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
	public void setLogicalOperators(LogicalOperatorsType newLogicalOperators) {
		if (newLogicalOperators != logicalOperators) {
			NotificationChain msgs = null;
			if (logicalOperators != null)
				msgs = ((InternalEObject)logicalOperators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS, null, msgs);
			if (newLogicalOperators != null)
				msgs = ((InternalEObject)newLogicalOperators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS, null, msgs);
			msgs = basicSetLogicalOperators(newLogicalOperators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS, newLogicalOperators, newLogicalOperators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperatorsType getComparisonOperators() {
		return comparisonOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonOperators(ComparisonOperatorsType newComparisonOperators, NotificationChain msgs) {
		ComparisonOperatorsType oldComparisonOperators = comparisonOperators;
		comparisonOperators = newComparisonOperators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS, oldComparisonOperators, newComparisonOperators);
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
	public void setComparisonOperators(ComparisonOperatorsType newComparisonOperators) {
		if (newComparisonOperators != comparisonOperators) {
			NotificationChain msgs = null;
			if (comparisonOperators != null)
				msgs = ((InternalEObject)comparisonOperators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS, null, msgs);
			if (newComparisonOperators != null)
				msgs = ((InternalEObject)newComparisonOperators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS, null, msgs);
			msgs = basicSetComparisonOperators(newComparisonOperators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS, newComparisonOperators, newComparisonOperators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticOperatorsType getArithmeticOperators() {
		return arithmeticOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArithmeticOperators(ArithmeticOperatorsType newArithmeticOperators, NotificationChain msgs) {
		ArithmeticOperatorsType oldArithmeticOperators = arithmeticOperators;
		arithmeticOperators = newArithmeticOperators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS, oldArithmeticOperators, newArithmeticOperators);
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
	public void setArithmeticOperators(ArithmeticOperatorsType newArithmeticOperators) {
		if (newArithmeticOperators != arithmeticOperators) {
			NotificationChain msgs = null;
			if (arithmeticOperators != null)
				msgs = ((InternalEObject)arithmeticOperators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS, null, msgs);
			if (newArithmeticOperators != null)
				msgs = ((InternalEObject)newArithmeticOperators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS, null, msgs);
			msgs = basicSetArithmeticOperators(newArithmeticOperators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS, newArithmeticOperators, newArithmeticOperators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS:
				return basicSetLogicalOperators(null, msgs);
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS:
				return basicSetComparisonOperators(null, msgs);
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS:
				return basicSetArithmeticOperators(null, msgs);
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
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS:
				return getLogicalOperators();
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS:
				return getComparisonOperators();
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS:
				return getArithmeticOperators();
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
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS:
				setLogicalOperators((LogicalOperatorsType)newValue);
				return;
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS:
				setComparisonOperators((ComparisonOperatorsType)newValue);
				return;
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS:
				setArithmeticOperators((ArithmeticOperatorsType)newValue);
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
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS:
				setLogicalOperators((LogicalOperatorsType)null);
				return;
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS:
				setComparisonOperators((ComparisonOperatorsType)null);
				return;
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS:
				setArithmeticOperators((ArithmeticOperatorsType)null);
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
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS:
				return logicalOperators != null;
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS:
				return comparisonOperators != null;
			case OGCPackage.SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS:
				return arithmeticOperators != null;
		}
		return super.eIsSet(featureID);
	}

} //ScalarCapabilitiesTypeImpl
