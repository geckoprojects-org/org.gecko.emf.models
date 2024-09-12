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

import org.isotc211._2005.gmd.CIOnLineFunctionCodePropertyType;
import org.isotc211._2005.gmd.CIOnlineResourceType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.URLPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Online Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIOnlineResourceTypeImpl#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIOnlineResourceTypeImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIOnlineResourceTypeImpl#getApplicationProfile <em>Application Profile</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIOnlineResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIOnlineResourceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIOnlineResourceTypeImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIOnlineResourceTypeImpl extends AbstractObjectTypeImpl implements CIOnlineResourceType {
	/**
	 * The cached value of the '{@link #getLinkage() <em>Linkage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkage()
	 * @generated
	 * @ordered
	 */
	protected URLPropertyType linkage;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType protocol;

	/**
	 * The cached value of the '{@link #getApplicationProfile() <em>Application Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationProfile()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType applicationProfile;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType name;

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
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected CIOnLineFunctionCodePropertyType function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIOnlineResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getCIOnlineResourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URLPropertyType getLinkage() {
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkage(URLPropertyType newLinkage, NotificationChain msgs) {
		URLPropertyType oldLinkage = linkage;
		linkage = newLinkage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE, oldLinkage, newLinkage);
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
	public void setLinkage(URLPropertyType newLinkage) {
		if (newLinkage != linkage) {
			NotificationChain msgs = null;
			if (linkage != null)
				msgs = ((InternalEObject)linkage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE, null, msgs);
			if (newLinkage != null)
				msgs = ((InternalEObject)newLinkage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE, null, msgs);
			msgs = basicSetLinkage(newLinkage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE, newLinkage, newLinkage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(CharacterStringPropertyType newProtocol, NotificationChain msgs) {
		CharacterStringPropertyType oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL, oldProtocol, newProtocol);
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
	public void setProtocol(CharacterStringPropertyType newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getApplicationProfile() {
		return applicationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationProfile(CharacterStringPropertyType newApplicationProfile, NotificationChain msgs) {
		CharacterStringPropertyType oldApplicationProfile = applicationProfile;
		applicationProfile = newApplicationProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE, oldApplicationProfile, newApplicationProfile);
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
	public void setApplicationProfile(CharacterStringPropertyType newApplicationProfile) {
		if (newApplicationProfile != applicationProfile) {
			NotificationChain msgs = null;
			if (applicationProfile != null)
				msgs = ((InternalEObject)applicationProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE, null, msgs);
			if (newApplicationProfile != null)
				msgs = ((InternalEObject)newApplicationProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE, null, msgs);
			msgs = basicSetApplicationProfile(newApplicationProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE, newApplicationProfile, newApplicationProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CharacterStringPropertyType newName, NotificationChain msgs) {
		CharacterStringPropertyType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME, oldName, newName);
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
	public void setName(CharacterStringPropertyType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIOnLineFunctionCodePropertyType getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(CIOnLineFunctionCodePropertyType newFunction, NotificationChain msgs) {
		CIOnLineFunctionCodePropertyType oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION, oldFunction, newFunction);
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
	public void setFunction(CIOnLineFunctionCodePropertyType newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE:
				return basicSetLinkage(null, msgs);
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE:
				return basicSetApplicationProfile(null, msgs);
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME:
				return basicSetName(null, msgs);
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION:
				return basicSetFunction(null, msgs);
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
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE:
				return getLinkage();
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL:
				return getProtocol();
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE:
				return getApplicationProfile();
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME:
				return getName();
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION:
				return getDescription();
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION:
				return getFunction();
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
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE:
				setLinkage((URLPropertyType)newValue);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL:
				setProtocol((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE:
				setApplicationProfile((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME:
				setName((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION:
				setFunction((CIOnLineFunctionCodePropertyType)newValue);
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
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE:
				setLinkage((URLPropertyType)null);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL:
				setProtocol((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE:
				setApplicationProfile((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME:
				setName((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION:
				setFunction((CIOnLineFunctionCodePropertyType)null);
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
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__LINKAGE:
				return linkage != null;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__PROTOCOL:
				return protocol != null;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__APPLICATION_PROFILE:
				return applicationProfile != null;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__NAME:
				return name != null;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__DESCRIPTION:
				return description != null;
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

} //CIOnlineResourceTypeImpl
