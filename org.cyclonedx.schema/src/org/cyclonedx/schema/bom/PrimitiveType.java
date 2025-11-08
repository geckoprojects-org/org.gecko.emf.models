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
 * A representation of the literals of the enumeration '<em><b>Primitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getPrimitiveType()
 * @model extendedMetaData="name='primitive_._type'"
 * @generated
 */
@ProviderType
public enum PrimitiveType implements Enumerator {
	/**
	 * The '<em><b>Drbg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Deterministic Random Bit Generator (DRBG) is a type of pseudorandom
	 *                                                 number generator designed to produce a sequence of bits from an initial
	 *                                                 seed value. DRBGs are commonly used in cryptographic applications where
	 *                                                 reproducibility of random values is important.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #DRBG_VALUE
	 * @generated
	 * @ordered
	 */
	DRBG(0, "drbg", "drbg"),

	/**
	 * The '<em><b>Mac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 In cryptography, a Message Authentication Code (MAC) is information
	 *                                                 used for authenticating and integrity-checking a message.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #MAC_VALUE
	 * @generated
	 * @ordered
	 */
	MAC(1, "mac", "mac"),

	/**
	 * The '<em><b>Block Cipher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A block cipher is a symmetric key algorithm that operates on fixed-size
	 *                                                 blocks of data. It encrypts or decrypts the data in block units,
	 *                                                 providing confidentiality. Block ciphers are widely used in various
	 *                                                 cryptographic modes and protocols for secure data transmission.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #BLOCK_CIPHER_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK_CIPHER(2, "blockCipher", "block-cipher"),

	/**
	 * The '<em><b>Stream Cipher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A stream cipher is a symmetric key cipher where plaintext digits are
	 *                                                 combined with a pseudorandom cipher digit stream (keystream).
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #STREAM_CIPHER_VALUE
	 * @generated
	 * @ordered
	 */
	STREAM_CIPHER(3, "streamCipher", "stream-cipher"),

	/**
	 * The '<em><b>Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 In cryptography, a signature is a digital representation of a message
	 *                                                 or data that proves its origin, identity, and integrity. Digital
	 *                                                 signatures are generated using cryptographic algorithms and are widely
	 *                                                 used for authentication and verification in secure communication.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(4, "signature", "signature"),

	/**
	 * The '<em><b>Hash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A hash function is a mathematical algorithm that takes an input
	 *                                                 (or 'message') and produces a fixed-size string of characters, which is
	 *                                                 typically a hash value. Hash functions are commonly used in various
	 *                                                 cryptographic applications, including data integrity verification and
	 *                                                 password hashing.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #HASH_VALUE
	 * @generated
	 * @ordered
	 */
	HASH(5, "hash", "hash"),

	/**
	 * The '<em><b>Pke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Public Key Encryption (PKE) is a type of encryption that uses a pair of
	 *                                                 public and private keys for secure communication. The public key is used
	 *                                                 for encryption, while the private key is used for decryption. PKE is a
	 *                                                 fundamental component of public-key cryptography.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKE_VALUE
	 * @generated
	 * @ordered
	 */
	PKE(6, "pke", "pke"),

	/**
	 * The '<em><b>Xof</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 An XOF is an extendable output function that can take arbitrary input
	 *                                                 and creates a stream of output, up to a limit determined by the size of
	 *                                                 the internal state of the hash function that underlies the XOF.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #XOF_VALUE
	 * @generated
	 * @ordered
	 */
	XOF(7, "xof", "xof"),

	/**
	 * The '<em><b>Kdf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A Key Derivation Function (KDF) derives key material from another source
	 *                                                 of entropy while preserving the entropy of the input.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #KDF_VALUE
	 * @generated
	 * @ordered
	 */
	KDF(8, "kdf", "kdf"),

	/**
	 * The '<em><b>Key Agree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 In cryptography, a key-agreement is a protocol whereby two or more
	 *                                                 parties agree on a cryptographic key in such a way that both influence
	 *                                                 the outcome.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #KEY_AGREE_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_AGREE(9, "keyAgree", "key-agree"),

	/**
	 * The '<em><b>Kem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A Key Encapsulation Mechanism (KEM) algorithm is a mechanism for
	 *                                                 transporting random keying material to a recipient using the recipient's
	 *                                                 public key.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #KEM_VALUE
	 * @generated
	 * @ordered
	 */
	KEM(10, "kem", "kem"),

	/**
	 * The '<em><b>Ae</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Authenticated Encryption (AE) is a cryptographic process that provides
	 *                                                 both confidentiality and data integrity. It ensures that the encrypted
	 *                                                 data has not been tampered with and comes from a legitimate source.
	 *                                                 AE is commonly used in secure communication protocols.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #AE_VALUE
	 * @generated
	 * @ordered
	 */
	AE(11, "ae", "ae"),

