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
import de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Label Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointLabelTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointLabelTypeImpl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointLabelTypeImpl#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointLabelTypeImpl#getLineSpacing <em>Line Spacing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointLabelTypeImpl extends LabelType3Impl implements PointLabelType {
	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected double rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

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
	 * The default value of the '{@link #getLineSpacing() <em>Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double LINE_SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLineSpacing() <em>Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSpacing()
	 * @generated
	 * @ordered
	 */
	protected double lineSpacing = LINE_SPACING_EDEFAULT;

	/**
	 * This is true if the Line Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineSpacingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointLabelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getPointLabelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(double newRotation) {
		double oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINT_LABEL_TYPE__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRotation() {
		double oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINT_LABEL_TYPE__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRotation() {
		return rotationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_X, oldDisplacementX, displacementX, !oldDisplacementXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_X, oldDisplacementX, DISPLACEMENT_X_EDEFAULT, oldDisplacementXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_Y, oldDisplacementY, displacementY, !oldDisplacementYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_Y, oldDisplacementY, DISPLACEMENT_Y_EDEFAULT, oldDisplacementYESet));
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
	public double getLineSpacing() {
		return lineSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineSpacing(double newLineSpacing) {
		double oldLineSpacing = lineSpacing;
		lineSpacing = newLineSpacing;
		boolean oldLineSpacingESet = lineSpacingESet;
		lineSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINT_LABEL_TYPE__LINE_SPACING, oldLineSpacing, lineSpacing, !oldLineSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLineSpacing() {
		double oldLineSpacing = lineSpacing;
		boolean oldLineSpacingESet = lineSpacingESet;
		lineSpacing = LINE_SPACING_EDEFAULT;
		lineSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINT_LABEL_TYPE__LINE_SPACING, oldLineSpacing, LINE_SPACING_EDEFAULT, oldLineSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLineSpacing() {
		return lineSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.POINT_LABEL_TYPE__ROTATION:
				return getRotation();
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_X:
				return getDisplacementX();
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_Y:
				return getDisplacementY();
			case AAAPackage.POINT_LABEL_TYPE__LINE_SPACING:
				return getLineSpacing();
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
			case AAAPackage.POINT_LABEL_TYPE__ROTATION:
				setRotation((Double)newValue);
				return;
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_X:
				setDisplacementX((Double)newValue);
				return;
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_Y:
				setDisplacementY((Double)newValue);
				return;
			case AAAPackage.POINT_LABEL_TYPE__LINE_SPACING:
				setLineSpacing((Double)newValue);
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
			case AAAPackage.POINT_LABEL_TYPE__ROTATION:
				unsetRotation();
				return;
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_X:
				unsetDisplacementX();
				return;
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_Y:
				unsetDisplacementY();
				return;
			case AAAPackage.POINT_LABEL_TYPE__LINE_SPACING:
				unsetLineSpacing();
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
			case AAAPackage.POINT_LABEL_TYPE__ROTATION:
				return isSetRotation();
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_X:
				return isSetDisplacementX();
			case AAAPackage.POINT_LABEL_TYPE__DISPLACEMENT_Y:
				return isSetDisplacementY();
			case AAAPackage.POINT_LABEL_TYPE__LINE_SPACING:
				return isSetLineSpacing();
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
		result.append(" (rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", displacementX: ");
		if (displacementXESet) result.append(displacementX); else result.append("<unset>");
		result.append(", displacementY: ");
		if (displacementYESet) result.append(displacementY); else result.append("<unset>");
		result.append(", lineSpacing: ");
		if (lineSpacingESet) result.append(lineSpacing); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PointLabelTypeImpl
