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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Asset Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getAssetTypeType()
 * @model extendedMetaData="name='assetType_._type'"
 * @generated
 */
@ProviderType
public enum AssetTypeType implements Enumerator {
	/**
	 * The '<em><b>Algorithm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Mathematical function commonly used for data encryption, authentication, and
	 *                                     digital signatures.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #ALGORITHM_VALUE
	 * @generated
	 * @ordered
	 */
	ALGORITHM(0, "algorithm", "algorithm"),

	/**
	 * The '<em><b>Certificate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     An electronic document that is used to provide the identity or validate a public key.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #CERTIFICATE_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATE(1, "certificate", "certificate"),

	/**
	 * The '<em><b>Protocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     A set of rules and guidelines that govern the behavior and communication with each other.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL(2, "protocol", "protocol"),

	/**
	 * The '<em><b>Related Crypto Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Other cryptographic assets that are related to algorithms, certificate, and protocols
	 *                                     such as keys and tokens.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #RELATED_CRYPTO_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_CRYPTO_MATERIAL(3, "relatedCryptoMaterial", "related-crypto-material");

	/**
	 * The '<em><b>Algorithm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Mathematical function commonly used for data encryption, authentication, and
	 *                                     digital signatures.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #ALGORITHM
	 * @model name="algorithm"
	 * @generated
	 * @ordered
	 */
	public static final int ALGORITHM_VALUE = 0;

	/**
	 * The '<em><b>Certificate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     An electronic document that is used to provide the identity or validate a public key.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #CERTIFICATE
	 * @model name="certificate"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATE_VALUE = 1;

	/**
	 * The '<em><b>Protocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     A set of rules and guidelines that govern the behavior and communication with each other.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #PROTOCOL
	 * @model name="protocol"
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_VALUE = 2;

	/**
	 * The '<em><b>Related Crypto Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Other cryptographic assets that are related to algorithms, certificate, and protocols
	 *                                     such as keys and tokens.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #RELATED_CRYPTO_MATERIAL
	 * @model name="relatedCryptoMaterial" literal="related-crypto-material"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_CRYPTO_MATERIAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Asset Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssetTypeType[] VALUES_ARRAY =
		new AssetTypeType[] {
			ALGORITHM,
			CERTIFICATE,
			PROTOCOL,
			RELATED_CRYPTO_MATERIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Asset Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssetTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Asset Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetTypeType get(int value) {
		switch (value) {
			case ALGORITHM_VALUE: return ALGORITHM;
			case CERTIFICATE_VALUE: return CERTIFICATE;
			case PROTOCOL_VALUE: return PROTOCOL;
			case RELATED_CRYPTO_MATERIAL_VALUE: return RELATED_CRYPTO_MATERIAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssetTypeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AssetTypeType
