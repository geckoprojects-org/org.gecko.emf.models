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
package net.opengis.ows.impl;

import net.opengis.ows.CodeType;
import net.opengis.ows.ContactType;
import net.opengis.ows.OWSPackage;
import net.opengis.ows.ResponsiblePartyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsible Party Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.ResponsiblePartyTypeImpl#getIndividualName <em>Individual Name</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ResponsiblePartyTypeImpl#getOrganisationName <em>Organisation Name</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ResponsiblePartyTypeImpl#getPositionName <em>Position Name</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ResponsiblePartyTypeImpl#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ResponsiblePartyTypeImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsiblePartyTypeImpl extends MinimalEObjectImpl.Container implements ResponsiblePartyType {
	/**
	 * The default value of the '{@link #getIndividualName() <em>Individual Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualName()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIVIDUAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndividualName() <em>Individual Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualName()
	 * @generated
	 * @ordered
	 */
	protected String individualName = INDIVIDUAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganisationName() <em>Organisation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganisationName() <em>Organisation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationName()
	 * @generated
	 * @ordered
	 */
	protected String organisationName = ORGANISATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionName() <em>Position Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionName()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionName() <em>Position Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionName()
	 * @generated
	 * @ordered
	 */
	protected String positionName = POSITION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContactInfo() <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInfo()
	 * @generated
	 * @ordered
	 */
	protected ContactType contactInfo;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeType role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsiblePartyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.RESPONSIBLE_PARTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndividualName() {
		return individualName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualName(String newIndividualName) {
		String oldIndividualName = individualName;
		individualName = newIndividualName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME, oldIndividualName, individualName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganisationName() {
		return organisationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganisationName(String newOrganisationName) {
		String oldOrganisationName = organisationName;
		organisationName = newOrganisationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME, oldOrganisationName, organisationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionName() {
		return positionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionName(String newPositionName) {
		String oldPositionName = positionName;
		positionName = newPositionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.RESPONSIBLE_PARTY_TYPE__POSITION_NAME, oldPositionName, positionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactType getContactInfo() {
		return contactInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInfo(ContactType newContactInfo, NotificationChain msgs) {
		ContactType oldContactInfo = contactInfo;
		contactInfo = newContactInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, oldContactInfo, newContactInfo);
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
	public void setContactInfo(ContactType newContactInfo) {
		if (newContactInfo != contactInfo) {
			NotificationChain msgs = null;
			if (contactInfo != null)
				msgs = ((InternalEObject)contactInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, null, msgs);
			if (newContactInfo != null)
				msgs = ((InternalEObject)newContactInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, null, msgs);
			msgs = basicSetContactInfo(newContactInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO, newContactInfo, newContactInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeType newRole, NotificationChain msgs) {
		CodeType oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE, oldRole, newRole);
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
	public void setRole(CodeType newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				return basicSetContactInfo(null, msgs);
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE:
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
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				return getIndividualName();
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				return getOrganisationName();
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				return getPositionName();
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				return getContactInfo();
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE:
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
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				setIndividualName((String)newValue);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				setOrganisationName((String)newValue);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				setPositionName((String)newValue);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				setContactInfo((ContactType)newValue);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE:
				setRole((CodeType)newValue);
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
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				setIndividualName(INDIVIDUAL_NAME_EDEFAULT);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				setOrganisationName(ORGANISATION_NAME_EDEFAULT);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				setPositionName(POSITION_NAME_EDEFAULT);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				setContactInfo((ContactType)null);
				return;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE:
				setRole((CodeType)null);
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
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__INDIVIDUAL_NAME:
				return INDIVIDUAL_NAME_EDEFAULT == null ? individualName != null : !INDIVIDUAL_NAME_EDEFAULT.equals(individualName);
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ORGANISATION_NAME:
				return ORGANISATION_NAME_EDEFAULT == null ? organisationName != null : !ORGANISATION_NAME_EDEFAULT.equals(organisationName);
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__POSITION_NAME:
				return POSITION_NAME_EDEFAULT == null ? positionName != null : !POSITION_NAME_EDEFAULT.equals(positionName);
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__CONTACT_INFO:
				return contactInfo != null;
			case OWSPackage.RESPONSIBLE_PARTY_TYPE__ROLE:
				return role != null;
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
		result.append(" (individualName: ");
		result.append(individualName);
		result.append(", organisationName: ");
		result.append(organisationName);
		result.append(", positionName: ");
		result.append(positionName);
		result.append(')');
		return result.toString();
	}

} //ResponsiblePartyTypeImpl
