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
import net.opengis.gml.gml.DiscreteCoverageType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.DiscreteCoverageTypeImpl#getCoverageFunction <em>Coverage Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteCoverageTypeImpl extends AbstractCoverageTypeImpl implements DiscreteCoverageType {
	/**
	 * The cached value of the '{@link #getCoverageFunction() <em>Coverage Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageFunction()
	 * @generated
	 * @ordered
	 */
	protected CoverageFunctionType coverageFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteCoverageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDiscreteCoverageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageFunctionType getCoverageFunction() {
		return coverageFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageFunction(CoverageFunctionType newCoverageFunction, NotificationChain msgs) {
		CoverageFunctionType oldCoverageFunction = coverageFunction;
		coverageFunction = newCoverageFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION, oldCoverageFunction, newCoverageFunction);
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
	public void setCoverageFunction(CoverageFunctionType newCoverageFunction) {
		if (newCoverageFunction != coverageFunction) {
			NotificationChain msgs = null;
			if (coverageFunction != null)
				msgs = ((InternalEObject)coverageFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION, null, msgs);
			if (newCoverageFunction != null)
				msgs = ((InternalEObject)newCoverageFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION, null, msgs);
			msgs = basicSetCoverageFunction(newCoverageFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION, newCoverageFunction, newCoverageFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION:
				return basicSetCoverageFunction(null, msgs);
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
			case GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION:
				return getCoverageFunction();
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
			case GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)newValue);
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
			case GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)null);
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
			case GMLPackage.DISCRETE_COVERAGE_TYPE__COVERAGE_FUNCTION:
				return coverageFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscreteCoverageTypeImpl
