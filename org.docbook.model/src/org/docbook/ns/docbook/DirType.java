/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dir Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getDirType()
 * @model extendedMetaData="name='dir_._type'"
 * @generated
 */
@ProviderType
public enum DirType implements Enumerator {
	/**
	 * The '<em><b>Ltr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTR_VALUE
	 * @generated
	 * @ordered
	 */
	LTR(0, "ltr", "ltr"),

	/**
	 * The '<em><b>Rtl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTL_VALUE
	 * @generated
	 * @ordered
	 */
	RTL(1, "rtl", "rtl"),

	/**
	 * The '<em><b>Lro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LRO_VALUE
	 * @generated
	 * @ordered
	 */
	LRO(2, "lro", "lro"),

	/**
	 * The '<em><b>Rlo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RLO_VALUE
	 * @generated
	 * @ordered
	 */
	RLO(3, "rlo", "rlo");

	/**
	 * The '<em><b>Ltr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTR
	 * @model name="ltr"
	 * @generated
	 * @ordered
	 */
	public static final int LTR_VALUE = 0;

	/**
	 * The '<em><b>Rtl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTL
	 * @model name="rtl"
	 * @generated
	 * @ordered
	 */
	public static final int RTL_VALUE = 1;

	/**
	 * The '<em><b>Lro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LRO
	 * @model name="lro"
	 * @generated
	 * @ordered
	 */
	public static final int LRO_VALUE = 2;

	/**
	 * The '<em><b>Rlo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RLO
	 * @model name="rlo"
	 * @generated
	 * @ordered
	 */
	public static final int RLO_VALUE = 3;

	/**
	 * An array of all the '<em><b>Dir Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DirType[] VALUES_ARRAY =
		new DirType[] {
			LTR,
			RTL,
			LRO,
			RLO,
		};

	/**
	 * A public read-only list of all the '<em><b>Dir Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DirType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dir Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dir Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dir Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirType get(int value) {
		switch (value) {
			case LTR_VALUE: return LTR;
			case RTL_VALUE: return RTL;
			case LRO_VALUE: return LRO;
			case RLO_VALUE: return RLO;
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
	private DirType(int value, String name, String literal) {
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
	
} //DirType
