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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TExitCriterion;
import org.omg.spec.cmmn.casemodel.TPlanItemDefinition;
import org.omg.spec.cmmn.casemodel.TPlanningTable;
import org.omg.spec.cmmn.casemodel.TStage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TStage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TStageImpl#getPlanningTable <em>Planning Table</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TStageImpl#getPlanItemDefinitionGroup <em>Plan Item Definition Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TStageImpl#getPlanItemDefinition <em>Plan Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TStageImpl#getExitCriterion <em>Exit Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TStageImpl#isAutoComplete <em>Auto Complete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TStageImpl extends TPlanFragmentImpl implements TStage {
	/**
	 * The cached value of the '{@link #getPlanningTable() <em>Planning Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningTable()
	 * @generated
	 * @ordered
	 */
	protected TPlanningTable planningTable;

	/**
	 * The cached value of the '{@link #getPlanItemDefinitionGroup() <em>Plan Item Definition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanItemDefinitionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap planItemDefinitionGroup;

	/**
	 * The cached value of the '{@link #getExitCriterion() <em>Exit Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<TExitCriterion> exitCriterion;

	/**
	 * The default value of the '{@link #isAutoComplete() <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoComplete() <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean autoComplete = AUTO_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Auto Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoCompleteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TSTAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanningTable getPlanningTable() {
		return planningTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningTable(TPlanningTable newPlanningTable, NotificationChain msgs) {
		TPlanningTable oldPlanningTable = planningTable;
		planningTable = newPlanningTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TSTAGE__PLANNING_TABLE, oldPlanningTable, newPlanningTable);
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
	public void setPlanningTable(TPlanningTable newPlanningTable) {
		if (newPlanningTable != planningTable) {
			NotificationChain msgs = null;
			if (planningTable != null)
				msgs = ((InternalEObject)planningTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TSTAGE__PLANNING_TABLE, null, msgs);
			if (newPlanningTable != null)
				msgs = ((InternalEObject)newPlanningTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TSTAGE__PLANNING_TABLE, null, msgs);
			msgs = basicSetPlanningTable(newPlanningTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TSTAGE__PLANNING_TABLE, newPlanningTable, newPlanningTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPlanItemDefinitionGroup() {
		if (planItemDefinitionGroup == null) {
			planItemDefinitionGroup = new BasicFeatureMap(this, CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION_GROUP);
		}
		return planItemDefinitionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TPlanItemDefinition> getPlanItemDefinition() {
		return getPlanItemDefinitionGroup().list(CaseModelPackage.Literals.TSTAGE__PLAN_ITEM_DEFINITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TExitCriterion> getExitCriterion() {
		if (exitCriterion == null) {
			exitCriterion = new EObjectContainmentEList<TExitCriterion>(TExitCriterion.class, this, CaseModelPackage.TSTAGE__EXIT_CRITERION);
		}
		return exitCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoComplete() {
		return autoComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoComplete(boolean newAutoComplete) {
		boolean oldAutoComplete = autoComplete;
		autoComplete = newAutoComplete;
		boolean oldAutoCompleteESet = autoCompleteESet;
		autoCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TSTAGE__AUTO_COMPLETE, oldAutoComplete, autoComplete, !oldAutoCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAutoComplete() {
		boolean oldAutoComplete = autoComplete;
		boolean oldAutoCompleteESet = autoCompleteESet;
		autoComplete = AUTO_COMPLETE_EDEFAULT;
		autoCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CaseModelPackage.TSTAGE__AUTO_COMPLETE, oldAutoComplete, AUTO_COMPLETE_EDEFAULT, oldAutoCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAutoComplete() {
		return autoCompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TSTAGE__PLANNING_TABLE:
				return basicSetPlanningTable(null, msgs);
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION_GROUP:
				return ((InternalEList<?>)getPlanItemDefinitionGroup()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION:
				return ((InternalEList<?>)getPlanItemDefinition()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TSTAGE__EXIT_CRITERION:
				return ((InternalEList<?>)getExitCriterion()).basicRemove(otherEnd, msgs);
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
			case CaseModelPackage.TSTAGE__PLANNING_TABLE:
				return getPlanningTable();
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION_GROUP:
				if (coreType) return getPlanItemDefinitionGroup();
				return ((FeatureMap.Internal)getPlanItemDefinitionGroup()).getWrapper();
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION:
				return getPlanItemDefinition();
			case CaseModelPackage.TSTAGE__EXIT_CRITERION:
				return getExitCriterion();
			case CaseModelPackage.TSTAGE__AUTO_COMPLETE:
				return isAutoComplete();
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
			case CaseModelPackage.TSTAGE__PLANNING_TABLE:
				setPlanningTable((TPlanningTable)newValue);
				return;
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION_GROUP:
				((FeatureMap.Internal)getPlanItemDefinitionGroup()).set(newValue);
				return;
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION:
				getPlanItemDefinition().clear();
				getPlanItemDefinition().addAll((Collection<? extends TPlanItemDefinition>)newValue);
				return;
			case CaseModelPackage.TSTAGE__EXIT_CRITERION:
				getExitCriterion().clear();
				getExitCriterion().addAll((Collection<? extends TExitCriterion>)newValue);
				return;
			case CaseModelPackage.TSTAGE__AUTO_COMPLETE:
				setAutoComplete((Boolean)newValue);
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
			case CaseModelPackage.TSTAGE__PLANNING_TABLE:
				setPlanningTable((TPlanningTable)null);
				return;
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION_GROUP:
				getPlanItemDefinitionGroup().clear();
				return;
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION:
				getPlanItemDefinition().clear();
				return;
			case CaseModelPackage.TSTAGE__EXIT_CRITERION:
				getExitCriterion().clear();
				return;
			case CaseModelPackage.TSTAGE__AUTO_COMPLETE:
				unsetAutoComplete();
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
			case CaseModelPackage.TSTAGE__PLANNING_TABLE:
				return planningTable != null;
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION_GROUP:
				return planItemDefinitionGroup != null && !planItemDefinitionGroup.isEmpty();
			case CaseModelPackage.TSTAGE__PLAN_ITEM_DEFINITION:
				return !getPlanItemDefinition().isEmpty();
			case CaseModelPackage.TSTAGE__EXIT_CRITERION:
				return exitCriterion != null && !exitCriterion.isEmpty();
			case CaseModelPackage.TSTAGE__AUTO_COMPLETE:
				return isSetAutoComplete();
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
		result.append(" (planItemDefinitionGroup: ");
		result.append(planItemDefinitionGroup);
		result.append(", autoComplete: ");
		if (autoCompleteESet) result.append(autoComplete); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TStageImpl
