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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ExternalReference;
import org.cyclonedx.schema.bom.OrganizationalEntity;
import org.cyclonedx.schema.bom.SignatoryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signatory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SignatoryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SignatoryTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SignatoryTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SignatoryTypeImpl#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SignatoryTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatoryTypeImpl extends MinimalEObjectImpl.Container implements SignatoryType {
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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalEntity organization;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected ExternalReference externalReference;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getSignatoryType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SIGNATORY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SIGNATORY_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalEntity getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(OrganizationalEntity newOrganization, NotificationChain msgs) {
		OrganizationalEntity oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SIGNATORY_TYPE__ORGANIZATION, oldOrganization, newOrganization);
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
	public void setOrganization(OrganizationalEntity newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SIGNATORY_TYPE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SIGNATORY_TYPE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SIGNATORY_TYPE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReference getExternalReference() {
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalReference(ExternalReference newExternalReference, NotificationChain msgs) {
		ExternalReference oldExternalReference = externalReference;
		externalReference = newExternalReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE, oldExternalReference, newExternalReference);
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
	public void setExternalReference(ExternalReference newExternalReference) {
		if (newExternalReference != externalReference) {
			NotificationChain msgs = null;
			if (externalReference != null)
				msgs = ((InternalEObject)externalReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE, null, msgs);
			if (newExternalReference != null)
				msgs = ((InternalEObject)newExternalReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE, null, msgs);
			msgs = basicSetExternalReference(newExternalReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE, newExternalReference, newExternalReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.SIGNATORY_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.SIGNATORY_TYPE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE:
				return basicSetExternalReference(null, msgs);
			case BOMPackage.SIGNATORY_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.SIGNATORY_TYPE__NAME:
				return getName();
			case BOMPackage.SIGNATORY_TYPE__ROLE:
				return getRole();
			case BOMPackage.SIGNATORY_TYPE__ORGANIZATION:
				return getOrganization();
			case BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE:
				return getExternalReference();
			case BOMPackage.SIGNATORY_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.SIGNATORY_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.SIGNATORY_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case BOMPackage.SIGNATORY_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)newValue);
				return;
			case BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE:
				setExternalReference((ExternalReference)newValue);
				return;
			case BOMPackage.SIGNATORY_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.SIGNATORY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.SIGNATORY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case BOMPackage.SIGNATORY_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)null);
				return;
			case BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE:
				setExternalReference((ExternalReference)null);
				return;
			case BOMPackage.SIGNATORY_TYPE__ANY:
				getAny().clear();
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
			case BOMPackage.SIGNATORY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.SIGNATORY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case BOMPackage.SIGNATORY_TYPE__ORGANIZATION:
				return organization != null;
			case BOMPackage.SIGNATORY_TYPE__EXTERNAL_REFERENCE:
				return externalReference != null;
			case BOMPackage.SIGNATORY_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", role: ");
		result.append(role);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //SignatoryTypeImpl
