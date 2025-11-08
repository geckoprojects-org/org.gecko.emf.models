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
import org.cyclonedx.schema.bom.ComponentsType1;
import org.cyclonedx.schema.bom.OrganizationsType;
import org.cyclonedx.schema.bom.ServicesType;
import org.cyclonedx.schema.bom.TargetsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Targets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TargetsTypeImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TargetsTypeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TargetsTypeImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetsTypeImpl extends MinimalEObjectImpl.Container implements TargetsType {
	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected OrganizationsType organizations;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType1 components;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected ServicesType services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getTargetsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationsType getOrganizations() {
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizations(OrganizationsType newOrganizations, NotificationChain msgs) {
		OrganizationsType oldOrganizations = organizations;
		organizations = newOrganizations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TARGETS_TYPE__ORGANIZATIONS, oldOrganizations, newOrganizations);
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
	public void setOrganizations(OrganizationsType newOrganizations) {
		if (newOrganizations != organizations) {
			NotificationChain msgs = null;
			if (organizations != null)
				msgs = ((InternalEObject)organizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TARGETS_TYPE__ORGANIZATIONS, null, msgs);
			if (newOrganizations != null)
				msgs = ((InternalEObject)newOrganizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TARGETS_TYPE__ORGANIZATIONS, null, msgs);
			msgs = basicSetOrganizations(newOrganizations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TARGETS_TYPE__ORGANIZATIONS, newOrganizations, newOrganizations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType1 getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(ComponentsType1 newComponents, NotificationChain msgs) {
		ComponentsType1 oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TARGETS_TYPE__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(ComponentsType1 newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TARGETS_TYPE__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TARGETS_TYPE__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TARGETS_TYPE__COMPONENTS, newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesType getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(ServicesType newServices, NotificationChain msgs) {
		ServicesType oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.TARGETS_TYPE__SERVICES, oldServices, newServices);
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
	public void setServices(ServicesType newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TARGETS_TYPE__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.TARGETS_TYPE__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TARGETS_TYPE__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.TARGETS_TYPE__ORGANIZATIONS:
				return basicSetOrganizations(null, msgs);
			case BOMPackage.TARGETS_TYPE__COMPONENTS:
				return basicSetComponents(null, msgs);
			case BOMPackage.TARGETS_TYPE__SERVICES:
				return basicSetServices(null, msgs);
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
			case BOMPackage.TARGETS_TYPE__ORGANIZATIONS:
				return getOrganizations();
			case BOMPackage.TARGETS_TYPE__COMPONENTS:
				return getComponents();
			case BOMPackage.TARGETS_TYPE__SERVICES:
				return getServices();
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
			case BOMPackage.TARGETS_TYPE__ORGANIZATIONS:
				setOrganizations((OrganizationsType)newValue);
				return;
			case BOMPackage.TARGETS_TYPE__COMPONENTS:
				setComponents((ComponentsType1)newValue);
				return;
			case BOMPackage.TARGETS_TYPE__SERVICES:
				setServices((ServicesType)newValue);
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
			case BOMPackage.TARGETS_TYPE__ORGANIZATIONS:
				setOrganizations((OrganizationsType)null);
				return;
			case BOMPackage.TARGETS_TYPE__COMPONENTS:
				setComponents((ComponentsType1)null);
				return;
			case BOMPackage.TARGETS_TYPE__SERVICES:
				setServices((ServicesType)null);
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
			case BOMPackage.TARGETS_TYPE__ORGANIZATIONS:
				return organizations != null;
			case BOMPackage.TARGETS_TYPE__COMPONENTS:
				return components != null;
			case BOMPackage.TARGETS_TYPE__SERVICES:
				return services != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetsTypeImpl
