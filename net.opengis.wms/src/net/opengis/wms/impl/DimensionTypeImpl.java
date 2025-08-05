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
package net.opengis.wms.impl;

import net.opengis.wms.DimensionType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#isCurrent <em>Current</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#isMultipleValues <em>Multiple Values</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#isNearestValue <em>Nearest Value</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DimensionTypeImpl#getUnitSymbol <em>Unit Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionTypeImpl extends MinimalEObjectImpl.Container implements DimensionType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected boolean current = CURRENT_EDEFAULT;

	/**
	 * This is true if the Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentESet;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultipleValues() <em>Multiple Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleValues() <em>Multiple Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleValues()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleValues = MULTIPLE_VALUES_EDEFAULT;

	/**
	 * This is true if the Multiple Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleValuesESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isNearestValue() <em>Nearest Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNearestValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEAREST_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNearestValue() <em>Nearest Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNearestValue()
	 * @generated
	 * @ordered
	 */
	protected boolean nearestValue = NEAREST_VALUE_EDEFAULT;

	/**
	 * This is true if the Nearest Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nearestValueESet;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected String unitSymbol = UNIT_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.DIMENSION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrent(boolean newCurrent) {
		boolean oldCurrent = current;
		current = newCurrent;
		boolean oldCurrentESet = currentESet;
		currentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__CURRENT, oldCurrent, current, !oldCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCurrent() {
		boolean oldCurrent = current;
		boolean oldCurrentESet = currentESet;
		current = CURRENT_EDEFAULT;
		currentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.DIMENSION_TYPE__CURRENT, oldCurrent, CURRENT_EDEFAULT, oldCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCurrent() {
		return currentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultipleValues() {
		return multipleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleValues(boolean newMultipleValues) {
		boolean oldMultipleValues = multipleValues;
		multipleValues = newMultipleValues;
		boolean oldMultipleValuesESet = multipleValuesESet;
		multipleValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__MULTIPLE_VALUES, oldMultipleValues, multipleValues, !oldMultipleValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMultipleValues() {
		boolean oldMultipleValues = multipleValues;
		boolean oldMultipleValuesESet = multipleValuesESet;
		multipleValues = MULTIPLE_VALUES_EDEFAULT;
		multipleValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.DIMENSION_TYPE__MULTIPLE_VALUES, oldMultipleValues, MULTIPLE_VALUES_EDEFAULT, oldMultipleValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMultipleValues() {
		return multipleValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNearestValue() {
		return nearestValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNearestValue(boolean newNearestValue) {
		boolean oldNearestValue = nearestValue;
		nearestValue = newNearestValue;
		boolean oldNearestValueESet = nearestValueESet;
		nearestValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__NEAREST_VALUE, oldNearestValue, nearestValue, !oldNearestValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNearestValue() {
		boolean oldNearestValue = nearestValue;
		boolean oldNearestValueESet = nearestValueESet;
		nearestValue = NEAREST_VALUE_EDEFAULT;
		nearestValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WMSPackage.DIMENSION_TYPE__NEAREST_VALUE, oldNearestValue, NEAREST_VALUE_EDEFAULT, oldNearestValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNearestValue() {
		return nearestValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnitSymbol() {
		return unitSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitSymbol(String newUnitSymbol) {
		String oldUnitSymbol = unitSymbol;
		unitSymbol = newUnitSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.DIMENSION_TYPE__UNIT_SYMBOL, oldUnitSymbol, unitSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WMSPackage.DIMENSION_TYPE__VALUE:
				return getValue();
			case WMSPackage.DIMENSION_TYPE__CURRENT:
				return isCurrent();
			case WMSPackage.DIMENSION_TYPE__DEFAULT:
				return getDefault();
			case WMSPackage.DIMENSION_TYPE__MULTIPLE_VALUES:
				return isMultipleValues();
			case WMSPackage.DIMENSION_TYPE__NAME:
				return getName();
			case WMSPackage.DIMENSION_TYPE__NEAREST_VALUE:
				return isNearestValue();
			case WMSPackage.DIMENSION_TYPE__UNITS:
				return getUnits();
			case WMSPackage.DIMENSION_TYPE__UNIT_SYMBOL:
				return getUnitSymbol();
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
			case WMSPackage.DIMENSION_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case WMSPackage.DIMENSION_TYPE__CURRENT:
				setCurrent((Boolean)newValue);
				return;
			case WMSPackage.DIMENSION_TYPE__DEFAULT:
				setDefault((String)newValue);
				return;
			case WMSPackage.DIMENSION_TYPE__MULTIPLE_VALUES:
				setMultipleValues((Boolean)newValue);
				return;
			case WMSPackage.DIMENSION_TYPE__NAME:
				setName((String)newValue);
				return;
			case WMSPackage.DIMENSION_TYPE__NEAREST_VALUE:
				setNearestValue((Boolean)newValue);
				return;
			case WMSPackage.DIMENSION_TYPE__UNITS:
				setUnits((String)newValue);
				return;
			case WMSPackage.DIMENSION_TYPE__UNIT_SYMBOL:
				setUnitSymbol((String)newValue);
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
			case WMSPackage.DIMENSION_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case WMSPackage.DIMENSION_TYPE__CURRENT:
				unsetCurrent();
				return;
			case WMSPackage.DIMENSION_TYPE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case WMSPackage.DIMENSION_TYPE__MULTIPLE_VALUES:
				unsetMultipleValues();
				return;
			case WMSPackage.DIMENSION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WMSPackage.DIMENSION_TYPE__NEAREST_VALUE:
				unsetNearestValue();
				return;
			case WMSPackage.DIMENSION_TYPE__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case WMSPackage.DIMENSION_TYPE__UNIT_SYMBOL:
				setUnitSymbol(UNIT_SYMBOL_EDEFAULT);
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
			case WMSPackage.DIMENSION_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case WMSPackage.DIMENSION_TYPE__CURRENT:
				return isSetCurrent();
			case WMSPackage.DIMENSION_TYPE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case WMSPackage.DIMENSION_TYPE__MULTIPLE_VALUES:
				return isSetMultipleValues();
			case WMSPackage.DIMENSION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WMSPackage.DIMENSION_TYPE__NEAREST_VALUE:
				return isSetNearestValue();
			case WMSPackage.DIMENSION_TYPE__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case WMSPackage.DIMENSION_TYPE__UNIT_SYMBOL:
				return UNIT_SYMBOL_EDEFAULT == null ? unitSymbol != null : !UNIT_SYMBOL_EDEFAULT.equals(unitSymbol);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", current: ");
		if (currentESet) result.append(current); else result.append("<unset>");
		result.append(", default: ");
		result.append(default_);
		result.append(", multipleValues: ");
		if (multipleValuesESet) result.append(multipleValues); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nearestValue: ");
		if (nearestValueESet) result.append(nearestValue); else result.append("<unset>");
		result.append(", units: ");
		result.append(units);
		result.append(", unitSymbol: ");
		result.append(unitSymbol);
		result.append(')');
		return result.toString();
	}

} //DimensionTypeImpl
