/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TDMNElementReference;
import org.omg.spec.dmn.dmn.TPerformanceIndicator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPerformance Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TPerformanceIndicatorImpl#getImpactingDecision <em>Impacting Decision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPerformanceIndicatorImpl extends TBusinessContextElementImpl implements TPerformanceIndicator {
	/**
	 * The cached value of the '{@link #getImpactingDecision() <em>Impacting Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactingDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> impactingDecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPerformanceIndicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TPERFORMANCE_INDICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getImpactingDecision() {
		if (impactingDecision == null) {
			impactingDecision = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TPERFORMANCE_INDICATOR__IMPACTING_DECISION);
		}
		return impactingDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TPERFORMANCE_INDICATOR__IMPACTING_DECISION:
				return ((InternalEList<?>)getImpactingDecision()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TPERFORMANCE_INDICATOR__IMPACTING_DECISION:
				return getImpactingDecision();
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
			case DMNPackage.TPERFORMANCE_INDICATOR__IMPACTING_DECISION:
				getImpactingDecision().clear();
				getImpactingDecision().addAll((Collection<? extends TDMNElementReference>)newValue);
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
			case DMNPackage.TPERFORMANCE_INDICATOR__IMPACTING_DECISION:
				getImpactingDecision().clear();
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
			case DMNPackage.TPERFORMANCE_INDICATOR__IMPACTING_DECISION:
				return impactingDecision != null && !impactingDecision.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TPerformanceIndicatorImpl
