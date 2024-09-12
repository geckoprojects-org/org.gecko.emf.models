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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractGeometryTypeImpl#getAbstractGeometrySimpleExtensionGroupGroup <em>Abstract Geometry Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractGeometryTypeImpl#getAbstractGeometrySimpleExtensionGroup <em>Abstract Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractGeometryTypeImpl#getAbstractGeometryObjectExtensionGroupGroup <em>Abstract Geometry Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractGeometryTypeImpl#getAbstractGeometryObjectExtensionGroup <em>Abstract Geometry Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGeometryTypeImpl extends AbstractObjectTypeImpl implements AbstractGeometryType {
	/**
	 * The cached value of the '{@link #getAbstractGeometrySimpleExtensionGroupGroup() <em>Abstract Geometry Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGeometrySimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractGeometrySimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractGeometryObjectExtensionGroupGroup() <em>Abstract Geometry Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGeometryObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractGeometryObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractGeometrySimpleExtensionGroupGroup() {
		if (abstractGeometrySimpleExtensionGroupGroup == null) {
			abstractGeometrySimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractGeometrySimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractGeometrySimpleExtensionGroup() {
		return getAbstractGeometrySimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractGeometryType_AbstractGeometrySimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractGeometryObjectExtensionGroupGroup() {
		if (abstractGeometryObjectExtensionGroupGroup == null) {
			abstractGeometryObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractGeometryObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractGeometryObjectExtensionGroup() {
		return getAbstractGeometryObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractGeometryType_AbstractGeometryObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractGeometrySimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractGeometryObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractGeometryObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractGeometrySimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractGeometrySimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return getAbstractGeometrySimpleExtensionGroup();
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractGeometryObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractGeometryObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return getAbstractGeometryObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractGeometrySimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractGeometryObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractGeometrySimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractGeometryObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractGeometrySimpleExtensionGroupGroup != null && !abstractGeometrySimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return !getAbstractGeometrySimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractGeometryObjectExtensionGroupGroup != null && !abstractGeometryObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return !getAbstractGeometryObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractGeometrySimpleExtensionGroupGroup: ");
		result.append(abstractGeometrySimpleExtensionGroupGroup);
		result.append(", abstractGeometryObjectExtensionGroupGroup: ");
		result.append(abstractGeometryObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractGeometryTypeImpl
