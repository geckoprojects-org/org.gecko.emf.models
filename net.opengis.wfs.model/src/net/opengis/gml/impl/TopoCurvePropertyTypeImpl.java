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
import net.opengis.gml.TopoCurvePropertyType;
import net.opengis.gml.TopoCurveType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Curve Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoCurvePropertyTypeImpl#getTopoCurve <em>Topo Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoCurvePropertyTypeImpl extends MinimalEObjectImpl.Container implements TopoCurvePropertyType {
	/**
	 * The cached value of the '{@link #getTopoCurve() <em>Topo Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopoCurve()
	 * @generated
	 * @ordered
	 */
	protected TopoCurveType topoCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoCurvePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoCurvePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoCurveType getTopoCurve() {
		return topoCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoCurve(TopoCurveType newTopoCurve, NotificationChain msgs) {
		TopoCurveType oldTopoCurve = topoCurve;
		topoCurve = newTopoCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE, oldTopoCurve, newTopoCurve);
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
	public void setTopoCurve(TopoCurveType newTopoCurve) {
		if (newTopoCurve != topoCurve) {
			NotificationChain msgs = null;
			if (topoCurve != null)
				msgs = ((InternalEObject)topoCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE, null, msgs);
			if (newTopoCurve != null)
				msgs = ((InternalEObject)newTopoCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE, null, msgs);
			msgs = basicSetTopoCurve(newTopoCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE, newTopoCurve, newTopoCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE:
				return basicSetTopoCurve(null, msgs);
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
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE:
				return getTopoCurve();
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
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE:
				setTopoCurve((TopoCurveType)newValue);
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
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE:
				setTopoCurve((TopoCurveType)null);
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
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE__TOPO_CURVE:
				return topoCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //TopoCurvePropertyTypeImpl
