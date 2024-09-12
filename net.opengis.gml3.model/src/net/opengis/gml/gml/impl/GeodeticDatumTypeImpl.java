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

import net.opengis.gml.gml.EllipsoidPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.GeodeticDatumType;
import net.opengis.gml.gml.PrimeMeridianPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geodetic Datum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticDatumTypeImpl#getPrimeMeridian <em>Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.GeodeticDatumTypeImpl#getEllipsoid <em>Ellipsoid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeodeticDatumTypeImpl extends AbstractDatumTypeImpl implements GeodeticDatumType {
	/**
	 * The cached value of the '{@link #getPrimeMeridian() <em>Prime Meridian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMeridian()
	 * @generated
	 * @ordered
	 */
	protected PrimeMeridianPropertyType primeMeridian;

	/**
	 * The cached value of the '{@link #getEllipsoid() <em>Ellipsoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipsoid()
	 * @generated
	 * @ordered
	 */
	protected EllipsoidPropertyType ellipsoid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeodeticDatumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGeodeticDatumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianPropertyType getPrimeMeridian() {
		return primeMeridian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridian(PrimeMeridianPropertyType newPrimeMeridian, NotificationChain msgs) {
		PrimeMeridianPropertyType oldPrimeMeridian = primeMeridian;
		primeMeridian = newPrimeMeridian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN, oldPrimeMeridian, newPrimeMeridian);
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
	public void setPrimeMeridian(PrimeMeridianPropertyType newPrimeMeridian) {
		if (newPrimeMeridian != primeMeridian) {
			NotificationChain msgs = null;
			if (primeMeridian != null)
				msgs = ((InternalEObject)primeMeridian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN, null, msgs);
			if (newPrimeMeridian != null)
				msgs = ((InternalEObject)newPrimeMeridian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN, null, msgs);
			msgs = basicSetPrimeMeridian(newPrimeMeridian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN, newPrimeMeridian, newPrimeMeridian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidPropertyType getEllipsoid() {
		return ellipsoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoid(EllipsoidPropertyType newEllipsoid, NotificationChain msgs) {
		EllipsoidPropertyType oldEllipsoid = ellipsoid;
		ellipsoid = newEllipsoid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID, oldEllipsoid, newEllipsoid);
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
	public void setEllipsoid(EllipsoidPropertyType newEllipsoid) {
		if (newEllipsoid != ellipsoid) {
			NotificationChain msgs = null;
			if (ellipsoid != null)
				msgs = ((InternalEObject)ellipsoid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID, null, msgs);
			if (newEllipsoid != null)
				msgs = ((InternalEObject)newEllipsoid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID, null, msgs);
			msgs = basicSetEllipsoid(newEllipsoid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID, newEllipsoid, newEllipsoid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				return basicSetPrimeMeridian(null, msgs);
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				return basicSetEllipsoid(null, msgs);
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				return getPrimeMeridian();
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				return getEllipsoid();
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianPropertyType)newValue);
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				setEllipsoid((EllipsoidPropertyType)newValue);
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianPropertyType)null);
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				setEllipsoid((EllipsoidPropertyType)null);
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				return primeMeridian != null;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				return ellipsoid != null;
		}
		return super.eIsSet(featureID);
	}

} //GeodeticDatumTypeImpl
