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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openmicroscopy.ome.EllipseType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.EllipseTypeImpl#getRadiusX <em>Radius X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.EllipseTypeImpl#getRadiusY <em>Radius Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.EllipseTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.EllipseTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EllipseTypeImpl extends ShapeImpl implements EllipseType {
	/**
	 * The default value of the '{@link #getRadiusX() <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusX()
	 * @generated
	 * @ordered
	 */
	protected static final float RADIUS_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRadiusX() <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusX()
	 * @generated
	 * @ordered
	 */
	protected float radiusX = RADIUS_X_EDEFAULT;

	/**
	 * This is true if the Radius X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiusXESet;

	/**
	 * The default value of the '{@link #getRadiusY() <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusY()
	 * @generated
	 * @ordered
	 */
	protected static final float RADIUS_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRadiusY() <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusY()
	 * @generated
	 * @ordered
	 */
	protected float radiusY = RADIUS_Y_EDEFAULT;

	/**
	 * This is true if the Radius Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiusYESet;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getEllipseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRadiusX() {
		return radiusX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadiusX(float newRadiusX) {
		float oldRadiusX = radiusX;
		radiusX = newRadiusX;
		boolean oldRadiusXESet = radiusXESet;
		radiusXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.ELLIPSE_TYPE__RADIUS_X, oldRadiusX, radiusX, !oldRadiusXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRadiusX() {
		float oldRadiusX = radiusX;
		boolean oldRadiusXESet = radiusXESet;
		radiusX = RADIUS_X_EDEFAULT;
		radiusXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.ELLIPSE_TYPE__RADIUS_X, oldRadiusX, RADIUS_X_EDEFAULT, oldRadiusXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRadiusX() {
		return radiusXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRadiusY() {
		return radiusY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadiusY(float newRadiusY) {
		float oldRadiusY = radiusY;
		radiusY = newRadiusY;
		boolean oldRadiusYESet = radiusYESet;
		radiusYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.ELLIPSE_TYPE__RADIUS_Y, oldRadiusY, radiusY, !oldRadiusYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRadiusY() {
		float oldRadiusY = radiusY;
		boolean oldRadiusYESet = radiusYESet;
		radiusY = RADIUS_Y_EDEFAULT;
		radiusYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.ELLIPSE_TYPE__RADIUS_Y, oldRadiusY, RADIUS_Y_EDEFAULT, oldRadiusYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRadiusY() {
		return radiusYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.ELLIPSE_TYPE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetX() {
		float oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.ELLIPSE_TYPE__X, oldX, X_EDEFAULT, oldXESet));
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
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.ELLIPSE_TYPE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetY() {
		float oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.ELLIPSE_TYPE__Y, oldY, Y_EDEFAULT, oldYESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.ELLIPSE_TYPE__RADIUS_X:
				return getRadiusX();
			case OMEPackage.ELLIPSE_TYPE__RADIUS_Y:
				return getRadiusY();
			case OMEPackage.ELLIPSE_TYPE__X:
				return getX();
			case OMEPackage.ELLIPSE_TYPE__Y:
				return getY();
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
			case OMEPackage.ELLIPSE_TYPE__RADIUS_X:
				setRadiusX((Float)newValue);
				return;
			case OMEPackage.ELLIPSE_TYPE__RADIUS_Y:
				setRadiusY((Float)newValue);
				return;
			case OMEPackage.ELLIPSE_TYPE__X:
				setX((Float)newValue);
				return;
			case OMEPackage.ELLIPSE_TYPE__Y:
				setY((Float)newValue);
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
			case OMEPackage.ELLIPSE_TYPE__RADIUS_X:
				unsetRadiusX();
				return;
			case OMEPackage.ELLIPSE_TYPE__RADIUS_Y:
				unsetRadiusY();
				return;
			case OMEPackage.ELLIPSE_TYPE__X:
				unsetX();
				return;
			case OMEPackage.ELLIPSE_TYPE__Y:
				unsetY();
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
			case OMEPackage.ELLIPSE_TYPE__RADIUS_X:
				return isSetRadiusX();
			case OMEPackage.ELLIPSE_TYPE__RADIUS_Y:
				return isSetRadiusY();
			case OMEPackage.ELLIPSE_TYPE__X:
				return isSetX();
			case OMEPackage.ELLIPSE_TYPE__Y:
				return isSetY();
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
		result.append(" (radiusX: ");
		if (radiusXESet) result.append(radiusX); else result.append("<unset>");
		result.append(", radiusY: ");
		if (radiusYESet) result.append(radiusY); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EllipseTypeImpl
