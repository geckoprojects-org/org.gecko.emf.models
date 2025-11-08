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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organizational Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.OrganizationalEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OrganizationalEntity#getAddress <em>Address</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OrganizationalEntity#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OrganizationalEntity#getContact <em>Contact</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OrganizationalEntity#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OrganizationalEntity#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OrganizationalEntity#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity()
 * @model extendedMetaData="name='organizationalEntity' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OrganizationalEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical address (location) of the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(PostalAddressType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalAddressType getAddress();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(PostalAddressType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The URL of the organization. Multiple URLs are allowed.
	 *                         Example: https://example.com
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity_Url()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUrl();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.OrganizationalContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contact person at the organization. Multiple contacts are allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationalContact> getContact();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the object elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OrganizationalEntity#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOrganizationalEntity_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // OrganizationalEntity
