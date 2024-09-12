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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDUsageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Usage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDUsageTypeImpl#getSpecificUsage <em>Specific Usage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDUsageTypeImpl#getUsageDateTime <em>Usage Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDUsageTypeImpl#getUserDeterminedLimitations <em>User Determined Limitations</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDUsageTypeImpl#getUserContactInfo <em>User Contact Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDUsageTypeImpl extends AbstractObjectTypeImpl implements MDUsageType {
	/**
	 * The cached value of the '{@link #getSpecificUsage() <em>Specific Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificUsage()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType specificUsage;

	/**
	 * The cached value of the '{@link #getUsageDateTime() <em>Usage Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTimePropertyType usageDateTime;

	/**
	 * The cached value of the '{@link #getUserDeterminedLimitations() <em>User Determined Limitations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDeterminedLimitations()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType userDeterminedLimitations;

	/**
	 * The cached value of the '{@link #getUserContactInfo() <em>User Contact Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserContactInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> userContactInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDUsageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDUsageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getSpecificUsage() {
		return specificUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificUsage(CharacterStringPropertyType newSpecificUsage, NotificationChain msgs) {
		CharacterStringPropertyType oldSpecificUsage = specificUsage;
		specificUsage = newSpecificUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE, oldSpecificUsage, newSpecificUsage);
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
	public void setSpecificUsage(CharacterStringPropertyType newSpecificUsage) {
		if (newSpecificUsage != specificUsage) {
			NotificationChain msgs = null;
			if (specificUsage != null)
				msgs = ((InternalEObject)specificUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE, null, msgs);
			if (newSpecificUsage != null)
				msgs = ((InternalEObject)newSpecificUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE, null, msgs);
			msgs = basicSetSpecificUsage(newSpecificUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE, newSpecificUsage, newSpecificUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimePropertyType getUsageDateTime() {
		return usageDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageDateTime(DateTimePropertyType newUsageDateTime, NotificationChain msgs) {
		DateTimePropertyType oldUsageDateTime = usageDateTime;
		usageDateTime = newUsageDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME, oldUsageDateTime, newUsageDateTime);
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
	public void setUsageDateTime(DateTimePropertyType newUsageDateTime) {
		if (newUsageDateTime != usageDateTime) {
			NotificationChain msgs = null;
			if (usageDateTime != null)
				msgs = ((InternalEObject)usageDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME, null, msgs);
			if (newUsageDateTime != null)
				msgs = ((InternalEObject)newUsageDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME, null, msgs);
			msgs = basicSetUsageDateTime(newUsageDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME, newUsageDateTime, newUsageDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getUserDeterminedLimitations() {
		return userDeterminedLimitations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDeterminedLimitations(CharacterStringPropertyType newUserDeterminedLimitations, NotificationChain msgs) {
		CharacterStringPropertyType oldUserDeterminedLimitations = userDeterminedLimitations;
		userDeterminedLimitations = newUserDeterminedLimitations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS, oldUserDeterminedLimitations, newUserDeterminedLimitations);
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
	public void setUserDeterminedLimitations(CharacterStringPropertyType newUserDeterminedLimitations) {
		if (newUserDeterminedLimitations != userDeterminedLimitations) {
			NotificationChain msgs = null;
			if (userDeterminedLimitations != null)
				msgs = ((InternalEObject)userDeterminedLimitations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS, null, msgs);
			if (newUserDeterminedLimitations != null)
				msgs = ((InternalEObject)newUserDeterminedLimitations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS, null, msgs);
			msgs = basicSetUserDeterminedLimitations(newUserDeterminedLimitations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS, newUserDeterminedLimitations, newUserDeterminedLimitations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getUserContactInfo() {
		if (userContactInfo == null) {
			userContactInfo = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.MD_USAGE_TYPE__USER_CONTACT_INFO);
		}
		return userContactInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE:
				return basicSetSpecificUsage(null, msgs);
			case GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME:
				return basicSetUsageDateTime(null, msgs);
			case GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS:
				return basicSetUserDeterminedLimitations(null, msgs);
			case GMDPackage.MD_USAGE_TYPE__USER_CONTACT_INFO:
				return ((InternalEList<?>)getUserContactInfo()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE:
				return getSpecificUsage();
			case GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME:
				return getUsageDateTime();
			case GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS:
				return getUserDeterminedLimitations();
			case GMDPackage.MD_USAGE_TYPE__USER_CONTACT_INFO:
				return getUserContactInfo();
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
			case GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE:
				setSpecificUsage((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME:
				setUsageDateTime((DateTimePropertyType)newValue);
				return;
			case GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS:
				setUserDeterminedLimitations((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_USAGE_TYPE__USER_CONTACT_INFO:
				getUserContactInfo().clear();
				getUserContactInfo().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
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
			case GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE:
				setSpecificUsage((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME:
				setUsageDateTime((DateTimePropertyType)null);
				return;
			case GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS:
				setUserDeterminedLimitations((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_USAGE_TYPE__USER_CONTACT_INFO:
				getUserContactInfo().clear();
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
			case GMDPackage.MD_USAGE_TYPE__SPECIFIC_USAGE:
				return specificUsage != null;
			case GMDPackage.MD_USAGE_TYPE__USAGE_DATE_TIME:
				return usageDateTime != null;
			case GMDPackage.MD_USAGE_TYPE__USER_DETERMINED_LIMITATIONS:
				return userDeterminedLimitations != null;
			case GMDPackage.MD_USAGE_TYPE__USER_CONTACT_INFO:
				return userContactInfo != null && !userContactInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDUsageTypeImpl
