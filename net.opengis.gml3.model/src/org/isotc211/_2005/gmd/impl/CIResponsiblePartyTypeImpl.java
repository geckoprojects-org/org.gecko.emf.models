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

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIContactPropertyType;
import org.isotc211._2005.gmd.CIResponsiblePartyType;
import org.isotc211._2005.gmd.CIRoleCodePropertyType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Responsible Party Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIResponsiblePartyTypeImpl#getIndividualName <em>Individual Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIResponsiblePartyTypeImpl#getOrganisationName <em>Organisation Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIResponsiblePartyTypeImpl#getPositionName <em>Position Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIResponsiblePartyTypeImpl#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIResponsiblePartyTypeImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIResponsiblePartyTypeImpl extends AbstractObjectTypeImpl implements CIResponsiblePartyType {
	/**
	 * The cached value of the '{@link #getIndividualName() <em>Individual Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType individualName;

	/**
	 * The cached value of the '{@link #getOrganisationName() <em>Organisation Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType organisationName;

	/**
	 * The cached value of the '{@link #getPositionName() <em>Position Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType positionName;

	/**
	 * The cached value of the '{@link #getContactInfo() <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInfo()
	 * @generated
	 * @ordered
	 */
	protected CIContactPropertyType contactInfo;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CIRoleCodePropertyType role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIResponsiblePartyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getCIResponsiblePartyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getIndividualName() {
		return individualName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividualName(CharacterStringPropertyType newIndividualName, NotificationChain msgs) {
		CharacterStringPropertyType oldIndividualName = individualName;
		individualName = newIndividualName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME, oldIndividualName, newIndividualName);
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
	public void setIndividualName(CharacterStringPropertyType newIndividualName) {
		if (newIndividualName != individualName) {
			NotificationChain msgs = null;
			if (individualName != null)
				msgs = ((InternalEObject)individualName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME, null, msgs);
			if (newIndividualName != null)
				msgs = ((InternalEObject)newIndividualName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME, null, msgs);
			msgs = basicSetIndividualName(newIndividualName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME, newIndividualName, newIndividualName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getOrganisationName() {
		return organisationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisationName(CharacterStringPropertyType newOrganisationName, NotificationChain msgs) {
		CharacterStringPropertyType oldOrganisationName = organisationName;
		organisationName = newOrganisationName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME, oldOrganisationName, newOrganisationName);
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
	public void setOrganisationName(CharacterStringPropertyType newOrganisationName) {
		if (newOrganisationName != organisationName) {
			NotificationChain msgs = null;
			if (organisationName != null)
				msgs = ((InternalEObject)organisationName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME, null, msgs);
			if (newOrganisationName != null)
				msgs = ((InternalEObject)newOrganisationName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME, null, msgs);
			msgs = basicSetOrganisationName(newOrganisationName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME, newOrganisationName, newOrganisationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getPositionName() {
		return positionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionName(CharacterStringPropertyType newPositionName, NotificationChain msgs) {
		CharacterStringPropertyType oldPositionName = positionName;
		positionName = newPositionName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME, oldPositionName, newPositionName);
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
	public void setPositionName(CharacterStringPropertyType newPositionName) {
		if (newPositionName != positionName) {
			NotificationChain msgs = null;
			if (positionName != null)
				msgs = ((InternalEObject)positionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME, null, msgs);
			if (newPositionName != null)
				msgs = ((InternalEObject)newPositionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME, null, msgs);
			msgs = basicSetPositionName(newPositionName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME, newPositionName, newPositionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIContactPropertyType getContactInfo() {
		return contactInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInfo(CIContactPropertyType newContactInfo, NotificationChain msgs) {
		CIContactPropertyType oldContactInfo = contactInfo;
		contactInfo = newContactInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, oldContactInfo, newContactInfo);
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
	public void setContactInfo(CIContactPropertyType newContactInfo) {
		if (newContactInfo != contactInfo) {
			NotificationChain msgs = null;
			if (contactInfo != null)
				msgs = ((InternalEObject)contactInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, null, msgs);
			if (newContactInfo != null)
				msgs = ((InternalEObject)newContactInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, null, msgs);
			msgs = basicSetContactInfo(newContactInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, newContactInfo, newContactInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIRoleCodePropertyType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CIRoleCodePropertyType newRole, NotificationChain msgs) {
		CIRoleCodePropertyType oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE, oldRole, newRole);
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
	public void setRole(CIRoleCodePropertyType newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				return basicSetIndividualName(null, msgs);
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				return basicSetOrganisationName(null, msgs);
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				return basicSetPositionName(null, msgs);
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				return basicSetContactInfo(null, msgs);
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE:
				return basicSetRole(null, msgs);
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
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				return getIndividualName();
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				return getOrganisationName();
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				return getPositionName();
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				return getContactInfo();
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE:
				return getRole();
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
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				setIndividualName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				setOrganisationName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				setPositionName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				setContactInfo((CIContactPropertyType)newValue);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE:
				setRole((CIRoleCodePropertyType)newValue);
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
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				setIndividualName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				setOrganisationName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				setPositionName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				setContactInfo((CIContactPropertyType)null);
				return;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE:
				setRole((CIRoleCodePropertyType)null);
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
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				return individualName != null;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				return organisationName != null;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				return positionName != null;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				return contactInfo != null;
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //CIResponsiblePartyTypeImpl
