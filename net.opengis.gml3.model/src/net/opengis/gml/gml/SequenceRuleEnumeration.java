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
package net.opengis.gml.gml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sequence Rule Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.gml.gml.GMLPackage#getSequenceRuleEnumeration()
 * @model extendedMetaData="name='SequenceRuleEnumeration'"
 * @generated
 */
@ProviderType
public enum SequenceRuleEnumeration implements Enumerator {
	/**
	 * The '<em><b>Linear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR(0, "Linear", "Linear"),

	/**
	 * The '<em><b>Boustrophedonic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUSTROPHEDONIC_VALUE
	 * @generated
	 * @ordered
	 */
	BOUSTROPHEDONIC(1, "Boustrophedonic", "Boustrophedonic"),

	/**
	 * The '<em><b>Cantor Diagonal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANTOR_DIAGONAL_VALUE
	 * @generated
	 * @ordered
	 */
	CANTOR_DIAGONAL(2, "CantorDiagonal", "Cantor-diagonal"),

	/**
	 * The '<em><b>Spiral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL(3, "Spiral", "Spiral"),

	/**
	 * The '<em><b>Morton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORTON_VALUE
	 * @generated
	 * @ordered
	 */
	MORTON(4, "Morton", "Morton"),

	/**
	 * The '<em><b>Hilbert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HILBERT_VALUE
	 * @generated
	 * @ordered
	 */
	HILBERT(5, "Hilbert", "Hilbert");

	/**
	 * The '<em><b>Linear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR
	 * @model name="Linear"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_VALUE = 0;

	/**
	 * The '<em><b>Boustrophedonic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUSTROPHEDONIC
	 * @model name="Boustrophedonic"
	 * @generated
	 * @ordered
	 */
	public static final int BOUSTROPHEDONIC_VALUE = 1;

	/**
	 * The '<em><b>Cantor Diagonal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANTOR_DIAGONAL
	 * @model name="CantorDiagonal" literal="Cantor-diagonal"
	 * @generated
	 * @ordered
	 */
	public static final int CANTOR_DIAGONAL_VALUE = 2;

	/**
	 * The '<em><b>Spiral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL
	 * @model name="Spiral"
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_VALUE = 3;

	/**
	 * The '<em><b>Morton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORTON
	 * @model name="Morton"
	 * @generated
	 * @ordered
	 */
	public static final int MORTON_VALUE = 4;

	/**
	 * The '<em><b>Hilbert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HILBERT
	 * @model name="Hilbert"
	 * @generated
	 * @ordered
	 */
	public static final int HILBERT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Sequence Rule Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SequenceRuleEnumeration[] VALUES_ARRAY =
		new SequenceRuleEnumeration[] {
			LINEAR,
			BOUSTROPHEDONIC,
			CANTOR_DIAGONAL,
			SPIRAL,
			MORTON,
			HILBERT,
		};

	/**
	 * A public read-only list of all the '<em><b>Sequence Rule Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SequenceRuleEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sequence Rule Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceRuleEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SequenceRuleEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Rule Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceRuleEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SequenceRuleEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Rule Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SequenceRuleEnumeration get(int value) {
		switch (value) {
			case LINEAR_VALUE: return LINEAR;
			case BOUSTROPHEDONIC_VALUE: return BOUSTROPHEDONIC;
			case CANTOR_DIAGONAL_VALUE: return CANTOR_DIAGONAL;
			case SPIRAL_VALUE: return SPIRAL;
			case MORTON_VALUE: return MORTON;
			case HILBERT_VALUE: return HILBERT;
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
	private SequenceRuleEnumeration(int value, String name, String literal) {
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
	
} //SequenceRuleEnumeration
