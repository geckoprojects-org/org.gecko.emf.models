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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getLifecycles <em>Lifecycles</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getTools <em>Tools</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getComponent <em>Component</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getManufacture <em>Manufacture</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Metadata#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata()
 * @model extendedMetaData="name='metadata' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time (timestamp) when the BOM was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Lifecycles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Lifecycles communicate the stage(s) in which data in the BOM was captured. Different types of data may be available at various phases of a lifecycle, such as the Software Development Lifecycle (SDLC), IT Asset Management (ITAM), and Software Asset Management (SAM). Thus, a BOM may include data specific to or only obtainable in a given lifecycle.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycles</em>' containment reference.
	 * @see #setLifecycles(LifecyclesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Lifecycles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lifecycles' namespace='##targetNamespace'"
	 * @generated
	 */
	LifecyclesType getLifecycles();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getLifecycles <em>Lifecycles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycles</em>' containment reference.
	 * @see #getLifecycles()
	 * @generated
	 */
	void setLifecycles(LifecyclesType value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tool(s) used in the creation of the BOM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference.
	 * @see #setTools(ToolsType3)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Tools()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tools' namespace='##targetNamespace'"
	 * @generated
	 */
	ToolsType3 getTools();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getTools <em>Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tools</em>' containment reference.
	 * @see #getTools()
	 * @generated
	 */
	void setTools(ToolsType3 value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The person(s) who created the BOM.
	 *                         Authors are common in BOMs created through manual processes. BOMs created through automated means may have './manufacturer' instead.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference.
	 * @see #setAuthors(AuthorsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Authors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authors' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorsType getAuthors();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getAuthors <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' containment reference.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(AuthorsType value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component that the BOM describes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Component)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The organization that created the BOM.
	 *                         Manufacturer is common in BOMs created through automated processes. BOMs created through manual means may have './authors' instead.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getManufacturer();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Manufacture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         DEPRECATED - DO NOT USE. This will be removed in a future version. Use the `./component/manufacturer` instead.
	 *                         The organization that manufactured the component that the BOM describes.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture</em>' containment reference.
	 * @see #setManufacture(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Manufacture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacture' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getManufacture();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getManufacture <em>Manufacture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture</em>' containment reference.
	 * @see #getManufacture()
	 * @generated
	 */
	void setManufacture(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that supplied the component that the BOM describes. The
	 *                         supplier may often be the manufacturer, but may also be a distributor or repackager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference.
	 * @see #setSupplier(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Supplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getSupplier();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getSupplier <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' containment reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The license information for the BOM document.
	 *                         This may be different from the license(s) of the component(s) that the BOM describes.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference.
	 * @see #setLicenses(LicenseChoiceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Licenses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenses' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseChoiceType getLicenses();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getLicenses <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licenses</em>' containment reference.
	 * @see #getLicenses()
	 * @generated
	 */
	void setLicenses(LicenseChoiceType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document properties in a name/value store.
	 *                         This provides flexibility to include data not officially supported in the standard
	 *                         without having to use additional namespaces or create extensions. Property names
	 *                         of interest to the general public are encouraged to be registered in the
	 *                         CycloneDX Property Taxonomy - https://github.com/CycloneDX/cyclonedx-property-taxonomy.
	 *                         Formal registration is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Metadata#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='lax'"
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMetadata_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':11' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Metadata
