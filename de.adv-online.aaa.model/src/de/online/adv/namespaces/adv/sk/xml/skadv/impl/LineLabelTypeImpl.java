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
import de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Label Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LineLabelTypeImpl#getPerpendicularOffset <em>Perpendicular Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineLabelTypeImpl extends LabelType3Impl implements LineLabelType {
	/**
	 * The default value of the '{@link #getPerpendicularOffset() <em>Perpendicular Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerpendicularOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double PERPENDICULAR_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPerpendicularOffset() <em>Perpendicular Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerpendicularOffset()
	 * @generated
	 * @ordered
	 */
	protected double perpendicularOffset = PERPENDICULAR_OFFSET_EDEFAULT;

	/**
	 * This is true if the Perpendicular Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean perpendicularOffsetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineLabelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getLineLabelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPerpendicularOffset() {
		return perpendicularOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerpendicularOffset(double newPerpendicularOffset) {
		double oldPerpendicularOffset = perpendicularOffset;
		perpendicularOffset = newPerpendicularOffset;
		boolean oldPerpendicularOffsetESet = perpendicularOffsetESet;
		perpendicularOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LINE_LABEL_TYPE__PERPENDICULAR_OFFSET, oldPerpendicularOffset, perpendicularOffset, !oldPerpendicularOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPerpendicularOffset() {
		double oldPerpendicularOffset = perpendicularOffset;
		boolean oldPerpendicularOffsetESet = perpendicularOffsetESet;
		perpendicularOffset = PERPENDICULAR_OFFSET_EDEFAULT;
		perpendicularOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.LINE_LABEL_TYPE__PERPENDICULAR_OFFSET, oldPerpendicularOffset, PERPENDICULAR_OFFSET_EDEFAULT, oldPerpendicularOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPerpendicularOffset() {
		return perpendicularOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.LINE_LABEL_TYPE__PERPENDICULAR_OFFSET:
				return getPerpendicularOffset();
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
			case AAAPackage.LINE_LABEL_TYPE__PERPENDICULAR_OFFSET:
				setPerpendicularOffset((Double)newValue);
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
			case AAAPackage.LINE_LABEL_TYPE__PERPENDICULAR_OFFSET:
				unsetPerpendicularOffset();
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
			case AAAPackage.LINE_LABEL_TYPE__PERPENDICULAR_OFFSET:
				return isSetPerpendicularOffset();
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
		result.append(" (perpendicularOffset: ");
		if (perpendicularOffsetESet) result.append(perpendicularOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LineLabelTypeImpl
