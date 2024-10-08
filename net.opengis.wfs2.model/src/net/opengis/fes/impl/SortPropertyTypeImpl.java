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
package net.opengis.fes.impl;

import net.opengis.fes.FESPackage;
import net.opengis.fes.SortOrderType;
import net.opengis.fes.SortPropertyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.SortPropertyTypeImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link net.opengis.fes.impl.SortPropertyTypeImpl#getSortOrder <em>Sort Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortPropertyTypeImpl extends MinimalEObjectImpl.Container implements SortPropertyType {
	/**
	 * The default value of the '{@link #getValueReference() <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected String valueReference = VALUE_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected static final SortOrderType SORT_ORDER_EDEFAULT = SortOrderType.DESC;

	/**
	 * The cached value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected SortOrderType sortOrder = SORT_ORDER_EDEFAULT;

	/**
	 * This is true if the Sort Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortOrderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.SORT_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueReference() {
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueReference(String newValueReference) {
		String oldValueReference = valueReference;
		valueReference = newValueReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.SORT_PROPERTY_TYPE__VALUE_REFERENCE, oldValueReference, valueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortOrderType getSortOrder() {
		return sortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortOrder(SortOrderType newSortOrder) {
		SortOrderType oldSortOrder = sortOrder;
		sortOrder = newSortOrder == null ? SORT_ORDER_EDEFAULT : newSortOrder;
		boolean oldSortOrderESet = sortOrderESet;
		sortOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.SORT_PROPERTY_TYPE__SORT_ORDER, oldSortOrder, sortOrder, !oldSortOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSortOrder() {
		SortOrderType oldSortOrder = sortOrder;
		boolean oldSortOrderESet = sortOrderESet;
		sortOrder = SORT_ORDER_EDEFAULT;
		sortOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FESPackage.SORT_PROPERTY_TYPE__SORT_ORDER, oldSortOrder, SORT_ORDER_EDEFAULT, oldSortOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSortOrder() {
		return sortOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FESPackage.SORT_PROPERTY_TYPE__VALUE_REFERENCE:
				return getValueReference();
			case FESPackage.SORT_PROPERTY_TYPE__SORT_ORDER:
				return getSortOrder();
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
			case FESPackage.SORT_PROPERTY_TYPE__VALUE_REFERENCE:
				setValueReference((String)newValue);
				return;
			case FESPackage.SORT_PROPERTY_TYPE__SORT_ORDER:
				setSortOrder((SortOrderType)newValue);
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
			case FESPackage.SORT_PROPERTY_TYPE__VALUE_REFERENCE:
				setValueReference(VALUE_REFERENCE_EDEFAULT);
				return;
			case FESPackage.SORT_PROPERTY_TYPE__SORT_ORDER:
				unsetSortOrder();
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
			case FESPackage.SORT_PROPERTY_TYPE__VALUE_REFERENCE:
				return VALUE_REFERENCE_EDEFAULT == null ? valueReference != null : !VALUE_REFERENCE_EDEFAULT.equals(valueReference);
			case FESPackage.SORT_PROPERTY_TYPE__SORT_ORDER:
				return isSetSortOrder();
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
		result.append(" (valueReference: ");
		result.append(valueReference);
		result.append(", sortOrder: ");
		if (sortOrderESet) result.append(sortOrder); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SortPropertyTypeImpl
