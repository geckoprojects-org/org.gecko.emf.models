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
import net.opengis.kml.AbstractViewType;
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
 * An implementation of the model object '<em><b>Abstract View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractViewTypeImpl#getAbstractViewSimpleExtensionGroupGroup <em>Abstract View Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractViewTypeImpl#getAbstractViewSimpleExtensionGroup <em>Abstract View Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractViewTypeImpl#getAbstractViewObjectExtensionGroupGroup <em>Abstract View Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractViewTypeImpl#getAbstractViewObjectExtensionGroup <em>Abstract View Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractViewTypeImpl extends AbstractObjectTypeImpl implements AbstractViewType {
	/**
	 * The cached value of the '{@link #getAbstractViewSimpleExtensionGroupGroup() <em>Abstract View Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractViewSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractViewSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractViewObjectExtensionGroupGroup() <em>Abstract View Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractViewObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractViewObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractViewType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractViewSimpleExtensionGroupGroup() {
		if (abstractViewSimpleExtensionGroupGroup == null) {
			abstractViewSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractViewSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractViewSimpleExtensionGroup() {
		return getAbstractViewSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractViewType_AbstractViewSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractViewObjectExtensionGroupGroup() {
		if (abstractViewObjectExtensionGroupGroup == null) {
			abstractViewObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractViewObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractViewObjectExtensionGroup() {
		return getAbstractViewObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractViewType_AbstractViewObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractViewSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractViewObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractViewObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractViewSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractViewSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP:
				return getAbstractViewSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractViewObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractViewObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP:
				return getAbstractViewObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractViewSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractViewObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractViewSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractViewObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractViewSimpleExtensionGroupGroup != null && !abstractViewSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP:
				return !getAbstractViewSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractViewObjectExtensionGroupGroup != null && !abstractViewObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP:
				return !getAbstractViewObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractViewSimpleExtensionGroupGroup: ");
		result.append(abstractViewSimpleExtensionGroupGroup);
		result.append(", abstractViewObjectExtensionGroupGroup: ");
		result.append(abstractViewObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractViewTypeImpl
