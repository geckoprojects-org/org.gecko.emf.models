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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.THumanTask;
import org.omg.spec.cmmn.casemodel.TPlanningTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>THuman Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.THumanTaskImpl#getPlanningTable <em>Planning Table</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.THumanTaskImpl#getPerformerRef <em>Performer Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class THumanTaskImpl extends TTaskImpl implements THumanTask {
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
	 * The default value of the '{@link #getPerformerRef() <em>Performer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformerRef() <em>Performer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerRef()
	 * @generated
	 * @ordered
	 */
	protected String performerRef = PERFORMER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected THumanTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.THUMAN_TASK;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.THUMAN_TASK__PLANNING_TABLE, oldPlanningTable, newPlanningTable);
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
				msgs = ((InternalEObject)planningTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.THUMAN_TASK__PLANNING_TABLE, null, msgs);
			if (newPlanningTable != null)
				msgs = ((InternalEObject)newPlanningTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.THUMAN_TASK__PLANNING_TABLE, null, msgs);
			msgs = basicSetPlanningTable(newPlanningTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.THUMAN_TASK__PLANNING_TABLE, newPlanningTable, newPlanningTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerformerRef() {
		return performerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformerRef(String newPerformerRef) {
		String oldPerformerRef = performerRef;
		performerRef = newPerformerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.THUMAN_TASK__PERFORMER_REF, oldPerformerRef, performerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.THUMAN_TASK__PLANNING_TABLE:
				return basicSetPlanningTable(null, msgs);
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
			case CaseModelPackage.THUMAN_TASK__PLANNING_TABLE:
				return getPlanningTable();
			case CaseModelPackage.THUMAN_TASK__PERFORMER_REF:
				return getPerformerRef();
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
			case CaseModelPackage.THUMAN_TASK__PLANNING_TABLE:
				setPlanningTable((TPlanningTable)newValue);
				return;
			case CaseModelPackage.THUMAN_TASK__PERFORMER_REF:
				setPerformerRef((String)newValue);
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
			case CaseModelPackage.THUMAN_TASK__PLANNING_TABLE:
				setPlanningTable((TPlanningTable)null);
				return;
			case CaseModelPackage.THUMAN_TASK__PERFORMER_REF:
				setPerformerRef(PERFORMER_REF_EDEFAULT);
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
			case CaseModelPackage.THUMAN_TASK__PLANNING_TABLE:
				return planningTable != null;
			case CaseModelPackage.THUMAN_TASK__PERFORMER_REF:
				return PERFORMER_REF_EDEFAULT == null ? performerRef != null : !PERFORMER_REF_EDEFAULT.equals(performerRef);
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
		result.append(" (performerRef: ");
		result.append(performerRef);
		result.append(')');
		return result.toString();
	}

} //THumanTaskImpl
