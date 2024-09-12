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
import net.opengis.gml.gml.GeocentricCRSType;
import net.opengis.gml.gml.GeodeticDatumPropertyType;
import net.opengis.gml.gml.SphericalCSPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geocentric CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.GeocentricCRSTypeImpl#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeocentricCRSTypeImpl#getUsesSphericalCS <em>Uses Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeocentricCRSTypeImpl#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeocentricCRSTypeImpl extends AbstractCRSTypeImpl implements GeocentricCRSType {
	/**
	 * The cached value of the '{@link #getUsesCartesianCS() <em>Uses Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesCartesianCS()
	 * @generated
	 * @ordered
	 */
	protected CartesianCSPropertyType usesCartesianCS;

	/**
	 * The cached value of the '{@link #getUsesSphericalCS() <em>Uses Spherical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesSphericalCS()
	 * @generated
	 * @ordered
	 */
	protected SphericalCSPropertyType usesSphericalCS;

	/**
	 * The cached value of the '{@link #getUsesGeodeticDatum() <em>Uses Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesGeodeticDatum()
	 * @generated
	 * @ordered
	 */
	protected GeodeticDatumPropertyType usesGeodeticDatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeocentricCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGeocentricCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getUsesCartesianCS() {
		return usesCartesianCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCartesianCS(CartesianCSPropertyType newUsesCartesianCS, NotificationChain msgs) {
		CartesianCSPropertyType oldUsesCartesianCS = usesCartesianCS;
		usesCartesianCS = newUsesCartesianCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS, oldUsesCartesianCS, newUsesCartesianCS);
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
	public void setUsesCartesianCS(CartesianCSPropertyType newUsesCartesianCS) {
		if (newUsesCartesianCS != usesCartesianCS) {
			NotificationChain msgs = null;
			if (usesCartesianCS != null)
				msgs = ((InternalEObject)usesCartesianCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS, null, msgs);
			if (newUsesCartesianCS != null)
				msgs = ((InternalEObject)newUsesCartesianCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS, null, msgs);
			msgs = basicSetUsesCartesianCS(newUsesCartesianCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS, newUsesCartesianCS, newUsesCartesianCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSPropertyType getUsesSphericalCS() {
		return usesSphericalCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesSphericalCS(SphericalCSPropertyType newUsesSphericalCS, NotificationChain msgs) {
		SphericalCSPropertyType oldUsesSphericalCS = usesSphericalCS;
		usesSphericalCS = newUsesSphericalCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS, oldUsesSphericalCS, newUsesSphericalCS);
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
	public void setUsesSphericalCS(SphericalCSPropertyType newUsesSphericalCS) {
		if (newUsesSphericalCS != usesSphericalCS) {
			NotificationChain msgs = null;
			if (usesSphericalCS != null)
				msgs = ((InternalEObject)usesSphericalCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS, null, msgs);
			if (newUsesSphericalCS != null)
				msgs = ((InternalEObject)newUsesSphericalCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS, null, msgs);
			msgs = basicSetUsesSphericalCS(newUsesSphericalCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS, newUsesSphericalCS, newUsesSphericalCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumPropertyType getUsesGeodeticDatum() {
		return usesGeodeticDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesGeodeticDatum(GeodeticDatumPropertyType newUsesGeodeticDatum, NotificationChain msgs) {
		GeodeticDatumPropertyType oldUsesGeodeticDatum = usesGeodeticDatum;
		usesGeodeticDatum = newUsesGeodeticDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM, oldUsesGeodeticDatum, newUsesGeodeticDatum);
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
	public void setUsesGeodeticDatum(GeodeticDatumPropertyType newUsesGeodeticDatum) {
		if (newUsesGeodeticDatum != usesGeodeticDatum) {
			NotificationChain msgs = null;
			if (usesGeodeticDatum != null)
				msgs = ((InternalEObject)usesGeodeticDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM, null, msgs);
			if (newUsesGeodeticDatum != null)
				msgs = ((InternalEObject)newUsesGeodeticDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM, null, msgs);
			msgs = basicSetUsesGeodeticDatum(newUsesGeodeticDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM, newUsesGeodeticDatum, newUsesGeodeticDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS:
				return basicSetUsesCartesianCS(null, msgs);
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS:
				return basicSetUsesSphericalCS(null, msgs);
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM:
				return basicSetUsesGeodeticDatum(null, msgs);
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
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS:
				return getUsesCartesianCS();
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS:
				return getUsesSphericalCS();
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM:
				return getUsesGeodeticDatum();
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
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS:
				setUsesSphericalCS((SphericalCSPropertyType)newValue);
				return;
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumPropertyType)newValue);
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
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSPropertyType)null);
				return;
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS:
				setUsesSphericalCS((SphericalCSPropertyType)null);
				return;
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumPropertyType)null);
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
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_CARTESIAN_CS:
				return usesCartesianCS != null;
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_SPHERICAL_CS:
				return usesSphericalCS != null;
			case GMLPackage.GEOCENTRIC_CRS_TYPE__USES_GEODETIC_DATUM:
				return usesGeodeticDatum != null;
		}
		return super.eIsSet(featureID);
	}

} //GeocentricCRSTypeImpl
