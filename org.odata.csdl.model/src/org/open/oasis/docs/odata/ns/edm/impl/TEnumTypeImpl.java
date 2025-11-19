/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.util.Collection;

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

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.TEnumType;
import org.open.oasis.docs.odata.ns.edm.TEnumTypeMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEnum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl#isIsFlags <em>Is Flags</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TEnumTypeImpl extends MinimalEObjectImpl.Container implements TEnumType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #isIsFlags() <em>Is Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFlags()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FLAGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFlags() <em>Is Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFlags()
	 * @generated
	 * @ordered
	 */
	protected boolean isFlags = IS_FLAGS_EDEFAULT;

	/**
	 * This is true if the Is Flags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isFlagsESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingType()
	 * @generated
	 * @ordered
	 */
	protected static final Object UNDERLYING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingType()
	 * @generated
	 * @ordered
	 */
	protected Object underlyingType = UNDERLYING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEnumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTEnumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TENUM_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TEnumTypeMember> getMember() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEnumType_Member());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEnumType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFlags() {
		return isFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFlags(boolean newIsFlags) {
		boolean oldIsFlags = isFlags;
		isFlags = newIsFlags;
		boolean oldIsFlagsESet = isFlagsESet;
		isFlagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENUM_TYPE__IS_FLAGS, oldIsFlags, isFlags, !oldIsFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsFlags() {
		boolean oldIsFlags = isFlags;
		boolean oldIsFlagsESet = isFlagsESet;
		isFlags = IS_FLAGS_EDEFAULT;
		isFlagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TENUM_TYPE__IS_FLAGS, oldIsFlags, IS_FLAGS_EDEFAULT, oldIsFlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsFlags() {
		return isFlagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENUM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getUnderlyingType() {
		return underlyingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnderlyingType(Object newUnderlyingType) {
		Object oldUnderlyingType = underlyingType;
		underlyingType = newUnderlyingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENUM_TYPE__UNDERLYING_TYPE, oldUnderlyingType, underlyingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TENUM_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENUM_TYPE__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENUM_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TENUM_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TENUM_TYPE__MEMBER:
				return getMember();
			case EdmPackage.TENUM_TYPE__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TENUM_TYPE__IS_FLAGS:
				return isIsFlags();
			case EdmPackage.TENUM_TYPE__NAME:
				return getName();
			case EdmPackage.TENUM_TYPE__UNDERLYING_TYPE:
				return getUnderlyingType();
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
			case EdmPackage.TENUM_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TENUM_TYPE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends TEnumTypeMember>)newValue);
				return;
			case EdmPackage.TENUM_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TENUM_TYPE__IS_FLAGS:
				setIsFlags((Boolean)newValue);
				return;
			case EdmPackage.TENUM_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdmPackage.TENUM_TYPE__UNDERLYING_TYPE:
				setUnderlyingType(newValue);
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
			case EdmPackage.TENUM_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TENUM_TYPE__MEMBER:
				getMember().clear();
				return;
			case EdmPackage.TENUM_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TENUM_TYPE__IS_FLAGS:
				unsetIsFlags();
				return;
			case EdmPackage.TENUM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdmPackage.TENUM_TYPE__UNDERLYING_TYPE:
				setUnderlyingType(UNDERLYING_TYPE_EDEFAULT);
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
			case EdmPackage.TENUM_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TENUM_TYPE__MEMBER:
				return !getMember().isEmpty();
			case EdmPackage.TENUM_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TENUM_TYPE__IS_FLAGS:
				return isSetIsFlags();
			case EdmPackage.TENUM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdmPackage.TENUM_TYPE__UNDERLYING_TYPE:
				return UNDERLYING_TYPE_EDEFAULT == null ? underlyingType != null : !UNDERLYING_TYPE_EDEFAULT.equals(underlyingType);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", isFlags: ");
		if (isFlagsESet) result.append(isFlags); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", underlyingType: ");
		result.append(underlyingType);
		result.append(')');
		return result.toString();
	}

} //TEnumTypeImpl
