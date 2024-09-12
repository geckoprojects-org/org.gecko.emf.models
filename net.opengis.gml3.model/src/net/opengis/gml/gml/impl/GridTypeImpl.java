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

import java.util.Collection;
import java.util.List;

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GridLimitsType;
import net.opengis.gml.gml.GridType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.GridTypeImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GridTypeImpl#getAxisLabels1 <em>Axis Labels1</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GridTypeImpl#getAxisName <em>Axis Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GridTypeImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridTypeImpl extends AbstractGeometryTypeImpl implements GridType {
	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected GridLimitsType limits;

	/**
	 * The default value of the '{@link #getAxisLabels1() <em>Axis Labels1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLabels1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> AXIS_LABELS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxisLabels1() <em>Axis Labels1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLabels1()
	 * @generated
	 * @ordered
	 */
	protected List<String> axisLabels1 = AXIS_LABELS1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAxisName() <em>Axis Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> axisName;

	/**
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dimension = DIMENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGridType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridLimitsType getLimits() {
		return limits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimits(GridLimitsType newLimits, NotificationChain msgs) {
		GridLimitsType oldLimits = limits;
		limits = newLimits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GRID_TYPE__LIMITS, oldLimits, newLimits);
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
	public void setLimits(GridLimitsType newLimits) {
		if (newLimits != limits) {
			NotificationChain msgs = null;
			if (limits != null)
				msgs = ((InternalEObject)limits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GRID_TYPE__LIMITS, null, msgs);
			if (newLimits != null)
				msgs = ((InternalEObject)newLimits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GRID_TYPE__LIMITS, null, msgs);
			msgs = basicSetLimits(newLimits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GRID_TYPE__LIMITS, newLimits, newLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAxisLabels1() {
		return axisLabels1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxisLabels1(List<String> newAxisLabels1) {
		List<String> oldAxisLabels1 = axisLabels1;
		axisLabels1 = newAxisLabels1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GRID_TYPE__AXIS_LABELS1, oldAxisLabels1, axisLabels1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAxisName() {
		if (axisName == null) {
			axisName = new EDataTypeEList<String>(String.class, this, GMLPackage.GRID_TYPE__AXIS_NAME);
		}
		return axisName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimension(BigInteger newDimension) {
		BigInteger oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GRID_TYPE__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GRID_TYPE__LIMITS:
				return basicSetLimits(null, msgs);
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
			case GMLPackage.GRID_TYPE__LIMITS:
				return getLimits();
			case GMLPackage.GRID_TYPE__AXIS_LABELS1:
				return getAxisLabels1();
			case GMLPackage.GRID_TYPE__AXIS_NAME:
				return getAxisName();
			case GMLPackage.GRID_TYPE__DIMENSION:
				return getDimension();
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
			case GMLPackage.GRID_TYPE__LIMITS:
				setLimits((GridLimitsType)newValue);
				return;
			case GMLPackage.GRID_TYPE__AXIS_LABELS1:
				setAxisLabels1((List<String>)newValue);
				return;
			case GMLPackage.GRID_TYPE__AXIS_NAME:
				getAxisName().clear();
				getAxisName().addAll((Collection<? extends String>)newValue);
				return;
			case GMLPackage.GRID_TYPE__DIMENSION:
				setDimension((BigInteger)newValue);
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
			case GMLPackage.GRID_TYPE__LIMITS:
				setLimits((GridLimitsType)null);
				return;
			case GMLPackage.GRID_TYPE__AXIS_LABELS1:
				setAxisLabels1(AXIS_LABELS1_EDEFAULT);
				return;
			case GMLPackage.GRID_TYPE__AXIS_NAME:
				getAxisName().clear();
				return;
			case GMLPackage.GRID_TYPE__DIMENSION:
				setDimension(DIMENSION_EDEFAULT);
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
			case GMLPackage.GRID_TYPE__LIMITS:
				return limits != null;
			case GMLPackage.GRID_TYPE__AXIS_LABELS1:
				return AXIS_LABELS1_EDEFAULT == null ? axisLabels1 != null : !AXIS_LABELS1_EDEFAULT.equals(axisLabels1);
			case GMLPackage.GRID_TYPE__AXIS_NAME:
				return axisName != null && !axisName.isEmpty();
			case GMLPackage.GRID_TYPE__DIMENSION:
				return DIMENSION_EDEFAULT == null ? dimension != null : !DIMENSION_EDEFAULT.equals(dimension);
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
		result.append(" (axisLabels1: ");
		result.append(axisLabels1);
		result.append(", axisName: ");
		result.append(axisName);
		result.append(", dimension: ");
		result.append(dimension);
		result.append(')');
		return result.toString();
	}

} //GridTypeImpl
