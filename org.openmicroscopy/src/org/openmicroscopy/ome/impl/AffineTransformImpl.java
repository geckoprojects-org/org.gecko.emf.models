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

import org.openmicroscopy.ome.AffineTransform;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affine Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.AffineTransformImpl#getA00 <em>A00</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.AffineTransformImpl#getA01 <em>A01</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.AffineTransformImpl#getA02 <em>A02</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.AffineTransformImpl#getA10 <em>A10</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.AffineTransformImpl#getA11 <em>A11</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.AffineTransformImpl#getA12 <em>A12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffineTransformImpl extends MinimalEObjectImpl.Container implements AffineTransform {
	/**
	 * The default value of the '{@link #getA00() <em>A00</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA00()
	 * @generated
	 * @ordered
	 */
	protected static final float A00_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getA00() <em>A00</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA00()
	 * @generated
	 * @ordered
	 */
	protected float a00 = A00_EDEFAULT;

	/**
	 * This is true if the A00 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean a00ESet;

	/**
	 * The default value of the '{@link #getA01() <em>A01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA01()
	 * @generated
	 * @ordered
	 */
	protected static final float A01_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getA01() <em>A01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA01()
	 * @generated
	 * @ordered
	 */
	protected float a01 = A01_EDEFAULT;

	/**
	 * This is true if the A01 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean a01ESet;

	/**
	 * The default value of the '{@link #getA02() <em>A02</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA02()
	 * @generated
	 * @ordered
	 */
	protected static final float A02_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getA02() <em>A02</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA02()
	 * @generated
	 * @ordered
	 */
	protected float a02 = A02_EDEFAULT;

	/**
	 * This is true if the A02 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean a02ESet;

	/**
	 * The default value of the '{@link #getA10() <em>A10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA10()
	 * @generated
	 * @ordered
	 */
	protected static final float A10_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getA10() <em>A10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA10()
	 * @generated
	 * @ordered
	 */
	protected float a10 = A10_EDEFAULT;

	/**
	 * This is true if the A10 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean a10ESet;

	/**
	 * The default value of the '{@link #getA11() <em>A11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA11()
	 * @generated
	 * @ordered
	 */
	protected static final float A11_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getA11() <em>A11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA11()
	 * @generated
	 * @ordered
	 */
	protected float a11 = A11_EDEFAULT;

	/**
	 * This is true if the A11 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean a11ESet;

	/**
	 * The default value of the '{@link #getA12() <em>A12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA12()
	 * @generated
	 * @ordered
	 */
	protected static final float A12_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getA12() <em>A12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA12()
	 * @generated
	 * @ordered
	 */
	protected float a12 = A12_EDEFAULT;

	/**
	 * This is true if the A12 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean a12ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffineTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getAffineTransform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getA00() {
		return a00;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA00(float newA00) {
		float oldA00 = a00;
		a00 = newA00;
		boolean oldA00ESet = a00ESet;
		a00ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.AFFINE_TRANSFORM__A00, oldA00, a00, !oldA00ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetA00() {
		float oldA00 = a00;
		boolean oldA00ESet = a00ESet;
		a00 = A00_EDEFAULT;
		a00ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.AFFINE_TRANSFORM__A00, oldA00, A00_EDEFAULT, oldA00ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetA00() {
		return a00ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getA01() {
		return a01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA01(float newA01) {
		float oldA01 = a01;
		a01 = newA01;
		boolean oldA01ESet = a01ESet;
		a01ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.AFFINE_TRANSFORM__A01, oldA01, a01, !oldA01ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetA01() {
		float oldA01 = a01;
		boolean oldA01ESet = a01ESet;
		a01 = A01_EDEFAULT;
		a01ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.AFFINE_TRANSFORM__A01, oldA01, A01_EDEFAULT, oldA01ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetA01() {
		return a01ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getA02() {
		return a02;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA02(float newA02) {
		float oldA02 = a02;
		a02 = newA02;
		boolean oldA02ESet = a02ESet;
		a02ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.AFFINE_TRANSFORM__A02, oldA02, a02, !oldA02ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetA02() {
		float oldA02 = a02;
		boolean oldA02ESet = a02ESet;
		a02 = A02_EDEFAULT;
		a02ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.AFFINE_TRANSFORM__A02, oldA02, A02_EDEFAULT, oldA02ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetA02() {
		return a02ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getA10() {
		return a10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA10(float newA10) {
		float oldA10 = a10;
		a10 = newA10;
		boolean oldA10ESet = a10ESet;
		a10ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.AFFINE_TRANSFORM__A10, oldA10, a10, !oldA10ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetA10() {
		float oldA10 = a10;
		boolean oldA10ESet = a10ESet;
		a10 = A10_EDEFAULT;
		a10ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.AFFINE_TRANSFORM__A10, oldA10, A10_EDEFAULT, oldA10ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetA10() {
		return a10ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getA11() {
		return a11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA11(float newA11) {
		float oldA11 = a11;
		a11 = newA11;
		boolean oldA11ESet = a11ESet;
		a11ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.AFFINE_TRANSFORM__A11, oldA11, a11, !oldA11ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetA11() {
		float oldA11 = a11;
		boolean oldA11ESet = a11ESet;
		a11 = A11_EDEFAULT;
		a11ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.AFFINE_TRANSFORM__A11, oldA11, A11_EDEFAULT, oldA11ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetA11() {
		return a11ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getA12() {
		return a12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA12(float newA12) {
		float oldA12 = a12;
		a12 = newA12;
		boolean oldA12ESet = a12ESet;
		a12ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.AFFINE_TRANSFORM__A12, oldA12, a12, !oldA12ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetA12() {
		float oldA12 = a12;
		boolean oldA12ESet = a12ESet;
		a12 = A12_EDEFAULT;
		a12ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.AFFINE_TRANSFORM__A12, oldA12, A12_EDEFAULT, oldA12ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetA12() {
		return a12ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.AFFINE_TRANSFORM__A00:
				return getA00();
			case OMEPackage.AFFINE_TRANSFORM__A01:
				return getA01();
			case OMEPackage.AFFINE_TRANSFORM__A02:
				return getA02();
			case OMEPackage.AFFINE_TRANSFORM__A10:
				return getA10();
			case OMEPackage.AFFINE_TRANSFORM__A11:
				return getA11();
			case OMEPackage.AFFINE_TRANSFORM__A12:
				return getA12();
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
			case OMEPackage.AFFINE_TRANSFORM__A00:
				setA00((Float)newValue);
				return;
			case OMEPackage.AFFINE_TRANSFORM__A01:
				setA01((Float)newValue);
				return;
			case OMEPackage.AFFINE_TRANSFORM__A02:
				setA02((Float)newValue);
				return;
			case OMEPackage.AFFINE_TRANSFORM__A10:
				setA10((Float)newValue);
				return;
			case OMEPackage.AFFINE_TRANSFORM__A11:
				setA11((Float)newValue);
				return;
			case OMEPackage.AFFINE_TRANSFORM__A12:
				setA12((Float)newValue);
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
			case OMEPackage.AFFINE_TRANSFORM__A00:
				unsetA00();
				return;
			case OMEPackage.AFFINE_TRANSFORM__A01:
				unsetA01();
				return;
			case OMEPackage.AFFINE_TRANSFORM__A02:
				unsetA02();
				return;
			case OMEPackage.AFFINE_TRANSFORM__A10:
				unsetA10();
				return;
			case OMEPackage.AFFINE_TRANSFORM__A11:
				unsetA11();
				return;
			case OMEPackage.AFFINE_TRANSFORM__A12:
				unsetA12();
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
			case OMEPackage.AFFINE_TRANSFORM__A00:
				return isSetA00();
			case OMEPackage.AFFINE_TRANSFORM__A01:
				return isSetA01();
			case OMEPackage.AFFINE_TRANSFORM__A02:
				return isSetA02();
			case OMEPackage.AFFINE_TRANSFORM__A10:
				return isSetA10();
			case OMEPackage.AFFINE_TRANSFORM__A11:
				return isSetA11();
			case OMEPackage.AFFINE_TRANSFORM__A12:
				return isSetA12();
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
		result.append(" (a00: ");
		if (a00ESet) result.append(a00); else result.append("<unset>");
		result.append(", a01: ");
		if (a01ESet) result.append(a01); else result.append("<unset>");
		result.append(", a02: ");
		if (a02ESet) result.append(a02); else result.append("<unset>");
		result.append(", a10: ");
		if (a10ESet) result.append(a10); else result.append("<unset>");
		result.append(", a11: ");
		if (a11ESet) result.append(a11); else result.append("<unset>");
		result.append(", a12: ");
		if (a12ESet) result.append(a12); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AffineTransformImpl
