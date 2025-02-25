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
 * A representation of the literals of the enumeration '<em><b>Immersion Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getImmersionType()
 * @model extendedMetaData="name='Immersion_._type'"
 * @generated
 */
@ProviderType
public enum ImmersionType implements Enumerator {
	/**
	 * The '<em><b>Oil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL_VALUE
	 * @generated
	 * @ordered
	 */
	OIL(0, "Oil", "Oil"),

	/**
	 * The '<em><b>Water</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_VALUE
	 * @generated
	 * @ordered
	 */
	WATER(1, "Water", "Water"),

	/**
	 * The '<em><b>Water Dipping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_DIPPING_VALUE
	 * @generated
	 * @ordered
	 */
	WATER_DIPPING(2, "WaterDipping", "WaterDipping"),

	/**
	 * The '<em><b>Air</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_VALUE
	 * @generated
	 * @ordered
	 */
	AIR(3, "Air", "Air"),

	/**
	 * The '<em><b>Multi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI(4, "Multi", "Multi"),

	/**
	 * The '<em><b>Glycerol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLYCEROL_VALUE
	 * @generated
	 * @ordered
	 */
	GLYCEROL(5, "Glycerol", "Glycerol"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "Other", "Other");

	/**
	 * The '<em><b>Oil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL
	 * @model name="Oil"
	 * @generated
	 * @ordered
	 */
	public static final int OIL_VALUE = 0;

	/**
	 * The '<em><b>Water</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER
	 * @model name="Water"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_VALUE = 1;

	/**
	 * The '<em><b>Water Dipping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_DIPPING
	 * @model name="WaterDipping"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_DIPPING_VALUE = 2;

	/**
	 * The '<em><b>Air</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR
	 * @model name="Air"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_VALUE = 3;

	/**
	 * The '<em><b>Multi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI
	 * @model name="Multi"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_VALUE = 4;

	/**
	 * The '<em><b>Glycerol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLYCEROL
	 * @model name="Glycerol"
	 * @generated
	 * @ordered
	 */
	public static final int GLYCEROL_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Immersion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImmersionType[] VALUES_ARRAY =
		new ImmersionType[] {
			OIL,
			WATER,
			WATER_DIPPING,
			AIR,
			MULTI,
			GLYCEROL,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Immersion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImmersionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Immersion Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmersionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmersionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immersion Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmersionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmersionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immersion Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmersionType get(int value) {
		switch (value) {
			case OIL_VALUE: return OIL;
			case WATER_VALUE: return WATER;
			case WATER_DIPPING_VALUE: return WATER_DIPPING;
			case AIR_VALUE: return AIR;
			case MULTI_VALUE: return MULTI;
			case GLYCEROL_VALUE: return GLYCEROL;
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
	private ImmersionType(int value, String name, String literal) {
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
	
} //ImmersionType
