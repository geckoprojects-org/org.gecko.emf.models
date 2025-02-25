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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.StageLabelType;
import org.openmicroscopy.ome.UnitsLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage Label Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl#getYUnit <em>YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.StageLabelTypeImpl#getZUnit <em>ZUnit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageLabelTypeImpl extends MinimalEObjectImpl.Container implements StageLabelType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength XUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength xUnit = XUNIT_EDEFAULT;

	/**
	 * This is true if the XUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xUnitESet;

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
	 * The default value of the '{@link #getYUnit() <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength YUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getYUnit() <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength yUnit = YUNIT_EDEFAULT;

	/**
	 * This is true if the YUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yUnitESet;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final float Z_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected float z = Z_EDEFAULT;

	/**
	 * This is true if the Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zESet;

	/**
	 * The default value of the '{@link #getZUnit() <em>ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength ZUNIT_EDEFAULT = UnitsLength.REFERENCE_FRAME;

	/**
	 * The cached value of the '{@link #getZUnit() <em>ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength zUnit = ZUNIT_EDEFAULT;

	/**
	 * This is true if the ZUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageLabelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getStageLabelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.STAGE_LABEL_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.STAGE_LABEL_TYPE__X, oldX, x, !oldXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.STAGE_LABEL_TYPE__X, oldX, X_EDEFAULT, oldXESet));
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
	public UnitsLength getXUnit() {
		return xUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXUnit(UnitsLength newXUnit) {
		UnitsLength oldXUnit = xUnit;
		xUnit = newXUnit == null ? XUNIT_EDEFAULT : newXUnit;
		boolean oldXUnitESet = xUnitESet;
		xUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.STAGE_LABEL_TYPE__XUNIT, oldXUnit, xUnit, !oldXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetXUnit() {
		UnitsLength oldXUnit = xUnit;
		boolean oldXUnitESet = xUnitESet;
		xUnit = XUNIT_EDEFAULT;
		xUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.STAGE_LABEL_TYPE__XUNIT, oldXUnit, XUNIT_EDEFAULT, oldXUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetXUnit() {
		return xUnitESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.STAGE_LABEL_TYPE__Y, oldY, y, !oldYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.STAGE_LABEL_TYPE__Y, oldY, Y_EDEFAULT, oldYESet));
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
	public UnitsLength getYUnit() {
		return yUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYUnit(UnitsLength newYUnit) {
		UnitsLength oldYUnit = yUnit;
		yUnit = newYUnit == null ? YUNIT_EDEFAULT : newYUnit;
		boolean oldYUnitESet = yUnitESet;
		yUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.STAGE_LABEL_TYPE__YUNIT, oldYUnit, yUnit, !oldYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYUnit() {
		UnitsLength oldYUnit = yUnit;
		boolean oldYUnitESet = yUnitESet;
		yUnit = YUNIT_EDEFAULT;
		yUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.STAGE_LABEL_TYPE__YUNIT, oldYUnit, YUNIT_EDEFAULT, oldYUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYUnit() {
		return yUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZ(float newZ) {
		float oldZ = z;
		z = newZ;
		boolean oldZESet = zESet;
		zESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.STAGE_LABEL_TYPE__Z, oldZ, z, !oldZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZ() {
		float oldZ = z;
		boolean oldZESet = zESet;
		z = Z_EDEFAULT;
		zESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.STAGE_LABEL_TYPE__Z, oldZ, Z_EDEFAULT, oldZESet));
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
	public UnitsLength getZUnit() {
		return zUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZUnit(UnitsLength newZUnit) {
		UnitsLength oldZUnit = zUnit;
		zUnit = newZUnit == null ? ZUNIT_EDEFAULT : newZUnit;
		boolean oldZUnitESet = zUnitESet;
		zUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.STAGE_LABEL_TYPE__ZUNIT, oldZUnit, zUnit, !oldZUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZUnit() {
		UnitsLength oldZUnit = zUnit;
		boolean oldZUnitESet = zUnitESet;
		zUnit = ZUNIT_EDEFAULT;
		zUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.STAGE_LABEL_TYPE__ZUNIT, oldZUnit, ZUNIT_EDEFAULT, oldZUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZUnit() {
		return zUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.STAGE_LABEL_TYPE__NAME:
				return getName();
			case OMEPackage.STAGE_LABEL_TYPE__X:
				return getX();
			case OMEPackage.STAGE_LABEL_TYPE__XUNIT:
				return getXUnit();
			case OMEPackage.STAGE_LABEL_TYPE__Y:
				return getY();
			case OMEPackage.STAGE_LABEL_TYPE__YUNIT:
				return getYUnit();
			case OMEPackage.STAGE_LABEL_TYPE__Z:
				return getZ();
			case OMEPackage.STAGE_LABEL_TYPE__ZUNIT:
				return getZUnit();
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
			case OMEPackage.STAGE_LABEL_TYPE__NAME:
				setName((String)newValue);
				return;
			case OMEPackage.STAGE_LABEL_TYPE__X:
				setX((Float)newValue);
				return;
			case OMEPackage.STAGE_LABEL_TYPE__XUNIT:
				setXUnit((UnitsLength)newValue);
				return;
			case OMEPackage.STAGE_LABEL_TYPE__Y:
				setY((Float)newValue);
				return;
			case OMEPackage.STAGE_LABEL_TYPE__YUNIT:
				setYUnit((UnitsLength)newValue);
				return;
			case OMEPackage.STAGE_LABEL_TYPE__Z:
				setZ((Float)newValue);
				return;
			case OMEPackage.STAGE_LABEL_TYPE__ZUNIT:
				setZUnit((UnitsLength)newValue);
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
			case OMEPackage.STAGE_LABEL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMEPackage.STAGE_LABEL_TYPE__X:
				unsetX();
				return;
			case OMEPackage.STAGE_LABEL_TYPE__XUNIT:
				unsetXUnit();
				return;
			case OMEPackage.STAGE_LABEL_TYPE__Y:
				unsetY();
				return;
			case OMEPackage.STAGE_LABEL_TYPE__YUNIT:
				unsetYUnit();
				return;
			case OMEPackage.STAGE_LABEL_TYPE__Z:
				unsetZ();
				return;
			case OMEPackage.STAGE_LABEL_TYPE__ZUNIT:
				unsetZUnit();
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
			case OMEPackage.STAGE_LABEL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OMEPackage.STAGE_LABEL_TYPE__X:
				return isSetX();
			case OMEPackage.STAGE_LABEL_TYPE__XUNIT:
				return isSetXUnit();
			case OMEPackage.STAGE_LABEL_TYPE__Y:
				return isSetY();
			case OMEPackage.STAGE_LABEL_TYPE__YUNIT:
				return isSetYUnit();
			case OMEPackage.STAGE_LABEL_TYPE__Z:
				return isSetZ();
			case OMEPackage.STAGE_LABEL_TYPE__ZUNIT:
				return isSetZUnit();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", xUnit: ");
		if (xUnitESet) result.append(xUnit); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(", yUnit: ");
		if (yUnitESet) result.append(yUnit); else result.append("<unset>");
		result.append(", z: ");
		if (zESet) result.append(z); else result.append("<unset>");
		result.append(", zUnit: ");
		if (zUnitESet) result.append(zUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StageLabelTypeImpl
