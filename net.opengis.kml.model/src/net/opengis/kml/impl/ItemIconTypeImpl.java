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

import java.util.List;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.ItemIconStateEnumType;
import net.opengis.kml.ItemIconType;
import net.opengis.kml.KMLPackage;

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
 * An implementation of the model object '<em><b>Item Icon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ItemIconTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ItemIconTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ItemIconTypeImpl#getItemIconSimpleExtensionGroupGroup <em>Item Icon Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ItemIconTypeImpl#getItemIconSimpleExtensionGroup <em>Item Icon Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ItemIconTypeImpl#getItemIconObjectExtensionGroupGroup <em>Item Icon Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ItemIconTypeImpl#getItemIconObjectExtensionGroup <em>Item Icon Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemIconTypeImpl extends AbstractObjectTypeImpl implements ItemIconType {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final List<ItemIconStateEnumType> STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected List<ItemIconStateEnumType> state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemIconSimpleExtensionGroupGroup() <em>Item Icon Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIconSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemIconSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getItemIconObjectExtensionGroupGroup() <em>Item Icon Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIconObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemIconObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemIconTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getItemIconType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ItemIconStateEnumType> getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(List<ItemIconStateEnumType> newState) {
		List<ItemIconStateEnumType> oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ITEM_ICON_TYPE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ITEM_ICON_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getItemIconSimpleExtensionGroupGroup() {
		if (itemIconSimpleExtensionGroupGroup == null) {
			itemIconSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return itemIconSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getItemIconSimpleExtensionGroup() {
		return getItemIconSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getItemIconType_ItemIconSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getItemIconObjectExtensionGroupGroup() {
		if (itemIconObjectExtensionGroupGroup == null) {
			itemIconObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return itemIconObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getItemIconObjectExtensionGroup() {
		return getItemIconObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getItemIconType_ItemIconObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getItemIconSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getItemIconObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getItemIconObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ITEM_ICON_TYPE__STATE:
				return getState();
			case KMLPackage.ITEM_ICON_TYPE__HREF:
				return getHref();
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getItemIconSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getItemIconSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP:
				return getItemIconSimpleExtensionGroup();
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getItemIconObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getItemIconObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP:
				return getItemIconObjectExtensionGroup();
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
			case KMLPackage.ITEM_ICON_TYPE__STATE:
				setState((List<ItemIconStateEnumType>)newValue);
				return;
			case KMLPackage.ITEM_ICON_TYPE__HREF:
				setHref((String)newValue);
				return;
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getItemIconSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getItemIconObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ITEM_ICON_TYPE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case KMLPackage.ITEM_ICON_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP_GROUP:
				getItemIconSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP_GROUP:
				getItemIconObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ITEM_ICON_TYPE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case KMLPackage.ITEM_ICON_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP_GROUP:
				return itemIconSimpleExtensionGroupGroup != null && !itemIconSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP:
				return !getItemIconSimpleExtensionGroup().isEmpty();
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP_GROUP:
				return itemIconObjectExtensionGroupGroup != null && !itemIconObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP:
				return !getItemIconObjectExtensionGroup().isEmpty();
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
		result.append(" (state: ");
		result.append(state);
		result.append(", href: ");
		result.append(href);
		result.append(", itemIconSimpleExtensionGroupGroup: ");
		result.append(itemIconSimpleExtensionGroupGroup);
		result.append(", itemIconObjectExtensionGroupGroup: ");
		result.append(itemIconObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ItemIconTypeImpl
