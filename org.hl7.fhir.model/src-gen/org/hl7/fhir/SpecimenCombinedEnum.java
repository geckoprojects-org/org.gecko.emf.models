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
 * A representation of the literals of the enumeration '<em><b>Specimen Combined Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getSpecimenCombinedEnum()
 * @model extendedMetaData="name='SpecimenCombinedEnum'"
 * @generated
 */
@ProviderType
public enum SpecimenCombinedEnum implements Enumerator {
	/**
	 * The '<em><b>Grouped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grouped
	 * <!-- end-model-doc -->
	 * @see #GROUPED_VALUE
	 * @generated
	 * @ordered
	 */
	GROUPED(0, "grouped", "grouped"),

	/**
	 * The '<em><b>Pooled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pooled
	 * <!-- end-model-doc -->
	 * @see #POOLED_VALUE
	 * @generated
	 * @ordered
	 */
	POOLED(1, "pooled", "pooled");

	/**
	 * The '<em><b>Grouped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grouped
	 * <!-- end-model-doc -->
	 * @see #GROUPED
	 * @model name="grouped"
	 * @generated
	 * @ordered
	 */
	public static final int GROUPED_VALUE = 0;

	/**
	 * The '<em><b>Pooled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pooled
	 * <!-- end-model-doc -->
	 * @see #POOLED
	 * @model name="pooled"
	 * @generated
	 * @ordered
	 */
	public static final int POOLED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Specimen Combined Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecimenCombinedEnum[] VALUES_ARRAY =
		new SpecimenCombinedEnum[] {
			GROUPED,
			POOLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Specimen Combined Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecimenCombinedEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Specimen Combined Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenCombinedEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecimenCombinedEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specimen Combined Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenCombinedEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecimenCombinedEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Specimen Combined Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecimenCombinedEnum get(int value) {
		switch (value) {
			case GROUPED_VALUE: return GROUPED;
			case POOLED_VALUE: return POOLED;
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
	private SpecimenCombinedEnum(int value, String name, String literal) {
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
	
} //SpecimenCombinedEnum
