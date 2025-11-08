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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ExternalReference#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ExternalReference#getComment <em>Comment</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ExternalReference#getHashes <em>Hashes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ExternalReference#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ExternalReference#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getExternalReference()
 * @model extendedMetaData="name='externalReference' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExternalReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI (URL or URN) to the external reference. External references
	 *                         are URIs and therefore can accept any URL scheme including https, mailto, tel, and dns.
	 *                         External references may also include formally registered URNs such as CycloneDX BOM-Link to
	 *                         reference CycloneDX BOMs or any object within a BOM. BOM-Link transforms applicable external
	 *                         references into relationships that can be expressed in a BOM or across BOMs. Refer to:
	 *                         https://cyclonedx.org/capabilities/bomlink/
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExternalReference_Url()
	 * @model dataType="org.cyclonedx.schema.bom.UrlType2" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ExternalReference#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional comment describing the external reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExternalReference_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ExternalReference#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Hashes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashes</em>' containment reference.
	 * @see #setHashes(HashesType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExternalReference_Hashes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hashes' namespace='##targetNamespace'"
	 * @generated
	 */
	HashesType1 getHashes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ExternalReference#getHashes <em>Hashes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashes</em>' containment reference.
	 * @see #getHashes()
	 * @generated
	 */
	void setHashes(HashesType1 value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ExternalReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the type of external reference. There are built-in types to describe common
	 *                     references. If a type does not exist for the reference being referred to, use the "other" type.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ExternalReferenceType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ExternalReferenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExternalReference_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	ExternalReferenceType getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ExternalReference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ExternalReferenceType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ExternalReferenceType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.ExternalReference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ExternalReferenceType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.ExternalReference#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ExternalReferenceType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                     do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExternalReference_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ExternalReference
