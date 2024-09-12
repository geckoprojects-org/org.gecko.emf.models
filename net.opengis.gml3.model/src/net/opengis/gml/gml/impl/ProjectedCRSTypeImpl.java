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

import net.opengis.gml.gml.CartesianCSPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GeodeticCRSPropertyType;
import net.opengis.gml.gml.GeographicCRSPropertyType;
import net.opengis.gml.gml.ProjectedCRSType;

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
 * An implementation of the model object '<em><b>Projected CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ProjectedCRSTypeImpl#getBaseGeodeticCRS <em>Base Geodetic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ProjectedCRSTypeImpl#getBaseGeographicCRS <em>Base Geographic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ProjectedCRSTypeImpl#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ProjectedCRSTypeImpl#getCartesianCS <em>Cartesian CS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectedCRSTypeImpl extends AbstractGeneralDerivedCRSTypeImpl implements ProjectedCRSType {
	/**
	 * The cached value of the '{@link #getBaseGeodeticCRS() <em>Base Geodetic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseGeodeticCRS()
	 * @generated
	 * @ordered
	 */
	protected GeodeticCRSPropertyType baseGeodeticCRS;

	/**
	 * The cached value of the '{@link #getBaseGeographicCRS() <em>Base Geographic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseGeographicCRS()
	 * @generated
	 * @ordered
	 */
	protected GeographicCRSPropertyType baseGeographicCRS;

	/**
	 * The cached value of the '{@link #getCartesianCSGroup() <em>Cartesian CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap cartesianCSGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectedCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getProjectedCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticCRSPropertyType getBaseGeodeticCRS() {
		return baseGeodeticCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseGeodeticCRS(GeodeticCRSPropertyType newBaseGeodeticCRS, NotificationChain msgs) {
		GeodeticCRSPropertyType oldBaseGeodeticCRS = baseGeodeticCRS;
		baseGeodeticCRS = newBaseGeodeticCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS, oldBaseGeodeticCRS, newBaseGeodeticCRS);
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
	public void setBaseGeodeticCRS(GeodeticCRSPropertyType newBaseGeodeticCRS) {
		if (newBaseGeodeticCRS != baseGeodeticCRS) {
			NotificationChain msgs = null;
			if (baseGeodeticCRS != null)
				msgs = ((InternalEObject)baseGeodeticCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS, null, msgs);
			if (newBaseGeodeticCRS != null)
				msgs = ((InternalEObject)newBaseGeodeticCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS, null, msgs);
			msgs = basicSetBaseGeodeticCRS(newBaseGeodeticCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS, newBaseGeodeticCRS, newBaseGeodeticCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicCRSPropertyType getBaseGeographicCRS() {
		return baseGeographicCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseGeographicCRS(GeographicCRSPropertyType newBaseGeographicCRS, NotificationChain msgs) {
		GeographicCRSPropertyType oldBaseGeographicCRS = baseGeographicCRS;
		baseGeographicCRS = newBaseGeographicCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS, oldBaseGeographicCRS, newBaseGeographicCRS);
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
	public void setBaseGeographicCRS(GeographicCRSPropertyType newBaseGeographicCRS) {
		if (newBaseGeographicCRS != baseGeographicCRS) {
			NotificationChain msgs = null;
			if (baseGeographicCRS != null)
				msgs = ((InternalEObject)baseGeographicCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS, null, msgs);
			if (newBaseGeographicCRS != null)
				msgs = ((InternalEObject)newBaseGeographicCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS, null, msgs);
			msgs = basicSetBaseGeographicCRS(newBaseGeographicCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS, newBaseGeographicCRS, newBaseGeographicCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCartesianCSGroup() {
		if (cartesianCSGroup == null) {
			cartesianCSGroup = new BasicFeatureMap(this, GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS_GROUP);
		}
		return cartesianCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getCartesianCS() {
		return (CartesianCSPropertyType)getCartesianCSGroup().get(GMLPackage.eINSTANCE.getProjectedCRSType_CartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS(CartesianCSPropertyType newCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCartesianCSGroup()).basicAdd(GMLPackage.eINSTANCE.getProjectedCRSType_CartesianCS(), newCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS(CartesianCSPropertyType newCartesianCS) {
		((FeatureMap.Internal)getCartesianCSGroup()).set(GMLPackage.eINSTANCE.getProjectedCRSType_CartesianCS(), newCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS:
				return basicSetBaseGeodeticCRS(null, msgs);
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS:
				return basicSetBaseGeographicCRS(null, msgs);
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS_GROUP:
				return ((InternalEList<?>)getCartesianCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS:
				return basicSetCartesianCS(null, msgs);
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
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS:
				return getBaseGeodeticCRS();
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS:
				return getBaseGeographicCRS();
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS_GROUP:
				if (coreType) return getCartesianCSGroup();
				return ((FeatureMap.Internal)getCartesianCSGroup()).getWrapper();
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS();
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
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS:
				setBaseGeodeticCRS((GeodeticCRSPropertyType)newValue);
				return;
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS:
				setBaseGeographicCRS((GeographicCRSPropertyType)newValue);
				return;
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS_GROUP:
				((FeatureMap.Internal)getCartesianCSGroup()).set(newValue);
				return;
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)newValue);
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
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS:
				setBaseGeodeticCRS((GeodeticCRSPropertyType)null);
				return;
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS:
				setBaseGeographicCRS((GeographicCRSPropertyType)null);
				return;
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS_GROUP:
				getCartesianCSGroup().clear();
				return;
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)null);
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
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEODETIC_CRS:
				return baseGeodeticCRS != null;
			case GMLPackage.PROJECTED_CRS_TYPE__BASE_GEOGRAPHIC_CRS:
				return baseGeographicCRS != null;
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS_GROUP:
				return cartesianCSGroup != null && !cartesianCSGroup.isEmpty();
			case GMLPackage.PROJECTED_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS() != null;
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
		result.append(" (cartesianCSGroup: ");
		result.append(cartesianCSGroup);
		result.append(')');
		return result.toString();
	}

} //ProjectedCRSTypeImpl
