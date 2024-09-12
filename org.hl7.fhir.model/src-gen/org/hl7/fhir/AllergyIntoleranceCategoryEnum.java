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
 * A representation of the literals of the enumeration '<em><b>Allergy Intolerance Category Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceCategoryEnum()
 * @model extendedMetaData="name='AllergyIntoleranceCategoryEnum'"
 * @generated
 */
@ProviderType
public enum AllergyIntoleranceCategoryEnum implements Enumerator {
	/**
	 * The '<em><b>Food</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Food
	 * <!-- end-model-doc -->
	 * @see #FOOD_VALUE
	 * @generated
	 * @ordered
	 */
	FOOD(0, "food", "food"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(1, "medication", "medication"),

	/**
	 * The '<em><b>Environment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Environment
	 * <!-- end-model-doc -->
	 * @see #ENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIRONMENT(2, "environment", "environment"),

	/**
	 * The '<em><b>Biologic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Biologic
	 * <!-- end-model-doc -->
	 * @see #BIOLOGIC_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGIC(3, "biologic", "biologic");

	/**
	 * The '<em><b>Food</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Food
	 * <!-- end-model-doc -->
	 * @see #FOOD
	 * @model name="food"
	 * @generated
	 * @ordered
	 */
	public static final int FOOD_VALUE = 0;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * <!-- end-model-doc -->
	 * @see #MEDICATION
	 * @model name="medication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 1;

	/**
	 * The '<em><b>Environment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Environment
	 * <!-- end-model-doc -->
	 * @see #ENVIRONMENT
	 * @model name="environment"
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENT_VALUE = 2;

	/**
	 * The '<em><b>Biologic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Biologic
	 * <!-- end-model-doc -->
	 * @see #BIOLOGIC
	 * @model name="biologic"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGIC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Allergy Intolerance Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllergyIntoleranceCategoryEnum[] VALUES_ARRAY =
		new AllergyIntoleranceCategoryEnum[] {
			FOOD,
			MEDICATION,
			ENVIRONMENT,
			BIOLOGIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Allergy Intolerance Category Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllergyIntoleranceCategoryEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allergy Intolerance Category Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCategoryEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceCategoryEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Category Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCategoryEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceCategoryEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Category Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCategoryEnum get(int value) {
		switch (value) {
			case FOOD_VALUE: return FOOD;
			case MEDICATION_VALUE: return MEDICATION;
			case ENVIRONMENT_VALUE: return ENVIRONMENT;
			case BIOLOGIC_VALUE: return BIOLOGIC;
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
	private AllergyIntoleranceCategoryEnum(int value, String name, String literal) {
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
	
} //AllergyIntoleranceCategoryEnum
