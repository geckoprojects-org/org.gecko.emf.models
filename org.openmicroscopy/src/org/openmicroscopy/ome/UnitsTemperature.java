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
 * A representation of the literals of the enumeration '<em><b>Units Temperature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent a temperature
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsTemperature()
 * @model extendedMetaData="name='UnitsTemperature'"
 * @generated
 */
@ProviderType
public enum UnitsTemperature implements Enumerator {
	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree Celsius unit.
	 * <!-- end-model-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(0, "C", "\u00b0C"),

	/**
	 * The '<em><b>F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree Fahrenheit unit.
	 * <!-- end-model-doc -->
	 * @see #F_VALUE
	 * @generated
	 * @ordered
	 */
	F(1, "F", "\u00b0F"),

	/**
	 * The '<em><b>K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kelvin unit.
	 * <!-- end-model-doc -->
	 * @see #K_VALUE
	 * @generated
	 * @ordered
	 */
	K(2, "K", "K"),

	/**
	 * The '<em><b>R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree Rankine unit.
	 * <!-- end-model-doc -->
	 * @see #R_VALUE
	 * @generated
	 * @ordered
	 */
	R(3, "R", "\u00b0R");

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree Celsius unit.
	 * <!-- end-model-doc -->
	 * @see #C
	 * @model literal="\260C"
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 0;

	/**
	 * The '<em><b>F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree Fahrenheit unit.
	 * <!-- end-model-doc -->
	 * @see #F
	 * @model literal="\260F"
	 * @generated
	 * @ordered
	 */
	public static final int F_VALUE = 1;

	/**
	 * The '<em><b>K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kelvin unit.
	 * <!-- end-model-doc -->
	 * @see #K
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int K_VALUE = 2;

	/**
	 * The '<em><b>R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree Rankine unit.
	 * <!-- end-model-doc -->
	 * @see #R
	 * @model literal="\260R"
	 * @generated
	 * @ordered
	 */
	public static final int R_VALUE = 3;

	/**
	 * An array of all the '<em><b>Units Temperature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsTemperature[] VALUES_ARRAY =
		new UnitsTemperature[] {
			C,
			F,
			K,
			R,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Temperature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsTemperature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Temperature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsTemperature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsTemperature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Temperature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsTemperature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsTemperature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Temperature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsTemperature get(int value) {
		switch (value) {
			case C_VALUE: return C;
			case F_VALUE: return F;
			case K_VALUE: return K;
			case R_VALUE: return R;
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
	private UnitsTemperature(int value, String name, String literal) {
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
	
} //UnitsTemperature
