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
 * A representation of the model object '<em><b>Resource Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ResourceReferenceType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ResourceReferenceType#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ResourceReferenceType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ResourceReferenceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getResourceReferenceType()
 * @model extendedMetaData="name='resourceReferenceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResourceReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             References an object by its bom-ref attribute
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getResourceReferenceType_Ref()
	 * @model dataType="org.cyclonedx.schema.bom.RefType2"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ResourceReferenceType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Reference to an externally accessible resource.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference.
	 * @see #setExternalReference(ExternalReference)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getResourceReferenceType_ExternalReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReference getExternalReference();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ResourceReferenceType#getExternalReference <em>External Reference</em>}' containment reference.
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
	 *                         Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getResourceReferenceType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getResourceReferenceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ResourceReferenceType
