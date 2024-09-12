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

import org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.PTFreeTextPropertyType;
import org.isotc211._2005.gmd.PTFreeTextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT Free Text Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTFreeTextPropertyTypeImpl#getPTFreeText <em>PT Free Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTFreeTextPropertyTypeImpl extends CharacterStringPropertyTypeImpl implements PTFreeTextPropertyType {
	/**
	 * The cached value of the '{@link #getPTFreeText() <em>PT Free Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTFreeText()
	 * @generated
	 * @ordered
	 */
	protected PTFreeTextType pTFreeText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTFreeTextPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getPTFreeTextPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTFreeTextType getPTFreeText() {
		return pTFreeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTFreeText(PTFreeTextType newPTFreeText, NotificationChain msgs) {
		PTFreeTextType oldPTFreeText = pTFreeText;
		pTFreeText = newPTFreeText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT, oldPTFreeText, newPTFreeText);
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
	public void setPTFreeText(PTFreeTextType newPTFreeText) {
		if (newPTFreeText != pTFreeText) {
			NotificationChain msgs = null;
			if (pTFreeText != null)
				msgs = ((InternalEObject)pTFreeText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT, null, msgs);
			if (newPTFreeText != null)
				msgs = ((InternalEObject)newPTFreeText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT, null, msgs);
			msgs = basicSetPTFreeText(newPTFreeText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT, newPTFreeText, newPTFreeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT:
				return basicSetPTFreeText(null, msgs);
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
			case GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT:
				return getPTFreeText();
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
			case GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT:
				setPTFreeText((PTFreeTextType)newValue);
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
			case GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT:
				setPTFreeText((PTFreeTextType)null);
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
			case GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE__PT_FREE_TEXT:
				return pTFreeText != null;
		}
		return super.eIsSet(featureID);
	}

} //PTFreeTextPropertyTypeImpl
