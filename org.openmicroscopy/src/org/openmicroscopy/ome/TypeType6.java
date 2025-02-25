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
package org.openmicroscopy.ome;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type6</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getTypeType6()
 * @model extendedMetaData="name='Type_._6_._type'"
 * @generated
 */
@ProviderType
public enum TypeType6 implements Enumerator {
	/**
	 * The '<em><b>Dichroic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICHROIC_VALUE
	 * @generated
	 * @ordered
	 */
	DICHROIC(0, "Dichroic", "Dichroic"),

	/**
	 * The '<em><b>Long Pass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_PASS(1, "LongPass", "LongPass"),

	/**
	 * The '<em><b>Short Pass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT_PASS(2, "ShortPass", "ShortPass"),

	/**
	 * The '<em><b>Band Pass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAND_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	BAND_PASS(3, "BandPass", "BandPass"),

	/**
	 * The '<em><b>Multi Pass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_PASS(4, "MultiPass", "MultiPass"),

	/**
	 * The '<em><b>Neutral Density</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTRAL_DENSITY_VALUE
	 * @generated
	 * @ordered
	 */
	NEUTRAL_DENSITY(5, "NeutralDensity", "NeutralDensity"),

	/**
	 * The '<em><b>Tuneable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNEABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TUNEABLE(6, "Tuneable", "Tuneable"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "Other", "Other");

	/**
	 * The '<em><b>Dichroic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICHROIC
	 * @model name="Dichroic"
	 * @generated
	 * @ordered
	 */
	public static final int DICHROIC_VALUE = 0;

	/**
	 * The '<em><b>Long Pass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_PASS
	 * @model name="LongPass"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_PASS_VALUE = 1;

	/**
	 * The '<em><b>Short Pass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_PASS
	 * @model name="ShortPass"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_PASS_VALUE = 2;

	/**
	 * The '<em><b>Band Pass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAND_PASS
	 * @model name="BandPass"
	 * @generated
	 * @ordered
	 */
	public static final int BAND_PASS_VALUE = 3;

	/**
	 * The '<em><b>Multi Pass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_PASS
	 * @model name="MultiPass"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_PASS_VALUE = 4;

	/**
	 * The '<em><b>Neutral Density</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTRAL_DENSITY
	 * @model name="NeutralDensity"
	 * @generated
	 * @ordered
	 */
	public static final int NEUTRAL_DENSITY_VALUE = 5;

	/**
	 * The '<em><b>Tuneable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNEABLE
	 * @model name="Tuneable"
	 * @generated
	 * @ordered
	 */
	public static final int TUNEABLE_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Type6</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType6[] VALUES_ARRAY =
		new TypeType6[] {
			DICHROIC,
			LONG_PASS,
			SHORT_PASS,
			BAND_PASS,
			MULTI_PASS,
			NEUTRAL_DENSITY,
			TUNEABLE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type6</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType6> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type6</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType6 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType6 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type6</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType6 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType6 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type6</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType6 get(int value) {
		switch (value) {
			case DICHROIC_VALUE: return DICHROIC;
			case LONG_PASS_VALUE: return LONG_PASS;
			case SHORT_PASS_VALUE: return SHORT_PASS;
			case BAND_PASS_VALUE: return BAND_PASS;
			case MULTI_PASS_VALUE: return MULTI_PASS;
			case NEUTRAL_DENSITY_VALUE: return NEUTRAL_DENSITY;
			case TUNEABLE_VALUE: return TUNEABLE;
			case OTHER_VALUE: return OTHER;
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
	private TypeType6(int value, String name, String literal) {
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
	
} //TypeType6
