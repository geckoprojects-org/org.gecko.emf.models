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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.geojson.GeoJsonPackage;
import org.geojson.MultiPolygon;
import org.geojson.SimplePolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.geojson.impl.MultiPolygonImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.geojson.impl.MultiPolygonImpl#getPolygons <em>Polygons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPolygonImpl extends GeoJsonObjectImpl implements MultiPolygon {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final double[][][][] DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolygons() <em>Polygons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygons()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplePolygon> polygons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoJsonPackage.Literals.MULTI_POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double[][][][] getData() {
		return org.geojson.util.GeoJsonHelper.getMultiPolygonData(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(double[][][][] data) {
		org.geojson.util.GeoJsonHelper.setMultiPolygonData(this, data);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimplePolygon> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<SimplePolygon>(SimplePolygon.class, this, GeoJsonPackage.MULTI_POLYGON__POLYGONS);
		}
		return polygons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeoJsonPackage.MULTI_POLYGON__POLYGONS:
				return ((InternalEList<?>)getPolygons()).basicRemove(otherEnd, msgs);
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
			case GeoJsonPackage.MULTI_POLYGON__DATA:
				return getData();
			case GeoJsonPackage.MULTI_POLYGON__POLYGONS:
				return getPolygons();
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
			case GeoJsonPackage.MULTI_POLYGON__DATA:
				setData((double[][][][])newValue);
				return;
			case GeoJsonPackage.MULTI_POLYGON__POLYGONS:
				getPolygons().clear();
				getPolygons().addAll((Collection<? extends SimplePolygon>)newValue);
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
			case GeoJsonPackage.MULTI_POLYGON__DATA:
				setData(DATA_EDEFAULT);
				return;
			case GeoJsonPackage.MULTI_POLYGON__POLYGONS:
				getPolygons().clear();
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
			case GeoJsonPackage.MULTI_POLYGON__DATA:
				return DATA_EDEFAULT == null ? getData() != null : !DATA_EDEFAULT.equals(getData());
			case GeoJsonPackage.MULTI_POLYGON__POLYGONS:
				return polygons != null && !polygons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiPolygonImpl
