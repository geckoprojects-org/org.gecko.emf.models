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
 * A representation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.ExceptionType#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getExceptionType()
 * @model extendedMetaData="name='Exception_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExceptionType extends EObject {
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
	 * @see net.opengis.wms.WMSPackage#getExceptionType_Format()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Format' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFormat();

} // ExceptionType
