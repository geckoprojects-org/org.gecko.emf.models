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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#isXTrustBoundary <em>XTrust Boundary</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getTrustZone <em>Trust Zone</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getServices <em>Services</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getReleaseNotes <em>Release Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getTags <em>Tags</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Service#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getService()
 * @model extendedMetaData="name='service' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that provides the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getProvider();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The grouping name, namespace, or identifier. This will often be a shortened,
	 *                         single name of the company or project that produced the service or domain name.
	 *                         Whitespace and special characters should be avoided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the service. This will often be a shortened, single name
	 *                         of the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Version()
	 * @model dataType="org.cyclonedx.schema.bom.VersionType1"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a description for the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The endpoint URIs of the service. Multiple endpoints are allowed.
	 *                         Example: "https://example.com/api/v1/ticker"
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoints</em>' containment reference.
	 * @see #setEndpoints(EndpointsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Endpoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoints' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointsType getEndpoints();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getEndpoints <em>Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoints</em>' containment reference.
	 * @see #getEndpoints()
	 * @generated
	 */
	void setEndpoints(EndpointsType value);

	/**
	 * Returns the value of the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean value indicating if the service requires authentication.
	 *                         A value of true indicates the service requires authentication prior to use.
	 *                         A value of false indicates the service does not require authentication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authenticated</em>' attribute.
	 * @see #isSetAuthenticated()
	 * @see #unsetAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Authenticated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='authenticated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAuthenticated();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticated</em>' attribute.
	 * @see #isSetAuthenticated()
	 * @see #unsetAuthenticated()
	 * @see #isAuthenticated()
	 * @generated
	 */
	void setAuthenticated(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.Service#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticated()
	 * @see #isAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @generated
	 */
	void unsetAuthenticated();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.Service#isAuthenticated <em>Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authenticated</em>' attribute is set.
	 * @see #unsetAuthenticated()
	 * @see #isAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @generated
	 */
	boolean isSetAuthenticated();

	/**
	 * Returns the value of the '<em><b>XTrust Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean value indicating if use of the service crosses a trust zone or boundary.
	 *                         A value of true indicates that by using the service, a trust boundary is crossed.
	 *                         A value of false indicates that by using the service, a trust boundary is not crossed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XTrust Boundary</em>' attribute.
	 * @see #isSetXTrustBoundary()
	 * @see #unsetXTrustBoundary()
	 * @see #setXTrustBoundary(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_XTrustBoundary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='x-trust-boundary' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isXTrustBoundary();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#isXTrustBoundary <em>XTrust Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XTrust Boundary</em>' attribute.
	 * @see #isSetXTrustBoundary()
	 * @see #unsetXTrustBoundary()
	 * @see #isXTrustBoundary()
	 * @generated
	 */
	void setXTrustBoundary(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.Service#isXTrustBoundary <em>XTrust Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXTrustBoundary()
	 * @see #isXTrustBoundary()
	 * @see #setXTrustBoundary(boolean)
	 * @generated
	 */
	void unsetXTrustBoundary();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.Service#isXTrustBoundary <em>XTrust Boundary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XTrust Boundary</em>' attribute is set.
	 * @see #unsetXTrustBoundary()
	 * @see #isXTrustBoundary()
	 * @see #setXTrustBoundary(boolean)
	 * @generated
	 */
	boolean isSetXTrustBoundary();

	/**
	 * Returns the value of the '<em><b>Trust Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the trust zone the service resides in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trust Zone</em>' attribute.
	 * @see #setTrustZone(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_TrustZone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='trustZone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTrustZone();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getTrustZone <em>Trust Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Zone</em>' attribute.
	 * @see #getTrustZone()
	 * @generated
	 */
	void setTrustZone(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies information about the data including the directional flow of data and the data classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	DataType1 getData();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataType1 value);

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference.
	 * @see #setLicenses(LicenseChoiceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Licenses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenses' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseChoiceType getLicenses();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getLicenses <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licenses</em>' containment reference.
	 * @see #getLicenses()
	 * @generated
	 */
	void setLicenses(LicenseChoiceType value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document external references related to the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External References</em>' containment reference.
	 * @see #setExternalReferences(ExternalReferences)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_ExternalReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReferences getExternalReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getExternalReferences <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External References</em>' containment reference.
	 * @see #getExternalReferences()
	 * @generated
	 */
	void setExternalReferences(ExternalReferences value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A list of services included or deployed behind the parent service. This is not a dependency
	 *                         tree. It provides a way to specify a hierarchical representation of service assemblies.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(ServicesType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicesType1 getServices();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesType1 value);

	/**
	 * Returns the value of the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies optional release notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Notes</em>' containment reference.
	 * @see #setReleaseNotes(ReleaseNotesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_ReleaseNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	ReleaseNotesType getReleaseNotes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getReleaseNotes <em>Release Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Notes</em>' containment reference.
	 * @see #getReleaseNotes()
	 * @generated
	 */
	void setReleaseNotes(ReleaseNotesType value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(TagsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tags' namespace='##targetNamespace'"
	 * @generated
	 */
	TagsType getTags();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TagsType value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':16' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the service elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Service#getBomRef <em>Bom Ref</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getService_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':18' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Service
