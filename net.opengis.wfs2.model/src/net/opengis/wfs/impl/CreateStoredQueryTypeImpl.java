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
package net.opengis.wfs.impl;

import java.util.Collection;

import net.opengis.wfs.CreateStoredQueryType;
import net.opengis.wfs.StoredQueryDescriptionType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Stored Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.CreateStoredQueryTypeImpl#getStoredQueryDefinition <em>Stored Query Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateStoredQueryTypeImpl extends BaseRequestTypeImpl implements CreateStoredQueryType {
	/**
	 * The cached value of the '{@link #getStoredQueryDefinition() <em>Stored Query Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredQueryDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<StoredQueryDescriptionType> storedQueryDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateStoredQueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.CREATE_STORED_QUERY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoredQueryDescriptionType> getStoredQueryDefinition() {
		if (storedQueryDefinition == null) {
			storedQueryDefinition = new EObjectContainmentEList<StoredQueryDescriptionType>(StoredQueryDescriptionType.class, this, WFSPackage.CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION);
		}
		return storedQueryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION:
				return ((InternalEList<?>)getStoredQueryDefinition()).basicRemove(otherEnd, msgs);
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
			case WFSPackage.CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION:
				return getStoredQueryDefinition();
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
			case WFSPackage.CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION:
				getStoredQueryDefinition().clear();
				getStoredQueryDefinition().addAll((Collection<? extends StoredQueryDescriptionType>)newValue);
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
			case WFSPackage.CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION:
				getStoredQueryDefinition().clear();
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
			case WFSPackage.CREATE_STORED_QUERY_TYPE__STORED_QUERY_DEFINITION:
				return storedQueryDefinition != null && !storedQueryDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CreateStoredQueryTypeImpl
