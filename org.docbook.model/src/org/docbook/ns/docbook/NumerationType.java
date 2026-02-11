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
 * A representation of the literals of the enumeration '<em><b>Numeration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getNumerationType()
 * @model extendedMetaData="name='numeration_._type'"
 * @generated
 */
@ProviderType
public enum NumerationType implements Enumerator {
	/**
	 * The '<em><b>Arabic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARABIC_VALUE
	 * @generated
	 * @ordered
	 */
	ARABIC(0, "arabic", "arabic"),

	/**
	 * The '<em><b>Upperalpha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	UPPERALPHA(1, "upperalpha", "upperalpha"),

	/**
	 * The '<em><b>Loweralpha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	LOWERALPHA(2, "loweralpha", "loweralpha"),

	/**
	 * The '<em><b>Upperroman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	UPPERROMAN(3, "upperroman", "upperroman"),

	/**
	 * The '<em><b>Lowerroman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	LOWERROMAN(4, "lowerroman", "lowerroman");

	/**
	 * The '<em><b>Arabic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARABIC
	 * @model name="arabic"
	 * @generated
	 * @ordered
	 */
	public static final int ARABIC_VALUE = 0;

	/**
	 * The '<em><b>Upperalpha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERALPHA
	 * @model name="upperalpha"
	 * @generated
	 * @ordered
	 */
	public static final int UPPERALPHA_VALUE = 1;

	/**
	 * The '<em><b>Loweralpha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERALPHA
	 * @model name="loweralpha"
	 * @generated
	 * @ordered
	 */
	public static final int LOWERALPHA_VALUE = 2;

	/**
	 * The '<em><b>Upperroman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERROMAN
	 * @model name="upperroman"
	 * @generated
	 * @ordered
	 */
	public static final int UPPERROMAN_VALUE = 3;

	/**
	 * The '<em><b>Lowerroman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERROMAN
	 * @model name="lowerroman"
	 * @generated
	 * @ordered
	 */
	public static final int LOWERROMAN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Numeration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NumerationType[] VALUES_ARRAY =
		new NumerationType[] {
			ARABIC,
			UPPERALPHA,
			LOWERALPHA,
			UPPERROMAN,
			LOWERROMAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Numeration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NumerationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Numeration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumerationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumerationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Numeration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumerationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumerationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Numeration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumerationType get(int value) {
		switch (value) {
			case ARABIC_VALUE: return ARABIC;
			case UPPERALPHA_VALUE: return UPPERALPHA;
			case LOWERALPHA_VALUE: return LOWERALPHA;
			case UPPERROMAN_VALUE: return UPPERROMAN;
			case LOWERROMAN_VALUE: return LOWERROMAN;
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
	private NumerationType(int value, String name, String literal) {
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
	
} //NumerationType
