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
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aggregation Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getAggregationModeEnum()
 * @model extendedMetaData="name='AggregationModeEnum'"
 * @generated
 */
@ProviderType
public enum AggregationModeEnum implements Enumerator {
	/**
	 * The '<em><b>Contained</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained
	 * <!-- end-model-doc -->
	 * @see #CONTAINED_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINED(0, "contained", "contained"),

	/**
	 * The '<em><b>Referenced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced
	 * <!-- end-model-doc -->
	 * @see #REFERENCED_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCED(1, "referenced", "referenced"),

	/**
	 * The '<em><b>Bundled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundled
	 * <!-- end-model-doc -->
	 * @see #BUNDLED_VALUE
	 * @generated
	 * @ordered
	 */
	BUNDLED(2, "bundled", "bundled");

	/**
	 * The '<em><b>Contained</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained
	 * <!-- end-model-doc -->
	 * @see #CONTAINED
	 * @model name="contained"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINED_VALUE = 0;

	/**
	 * The '<em><b>Referenced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced
	 * <!-- end-model-doc -->
	 * @see #REFERENCED
	 * @model name="referenced"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCED_VALUE = 1;

	/**
	 * The '<em><b>Bundled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundled
	 * <!-- end-model-doc -->
	 * @see #BUNDLED
	 * @model name="bundled"
	 * @generated
	 * @ordered
	 */
	public static final int BUNDLED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Aggregation Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggregationModeEnum[] VALUES_ARRAY =
		new AggregationModeEnum[] {
			CONTAINED,
			REFERENCED,
			BUNDLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Aggregation Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AggregationModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aggregation Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationModeEnum get(int value) {
		switch (value) {
			case CONTAINED_VALUE: return CONTAINED;
			case REFERENCED_VALUE: return REFERENCED;
			case BUNDLED_VALUE: return BUNDLED;
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
	private AggregationModeEnum(int value, String name, String literal) {
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
	
} //AggregationModeEnum
