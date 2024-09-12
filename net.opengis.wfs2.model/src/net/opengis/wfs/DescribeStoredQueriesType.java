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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Describe Stored Queries Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.DescribeStoredQueriesType#getStoredQueryId <em>Stored Query Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getDescribeStoredQueriesType()
 * @model extendedMetaData="name='DescribeStoredQueriesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DescribeStoredQueriesType extends BaseRequestType {
	/**
	 * Returns the value of the '<em><b>Stored Query Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Query Id</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getDescribeStoredQueriesType_StoredQueryId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='StoredQueryId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getStoredQueryId();

} // DescribeStoredQueriesType
