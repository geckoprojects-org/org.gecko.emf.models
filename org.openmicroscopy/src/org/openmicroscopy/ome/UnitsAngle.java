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
 * A representation of the literals of the enumeration '<em><b>Units Angle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent an angle
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsAngle()
 * @model extendedMetaData="name='UnitsAngle'"
 * @generated
 */
@ProviderType
public enum UnitsAngle implements Enumerator {
	/**
	 * The '<em><b>Deg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree unit.
	 * <!-- end-model-doc -->
	 * @see #DEG_VALUE
	 * @generated
	 * @ordered
	 */
	DEG(0, "deg", "deg"),

	/**
	 * The '<em><b>Rad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * radian unit.
	 * <!-- end-model-doc -->
	 * @see #RAD_VALUE
	 * @generated
	 * @ordered
	 */
	RAD(1, "rad", "rad"),

	/**
	 * The '<em><b>Gon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gradian unit.
	 * <!-- end-model-doc -->
	 * @see #GON_VALUE
	 * @generated
	 * @ordered
	 */
	GON(2, "gon", "gon");

	/**
	 * The '<em><b>Deg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * degree unit.
	 * <!-- end-model-doc -->
	 * @see #DEG
	 * @model name="deg"
	 * @generated
	 * @ordered
	 */
	public static final int DEG_VALUE = 0;

	/**
	 * The '<em><b>Rad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * radian unit.
	 * <!-- end-model-doc -->
	 * @see #RAD
	 * @model name="rad"
	 * @generated
	 * @ordered
	 */
	public static final int RAD_VALUE = 1;

	/**
	 * The '<em><b>Gon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gradian unit.
	 * <!-- end-model-doc -->
	 * @see #GON
	 * @model name="gon"
	 * @generated
	 * @ordered
	 */
	public static final int GON_VALUE = 2;

	/**
	 * An array of all the '<em><b>Units Angle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsAngle[] VALUES_ARRAY =
		new UnitsAngle[] {
			DEG,
			RAD,
			GON,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Angle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsAngle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Angle</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsAngle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsAngle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Angle</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsAngle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsAngle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Angle</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsAngle get(int value) {
		switch (value) {
			case DEG_VALUE: return DEG;
			case RAD_VALUE: return RAD;
			case GON_VALUE: return GON;
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
	private UnitsAngle(int value, String name, String literal) {
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
	
} //UnitsAngle
