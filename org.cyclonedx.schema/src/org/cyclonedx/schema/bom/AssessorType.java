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
 * A representation of the model object '<em><b>Assessor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AssessorType#isThirdParty <em>Third Party</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AssessorType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AssessorType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AssessorType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAssessorType()
 * @model extendedMetaData="name='assessor_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Third Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The boolean indicating if the assessor is outside the organization generating claims. A value of false indicates a self assessor.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Third Party</em>' attribute.
	 * @see #isSetThirdParty()
	 * @see #unsetThirdParty()
	 * @see #setThirdParty(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAssessorType_ThirdParty()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='thirdParty' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isThirdParty();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AssessorType#isThirdParty <em>Third Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party</em>' attribute.
	 * @see #isSetThirdParty()
	 * @see #unsetThirdParty()
	 * @see #isThirdParty()
	 * @generated
	 */
	void setThirdParty(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AssessorType#isThirdParty <em>Third Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThirdParty()
	 * @see #isThirdParty()
	 * @see #setThirdParty(boolean)
	 * @generated
	 */
	void unsetThirdParty();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AssessorType#isThirdParty <em>Third Party</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Third Party</em>' attribute is set.
	 * @see #unsetThirdParty()
	 * @see #isThirdParty()
	 * @see #setThirdParty(boolean)
	 * @generated
	 */
	boolean isSetThirdParty();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The entity issuing the assessment.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAssessorType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getOrganization();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AssessorType#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             An optional identifier which can be used to reference the object elsewhere in the BOM.
	 *                                             Every bom-ref must be unique within the BOM.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAssessorType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AssessorType#getBomRef <em>Bom Ref</em>}' attribute.
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
	 *                                             do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAssessorType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // AssessorType
