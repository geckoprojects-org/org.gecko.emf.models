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
 * A representation of the literals of the enumeration '<em><b>Eligibility Request Purpose Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getEligibilityRequestPurposeEnum()
 * @model extendedMetaData="name='EligibilityRequestPurposeEnum'"
 * @generated
 */
@ProviderType
public enum EligibilityRequestPurposeEnum implements Enumerator {
	/**
	 * The '<em><b>Auth Requirements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage auth-requirements
	 * <!-- end-model-doc -->
	 * @see #AUTH_REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_REQUIREMENTS(0, "authRequirements", "auth-requirements"),

	/**
	 * The '<em><b>Benefits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage benefits
	 * <!-- end-model-doc -->
	 * @see #BENEFITS_VALUE
	 * @generated
	 * @ordered
	 */
	BENEFITS(1, "benefits", "benefits"),

	/**
	 * The '<em><b>Discovery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Discovery
	 * <!-- end-model-doc -->
	 * @see #DISCOVERY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERY(2, "discovery", "discovery"),

	/**
	 * The '<em><b>Validation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Validation
	 * <!-- end-model-doc -->
	 * @see #VALIDATION_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATION(3, "validation", "validation");

	/**
	 * The '<em><b>Auth Requirements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage auth-requirements
	 * <!-- end-model-doc -->
	 * @see #AUTH_REQUIREMENTS
	 * @model name="authRequirements" literal="auth-requirements"
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_REQUIREMENTS_VALUE = 0;

	/**
	 * The '<em><b>Benefits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage benefits
	 * <!-- end-model-doc -->
	 * @see #BENEFITS
	 * @model name="benefits"
	 * @generated
	 * @ordered
	 */
	public static final int BENEFITS_VALUE = 1;

	/**
	 * The '<em><b>Discovery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Discovery
	 * <!-- end-model-doc -->
	 * @see #DISCOVERY
	 * @model name="discovery"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERY_VALUE = 2;

	/**
	 * The '<em><b>Validation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage Validation
	 * <!-- end-model-doc -->
	 * @see #VALIDATION
	 * @model name="validation"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Eligibility Request Purpose Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EligibilityRequestPurposeEnum[] VALUES_ARRAY =
		new EligibilityRequestPurposeEnum[] {
			AUTH_REQUIREMENTS,
			BENEFITS,
			DISCOVERY,
			VALIDATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Eligibility Request Purpose Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EligibilityRequestPurposeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eligibility Request Purpose Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EligibilityRequestPurposeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligibilityRequestPurposeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligibility Request Purpose Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EligibilityRequestPurposeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligibilityRequestPurposeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligibility Request Purpose Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EligibilityRequestPurposeEnum get(int value) {
		switch (value) {
			case AUTH_REQUIREMENTS_VALUE: return AUTH_REQUIREMENTS;
			case BENEFITS_VALUE: return BENEFITS;
			case DISCOVERY_VALUE: return DISCOVERY;
			case VALIDATION_VALUE: return VALIDATION;
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
	private EligibilityRequestPurposeEnum(int value, String name, String literal) {
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
	
} //EligibilityRequestPurposeEnum
