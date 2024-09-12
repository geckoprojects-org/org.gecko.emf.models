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
 * A representation of the literals of the enumeration '<em><b>Identifier Use Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FHIRPackage#getIdentifierUseEnum()
 * @model extendedMetaData="name='IdentifierUseEnum'"
 * @generated
 */
@ProviderType
public enum IdentifierUseEnum implements Enumerator {
	/**
	 * The '<em><b>Usual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usual
	 * <!-- end-model-doc -->
	 * @see #USUAL_VALUE
	 * @generated
	 * @ordered
	 */
	USUAL(0, "usual", "usual"),

	/**
	 * The '<em><b>Official</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official
	 * <!-- end-model-doc -->
	 * @see #OFFICIAL_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICIAL(1, "official", "official"),

	/**
	 * The '<em><b>Temp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temp
	 * <!-- end-model-doc -->
	 * @see #TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP(2, "temp", "temp"),

	/**
	 * The '<em><b>Secondary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary
	 * <!-- end-model-doc -->
	 * @see #SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY(3, "secondary", "secondary"),

	/**
	 * The '<em><b>Old</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Old
	 * <!-- end-model-doc -->
	 * @see #OLD_VALUE
	 * @generated
	 * @ordered
	 */
	OLD(4, "old", "old");

	/**
	 * The '<em><b>Usual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usual
	 * <!-- end-model-doc -->
	 * @see #USUAL
	 * @model name="usual"
	 * @generated
	 * @ordered
	 */
	public static final int USUAL_VALUE = 0;

	/**
	 * The '<em><b>Official</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official
	 * <!-- end-model-doc -->
	 * @see #OFFICIAL
	 * @model name="official"
	 * @generated
	 * @ordered
	 */
	public static final int OFFICIAL_VALUE = 1;

	/**
	 * The '<em><b>Temp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temp
	 * <!-- end-model-doc -->
	 * @see #TEMP
	 * @model name="temp"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_VALUE = 2;

	/**
	 * The '<em><b>Secondary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary
	 * <!-- end-model-doc -->
	 * @see #SECONDARY
	 * @model name="secondary"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_VALUE = 3;

	/**
	 * The '<em><b>Old</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Old
	 * <!-- end-model-doc -->
	 * @see #OLD
	 * @model name="old"
	 * @generated
	 * @ordered
	 */
	public static final int OLD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Identifier Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentifierUseEnum[] VALUES_ARRAY =
		new IdentifierUseEnum[] {
			USUAL,
			OFFICIAL,
			TEMP,
			SECONDARY,
			OLD,
		};

	/**
	 * A public read-only list of all the '<em><b>Identifier Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentifierUseEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identifier Use Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierUseEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierUseEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Use Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierUseEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierUseEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Use Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierUseEnum get(int value) {
		switch (value) {
			case USUAL_VALUE: return USUAL;
			case OFFICIAL_VALUE: return OFFICIAL;
			case TEMP_VALUE: return TEMP;
			case SECONDARY_VALUE: return SECONDARY;
			case OLD_VALUE: return OLD;
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
	private IdentifierUseEnum(int value, String name, String literal) {
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
	
} //IdentifierUseEnum
