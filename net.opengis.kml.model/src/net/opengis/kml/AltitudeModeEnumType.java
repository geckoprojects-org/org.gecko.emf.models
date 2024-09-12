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
package net.opengis.kml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Altitude Mode Enum Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.kml.KMLPackage#getAltitudeModeEnumType()
 * @model extendedMetaData="name='altitudeModeEnumType'"
 * @generated
 */
@ProviderType
public enum AltitudeModeEnumType implements Enumerator {
	/**
	 * The '<em><b>Clamp To Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAMP_TO_GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	CLAMP_TO_GROUND(0, "clampToGround", "clampToGround"),

	/**
	 * The '<em><b>Relative To Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_TO_GROUND(1, "relativeToGround", "relativeToGround"),

	/**
	 * The '<em><b>Absolute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE(2, "absolute", "absolute");

	/**
	 * The '<em><b>Clamp To Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAMP_TO_GROUND
	 * @model name="clampToGround"
	 * @generated
	 * @ordered
	 */
	public static final int CLAMP_TO_GROUND_VALUE = 0;

	/**
	 * The '<em><b>Relative To Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_GROUND
	 * @model name="relativeToGround"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_TO_GROUND_VALUE = 1;

	/**
	 * The '<em><b>Absolute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE
	 * @model name="absolute"
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Altitude Mode Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AltitudeModeEnumType[] VALUES_ARRAY =
		new AltitudeModeEnumType[] {
			CLAMP_TO_GROUND,
			RELATIVE_TO_GROUND,
			ABSOLUTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Altitude Mode Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AltitudeModeEnumType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Altitude Mode Enum Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AltitudeModeEnumType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AltitudeModeEnumType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Altitude Mode Enum Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AltitudeModeEnumType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AltitudeModeEnumType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Altitude Mode Enum Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AltitudeModeEnumType get(int value) {
		switch (value) {
			case CLAMP_TO_GROUND_VALUE: return CLAMP_TO_GROUND;
			case RELATIVE_TO_GROUND_VALUE: return RELATIVE_TO_GROUND;
			case ABSOLUTE_VALUE: return ABSOLUTE;
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
	private AltitudeModeEnumType(int value, String name, String literal) {
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
	
} //AltitudeModeEnumType
