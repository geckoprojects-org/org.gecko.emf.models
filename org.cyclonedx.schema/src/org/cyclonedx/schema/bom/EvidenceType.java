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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getCreated <em>Created</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EvidenceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType()
 * @model extendedMetaData="name='evidence_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EvidenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The reference to the property name as defined in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy/).
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_PropertyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='propertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EvidenceType#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The written description of what this evidence is and how it was created.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EvidenceType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The output or analysis that supports claims.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataType> getData();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time (timestamp) when the evidence was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_Created()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreated();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EvidenceType#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional date and time (timestamp) when the evidence is no longer valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_Expires()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='expires' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpires();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EvidenceType#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The author of the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(OrganizationalContact)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalContact getAuthor();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EvidenceType#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(OrganizationalContact value);

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reviewer of the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reviewer</em>' containment reference.
	 * @see #setReviewer(OrganizationalContact)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_Reviewer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewer' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalContact getReviewer();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EvidenceType#getReviewer <em>Reviewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewer</em>' containment reference.
	 * @see #getReviewer()
	 * @generated
	 */
	void setReviewer(OrganizationalContact value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             An optional identifier which can be used to reference the object elsewhere
	 *                                             in the BOM. Every bom-ref must be unique within the BOM.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EvidenceType#getBomRef <em>Bom Ref</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // EvidenceType
