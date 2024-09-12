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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.impl.ObjectReferencePropertyTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LocalisedCharacterStringPropertyType;
import org.isotc211._2005.gmd.LocalisedCharacterStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localised Character String Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.LocalisedCharacterStringPropertyTypeImpl#getLocalisedCharacterString <em>Localised Character String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalisedCharacterStringPropertyTypeImpl extends ObjectReferencePropertyTypeImpl implements LocalisedCharacterStringPropertyType {
	/**
	 * The cached value of the '{@link #getLocalisedCharacterString() <em>Localised Character String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisedCharacterString()
	 * @generated
	 * @ordered
	 */
	protected LocalisedCharacterStringType localisedCharacterString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalisedCharacterStringPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getLocalisedCharacterStringPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalisedCharacterStringType getLocalisedCharacterString() {
		return localisedCharacterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalisedCharacterString(LocalisedCharacterStringType newLocalisedCharacterString, NotificationChain msgs) {
		LocalisedCharacterStringType oldLocalisedCharacterString = localisedCharacterString;
		localisedCharacterString = newLocalisedCharacterString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING, oldLocalisedCharacterString, newLocalisedCharacterString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalisedCharacterString(LocalisedCharacterStringType newLocalisedCharacterString) {
		if (newLocalisedCharacterString != localisedCharacterString) {
			NotificationChain msgs = null;
			if (localisedCharacterString != null)
				msgs = ((InternalEObject)localisedCharacterString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING, null, msgs);
			if (newLocalisedCharacterString != null)
				msgs = ((InternalEObject)newLocalisedCharacterString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING, null, msgs);
			msgs = basicSetLocalisedCharacterString(newLocalisedCharacterString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING, newLocalisedCharacterString, newLocalisedCharacterString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING:
				return basicSetLocalisedCharacterString(null, msgs);
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
			case GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING:
				return getLocalisedCharacterString();
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
			case GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING:
				setLocalisedCharacterString((LocalisedCharacterStringType)newValue);
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
			case GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING:
				setLocalisedCharacterString((LocalisedCharacterStringType)null);
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
			case GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE__LOCALISED_CHARACTER_STRING:
				return localisedCharacterString != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalisedCharacterStringPropertyTypeImpl
