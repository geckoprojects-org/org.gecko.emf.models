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

import java.util.Collection;

import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.PolygonType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.PolygonTypeImpl#getExteriorGroup <em>Exterior Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PolygonTypeImpl#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PolygonTypeImpl#getInteriorGroup <em>Interior Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PolygonTypeImpl#getInterior <em>Interior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonTypeImpl extends AbstractSurfaceTypeImpl implements PolygonType {
	/**
	 * The cached value of the '{@link #getExteriorGroup() <em>Exterior Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExteriorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap exteriorGroup;

	/**
	 * The cached value of the '{@link #getInteriorGroup() <em>Interior Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap interiorGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getPolygonType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExteriorGroup() {
		if (exteriorGroup == null) {
			exteriorGroup = new BasicFeatureMap(this, GMLPackage.POLYGON_TYPE__EXTERIOR_GROUP);
		}
		return exteriorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRingPropertyType getExterior() {
		return (AbstractRingPropertyType)getExteriorGroup().get(GMLPackage.eINSTANCE.getPolygonType_Exterior(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExterior(AbstractRingPropertyType newExterior, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExteriorGroup()).basicAdd(GMLPackage.eINSTANCE.getPolygonType_Exterior(), newExterior, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExterior(AbstractRingPropertyType newExterior) {
		((FeatureMap.Internal)getExteriorGroup()).set(GMLPackage.eINSTANCE.getPolygonType_Exterior(), newExterior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInteriorGroup() {
		if (interiorGroup == null) {
			interiorGroup = new BasicFeatureMap(this, GMLPackage.POLYGON_TYPE__INTERIOR_GROUP);
		}
		return interiorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRingPropertyType> getInterior() {
		return getInteriorGroup().list(GMLPackage.eINSTANCE.getPolygonType_Interior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.POLYGON_TYPE__EXTERIOR_GROUP:
				return ((InternalEList<?>)getExteriorGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				return basicSetExterior(null, msgs);
			case GMLPackage.POLYGON_TYPE__INTERIOR_GROUP:
				return ((InternalEList<?>)getInteriorGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				return ((InternalEList<?>)getInterior()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR_GROUP:
				if (coreType) return getExteriorGroup();
				return ((FeatureMap.Internal)getExteriorGroup()).getWrapper();
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				return getExterior();
			case GMLPackage.POLYGON_TYPE__INTERIOR_GROUP:
				if (coreType) return getInteriorGroup();
				return ((FeatureMap.Internal)getInteriorGroup()).getWrapper();
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				return getInterior();
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR_GROUP:
				((FeatureMap.Internal)getExteriorGroup()).set(newValue);
				return;
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)newValue);
				return;
			case GMLPackage.POLYGON_TYPE__INTERIOR_GROUP:
				((FeatureMap.Internal)getInteriorGroup()).set(newValue);
				return;
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				getInterior().clear();
				getInterior().addAll((Collection<? extends AbstractRingPropertyType>)newValue);
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR_GROUP:
				getExteriorGroup().clear();
				return;
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)null);
				return;
			case GMLPackage.POLYGON_TYPE__INTERIOR_GROUP:
				getInteriorGroup().clear();
				return;
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				getInterior().clear();
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR_GROUP:
				return exteriorGroup != null && !exteriorGroup.isEmpty();
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				return getExterior() != null;
			case GMLPackage.POLYGON_TYPE__INTERIOR_GROUP:
				return interiorGroup != null && !interiorGroup.isEmpty();
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				return !getInterior().isEmpty();
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
		result.append(" (exteriorGroup: ");
		result.append(exteriorGroup);
		result.append(", interiorGroup: ");
		result.append(interiorGroup);
		result.append(')');
		return result.toString();
	}

} //PolygonTypeImpl
