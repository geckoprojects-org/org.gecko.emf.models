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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.KeywordType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.wms.KeywordType#getVocabulary <em>Vocabulary</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getKeywordType()
 * @model extendedMetaData="name='Keyword_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface KeywordType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.wms.WMSPackage#getKeywordType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.wms.KeywordType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Vocabulary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabulary</em>' attribute.
	 * @see #setVocabulary(String)
	 * @see net.opengis.wms.WMSPackage#getKeywordType_Vocabulary()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vocabulary'"
	 * @generated
	 */
	String getVocabulary();

	/**
	 * Sets the value of the '{@link net.opengis.wms.KeywordType#getVocabulary <em>Vocabulary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocabulary</em>' attribute.
	 * @see #getVocabulary()
	 * @generated
	 */
	void setVocabulary(String value);

} // KeywordType
