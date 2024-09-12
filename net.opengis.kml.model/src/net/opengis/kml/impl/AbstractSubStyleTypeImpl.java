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
import net.opengis.kml.AbstractSubStyleType;
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
 * An implementation of the model object '<em><b>Abstract Sub Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractSubStyleTypeImpl#getAbstractSubStyleSimpleExtensionGroupGroup <em>Abstract Sub Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractSubStyleTypeImpl#getAbstractSubStyleSimpleExtensionGroup <em>Abstract Sub Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractSubStyleTypeImpl#getAbstractSubStyleObjectExtensionGroupGroup <em>Abstract Sub Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractSubStyleTypeImpl#getAbstractSubStyleObjectExtensionGroup <em>Abstract Sub Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractSubStyleTypeImpl extends AbstractObjectTypeImpl implements AbstractSubStyleType {
	/**
	 * The cached value of the '{@link #getAbstractSubStyleSimpleExtensionGroupGroup() <em>Abstract Sub Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSubStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractSubStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractSubStyleObjectExtensionGroupGroup() <em>Abstract Sub Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSubStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractSubStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSubStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractSubStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractSubStyleSimpleExtensionGroupGroup() {
		if (abstractSubStyleSimpleExtensionGroupGroup == null) {
			abstractSubStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractSubStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractSubStyleSimpleExtensionGroup() {
		return getAbstractSubStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractSubStyleType_AbstractSubStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractSubStyleObjectExtensionGroupGroup() {
		if (abstractSubStyleObjectExtensionGroupGroup == null) {
			abstractSubStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractSubStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractSubStyleObjectExtensionGroup() {
		return getAbstractSubStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractSubStyleType_AbstractSubStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractSubStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractSubStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractSubStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractSubStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractSubStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP:
				return getAbstractSubStyleSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractSubStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractSubStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP:
				return getAbstractSubStyleObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractSubStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractSubStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractSubStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractSubStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractSubStyleSimpleExtensionGroupGroup != null && !abstractSubStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getAbstractSubStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractSubStyleObjectExtensionGroupGroup != null && !abstractSubStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP:
				return !getAbstractSubStyleObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractSubStyleSimpleExtensionGroupGroup: ");
		result.append(abstractSubStyleSimpleExtensionGroupGroup);
		result.append(", abstractSubStyleObjectExtensionGroupGroup: ");
		result.append(abstractSubStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractSubStyleTypeImpl
