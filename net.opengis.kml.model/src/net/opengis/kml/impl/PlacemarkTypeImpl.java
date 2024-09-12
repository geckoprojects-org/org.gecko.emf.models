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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractGeometryType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.PlacemarkType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placemark Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.PlacemarkTypeImpl#getAbstractGeometryGroupGroup <em>Abstract Geometry Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PlacemarkTypeImpl#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PlacemarkTypeImpl#getPlacemarkSimpleExtensionGroupGroup <em>Placemark Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PlacemarkTypeImpl#getPlacemarkSimpleExtensionGroup <em>Placemark Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PlacemarkTypeImpl#getPlacemarkObjectExtensionGroupGroup <em>Placemark Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PlacemarkTypeImpl#getPlacemarkObjectExtensionGroup <em>Placemark Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlacemarkTypeImpl extends AbstractFeatureTypeImpl implements PlacemarkType {
	/**
	 * The cached value of the '{@link #getAbstractGeometryGroupGroup() <em>Abstract Geometry Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGeometryGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractGeometryGroupGroup;

	/**
	 * The cached value of the '{@link #getPlacemarkSimpleExtensionGroupGroup() <em>Placemark Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacemarkSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap placemarkSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getPlacemarkObjectExtensionGroupGroup() <em>Placemark Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacemarkObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap placemarkObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacemarkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getPlacemarkType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractGeometryGroupGroup() {
		if (abstractGeometryGroupGroup == null) {
			abstractGeometryGroupGroup = new BasicFeatureMap(this, KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP);
		}
		return abstractGeometryGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeometryType getAbstractGeometryGroup() {
		return (AbstractGeometryType)getAbstractGeometryGroupGroup().get(KMLPackage.eINSTANCE.getPlacemarkType_AbstractGeometryGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeometryGroup(AbstractGeometryType newAbstractGeometryGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractGeometryGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getPlacemarkType_AbstractGeometryGroup(), newAbstractGeometryGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPlacemarkSimpleExtensionGroupGroup() {
		if (placemarkSimpleExtensionGroupGroup == null) {
			placemarkSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return placemarkSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getPlacemarkSimpleExtensionGroup() {
		return getPlacemarkSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPlacemarkType_PlacemarkSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPlacemarkObjectExtensionGroupGroup() {
		if (placemarkObjectExtensionGroupGroup == null) {
			placemarkObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return placemarkObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getPlacemarkObjectExtensionGroup() {
		return getPlacemarkObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPlacemarkType_PlacemarkObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractGeometryGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return basicSetAbstractGeometryGroup(null, msgs);
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPlacemarkSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPlacemarkObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getPlacemarkObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				if (coreType) return getAbstractGeometryGroupGroup();
				return ((FeatureMap.Internal)getAbstractGeometryGroupGroup()).getWrapper();
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return getAbstractGeometryGroup();
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getPlacemarkSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getPlacemarkSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP:
				return getPlacemarkSimpleExtensionGroup();
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getPlacemarkObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getPlacemarkObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP:
				return getPlacemarkObjectExtensionGroup();
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
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractGeometryGroupGroup()).set(newValue);
				return;
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPlacemarkSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPlacemarkObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				getAbstractGeometryGroupGroup().clear();
				return;
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP_GROUP:
				getPlacemarkSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP_GROUP:
				getPlacemarkObjectExtensionGroupGroup().clear();
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
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				return abstractGeometryGroupGroup != null && !abstractGeometryGroupGroup.isEmpty();
			case KMLPackage.PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return getAbstractGeometryGroup() != null;
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP_GROUP:
				return placemarkSimpleExtensionGroupGroup != null && !placemarkSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP:
				return !getPlacemarkSimpleExtensionGroup().isEmpty();
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP_GROUP:
				return placemarkObjectExtensionGroupGroup != null && !placemarkObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP:
				return !getPlacemarkObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractGeometryGroupGroup: ");
		result.append(abstractGeometryGroupGroup);
		result.append(", placemarkSimpleExtensionGroupGroup: ");
		result.append(placemarkSimpleExtensionGroupGroup);
		result.append(", placemarkObjectExtensionGroupGroup: ");
		result.append(placemarkObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //PlacemarkTypeImpl
