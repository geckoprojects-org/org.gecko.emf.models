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
 * A representation of the model object '<em><b>Create Stored Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.CreateStoredQueryType#getStoredQueryDefinition <em>Stored Query Definition</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getCreateStoredQueryType()
 * @model extendedMetaData="name='CreateStoredQueryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CreateStoredQueryType extends BaseRequestType {
	/**
	 * Returns the value of the '<em><b>Stored Query Definition</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.StoredQueryDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Query Definition</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getCreateStoredQueryType_StoredQueryDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StoredQueryDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StoredQueryDescriptionType> getStoredQueryDefinition();

} // CreateStoredQueryType
