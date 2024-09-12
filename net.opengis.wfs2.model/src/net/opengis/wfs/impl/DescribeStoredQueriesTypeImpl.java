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

import net.opengis.wfs.DescribeStoredQueriesType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describe Stored Queries Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.DescribeStoredQueriesTypeImpl#getStoredQueryId <em>Stored Query Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescribeStoredQueriesTypeImpl extends BaseRequestTypeImpl implements DescribeStoredQueriesType {
	/**
	 * The cached value of the '{@link #getStoredQueryId() <em>Stored Query Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredQueryId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> storedQueryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribeStoredQueriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.DESCRIBE_STORED_QUERIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStoredQueryId() {
		if (storedQueryId == null) {
			storedQueryId = new EDataTypeEList<String>(String.class, this, WFSPackage.DESCRIBE_STORED_QUERIES_TYPE__STORED_QUERY_ID);
		}
		return storedQueryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WFSPackage.DESCRIBE_STORED_QUERIES_TYPE__STORED_QUERY_ID:
				return getStoredQueryId();
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
			case WFSPackage.DESCRIBE_STORED_QUERIES_TYPE__STORED_QUERY_ID:
				getStoredQueryId().clear();
				getStoredQueryId().addAll((Collection<? extends String>)newValue);
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
			case WFSPackage.DESCRIBE_STORED_QUERIES_TYPE__STORED_QUERY_ID:
				getStoredQueryId().clear();
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
			case WFSPackage.DESCRIBE_STORED_QUERIES_TYPE__STORED_QUERY_ID:
				return storedQueryId != null && !storedQueryId.isEmpty();
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
		result.append(" (storedQueryId: ");
		result.append(storedQueryId);
		result.append(')');
		return result.toString();
	}

} //DescribeStoredQueriesTypeImpl
