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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crypto Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Cryptographic assets have properties that uniquely define them and that make them actionable for
 *                 further reasoning. As an example, it makes a difference if one knows the algorithm family (e.g. AES)
 *                 or the specific variant or instantiation (e.g. AES-128-GCM). This is because the security level and the
 *                 algorithm primitive (authenticated encryption) is only defined by the definition of the algorithm variant.
 *                 The presence of a weak cryptographic algorithm like SHA1 vs. HMAC-SHA1 also makes a difference.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAlgorithmProperties <em>Algorithm Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getCertificateProperties <em>Certificate Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getRelatedCryptoMaterialProperties <em>Related Crypto Material Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getProtocolProperties <em>Protocol Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getOid <em>Oid</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoPropertiesType()
 * @model extendedMetaData="name='cryptoPropertiesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CryptoPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.AssetTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Cryptographic assets occur in several forms. Algorithms and protocols are most commonly
	 *                         implemented in specialized cryptographic libraries. They may however also be 'hardcoded'
	 *                         in software components. Certificates and related cryptographic material like keys, tokens,
	 *                         secrets or passwords are other cryptographic assets to be modelled.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.AssetTypeType
	 * @see #isSetAssetType()
	 * @see #unsetAssetType()
	 * @see #setAssetType(AssetTypeType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoPropertiesType_AssetType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='assetType' namespace='##targetNamespace'"
	 * @generated
	 */
	AssetTypeType getAssetType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.AssetTypeType
	 * @see #isSetAssetType()
	 * @see #unsetAssetType()
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(AssetTypeType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssetType()
	 * @see #getAssetType()
	 * @see #setAssetType(AssetTypeType)
	 * @generated
	 */
	void unsetAssetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAssetType <em>Asset Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Asset Type</em>' attribute is set.
	 * @see #unsetAssetType()
	 * @see #getAssetType()
	 * @see #setAssetType(AssetTypeType)
	 * @generated
	 */
	boolean isSetAssetType();

	/**
	 * Returns the value of the '<em><b>Algorithm Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Additional properties specific to a cryptographic algorithm.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm Properties</em>' containment reference.
	 * @see #setAlgorithmProperties(AlgorithmPropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoPropertiesType_AlgorithmProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='algorithmProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	AlgorithmPropertiesType getAlgorithmProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getAlgorithmProperties <em>Algorithm Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Properties</em>' containment reference.
	 * @see #getAlgorithmProperties()
	 * @generated
	 */
	void setAlgorithmProperties(AlgorithmPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Certificate Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Properties for cryptographic assets of asset type 'certificate'
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Properties</em>' containment reference.
	 * @see #setCertificateProperties(CertificatePropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoPropertiesType_CertificateProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certificateProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificatePropertiesType getCertificateProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getCertificateProperties <em>Certificate Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Properties</em>' containment reference.
	 * @see #getCertificateProperties()
	 * @generated
	 */
	void setCertificateProperties(CertificatePropertiesType value);

	/**
	 * Returns the value of the '<em><b>Related Crypto Material Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Properties for cryptographic assets of asset type 'relatedCryptoMaterial'
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Crypto Material Properties</em>' containment reference.
	 * @see #setRelatedCryptoMaterialProperties(RelatedCryptoMaterialPropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoPropertiesType_RelatedCryptoMaterialProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedCryptoMaterialProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedCryptoMaterialPropertiesType getRelatedCryptoMaterialProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getRelatedCryptoMaterialProperties <em>Related Crypto Material Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Crypto Material Properties</em>' containment reference.
	 * @see #getRelatedCryptoMaterialProperties()
	 * @generated
	 */
	void setRelatedCryptoMaterialProperties(RelatedCryptoMaterialPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Protocol Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Properties specific to cryptographic assets of type: 'protocol'.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Properties</em>' containment reference.
	 * @see #setProtocolProperties(ProtocolPropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoPropertiesType_ProtocolProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocolProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolPropertiesType getProtocolProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getProtocolProperties <em>Protocol Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Properties</em>' containment reference.
	 * @see #getProtocolProperties()
	 * @generated
	 */
	void setProtocolProperties(ProtocolPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The object identifier (OID) of the cryptographic asset.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoPropertiesType_Oid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='oid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOid();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CryptoPropertiesType#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(String value);

} // CryptoPropertiesType
