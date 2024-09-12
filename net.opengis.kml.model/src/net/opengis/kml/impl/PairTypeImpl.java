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
import net.opengis.kml.PairType;
import net.opengis.kml.StyleStateEnumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pair Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getAbstractStyleSelectorGroupGroup <em>Abstract Style Selector Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getPairSimpleExtensionGroupGroup <em>Pair Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getPairSimpleExtensionGroup <em>Pair Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getPairObjectExtensionGroupGroup <em>Pair Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PairTypeImpl#getPairObjectExtensionGroup <em>Pair Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PairTypeImpl extends AbstractObjectTypeImpl implements PairType {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final StyleStateEnumType KEY_EDEFAULT = StyleStateEnumType.NORMAL;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected StyleStateEnumType key = KEY_EDEFAULT;

	/**
	 * This is true if the Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyESet;

	/**
	 * The default value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected String styleUrl = STYLE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractStyleSelectorGroupGroup() <em>Abstract Style Selector Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractStyleSelectorGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractStyleSelectorGroupGroup;

	/**
	 * The cached value of the '{@link #getPairSimpleExtensionGroupGroup() <em>Pair Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap pairSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getPairObjectExtensionGroupGroup() <em>Pair Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap pairObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PairTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getPairType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleStateEnumType getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(StyleStateEnumType newKey) {
		StyleStateEnumType oldKey = key;
		key = newKey == null ? KEY_EDEFAULT : newKey;
		boolean oldKeyESet = keyESet;
		keyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.PAIR_TYPE__KEY, oldKey, key, !oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKey() {
		StyleStateEnumType oldKey = key;
		boolean oldKeyESet = keyESet;
		key = KEY_EDEFAULT;
		keyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.PAIR_TYPE__KEY, oldKey, KEY_EDEFAULT, oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKey() {
		return keyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleUrl() {
		return styleUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleUrl(String newStyleUrl) {
		String oldStyleUrl = styleUrl;
		styleUrl = newStyleUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.PAIR_TYPE__STYLE_URL, oldStyleUrl, styleUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractStyleSelectorGroupGroup() {
		if (abstractStyleSelectorGroupGroup == null) {
			abstractStyleSelectorGroupGroup = new BasicFeatureMap(this, KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP);
		}
		return abstractStyleSelectorGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractStyleSelectorType getAbstractStyleSelectorGroup() {
		return (AbstractStyleSelectorType)getAbstractStyleSelectorGroupGroup().get(KMLPackage.eINSTANCE.getPairType_AbstractStyleSelectorGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractStyleSelectorGroup(AbstractStyleSelectorType newAbstractStyleSelectorGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractStyleSelectorGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getPairType_AbstractStyleSelectorGroup(), newAbstractStyleSelectorGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPairSimpleExtensionGroupGroup() {
		if (pairSimpleExtensionGroupGroup == null) {
			pairSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return pairSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getPairSimpleExtensionGroup() {
		return getPairSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPairType_PairSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPairObjectExtensionGroupGroup() {
		if (pairObjectExtensionGroupGroup == null) {
			pairObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return pairObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getPairObjectExtensionGroup() {
		return getPairObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPairType_PairObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractStyleSelectorGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP:
				return basicSetAbstractStyleSelectorGroup(null, msgs);
			case KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPairSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPairObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getPairObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.PAIR_TYPE__KEY:
				return getKey();
			case KMLPackage.PAIR_TYPE__STYLE_URL:
				return getStyleUrl();
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				if (coreType) return getAbstractStyleSelectorGroupGroup();
				return ((FeatureMap.Internal)getAbstractStyleSelectorGroupGroup()).getWrapper();
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP:
				return getAbstractStyleSelectorGroup();
			case KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getPairSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getPairSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP:
				return getPairSimpleExtensionGroup();
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getPairObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getPairObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP:
				return getPairObjectExtensionGroup();
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
			case KMLPackage.PAIR_TYPE__KEY:
				setKey((StyleStateEnumType)newValue);
				return;
			case KMLPackage.PAIR_TYPE__STYLE_URL:
				setStyleUrl((String)newValue);
				return;
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractStyleSelectorGroupGroup()).set(newValue);
				return;
			case KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPairSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPairObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.PAIR_TYPE__KEY:
				unsetKey();
				return;
			case KMLPackage.PAIR_TYPE__STYLE_URL:
				setStyleUrl(STYLE_URL_EDEFAULT);
				return;
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				getAbstractStyleSelectorGroupGroup().clear();
				return;
			case KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP_GROUP:
				getPairSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP_GROUP:
				getPairObjectExtensionGroupGroup().clear();
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
			case KMLPackage.PAIR_TYPE__KEY:
				return isSetKey();
			case KMLPackage.PAIR_TYPE__STYLE_URL:
				return STYLE_URL_EDEFAULT == null ? styleUrl != null : !STYLE_URL_EDEFAULT.equals(styleUrl);
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP:
				return abstractStyleSelectorGroupGroup != null && !abstractStyleSelectorGroupGroup.isEmpty();
			case KMLPackage.PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP:
				return getAbstractStyleSelectorGroup() != null;
			case KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP_GROUP:
				return pairSimpleExtensionGroupGroup != null && !pairSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP:
				return !getPairSimpleExtensionGroup().isEmpty();
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP_GROUP:
				return pairObjectExtensionGroupGroup != null && !pairObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP:
				return !getPairObjectExtensionGroup().isEmpty();
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
		result.append(" (key: ");
		if (keyESet) result.append(key); else result.append("<unset>");
		result.append(", styleUrl: ");
		result.append(styleUrl);
		result.append(", abstractStyleSelectorGroupGroup: ");
		result.append(abstractStyleSelectorGroupGroup);
		result.append(", pairSimpleExtensionGroupGroup: ");
		result.append(pairSimpleExtensionGroupGroup);
		result.append(", pairObjectExtensionGroupGroup: ");
		result.append(pairObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //PairTypeImpl
