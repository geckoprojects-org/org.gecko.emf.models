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

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.VerticalCRSType;
import net.opengis.gml.gml.VerticalCSPropertyType;
import net.opengis.gml.gml.VerticalDatumPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.VerticalCRSTypeImpl#getVerticalCSGroup <em>Vertical CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.VerticalCRSTypeImpl#getVerticalCS <em>Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.VerticalCRSTypeImpl#getVerticalDatumGroup <em>Vertical Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.VerticalCRSTypeImpl#getVerticalDatum <em>Vertical Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticalCRSTypeImpl extends AbstractCRSTypeImpl implements VerticalCRSType {
	/**
	 * The cached value of the '{@link #getVerticalCSGroup() <em>Vertical CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap verticalCSGroup;

	/**
	 * The cached value of the '{@link #getVerticalDatumGroup() <em>Vertical Datum Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDatumGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap verticalDatumGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getVerticalCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getVerticalCSGroup() {
		if (verticalCSGroup == null) {
			verticalCSGroup = new BasicFeatureMap(this, GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS_GROUP);
		}
		return verticalCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSPropertyType getVerticalCS() {
		return (VerticalCSPropertyType)getVerticalCSGroup().get(GMLPackage.eINSTANCE.getVerticalCRSType_VerticalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCS(VerticalCSPropertyType newVerticalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getVerticalCSGroup()).basicAdd(GMLPackage.eINSTANCE.getVerticalCRSType_VerticalCS(), newVerticalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalCS(VerticalCSPropertyType newVerticalCS) {
		((FeatureMap.Internal)getVerticalCSGroup()).set(GMLPackage.eINSTANCE.getVerticalCRSType_VerticalCS(), newVerticalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getVerticalDatumGroup() {
		if (verticalDatumGroup == null) {
			verticalDatumGroup = new BasicFeatureMap(this, GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM_GROUP);
		}
		return verticalDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumPropertyType getVerticalDatum() {
		return (VerticalDatumPropertyType)getVerticalDatumGroup().get(GMLPackage.eINSTANCE.getVerticalCRSType_VerticalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatum(VerticalDatumPropertyType newVerticalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getVerticalDatumGroup()).basicAdd(GMLPackage.eINSTANCE.getVerticalCRSType_VerticalDatum(), newVerticalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDatum(VerticalDatumPropertyType newVerticalDatum) {
		((FeatureMap.Internal)getVerticalDatumGroup()).set(GMLPackage.eINSTANCE.getVerticalCRSType_VerticalDatum(), newVerticalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS_GROUP:
				return ((InternalEList<?>)getVerticalCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS:
				return basicSetVerticalCS(null, msgs);
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM_GROUP:
				return ((InternalEList<?>)getVerticalDatumGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM:
				return basicSetVerticalDatum(null, msgs);
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
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS_GROUP:
				if (coreType) return getVerticalCSGroup();
				return ((FeatureMap.Internal)getVerticalCSGroup()).getWrapper();
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS:
				return getVerticalCS();
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM_GROUP:
				if (coreType) return getVerticalDatumGroup();
				return ((FeatureMap.Internal)getVerticalDatumGroup()).getWrapper();
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM:
				return getVerticalDatum();
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
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS_GROUP:
				((FeatureMap.Internal)getVerticalCSGroup()).set(newValue);
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS:
				setVerticalCS((VerticalCSPropertyType)newValue);
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM_GROUP:
				((FeatureMap.Internal)getVerticalDatumGroup()).set(newValue);
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM:
				setVerticalDatum((VerticalDatumPropertyType)newValue);
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
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS_GROUP:
				getVerticalCSGroup().clear();
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS:
				setVerticalCS((VerticalCSPropertyType)null);
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM_GROUP:
				getVerticalDatumGroup().clear();
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM:
				setVerticalDatum((VerticalDatumPropertyType)null);
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
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS_GROUP:
				return verticalCSGroup != null && !verticalCSGroup.isEmpty();
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_CS:
				return getVerticalCS() != null;
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM_GROUP:
				return verticalDatumGroup != null && !verticalDatumGroup.isEmpty();
			case GMLPackage.VERTICAL_CRS_TYPE__VERTICAL_DATUM:
				return getVerticalDatum() != null;
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
		result.append(" (verticalCSGroup: ");
		result.append(verticalCSGroup);
		result.append(", verticalDatumGroup: ");
		result.append(verticalDatumGroup);
		result.append(')');
		return result.toString();
	}

} //VerticalCRSTypeImpl
