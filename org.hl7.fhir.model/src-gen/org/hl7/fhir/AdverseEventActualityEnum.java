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
 * A representation of the literals of the enumeration '<em><b>Adverse Event Actuality Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getAdverseEventActualityEnum()
 * @model extendedMetaData="name='AdverseEventActualityEnum'"
 * @generated
 */
@ProviderType
public enum AdverseEventActualityEnum implements Enumerator {
	/**
	 * The '<em><b>Actual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adverse Event
	 * <!-- end-model-doc -->
	 * @see #ACTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	ACTUAL(0, "actual", "actual"),

	/**
	 * The '<em><b>Potential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential Adverse Event
	 * <!-- end-model-doc -->
	 * @see #POTENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	POTENTIAL(1, "potential", "potential");

	/**
	 * The '<em><b>Actual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adverse Event
	 * <!-- end-model-doc -->
	 * @see #ACTUAL
	 * @model name="actual"
	 * @generated
	 * @ordered
	 */
	public static final int ACTUAL_VALUE = 0;

	/**
	 * The '<em><b>Potential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential Adverse Event
	 * <!-- end-model-doc -->
	 * @see #POTENTIAL
	 * @model name="potential"
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Adverse Event Actuality Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdverseEventActualityEnum[] VALUES_ARRAY =
		new AdverseEventActualityEnum[] {
			ACTUAL,
			POTENTIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Adverse Event Actuality Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdverseEventActualityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adverse Event Actuality Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdverseEventActualityEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdverseEventActualityEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adverse Event Actuality Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdverseEventActualityEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdverseEventActualityEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adverse Event Actuality Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdverseEventActualityEnum get(int value) {
		switch (value) {
			case ACTUAL_VALUE: return ACTUAL;
			case POTENTIAL_VALUE: return POTENTIAL;
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
	private AdverseEventActualityEnum(int value, String name, String literal) {
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
	
} //AdverseEventActualityEnum
