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
 * A representation of the model object '<em><b>Keyword List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.KeywordListType#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getKeywordListType()
 * @model extendedMetaData="name='KeywordList_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KeywordListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.KeywordType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A single keyword or phrase.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getKeywordListType_Keyword()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeywordType> getKeyword();

} // KeywordListType