	/**
	 * The '<em><b>Combiner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A combiner aggregates many candidates for a cryptographic primitive and
	 *                                                 generates a new candidate for the same primitive.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #COMBINER_VALUE
	 * @generated
	 * @ordered
	 */
	COMBINER(12, "combiner", "combiner"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another primitive type.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(13, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The primitive is not known.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(14, "unknown", "unknown");

	/**
	 * The '<em><b>Drbg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Deterministic Random Bit Generator (DRBG) is a type of pseudorandom
	 *                                                 number generator designed to produce a sequence of bits from an initial
	 *                                                 seed value. DRBGs are commonly used in cryptographic applications where
	 *                                                 reproducibility of random values is important.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #DRBG
	 * @model name="drbg"
	 * @generated
	 * @ordered
	 */
	public static final int DRBG_VALUE = 0;

	/**
	 * The '<em><b>Mac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 In cryptography, a Message Authentication Code (MAC) is information
	 *                                                 used for authenticating and integrity-checking a message.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #MAC
	 * @model name="mac"
	 * @generated
	 * @ordered
	 */
	public static final int MAC_VALUE = 1;

	/**
	 * The '<em><b>Block Cipher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A block cipher is a symmetric key algorithm that operates on fixed-size
	 *                                                 blocks of data. It encrypts or decrypts the data in block units,
	 *                                                 providing confidentiality. Block ciphers are widely used in various
	 *                                                 cryptographic modes and protocols for secure data transmission.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #BLOCK_CIPHER
	 * @model name="blockCipher" literal="block-cipher"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_CIPHER_VALUE = 2;

	/**
	 * The '<em><b>Stream Cipher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A stream cipher is a symmetric key cipher where plaintext digits are
	 *                                                 combined with a pseudorandom cipher digit stream (keystream).
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #STREAM_CIPHER
	 * @model name="streamCipher" literal="stream-cipher"
	 * @generated
	 * @ordered
	 */
	public static final int STREAM_CIPHER_VALUE = 3;

	/**
	 * The '<em><b>Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 In cryptography, a signature is a digital representation of a message
	 *                                                 or data that proves its origin, identity, and integrity. Digital
	 *                                                 signatures are generated using cryptographic algorithms and are widely
	 *                                                 used for authentication and verification in secure communication.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SIGNATURE
	 * @model name="signature"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 4;

	/**
	 * The '<em><b>Hash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A hash function is a mathematical algorithm that takes an input
	 *                                                 (or 'message') and produces a fixed-size string of characters, which is
	 *                                                 typically a hash value. Hash functions are commonly used in various
	 *                                                 cryptographic applications, including data integrity verification and
	 *                                                 password hashing.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #HASH
	 * @model name="hash"
	 * @generated
	 * @ordered
	 */
	public static final int HASH_VALUE = 5;

	/**
	 * The '<em><b>Pke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Public Key Encryption (PKE) is a type of encryption that uses a pair of
	 *                                                 public and private keys for secure communication. The public key is used
	 *                                                 for encryption, while the private key is used for decryption. PKE is a
	 *                                                 fundamental component of public-key cryptography.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKE
	 * @model name="pke"
	 * @generated
	 * @ordered
	 */
	public static final int PKE_VALUE = 6;

	/**
	 * The '<em><b>Xof</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 An XOF is an extendable output function that can take arbitrary input
	 *                                                 and creates a stream of output, up to a limit determined by the size of
	 *                                                 the internal state of the hash function that underlies the XOF.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #XOF
	 * @model name="xof"
	 * @generated
	 * @ordered
	 */
	public static final int XOF_VALUE = 7;

	/**
	 * The '<em><b>Kdf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A Key Derivation Function (KDF) derives key material from another source
	 *                                                 of entropy while preserving the entropy of the input.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #KDF
	 * @model name="kdf"
	 * @generated
	 * @ordered
	 */
	public static final int KDF_VALUE = 8;

	/**
	 * The '<em><b>Key Agree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 In cryptography, a key-agreement is a protocol whereby two or more
	 *                                                 parties agree on a cryptographic key in such a way that both influence
	 *                                                 the outcome.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #KEY_AGREE
	 * @model name="keyAgree" literal="key-agree"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_AGREE_VALUE = 9;

	/**
	 * The '<em><b>Kem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A Key Encapsulation Mechanism (KEM) algorithm is a mechanism for
	 *                                                 transporting random keying material to a recipient using the recipient's
	 *                                                 public key.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #KEM
	 * @model name="kem"
	 * @generated
	 * @ordered
	 */
	public static final int KEM_VALUE = 10;

	/**
	 * The '<em><b>Ae</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Authenticated Encryption (AE) is a cryptographic process that provides
	 *                                                 both confidentiality and data integrity. It ensures that the encrypted
	 *                                                 data has not been tampered with and comes from a legitimate source.
	 *                                                 AE is commonly used in secure communication protocols.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #AE
	 * @model name="ae"
	 * @generated
	 * @ordered
	 */
	public static final int AE_VALUE = 11;

	/**
	 * The '<em><b>Combiner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A combiner aggregates many candidates for a cryptographic primitive and
	 *                                                 generates a new candidate for the same primitive.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #COMBINER
	 * @model name="combiner"
	 * @generated
	 * @ordered
	 */
	public static final int COMBINER_VALUE = 12;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another primitive type.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 13;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The primitive is not known.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 14;

	/**
	 * An array of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveType[] VALUES_ARRAY =
		new PrimitiveType[] {
			DRBG,
			MAC,
			BLOCK_CIPHER,
			STREAM_CIPHER,
			SIGNATURE,
			HASH,
			PKE,
			XOF,
			KDF,
			KEY_AGREE,
			KEM,
			AE,
			COMBINER,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveType get(int value) {
		switch (value) {
			case DRBG_VALUE: return DRBG;
			case MAC_VALUE: return MAC;
			case BLOCK_CIPHER_VALUE: return BLOCK_CIPHER;
			case STREAM_CIPHER_VALUE: return STREAM_CIPHER;
			case SIGNATURE_VALUE: return SIGNATURE;
			case HASH_VALUE: return HASH;
			case PKE_VALUE: return PKE;
			case XOF_VALUE: return XOF;
			case KDF_VALUE: return KDF;
			case KEY_AGREE_VALUE: return KEY_AGREE;
			case KEM_VALUE: return KEM;
			case AE_VALUE: return AE;
			case COMBINER_VALUE: return COMBINER;
			case OTHER_VALUE: return OTHER;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private PrimitiveType(int value, String name, String literal) {
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
	
} //PrimitiveType
