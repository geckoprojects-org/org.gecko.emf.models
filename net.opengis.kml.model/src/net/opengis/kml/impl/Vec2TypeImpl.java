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
package net.opengis.kml.impl;

import net.opengis.kml.KMLPackage;
import net.opengis.kml.UnitsEnumType;
import net.opengis.kml.Vec2Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vec2 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.Vec2TypeImpl#getX <em>X</em>}</li>
 *   <li>{@link net.opengis.kml.impl.Vec2TypeImpl#getXunits <em>Xunits</em>}</li>
 *   <li>{@link net.opengis.kml.impl.Vec2TypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.opengis.kml.impl.Vec2TypeImpl#getYunits <em>Yunits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vec2TypeImpl extends MinimalEObjectImpl.Container implements Vec2Type {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getXunits() <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXunits()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsEnumType XUNITS_EDEFAULT = UnitsEnumType.FRACTION;

	/**
	 * The cached value of the '{@link #getXunits() <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXunits()
	 * @generated
	 * @ordered
	 */
	protected UnitsEnumType xunits = XUNITS_EDEFAULT;

	/**
	 * This is true if the Xunits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xunitsESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * The default value of the '{@link #getYunits() <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYunits()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsEnumType YUNITS_EDEFAULT = UnitsEnumType.FRACTION;

	/**
	 * The cached value of the '{@link #getYunits() <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYunits()
	 * @generated
	 * @ordered
	 */
	protected UnitsEnumType yunits = YUNITS_EDEFAULT;

	/**
	 * This is true if the Yunits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yunitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vec2TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getVec2Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VEC2_TYPE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetX() {
		double oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VEC2_TYPE__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsEnumType getXunits() {
		return xunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXunits(UnitsEnumType newXunits) {
		UnitsEnumType oldXunits = xunits;
		xunits = newXunits == null ? XUNITS_EDEFAULT : newXunits;
		boolean oldXunitsESet = xunitsESet;
		xunitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VEC2_TYPE__XUNITS, oldXunits, xunits, !oldXunitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetXunits() {
		UnitsEnumType oldXunits = xunits;
		boolean oldXunitsESet = xunitsESet;
		xunits = XUNITS_EDEFAULT;
		xunitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VEC2_TYPE__XUNITS, oldXunits, XUNITS_EDEFAULT, oldXunitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetXunits() {
		return xunitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VEC2_TYPE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetY() {
		double oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VEC2_TYPE__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsEnumType getYunits() {
		return yunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYunits(UnitsEnumType newYunits) {
		UnitsEnumType oldYunits = yunits;
		yunits = newYunits == null ? YUNITS_EDEFAULT : newYunits;
		boolean oldYunitsESet = yunitsESet;
		yunitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VEC2_TYPE__YUNITS, oldYunits, yunits, !oldYunitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYunits() {
		UnitsEnumType oldYunits = yunits;
		boolean oldYunitsESet = yunitsESet;
		yunits = YUNITS_EDEFAULT;
		yunitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VEC2_TYPE__YUNITS, oldYunits, YUNITS_EDEFAULT, oldYunitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYunits() {
		return yunitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KMLPackage.VEC2_TYPE__X:
				return getX();
			case KMLPackage.VEC2_TYPE__XUNITS:
				return getXunits();
			case KMLPackage.VEC2_TYPE__Y:
				return getY();
			case KMLPackage.VEC2_TYPE__YUNITS:
				return getYunits();
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
			case KMLPackage.VEC2_TYPE__X:
				setX((Double)newValue);
				return;
			case KMLPackage.VEC2_TYPE__XUNITS:
				setXunits((UnitsEnumType)newValue);
				return;
			case KMLPackage.VEC2_TYPE__Y:
				setY((Double)newValue);
				return;
			case KMLPackage.VEC2_TYPE__YUNITS:
				setYunits((UnitsEnumType)newValue);
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
			case KMLPackage.VEC2_TYPE__X:
				unsetX();
				return;
			case KMLPackage.VEC2_TYPE__XUNITS:
				unsetXunits();
				return;
			case KMLPackage.VEC2_TYPE__Y:
				unsetY();
				return;
			case KMLPackage.VEC2_TYPE__YUNITS:
				unsetYunits();
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
			case KMLPackage.VEC2_TYPE__X:
				return isSetX();
			case KMLPackage.VEC2_TYPE__XUNITS:
				return isSetXunits();
			case KMLPackage.VEC2_TYPE__Y:
				return isSetY();
			case KMLPackage.VEC2_TYPE__YUNITS:
				return isSetYunits();
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
		result.append(" (x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", xunits: ");
		if (xunitsESet) result.append(xunits); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(", yunits: ");
		if (yunitsESet) result.append(yunits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Vec2TypeImpl
