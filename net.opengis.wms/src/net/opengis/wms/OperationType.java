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
package net.opengis.wms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         For each operation offered by the server, list the available output
 *         formats and the online resource.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.OperationType#getFormat <em>Format</em>}</li>
 *   <li>{@link net.opengis.wms.OperationType#getDCPType <em>DCP Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getOperationType()
 * @model extendedMetaData="name='OperationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OperationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A container for listing an available format's MIME type.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute list.
	 * @see net.opengis.wms.WMSPackage#getOperationType_Format()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Format' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFormat();

	/**
	 * Returns the value of the '<em><b>DCP Type</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.DCPTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Available Distributed Computing Platforms (DCPs) are listed here.
	 *         At present, only HTTP is defined.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DCP Type</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getOperationType_DCPType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DCPType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DCPTypeType> getDCPType();

} // OperationType
