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
package org.w3._1999.xlink.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xlink.ArcType;
import org.w3._1999.xlink.Extended;
import org.w3._1999.xlink.LocatorType;
import org.w3._1999.xlink.ResourceType;
import org.w3._1999.xlink.TitleEltType;
import org.w3._1999.xlink.TypeType;
import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getExtendedModel <em>Extended Model</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getTitleGroup <em>Title Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getLocatorGroup <em>Locator Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getLocator <em>Locator</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getArcGroup <em>Arc Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.w3._1999.xlink.impl.ExtendedImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedImpl extends MinimalEObjectImpl.Container implements Extended {
	/**
	 * The cached value of the '{@link #getExtendedModel() <em>Extended Model</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedModel()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap extendedModel;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected String title1 = TITLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.EXTENDED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XlinkPackage.Literals.EXTENDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExtendedModel() {
		if (extendedModel == null) {
			extendedModel = new BasicFeatureMap(this, XlinkPackage.EXTENDED__EXTENDED_MODEL);
		}
		return extendedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTitleGroup() {
		return (FeatureMap)getExtendedModel().<FeatureMap.Entry>list(XlinkPackage.Literals.EXTENDED__TITLE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TitleEltType> getTitle() {
		return getTitleGroup().list(XlinkPackage.Literals.EXTENDED__TITLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getResourceGroup() {
		return (FeatureMap)getExtendedModel().<FeatureMap.Entry>list(XlinkPackage.Literals.EXTENDED__RESOURCE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceType> getResource() {
		return getResourceGroup().list(XlinkPackage.Literals.EXTENDED__RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLocatorGroup() {
		return (FeatureMap)getExtendedModel().<FeatureMap.Entry>list(XlinkPackage.Literals.EXTENDED__LOCATOR_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocatorType> getLocator() {
		return getLocatorGroup().list(XlinkPackage.Literals.EXTENDED__LOCATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getArcGroup() {
		return (FeatureMap)getExtendedModel().<FeatureMap.Entry>list(XlinkPackage.Literals.EXTENDED__ARC_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArcType> getArc() {
		return getArcGroup().list(XlinkPackage.Literals.EXTENDED__ARC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlinkPackage.EXTENDED__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle1() {
		return title1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle1(String newTitle1) {
		String oldTitle1 = title1;
		title1 = newTitle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlinkPackage.EXTENDED__TITLE1, oldTitle1, title1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XlinkPackage.EXTENDED__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XlinkPackage.EXTENDED__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XlinkPackage.EXTENDED__EXTENDED_MODEL:
				return ((InternalEList<?>)getExtendedModel()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__TITLE_GROUP:
				return ((InternalEList<?>)getTitleGroup()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__RESOURCE_GROUP:
				return ((InternalEList<?>)getResourceGroup()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__LOCATOR_GROUP:
				return ((InternalEList<?>)getLocatorGroup()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__LOCATOR:
				return ((InternalEList<?>)getLocator()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__ARC_GROUP:
				return ((InternalEList<?>)getArcGroup()).basicRemove(otherEnd, msgs);
			case XlinkPackage.EXTENDED__ARC:
				return ((InternalEList<?>)getArc()).basicRemove(otherEnd, msgs);
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
			case XlinkPackage.EXTENDED__EXTENDED_MODEL:
				if (coreType) return getExtendedModel();
				return ((FeatureMap.Internal)getExtendedModel()).getWrapper();
			case XlinkPackage.EXTENDED__TITLE_GROUP:
				if (coreType) return getTitleGroup();
				return ((FeatureMap.Internal)getTitleGroup()).getWrapper();
			case XlinkPackage.EXTENDED__TITLE:
				return getTitle();
			case XlinkPackage.EXTENDED__RESOURCE_GROUP:
				if (coreType) return getResourceGroup();
				return ((FeatureMap.Internal)getResourceGroup()).getWrapper();
			case XlinkPackage.EXTENDED__RESOURCE:
				return getResource();
			case XlinkPackage.EXTENDED__LOCATOR_GROUP:
				if (coreType) return getLocatorGroup();
				return ((FeatureMap.Internal)getLocatorGroup()).getWrapper();
			case XlinkPackage.EXTENDED__LOCATOR:
				return getLocator();
			case XlinkPackage.EXTENDED__ARC_GROUP:
				if (coreType) return getArcGroup();
				return ((FeatureMap.Internal)getArcGroup()).getWrapper();
			case XlinkPackage.EXTENDED__ARC:
				return getArc();
			case XlinkPackage.EXTENDED__ROLE:
				return getRole();
			case XlinkPackage.EXTENDED__TITLE1:
				return getTitle1();
			case XlinkPackage.EXTENDED__TYPE:
				return getType();
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
			case XlinkPackage.EXTENDED__EXTENDED_MODEL:
				((FeatureMap.Internal)getExtendedModel()).set(newValue);
				return;
			case XlinkPackage.EXTENDED__TITLE_GROUP:
				((FeatureMap.Internal)getTitleGroup()).set(newValue);
				return;
			case XlinkPackage.EXTENDED__RESOURCE_GROUP:
				((FeatureMap.Internal)getResourceGroup()).set(newValue);
				return;
			case XlinkPackage.EXTENDED__LOCATOR_GROUP:
				((FeatureMap.Internal)getLocatorGroup()).set(newValue);
				return;
			case XlinkPackage.EXTENDED__ARC_GROUP:
				((FeatureMap.Internal)getArcGroup()).set(newValue);
				return;
			case XlinkPackage.EXTENDED__ROLE:
				setRole((String)newValue);
				return;
			case XlinkPackage.EXTENDED__TITLE1:
				setTitle1((String)newValue);
				return;
			case XlinkPackage.EXTENDED__TYPE:
				setType((TypeType)newValue);
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
			case XlinkPackage.EXTENDED__EXTENDED_MODEL:
				getExtendedModel().clear();
				return;
			case XlinkPackage.EXTENDED__TITLE_GROUP:
				getTitleGroup().clear();
				return;
			case XlinkPackage.EXTENDED__RESOURCE_GROUP:
				getResourceGroup().clear();
				return;
			case XlinkPackage.EXTENDED__LOCATOR_GROUP:
				getLocatorGroup().clear();
				return;
			case XlinkPackage.EXTENDED__ARC_GROUP:
				getArcGroup().clear();
				return;
			case XlinkPackage.EXTENDED__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case XlinkPackage.EXTENDED__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case XlinkPackage.EXTENDED__TYPE:
				unsetType();
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
			case XlinkPackage.EXTENDED__EXTENDED_MODEL:
				return extendedModel != null && !extendedModel.isEmpty();
			case XlinkPackage.EXTENDED__TITLE_GROUP:
				return !getTitleGroup().isEmpty();
			case XlinkPackage.EXTENDED__TITLE:
				return !getTitle().isEmpty();
			case XlinkPackage.EXTENDED__RESOURCE_GROUP:
				return !getResourceGroup().isEmpty();
			case XlinkPackage.EXTENDED__RESOURCE:
				return !getResource().isEmpty();
			case XlinkPackage.EXTENDED__LOCATOR_GROUP:
				return !getLocatorGroup().isEmpty();
			case XlinkPackage.EXTENDED__LOCATOR:
				return !getLocator().isEmpty();
			case XlinkPackage.EXTENDED__ARC_GROUP:
				return !getArcGroup().isEmpty();
			case XlinkPackage.EXTENDED__ARC:
				return !getArc().isEmpty();
			case XlinkPackage.EXTENDED__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case XlinkPackage.EXTENDED__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case XlinkPackage.EXTENDED__TYPE:
				return isSetType();
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
		result.append(" (extendedModel: ");
		result.append(extendedModel);
		result.append(", role: ");
		result.append(role);
		result.append(", title1: ");
		result.append(title1);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExtendedImpl
