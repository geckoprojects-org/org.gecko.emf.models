/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.xoev.xfamilie.baukasten._1.baukasten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Geschlecht</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getGeschlecht()
 * @model extendedMetaData="name='geschlecht'"
 * @generated
 */
@ProviderType
public enum Geschlecht implements Enumerator {
	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(0, "d", "d"),

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(1, "m", "m"),

	/**
	 * The '<em><b>U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U_VALUE
	 * @generated
	 * @ordered
	 */
	U(2, "u", "u"),

	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(3, "w", "w"),

	/**
	 * The '<em><b>X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X_VALUE
	 * @generated
	 * @ordered
	 */
	X(4, "x", "x");

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D
	 * @model name="d"
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 0;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M
	 * @model name="m"
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 1;

	/**
	 * The '<em><b>U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U
	 * @model name="u"
	 * @generated
	 * @ordered
	 */
	public static final int U_VALUE = 2;

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W
	 * @model name="w"
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 3;

	/**
	 * The '<em><b>X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X
	 * @model name="x"
	 * @generated
	 * @ordered
	 */
	public static final int X_VALUE = 4;

	/**
	 * An array of all the '<em><b>Geschlecht</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Geschlecht[] VALUES_ARRAY =
		new Geschlecht[] {
			D,
			M,
			U,
			W,
			X,
		};

	/**
	 * A public read-only list of all the '<em><b>Geschlecht</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Geschlecht> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Geschlecht</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Geschlecht get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Geschlecht result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geschlecht</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Geschlecht getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Geschlecht result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geschlecht</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Geschlecht get(int value) {
		switch (value) {
			case D_VALUE: return D;
			case M_VALUE: return M;
			case U_VALUE: return U;
			case W_VALUE: return W;
			case X_VALUE: return X;
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
	private Geschlecht(int value, String name, String literal) {
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
	
} //Geschlecht
