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
package net.opengis.ows;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Complete reference to a remote or local resource, allowing including metadata about that resource. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.ReferenceType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.ows.ReferenceType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.ows.ReferenceType#getFormat <em>Format</em>}</li>
 *   <li>{@link net.opengis.ows.ReferenceType#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getReferenceType()
 * @model extendedMetaData="name='ReferenceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReferenceType extends AbstractReferenceBaseType {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional unique identifier of the referenced resource. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(CodeType)
	 * @see net.opengis.ows.OWSPackage#getReferenceType_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getIdentifier();

	/**
	 * Sets the value of the '{@link net.opengis.ows.ReferenceType#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(CodeType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.LanguageStringType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brief narrative description of this resource, normally used for display to a human. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see net.opengis.ows.OWSPackage#getReferenceType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LanguageStringType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format of the referenced resource. This element is omitted when the mime type is indicated in the http header of the reference. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see net.opengis.ows.OWSPackage#getReferenceType_Format()
	 * @model dataType="net.opengis.ows.MimeType"
	 *        extendedMetaData="kind='element' name='Format' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link net.opengis.ows.ReferenceType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.MetadataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional unordered list of additional metadata about this resource. A list of optional metadata elements for this ReferenceType could be specified in the Implementation Specification for each use of this type in a specific OWS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see net.opengis.ows.OWSPackage#getReferenceType_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetadataType> getMetadata();

} // ReferenceType
