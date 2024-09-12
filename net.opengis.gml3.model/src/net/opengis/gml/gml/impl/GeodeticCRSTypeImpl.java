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
import net.opengis.gml.gml.EllipsoidalCSPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GeodeticCRSType;
import net.opengis.gml.gml.GeodeticDatumPropertyType;
import net.opengis.gml.gml.SphericalCSPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geodetic CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getEllipsoidalCSGroup <em>Ellipsoidal CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getEllipsoidalCS <em>Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getSphericalCSGroup <em>Spherical CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getSphericalCS <em>Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getGeodeticDatumGroup <em>Geodetic Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticCRSTypeImpl#getGeodeticDatum <em>Geodetic Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeodeticCRSTypeImpl extends AbstractCRSTypeImpl implements GeodeticCRSType {
	/**
	 * The cached value of the '{@link #getEllipsoidalCSGroup() <em>Ellipsoidal CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipsoidalCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ellipsoidalCSGroup;

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
	 * The cached value of the '{@link #getSphericalCSGroup() <em>Spherical CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSphericalCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap sphericalCSGroup;

	/**
	 * The cached value of the '{@link #getGeodeticDatumGroup() <em>Geodetic Datum Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeodeticDatumGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap geodeticDatumGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeodeticCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGeodeticCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getEllipsoidalCSGroup() {
		if (ellipsoidalCSGroup == null) {
			ellipsoidalCSGroup = new BasicFeatureMap(this, GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS_GROUP);
		}
		return ellipsoidalCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSPropertyType getEllipsoidalCS() {
		return (EllipsoidalCSPropertyType)getEllipsoidalCSGroup().get(GMLPackage.eINSTANCE.getGeodeticCRSType_EllipsoidalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCS(EllipsoidalCSPropertyType newEllipsoidalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getEllipsoidalCSGroup()).basicAdd(GMLPackage.eINSTANCE.getGeodeticCRSType_EllipsoidalCS(), newEllipsoidalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidalCS(EllipsoidalCSPropertyType newEllipsoidalCS) {
		((FeatureMap.Internal)getEllipsoidalCSGroup()).set(GMLPackage.eINSTANCE.getGeodeticCRSType_EllipsoidalCS(), newEllipsoidalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCartesianCSGroup() {
		if (cartesianCSGroup == null) {
			cartesianCSGroup = new BasicFeatureMap(this, GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS_GROUP);
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
		return (CartesianCSPropertyType)getCartesianCSGroup().get(GMLPackage.eINSTANCE.getGeodeticCRSType_CartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS(CartesianCSPropertyType newCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCartesianCSGroup()).basicAdd(GMLPackage.eINSTANCE.getGeodeticCRSType_CartesianCS(), newCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS(CartesianCSPropertyType newCartesianCS) {
		((FeatureMap.Internal)getCartesianCSGroup()).set(GMLPackage.eINSTANCE.getGeodeticCRSType_CartesianCS(), newCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSphericalCSGroup() {
		if (sphericalCSGroup == null) {
			sphericalCSGroup = new BasicFeatureMap(this, GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS_GROUP);
		}
		return sphericalCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSPropertyType getSphericalCS() {
		return (SphericalCSPropertyType)getSphericalCSGroup().get(GMLPackage.eINSTANCE.getGeodeticCRSType_SphericalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCS(SphericalCSPropertyType newSphericalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSphericalCSGroup()).basicAdd(GMLPackage.eINSTANCE.getGeodeticCRSType_SphericalCS(), newSphericalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSphericalCS(SphericalCSPropertyType newSphericalCS) {
		((FeatureMap.Internal)getSphericalCSGroup()).set(GMLPackage.eINSTANCE.getGeodeticCRSType_SphericalCS(), newSphericalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGeodeticDatumGroup() {
		if (geodeticDatumGroup == null) {
			geodeticDatumGroup = new BasicFeatureMap(this, GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM_GROUP);
		}
		return geodeticDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumPropertyType getGeodeticDatum() {
		return (GeodeticDatumPropertyType)getGeodeticDatumGroup().get(GMLPackage.eINSTANCE.getGeodeticCRSType_GeodeticDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatum(GeodeticDatumPropertyType newGeodeticDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGeodeticDatumGroup()).basicAdd(GMLPackage.eINSTANCE.getGeodeticCRSType_GeodeticDatum(), newGeodeticDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeodeticDatum(GeodeticDatumPropertyType newGeodeticDatum) {
		((FeatureMap.Internal)getGeodeticDatumGroup()).set(GMLPackage.eINSTANCE.getGeodeticCRSType_GeodeticDatum(), newGeodeticDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS_GROUP:
				return ((InternalEList<?>)getEllipsoidalCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS:
				return basicSetEllipsoidalCS(null, msgs);
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS_GROUP:
				return ((InternalEList<?>)getCartesianCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS:
				return basicSetCartesianCS(null, msgs);
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS_GROUP:
				return ((InternalEList<?>)getSphericalCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS:
				return basicSetSphericalCS(null, msgs);
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM_GROUP:
				return ((InternalEList<?>)getGeodeticDatumGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM:
				return basicSetGeodeticDatum(null, msgs);
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
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS_GROUP:
				if (coreType) return getEllipsoidalCSGroup();
				return ((FeatureMap.Internal)getEllipsoidalCSGroup()).getWrapper();
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS:
				return getEllipsoidalCS();
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS_GROUP:
				if (coreType) return getCartesianCSGroup();
				return ((FeatureMap.Internal)getCartesianCSGroup()).getWrapper();
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS();
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS_GROUP:
				if (coreType) return getSphericalCSGroup();
				return ((FeatureMap.Internal)getSphericalCSGroup()).getWrapper();
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS:
				return getSphericalCS();
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM_GROUP:
				if (coreType) return getGeodeticDatumGroup();
				return ((FeatureMap.Internal)getGeodeticDatumGroup()).getWrapper();
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM:
				return getGeodeticDatum();
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
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS_GROUP:
				((FeatureMap.Internal)getEllipsoidalCSGroup()).set(newValue);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS:
				setEllipsoidalCS((EllipsoidalCSPropertyType)newValue);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS_GROUP:
				((FeatureMap.Internal)getCartesianCSGroup()).set(newValue);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS_GROUP:
				((FeatureMap.Internal)getSphericalCSGroup()).set(newValue);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS:
				setSphericalCS((SphericalCSPropertyType)newValue);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM_GROUP:
				((FeatureMap.Internal)getGeodeticDatumGroup()).set(newValue);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM:
				setGeodeticDatum((GeodeticDatumPropertyType)newValue);
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
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS_GROUP:
				getEllipsoidalCSGroup().clear();
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS:
				setEllipsoidalCS((EllipsoidalCSPropertyType)null);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS_GROUP:
				getCartesianCSGroup().clear();
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)null);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS_GROUP:
				getSphericalCSGroup().clear();
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS:
				setSphericalCS((SphericalCSPropertyType)null);
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM_GROUP:
				getGeodeticDatumGroup().clear();
				return;
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM:
				setGeodeticDatum((GeodeticDatumPropertyType)null);
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
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS_GROUP:
				return ellipsoidalCSGroup != null && !ellipsoidalCSGroup.isEmpty();
			case GMLPackage.GEODETIC_CRS_TYPE__ELLIPSOIDAL_CS:
				return getEllipsoidalCS() != null;
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS_GROUP:
				return cartesianCSGroup != null && !cartesianCSGroup.isEmpty();
			case GMLPackage.GEODETIC_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS() != null;
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS_GROUP:
				return sphericalCSGroup != null && !sphericalCSGroup.isEmpty();
			case GMLPackage.GEODETIC_CRS_TYPE__SPHERICAL_CS:
				return getSphericalCS() != null;
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM_GROUP:
				return geodeticDatumGroup != null && !geodeticDatumGroup.isEmpty();
			case GMLPackage.GEODETIC_CRS_TYPE__GEODETIC_DATUM:
				return getGeodeticDatum() != null;
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
		result.append(" (ellipsoidalCSGroup: ");
		result.append(ellipsoidalCSGroup);
		result.append(", cartesianCSGroup: ");
		result.append(cartesianCSGroup);
		result.append(", sphericalCSGroup: ");
		result.append(sphericalCSGroup);
		result.append(", geodeticDatumGroup: ");
		result.append(geodeticDatumGroup);
		result.append(')');
		return result.toString();
	}

} //GeodeticCRSTypeImpl
