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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.PlanItemTransition;
import org.omg.spec.cmmn.casemodel.TPlanItemOnPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPlan Item On Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemOnPartImpl#getStandardEvent <em>Standard Event</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemOnPartImpl#getExitCriterionRef <em>Exit Criterion Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemOnPartImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPlanItemOnPartImpl extends TOnPartImpl implements TPlanItemOnPart {
	/**
	 * The default value of the '{@link #getStandardEvent() <em>Standard Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardEvent()
	 * @generated
	 * @ordered
	 */
	protected static final PlanItemTransition STANDARD_EVENT_EDEFAULT = PlanItemTransition.CLOSE;

	/**
	 * The cached value of the '{@link #getStandardEvent() <em>Standard Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardEvent()
	 * @generated
	 * @ordered
	 */
	protected PlanItemTransition standardEvent = STANDARD_EVENT_EDEFAULT;

	/**
	 * This is true if the Standard Event attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean standardEventESet;

	/**
	 * The default value of the '{@link #getExitCriterionRef() <em>Exit Criterion Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCriterionRef()
	 * @generated
	 * @ordered
	 */
	protected static final String EXIT_CRITERION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExitCriterionRef() <em>Exit Criterion Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCriterionRef()
	 * @generated
	 * @ordered
	 */
	protected String exitCriterionRef = EXIT_CRITERION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected String sourceRef = SOURCE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPlanItemOnPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TPLAN_ITEM_ON_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanItemTransition getStandardEvent() {
		return standardEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardEvent(PlanItemTransition newStandardEvent) {
		PlanItemTransition oldStandardEvent = standardEvent;
		standardEvent = newStandardEvent == null ? STANDARD_EVENT_EDEFAULT : newStandardEvent;
		boolean oldStandardEventESet = standardEventESet;
		standardEventESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPLAN_ITEM_ON_PART__STANDARD_EVENT, oldStandardEvent, standardEvent, !oldStandardEventESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStandardEvent() {
		PlanItemTransition oldStandardEvent = standardEvent;
		boolean oldStandardEventESet = standardEventESet;
		standardEvent = STANDARD_EVENT_EDEFAULT;
		standardEventESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CaseModelPackage.TPLAN_ITEM_ON_PART__STANDARD_EVENT, oldStandardEvent, STANDARD_EVENT_EDEFAULT, oldStandardEventESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStandardEvent() {
		return standardEventESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExitCriterionRef() {
		return exitCriterionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitCriterionRef(String newExitCriterionRef) {
		String oldExitCriterionRef = exitCriterionRef;
		exitCriterionRef = newExitCriterionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF, oldExitCriterionRef, exitCriterionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRef(String newSourceRef) {
		String oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPLAN_ITEM_ON_PART__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CaseModelPackage.TPLAN_ITEM_ON_PART__STANDARD_EVENT:
				return getStandardEvent();
			case CaseModelPackage.TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF:
				return getExitCriterionRef();
			case CaseModelPackage.TPLAN_ITEM_ON_PART__SOURCE_REF:
				return getSourceRef();
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
			case CaseModelPackage.TPLAN_ITEM_ON_PART__STANDARD_EVENT:
				setStandardEvent((PlanItemTransition)newValue);
				return;
			case CaseModelPackage.TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF:
				setExitCriterionRef((String)newValue);
				return;
			case CaseModelPackage.TPLAN_ITEM_ON_PART__SOURCE_REF:
				setSourceRef((String)newValue);
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
			case CaseModelPackage.TPLAN_ITEM_ON_PART__STANDARD_EVENT:
				unsetStandardEvent();
				return;
			case CaseModelPackage.TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF:
				setExitCriterionRef(EXIT_CRITERION_REF_EDEFAULT);
				return;
			case CaseModelPackage.TPLAN_ITEM_ON_PART__SOURCE_REF:
				setSourceRef(SOURCE_REF_EDEFAULT);
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
			case CaseModelPackage.TPLAN_ITEM_ON_PART__STANDARD_EVENT:
				return isSetStandardEvent();
			case CaseModelPackage.TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF:
				return EXIT_CRITERION_REF_EDEFAULT == null ? exitCriterionRef != null : !EXIT_CRITERION_REF_EDEFAULT.equals(exitCriterionRef);
			case CaseModelPackage.TPLAN_ITEM_ON_PART__SOURCE_REF:
				return SOURCE_REF_EDEFAULT == null ? sourceRef != null : !SOURCE_REF_EDEFAULT.equals(sourceRef);
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
		result.append(" (standardEvent: ");
		if (standardEventESet) result.append(standardEvent); else result.append("<unset>");
		result.append(", exitCriterionRef: ");
		result.append(exitCriterionRef);
		result.append(", sourceRef: ");
		result.append(sourceRef);
		result.append(')');
		return result.toString();
	}

} //TPlanItemOnPartImpl
