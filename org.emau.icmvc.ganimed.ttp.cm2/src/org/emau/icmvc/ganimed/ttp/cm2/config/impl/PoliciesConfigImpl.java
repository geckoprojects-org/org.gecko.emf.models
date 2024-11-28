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
import org.emau.icmvc.ganimed.ttp.cm2.config.PoliciesConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policies Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PoliciesConfigImpl#isPermanentRevoke <em>Permanent Revoke</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PoliciesConfigImpl#isTakeHighestVersionInsteadOfNewest <em>Take Highest Version Instead Of Newest</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.impl.PoliciesConfigImpl#isTakeMostSpecificValidityInsteadOfShortest <em>Take Most Specific Validity Instead Of Shortest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoliciesConfigImpl extends MinimalEObjectImpl.Container implements PoliciesConfig {
	/**
	 * The default value of the '{@link #isPermanentRevoke() <em>Permanent Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermanentRevoke()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERMANENT_REVOKE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPermanentRevoke() <em>Permanent Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermanentRevoke()
	 * @generated
	 * @ordered
	 */
	protected boolean permanentRevoke = PERMANENT_REVOKE_EDEFAULT;

	/**
	 * This is true if the Permanent Revoke attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permanentRevokeESet;

	/**
	 * The default value of the '{@link #isTakeHighestVersionInsteadOfNewest() <em>Take Highest Version Instead Of Newest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTakeHighestVersionInsteadOfNewest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTakeHighestVersionInsteadOfNewest() <em>Take Highest Version Instead Of Newest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTakeHighestVersionInsteadOfNewest()
	 * @generated
	 * @ordered
	 */
	protected boolean takeHighestVersionInsteadOfNewest = TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST_EDEFAULT;

	/**
	 * This is true if the Take Highest Version Instead Of Newest attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean takeHighestVersionInsteadOfNewestESet;

	/**
	 * The default value of the '{@link #isTakeMostSpecificValidityInsteadOfShortest() <em>Take Most Specific Validity Instead Of Shortest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTakeMostSpecificValidityInsteadOfShortest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTakeMostSpecificValidityInsteadOfShortest() <em>Take Most Specific Validity Instead Of Shortest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTakeMostSpecificValidityInsteadOfShortest()
	 * @generated
	 * @ordered
	 */
	protected boolean takeMostSpecificValidityInsteadOfShortest = TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST_EDEFAULT;

	/**
	 * This is true if the Take Most Specific Validity Instead Of Shortest attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean takeMostSpecificValidityInsteadOfShortestESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoliciesConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.POLICIES_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPermanentRevoke() {
		return permanentRevoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermanentRevoke(boolean newPermanentRevoke) {
		boolean oldPermanentRevoke = permanentRevoke;
		permanentRevoke = newPermanentRevoke;
		boolean oldPermanentRevokeESet = permanentRevokeESet;
		permanentRevokeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.POLICIES_CONFIG__PERMANENT_REVOKE, oldPermanentRevoke, permanentRevoke, !oldPermanentRevokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPermanentRevoke() {
		boolean oldPermanentRevoke = permanentRevoke;
		boolean oldPermanentRevokeESet = permanentRevokeESet;
		permanentRevoke = PERMANENT_REVOKE_EDEFAULT;
		permanentRevokeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.POLICIES_CONFIG__PERMANENT_REVOKE, oldPermanentRevoke, PERMANENT_REVOKE_EDEFAULT, oldPermanentRevokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPermanentRevoke() {
		return permanentRevokeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTakeHighestVersionInsteadOfNewest() {
		return takeHighestVersionInsteadOfNewest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTakeHighestVersionInsteadOfNewest(boolean newTakeHighestVersionInsteadOfNewest) {
		boolean oldTakeHighestVersionInsteadOfNewest = takeHighestVersionInsteadOfNewest;
		takeHighestVersionInsteadOfNewest = newTakeHighestVersionInsteadOfNewest;
		boolean oldTakeHighestVersionInsteadOfNewestESet = takeHighestVersionInsteadOfNewestESet;
		takeHighestVersionInsteadOfNewestESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST, oldTakeHighestVersionInsteadOfNewest, takeHighestVersionInsteadOfNewest, !oldTakeHighestVersionInsteadOfNewestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTakeHighestVersionInsteadOfNewest() {
		boolean oldTakeHighestVersionInsteadOfNewest = takeHighestVersionInsteadOfNewest;
		boolean oldTakeHighestVersionInsteadOfNewestESet = takeHighestVersionInsteadOfNewestESet;
		takeHighestVersionInsteadOfNewest = TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST_EDEFAULT;
		takeHighestVersionInsteadOfNewestESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST, oldTakeHighestVersionInsteadOfNewest, TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST_EDEFAULT, oldTakeHighestVersionInsteadOfNewestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTakeHighestVersionInsteadOfNewest() {
		return takeHighestVersionInsteadOfNewestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTakeMostSpecificValidityInsteadOfShortest() {
		return takeMostSpecificValidityInsteadOfShortest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTakeMostSpecificValidityInsteadOfShortest(boolean newTakeMostSpecificValidityInsteadOfShortest) {
		boolean oldTakeMostSpecificValidityInsteadOfShortest = takeMostSpecificValidityInsteadOfShortest;
		takeMostSpecificValidityInsteadOfShortest = newTakeMostSpecificValidityInsteadOfShortest;
		boolean oldTakeMostSpecificValidityInsteadOfShortestESet = takeMostSpecificValidityInsteadOfShortestESet;
		takeMostSpecificValidityInsteadOfShortestESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST, oldTakeMostSpecificValidityInsteadOfShortest, takeMostSpecificValidityInsteadOfShortest, !oldTakeMostSpecificValidityInsteadOfShortestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTakeMostSpecificValidityInsteadOfShortest() {
		boolean oldTakeMostSpecificValidityInsteadOfShortest = takeMostSpecificValidityInsteadOfShortest;
		boolean oldTakeMostSpecificValidityInsteadOfShortestESet = takeMostSpecificValidityInsteadOfShortestESet;
		takeMostSpecificValidityInsteadOfShortest = TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST_EDEFAULT;
		takeMostSpecificValidityInsteadOfShortestESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST, oldTakeMostSpecificValidityInsteadOfShortest, TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST_EDEFAULT, oldTakeMostSpecificValidityInsteadOfShortestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTakeMostSpecificValidityInsteadOfShortest() {
		return takeMostSpecificValidityInsteadOfShortestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.POLICIES_CONFIG__PERMANENT_REVOKE:
				return isPermanentRevoke();
			case ConfigPackage.POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST:
				return isTakeHighestVersionInsteadOfNewest();
			case ConfigPackage.POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST:
				return isTakeMostSpecificValidityInsteadOfShortest();
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
			case ConfigPackage.POLICIES_CONFIG__PERMANENT_REVOKE:
				setPermanentRevoke((Boolean)newValue);
				return;
			case ConfigPackage.POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST:
				setTakeHighestVersionInsteadOfNewest((Boolean)newValue);
				return;
			case ConfigPackage.POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST:
				setTakeMostSpecificValidityInsteadOfShortest((Boolean)newValue);
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
			case ConfigPackage.POLICIES_CONFIG__PERMANENT_REVOKE:
				unsetPermanentRevoke();
				return;
			case ConfigPackage.POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST:
				unsetTakeHighestVersionInsteadOfNewest();
				return;
			case ConfigPackage.POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST:
				unsetTakeMostSpecificValidityInsteadOfShortest();
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
			case ConfigPackage.POLICIES_CONFIG__PERMANENT_REVOKE:
				return isSetPermanentRevoke();
			case ConfigPackage.POLICIES_CONFIG__TAKE_HIGHEST_VERSION_INSTEAD_OF_NEWEST:
				return isSetTakeHighestVersionInsteadOfNewest();
			case ConfigPackage.POLICIES_CONFIG__TAKE_MOST_SPECIFIC_VALIDITY_INSTEAD_OF_SHORTEST:
				return isSetTakeMostSpecificValidityInsteadOfShortest();
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
		result.append(" (permanentRevoke: ");
		if (permanentRevokeESet) result.append(permanentRevoke); else result.append("<unset>");
		result.append(", takeHighestVersionInsteadOfNewest: ");
		if (takeHighestVersionInsteadOfNewestESet) result.append(takeHighestVersionInsteadOfNewest); else result.append("<unset>");
		result.append(", takeMostSpecificValidityInsteadOfShortest: ");
		if (takeMostSpecificValidityInsteadOfShortestESet) result.append(takeMostSpecificValidityInsteadOfShortest); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PoliciesConfigImpl
