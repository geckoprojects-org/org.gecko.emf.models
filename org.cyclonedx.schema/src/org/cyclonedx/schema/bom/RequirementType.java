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
 * A representation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getOpenCre <em>Open Cre</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getParent <em>Parent</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RequirementType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType()
 * @model extendedMetaData="name='requirement_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RequirementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The unique identifier used in the standard to identify a specific requirement. This should match what is in the standard and should not be the requirements bom-ref.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_Identifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The title of the requirement.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The textual content of the requirement.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The supplemental text that provides additional guidance or context to the requirement, but is not directly part of the requirement.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference.
	 * @see #setDescriptions(DescriptionsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_Descriptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptions' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionsType getDescriptions();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getDescriptions <em>Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' containment reference.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(DescriptionsType value);

	/**
	 * Returns the value of the '<em><b>Open Cre</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The Common Requirements Enumeration (CRE) identifier(s). CRE is a structured and standardized framework for uniting security standards and guidelines. CRE links each section of a resource to a shared topic identifier (a Common Requirement). Through this shared topic link, all resources map to each other. Use of CRE promotes clear and unambiguous communication among stakeholders.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Cre</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_OpenCre()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.OpenCreType"
	 *        extendedMetaData="kind='element' name='openCre' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getOpenCre();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The optional `bom-ref` to a parent requirement. This establishes a hierarchy of requirements. Top-level requirements must not define a parent. Only child requirements should define parents.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_Parent()
	 * @model dataType="org.cyclonedx.schema.bom.RefLinkType"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document properties in a name/value store.
	 *                                                 This provides flexibility to include data not officially supported in the standard
	 *                                                 without having to use additional namespaces or create extensions. Property names
	 *                                                 of interest to the general public are encouraged to be registered in the
	 *                                                 CycloneDX Property Taxonomy - https://github.com/CycloneDX/cyclonedx-property-taxonomy.
	 *                                                 Formal registration is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document external references related to the BOM or
	 *                                                 to the project the BOM describes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External References</em>' containment reference.
	 * @see #setExternalReferences(ExternalReferences)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_ExternalReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReferences getExternalReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getExternalReferences <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External References</em>' containment reference.
	 * @see #getExternalReferences()
	 * @generated
	 */
	void setExternalReferences(ExternalReferences value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RequirementType#getBomRef <em>Bom Ref</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRequirementType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // RequirementType
