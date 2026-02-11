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
 * A representation of the literals of the enumeration '<em><b>Units Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getUnitsType1()
 * @model extendedMetaData="name='units_._1_._type'"
 * @generated
 */
@ProviderType
public enum UnitsType1 implements Enumerator {
	/**
	 * The '<em><b>Calspair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALSPAIR_VALUE
	 * @generated
	 * @ordered
	 */
	CALSPAIR(0, "calspair", "calspair"),

	/**
	 * The '<em><b>Linecolumn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINECOLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	LINECOLUMN(1, "linecolumn", "linecolumn"),

	/**
	 * The '<em><b>Linecolumnpair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINECOLUMNPAIR_VALUE
	 * @generated
	 * @ordered
	 */
	LINECOLUMNPAIR(2, "linecolumnpair", "linecolumnpair"),

	/**
	 * The '<em><b>Linerange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINERANGE_VALUE
	 * @generated
	 * @ordered
	 */
	LINERANGE(3, "linerange", "linerange"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other");

	/**
	 * The '<em><b>Calspair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALSPAIR
	 * @model name="calspair"
	 * @generated
	 * @ordered
	 */
	public static final int CALSPAIR_VALUE = 0;

	/**
	 * The '<em><b>Linecolumn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINECOLUMN
	 * @model name="linecolumn"
	 * @generated
	 * @ordered
	 */
	public static final int LINECOLUMN_VALUE = 1;

	/**
	 * The '<em><b>Linecolumnpair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINECOLUMNPAIR
	 * @model name="linecolumnpair"
	 * @generated
	 * @ordered
	 */
	public static final int LINECOLUMNPAIR_VALUE = 2;

	/**
	 * The '<em><b>Linerange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINERANGE
	 * @model name="linerange"
	 * @generated
	 * @ordered
	 */
	public static final int LINERANGE_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Units Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsType1[] VALUES_ARRAY =
		new UnitsType1[] {
			CALSPAIR,
			LINECOLUMN,
			LINECOLUMNPAIR,
			LINERANGE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsType1 get(int value) {
		switch (value) {
			case CALSPAIR_VALUE: return CALSPAIR;
			case LINECOLUMN_VALUE: return LINECOLUMN;
			case LINECOLUMNPAIR_VALUE: return LINECOLUMNPAIR;
			case LINERANGE_VALUE: return LINERANGE;
			case OTHER_VALUE: return OTHER;
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
	private UnitsType1(int value, String name, String literal) {
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
	
} //UnitsType1
