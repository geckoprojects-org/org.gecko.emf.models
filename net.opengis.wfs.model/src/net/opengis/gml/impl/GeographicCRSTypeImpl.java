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

import net.opengis.gml.EllipsoidalCSRefType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.GeodeticDatumRefType;
import net.opengis.gml.GeographicCRSType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geographic CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.GeographicCRSTypeImpl#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeographicCRSTypeImpl#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeographicCRSTypeImpl extends AbstractReferenceSystemTypeImpl implements GeographicCRSType {
	/**
	 * The cached value of the '{@link #getUsesEllipsoidalCS() <em>Uses Ellipsoidal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEllipsoidalCS()
	 * @generated
	 * @ordered
	 */
	protected EllipsoidalCSRefType usesEllipsoidalCS;

	/**
	 * The cached value of the '{@link #getUsesGeodeticDatum() <em>Uses Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesGeodeticDatum()
	 * @generated
	 * @ordered
	 */
	protected GeodeticDatumRefType usesGeodeticDatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographicCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGeographicCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSRefType getUsesEllipsoidalCS() {
		return usesEllipsoidalCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEllipsoidalCS(EllipsoidalCSRefType newUsesEllipsoidalCS, NotificationChain msgs) {
		EllipsoidalCSRefType oldUsesEllipsoidalCS = usesEllipsoidalCS;
		usesEllipsoidalCS = newUsesEllipsoidalCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS, oldUsesEllipsoidalCS, newUsesEllipsoidalCS);
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
	public void setUsesEllipsoidalCS(EllipsoidalCSRefType newUsesEllipsoidalCS) {
		if (newUsesEllipsoidalCS != usesEllipsoidalCS) {
			NotificationChain msgs = null;
			if (usesEllipsoidalCS != null)
				msgs = ((InternalEObject)usesEllipsoidalCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS, null, msgs);
			if (newUsesEllipsoidalCS != null)
				msgs = ((InternalEObject)newUsesEllipsoidalCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS, null, msgs);
			msgs = basicSetUsesEllipsoidalCS(newUsesEllipsoidalCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS, newUsesEllipsoidalCS, newUsesEllipsoidalCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumRefType getUsesGeodeticDatum() {
		return usesGeodeticDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesGeodeticDatum(GeodeticDatumRefType newUsesGeodeticDatum, NotificationChain msgs) {
		GeodeticDatumRefType oldUsesGeodeticDatum = usesGeodeticDatum;
		usesGeodeticDatum = newUsesGeodeticDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM, oldUsesGeodeticDatum, newUsesGeodeticDatum);
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
	public void setUsesGeodeticDatum(GeodeticDatumRefType newUsesGeodeticDatum) {
		if (newUsesGeodeticDatum != usesGeodeticDatum) {
			NotificationChain msgs = null;
			if (usesGeodeticDatum != null)
				msgs = ((InternalEObject)usesGeodeticDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM, null, msgs);
			if (newUsesGeodeticDatum != null)
				msgs = ((InternalEObject)newUsesGeodeticDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM, null, msgs);
			msgs = basicSetUsesGeodeticDatum(newUsesGeodeticDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM, newUsesGeodeticDatum, newUsesGeodeticDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS:
				return basicSetUsesEllipsoidalCS(null, msgs);
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM:
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
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS:
				return getUsesEllipsoidalCS();
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM:
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
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS:
				setUsesEllipsoidalCS((EllipsoidalCSRefType)newValue);
				return;
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumRefType)newValue);
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
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS:
				setUsesEllipsoidalCS((EllipsoidalCSRefType)null);
				return;
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumRefType)null);
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
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_ELLIPSOIDAL_CS:
				return usesEllipsoidalCS != null;
			case GMLPackage.GEOGRAPHIC_CRS_TYPE__USES_GEODETIC_DATUM:
				return usesGeodeticDatum != null;
		}
		return super.eIsSet(featureID);
	}

} //GeographicCRSTypeImpl
