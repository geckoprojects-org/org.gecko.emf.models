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
import de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Box Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.BoundingBoxPointTypeImpl#getBoxPositionX <em>Box Position X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.BoundingBoxPointTypeImpl#getBoxPositionY <em>Box Position Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundingBoxPointTypeImpl extends PlacementRuleTypeImpl implements BoundingBoxPointType {
	/**
	 * The default value of the '{@link #getBoxPositionX() <em>Box Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_POSITION_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxPositionX() <em>Box Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxPositionX()
	 * @generated
	 * @ordered
	 */
	protected double boxPositionX = BOX_POSITION_X_EDEFAULT;

	/**
	 * This is true if the Box Position X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxPositionXESet;

	/**
	 * The default value of the '{@link #getBoxPositionY() <em>Box Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_POSITION_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxPositionY() <em>Box Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxPositionY()
	 * @generated
	 * @ordered
	 */
	protected double boxPositionY = BOX_POSITION_Y_EDEFAULT;

	/**
	 * This is true if the Box Position Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxPositionYESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundingBoxPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getBoundingBoxPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBoxPositionX() {
		return boxPositionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxPositionX(double newBoxPositionX) {
		double oldBoxPositionX = boxPositionX;
		boxPositionX = newBoxPositionX;
		boolean oldBoxPositionXESet = boxPositionXESet;
		boxPositionXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_X, oldBoxPositionX, boxPositionX, !oldBoxPositionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoxPositionX() {
		double oldBoxPositionX = boxPositionX;
		boolean oldBoxPositionXESet = boxPositionXESet;
		boxPositionX = BOX_POSITION_X_EDEFAULT;
		boxPositionXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_X, oldBoxPositionX, BOX_POSITION_X_EDEFAULT, oldBoxPositionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoxPositionX() {
		return boxPositionXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBoxPositionY() {
		return boxPositionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxPositionY(double newBoxPositionY) {
		double oldBoxPositionY = boxPositionY;
		boxPositionY = newBoxPositionY;
		boolean oldBoxPositionYESet = boxPositionYESet;
		boxPositionYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_Y, oldBoxPositionY, boxPositionY, !oldBoxPositionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoxPositionY() {
		double oldBoxPositionY = boxPositionY;
		boolean oldBoxPositionYESet = boxPositionYESet;
		boxPositionY = BOX_POSITION_Y_EDEFAULT;
		boxPositionYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_Y, oldBoxPositionY, BOX_POSITION_Y_EDEFAULT, oldBoxPositionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoxPositionY() {
		return boxPositionYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_X:
				return getBoxPositionX();
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_Y:
				return getBoxPositionY();
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
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_X:
				setBoxPositionX((Double)newValue);
				return;
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_Y:
				setBoxPositionY((Double)newValue);
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
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_X:
				unsetBoxPositionX();
				return;
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_Y:
				unsetBoxPositionY();
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
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_X:
				return isSetBoxPositionX();
			case AAAPackage.BOUNDING_BOX_POINT_TYPE__BOX_POSITION_Y:
				return isSetBoxPositionY();
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
		result.append(" (boxPositionX: ");
		if (boxPositionXESet) result.append(boxPositionX); else result.append("<unset>");
		result.append(", boxPositionY: ");
		if (boxPositionYESet) result.append(boxPositionY); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BoundingBoxPointTypeImpl
