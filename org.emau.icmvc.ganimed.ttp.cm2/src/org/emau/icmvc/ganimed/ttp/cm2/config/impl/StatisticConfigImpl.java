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
package org.emau.icmvc.ganimed.ttp.cm2.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage;
import org.emau.icmvc.ganimed.ttp.cm2.config.StatisticConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistic Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.StatisticConfigImpl#isCalculateDocumentDetails <em>Calculate Document Details</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.StatisticConfigImpl#isCalculatePolicyDetails <em>Calculate Policy Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticConfigImpl extends MinimalEObjectImpl.Container implements StatisticConfig {
	/**
	 * The default value of the '{@link #isCalculateDocumentDetails() <em>Calculate Document Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculateDocumentDetails()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCULATE_DOCUMENT_DETAILS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculateDocumentDetails() <em>Calculate Document Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculateDocumentDetails()
	 * @generated
	 * @ordered
	 */
	protected boolean calculateDocumentDetails = CALCULATE_DOCUMENT_DETAILS_EDEFAULT;

	/**
	 * This is true if the Calculate Document Details attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calculateDocumentDetailsESet;

	/**
	 * The default value of the '{@link #isCalculatePolicyDetails() <em>Calculate Policy Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculatePolicyDetails()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCULATE_POLICY_DETAILS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculatePolicyDetails() <em>Calculate Policy Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculatePolicyDetails()
	 * @generated
	 * @ordered
	 */
	protected boolean calculatePolicyDetails = CALCULATE_POLICY_DETAILS_EDEFAULT;

	/**
	 * This is true if the Calculate Policy Details attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calculatePolicyDetailsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.STATISTIC_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCalculateDocumentDetails() {
		return calculateDocumentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculateDocumentDetails(boolean newCalculateDocumentDetails) {
		boolean oldCalculateDocumentDetails = calculateDocumentDetails;
		calculateDocumentDetails = newCalculateDocumentDetails;
		boolean oldCalculateDocumentDetailsESet = calculateDocumentDetailsESet;
		calculateDocumentDetailsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS, oldCalculateDocumentDetails, calculateDocumentDetails, !oldCalculateDocumentDetailsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCalculateDocumentDetails() {
		boolean oldCalculateDocumentDetails = calculateDocumentDetails;
		boolean oldCalculateDocumentDetailsESet = calculateDocumentDetailsESet;
		calculateDocumentDetails = CALCULATE_DOCUMENT_DETAILS_EDEFAULT;
		calculateDocumentDetailsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS, oldCalculateDocumentDetails, CALCULATE_DOCUMENT_DETAILS_EDEFAULT, oldCalculateDocumentDetailsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCalculateDocumentDetails() {
		return calculateDocumentDetailsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCalculatePolicyDetails() {
		return calculatePolicyDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculatePolicyDetails(boolean newCalculatePolicyDetails) {
		boolean oldCalculatePolicyDetails = calculatePolicyDetails;
		calculatePolicyDetails = newCalculatePolicyDetails;
		boolean oldCalculatePolicyDetailsESet = calculatePolicyDetailsESet;
		calculatePolicyDetailsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS, oldCalculatePolicyDetails, calculatePolicyDetails, !oldCalculatePolicyDetailsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCalculatePolicyDetails() {
		boolean oldCalculatePolicyDetails = calculatePolicyDetails;
		boolean oldCalculatePolicyDetailsESet = calculatePolicyDetailsESet;
		calculatePolicyDetails = CALCULATE_POLICY_DETAILS_EDEFAULT;
		calculatePolicyDetailsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS, oldCalculatePolicyDetails, CALCULATE_POLICY_DETAILS_EDEFAULT, oldCalculatePolicyDetailsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCalculatePolicyDetails() {
		return calculatePolicyDetailsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS:
				return isCalculateDocumentDetails();
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS:
				return isCalculatePolicyDetails();
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
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS:
				setCalculateDocumentDetails((Boolean)newValue);
				return;
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS:
				setCalculatePolicyDetails((Boolean)newValue);
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
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS:
				unsetCalculateDocumentDetails();
				return;
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS:
				unsetCalculatePolicyDetails();
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
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_DOCUMENT_DETAILS:
				return isSetCalculateDocumentDetails();
			case ConfigPackage.STATISTIC_CONFIG__CALCULATE_POLICY_DETAILS:
				return isSetCalculatePolicyDetails();
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
		result.append(" (calculateDocumentDetails: ");
		if (calculateDocumentDetailsESet) result.append(calculateDocumentDetails); else result.append("<unset>");
		result.append(", calculatePolicyDetails: ");
		if (calculatePolicyDetailsESet) result.append(calculatePolicyDetails); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StatisticConfigImpl
