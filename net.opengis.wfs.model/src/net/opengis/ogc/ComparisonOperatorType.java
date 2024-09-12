/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.ogc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparison Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.ogc.OGCPackage#getComparisonOperatorType()
 * @model extendedMetaData="name='ComparisonOperatorType'"
 * @generated
 */
@ProviderType
public enum ComparisonOperatorType implements Enumerator {
	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(0, "LessThan", "LessThan"),

	/**
	 * The '<em><b>Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(1, "GreaterThan", "GreaterThan"),

	/**
	 * The '<em><b>Less Than Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_EQUAL_TO(2, "LessThanEqualTo", "LessThanEqualTo"),

	/**
	 * The '<em><b>Greater Than Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_EQUAL_TO(3, "GreaterThanEqualTo", "GreaterThanEqualTo"),

	/**
	 * The '<em><b>Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_TO(4, "EqualTo", "EqualTo"),

	/**
	 * The '<em><b>Not Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL_TO(5, "NotEqualTo", "NotEqualTo"),

	/**
	 * The '<em><b>Like</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE_VALUE
	 * @generated
	 * @ordered
	 */
	LIKE(6, "Like", "Like"),

	/**
	 * The '<em><b>Between</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN_VALUE
	 * @generated
	 * @ordered
	 */
	BETWEEN(7, "Between", "Between"),

	/**
	 * The '<em><b>Null Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	NULL_CHECK(8, "NullCheck", "NullCheck");

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model name="LessThan"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model name="GreaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 1;

	/**
	 * The '<em><b>Less Than Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_EQUAL_TO
	 * @model name="LessThanEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_EQUAL_TO_VALUE = 2;

	/**
	 * The '<em><b>Greater Than Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUAL_TO
	 * @model name="GreaterThanEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_EQUAL_TO_VALUE = 3;

	/**
	 * The '<em><b>Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO
	 * @model name="EqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_TO_VALUE = 4;

	/**
	 * The '<em><b>Not Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_TO
	 * @model name="NotEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_TO_VALUE = 5;

	/**
	 * The '<em><b>Like</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE
	 * @model name="Like"
	 * @generated
	 * @ordered
	 */
	public static final int LIKE_VALUE = 6;

	/**
	 * The '<em><b>Between</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN
	 * @model name="Between"
	 * @generated
	 * @ordered
	 */
	public static final int BETWEEN_VALUE = 7;

	/**
	 * The '<em><b>Null Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_CHECK
	 * @model name="NullCheck"
	 * @generated
	 * @ordered
	 */
	public static final int NULL_CHECK_VALUE = 8;

	/**
	 * An array of all the '<em><b>Comparison Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparisonOperatorType[] VALUES_ARRAY =
		new ComparisonOperatorType[] {
			LESS_THAN,
			GREATER_THAN,
			LESS_THAN_EQUAL_TO,
			GREATER_THAN_EQUAL_TO,
			EQUAL_TO,
			NOT_EQUAL_TO,
			LIKE,
			BETWEEN,
			NULL_CHECK,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparison Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComparisonOperatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparison Operator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonOperatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonOperatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Operator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonOperatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonOperatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Operator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonOperatorType get(int value) {
		switch (value) {
			case LESS_THAN_VALUE: return LESS_THAN;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case LESS_THAN_EQUAL_TO_VALUE: return LESS_THAN_EQUAL_TO;
			case GREATER_THAN_EQUAL_TO_VALUE: return GREATER_THAN_EQUAL_TO;
			case EQUAL_TO_VALUE: return EQUAL_TO;
			case NOT_EQUAL_TO_VALUE: return NOT_EQUAL_TO;
			case LIKE_VALUE: return LIKE;
			case BETWEEN_VALUE: return BETWEEN;
			case NULL_CHECK_VALUE: return NULL_CHECK;
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
	private ComparisonOperatorType(int value, String name, String literal) {
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
	
} //ComparisonOperatorType
