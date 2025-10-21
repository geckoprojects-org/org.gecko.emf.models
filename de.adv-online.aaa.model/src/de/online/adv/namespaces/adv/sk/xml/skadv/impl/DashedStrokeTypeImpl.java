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
import de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType;
import de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dashed Stroke Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DashedStrokeTypeImpl#getDasharray <em>Dasharray</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DashedStrokeTypeImpl#getAdjustment <em>Adjustment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DashedStrokeTypeImpl extends SolidOrDashedStrokeTypeImpl implements DashedStrokeType {
	/**
	 * The default value of the '{@link #getDasharray() <em>Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDasharray()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> DASHARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDasharray() <em>Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDasharray()
	 * @generated
	 * @ordered
	 */
	protected List<Double> dasharray = DASHARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final AdjustmentType ADJUSTMENT_EDEFAULT = AdjustmentType.NONE;

	/**
	 * The cached value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected AdjustmentType adjustment = ADJUSTMENT_EDEFAULT;

	/**
	 * This is true if the Adjustment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adjustmentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashedStrokeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getDashedStrokeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Double> getDasharray() {
		return dasharray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDasharray(List<Double> newDasharray) {
		List<Double> oldDasharray = dasharray;
		dasharray = newDasharray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.DASHED_STROKE_TYPE__DASHARRAY, oldDasharray, dasharray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdjustmentType getAdjustment() {
		return adjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjustment(AdjustmentType newAdjustment) {
		AdjustmentType oldAdjustment = adjustment;
		adjustment = newAdjustment == null ? ADJUSTMENT_EDEFAULT : newAdjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.DASHED_STROKE_TYPE__ADJUSTMENT, oldAdjustment, adjustment, !oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAdjustment() {
		AdjustmentType oldAdjustment = adjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustment = ADJUSTMENT_EDEFAULT;
		adjustmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.DASHED_STROKE_TYPE__ADJUSTMENT, oldAdjustment, ADJUSTMENT_EDEFAULT, oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAdjustment() {
		return adjustmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.DASHED_STROKE_TYPE__DASHARRAY:
				return getDasharray();
			case AAAPackage.DASHED_STROKE_TYPE__ADJUSTMENT:
				return getAdjustment();
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
			case AAAPackage.DASHED_STROKE_TYPE__DASHARRAY:
				setDasharray((List<Double>)newValue);
				return;
			case AAAPackage.DASHED_STROKE_TYPE__ADJUSTMENT:
				setAdjustment((AdjustmentType)newValue);
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
			case AAAPackage.DASHED_STROKE_TYPE__DASHARRAY:
				setDasharray(DASHARRAY_EDEFAULT);
				return;
			case AAAPackage.DASHED_STROKE_TYPE__ADJUSTMENT:
				unsetAdjustment();
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
			case AAAPackage.DASHED_STROKE_TYPE__DASHARRAY:
				return DASHARRAY_EDEFAULT == null ? dasharray != null : !DASHARRAY_EDEFAULT.equals(dasharray);
			case AAAPackage.DASHED_STROKE_TYPE__ADJUSTMENT:
				return isSetAdjustment();
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
		result.append(" (dasharray: ");
		result.append(dasharray);
		result.append(", adjustment: ");
		if (adjustmentESet) result.append(adjustment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DashedStrokeTypeImpl
