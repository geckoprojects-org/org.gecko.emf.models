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
 * A representation of the literals of the enumeration '<em><b>Implementation Platform Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getImplementationPlatformType()
 * @model extendedMetaData="name='implementationPlatform_._type'"
 * @generated
 */
@ProviderType
public enum ImplementationPlatformType implements Enumerator {
	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(0, "generic", "generic"),

	/**
	 * The '<em><b>X8632</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X8632_VALUE
	 * @generated
	 * @ordered
	 */
	X8632(1, "x8632", "x86_32"),

	/**
	 * The '<em><b>X8664</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X8664_VALUE
	 * @generated
	 * @ordered
	 */
	X8664(2, "x8664", "x86_64"),

	/**
	 * The '<em><b>Armv7 A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV7_A_VALUE
	 * @generated
	 * @ordered
	 */
	ARMV7_A(3, "armv7A", "armv7-a"),

	/**
	 * The '<em><b>Armv7 M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV7_M_VALUE
	 * @generated
	 * @ordered
	 */
	ARMV7_M(4, "armv7M", "armv7-m"),

	/**
	 * The '<em><b>Armv8 A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV8_A_VALUE
	 * @generated
	 * @ordered
	 */
	ARMV8_A(5, "armv8A", "armv8-a"),

	/**
	 * The '<em><b>Armv8 M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV8_M_VALUE
	 * @generated
	 * @ordered
	 */
	ARMV8_M(6, "armv8M", "armv8-m"),

	/**
	 * The '<em><b>Armv9 A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV9_A_VALUE
	 * @generated
	 * @ordered
	 */
	ARMV9_A(7, "armv9A", "armv9-a"),

	/**
	 * The '<em><b>Armv9 M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV9_M_VALUE
	 * @generated
	 * @ordered
	 */
	ARMV9_M(8, "armv9M", "armv9-m"),

	/**
	 * The '<em><b>S39 0x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S390X_VALUE
	 * @generated
	 * @ordered
	 */
	S390X(9, "s390x", "s390x"),

	/**
	 * The '<em><b>Ppc64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPC64_VALUE
	 * @generated
	 * @ordered
	 */
	PPC64(10, "ppc64", "ppc64"),

	/**
	 * The '<em><b>Ppc64le</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPC64LE_VALUE
	 * @generated
	 * @ordered
	 */
	PPC64LE(11, "ppc64le", "ppc64le"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(12, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(13, "unknown", "unknown");

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="generic"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 0;

	/**
	 * The '<em><b>X8632</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X8632
	 * @model name="x8632" literal="x86_32"
	 * @generated
	 * @ordered
	 */
	public static final int X8632_VALUE = 1;

	/**
	 * The '<em><b>X8664</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X8664
	 * @model name="x8664" literal="x86_64"
	 * @generated
	 * @ordered
	 */
	public static final int X8664_VALUE = 2;

	/**
	 * The '<em><b>Armv7 A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV7_A
	 * @model name="armv7A" literal="armv7-a"
	 * @generated
	 * @ordered
	 */
	public static final int ARMV7_A_VALUE = 3;

	/**
	 * The '<em><b>Armv7 M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV7_M
	 * @model name="armv7M" literal="armv7-m"
	 * @generated
	 * @ordered
	 */
	public static final int ARMV7_M_VALUE = 4;

	/**
	 * The '<em><b>Armv8 A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV8_A
	 * @model name="armv8A" literal="armv8-a"
	 * @generated
	 * @ordered
	 */
	public static final int ARMV8_A_VALUE = 5;

	/**
	 * The '<em><b>Armv8 M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV8_M
	 * @model name="armv8M" literal="armv8-m"
	 * @generated
	 * @ordered
	 */
	public static final int ARMV8_M_VALUE = 6;

	/**
	 * The '<em><b>Armv9 A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV9_A
	 * @model name="armv9A" literal="armv9-a"
	 * @generated
	 * @ordered
	 */
	public static final int ARMV9_A_VALUE = 7;

	/**
	 * The '<em><b>Armv9 M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMV9_M
	 * @model name="armv9M" literal="armv9-m"
	 * @generated
	 * @ordered
	 */
	public static final int ARMV9_M_VALUE = 8;

	/**
	 * The '<em><b>S39 0x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S390X
	 * @model name="s390x"
	 * @generated
	 * @ordered
	 */
	public static final int S390X_VALUE = 9;

	/**
	 * The '<em><b>Ppc64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPC64
	 * @model name="ppc64"
	 * @generated
	 * @ordered
	 */
	public static final int PPC64_VALUE = 10;

	/**
	 * The '<em><b>Ppc64le</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPC64LE
	 * @model name="ppc64le"
	 * @generated
	 * @ordered
	 */
	public static final int PPC64LE_VALUE = 11;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 12;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 13;

	/**
	 * An array of all the '<em><b>Implementation Platform Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImplementationPlatformType[] VALUES_ARRAY =
		new ImplementationPlatformType[] {
			GENERIC,
			X8632,
			X8664,
			ARMV7_A,
			ARMV7_M,
			ARMV8_A,
			ARMV8_M,
			ARMV9_A,
			ARMV9_M,
			S390X,
			PPC64,
			PPC64LE,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Implementation Platform Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImplementationPlatformType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Implementation Platform Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImplementationPlatformType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImplementationPlatformType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Implementation Platform Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImplementationPlatformType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImplementationPlatformType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Implementation Platform Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImplementationPlatformType get(int value) {
		switch (value) {
			case GENERIC_VALUE: return GENERIC;
			case X8632_VALUE: return X8632;
			case X8664_VALUE: return X8664;
			case ARMV7_A_VALUE: return ARMV7_A;
			case ARMV7_M_VALUE: return ARMV7_M;
			case ARMV8_A_VALUE: return ARMV8_A;
			case ARMV8_M_VALUE: return ARMV8_M;
			case ARMV9_A_VALUE: return ARMV9_A;
			case ARMV9_M_VALUE: return ARMV9_M;
			case S390X_VALUE: return S390X;
			case PPC64_VALUE: return PPC64;
			case PPC64LE_VALUE: return PPC64LE;
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
	private ImplementationPlatformType(int value, String name, String literal) {
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
	
} //ImplementationPlatformType
