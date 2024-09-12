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
package net.opengis.gml.gml.impl;

import java.math.BigInteger;

import java.util.List;

import net.opengis.gml.gml.DMSAngleType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.MeasureListType;
import net.opengis.gml.gml.MeasureType;
import net.opengis.gml.gml.OperationParameterPropertyType;
import net.opengis.gml.gml.ParameterValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getDmsAngleValue <em>Dms Angle Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getIntegerValueList <em>Integer Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getValueFile <em>Value File</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getOperationParameterGroup <em>Operation Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ParameterValueTypeImpl#getOperationParameter <em>Operation Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueTypeImpl extends AbstractGeneralParameterValueTypeImpl implements ParameterValueType {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected MeasureType value;

	/**
	 * The cached value of the '{@link #getDmsAngleValue() <em>Dms Angle Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmsAngleValue()
	 * @generated
	 * @ordered
	 */
	protected DMSAngleType dmsAngleValue;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INTEGER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger integerValue = INTEGER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

	/**
	 * This is true if the Boolean Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booleanValueESet;

	/**
	 * The cached value of the '{@link #getValueList() <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueList()
	 * @generated
	 * @ordered
	 */
	protected MeasureListType valueList;

	/**
	 * The default value of the '{@link #getIntegerValueList() <em>Integer Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValueList()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> INTEGER_VALUE_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegerValueList() <em>Integer Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValueList()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> integerValueList = INTEGER_VALUE_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueFile() <em>Value File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFile()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFile() <em>Value File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFile()
	 * @generated
	 * @ordered
	 */
	protected String valueFile = VALUE_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationParameterGroup() <em>Operation Parameter Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationParameterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap operationParameterGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getParameterValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(MeasureType newValue, NotificationChain msgs) {
		MeasureType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__VALUE, oldValue, newValue);
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
	public void setValue(MeasureType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PARAMETER_VALUE_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PARAMETER_VALUE_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMSAngleType getDmsAngleValue() {
		return dmsAngleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDmsAngleValue(DMSAngleType newDmsAngleValue, NotificationChain msgs) {
		DMSAngleType oldDmsAngleValue = dmsAngleValue;
		dmsAngleValue = newDmsAngleValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE, oldDmsAngleValue, newDmsAngleValue);
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
	public void setDmsAngleValue(DMSAngleType newDmsAngleValue) {
		if (newDmsAngleValue != dmsAngleValue) {
			NotificationChain msgs = null;
			if (dmsAngleValue != null)
				msgs = ((InternalEObject)dmsAngleValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE, null, msgs);
			if (newDmsAngleValue != null)
				msgs = ((InternalEObject)newDmsAngleValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE, null, msgs);
			msgs = basicSetDmsAngleValue(newDmsAngleValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE, newDmsAngleValue, newDmsAngleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getIntegerValue() {
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegerValue(BigInteger newIntegerValue) {
		BigInteger oldIntegerValue = integerValue;
		integerValue = newIntegerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE, oldIntegerValue, integerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanValue(boolean newBooleanValue) {
		boolean oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__BOOLEAN_VALUE, oldBooleanValue, booleanValue, !oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBooleanValue() {
		boolean oldBooleanValue = booleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValue = BOOLEAN_VALUE_EDEFAULT;
		booleanValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.PARAMETER_VALUE_TYPE__BOOLEAN_VALUE, oldBooleanValue, BOOLEAN_VALUE_EDEFAULT, oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBooleanValue() {
		return booleanValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureListType getValueList() {
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueList(MeasureListType newValueList, NotificationChain msgs) {
		MeasureListType oldValueList = valueList;
		valueList = newValueList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST, oldValueList, newValueList);
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
	public void setValueList(MeasureListType newValueList) {
		if (newValueList != valueList) {
			NotificationChain msgs = null;
			if (valueList != null)
				msgs = ((InternalEObject)valueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST, null, msgs);
			if (newValueList != null)
				msgs = ((InternalEObject)newValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST, null, msgs);
			msgs = basicSetValueList(newValueList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST, newValueList, newValueList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<BigInteger> getIntegerValueList() {
		return integerValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegerValueList(List<BigInteger> newIntegerValueList) {
		List<BigInteger> oldIntegerValueList = integerValueList;
		integerValueList = newIntegerValueList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE_LIST, oldIntegerValueList, integerValueList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueFile() {
		return valueFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueFile(String newValueFile) {
		String oldValueFile = valueFile;
		valueFile = newValueFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PARAMETER_VALUE_TYPE__VALUE_FILE, oldValueFile, valueFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getOperationParameterGroup() {
		if (operationParameterGroup == null) {
			operationParameterGroup = new BasicFeatureMap(this, GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER_GROUP);
		}
		return operationParameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterPropertyType getOperationParameter() {
		return (OperationParameterPropertyType)getOperationParameterGroup().get(GMLPackage.eINSTANCE.getParameterValueType_OperationParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameter(OperationParameterPropertyType newOperationParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getOperationParameterGroup()).basicAdd(GMLPackage.eINSTANCE.getParameterValueType_OperationParameter(), newOperationParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationParameter(OperationParameterPropertyType newOperationParameter) {
		((FeatureMap.Internal)getOperationParameterGroup()).set(GMLPackage.eINSTANCE.getParameterValueType_OperationParameter(), newOperationParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE:
				return basicSetValue(null, msgs);
			case GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE:
				return basicSetDmsAngleValue(null, msgs);
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST:
				return basicSetValueList(null, msgs);
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER_GROUP:
				return ((InternalEList<?>)getOperationParameterGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER:
				return basicSetOperationParameter(null, msgs);
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
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE:
				return getValue();
			case GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE:
				return getDmsAngleValue();
			case GMLPackage.PARAMETER_VALUE_TYPE__STRING_VALUE:
				return getStringValue();
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE:
				return getIntegerValue();
			case GMLPackage.PARAMETER_VALUE_TYPE__BOOLEAN_VALUE:
				return isBooleanValue();
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST:
				return getValueList();
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE_LIST:
				return getIntegerValueList();
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_FILE:
				return getValueFile();
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER_GROUP:
				if (coreType) return getOperationParameterGroup();
				return ((FeatureMap.Internal)getOperationParameterGroup()).getWrapper();
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER:
				return getOperationParameter();
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
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE:
				setValue((MeasureType)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE:
				setDmsAngleValue((DMSAngleType)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE:
				setIntegerValue((BigInteger)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__BOOLEAN_VALUE:
				setBooleanValue((Boolean)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST:
				setValueList((MeasureListType)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE_LIST:
				setIntegerValueList((List<BigInteger>)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_FILE:
				setValueFile((String)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER_GROUP:
				((FeatureMap.Internal)getOperationParameterGroup()).set(newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER:
				setOperationParameter((OperationParameterPropertyType)newValue);
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
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE:
				setValue((MeasureType)null);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE:
				setDmsAngleValue((DMSAngleType)null);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE:
				setIntegerValue(INTEGER_VALUE_EDEFAULT);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__BOOLEAN_VALUE:
				unsetBooleanValue();
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST:
				setValueList((MeasureListType)null);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE_LIST:
				setIntegerValueList(INTEGER_VALUE_LIST_EDEFAULT);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_FILE:
				setValueFile(VALUE_FILE_EDEFAULT);
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER_GROUP:
				getOperationParameterGroup().clear();
				return;
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER:
				setOperationParameter((OperationParameterPropertyType)null);
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
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE:
				return value != null;
			case GMLPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE:
				return dmsAngleValue != null;
			case GMLPackage.PARAMETER_VALUE_TYPE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE:
				return INTEGER_VALUE_EDEFAULT == null ? integerValue != null : !INTEGER_VALUE_EDEFAULT.equals(integerValue);
			case GMLPackage.PARAMETER_VALUE_TYPE__BOOLEAN_VALUE:
				return isSetBooleanValue();
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_LIST:
				return valueList != null;
			case GMLPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE_LIST:
				return INTEGER_VALUE_LIST_EDEFAULT == null ? integerValueList != null : !INTEGER_VALUE_LIST_EDEFAULT.equals(integerValueList);
			case GMLPackage.PARAMETER_VALUE_TYPE__VALUE_FILE:
				return VALUE_FILE_EDEFAULT == null ? valueFile != null : !VALUE_FILE_EDEFAULT.equals(valueFile);
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER_GROUP:
				return operationParameterGroup != null && !operationParameterGroup.isEmpty();
			case GMLPackage.PARAMETER_VALUE_TYPE__OPERATION_PARAMETER:
				return getOperationParameter() != null;
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
		result.append(" (stringValue: ");
		result.append(stringValue);
		result.append(", integerValue: ");
		result.append(integerValue);
		result.append(", booleanValue: ");
		if (booleanValueESet) result.append(booleanValue); else result.append("<unset>");
		result.append(", integerValueList: ");
		result.append(integerValueList);
		result.append(", valueFile: ");
		result.append(valueFile);
		result.append(", operationParameterGroup: ");
		result.append(operationParameterGroup);
		result.append(')');
		return result.toString();
	}

} //ParameterValueTypeImpl
