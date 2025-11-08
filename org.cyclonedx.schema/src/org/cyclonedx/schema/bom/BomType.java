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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bom Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getServices <em>Services</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getFormulation <em>Formulation</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.BomType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType()
 * @model extendedMetaData="name='bom_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information about a BOM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of software and hardware components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ComponentsType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType2 getComponents();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(ComponentsType2 value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of services. This may include microservices, function-as-a-service, and other types of network or intra-process services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(ServicesType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicesType2 getServices();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesType2 value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document external references related to the BOM or
	 *                             to the project the BOM describes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External References</em>' containment reference.
	 * @see #setExternalReferences(ExternalReferences)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_ExternalReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReferences getExternalReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getExternalReferences <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External References</em>' containment reference.
	 * @see #getExternalReferences()
	 * @generated
	 */
	void setExternalReferences(ExternalReferences value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document dependency relationships.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	DependenciesType1 getDependencies();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(DependenciesType1 value);

	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compositions describe constituent parts (including components, services, and dependency relationships) and their completeness. The completeness of vulnerabilities expressed in a BOM may also be described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compositions</em>' containment reference.
	 * @see #setCompositions(CompositionsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Compositions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compositions' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositionsType getCompositions();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getCompositions <em>Compositions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositions</em>' containment reference.
	 * @see #getCompositions()
	 * @generated
	 */
	void setCompositions(CompositionsType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document properties in a name/value store.
	 *                             This provides flexibility to include data not officially supported in the standard
	 *                             without having to use additional namespaces or create extensions. Property names
	 *                             of interest to the general public are encouraged to be registered in the
	 *                             CycloneDX Property Taxonomy - https://github.com/CycloneDX/cyclonedx-property-taxonomy.
	 *                             Formal registration is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vulnerabilities identified in components or services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' containment reference.
	 * @see #setVulnerabilities(VulnerabilitiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Vulnerabilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vulnerabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	VulnerabilitiesType getVulnerabilities();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getVulnerabilities <em>Vulnerabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vulnerabilities</em>' containment reference.
	 * @see #getVulnerabilities()
	 * @generated
	 */
	void setVulnerabilities(VulnerabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made by people, organizations, or tools about any object with
	 *                             a bom-ref, such as components, services, vulnerabilities, or the BOM itself. Unlike
	 *                             inventory information, annotations may contain opinion or commentary from various
	 *                             stakeholders. Annotations may be inline (with inventory) or externalized via BOM-Link,
	 *                             and may optionally be signed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Formulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how a component or service was manufactured or deployed. This is
	 *                             achieved through the use of formulas, workflows, tasks, and steps, which declare the precise
	 *                             steps to reproduce along with the observed formulas describing the steps which transpired
	 *                             in the manufacturing process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formulation</em>' containment reference.
	 * @see #setFormulation(FormulationType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Formulation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formulation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormulationType getFormulation();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getFormulation <em>Formulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formulation</em>' containment reference.
	 * @see #getFormulation()
	 * @generated
	 */
	void setFormulation(FormulationType value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The list of declarations which describe the conformance to standards. Each declaration may
	 *                             include attestations, claims, and evidence.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference.
	 * @see #setDeclarations(DeclarationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Declarations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='declarations' namespace='##targetNamespace'"
	 * @generated
	 */
	DeclarationsType getDeclarations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getDeclarations <em>Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarations</em>' containment reference.
	 * @see #getDeclarations()
	 * @generated
	 */
	void setDeclarations(DeclarationsType value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             A collection of reusable objects that are defined and may be used elsewhere in the BOM.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(DefinitionsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Definitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionsType getDefinitions();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(DefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every BOM generated SHOULD have a unique serial number, even if the contents of
	 *                         the BOM have not changed over time. If specified, the serial number must conform to RFC-4122.
	 *                         Use of serial numbers are recommended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_SerialNumber()
	 * @model dataType="org.cyclonedx.schema.bom.UrnUuid"
	 *        extendedMetaData="kind='attribute' name='serialNumber'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whenever an existing BOM is modified, either manually or through automated
	 *                         processes, the version of the BOM SHOULD be incremented by 1. When a system is presented with
	 *                         multiple BOMs with identical serial numbers, the system SHOULD use the most recent version of the BOM.
	 *                         The default version is '1'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_Version()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	BigInteger getVersion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.BomType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.BomType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.BomType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(BigInteger)
	 * @generated
	 */
	boolean isSetVersion();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                         do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getBomType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':15' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // BomType
