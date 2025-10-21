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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalFilterType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maximum Adjacent Line String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.MaximumAdjacentLineStringTypeImpl#getAdditionalFilter <em>Additional Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaximumAdjacentLineStringTypeImpl extends PlacementRuleTypeImpl implements MaximumAdjacentLineStringType {
	/**
	 * The cached value of the '{@link #getAdditionalFilter() <em>Additional Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalFilter()
	 * @generated
	 * @ordered
	 */
	protected AdditionalFilterType1 additionalFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaximumAdjacentLineStringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getMaximumAdjacentLineStringType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalFilterType1 getAdditionalFilter() {
		return additionalFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalFilter(AdditionalFilterType1 newAdditionalFilter, NotificationChain msgs) {
		AdditionalFilterType1 oldAdditionalFilter = additionalFilter;
		additionalFilter = newAdditionalFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER, oldAdditionalFilter, newAdditionalFilter);
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
	public void setAdditionalFilter(AdditionalFilterType1 newAdditionalFilter) {
		if (newAdditionalFilter != additionalFilter) {
			NotificationChain msgs = null;
			if (additionalFilter != null)
				msgs = ((InternalEObject)additionalFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER, null, msgs);
			if (newAdditionalFilter != null)
				msgs = ((InternalEObject)newAdditionalFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER, null, msgs);
			msgs = basicSetAdditionalFilter(newAdditionalFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER, newAdditionalFilter, newAdditionalFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER:
				return basicSetAdditionalFilter(null, msgs);
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
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER:
				return getAdditionalFilter();
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
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER:
				setAdditionalFilter((AdditionalFilterType1)newValue);
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
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER:
				setAdditionalFilter((AdditionalFilterType1)null);
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
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE__ADDITIONAL_FILTER:
				return additionalFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //MaximumAdjacentLineStringTypeImpl
