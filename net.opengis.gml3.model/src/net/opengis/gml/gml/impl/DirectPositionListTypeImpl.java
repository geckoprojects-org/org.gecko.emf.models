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

import net.opengis.gml.gml.DirectPositionListType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Position List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.DirectPositionListTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectPositionListTypeImpl#getAxisLabels <em>Axis Labels</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectPositionListTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectPositionListTypeImpl#getSrsDimension <em>Srs Dimension</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectPositionListTypeImpl#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DirectPositionListTypeImpl#getUomLabels <em>Uom Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectPositionListTypeImpl extends MinimalEObjectImpl.Container implements DirectPositionListType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected List<Double> value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxisLabels() <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLabels()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> AXIS_LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxisLabels() <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLabels()
	 * @generated
	 * @ordered
	 */
	protected List<String> axisLabels = AXIS_LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrsDimension() <em>Srs Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SRS_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrsDimension() <em>Srs Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsDimension()
	 * @generated
	 * @ordered
	 */
	protected BigInteger srsDimension = SRS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrsName() <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsName()
	 * @generated
	 * @ordered
	 */
	protected static final String SRS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrsName() <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsName()
	 * @generated
	 * @ordered
	 */
	protected String srsName = SRS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUomLabels() <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomLabels()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> UOM_LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUomLabels() <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomLabels()
	 * @generated
	 * @ordered
	 */
	protected List<String> uomLabels = UOM_LABELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectPositionListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDirectPositionListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Double> getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(List<Double> newValue) {
		List<Double> oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECT_POSITION_LIST_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAxisLabels() {
		return axisLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxisLabels(List<String> newAxisLabels) {
		List<String> oldAxisLabels = axisLabels;
		axisLabels = newAxisLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECT_POSITION_LIST_TYPE__AXIS_LABELS, oldAxisLabels, axisLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(BigInteger newCount) {
		BigInteger oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECT_POSITION_LIST_TYPE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSrsDimension() {
		return srsDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrsDimension(BigInteger newSrsDimension) {
		BigInteger oldSrsDimension = srsDimension;
		srsDimension = newSrsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_DIMENSION, oldSrsDimension, srsDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrsName() {
		return srsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrsName(String newSrsName) {
		String oldSrsName = srsName;
		srsName = newSrsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_NAME, oldSrsName, srsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getUomLabels() {
		return uomLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomLabels(List<String> newUomLabels) {
		List<String> oldUomLabels = uomLabels;
		uomLabels = newUomLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECT_POSITION_LIST_TYPE__UOM_LABELS, oldUomLabels, uomLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__VALUE:
				return getValue();
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__AXIS_LABELS:
				return getAxisLabels();
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__COUNT:
				return getCount();
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_DIMENSION:
				return getSrsDimension();
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_NAME:
				return getSrsName();
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__UOM_LABELS:
				return getUomLabels();
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
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__VALUE:
				setValue((List<Double>)newValue);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__AXIS_LABELS:
				setAxisLabels((List<String>)newValue);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__COUNT:
				setCount((BigInteger)newValue);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_DIMENSION:
				setSrsDimension((BigInteger)newValue);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_NAME:
				setSrsName((String)newValue);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__UOM_LABELS:
				setUomLabels((List<String>)newValue);
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
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__AXIS_LABELS:
				setAxisLabels(AXIS_LABELS_EDEFAULT);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_DIMENSION:
				setSrsDimension(SRS_DIMENSION_EDEFAULT);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_NAME:
				setSrsName(SRS_NAME_EDEFAULT);
				return;
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__UOM_LABELS:
				setUomLabels(UOM_LABELS_EDEFAULT);
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
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__AXIS_LABELS:
				return AXIS_LABELS_EDEFAULT == null ? axisLabels != null : !AXIS_LABELS_EDEFAULT.equals(axisLabels);
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_DIMENSION:
				return SRS_DIMENSION_EDEFAULT == null ? srsDimension != null : !SRS_DIMENSION_EDEFAULT.equals(srsDimension);
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__SRS_NAME:
				return SRS_NAME_EDEFAULT == null ? srsName != null : !SRS_NAME_EDEFAULT.equals(srsName);
			case GMLPackage.DIRECT_POSITION_LIST_TYPE__UOM_LABELS:
				return UOM_LABELS_EDEFAULT == null ? uomLabels != null : !UOM_LABELS_EDEFAULT.equals(uomLabels);
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
		result.append(", axisLabels: ");
		result.append(axisLabels);
		result.append(", count: ");
		result.append(count);
		result.append(", srsDimension: ");
		result.append(srsDimension);
		result.append(", srsName: ");
		result.append(srsName);
		result.append(", uomLabels: ");
		result.append(uomLabels);
		result.append(')');
		return result.toString();
	}

} //DirectPositionListTypeImpl
