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

import java.util.Collection;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.PairType;
import net.opengis.kml.StyleMapType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.StyleMapTypeImpl#getPair <em>Pair</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleMapTypeImpl#getStyleMapSimpleExtensionGroupGroup <em>Style Map Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleMapTypeImpl#getStyleMapSimpleExtensionGroup <em>Style Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleMapTypeImpl#getStyleMapObjectExtensionGroupGroup <em>Style Map Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.StyleMapTypeImpl#getStyleMapObjectExtensionGroup <em>Style Map Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleMapTypeImpl extends AbstractStyleSelectorTypeImpl implements StyleMapType {
	/**
	 * The cached value of the '{@link #getPair() <em>Pair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPair()
	 * @generated
	 * @ordered
	 */
	protected EList<PairType> pair;

	/**
	 * The cached value of the '{@link #getStyleMapSimpleExtensionGroupGroup() <em>Style Map Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleMapSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap styleMapSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getStyleMapObjectExtensionGroupGroup() <em>Style Map Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleMapObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap styleMapObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getStyleMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PairType> getPair() {
		if (pair == null) {
			pair = new EObjectContainmentEList<PairType>(PairType.class, this, KMLPackage.STYLE_MAP_TYPE__PAIR);
		}
		return pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStyleMapSimpleExtensionGroupGroup() {
		if (styleMapSimpleExtensionGroupGroup == null) {
			styleMapSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return styleMapSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getStyleMapSimpleExtensionGroup() {
		return getStyleMapSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getStyleMapType_StyleMapSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStyleMapObjectExtensionGroupGroup() {
		if (styleMapObjectExtensionGroupGroup == null) {
			styleMapObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return styleMapObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getStyleMapObjectExtensionGroup() {
		return getStyleMapObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getStyleMapType_StyleMapObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.STYLE_MAP_TYPE__PAIR:
				return ((InternalEList<?>)getPair()).basicRemove(otherEnd, msgs);
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getStyleMapSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getStyleMapObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getStyleMapObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.STYLE_MAP_TYPE__PAIR:
				return getPair();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getStyleMapSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getStyleMapSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP:
				return getStyleMapSimpleExtensionGroup();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getStyleMapObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getStyleMapObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP:
				return getStyleMapObjectExtensionGroup();
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
			case KMLPackage.STYLE_MAP_TYPE__PAIR:
				getPair().clear();
				getPair().addAll((Collection<? extends PairType>)newValue);
				return;
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getStyleMapSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getStyleMapObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.STYLE_MAP_TYPE__PAIR:
				getPair().clear();
				return;
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				getStyleMapSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				getStyleMapObjectExtensionGroupGroup().clear();
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
			case KMLPackage.STYLE_MAP_TYPE__PAIR:
				return pair != null && !pair.isEmpty();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				return styleMapSimpleExtensionGroupGroup != null && !styleMapSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP:
				return !getStyleMapSimpleExtensionGroup().isEmpty();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				return styleMapObjectExtensionGroupGroup != null && !styleMapObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP:
				return !getStyleMapObjectExtensionGroup().isEmpty();
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
		result.append(" (styleMapSimpleExtensionGroupGroup: ");
		result.append(styleMapSimpleExtensionGroupGroup);
		result.append(", styleMapObjectExtensionGroupGroup: ");
		result.append(styleMapObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //StyleMapTypeImpl
