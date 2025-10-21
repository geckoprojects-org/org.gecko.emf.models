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
import de.online.adv.namespaces.adv.sk.xml.skadv.HaloColorType;
import de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.TargetColorType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Halo Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HaloType1Impl#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HaloType1Impl#getHaloColor <em>Halo Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HaloType1Impl#getTargetColor <em>Target Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HaloType1Impl extends ElementType1Impl implements HaloType1 {
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * This is true if the Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiusESet;

	/**
	 * The cached value of the '{@link #getHaloColor() <em>Halo Color</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaloColor()
	 * @generated
	 * @ordered
	 */
	protected EList<HaloColorType> haloColor;

	/**
	 * The cached value of the '{@link #getTargetColor() <em>Target Color</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColor()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetColorType> targetColor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HaloType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getHaloType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		boolean oldRadiusESet = radiusESet;
		radiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HALO_TYPE1__RADIUS, oldRadius, radius, !oldRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRadius() {
		double oldRadius = radius;
		boolean oldRadiusESet = radiusESet;
		radius = RADIUS_EDEFAULT;
		radiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HALO_TYPE1__RADIUS, oldRadius, RADIUS_EDEFAULT, oldRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRadius() {
		return radiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HaloColorType> getHaloColor() {
		if (haloColor == null) {
			haloColor = new EObjectContainmentEList<HaloColorType>(HaloColorType.class, this, AAAPackage.HALO_TYPE1__HALO_COLOR);
		}
		return haloColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetColorType> getTargetColor() {
		if (targetColor == null) {
			targetColor = new EObjectContainmentEList<TargetColorType>(TargetColorType.class, this, AAAPackage.HALO_TYPE1__TARGET_COLOR);
		}
		return targetColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.HALO_TYPE1__HALO_COLOR:
				return ((InternalEList<?>)getHaloColor()).basicRemove(otherEnd, msgs);
			case AAAPackage.HALO_TYPE1__TARGET_COLOR:
				return ((InternalEList<?>)getTargetColor()).basicRemove(otherEnd, msgs);
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
			case AAAPackage.HALO_TYPE1__RADIUS:
				return getRadius();
			case AAAPackage.HALO_TYPE1__HALO_COLOR:
				return getHaloColor();
			case AAAPackage.HALO_TYPE1__TARGET_COLOR:
				return getTargetColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AAAPackage.HALO_TYPE1__RADIUS:
				setRadius((Double)newValue);
				return;
			case AAAPackage.HALO_TYPE1__HALO_COLOR:
				getHaloColor().clear();
				getHaloColor().addAll((Collection<? extends HaloColorType>)newValue);
				return;
			case AAAPackage.HALO_TYPE1__TARGET_COLOR:
				getTargetColor().clear();
				getTargetColor().addAll((Collection<? extends TargetColorType>)newValue);
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
			case AAAPackage.HALO_TYPE1__RADIUS:
				unsetRadius();
				return;
			case AAAPackage.HALO_TYPE1__HALO_COLOR:
				getHaloColor().clear();
				return;
			case AAAPackage.HALO_TYPE1__TARGET_COLOR:
				getTargetColor().clear();
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
			case AAAPackage.HALO_TYPE1__RADIUS:
				return isSetRadius();
			case AAAPackage.HALO_TYPE1__HALO_COLOR:
				return haloColor != null && !haloColor.isEmpty();
			case AAAPackage.HALO_TYPE1__TARGET_COLOR:
				return targetColor != null && !targetColor.isEmpty();
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
		result.append(" (radius: ");
		if (radiusESet) result.append(radius); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HaloType1Impl
