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

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.AbstractTimePrimitiveType;
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
 * An implementation of the model object '<em><b>Abstract Time Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractTimePrimitiveTypeImpl#getAbstractTimePrimitiveSimpleExtensionGroupGroup <em>Abstract Time Primitive Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractTimePrimitiveTypeImpl#getAbstractTimePrimitiveSimpleExtensionGroup <em>Abstract Time Primitive Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractTimePrimitiveTypeImpl#getAbstractTimePrimitiveObjectExtensionGroupGroup <em>Abstract Time Primitive Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractTimePrimitiveTypeImpl#getAbstractTimePrimitiveObjectExtensionGroup <em>Abstract Time Primitive Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTimePrimitiveTypeImpl extends AbstractObjectTypeImpl implements AbstractTimePrimitiveType {
	/**
	 * The cached value of the '{@link #getAbstractTimePrimitiveSimpleExtensionGroupGroup() <em>Abstract Time Primitive Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTimePrimitiveSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTimePrimitiveSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractTimePrimitiveObjectExtensionGroupGroup() <em>Abstract Time Primitive Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTimePrimitiveObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTimePrimitiveObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTimePrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractTimePrimitiveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractTimePrimitiveSimpleExtensionGroupGroup() {
		if (abstractTimePrimitiveSimpleExtensionGroupGroup == null) {
			abstractTimePrimitiveSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractTimePrimitiveSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractTimePrimitiveSimpleExtensionGroup() {
		return getAbstractTimePrimitiveSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractTimePrimitiveType_AbstractTimePrimitiveSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractTimePrimitiveObjectExtensionGroupGroup() {
		if (abstractTimePrimitiveObjectExtensionGroupGroup == null) {
			abstractTimePrimitiveObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractTimePrimitiveObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractTimePrimitiveObjectExtensionGroup() {
		return getAbstractTimePrimitiveObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractTimePrimitiveType_AbstractTimePrimitiveObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractTimePrimitiveSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractTimePrimitiveObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractTimePrimitiveObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractTimePrimitiveSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractTimePrimitiveSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP:
				return getAbstractTimePrimitiveSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractTimePrimitiveObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractTimePrimitiveObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP:
				return getAbstractTimePrimitiveObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractTimePrimitiveSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractTimePrimitiveObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractTimePrimitiveSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractTimePrimitiveObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractTimePrimitiveSimpleExtensionGroupGroup != null && !abstractTimePrimitiveSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP:
				return !getAbstractTimePrimitiveSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractTimePrimitiveObjectExtensionGroupGroup != null && !abstractTimePrimitiveObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP:
				return !getAbstractTimePrimitiveObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractTimePrimitiveSimpleExtensionGroupGroup: ");
		result.append(abstractTimePrimitiveSimpleExtensionGroupGroup);
		result.append(", abstractTimePrimitiveObjectExtensionGroupGroup: ");
		result.append(abstractTimePrimitiveObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractTimePrimitiveTypeImpl
