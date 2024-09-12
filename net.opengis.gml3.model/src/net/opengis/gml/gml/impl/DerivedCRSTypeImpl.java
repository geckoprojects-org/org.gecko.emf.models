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

import net.opengis.gml.gml.CodeWithAuthorityType;
import net.opengis.gml.gml.CoordinateSystemPropertyType;
import net.opengis.gml.gml.DerivedCRSType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.SingleCRSPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.DerivedCRSTypeImpl#getBaseCRS <em>Base CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DerivedCRSTypeImpl#getDerivedCRSType <em>Derived CRS Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DerivedCRSTypeImpl#getCoordinateSystemGroup <em>Coordinate System Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.DerivedCRSTypeImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedCRSTypeImpl extends AbstractGeneralDerivedCRSTypeImpl implements DerivedCRSType {
	/**
	 * The cached value of the '{@link #getBaseCRS() <em>Base CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCRS()
	 * @generated
	 * @ordered
	 */
	protected SingleCRSPropertyType baseCRS;

	/**
	 * The cached value of the '{@link #getDerivedCRSType() <em>Derived CRS Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedCRSType()
	 * @generated
	 * @ordered
	 */
	protected CodeWithAuthorityType derivedCRSType;

	/**
	 * The cached value of the '{@link #getCoordinateSystemGroup() <em>Coordinate System Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystemGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap coordinateSystemGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDerivedCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleCRSPropertyType getBaseCRS() {
		return baseCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCRS(SingleCRSPropertyType newBaseCRS, NotificationChain msgs) {
		SingleCRSPropertyType oldBaseCRS = baseCRS;
		baseCRS = newBaseCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DERIVED_CRS_TYPE__BASE_CRS, oldBaseCRS, newBaseCRS);
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
	public void setBaseCRS(SingleCRSPropertyType newBaseCRS) {
		if (newBaseCRS != baseCRS) {
			NotificationChain msgs = null;
			if (baseCRS != null)
				msgs = ((InternalEObject)baseCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DERIVED_CRS_TYPE__BASE_CRS, null, msgs);
			if (newBaseCRS != null)
				msgs = ((InternalEObject)newBaseCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DERIVED_CRS_TYPE__BASE_CRS, null, msgs);
			msgs = basicSetBaseCRS(newBaseCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DERIVED_CRS_TYPE__BASE_CRS, newBaseCRS, newBaseCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWithAuthorityType getDerivedCRSType() {
		return derivedCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedCRSType(CodeWithAuthorityType newDerivedCRSType, NotificationChain msgs) {
		CodeWithAuthorityType oldDerivedCRSType = derivedCRSType;
		derivedCRSType = newDerivedCRSType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE, oldDerivedCRSType, newDerivedCRSType);
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
	public void setDerivedCRSType(CodeWithAuthorityType newDerivedCRSType) {
		if (newDerivedCRSType != derivedCRSType) {
			NotificationChain msgs = null;
			if (derivedCRSType != null)
				msgs = ((InternalEObject)derivedCRSType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE, null, msgs);
			if (newDerivedCRSType != null)
				msgs = ((InternalEObject)newDerivedCRSType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE, null, msgs);
			msgs = basicSetDerivedCRSType(newDerivedCRSType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE, newDerivedCRSType, newDerivedCRSType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCoordinateSystemGroup() {
		if (coordinateSystemGroup == null) {
			coordinateSystemGroup = new BasicFeatureMap(this, GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM_GROUP);
		}
		return coordinateSystemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemPropertyType getCoordinateSystem() {
		return (CoordinateSystemPropertyType)getCoordinateSystemGroup().get(GMLPackage.eINSTANCE.getDerivedCRSType_CoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(CoordinateSystemPropertyType newCoordinateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCoordinateSystemGroup()).basicAdd(GMLPackage.eINSTANCE.getDerivedCRSType_CoordinateSystem(), newCoordinateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinateSystem(CoordinateSystemPropertyType newCoordinateSystem) {
		((FeatureMap.Internal)getCoordinateSystemGroup()).set(GMLPackage.eINSTANCE.getDerivedCRSType_CoordinateSystem(), newCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DERIVED_CRS_TYPE__BASE_CRS:
				return basicSetBaseCRS(null, msgs);
			case GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE:
				return basicSetDerivedCRSType(null, msgs);
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				return ((InternalEList<?>)getCoordinateSystemGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
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
			case GMLPackage.DERIVED_CRS_TYPE__BASE_CRS:
				return getBaseCRS();
			case GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE:
				return getDerivedCRSType();
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				if (coreType) return getCoordinateSystemGroup();
				return ((FeatureMap.Internal)getCoordinateSystemGroup()).getWrapper();
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM:
				return getCoordinateSystem();
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
			case GMLPackage.DERIVED_CRS_TYPE__BASE_CRS:
				setBaseCRS((SingleCRSPropertyType)newValue);
				return;
			case GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE:
				setDerivedCRSType((CodeWithAuthorityType)newValue);
				return;
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				((FeatureMap.Internal)getCoordinateSystemGroup()).set(newValue);
				return;
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystemPropertyType)newValue);
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
			case GMLPackage.DERIVED_CRS_TYPE__BASE_CRS:
				setBaseCRS((SingleCRSPropertyType)null);
				return;
			case GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE:
				setDerivedCRSType((CodeWithAuthorityType)null);
				return;
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				getCoordinateSystemGroup().clear();
				return;
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystemPropertyType)null);
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
			case GMLPackage.DERIVED_CRS_TYPE__BASE_CRS:
				return baseCRS != null;
			case GMLPackage.DERIVED_CRS_TYPE__DERIVED_CRS_TYPE:
				return derivedCRSType != null;
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM_GROUP:
				return coordinateSystemGroup != null && !coordinateSystemGroup.isEmpty();
			case GMLPackage.DERIVED_CRS_TYPE__COORDINATE_SYSTEM:
				return getCoordinateSystem() != null;
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
		result.append(" (coordinateSystemGroup: ");
		result.append(coordinateSystemGroup);
		result.append(')');
		return result.toString();
	}

} //DerivedCRSTypeImpl
