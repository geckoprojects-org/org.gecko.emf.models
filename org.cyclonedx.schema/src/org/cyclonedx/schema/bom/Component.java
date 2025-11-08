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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getScope <em>Scope</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getHashes <em>Hashes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getCpe <em>Cpe</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getPurl <em>Purl</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getOmniborId <em>Omnibor Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getSwhid <em>Swhid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getSwid <em>Swid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#isModified <em>Modified</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getPedigree <em>Pedigree</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getReleaseNotes <em>Release Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getModelCard <em>Model Card</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getCryptoProperties <em>Crypto Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getTags <em>Tags</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Component#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent()
 * @model extendedMetaData="name='component' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that supplied the component. The supplier may often
	 *                         be the manufacturer, but may also be a distributor or repackager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference.
	 * @see #setSupplier(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Supplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getSupplier();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getSupplier <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' containment reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The organization that created the component.
	 *                         Manufacturer is common in components created through automated processes. Components created through manual means may have './authors' instead.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getManufacturer();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The person(s) who created the component.
	 *                         Authors are common in components created through manual processes. Components created through automated means may have `./manufacturer` instead.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference.
	 * @see #setAuthors(AuthorsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Authors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authors' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorsType1 getAuthors();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getAuthors <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' containment reference.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(AuthorsType1 value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         DEPRECATED - DO NOT USE. This will be removed in a future version. Use `./authors` or `./manufacturer` instead.
	 *                         The person(s) or organization(s) that authored the component.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person(s) or organization(s) that published the component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Publisher()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The grouping name or identifier. This will often be a shortened, single
	 *                         name of the company or project that produced the component, or the source package or
	 *                         domain name. Whitespace and special characters should be avoided. Examples include:
	 *                         apache, org.apache.commons, and apache.org.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getGroup <em>Group</em>}' attribute.
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
	 * The name of the component. This will often be a shortened, single name
	 *                         of the component. Examples: commons-lang3 and jquery
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getName <em>Name</em>}' attribute.
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
	 * The component version. The version should ideally comply with semantic versioning
	 *                         but is not enforced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Version()
	 * @model dataType="org.cyclonedx.schema.bom.VersionType1"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getVersion <em>Version</em>}' attribute.
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
	 * Specifies a description for the component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"required"</code>.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.Scope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the scope of the component. If scope is not specified, 'required'
	 *                         scope SHOULD be assumed by the consumer of the BOM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.cyclonedx.schema.bom.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(Scope)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Scope()
	 * @model default="required" unsettable="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.cyclonedx.schema.bom.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.Component#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.Component#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	boolean isSetScope();

	/**
	 * Returns the value of the '<em><b>Hashes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hashes of the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hashes</em>' containment reference.
	 * @see #setHashes(HashesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Hashes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hashes' namespace='##targetNamespace'"
	 * @generated
	 */
	HashesType getHashes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getHashes <em>Hashes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashes</em>' containment reference.
	 * @see #getHashes()
	 * @generated
	 */
	void setHashes(HashesType value);

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference.
	 * @see #setLicenses(LicenseChoiceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Licenses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenses' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseChoiceType getLicenses();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getLicenses <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licenses</em>' containment reference.
	 * @see #getLicenses()
	 * @generated
	 */
	void setLicenses(LicenseChoiceType value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright notice informing users of the underlying claims to copyright ownership in a published work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Copyright()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Cpe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Specifies a well-formed CPE name that conforms to the CPE 2.2 or 2.3 specification. See https://nvd.nist.gov/products/cpe
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpe</em>' attribute.
	 * @see #setCpe(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Cpe()
	 * @model dataType="org.cyclonedx.schema.bom.Cpe"
	 *        extendedMetaData="kind='element' name='cpe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCpe();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getCpe <em>Cpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpe</em>' attribute.
	 * @see #getCpe()
	 * @generated
	 */
	void setCpe(String value);

	/**
	 * Returns the value of the '<em><b>Purl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Specifies the package-url (purl). The purl, if specified, must be valid and conform
	 *                         to the specification defined at: https://github.com/package-url/purl-spec
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purl</em>' attribute.
	 * @see #setPurl(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Purl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='purl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPurl();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getPurl <em>Purl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purl</em>' attribute.
	 * @see #getPurl()
	 * @generated
	 */
	void setPurl(String value);

	/**
	 * Returns the value of the '<em><b>Omnibor Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Specifies the OmniBOR Artifact ID. The OmniBOR, if specified, must be valid and conform
	 *                         to the specification defined at: https://www.iana.org/assignments/uri-schemes/prov/gitoid
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Omnibor Id</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_OmniborId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='omniborId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getOmniborId();

	/**
	 * Returns the value of the '<em><b>Swhid</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Specifies the Software Heritage persistent identifier (SWHID). The SWHID, if specified, must
	 *                         be valid and conform to the specification defined at:
	 *                         https://docs.softwareheritage.org/devel/swh-model/persistent-identifiers.html
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swhid</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Swhid()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='swhid' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSwhid();

	/**
	 * Returns the value of the '<em><b>Swid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Specifies metadata and content for ISO-IEC 19770-2 Software Identification (SWID) Tags.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swid</em>' containment reference.
	 * @see #setSwid(SwidType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Swid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='swid' namespace='##targetNamespace'"
	 * @generated
	 */
	SwidType getSwid();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getSwid <em>Swid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swid</em>' containment reference.
	 * @see #getSwid()
	 * @generated
	 */
	void setSwid(SwidType value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         DEPRECATED - DO NOT USE. This will be removed in a future version. Use the pedigree
	 *                         element instead to supply information on exactly how the component was modified.
	 *                         A boolean value indicating if the component has been modified from the original.
	 *                         A value of true indicates the component is a derivative of the original.
	 *                         A value of false indicates the component has not been modified from the original.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #isSetModified()
	 * @see #unsetModified()
	 * @see #setModified(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Modified()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='modified' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isModified();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#isModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #isSetModified()
	 * @see #unsetModified()
	 * @see #isModified()
	 * @generated
	 */
	void setModified(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.Component#isModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModified()
	 * @see #isModified()
	 * @see #setModified(boolean)
	 * @generated
	 */
	void unsetModified();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.Component#isModified <em>Modified</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modified</em>' attribute is set.
	 * @see #unsetModified()
	 * @see #isModified()
	 * @see #setModified(boolean)
	 * @generated
	 */
	boolean isSetModified();

	/**
	 * Returns the value of the '<em><b>Pedigree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Component pedigree is a way to document complex supply chain scenarios where components are
	 *                         created, distributed, modified, redistributed, combined with other components, etc.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pedigree</em>' containment reference.
	 * @see #setPedigree(PedigreeType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Pedigree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pedigree' namespace='##targetNamespace'"
	 * @generated
	 */
	PedigreeType getPedigree();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getPedigree <em>Pedigree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pedigree</em>' containment reference.
	 * @see #getPedigree()
	 * @generated
	 */
	void setPedigree(PedigreeType value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document external references related to the
	 *                         component or to the project the component describes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External References</em>' containment reference.
	 * @see #setExternalReferences(ExternalReferences)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_ExternalReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReferences getExternalReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getExternalReferences <em>External References</em>}' containment reference.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A list of software and hardware components included in the parent component. This is not a
	 *                         dependency tree. It provides a way to specify a hierarchical representation of component
	 *                         assemblies, similar to system -> subsystem -> parts assembly in physical supply chains.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ComponentsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType getComponents();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(ComponentsType value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document evidence collected through various forms of extraction or analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference.
	 * @see #setEvidence(ComponentEvidenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentEvidenceType getEvidence();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getEvidence <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' containment reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(ComponentEvidenceType value);

	/**
	 * Returns the value of the '<em><b>Release Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies optional release notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Notes</em>' containment reference.
	 * @see #setReleaseNotes(ReleaseNotesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_ReleaseNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	ReleaseNotesType getReleaseNotes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getReleaseNotes <em>Release Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Notes</em>' containment reference.
	 * @see #getReleaseNotes()
	 * @generated
	 */
	void setReleaseNotes(ReleaseNotesType value);

	/**
	 * Returns the value of the '<em><b>Model Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A model card describes the intended uses of a machine learning model and potential
	 *                         limitations, including biases and ethical considerations. Model cards typically contain the
	 *                         training parameters, which datasets were used to train the model, performance metrics, and other
	 *                         relevant data useful for ML transparency. This object SHOULD be specified for any component of
	 *                         type `machine-learning-model` and must not be specified for other component types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Card</em>' containment reference.
	 * @see #setModelCard(ModelCardType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_ModelCard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelCard' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelCardType getModelCard();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getModelCard <em>Model Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Card</em>' containment reference.
	 * @see #getModelCard()
	 * @generated
	 */
	void setModelCard(ModelCardType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.ComponentDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This object SHOULD be specified for any component of type `data` and must not be
	 *                         specified for other component types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentDataType> getData();

	/**
	 * Returns the value of the '<em><b>Crypto Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Cryptographic assets have properties that uniquely define them and that make them actionable
	 *                         for further reasoning. As an example, it makes a difference if one knows the algorithm family
	 *                         (e.g. AES) or the specific variant or instantiation (e.g. AES-128-GCM). This is because the
	 *                         security level and the algorithm primitive (authenticated encryption) is only defined by the
	 *                         definition of the algorithm variant. The presence of a weak cryptographic algorithm like SHA1
	 *                         vs. HMAC-SHA1 also makes a difference.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crypto Properties</em>' containment reference.
	 * @see #setCryptoProperties(CryptoPropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_CryptoProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cryptoProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	CryptoPropertiesType getCryptoProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getCryptoProperties <em>Crypto Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypto Properties</em>' containment reference.
	 * @see #getCryptoProperties()
	 * @generated
	 */
	void setCryptoProperties(CryptoPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(TagsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tags' namespace='##targetNamespace'"
	 * @generated
	 */
	TagsType getTags();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getTags <em>Tags</em>}' containment reference.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':29' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the component elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The optional mime-type of the component. When used on file components, the mime-type
	 *                     can provide additional context about the kind of file being represented such as an image,
	 *                     font, or executable. Some library or framework components may also have an associated mime-type.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_MimeType()
	 * @model dataType="org.cyclonedx.schema.bom.MimeType"
	 *        extendedMetaData="kind='attribute' name='mime-type'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.Classification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     Specifies the type of component. For software components, classify as application if no more
	 *                     specific appropriate classification is available or cannot be determined for the component.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.Classification
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(Classification)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	Classification getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Component#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.Classification
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(Classification value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.Component#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Classification)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.Component#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Classification)
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponent_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':33' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Component
