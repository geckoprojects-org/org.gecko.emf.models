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
 * A representation of the literals of the enumeration '<em><b>Font Family</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The font family used to draw the text. [enumeration]
 *         Note: these values are all lower case so they match
 *         the standard HTML/CSS values. "fantasy" has been
 *         included for completeness we do not recommended its
 *         regular use.
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getFontFamily()
 * @model extendedMetaData="name='FontFamily'"
 * @generated
 */
@ProviderType
public enum FontFamily implements Enumerator {
	/**
	 * The '<em><b>Serif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * serif.
	 * <!-- end-model-doc -->
	 * @see #SERIF_VALUE
	 * @generated
	 * @ordered
	 */
	SERIF(0, "serif", "serif"),

	/**
	 * The '<em><b>Sans Serif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * sans-serif.
	 * <!-- end-model-doc -->
	 * @see #SANS_SERIF_VALUE
	 * @generated
	 * @ordered
	 */
	SANS_SERIF(1, "sansSerif", "sans-serif"),

	/**
	 * The '<em><b>Cursive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cursive.
	 * <!-- end-model-doc -->
	 * @see #CURSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSIVE(2, "cursive", "cursive"),

	/**
	 * The '<em><b>Fantasy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fantasy.
	 * <!-- end-model-doc -->
	 * @see #FANTASY_VALUE
	 * @generated
	 * @ordered
	 */
	FANTASY(3, "fantasy", "fantasy"),

	/**
	 * The '<em><b>Monospace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * monospace.
	 * <!-- end-model-doc -->
	 * @see #MONOSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	MONOSPACE(4, "monospace", "monospace");

	/**
	 * The '<em><b>Serif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * serif.
	 * <!-- end-model-doc -->
	 * @see #SERIF
	 * @model name="serif"
	 * @generated
	 * @ordered
	 */
	public static final int SERIF_VALUE = 0;

	/**
	 * The '<em><b>Sans Serif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * sans-serif.
	 * <!-- end-model-doc -->
	 * @see #SANS_SERIF
	 * @model name="sansSerif" literal="sans-serif"
	 * @generated
	 * @ordered
	 */
	public static final int SANS_SERIF_VALUE = 1;

	/**
	 * The '<em><b>Cursive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cursive.
	 * <!-- end-model-doc -->
	 * @see #CURSIVE
	 * @model name="cursive"
	 * @generated
	 * @ordered
	 */
	public static final int CURSIVE_VALUE = 2;

	/**
	 * The '<em><b>Fantasy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fantasy.
	 * <!-- end-model-doc -->
	 * @see #FANTASY
	 * @model name="fantasy"
	 * @generated
	 * @ordered
	 */
	public static final int FANTASY_VALUE = 3;

	/**
	 * The '<em><b>Monospace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * monospace.
	 * <!-- end-model-doc -->
	 * @see #MONOSPACE
	 * @model name="monospace"
	 * @generated
	 * @ordered
	 */
	public static final int MONOSPACE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Font Family</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FontFamily[] VALUES_ARRAY =
		new FontFamily[] {
			SERIF,
			SANS_SERIF,
			CURSIVE,
			FANTASY,
			MONOSPACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Font Family</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FontFamily> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Family</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontFamily get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontFamily result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Family</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontFamily getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontFamily result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Family</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontFamily get(int value) {
		switch (value) {
			case SERIF_VALUE: return SERIF;
			case SANS_SERIF_VALUE: return SANS_SERIF;
			case CURSIVE_VALUE: return CURSIVE;
			case FANTASY_VALUE: return FANTASY;
			case MONOSPACE_VALUE: return MONOSPACE;
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
	private FontFamily(int value, String name, String literal) {
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
	
} //FontFamily
