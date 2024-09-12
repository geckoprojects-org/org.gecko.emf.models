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
import net.opengis.kml.MultiGeometryType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.MultiGeometryTypeImpl#getAbstractGeometryGroupGroup <em>Abstract Geometry Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.MultiGeometryTypeImpl#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.MultiGeometryTypeImpl#getMultiGeometrySimpleExtensionGroupGroup <em>Multi Geometry Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.MultiGeometryTypeImpl#getMultiGeometrySimpleExtensionGroup <em>Multi Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.MultiGeometryTypeImpl#getMultiGeometryObjectExtensionGroupGroup <em>Multi Geometry Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.MultiGeometryTypeImpl#getMultiGeometryObjectExtensionGroup <em>Multi Geometry Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiGeometryTypeImpl extends AbstractGeometryTypeImpl implements MultiGeometryType {
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
	 * The cached value of the '{@link #getMultiGeometrySimpleExtensionGroupGroup() <em>Multi Geometry Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiGeometrySimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap multiGeometrySimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getMultiGeometryObjectExtensionGroupGroup() <em>Multi Geometry Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiGeometryObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap multiGeometryObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getMultiGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractGeometryGroupGroup() {
		if (abstractGeometryGroupGroup == null) {
			abstractGeometryGroupGroup = new BasicFeatureMap(this, KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP);
		}
		return abstractGeometryGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeometryType> getAbstractGeometryGroup() {
		return getAbstractGeometryGroupGroup().list(KMLPackage.eINSTANCE.getMultiGeometryType_AbstractGeometryGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMultiGeometrySimpleExtensionGroupGroup() {
		if (multiGeometrySimpleExtensionGroupGroup == null) {
			multiGeometrySimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return multiGeometrySimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getMultiGeometrySimpleExtensionGroup() {
		return getMultiGeometrySimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getMultiGeometryType_MultiGeometrySimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMultiGeometryObjectExtensionGroupGroup() {
		if (multiGeometryObjectExtensionGroupGroup == null) {
			multiGeometryObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return multiGeometryObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getMultiGeometryObjectExtensionGroup() {
		return getMultiGeometryObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getMultiGeometryType_MultiGeometryObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractGeometryGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return ((InternalEList<?>)getAbstractGeometryGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getMultiGeometrySimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getMultiGeometryObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getMultiGeometryObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				if (coreType) return getAbstractGeometryGroupGroup();
				return ((FeatureMap.Internal)getAbstractGeometryGroupGroup()).getWrapper();
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return getAbstractGeometryGroup();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getMultiGeometrySimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getMultiGeometrySimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return getMultiGeometrySimpleExtensionGroup();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getMultiGeometryObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getMultiGeometryObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return getMultiGeometryObjectExtensionGroup();
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
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractGeometryGroupGroup()).set(newValue);
				return;
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getMultiGeometrySimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getMultiGeometryObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				getAbstractGeometryGroupGroup().clear();
				return;
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				getMultiGeometrySimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				getMultiGeometryObjectExtensionGroupGroup().clear();
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
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP:
				return abstractGeometryGroupGroup != null && !abstractGeometryGroupGroup.isEmpty();
			case KMLPackage.MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return !getAbstractGeometryGroup().isEmpty();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				return multiGeometrySimpleExtensionGroupGroup != null && !multiGeometrySimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return !getMultiGeometrySimpleExtensionGroup().isEmpty();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				return multiGeometryObjectExtensionGroupGroup != null && !multiGeometryObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return !getMultiGeometryObjectExtensionGroup().isEmpty();
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
		result.append(", multiGeometrySimpleExtensionGroupGroup: ");
		result.append(multiGeometrySimpleExtensionGroupGroup);
		result.append(", multiGeometryObjectExtensionGroupGroup: ");
		result.append(multiGeometryObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //MultiGeometryTypeImpl
