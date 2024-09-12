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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gmd.CIDatePropertyType;
import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LocalisedCharacterStringPropertyType;
import org.isotc211._2005.gmd.PTLocaleContainerType;
import org.isotc211._2005.gmd.PTLocalePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT Locale Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleContainerTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleContainerTypeImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleContainerTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleContainerTypeImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTLocaleContainerTypeImpl#getLocalisedString <em>Localised String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTLocaleContainerTypeImpl extends MinimalEObjectImpl.Container implements PTLocaleContainerType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType description;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected PTLocalePropertyType locale;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected EList<CIDatePropertyType> date;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> responsibleParty;

	/**
	 * The cached value of the '{@link #getLocalisedString() <em>Localised String</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisedString()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalisedCharacterStringPropertyType> localisedString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTLocaleContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getPTLocaleContainerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CharacterStringPropertyType newDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(CharacterStringPropertyType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTLocalePropertyType getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocale(PTLocalePropertyType newLocale, NotificationChain msgs) {
		PTLocalePropertyType oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE, oldLocale, newLocale);
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
	public void setLocale(PTLocalePropertyType newLocale) {
		if (newLocale != locale) {
			NotificationChain msgs = null;
			if (locale != null)
				msgs = ((InternalEObject)locale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE, null, msgs);
			if (newLocale != null)
				msgs = ((InternalEObject)newLocale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE, null, msgs);
			msgs = basicSetLocale(newLocale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE, newLocale, newLocale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIDatePropertyType> getDate() {
		if (date == null) {
			date = new EObjectContainmentEList<CIDatePropertyType>(CIDatePropertyType.class, this, GMDPackage.PT_LOCALE_CONTAINER_TYPE__DATE);
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.PT_LOCALE_CONTAINER_TYPE__RESPONSIBLE_PARTY);
		}
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalisedCharacterStringPropertyType> getLocalisedString() {
		if (localisedString == null) {
			localisedString = new EObjectContainmentEList<LocalisedCharacterStringPropertyType>(LocalisedCharacterStringPropertyType.class, this, GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALISED_STRING);
		}
		return localisedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE:
				return basicSetLocale(null, msgs);
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALISED_STRING:
				return ((InternalEList<?>)getLocalisedString()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION:
				return getDescription();
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE:
				return getLocale();
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DATE:
				return getDate();
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALISED_STRING:
				return getLocalisedString();
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
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE:
				setLocale((PTLocalePropertyType)newValue);
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends CIDatePropertyType>)newValue);
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALISED_STRING:
				getLocalisedString().clear();
				getLocalisedString().addAll((Collection<? extends LocalisedCharacterStringPropertyType>)newValue);
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
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE:
				setLocale((PTLocalePropertyType)null);
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DATE:
				getDate().clear();
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALISED_STRING:
				getLocalisedString().clear();
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
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DESCRIPTION:
				return description != null;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALE:
				return locale != null;
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__DATE:
				return date != null && !date.isEmpty();
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE__LOCALISED_STRING:
				return localisedString != null && !localisedString.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PTLocaleContainerTypeImpl
