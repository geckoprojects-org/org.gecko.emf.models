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

import org.cyclonedx.schema.spdx.LicenseId;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies the details and attributes related to a software license.
 *                 It can either include a valid SPDX license identifier or a named license, along with additional
 *                 properties such as license acknowledgment, comprehensive commercial licensing information, and
 *                 the full text of the license.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getId <em>Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getLicensing <em>Licensing</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getAcknowledgement <em>Acknowledgement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType()
 * @model extendedMetaData="name='licenseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LicenseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.spdx.LicenseId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A valid SPDX license identifier. If specified, this value must be one of the enumeration of valid SPDX license identifiers defined in the spdx.schema.json (or spdx.xml) subschema which is synchronized with the official SPDX license list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see org.cyclonedx.schema.spdx.LicenseId
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(LicenseId)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Id()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseId getId();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see org.cyclonedx.schema.spdx.LicenseId
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(LicenseId value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(LicenseId)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(LicenseId)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the license. This may include the name of a commercial or proprietary license or an open source license that may not be defined by SPDX.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the optional full text of the attachment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(AttachedTextType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	AttachedTextType getText();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(AttachedTextType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to the attachment file. If the attachment is a license or BOM,
	 *                         an externalReference should also be specified for completeness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Licensing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licensing details describing the licensor/licensee, license type, renewal and
	 *                         expiration dates, and other important metadata
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licensing</em>' containment reference.
	 * @see #setLicensing(LicensingType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Licensing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licensing' namespace='##targetNamespace'"
	 * @generated
	 */
	LicensingType getLicensing();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getLicensing <em>Licensing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licensing</em>' containment reference.
	 * @see #getLicensing()
	 * @generated
	 */
	void setLicensing(LicensingType value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getProperties <em>Properties</em>}' containment reference.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Acknowledgement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     Declared licenses and concluded licenses represent two different stages in the
	 *                     licensing process within software development. Declared licenses refer to the
	 *                     initial intention of the software authors regarding the licensing terms under
	 *                     which their code is released. On the other hand, concluded licenses are the
	 *                     result of a comprehensive analysis of the project's codebase to identify and
	 *                     confirm the actual licenses of the components used, which may differ from the
	 *                     initially declared licenses. While declared licenses provide an upfront indication
	 *                     of the licensing intentions, concluded licenses offer a more thorough understanding
	 *                     of the actual licensing within a project, facilitating proper compliance and risk
	 *                     management. Observed licenses are defined in `evidence.licenses`. Observed licenses
	 *                     form the evidence necessary to substantiate a concluded license.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acknowledgement</em>' attribute.
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @see #isSetAcknowledgement()
	 * @see #unsetAcknowledgement()
	 * @see #setAcknowledgement(LicenseAcknowledgementEnumerationType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_Acknowledgement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='acknowledgement'"
	 * @generated
	 */
	LicenseAcknowledgementEnumerationType getAcknowledgement();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getAcknowledgement <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledgement</em>' attribute.
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @see #isSetAcknowledgement()
	 * @see #unsetAcknowledgement()
	 * @see #getAcknowledgement()
	 * @generated
	 */
	void setAcknowledgement(LicenseAcknowledgementEnumerationType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getAcknowledgement <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcknowledgement()
	 * @see #getAcknowledgement()
	 * @see #setAcknowledgement(LicenseAcknowledgementEnumerationType)
	 * @generated
	 */
	void unsetAcknowledgement();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getAcknowledgement <em>Acknowledgement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acknowledgement</em>' attribute is set.
	 * @see #unsetAcknowledgement()
	 * @see #getAcknowledgement()
	 * @see #setAcknowledgement(LicenseAcknowledgementEnumerationType)
	 * @generated
	 */
	boolean isSetAcknowledgement();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the license elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // LicenseType
