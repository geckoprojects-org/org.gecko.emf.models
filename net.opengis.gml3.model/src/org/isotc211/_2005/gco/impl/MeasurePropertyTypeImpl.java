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
package org.isotc211._2005.gco.impl;

import net.opengis.gml.gml.MeasureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.GCOPackage;
import org.isotc211._2005.gco.MeasurePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.MeasurePropertyTypeImpl#getMeasureGroup <em>Measure Group</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.MeasurePropertyTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.MeasurePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurePropertyTypeImpl extends MinimalEObjectImpl.Container implements MeasurePropertyType {
	/**
	 * The cached value of the '{@link #getMeasureGroup() <em>Measure Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap measureGroup;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.MEASURE_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMeasureGroup() {
		if (measureGroup == null) {
			measureGroup = new BasicFeatureMap(this, GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE_GROUP);
		}
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getMeasure() {
		return (MeasureType)getMeasureGroup().get(GCOPackage.Literals.MEASURE_PROPERTY_TYPE__MEASURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMeasureGroup()).basicAdd(GCOPackage.Literals.MEASURE_PROPERTY_TYPE__MEASURE, newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasure(MeasureType newMeasure) {
		((FeatureMap.Internal)getMeasureGroup()).set(GCOPackage.Literals.MEASURE_PROPERTY_TYPE__MEASURE, newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.MEASURE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE_GROUP:
				return ((InternalEList<?>)getMeasureGroup()).basicRemove(otherEnd, msgs);
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE:
				return basicSetMeasure(null, msgs);
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
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE_GROUP:
				if (coreType) return getMeasureGroup();
				return ((FeatureMap.Internal)getMeasureGroup()).getWrapper();
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE:
				return getMeasure();
			case GCOPackage.MEASURE_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
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
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE_GROUP:
				((FeatureMap.Internal)getMeasureGroup()).set(newValue);
				return;
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE:
				setMeasure((MeasureType)newValue);
				return;
			case GCOPackage.MEASURE_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
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
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE_GROUP:
				getMeasureGroup().clear();
				return;
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE:
				setMeasure((MeasureType)null);
				return;
			case GCOPackage.MEASURE_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE_GROUP:
				return measureGroup != null && !measureGroup.isEmpty();
			case GCOPackage.MEASURE_PROPERTY_TYPE__MEASURE:
				return getMeasure() != null;
			case GCOPackage.MEASURE_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
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
		result.append(" (measureGroup: ");
		result.append(measureGroup);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //MeasurePropertyTypeImpl
