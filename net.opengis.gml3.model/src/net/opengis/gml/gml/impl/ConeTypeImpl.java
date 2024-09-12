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

import net.opengis.gml.gml.ConeType;
import net.opengis.gml.gml.CurveInterpolationType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ConeTypeImpl#getHorizontalCurveType <em>Horizontal Curve Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ConeTypeImpl#getVerticalCurveType <em>Vertical Curve Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConeTypeImpl extends AbstractGriddedSurfaceTypeImpl implements ConeType {
	/**
	 * The default value of the '{@link #getHorizontalCurveType() <em>Horizontal Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalCurveType()
	 * @generated
	 * @ordered
	 */
	protected static final CurveInterpolationType HORIZONTAL_CURVE_TYPE_EDEFAULT = CurveInterpolationType.CIRCULAR_ARC3_POINTS;

	/**
	 * The cached value of the '{@link #getHorizontalCurveType() <em>Horizontal Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalCurveType()
	 * @generated
	 * @ordered
	 */
	protected CurveInterpolationType horizontalCurveType = HORIZONTAL_CURVE_TYPE_EDEFAULT;

	/**
	 * This is true if the Horizontal Curve Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalCurveTypeESet;

	/**
	 * The default value of the '{@link #getVerticalCurveType() <em>Vertical Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalCurveType()
	 * @generated
	 * @ordered
	 */
	protected static final CurveInterpolationType VERTICAL_CURVE_TYPE_EDEFAULT = CurveInterpolationType.LINEAR;

	/**
	 * The cached value of the '{@link #getVerticalCurveType() <em>Vertical Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalCurveType()
	 * @generated
	 * @ordered
	 */
	protected CurveInterpolationType verticalCurveType = VERTICAL_CURVE_TYPE_EDEFAULT;

	/**
	 * This is true if the Vertical Curve Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalCurveTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getConeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveInterpolationType getHorizontalCurveType() {
		return horizontalCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalCurveType(CurveInterpolationType newHorizontalCurveType) {
		CurveInterpolationType oldHorizontalCurveType = horizontalCurveType;
		horizontalCurveType = newHorizontalCurveType == null ? HORIZONTAL_CURVE_TYPE_EDEFAULT : newHorizontalCurveType;
		boolean oldHorizontalCurveTypeESet = horizontalCurveTypeESet;
		horizontalCurveTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CONE_TYPE__HORIZONTAL_CURVE_TYPE, oldHorizontalCurveType, horizontalCurveType, !oldHorizontalCurveTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHorizontalCurveType() {
		CurveInterpolationType oldHorizontalCurveType = horizontalCurveType;
		boolean oldHorizontalCurveTypeESet = horizontalCurveTypeESet;
		horizontalCurveType = HORIZONTAL_CURVE_TYPE_EDEFAULT;
		horizontalCurveTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.CONE_TYPE__HORIZONTAL_CURVE_TYPE, oldHorizontalCurveType, HORIZONTAL_CURVE_TYPE_EDEFAULT, oldHorizontalCurveTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHorizontalCurveType() {
		return horizontalCurveTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveInterpolationType getVerticalCurveType() {
		return verticalCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCurveType(CurveInterpolationType newVerticalCurveType) {
		CurveInterpolationType oldVerticalCurveType = verticalCurveType;
		verticalCurveType = newVerticalCurveType == null ? VERTICAL_CURVE_TYPE_EDEFAULT : newVerticalCurveType;
		boolean oldVerticalCurveTypeESet = verticalCurveTypeESet;
		verticalCurveTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CONE_TYPE__VERTICAL_CURVE_TYPE, oldVerticalCurveType, verticalCurveType, !oldVerticalCurveTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerticalCurveType() {
		CurveInterpolationType oldVerticalCurveType = verticalCurveType;
		boolean oldVerticalCurveTypeESet = verticalCurveTypeESet;
		verticalCurveType = VERTICAL_CURVE_TYPE_EDEFAULT;
		verticalCurveTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.CONE_TYPE__VERTICAL_CURVE_TYPE, oldVerticalCurveType, VERTICAL_CURVE_TYPE_EDEFAULT, oldVerticalCurveTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerticalCurveType() {
		return verticalCurveTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMLPackage.CONE_TYPE__HORIZONTAL_CURVE_TYPE:
				return getHorizontalCurveType();
			case GMLPackage.CONE_TYPE__VERTICAL_CURVE_TYPE:
				return getVerticalCurveType();
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
			case GMLPackage.CONE_TYPE__HORIZONTAL_CURVE_TYPE:
				setHorizontalCurveType((CurveInterpolationType)newValue);
				return;
			case GMLPackage.CONE_TYPE__VERTICAL_CURVE_TYPE:
				setVerticalCurveType((CurveInterpolationType)newValue);
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
			case GMLPackage.CONE_TYPE__HORIZONTAL_CURVE_TYPE:
				unsetHorizontalCurveType();
				return;
			case GMLPackage.CONE_TYPE__VERTICAL_CURVE_TYPE:
				unsetVerticalCurveType();
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
			case GMLPackage.CONE_TYPE__HORIZONTAL_CURVE_TYPE:
				return isSetHorizontalCurveType();
			case GMLPackage.CONE_TYPE__VERTICAL_CURVE_TYPE:
				return isSetVerticalCurveType();
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
		result.append(" (horizontalCurveType: ");
		if (horizontalCurveTypeESet) result.append(horizontalCurveType); else result.append("<unset>");
		result.append(", verticalCurveType: ");
		if (verticalCurveTypeESet) result.append(verticalCurveType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConeTypeImpl
