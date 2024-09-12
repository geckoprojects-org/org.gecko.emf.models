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
 * A representation of the model object '<em><b>Transaction Results Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             The TransactionResults element may be used to report exception
 *             codes and messages for all actions of a transaction that failed
 *             to complete successfully.
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.TransactionResultsType#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getTransactionResultsType()
 * @model extendedMetaData="name='TransactionResultsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TransactionResultsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The Action element reports an exception code
	 *                   and exception message indicating why the
	 *                   corresponding action of a transaction request
	 *                   failed.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getTransactionResultsType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionType> getAction();

} // TransactionResultsType
