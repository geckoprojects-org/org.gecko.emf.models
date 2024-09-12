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

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CountryPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LanguageCodePropertyType;
import org.isotc211._2005.gmd.MDCharacterSetCodePropertyType;
import org.isotc211._2005.gmd.PTLocaleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT Locale Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleTypeImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleTypeImpl#getCharacterEncoding <em>Character Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTLocaleTypeImpl extends AbstractObjectTypeImpl implements PTLocaleType {
	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected LanguageCodePropertyType languageCode;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryPropertyType country;

	/**
	 * The cached value of the '{@link #getCharacterEncoding() <em>Character Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterEncoding()
	 * @generated
	 * @ordered
	 */
	protected MDCharacterSetCodePropertyType characterEncoding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTLocaleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getPTLocaleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageCodePropertyType getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageCode(LanguageCodePropertyType newLanguageCode, NotificationChain msgs) {
		LanguageCodePropertyType oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE, oldLanguageCode, newLanguageCode);
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
	public void setLanguageCode(LanguageCodePropertyType newLanguageCode) {
		if (newLanguageCode != languageCode) {
			NotificationChain msgs = null;
			if (languageCode != null)
				msgs = ((InternalEObject)languageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE, null, msgs);
			if (newLanguageCode != null)
				msgs = ((InternalEObject)newLanguageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE, null, msgs);
			msgs = basicSetLanguageCode(newLanguageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE, newLanguageCode, newLanguageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryPropertyType getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CountryPropertyType newCountry, NotificationChain msgs) {
		CountryPropertyType oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_TYPE__COUNTRY, oldCountry, newCountry);
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
	public void setCountry(CountryPropertyType newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_TYPE__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_TYPE__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_TYPE__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCharacterSetCodePropertyType getCharacterEncoding() {
		return characterEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacterEncoding(MDCharacterSetCodePropertyType newCharacterEncoding, NotificationChain msgs) {
		MDCharacterSetCodePropertyType oldCharacterEncoding = characterEncoding;
		characterEncoding = newCharacterEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING, oldCharacterEncoding, newCharacterEncoding);
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
	public void setCharacterEncoding(MDCharacterSetCodePropertyType newCharacterEncoding) {
		if (newCharacterEncoding != characterEncoding) {
			NotificationChain msgs = null;
			if (characterEncoding != null)
				msgs = ((InternalEObject)characterEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING, null, msgs);
			if (newCharacterEncoding != null)
				msgs = ((InternalEObject)newCharacterEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING, null, msgs);
			msgs = basicSetCharacterEncoding(newCharacterEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING, newCharacterEncoding, newCharacterEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
			case GMDPackage.PT_LOCALE_TYPE__COUNTRY:
				return basicSetCountry(null, msgs);
			case GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING:
				return basicSetCharacterEncoding(null, msgs);
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
			case GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE:
				return getLanguageCode();
			case GMDPackage.PT_LOCALE_TYPE__COUNTRY:
				return getCountry();
			case GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING:
				return getCharacterEncoding();
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
			case GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE:
				setLanguageCode((LanguageCodePropertyType)newValue);
				return;
			case GMDPackage.PT_LOCALE_TYPE__COUNTRY:
				setCountry((CountryPropertyType)newValue);
				return;
			case GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING:
				setCharacterEncoding((MDCharacterSetCodePropertyType)newValue);
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
			case GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE:
				setLanguageCode((LanguageCodePropertyType)null);
				return;
			case GMDPackage.PT_LOCALE_TYPE__COUNTRY:
				setCountry((CountryPropertyType)null);
				return;
			case GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING:
				setCharacterEncoding((MDCharacterSetCodePropertyType)null);
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
			case GMDPackage.PT_LOCALE_TYPE__LANGUAGE_CODE:
				return languageCode != null;
			case GMDPackage.PT_LOCALE_TYPE__COUNTRY:
				return country != null;
			case GMDPackage.PT_LOCALE_TYPE__CHARACTER_ENCODING:
				return characterEncoding != null;
		}
		return super.eIsSet(featureID);
	}

} //PTLocaleTypeImpl
