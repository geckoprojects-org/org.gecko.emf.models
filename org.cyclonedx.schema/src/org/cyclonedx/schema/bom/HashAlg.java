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
 * A representation of the literals of the enumeration '<em><b>Hash Alg</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getHashAlg()
 * @model extendedMetaData="name='hashAlg'"
 * @generated
 */
@ProviderType
public enum HashAlg implements Enumerator {
	/**
	 * The '<em><b>MD5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MD5_VALUE
	 * @generated
	 * @ordered
	 */
	MD5(0, "MD5", "MD5"),

	/**
	 * The '<em><b>SHA1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA1_VALUE
	 * @generated
	 * @ordered
	 */
	SHA1(1, "SHA1", "SHA-1"),

	/**
	 * The '<em><b>SHA256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA256_VALUE
	 * @generated
	 * @ordered
	 */
	SHA256(2, "SHA256", "SHA-256"),

	/**
	 * The '<em><b>SHA384</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA384_VALUE
	 * @generated
	 * @ordered
	 */
	SHA384(3, "SHA384", "SHA-384"),

	/**
	 * The '<em><b>SHA512</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA512_VALUE
	 * @generated
	 * @ordered
	 */
	SHA512(4, "SHA512", "SHA-512"),

	/**
	 * The '<em><b>SHA3256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA3256_VALUE
	 * @generated
	 * @ordered
	 */
	SHA3256(5, "SHA3256", "SHA3-256"),

	/**
	 * The '<em><b>SHA3384</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA3384_VALUE
	 * @generated
	 * @ordered
	 */
	SHA3384(6, "SHA3384", "SHA3-384"),

	/**
	 * The '<em><b>SHA3512</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA3512_VALUE
	 * @generated
	 * @ordered
	 */
	SHA3512(7, "SHA3512", "SHA3-512"),

	/**
	 * The '<em><b>BLAKE 2b256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE_2B256_VALUE
	 * @generated
	 * @ordered
	 */
	BLAKE_2B256(8, "BLAKE2b256", "BLAKE2b-256"),

	/**
	 * The '<em><b>BLAKE 2b384</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE_2B384_VALUE
	 * @generated
	 * @ordered
	 */
	BLAKE_2B384(9, "BLAKE2b384", "BLAKE2b-384"),

	/**
	 * The '<em><b>BLAKE 2b512</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE_2B512_VALUE
	 * @generated
	 * @ordered
	 */
	BLAKE_2B512(10, "BLAKE2b512", "BLAKE2b-512"),

	/**
	 * The '<em><b>BLAKE3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE3_VALUE
	 * @generated
	 * @ordered
	 */
	BLAKE3(11, "BLAKE3", "BLAKE3");

	/**
	 * The '<em><b>MD5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MD5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MD5_VALUE = 0;

	/**
	 * The '<em><b>SHA1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA1
	 * @model literal="SHA-1"
	 * @generated
	 * @ordered
	 */
	public static final int SHA1_VALUE = 1;

	/**
	 * The '<em><b>SHA256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA256
	 * @model literal="SHA-256"
	 * @generated
	 * @ordered
	 */
	public static final int SHA256_VALUE = 2;

	/**
	 * The '<em><b>SHA384</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA384
	 * @model literal="SHA-384"
	 * @generated
	 * @ordered
	 */
	public static final int SHA384_VALUE = 3;

	/**
	 * The '<em><b>SHA512</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA512
	 * @model literal="SHA-512"
	 * @generated
	 * @ordered
	 */
	public static final int SHA512_VALUE = 4;

	/**
	 * The '<em><b>SHA3256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA3256
	 * @model literal="SHA3-256"
	 * @generated
	 * @ordered
	 */
	public static final int SHA3256_VALUE = 5;

	/**
	 * The '<em><b>SHA3384</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA3384
	 * @model literal="SHA3-384"
	 * @generated
	 * @ordered
	 */
	public static final int SHA3384_VALUE = 6;

	/**
	 * The '<em><b>SHA3512</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA3512
	 * @model literal="SHA3-512"
	 * @generated
	 * @ordered
	 */
	public static final int SHA3512_VALUE = 7;

	/**
	 * The '<em><b>BLAKE 2b256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE_2B256
	 * @model name="BLAKE2b256" literal="BLAKE2b-256"
	 * @generated
	 * @ordered
	 */
	public static final int BLAKE_2B256_VALUE = 8;

	/**
	 * The '<em><b>BLAKE 2b384</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE_2B384
	 * @model name="BLAKE2b384" literal="BLAKE2b-384"
	 * @generated
	 * @ordered
	 */
	public static final int BLAKE_2B384_VALUE = 9;

	/**
	 * The '<em><b>BLAKE 2b512</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE_2B512
	 * @model name="BLAKE2b512" literal="BLAKE2b-512"
	 * @generated
	 * @ordered
	 */
	public static final int BLAKE_2B512_VALUE = 10;

	/**
	 * The '<em><b>BLAKE3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAKE3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLAKE3_VALUE = 11;

	/**
	 * An array of all the '<em><b>Hash Alg</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HashAlg[] VALUES_ARRAY =
		new HashAlg[] {
			MD5,
			SHA1,
			SHA256,
			SHA384,
			SHA512,
			SHA3256,
			SHA3384,
			SHA3512,
			BLAKE_2B256,
			BLAKE_2B384,
			BLAKE_2B512,
			BLAKE3,
		};

	/**
	 * A public read-only list of all the '<em><b>Hash Alg</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HashAlg> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hash Alg</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HashAlg get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HashAlg result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hash Alg</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HashAlg getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HashAlg result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hash Alg</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HashAlg get(int value) {
		switch (value) {
			case MD5_VALUE: return MD5;
			case SHA1_VALUE: return SHA1;
			case SHA256_VALUE: return SHA256;
			case SHA384_VALUE: return SHA384;
			case SHA512_VALUE: return SHA512;
			case SHA3256_VALUE: return SHA3256;
			case SHA3384_VALUE: return SHA3384;
			case SHA3512_VALUE: return SHA3512;
			case BLAKE_2B256_VALUE: return BLAKE_2B256;
			case BLAKE_2B384_VALUE: return BLAKE_2B384;
			case BLAKE_2B512_VALUE: return BLAKE_2B512;
			case BLAKE3_VALUE: return BLAKE3;
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
	private HashAlg(int value, String name, String literal) {
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
	
} //HashAlg
