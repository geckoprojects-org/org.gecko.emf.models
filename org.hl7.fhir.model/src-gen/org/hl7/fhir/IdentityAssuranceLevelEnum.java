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
 * A representation of the literals of the enumeration '<em><b>Identity Assurance Level Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getIdentityAssuranceLevelEnum()
 * @model extendedMetaData="name='IdentityAssuranceLevelEnum'"
 * @generated
 */
@ProviderType
public enum IdentityAssuranceLevelEnum implements Enumerator {
	/**
	 * The '<em><b>Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 1
	 * <!-- end-model-doc -->
	 * @see #LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL1(0, "level1", "level1"),

	/**
	 * The '<em><b>Level2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 2
	 * <!-- end-model-doc -->
	 * @see #LEVEL2_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL2(1, "level2", "level2"),

	/**
	 * The '<em><b>Level3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 3
	 * <!-- end-model-doc -->
	 * @see #LEVEL3_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL3(2, "level3", "level3"),

	/**
	 * The '<em><b>Level4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 4
	 * <!-- end-model-doc -->
	 * @see #LEVEL4_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL4(3, "level4", "level4");

	/**
	 * The '<em><b>Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 1
	 * <!-- end-model-doc -->
	 * @see #LEVEL1
	 * @model name="level1"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL1_VALUE = 0;

	/**
	 * The '<em><b>Level2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 2
	 * <!-- end-model-doc -->
	 * @see #LEVEL2
	 * @model name="level2"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL2_VALUE = 1;

	/**
	 * The '<em><b>Level3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 3
	 * <!-- end-model-doc -->
	 * @see #LEVEL3
	 * @model name="level3"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL3_VALUE = 2;

	/**
	 * The '<em><b>Level4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level 4
	 * <!-- end-model-doc -->
	 * @see #LEVEL4
	 * @model name="level4"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL4_VALUE = 3;

	/**
	 * An array of all the '<em><b>Identity Assurance Level Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentityAssuranceLevelEnum[] VALUES_ARRAY =
		new IdentityAssuranceLevelEnum[] {
			LEVEL1,
			LEVEL2,
			LEVEL3,
			LEVEL4,
		};

	/**
	 * A public read-only list of all the '<em><b>Identity Assurance Level Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentityAssuranceLevelEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identity Assurance Level Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityAssuranceLevelEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentityAssuranceLevelEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identity Assurance Level Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityAssuranceLevelEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentityAssuranceLevelEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identity Assurance Level Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityAssuranceLevelEnum get(int value) {
		switch (value) {
			case LEVEL1_VALUE: return LEVEL1;
			case LEVEL2_VALUE: return LEVEL2;
			case LEVEL3_VALUE: return LEVEL3;
			case LEVEL4_VALUE: return LEVEL4;
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
	private IdentityAssuranceLevelEnum(int value, String name, String literal) {
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
	
} //IdentityAssuranceLevelEnum
