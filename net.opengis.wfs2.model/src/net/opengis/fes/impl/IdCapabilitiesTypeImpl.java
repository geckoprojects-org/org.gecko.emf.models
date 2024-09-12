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
package net.opengis.fes.impl;

import java.util.Collection;

import net.opengis.fes.FESPackage;
import net.opengis.fes.IdCapabilitiesType;
import net.opengis.fes.ResourceIdentifierType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.IdCapabilitiesTypeImpl#getResourceIdentifier <em>Resource Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements IdCapabilitiesType {
	/**
	 * The cached value of the '{@link #getResourceIdentifier() <em>Resource Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceIdentifierType> resourceIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.ID_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceIdentifierType> getResourceIdentifier() {
		if (resourceIdentifier == null) {
			resourceIdentifier = new EObjectContainmentEList<ResourceIdentifierType>(ResourceIdentifierType.class, this, FESPackage.ID_CAPABILITIES_TYPE__RESOURCE_IDENTIFIER);
		}
		return resourceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.ID_CAPABILITIES_TYPE__RESOURCE_IDENTIFIER:
				return ((InternalEList<?>)getResourceIdentifier()).basicRemove(otherEnd, msgs);
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
			case FESPackage.ID_CAPABILITIES_TYPE__RESOURCE_IDENTIFIER:
				return getResourceIdentifier();
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
			case FESPackage.ID_CAPABILITIES_TYPE__RESOURCE_IDENTIFIER:
				getResourceIdentifier().clear();
				getResourceIdentifier().addAll((Collection<? extends ResourceIdentifierType>)newValue);
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
			case FESPackage.ID_CAPABILITIES_TYPE__RESOURCE_IDENTIFIER:
				getResourceIdentifier().clear();
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
			case FESPackage.ID_CAPABILITIES_TYPE__RESOURCE_IDENTIFIER:
				return resourceIdentifier != null && !resourceIdentifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IdCapabilitiesTypeImpl
