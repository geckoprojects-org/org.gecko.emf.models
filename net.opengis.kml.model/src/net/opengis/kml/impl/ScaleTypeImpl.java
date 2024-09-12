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

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.ScaleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ScaleTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScaleTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScaleTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScaleTypeImpl#getScaleSimpleExtensionGroupGroup <em>Scale Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScaleTypeImpl#getScaleSimpleExtensionGroup <em>Scale Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScaleTypeImpl#getScaleObjectExtensionGroupGroup <em>Scale Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ScaleTypeImpl#getScaleObjectExtensionGroup <em>Scale Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaleTypeImpl extends AbstractObjectTypeImpl implements ScaleType {
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
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final double Z_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected double z = Z_EDEFAULT;

	/**
	 * This is true if the Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zESet;

	/**
	 * The cached value of the '{@link #getScaleSimpleExtensionGroupGroup() <em>Scale Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scaleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getScaleObjectExtensionGroupGroup() <em>Scale Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scaleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getScaleType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCALE_TYPE__X, oldX, x, !oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.SCALE_TYPE__X, oldX, X_EDEFAULT, oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCALE_TYPE__Y, oldY, y, !oldYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.SCALE_TYPE__Y, oldY, Y_EDEFAULT, oldYESet));
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
	public double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZ(double newZ) {
		double oldZ = z;
		z = newZ;
		boolean oldZESet = zESet;
		zESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCALE_TYPE__Z, oldZ, z, !oldZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZ() {
		double oldZ = z;
		boolean oldZESet = zESet;
		z = Z_EDEFAULT;
		zESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.SCALE_TYPE__Z, oldZ, Z_EDEFAULT, oldZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZ() {
		return zESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getScaleSimpleExtensionGroupGroup() {
		if (scaleSimpleExtensionGroupGroup == null) {
			scaleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return scaleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getScaleSimpleExtensionGroup() {
		return getScaleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getScaleType_ScaleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getScaleObjectExtensionGroupGroup() {
		if (scaleObjectExtensionGroupGroup == null) {
			scaleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return scaleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getScaleObjectExtensionGroup() {
		return getScaleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getScaleType_ScaleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getScaleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getScaleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getScaleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.SCALE_TYPE__X:
				return getX();
			case KMLPackage.SCALE_TYPE__Y:
				return getY();
			case KMLPackage.SCALE_TYPE__Z:
				return getZ();
			case KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getScaleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getScaleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP:
				return getScaleSimpleExtensionGroup();
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getScaleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getScaleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP:
				return getScaleObjectExtensionGroup();
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
			case KMLPackage.SCALE_TYPE__X:
				setX((Double)newValue);
				return;
			case KMLPackage.SCALE_TYPE__Y:
				setY((Double)newValue);
				return;
			case KMLPackage.SCALE_TYPE__Z:
				setZ((Double)newValue);
				return;
			case KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getScaleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getScaleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.SCALE_TYPE__X:
				unsetX();
				return;
			case KMLPackage.SCALE_TYPE__Y:
				unsetY();
				return;
			case KMLPackage.SCALE_TYPE__Z:
				unsetZ();
				return;
			case KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP_GROUP:
				getScaleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP_GROUP:
				getScaleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.SCALE_TYPE__X:
				return isSetX();
			case KMLPackage.SCALE_TYPE__Y:
				return isSetY();
			case KMLPackage.SCALE_TYPE__Z:
				return isSetZ();
			case KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP_GROUP:
				return scaleSimpleExtensionGroupGroup != null && !scaleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP:
				return !getScaleSimpleExtensionGroup().isEmpty();
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP_GROUP:
				return scaleObjectExtensionGroupGroup != null && !scaleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP:
				return !getScaleObjectExtensionGroup().isEmpty();
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
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(", z: ");
		if (zESet) result.append(z); else result.append("<unset>");
		result.append(", scaleSimpleExtensionGroupGroup: ");
		result.append(scaleSimpleExtensionGroupGroup);
		result.append(", scaleObjectExtensionGroupGroup: ");
		result.append(scaleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ScaleTypeImpl
