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
package org.geojson.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geojson.GeoJsonPackage;
import org.geojson.Hole;
import org.geojson.Ring;
import org.geojson.SimplePolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geojson.impl.SimplePolygonImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.geojson.impl.SimplePolygonImpl#getExteriorRing <em>Exterior Ring</em>}</li>
 *   <li>{@link org.geojson.impl.SimplePolygonImpl#getInteriorHoles <em>Interior Holes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimplePolygonImpl extends MinimalEObjectImpl.Container implements SimplePolygon {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final double[][][] DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExteriorRing() <em>Exterior Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExteriorRing()
	 * @generated
	 * @ordered
	 */
	protected Ring exteriorRing;

	/**
	 * The cached value of the '{@link #getInteriorHoles() <em>Interior Holes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorHoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Hole> interiorHoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoJsonPackage.Literals.SIMPLE_POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double[][][] getData() {
		return org.geojson.util.GeoJsonHelper.getSimplePolygonData(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(double[][][] data) {
		org.geojson.util.GeoJsonHelper.setSimplePolygonData(this, data);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ring getExteriorRing() {
		return exteriorRing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExteriorRing(Ring newExteriorRing, NotificationChain msgs) {
		Ring oldExteriorRing = exteriorRing;
		exteriorRing = newExteriorRing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING, oldExteriorRing, newExteriorRing);
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
	public void setExteriorRing(Ring newExteriorRing) {
		if (newExteriorRing != exteriorRing) {
			NotificationChain msgs = null;
			if (exteriorRing != null)
				msgs = ((InternalEObject)exteriorRing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING, null, msgs);
			if (newExteriorRing != null)
				msgs = ((InternalEObject)newExteriorRing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING, null, msgs);
			msgs = basicSetExteriorRing(newExteriorRing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING, newExteriorRing, newExteriorRing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hole> getInteriorHoles() {
		if (interiorHoles == null) {
			interiorHoles = new EObjectContainmentEList<Hole>(Hole.class, this, GeoJsonPackage.SIMPLE_POLYGON__INTERIOR_HOLES);
		}
		return interiorHoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING:
				return basicSetExteriorRing(null, msgs);
			case GeoJsonPackage.SIMPLE_POLYGON__INTERIOR_HOLES:
				return ((InternalEList<?>)getInteriorHoles()).basicRemove(otherEnd, msgs);
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
			case GeoJsonPackage.SIMPLE_POLYGON__DATA:
				return getData();
			case GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING:
				return getExteriorRing();
			case GeoJsonPackage.SIMPLE_POLYGON__INTERIOR_HOLES:
				return getInteriorHoles();
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
			case GeoJsonPackage.SIMPLE_POLYGON__DATA:
				setData((double[][][])newValue);
				return;
			case GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING:
				setExteriorRing((Ring)newValue);
				return;
			case GeoJsonPackage.SIMPLE_POLYGON__INTERIOR_HOLES:
				getInteriorHoles().clear();
				getInteriorHoles().addAll((Collection<? extends Hole>)newValue);
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
			case GeoJsonPackage.SIMPLE_POLYGON__DATA:
				setData(DATA_EDEFAULT);
				return;
			case GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING:
				setExteriorRing((Ring)null);
				return;
			case GeoJsonPackage.SIMPLE_POLYGON__INTERIOR_HOLES:
				getInteriorHoles().clear();
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
			case GeoJsonPackage.SIMPLE_POLYGON__DATA:
				return DATA_EDEFAULT == null ? getData() != null : !DATA_EDEFAULT.equals(getData());
			case GeoJsonPackage.SIMPLE_POLYGON__EXTERIOR_RING:
				return exteriorRing != null;
			case GeoJsonPackage.SIMPLE_POLYGON__INTERIOR_HOLES:
				return interiorHoles != null && !interiorHoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimplePolygonImpl
