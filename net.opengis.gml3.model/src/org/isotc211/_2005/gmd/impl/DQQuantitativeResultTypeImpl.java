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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RecordPropertyType;
import org.isotc211._2005.gco.RecordTypePropertyType;
import org.isotc211._2005.gco.UnitOfMeasurePropertyType;

import org.isotc211._2005.gmd.DQQuantitativeResultType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DQ Quantitative Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQQuantitativeResultTypeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQQuantitativeResultTypeImpl#getValueUnit <em>Value Unit</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQQuantitativeResultTypeImpl#getErrorStatistic <em>Error Statistic</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQQuantitativeResultTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DQQuantitativeResultTypeImpl extends AbstractDQResultTypeImpl implements DQQuantitativeResultType {
	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected RecordTypePropertyType valueType;

	/**
	 * The cached value of the '{@link #getValueUnit() <em>Value Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitOfMeasurePropertyType valueUnit;

	/**
	 * The cached value of the '{@link #getErrorStatistic() <em>Error Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorStatistic()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType errorStatistic;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordPropertyType> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DQQuantitativeResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getDQQuantitativeResultType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordTypePropertyType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueType(RecordTypePropertyType newValueType, NotificationChain msgs) {
		RecordTypePropertyType oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE, oldValueType, newValueType);
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
	public void setValueType(RecordTypePropertyType newValueType) {
		if (newValueType != valueType) {
			NotificationChain msgs = null;
			if (valueType != null)
				msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE, null, msgs);
			if (newValueType != null)
				msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE, null, msgs);
			msgs = basicSetValueType(newValueType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE, newValueType, newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitOfMeasurePropertyType getValueUnit() {
		return valueUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueUnit(UnitOfMeasurePropertyType newValueUnit, NotificationChain msgs) {
		UnitOfMeasurePropertyType oldValueUnit = valueUnit;
		valueUnit = newValueUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT, oldValueUnit, newValueUnit);
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
	public void setValueUnit(UnitOfMeasurePropertyType newValueUnit) {
		if (newValueUnit != valueUnit) {
			NotificationChain msgs = null;
			if (valueUnit != null)
				msgs = ((InternalEObject)valueUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT, null, msgs);
			if (newValueUnit != null)
				msgs = ((InternalEObject)newValueUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT, null, msgs);
			msgs = basicSetValueUnit(newValueUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT, newValueUnit, newValueUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getErrorStatistic() {
		return errorStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorStatistic(CharacterStringPropertyType newErrorStatistic, NotificationChain msgs) {
		CharacterStringPropertyType oldErrorStatistic = errorStatistic;
		errorStatistic = newErrorStatistic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC, oldErrorStatistic, newErrorStatistic);
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
	public void setErrorStatistic(CharacterStringPropertyType newErrorStatistic) {
		if (newErrorStatistic != errorStatistic) {
			NotificationChain msgs = null;
			if (errorStatistic != null)
				msgs = ((InternalEObject)errorStatistic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC, null, msgs);
			if (newErrorStatistic != null)
				msgs = ((InternalEObject)newErrorStatistic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC, null, msgs);
			msgs = basicSetErrorStatistic(newErrorStatistic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC, newErrorStatistic, newErrorStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecordPropertyType> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<RecordPropertyType>(RecordPropertyType.class, this, GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE:
				return basicSetValueType(null, msgs);
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT:
				return basicSetValueUnit(null, msgs);
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC:
				return basicSetErrorStatistic(null, msgs);
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE:
				return getValueType();
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT:
				return getValueUnit();
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC:
				return getErrorStatistic();
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE:
				return getValue();
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
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE:
				setValueType((RecordTypePropertyType)newValue);
				return;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT:
				setValueUnit((UnitOfMeasurePropertyType)newValue);
				return;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC:
				setErrorStatistic((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends RecordPropertyType>)newValue);
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
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE:
				setValueType((RecordTypePropertyType)null);
				return;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT:
				setValueUnit((UnitOfMeasurePropertyType)null);
				return;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC:
				setErrorStatistic((CharacterStringPropertyType)null);
				return;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE:
				getValue().clear();
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
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_TYPE:
				return valueType != null;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE_UNIT:
				return valueUnit != null;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__ERROR_STATISTIC:
				return errorStatistic != null;
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DQQuantitativeResultTypeImpl
