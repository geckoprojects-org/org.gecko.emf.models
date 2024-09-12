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
package org.isotc211._2005.gco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.GCOPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character String Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl#getCharacterStringGroup <em>Character String Group</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl#getCharacterString <em>Character String</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterStringPropertyTypeImpl extends MinimalEObjectImpl.Container implements CharacterStringPropertyType {
	/**
	 * The cached value of the '{@link #getCharacterStringGroup() <em>Character String Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterStringGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap characterStringGroup;

	/**
	 * The default value of the '{@link #getCharacterString() <em>Character String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterString()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterStringPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.CHARACTER_STRING_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCharacterStringGroup() {
		if (characterStringGroup == null) {
			characterStringGroup = new BasicFeatureMap(this, GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP);
		}
		return characterStringGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharacterString() {
		return (String)getCharacterStringGroup().get(GCOPackage.Literals.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterString(String newCharacterString) {
		((FeatureMap.Internal)getCharacterStringGroup()).set(GCOPackage.Literals.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING, newCharacterString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP:
				return ((InternalEList<?>)getCharacterStringGroup()).basicRemove(otherEnd, msgs);
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
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP:
				if (coreType) return getCharacterStringGroup();
				return ((FeatureMap.Internal)getCharacterStringGroup()).getWrapper();
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING:
				return getCharacterString();
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
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
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP:
				((FeatureMap.Internal)getCharacterStringGroup()).set(newValue);
				return;
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING:
				setCharacterString((String)newValue);
				return;
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
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
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP:
				getCharacterStringGroup().clear();
				return;
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING:
				setCharacterString(CHARACTER_STRING_EDEFAULT);
				return;
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP:
				return characterStringGroup != null && !characterStringGroup.isEmpty();
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING:
				return CHARACTER_STRING_EDEFAULT == null ? getCharacterString() != null : !CHARACTER_STRING_EDEFAULT.equals(getCharacterString());
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
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
		result.append(" (characterStringGroup: ");
		result.append(characterStringGroup);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //CharacterStringPropertyTypeImpl
