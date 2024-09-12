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
import net.opengis.kml.BasicLinkType;
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
 * An implementation of the model object '<em><b>Basic Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.BasicLinkTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BasicLinkTypeImpl#getBasicLinkSimpleExtensionGroupGroup <em>Basic Link Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BasicLinkTypeImpl#getBasicLinkSimpleExtensionGroup <em>Basic Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BasicLinkTypeImpl#getBasicLinkObjectExtensionGroupGroup <em>Basic Link Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BasicLinkTypeImpl#getBasicLinkObjectExtensionGroup <em>Basic Link Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicLinkTypeImpl extends AbstractObjectTypeImpl implements BasicLinkType {
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
	 * The cached value of the '{@link #getBasicLinkSimpleExtensionGroupGroup() <em>Basic Link Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicLinkSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap basicLinkSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getBasicLinkObjectExtensionGroupGroup() <em>Basic Link Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicLinkObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap basicLinkObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getBasicLinkType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.BASIC_LINK_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBasicLinkSimpleExtensionGroupGroup() {
		if (basicLinkSimpleExtensionGroupGroup == null) {
			basicLinkSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return basicLinkSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getBasicLinkSimpleExtensionGroup() {
		return getBasicLinkSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getBasicLinkType_BasicLinkSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBasicLinkObjectExtensionGroupGroup() {
		if (basicLinkObjectExtensionGroupGroup == null) {
			basicLinkObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return basicLinkObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getBasicLinkObjectExtensionGroup() {
		return getBasicLinkObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getBasicLinkType_BasicLinkObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getBasicLinkSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getBasicLinkObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getBasicLinkObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.BASIC_LINK_TYPE__HREF:
				return getHref();
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getBasicLinkSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getBasicLinkSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP:
				return getBasicLinkSimpleExtensionGroup();
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getBasicLinkObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getBasicLinkObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP:
				return getBasicLinkObjectExtensionGroup();
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
			case KMLPackage.BASIC_LINK_TYPE__HREF:
				setHref((String)newValue);
				return;
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getBasicLinkSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getBasicLinkObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.BASIC_LINK_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				getBasicLinkSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				getBasicLinkObjectExtensionGroupGroup().clear();
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
			case KMLPackage.BASIC_LINK_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP:
				return basicLinkSimpleExtensionGroupGroup != null && !basicLinkSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP:
				return !getBasicLinkSimpleExtensionGroup().isEmpty();
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP:
				return basicLinkObjectExtensionGroupGroup != null && !basicLinkObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP:
				return !getBasicLinkObjectExtensionGroup().isEmpty();
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
		result.append(" (href: ");
		result.append(href);
		result.append(", basicLinkSimpleExtensionGroupGroup: ");
		result.append(basicLinkSimpleExtensionGroupGroup);
		result.append(", basicLinkObjectExtensionGroupGroup: ");
		result.append(basicLinkObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //BasicLinkTypeImpl
