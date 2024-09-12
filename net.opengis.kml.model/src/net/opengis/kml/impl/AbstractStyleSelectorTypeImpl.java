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
import net.opengis.kml.AbstractStyleSelectorType;
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
 * An implementation of the model object '<em><b>Abstract Style Selector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractStyleSelectorTypeImpl#getAbstractStyleSelectorSimpleExtensionGroupGroup <em>Abstract Style Selector Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractStyleSelectorTypeImpl#getAbstractStyleSelectorSimpleExtensionGroup <em>Abstract Style Selector Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractStyleSelectorTypeImpl#getAbstractStyleSelectorObjectExtensionGroupGroup <em>Abstract Style Selector Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractStyleSelectorTypeImpl#getAbstractStyleSelectorObjectExtensionGroup <em>Abstract Style Selector Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStyleSelectorTypeImpl extends AbstractObjectTypeImpl implements AbstractStyleSelectorType {
	/**
	 * The cached value of the '{@link #getAbstractStyleSelectorSimpleExtensionGroupGroup() <em>Abstract Style Selector Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractStyleSelectorSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractStyleSelectorSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractStyleSelectorObjectExtensionGroupGroup() <em>Abstract Style Selector Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractStyleSelectorObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractStyleSelectorObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStyleSelectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractStyleSelectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractStyleSelectorSimpleExtensionGroupGroup() {
		if (abstractStyleSelectorSimpleExtensionGroupGroup == null) {
			abstractStyleSelectorSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractStyleSelectorSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractStyleSelectorSimpleExtensionGroup() {
		return getAbstractStyleSelectorSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractStyleSelectorType_AbstractStyleSelectorSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractStyleSelectorObjectExtensionGroupGroup() {
		if (abstractStyleSelectorObjectExtensionGroupGroup == null) {
			abstractStyleSelectorObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractStyleSelectorObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractStyleSelectorObjectExtensionGroup() {
		return getAbstractStyleSelectorObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractStyleSelectorType_AbstractStyleSelectorObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractStyleSelectorSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractStyleSelectorObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractStyleSelectorObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractStyleSelectorSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractStyleSelectorSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP:
				return getAbstractStyleSelectorSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractStyleSelectorObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractStyleSelectorObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP:
				return getAbstractStyleSelectorObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractStyleSelectorSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractStyleSelectorObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractStyleSelectorSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractStyleSelectorObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractStyleSelectorSimpleExtensionGroupGroup != null && !abstractStyleSelectorSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP:
				return !getAbstractStyleSelectorSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractStyleSelectorObjectExtensionGroupGroup != null && !abstractStyleSelectorObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP:
				return !getAbstractStyleSelectorObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractStyleSelectorSimpleExtensionGroupGroup: ");
		result.append(abstractStyleSelectorSimpleExtensionGroupGroup);
		result.append(", abstractStyleSelectorObjectExtensionGroupGroup: ");
		result.append(abstractStyleSelectorObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractStyleSelectorTypeImpl
