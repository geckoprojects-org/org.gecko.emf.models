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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attached Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AttachedTextType#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AttachedTextType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AttachedTextType#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAttachedTextType()
 * @model extendedMetaData="name='attachedTextType' kind='simple'"
 * @generated
 */
@ProviderType
public interface AttachedTextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attachment data. Proactive controls such as input validation and sanitization should be employed to prevent misuse of attachment text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAttachedTextType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AttachedTextType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * The default value is <code>"text/plain"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Specifies the format and nature of the data being attached, helping systems correctly
	 *                             interpret and process the content. Common content type examples include `application/json`
	 *                             for JSON data and `text/plain` for plan text documents.
	 *                             RFC 2045 section 5.1 outlines the structure and use of content types. For a comprehensive
	 *                             list of registered content types, refer to the IANA media types registry at
	 *                             https://www.iana.org/assignments/media-types/media-types.xhtml.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #isSetContentType()
	 * @see #unsetContentType()
	 * @see #setContentType(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAttachedTextType_ContentType()
	 * @model default="text/plain" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='content-type'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AttachedTextType#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #isSetContentType()
	 * @see #unsetContentType()
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AttachedTextType#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContentType()
	 * @see #getContentType()
	 * @see #setContentType(String)
	 * @generated
	 */
	void unsetContentType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AttachedTextType#getContentType <em>Content Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Content Type</em>' attribute is set.
	 * @see #unsetContentType()
	 * @see #getContentType()
	 * @see #setContentType(String)
	 * @generated
	 */
	boolean isSetContentType();

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.Encoding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Specifies the optional encoding the text is represented in
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see org.cyclonedx.schema.bom.Encoding
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(Encoding)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAttachedTextType_Encoding()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	Encoding getEncoding();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AttachedTextType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.cyclonedx.schema.bom.Encoding
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(Encoding value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AttachedTextType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(Encoding)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AttachedTextType#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(Encoding)
	 * @generated
	 */
	boolean isSetEncoding();

} // AttachedTextType
