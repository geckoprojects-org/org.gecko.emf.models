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
package net.opengis.gml.impl;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.MultiCurveDomainType;
import net.opengis.gml.MultiCurveType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Curve Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiCurveDomainTypeImpl#getMultiCurve <em>Multi Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiCurveDomainTypeImpl extends DomainSetTypeImpl implements MultiCurveDomainType {
	/**
	 * The cached value of the '{@link #getMultiCurve() <em>Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiCurve()
	 * @generated
	 * @ordered
	 */
	protected MultiCurveType multiCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiCurveDomainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMultiCurveDomainType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurveType getMultiCurve() {
		return multiCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurve(MultiCurveType newMultiCurve, NotificationChain msgs) {
		MultiCurveType oldMultiCurve = multiCurve;
		multiCurve = newMultiCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE, oldMultiCurve, newMultiCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiCurve(MultiCurveType newMultiCurve) {
		if (newMultiCurve != multiCurve) {
			NotificationChain msgs = null;
			if (multiCurve != null)
				msgs = ((InternalEObject)multiCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE, null, msgs);
			if (newMultiCurve != null)
				msgs = ((InternalEObject)newMultiCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE, null, msgs);
			msgs = basicSetMultiCurve(newMultiCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE, newMultiCurve, newMultiCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE:
				return basicSetMultiCurve(null, msgs);
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
			case GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE:
				return getMultiCurve();
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
			case GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE:
				setMultiCurve((MultiCurveType)newValue);
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
			case GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE:
				setMultiCurve((MultiCurveType)null);
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
			case GMLPackage.MULTI_CURVE_DOMAIN_TYPE__MULTI_CURVE:
				return multiCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiCurveDomainTypeImpl
