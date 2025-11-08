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
 * A representation of the literals of the enumeration '<em><b>Crypto Function Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getCryptoFunctionType()
 * @model extendedMetaData="name='cryptoFunction_._type'"
 * @generated
 */
@ProviderType
public enum CryptoFunctionType implements Enumerator {
	/**
	 * The '<em><b>Generate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATE(0, "generate", "generate"),

	/**
	 * The '<em><b>Keygen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYGEN_VALUE
	 * @generated
	 * @ordered
	 */
	KEYGEN(1, "keygen", "keygen"),

	/**
	 * The '<em><b>Encrypt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPT_VALUE
	 * @generated
	 * @ordered
	 */
	ENCRYPT(2, "encrypt", "encrypt"),

	/**
	 * The '<em><b>Decrypt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECRYPT_VALUE
	 * @generated
	 * @ordered
	 */
	DECRYPT(3, "decrypt", "decrypt"),

	/**
	 * The '<em><b>Digest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGEST_VALUE
	 * @generated
	 * @ordered
	 */
	DIGEST(4, "digest", "digest"),

	/**
	 * The '<em><b>Tag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG_VALUE
	 * @generated
	 * @ordered
	 */
	TAG(5, "tag", "tag"),

	/**
	 * The '<em><b>Keyderive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYDERIVE_VALUE
	 * @generated
	 * @ordered
	 */
	KEYDERIVE(6, "keyderive", "keyderive"),

	/**
	 * The '<em><b>Sign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN_VALUE
	 * @generated
	 * @ordered
	 */
	SIGN(7, "sign", "sign"),

	/**
	 * The '<em><b>Verify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFY_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFY(8, "verify", "verify"),

	/**
	 * The '<em><b>Encapsulate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCAPSULATE_VALUE
	 * @generated
	 * @ordered
	 */
	ENCAPSULATE(9, "encapsulate", "encapsulate"),

	/**
	 * The '<em><b>Decapsulate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECAPSULATE_VALUE
	 * @generated
	 * @ordered
	 */
	DECAPSULATE(10, "decapsulate", "decapsulate"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(11, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(12, "unknown", "unknown");

	/**
	 * The '<em><b>Generate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATE
	 * @model name="generate"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_VALUE = 0;

	/**
	 * The '<em><b>Keygen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYGEN
	 * @model name="keygen"
	 * @generated
	 * @ordered
	 */
	public static final int KEYGEN_VALUE = 1;

	/**
	 * The '<em><b>Encrypt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPT
	 * @model name="encrypt"
	 * @generated
	 * @ordered
	 */
	public static final int ENCRYPT_VALUE = 2;

	/**
	 * The '<em><b>Decrypt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECRYPT
	 * @model name="decrypt"
	 * @generated
	 * @ordered
	 */
	public static final int DECRYPT_VALUE = 3;

	/**
	 * The '<em><b>Digest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGEST
	 * @model name="digest"
	 * @generated
	 * @ordered
	 */
	public static final int DIGEST_VALUE = 4;

	/**
	 * The '<em><b>Tag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG
	 * @model name="tag"
	 * @generated
	 * @ordered
	 */
	public static final int TAG_VALUE = 5;

	/**
	 * The '<em><b>Keyderive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYDERIVE
	 * @model name="keyderive"
	 * @generated
	 * @ordered
	 */
	public static final int KEYDERIVE_VALUE = 6;

	/**
	 * The '<em><b>Sign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN
	 * @model name="sign"
	 * @generated
	 * @ordered
	 */
	public static final int SIGN_VALUE = 7;

	/**
	 * The '<em><b>Verify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFY
	 * @model name="verify"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFY_VALUE = 8;

	/**
	 * The '<em><b>Encapsulate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCAPSULATE
	 * @model name="encapsulate"
	 * @generated
	 * @ordered
	 */
	public static final int ENCAPSULATE_VALUE = 9;

	/**
	 * The '<em><b>Decapsulate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECAPSULATE
	 * @model name="decapsulate"
	 * @generated
	 * @ordered
	 */
	public static final int DECAPSULATE_VALUE = 10;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 11;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 12;

	/**
	 * An array of all the '<em><b>Crypto Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CryptoFunctionType[] VALUES_ARRAY =
		new CryptoFunctionType[] {
			GENERATE,
			KEYGEN,
			ENCRYPT,
			DECRYPT,
			DIGEST,
			TAG,
			KEYDERIVE,
			SIGN,
			VERIFY,
			ENCAPSULATE,
			DECAPSULATE,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Crypto Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CryptoFunctionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Crypto Function Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoFunctionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CryptoFunctionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crypto Function Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoFunctionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CryptoFunctionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crypto Function Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoFunctionType get(int value) {
		switch (value) {
			case GENERATE_VALUE: return GENERATE;
			case KEYGEN_VALUE: return KEYGEN;
			case ENCRYPT_VALUE: return ENCRYPT;
			case DECRYPT_VALUE: return DECRYPT;
			case DIGEST_VALUE: return DIGEST;
			case TAG_VALUE: return TAG;
			case KEYDERIVE_VALUE: return KEYDERIVE;
			case SIGN_VALUE: return SIGN;
			case VERIFY_VALUE: return VERIFY;
			case ENCAPSULATE_VALUE: return ENCAPSULATE;
			case DECAPSULATE_VALUE: return DECAPSULATE;
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
	private CryptoFunctionType(int value, String name, String literal) {
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
	
} //CryptoFunctionType
