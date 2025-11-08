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
 * A representation of the literals of the enumeration '<em><b>Padding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getPaddingType()
 * @model extendedMetaData="name='padding_._type'"
 * @generated
 */
@ProviderType
public enum PaddingType implements Enumerator {
	/**
	 * The '<em><b>Pkcs5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Password-Based Cryptography Specification #5
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKCS5_VALUE
	 * @generated
	 * @ordered
	 */
	PKCS5(0, "pkcs5", "pkcs5"),

	/**
	 * The '<em><b>Pkcs7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Public Key Cryptography Standard: Cryptographic Message Syntax
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKCS7_VALUE
	 * @generated
	 * @ordered
	 */
	PKCS7(1, "pkcs7", "pkcs7"),

	/**
	 * The '<em><b>Pkcs1v15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Public Key Cryptography Standard: RSA Cryptography v1.5
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKCS1V15_VALUE
	 * @generated
	 * @ordered
	 */
	PKCS1V15(2, "pkcs1v15", "pkcs1v15"),

	/**
	 * The '<em><b>Oaep</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Optimal asymmetric encryption padding
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OAEP_VALUE
	 * @generated
	 * @ordered
	 */
	OAEP(3, "oaep", "oaep"),

	/**
	 * The '<em><b>Raw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Raw
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #RAW_VALUE
	 * @generated
	 * @ordered
	 */
	RAW(4, "raw", "raw"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another padding scheme
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The padding scheme is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(6, "unknown", "unknown");

	/**
	 * The '<em><b>Pkcs5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Password-Based Cryptography Specification #5
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKCS5
	 * @model name="pkcs5"
	 * @generated
	 * @ordered
	 */
	public static final int PKCS5_VALUE = 0;

	/**
	 * The '<em><b>Pkcs7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Public Key Cryptography Standard: Cryptographic Message Syntax
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKCS7
	 * @model name="pkcs7"
	 * @generated
	 * @ordered
	 */
	public static final int PKCS7_VALUE = 1;

	/**
	 * The '<em><b>Pkcs1v15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Public Key Cryptography Standard: RSA Cryptography v1.5
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #PKCS1V15
	 * @model name="pkcs1v15"
	 * @generated
	 * @ordered
	 */
	public static final int PKCS1V15_VALUE = 2;

	/**
	 * The '<em><b>Oaep</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Optimal asymmetric encryption padding
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OAEP
	 * @model name="oaep"
	 * @generated
	 * @ordered
	 */
	public static final int OAEP_VALUE = 3;

	/**
	 * The '<em><b>Raw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Raw
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #RAW
	 * @model name="raw"
	 * @generated
	 * @ordered
	 */
	public static final int RAW_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another padding scheme
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The padding scheme is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Padding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaddingType[] VALUES_ARRAY =
		new PaddingType[] {
			PKCS5,
			PKCS7,
			PKCS1V15,
			OAEP,
			RAW,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Padding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PaddingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Padding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaddingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaddingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Padding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaddingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaddingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Padding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaddingType get(int value) {
		switch (value) {
			case PKCS5_VALUE: return PKCS5;
			case PKCS7_VALUE: return PKCS7;
			case PKCS1V15_VALUE: return PKCS1V15;
			case OAEP_VALUE: return OAEP;
			case RAW_VALUE: return RAW;
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
	private PaddingType(int value, String name, String literal) {
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
	
} //PaddingType
