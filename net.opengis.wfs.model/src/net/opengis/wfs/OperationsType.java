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
 * A representation of the model object '<em><b>Operations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.OperationsType#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getOperationsType()
 * @model extendedMetaData="name='OperationsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OperationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute list.
	 * The list contents are of type {@link net.opengis.wfs.OperationType}.
	 * The literals are from the enumeration {@link net.opengis.wfs.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute list.
	 * @see net.opengis.wfs.OperationType
	 * @see net.opengis.wfs.WFSPackage#getOperationsType_Operation()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperationType> getOperation();

} // OperationsType
