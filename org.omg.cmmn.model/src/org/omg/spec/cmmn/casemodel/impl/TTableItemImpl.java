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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TTableItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTableItemImpl#getApplicabilityRuleRefs <em>Applicability Rule Refs</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TTableItemImpl#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TTableItemImpl extends TCmmnElementImpl implements TTableItem {
	/**
	 * The default value of the '{@link #getApplicabilityRuleRefs() <em>Applicability Rule Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicabilityRuleRefs()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> APPLICABILITY_RULE_REFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicabilityRuleRefs() <em>Applicability Rule Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicabilityRuleRefs()
	 * @generated
	 * @ordered
	 */
	protected List<String> applicabilityRuleRefs = APPLICABILITY_RULE_REFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizedRoleRefs() <em>Authorized Role Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRoleRefs()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> AUTHORIZED_ROLE_REFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizedRoleRefs() <em>Authorized Role Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRoleRefs()
	 * @generated
	 * @ordered
	 */
	protected List<String> authorizedRoleRefs = AUTHORIZED_ROLE_REFS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TTABLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getApplicabilityRuleRefs() {
		return applicabilityRuleRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicabilityRuleRefs(List<String> newApplicabilityRuleRefs) {
		List<String> oldApplicabilityRuleRefs = applicabilityRuleRefs;
		applicabilityRuleRefs = newApplicabilityRuleRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TTABLE_ITEM__APPLICABILITY_RULE_REFS, oldApplicabilityRuleRefs, applicabilityRuleRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAuthorizedRoleRefs() {
		return authorizedRoleRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizedRoleRefs(List<String> newAuthorizedRoleRefs) {
		List<String> oldAuthorizedRoleRefs = authorizedRoleRefs;
		authorizedRoleRefs = newAuthorizedRoleRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TTABLE_ITEM__AUTHORIZED_ROLE_REFS, oldAuthorizedRoleRefs, authorizedRoleRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CaseModelPackage.TTABLE_ITEM__APPLICABILITY_RULE_REFS:
				return getApplicabilityRuleRefs();
			case CaseModelPackage.TTABLE_ITEM__AUTHORIZED_ROLE_REFS:
				return getAuthorizedRoleRefs();
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
			case CaseModelPackage.TTABLE_ITEM__APPLICABILITY_RULE_REFS:
				setApplicabilityRuleRefs((List<String>)newValue);
				return;
			case CaseModelPackage.TTABLE_ITEM__AUTHORIZED_ROLE_REFS:
				setAuthorizedRoleRefs((List<String>)newValue);
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
			case CaseModelPackage.TTABLE_ITEM__APPLICABILITY_RULE_REFS:
				setApplicabilityRuleRefs(APPLICABILITY_RULE_REFS_EDEFAULT);
				return;
			case CaseModelPackage.TTABLE_ITEM__AUTHORIZED_ROLE_REFS:
				setAuthorizedRoleRefs(AUTHORIZED_ROLE_REFS_EDEFAULT);
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
			case CaseModelPackage.TTABLE_ITEM__APPLICABILITY_RULE_REFS:
				return APPLICABILITY_RULE_REFS_EDEFAULT == null ? applicabilityRuleRefs != null : !APPLICABILITY_RULE_REFS_EDEFAULT.equals(applicabilityRuleRefs);
			case CaseModelPackage.TTABLE_ITEM__AUTHORIZED_ROLE_REFS:
				return AUTHORIZED_ROLE_REFS_EDEFAULT == null ? authorizedRoleRefs != null : !AUTHORIZED_ROLE_REFS_EDEFAULT.equals(authorizedRoleRefs);
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
		result.append(" (applicabilityRuleRefs: ");
		result.append(applicabilityRuleRefs);
		result.append(", authorizedRoleRefs: ");
		result.append(authorizedRoleRefs);
		result.append(')');
		return result.toString();
	}

} //TTableItemImpl
