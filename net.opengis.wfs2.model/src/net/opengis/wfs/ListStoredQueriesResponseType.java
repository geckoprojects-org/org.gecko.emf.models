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
package net.opengis.wfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Stored Queries Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.ListStoredQueriesResponseType#getStoredQuery <em>Stored Query</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getListStoredQueriesResponseType()
 * @model extendedMetaData="name='ListStoredQueriesResponseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ListStoredQueriesResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stored Query</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.StoredQueryListItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Query</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getListStoredQueriesResponseType_StoredQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StoredQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StoredQueryListItemType> getStoredQuery();

} // ListStoredQueriesResponseType
