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

import net.opengis.wfs.DescribeStoredQueriesResponseType;
import net.opengis.wfs.StoredQueryDescriptionType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describe Stored Queries Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.DescribeStoredQueriesResponseTypeImpl#getStoredQueryDescription <em>Stored Query Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescribeStoredQueriesResponseTypeImpl extends MinimalEObjectImpl.Container implements DescribeStoredQueriesResponseType {
	/**
	 * The cached value of the '{@link #getStoredQueryDescription() <em>Stored Query Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredQueryDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<StoredQueryDescriptionType> storedQueryDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribeStoredQueriesResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoredQueryDescriptionType> getStoredQueryDescription() {
		if (storedQueryDescription == null) {
			storedQueryDescription = new EObjectContainmentEList<StoredQueryDescriptionType>(StoredQueryDescriptionType.class, this, WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION);
		}
		return storedQueryDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION:
				return ((InternalEList<?>)getStoredQueryDescription()).basicRemove(otherEnd, msgs);
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
			case WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION:
				return getStoredQueryDescription();
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
			case WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION:
				getStoredQueryDescription().clear();
				getStoredQueryDescription().addAll((Collection<? extends StoredQueryDescriptionType>)newValue);
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
			case WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION:
				getStoredQueryDescription().clear();
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
			case WFSPackage.DESCRIBE_STORED_QUERIES_RESPONSE_TYPE__STORED_QUERY_DESCRIPTION:
				return storedQueryDescription != null && !storedQueryDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DescribeStoredQueriesResponseTypeImpl
