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
import net.opengis.kml.AliasType;
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
 * An implementation of the model object '<em><b>Alias Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AliasTypeImpl#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AliasTypeImpl#getSourceHref <em>Source Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AliasTypeImpl#getAliasSimpleExtensionGroupGroup <em>Alias Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AliasTypeImpl#getAliasSimpleExtensionGroup <em>Alias Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AliasTypeImpl#getAliasObjectExtensionGroupGroup <em>Alias Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AliasTypeImpl#getAliasObjectExtensionGroup <em>Alias Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliasTypeImpl extends AbstractObjectTypeImpl implements AliasType {
	/**
	 * The default value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected String targetHref = TARGET_HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceHref() <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHref()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceHref() <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHref()
	 * @generated
	 * @ordered
	 */
	protected String sourceHref = SOURCE_HREF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliasSimpleExtensionGroupGroup() <em>Alias Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aliasSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAliasObjectExtensionGroupGroup() <em>Alias Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aliasObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAliasType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetHref() {
		return targetHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetHref(String newTargetHref) {
		String oldTargetHref = targetHref;
		targetHref = newTargetHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ALIAS_TYPE__TARGET_HREF, oldTargetHref, targetHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceHref() {
		return sourceHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceHref(String newSourceHref) {
		String oldSourceHref = sourceHref;
		sourceHref = newSourceHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ALIAS_TYPE__SOURCE_HREF, oldSourceHref, sourceHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAliasSimpleExtensionGroupGroup() {
		if (aliasSimpleExtensionGroupGroup == null) {
			aliasSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return aliasSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAliasSimpleExtensionGroup() {
		return getAliasSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAliasType_AliasSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAliasObjectExtensionGroupGroup() {
		if (aliasObjectExtensionGroupGroup == null) {
			aliasObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return aliasObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAliasObjectExtensionGroup() {
		return getAliasObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAliasType_AliasObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAliasSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAliasObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAliasObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ALIAS_TYPE__TARGET_HREF:
				return getTargetHref();
			case KMLPackage.ALIAS_TYPE__SOURCE_HREF:
				return getSourceHref();
			case KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAliasSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAliasSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP:
				return getAliasSimpleExtensionGroup();
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAliasObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAliasObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP:
				return getAliasObjectExtensionGroup();
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
			case KMLPackage.ALIAS_TYPE__TARGET_HREF:
				setTargetHref((String)newValue);
				return;
			case KMLPackage.ALIAS_TYPE__SOURCE_HREF:
				setSourceHref((String)newValue);
				return;
			case KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAliasSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAliasObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ALIAS_TYPE__TARGET_HREF:
				setTargetHref(TARGET_HREF_EDEFAULT);
				return;
			case KMLPackage.ALIAS_TYPE__SOURCE_HREF:
				setSourceHref(SOURCE_HREF_EDEFAULT);
				return;
			case KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP_GROUP:
				getAliasSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP_GROUP:
				getAliasObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ALIAS_TYPE__TARGET_HREF:
				return TARGET_HREF_EDEFAULT == null ? targetHref != null : !TARGET_HREF_EDEFAULT.equals(targetHref);
			case KMLPackage.ALIAS_TYPE__SOURCE_HREF:
				return SOURCE_HREF_EDEFAULT == null ? sourceHref != null : !SOURCE_HREF_EDEFAULT.equals(sourceHref);
			case KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP_GROUP:
				return aliasSimpleExtensionGroupGroup != null && !aliasSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP:
				return !getAliasSimpleExtensionGroup().isEmpty();
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP_GROUP:
				return aliasObjectExtensionGroupGroup != null && !aliasObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP:
				return !getAliasObjectExtensionGroup().isEmpty();
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
		result.append(" (targetHref: ");
		result.append(targetHref);
		result.append(", sourceHref: ");
		result.append(sourceHref);
		result.append(", aliasSimpleExtensionGroupGroup: ");
		result.append(aliasSimpleExtensionGroupGroup);
		result.append(", aliasObjectExtensionGroupGroup: ");
		result.append(aliasObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AliasTypeImpl
