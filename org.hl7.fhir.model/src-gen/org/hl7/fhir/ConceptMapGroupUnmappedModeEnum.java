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
 * A representation of the literals of the enumeration '<em><b>Concept Map Group Unmapped Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getConceptMapGroupUnmappedModeEnum()
 * @model extendedMetaData="name='ConceptMapGroupUnmappedModeEnum'"
 * @generated
 */
@ProviderType
public enum ConceptMapGroupUnmappedModeEnum implements Enumerator {
	/**
	 * The '<em><b>Use Source Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use Provided Source Code
	 * <!-- end-model-doc -->
	 * @see #USE_SOURCE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	USE_SOURCE_CODE(0, "useSourceCode", "use-source-code"),

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixed Code
	 * <!-- end-model-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(1, "fixed", "fixed"),

	/**
	 * The '<em><b>Other Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other Map
	 * <!-- end-model-doc -->
	 * @see #OTHER_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_MAP(2, "otherMap", "other-map");

	/**
	 * The '<em><b>Use Source Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use Provided Source Code
	 * <!-- end-model-doc -->
	 * @see #USE_SOURCE_CODE
	 * @model name="useSourceCode" literal="use-source-code"
	 * @generated
	 * @ordered
	 */
	public static final int USE_SOURCE_CODE_VALUE = 0;

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixed Code
	 * <!-- end-model-doc -->
	 * @see #FIXED
	 * @model name="fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 1;

	/**
	 * The '<em><b>Other Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other Map
	 * <!-- end-model-doc -->
	 * @see #OTHER_MAP
	 * @model name="otherMap" literal="other-map"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_MAP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Concept Map Group Unmapped Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConceptMapGroupUnmappedModeEnum[] VALUES_ARRAY =
		new ConceptMapGroupUnmappedModeEnum[] {
			USE_SOURCE_CODE,
			FIXED,
			OTHER_MAP,
		};

	/**
	 * A public read-only list of all the '<em><b>Concept Map Group Unmapped Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConceptMapGroupUnmappedModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concept Map Group Unmapped Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapGroupUnmappedModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapGroupUnmappedModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Group Unmapped Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapGroupUnmappedModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapGroupUnmappedModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Group Unmapped Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapGroupUnmappedModeEnum get(int value) {
		switch (value) {
			case USE_SOURCE_CODE_VALUE: return USE_SOURCE_CODE;
			case FIXED_VALUE: return FIXED;
			case OTHER_MAP_VALUE: return OTHER_MAP;
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
	private ConceptMapGroupUnmappedModeEnum(int value, String name, String literal) {
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
	
} //ConceptMapGroupUnmappedModeEnum
