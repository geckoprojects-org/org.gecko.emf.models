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
import org.cyclonedx.schema.bom.CreditsType;
import org.cyclonedx.schema.bom.IndividualsType;
import org.cyclonedx.schema.bom.OrganizationsType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credits Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CreditsTypeImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CreditsTypeImpl#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditsTypeImpl extends MinimalEObjectImpl.Container implements CreditsType {
	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected OrganizationsType1 organizations;

	/**
	 * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected IndividualsType individuals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getCreditsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationsType1 getOrganizations() {
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizations(OrganizationsType1 newOrganizations, NotificationChain msgs) {
		OrganizationsType1 oldOrganizations = organizations;
		organizations = newOrganizations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CREDITS_TYPE__ORGANIZATIONS, oldOrganizations, newOrganizations);
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
	public void setOrganizations(OrganizationsType1 newOrganizations) {
		if (newOrganizations != organizations) {
			NotificationChain msgs = null;
			if (organizations != null)
				msgs = ((InternalEObject)organizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CREDITS_TYPE__ORGANIZATIONS, null, msgs);
			if (newOrganizations != null)
				msgs = ((InternalEObject)newOrganizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CREDITS_TYPE__ORGANIZATIONS, null, msgs);
			msgs = basicSetOrganizations(newOrganizations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CREDITS_TYPE__ORGANIZATIONS, newOrganizations, newOrganizations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualsType getIndividuals() {
		return individuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividuals(IndividualsType newIndividuals, NotificationChain msgs) {
		IndividualsType oldIndividuals = individuals;
		individuals = newIndividuals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CREDITS_TYPE__INDIVIDUALS, oldIndividuals, newIndividuals);
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
	public void setIndividuals(IndividualsType newIndividuals) {
		if (newIndividuals != individuals) {
			NotificationChain msgs = null;
			if (individuals != null)
				msgs = ((InternalEObject)individuals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CREDITS_TYPE__INDIVIDUALS, null, msgs);
			if (newIndividuals != null)
				msgs = ((InternalEObject)newIndividuals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CREDITS_TYPE__INDIVIDUALS, null, msgs);
			msgs = basicSetIndividuals(newIndividuals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CREDITS_TYPE__INDIVIDUALS, newIndividuals, newIndividuals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.CREDITS_TYPE__ORGANIZATIONS:
				return basicSetOrganizations(null, msgs);
			case BOMPackage.CREDITS_TYPE__INDIVIDUALS:
				return basicSetIndividuals(null, msgs);
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
			case BOMPackage.CREDITS_TYPE__ORGANIZATIONS:
				return getOrganizations();
			case BOMPackage.CREDITS_TYPE__INDIVIDUALS:
				return getIndividuals();
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
			case BOMPackage.CREDITS_TYPE__ORGANIZATIONS:
				setOrganizations((OrganizationsType1)newValue);
				return;
			case BOMPackage.CREDITS_TYPE__INDIVIDUALS:
				setIndividuals((IndividualsType)newValue);
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
			case BOMPackage.CREDITS_TYPE__ORGANIZATIONS:
				setOrganizations((OrganizationsType1)null);
				return;
			case BOMPackage.CREDITS_TYPE__INDIVIDUALS:
				setIndividuals((IndividualsType)null);
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
			case BOMPackage.CREDITS_TYPE__ORGANIZATIONS:
				return organizations != null;
			case BOMPackage.CREDITS_TYPE__INDIVIDUALS:
				return individuals != null;
		}
		return super.eIsSet(featureID);
	}

} //CreditsTypeImpl
