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
 * A representation of the model object '<em><b>Contents Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ContentsType#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ContentsType#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getContentsType()
 * @model extendedMetaData="name='contents_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ContentsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional way to include textual or encoded data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(AttachedTextType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getContentsType_Attachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	AttachedTextType getAttachment();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ContentsType#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(AttachedTextType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to where the data can be retrieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getContentsType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ContentsType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // ContentsType
