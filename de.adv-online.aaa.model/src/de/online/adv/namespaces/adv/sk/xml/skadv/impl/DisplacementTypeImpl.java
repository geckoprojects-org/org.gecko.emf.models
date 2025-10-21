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
import de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Displacement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DisplacementTypeImpl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.DisplacementTypeImpl#getDisplacementY <em>Displacement Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplacementTypeImpl extends PlacementRuleTypeImpl implements DisplacementType {
	/**
	 * The default value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLACEMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected double displacementX = DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementXESet;

	/**
	 * The default value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLACEMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected double displacementY = DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementYESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplacementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getDisplacementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDisplacementX() {
		return displacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplacementX(double newDisplacementX) {
		double oldDisplacementX = displacementX;
		displacementX = newDisplacementX;
		boolean oldDisplacementXESet = displacementXESet;
		displacementXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_X, oldDisplacementX, displacementX, !oldDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDisplacementX() {
		double oldDisplacementX = displacementX;
		boolean oldDisplacementXESet = displacementXESet;
		displacementX = DISPLACEMENT_X_EDEFAULT;
		displacementXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_X, oldDisplacementX, DISPLACEMENT_X_EDEFAULT, oldDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDisplacementX() {
		return displacementXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDisplacementY() {
		return displacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplacementY(double newDisplacementY) {
		double oldDisplacementY = displacementY;
		displacementY = newDisplacementY;
		boolean oldDisplacementYESet = displacementYESet;
		displacementYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_Y, oldDisplacementY, displacementY, !oldDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDisplacementY() {
		double oldDisplacementY = displacementY;
		boolean oldDisplacementYESet = displacementYESet;
		displacementY = DISPLACEMENT_Y_EDEFAULT;
		displacementYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_Y, oldDisplacementY, DISPLACEMENT_Y_EDEFAULT, oldDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDisplacementY() {
		return displacementYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_X:
				return getDisplacementX();
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_Y:
				return getDisplacementY();
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
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_X:
				setDisplacementX((Double)newValue);
				return;
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_Y:
				setDisplacementY((Double)newValue);
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
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_X:
				unsetDisplacementX();
				return;
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_Y:
				unsetDisplacementY();
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
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_X:
				return isSetDisplacementX();
			case AAAPackage.DISPLACEMENT_TYPE__DISPLACEMENT_Y:
				return isSetDisplacementY();
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
		result.append(" (displacementX: ");
		if (displacementXESet) result.append(displacementX); else result.append("<unset>");
		result.append(", displacementY: ");
		if (displacementYESet) result.append(displacementY); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DisplacementTypeImpl
