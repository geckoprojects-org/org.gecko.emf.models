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
 * A representation of the literals of the enumeration '<em><b>Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getTypeType1()
 * @model extendedMetaData="name='type_._1_._type'"
 * @generated
 */
@ProviderType
public enum TypeType1 implements Enumerator {
	/**
	 * The '<em><b>Private Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE_KEY(0, "privateKey", "private-key"),

	/**
	 * The '<em><b>Public Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_KEY(1, "publicKey", "public-key"),

	/**
	 * The '<em><b>Secret Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	SECRET_KEY(2, "secretKey", "secret-key"),

	/**
	 * The '<em><b>Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_VALUE
	 * @generated
	 * @ordered
	 */
	KEY(3, "key", "key"),

	/**
	 * The '<em><b>Ciphertext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIPHERTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	CIPHERTEXT(4, "ciphertext", "ciphertext"),

	/**
	 * The '<em><b>Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(5, "signature", "signature"),

	/**
	 * The '<em><b>Digest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGEST_VALUE
	 * @generated
	 * @ordered
	 */
	DIGEST(6, "digest", "digest"),

	/**
	 * The '<em><b>Initialization Vector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZATION_VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALIZATION_VECTOR(7, "initializationVector", "initialization-vector"),

	/**
	 * The '<em><b>Nonce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONCE_VALUE
	 * @generated
	 * @ordered
	 */
	NONCE(8, "nonce", "nonce"),

	/**
	 * The '<em><b>Seed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEED_VALUE
	 * @generated
	 * @ordered
	 */
	SEED(9, "seed", "seed"),

	/**
	 * The '<em><b>Salt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALT_VALUE
	 * @generated
	 * @ordered
	 */
	SALT(10, "salt", "salt"),

	/**
	 * The '<em><b>Shared Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_SECRET_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED_SECRET(11, "sharedSecret", "shared-secret"),

	/**
	 * The '<em><b>Tag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG_VALUE
	 * @generated
	 * @ordered
	 */
	TAG(12, "tag", "tag"),

	/**
	 * The '<em><b>Additional Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL_DATA(13, "additionalData", "additional-data"),

	/**
	 * The '<em><b>Password</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	PASSWORD(14, "password", "password"),

	/**
	 * The '<em><b>Credential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	CREDENTIAL(15, "credential", "credential"),

	/**
	 * The '<em><b>Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN(16, "token", "token"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(17, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(18, "unknown", "unknown");

	/**
	 * The '<em><b>Private Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_KEY
	 * @model name="privateKey" literal="private-key"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_KEY_VALUE = 0;

	/**
	 * The '<em><b>Public Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_KEY
	 * @model name="publicKey" literal="public-key"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_KEY_VALUE = 1;

	/**
	 * The '<em><b>Secret Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_KEY
	 * @model name="secretKey" literal="secret-key"
	 * @generated
	 * @ordered
	 */
	public static final int SECRET_KEY_VALUE = 2;

	/**
	 * The '<em><b>Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY
	 * @model name="key"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_VALUE = 3;

	/**
	 * The '<em><b>Ciphertext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIPHERTEXT
	 * @model name="ciphertext"
	 * @generated
	 * @ordered
	 */
	public static final int CIPHERTEXT_VALUE = 4;

	/**
	 * The '<em><b>Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE
	 * @model name="signature"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 5;

	/**
	 * The '<em><b>Digest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGEST
	 * @model name="digest"
	 * @generated
	 * @ordered
	 */
	public static final int DIGEST_VALUE = 6;

	/**
	 * The '<em><b>Initialization Vector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZATION_VECTOR
	 * @model name="initializationVector" literal="initialization-vector"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZATION_VECTOR_VALUE = 7;

	/**
	 * The '<em><b>Nonce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONCE
	 * @model name="nonce"
	 * @generated
	 * @ordered
	 */
	public static final int NONCE_VALUE = 8;

	/**
	 * The '<em><b>Seed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEED
	 * @model name="seed"
	 * @generated
	 * @ordered
	 */
	public static final int SEED_VALUE = 9;

	/**
	 * The '<em><b>Salt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALT
	 * @model name="salt"
	 * @generated
	 * @ordered
	 */
	public static final int SALT_VALUE = 10;

	/**
	 * The '<em><b>Shared Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_SECRET
	 * @model name="sharedSecret" literal="shared-secret"
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_SECRET_VALUE = 11;

	/**
	 * The '<em><b>Tag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG
	 * @model name="tag"
	 * @generated
	 * @ordered
	 */
	public static final int TAG_VALUE = 12;

	/**
	 * The '<em><b>Additional Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_DATA
	 * @model name="additionalData" literal="additional-data"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_DATA_VALUE = 13;

	/**
	 * The '<em><b>Password</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSWORD
	 * @model name="password"
	 * @generated
	 * @ordered
	 */
	public static final int PASSWORD_VALUE = 14;

	/**
	 * The '<em><b>Credential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDENTIAL
	 * @model name="credential"
	 * @generated
	 * @ordered
	 */
	public static final int CREDENTIAL_VALUE = 15;

	/**
	 * The '<em><b>Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN
	 * @model name="token"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_VALUE = 16;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 17;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 18;

	/**
	 * An array of all the '<em><b>Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType1[] VALUES_ARRAY =
		new TypeType1[] {
			PRIVATE_KEY,
			PUBLIC_KEY,
			SECRET_KEY,
			KEY,
			CIPHERTEXT,
			SIGNATURE,
			DIGEST,
			INITIALIZATION_VECTOR,
			NONCE,
			SEED,
			SALT,
			SHARED_SECRET,
			TAG,
			ADDITIONAL_DATA,
			PASSWORD,
			CREDENTIAL,
			TOKEN,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType1 get(int value) {
		switch (value) {
			case PRIVATE_KEY_VALUE: return PRIVATE_KEY;
			case PUBLIC_KEY_VALUE: return PUBLIC_KEY;
			case SECRET_KEY_VALUE: return SECRET_KEY;
			case KEY_VALUE: return KEY;
			case CIPHERTEXT_VALUE: return CIPHERTEXT;
			case SIGNATURE_VALUE: return SIGNATURE;
			case DIGEST_VALUE: return DIGEST;
			case INITIALIZATION_VECTOR_VALUE: return INITIALIZATION_VECTOR;
			case NONCE_VALUE: return NONCE;
			case SEED_VALUE: return SEED;
			case SALT_VALUE: return SALT;
			case SHARED_SECRET_VALUE: return SHARED_SECRET;
			case TAG_VALUE: return TAG;
			case ADDITIONAL_DATA_VALUE: return ADDITIONAL_DATA;
			case PASSWORD_VALUE: return PASSWORD;
			case CREDENTIAL_VALUE: return CREDENTIAL;
			case TOKEN_VALUE: return TOKEN;
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
	private TypeType1(int value, String name, String literal) {
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
	
} //TypeType1
