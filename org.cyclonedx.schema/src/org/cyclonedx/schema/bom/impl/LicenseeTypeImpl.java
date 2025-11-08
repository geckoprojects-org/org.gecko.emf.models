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
import org.cyclonedx.schema.bom.LicenseeType;
import org.cyclonedx.schema.bom.OrganizationalContact;
import org.cyclonedx.schema.bom.OrganizationalEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Licensee Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseeTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.LicenseeTypeImpl#getIndividual <em>Individual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseeTypeImpl extends MinimalEObjectImpl.Container implements LicenseeType {
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
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalContact individual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getLicenseeType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSEE_TYPE__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSEE_TYPE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSEE_TYPE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSEE_TYPE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalContact getIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividual(OrganizationalContact newIndividual, NotificationChain msgs) {
		OrganizationalContact oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSEE_TYPE__INDIVIDUAL, oldIndividual, newIndividual);
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
	public void setIndividual(OrganizationalContact newIndividual) {
		if (newIndividual != individual) {
			NotificationChain msgs = null;
			if (individual != null)
				msgs = ((InternalEObject)individual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSEE_TYPE__INDIVIDUAL, null, msgs);
			if (newIndividual != null)
				msgs = ((InternalEObject)newIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.LICENSEE_TYPE__INDIVIDUAL, null, msgs);
			msgs = basicSetIndividual(newIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.LICENSEE_TYPE__INDIVIDUAL, newIndividual, newIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.LICENSEE_TYPE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case BOMPackage.LICENSEE_TYPE__INDIVIDUAL:
				return basicSetIndividual(null, msgs);
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
			case BOMPackage.LICENSEE_TYPE__ORGANIZATION:
				return getOrganization();
			case BOMPackage.LICENSEE_TYPE__INDIVIDUAL:
				return getIndividual();
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
			case BOMPackage.LICENSEE_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)newValue);
				return;
			case BOMPackage.LICENSEE_TYPE__INDIVIDUAL:
				setIndividual((OrganizationalContact)newValue);
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
			case BOMPackage.LICENSEE_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)null);
				return;
			case BOMPackage.LICENSEE_TYPE__INDIVIDUAL:
				setIndividual((OrganizationalContact)null);
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
			case BOMPackage.LICENSEE_TYPE__ORGANIZATION:
				return organization != null;
			case BOMPackage.LICENSEE_TYPE__INDIVIDUAL:
				return individual != null;
		}
		return super.eIsSet(featureID);
	}

} //LicenseeTypeImpl
