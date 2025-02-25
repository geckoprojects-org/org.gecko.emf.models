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
 * A representation of the literals of the enumeration '<em><b>Naming Convention</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         Predefined list of values for the well labels
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getNamingConvention()
 * @model extendedMetaData="name='NamingConvention'"
 * @generated
 */
@ProviderType
public enum NamingConvention implements Enumerator {
	/**
	 * The '<em><b>Letter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             While the label type 'number' has a clear meaning the 'letter'
	 *             type is more complex.
	 * 
	 *             If you have less than 26 values use letters A to Z.
	 *             Once you get more than 26 values there are several different
	 *             approaches in use.
	 *             One we have see include:
	 * 
	 *             Single letter, then double letter each running A to Z, right first
	 *             e.g. A, B, C, ... X, Y, Z, AA, AB, AC, ... AY, AZ, BA, BB, ...
	 *             This is the format used by Microsoft Excel so users may be familiar with it.
	 *             This is the approach we use in the OMERO client applications.
	 * 
	 *             CAPITALsmall, each running A to Z, small first
	 *             e.g. Aa, Ab, Ac, ... Ax, Ay, Az, Ba, Bb, Bc, ... By, Bz, Ca, Cb, ...
	 *             This is in use by some plate manufactures.
	 * 
	 *             Single letter, then double letter, then triple letter, and so on
	 *             e.g. A, B, C, ... X, Y, Z, AA, BB, CC, ... YY, ZZ, AAA, BBB, ...
	 *             This has the advantage that the first 26 are the same as the standard
	 *             but has a problem an the labels get wider and wider leading to user
	 *             interface problems.
	 *           
	 * <!-- end-model-doc -->
	 * @see #LETTER_VALUE
	 * @generated
	 * @ordered
	 */
	LETTER(0, "letter", "letter"),

	/**
	 * The '<em><b>Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             1, 2, 3, ...
	 *           
	 * <!-- end-model-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(1, "number", "number");

	/**
	 * The '<em><b>Letter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             While the label type 'number' has a clear meaning the 'letter'
	 *             type is more complex.
	 * 
	 *             If you have less than 26 values use letters A to Z.
	 *             Once you get more than 26 values there are several different
	 *             approaches in use.
	 *             One we have see include:
	 * 
	 *             Single letter, then double letter each running A to Z, right first
	 *             e.g. A, B, C, ... X, Y, Z, AA, AB, AC, ... AY, AZ, BA, BB, ...
	 *             This is the format used by Microsoft Excel so users may be familiar with it.
	 *             This is the approach we use in the OMERO client applications.
	 * 
	 *             CAPITALsmall, each running A to Z, small first
	 *             e.g. Aa, Ab, Ac, ... Ax, Ay, Az, Ba, Bb, Bc, ... By, Bz, Ca, Cb, ...
	 *             This is in use by some plate manufactures.
	 * 
	 *             Single letter, then double letter, then triple letter, and so on
	 *             e.g. A, B, C, ... X, Y, Z, AA, BB, CC, ... YY, ZZ, AAA, BBB, ...
	 *             This has the advantage that the first 26 are the same as the standard
	 *             but has a problem an the labels get wider and wider leading to user
	 *             interface problems.
	 *           
	 * <!-- end-model-doc -->
	 * @see #LETTER
	 * @model name="letter"
	 * @generated
	 * @ordered
	 */
	public static final int LETTER_VALUE = 0;

	/**
	 * The '<em><b>Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             1, 2, 3, ...
	 *           
	 * <!-- end-model-doc -->
	 * @see #NUMBER
	 * @model name="number"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Naming Convention</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NamingConvention[] VALUES_ARRAY =
		new NamingConvention[] {
			LETTER,
			NUMBER,
		};

	/**
	 * A public read-only list of all the '<em><b>Naming Convention</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NamingConvention> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Naming Convention</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingConvention get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamingConvention result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Naming Convention</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingConvention getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamingConvention result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Naming Convention</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingConvention get(int value) {
		switch (value) {
			case LETTER_VALUE: return LETTER;
			case NUMBER_VALUE: return NUMBER;
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
	private NamingConvention(int value, String name, String literal) {
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
	
} //NamingConvention
