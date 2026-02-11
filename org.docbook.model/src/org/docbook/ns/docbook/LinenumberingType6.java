/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Linenumbering Type6</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getLinenumberingType6()
 * @model extendedMetaData="name='linenumbering_._6_._type'"
 * @generated
 */
@ProviderType
public enum LinenumberingType6 implements Enumerator {
	/**
	 * The '<em><b>Numbered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBERED_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBERED(0, "numbered", "numbered"),

	/**
	 * The '<em><b>Unnumbered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNNUMBERED_VALUE
	 * @generated
	 * @ordered
	 */
	UNNUMBERED(1, "unnumbered", "unnumbered");

	/**
	 * The '<em><b>Numbered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBERED
	 * @model name="numbered"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBERED_VALUE = 0;

	/**
	 * The '<em><b>Unnumbered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNNUMBERED
	 * @model name="unnumbered"
	 * @generated
	 * @ordered
	 */
	public static final int UNNUMBERED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Linenumbering Type6</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinenumberingType6[] VALUES_ARRAY =
		new LinenumberingType6[] {
			NUMBERED,
			UNNUMBERED,
		};

	/**
	 * A public read-only list of all the '<em><b>Linenumbering Type6</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinenumberingType6> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Linenumbering Type6</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinenumberingType6 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinenumberingType6 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linenumbering Type6</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinenumberingType6 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinenumberingType6 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linenumbering Type6</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinenumberingType6 get(int value) {
		switch (value) {
			case NUMBERED_VALUE: return NUMBERED;
			case UNNUMBERED_VALUE: return UNNUMBERED;
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
	private LinenumberingType6(int value, String name, String literal) {
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
	
} //LinenumberingType6
