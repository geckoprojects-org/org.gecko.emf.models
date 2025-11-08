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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.FairnessAssessmentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fairness Assessment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FairnessAssessmentTypeImpl#getGroupAtRisk <em>Group At Risk</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FairnessAssessmentTypeImpl#getBenefits <em>Benefits</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FairnessAssessmentTypeImpl#getHarms <em>Harms</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.FairnessAssessmentTypeImpl#getMitigationStrategy <em>Mitigation Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FairnessAssessmentTypeImpl extends MinimalEObjectImpl.Container implements FairnessAssessmentType {
	/**
	 * The default value of the '{@link #getGroupAtRisk() <em>Group At Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAtRisk()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_AT_RISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupAtRisk() <em>Group At Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAtRisk()
	 * @generated
	 * @ordered
	 */
	protected String groupAtRisk = GROUP_AT_RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getBenefits() <em>Benefits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefits()
	 * @generated
	 * @ordered
	 */
	protected static final String BENEFITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBenefits() <em>Benefits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefits()
	 * @generated
	 * @ordered
	 */
	protected String benefits = BENEFITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHarms() <em>Harms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarms()
	 * @generated
	 * @ordered
	 */
	protected static final String HARMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHarms() <em>Harms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarms()
	 * @generated
	 * @ordered
	 */
	protected String harms = HARMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMitigationStrategy() <em>Mitigation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String MITIGATION_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMitigationStrategy() <em>Mitigation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationStrategy()
	 * @generated
	 * @ordered
	 */
	protected String mitigationStrategy = MITIGATION_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FairnessAssessmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getFairnessAssessmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupAtRisk() {
		return groupAtRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupAtRisk(String newGroupAtRisk) {
		String oldGroupAtRisk = groupAtRisk;
		groupAtRisk = newGroupAtRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FAIRNESS_ASSESSMENT_TYPE__GROUP_AT_RISK, oldGroupAtRisk, groupAtRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBenefits() {
		return benefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefits(String newBenefits) {
		String oldBenefits = benefits;
		benefits = newBenefits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FAIRNESS_ASSESSMENT_TYPE__BENEFITS, oldBenefits, benefits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHarms() {
		return harms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHarms(String newHarms) {
		String oldHarms = harms;
		harms = newHarms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FAIRNESS_ASSESSMENT_TYPE__HARMS, oldHarms, harms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMitigationStrategy() {
		return mitigationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitigationStrategy(String newMitigationStrategy) {
		String oldMitigationStrategy = mitigationStrategy;
		mitigationStrategy = newMitigationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.FAIRNESS_ASSESSMENT_TYPE__MITIGATION_STRATEGY, oldMitigationStrategy, mitigationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__GROUP_AT_RISK:
				return getGroupAtRisk();
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__BENEFITS:
				return getBenefits();
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__HARMS:
				return getHarms();
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__MITIGATION_STRATEGY:
				return getMitigationStrategy();
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
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__GROUP_AT_RISK:
				setGroupAtRisk((String)newValue);
				return;
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__BENEFITS:
				setBenefits((String)newValue);
				return;
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__HARMS:
				setHarms((String)newValue);
				return;
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__MITIGATION_STRATEGY:
				setMitigationStrategy((String)newValue);
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
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__GROUP_AT_RISK:
				setGroupAtRisk(GROUP_AT_RISK_EDEFAULT);
				return;
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__BENEFITS:
				setBenefits(BENEFITS_EDEFAULT);
				return;
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__HARMS:
				setHarms(HARMS_EDEFAULT);
				return;
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__MITIGATION_STRATEGY:
				setMitigationStrategy(MITIGATION_STRATEGY_EDEFAULT);
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
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__GROUP_AT_RISK:
				return GROUP_AT_RISK_EDEFAULT == null ? groupAtRisk != null : !GROUP_AT_RISK_EDEFAULT.equals(groupAtRisk);
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__BENEFITS:
				return BENEFITS_EDEFAULT == null ? benefits != null : !BENEFITS_EDEFAULT.equals(benefits);
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__HARMS:
				return HARMS_EDEFAULT == null ? harms != null : !HARMS_EDEFAULT.equals(harms);
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE__MITIGATION_STRATEGY:
				return MITIGATION_STRATEGY_EDEFAULT == null ? mitigationStrategy != null : !MITIGATION_STRATEGY_EDEFAULT.equals(mitigationStrategy);
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
		result.append(" (groupAtRisk: ");
		result.append(groupAtRisk);
		result.append(", benefits: ");
		result.append(benefits);
		result.append(", harms: ");
		result.append(harms);
		result.append(", mitigationStrategy: ");
		result.append(mitigationStrategy);
		result.append(')');
		return result.toString();
	}

} //FairnessAssessmentTypeImpl
