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
package org.omg.spec.cmmn.casemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TPlanFragment;
import org.omg.spec.cmmn.casemodel.TPlanItem;
import org.omg.spec.cmmn.casemodel.TSentry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPlan Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanFragmentImpl#getPlanItem <em>Plan Item</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanFragmentImpl#getSentry <em>Sentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPlanFragmentImpl extends TPlanItemDefinitionImpl implements TPlanFragment {
	/**
	 * The cached value of the '{@link #getPlanItem() <em>Plan Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanItem()
	 * @generated
	 * @ordered
	 */
	protected EList<TPlanItem> planItem;

	/**
	 * The cached value of the '{@link #getSentry() <em>Sentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentry()
	 * @generated
	 * @ordered
	 */
	protected EList<TSentry> sentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPlanFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TPLAN_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TPlanItem> getPlanItem() {
		if (planItem == null) {
			planItem = new EObjectContainmentEList<TPlanItem>(TPlanItem.class, this, CaseModelPackage.TPLAN_FRAGMENT__PLAN_ITEM);
		}
		return planItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSentry> getSentry() {
		if (sentry == null) {
			sentry = new EObjectContainmentEList<TSentry>(TSentry.class, this, CaseModelPackage.TPLAN_FRAGMENT__SENTRY);
		}
		return sentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TPLAN_FRAGMENT__PLAN_ITEM:
				return ((InternalEList<?>)getPlanItem()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TPLAN_FRAGMENT__SENTRY:
				return ((InternalEList<?>)getSentry()).basicRemove(otherEnd, msgs);
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
			case CaseModelPackage.TPLAN_FRAGMENT__PLAN_ITEM:
				return getPlanItem();
			case CaseModelPackage.TPLAN_FRAGMENT__SENTRY:
				return getSentry();
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
			case CaseModelPackage.TPLAN_FRAGMENT__PLAN_ITEM:
				getPlanItem().clear();
				getPlanItem().addAll((Collection<? extends TPlanItem>)newValue);
				return;
			case CaseModelPackage.TPLAN_FRAGMENT__SENTRY:
				getSentry().clear();
				getSentry().addAll((Collection<? extends TSentry>)newValue);
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
			case CaseModelPackage.TPLAN_FRAGMENT__PLAN_ITEM:
				getPlanItem().clear();
				return;
			case CaseModelPackage.TPLAN_FRAGMENT__SENTRY:
				getSentry().clear();
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
			case CaseModelPackage.TPLAN_FRAGMENT__PLAN_ITEM:
				return planItem != null && !planItem.isEmpty();
			case CaseModelPackage.TPLAN_FRAGMENT__SENTRY:
				return sentry != null && !sentry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TPlanFragmentImpl
