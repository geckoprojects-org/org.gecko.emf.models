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
 * A representation of the model object '<em><b>Signatory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.SignatoryType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SignatoryType#getRole <em>Role</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SignatoryType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SignatoryType#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SignatoryType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getSignatoryType()
 * @model extendedMetaData="name='signatory_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignatoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The signatory's name.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSignatoryType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SignatoryType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The signatory's role within an organization.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSignatoryType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SignatoryType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The signatory's organization.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSignatoryType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getOrganization();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SignatoryType#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             An External reference provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference.
	 * @see #setExternalReference(ExternalReference)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSignatoryType_ExternalReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReference getExternalReference();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SignatoryType#getExternalReference <em>External Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' containment reference.
	 * @see #getExternalReference()
	 * @generated
	 */
	void setExternalReference(ExternalReference value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSignatoryType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // SignatoryType
