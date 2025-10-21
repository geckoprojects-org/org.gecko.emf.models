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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Anliegenbeistandschaft</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAnliegenbeistandschaft()
 * @model extendedMetaData="name='anliegenbeistandschaft'"
 * @generated
 */
@ProviderType
public enum Anliegenbeistandschaft implements Enumerator {
	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(0, "b", "b"),

	/**
	 * The '<em><b>U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U_VALUE
	 * @generated
	 * @ordered
	 */
	U(1, "u", "u"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(2, "v", "v"),

	/**
	 * The '<em><b>Vu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VU_VALUE
	 * @generated
	 * @ordered
	 */
	VU(3, "vu", "vu");

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model name="b"
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 0;

	/**
	 * The '<em><b>U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U
	 * @model name="u"
	 * @generated
	 * @ordered
	 */
	public static final int U_VALUE = 1;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model name="v"
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 2;

	/**
	 * The '<em><b>Vu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VU
	 * @model name="vu"
	 * @generated
	 * @ordered
	 */
	public static final int VU_VALUE = 3;

	/**
	 * An array of all the '<em><b>Anliegenbeistandschaft</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Anliegenbeistandschaft[] VALUES_ARRAY =
		new Anliegenbeistandschaft[] {
			B,
			U,
			V,
			VU,
		};

	/**
	 * A public read-only list of all the '<em><b>Anliegenbeistandschaft</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Anliegenbeistandschaft> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Anliegenbeistandschaft</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Anliegenbeistandschaft get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Anliegenbeistandschaft result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Anliegenbeistandschaft</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Anliegenbeistandschaft getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Anliegenbeistandschaft result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Anliegenbeistandschaft</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Anliegenbeistandschaft get(int value) {
		switch (value) {
			case B_VALUE: return B;
			case U_VALUE: return U;
			case V_VALUE: return V;
			case VU_VALUE: return VU;
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
	private Anliegenbeistandschaft(int value, String name, String literal) {
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
	
} //Anliegenbeistandschaft
