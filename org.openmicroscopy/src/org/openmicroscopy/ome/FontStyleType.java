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
 * A representation of the literals of the enumeration '<em><b>Font Style Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *             The style and weight applied to the text.  [enumeration]
 *             This is a simplified combination of the HTML/CSS
 *             attributes font-style AND font-weight.
 *           
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getFontStyleType()
 * @model extendedMetaData="name='FontStyle_._type'"
 * @generated
 */
@ProviderType
public enum FontStyleType implements Enumerator {
	/**
	 * The '<em><b>Bold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD(0, "Bold", "Bold"),

	/**
	 * The '<em><b>Bold Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD_ITALIC(1, "BoldItalic", "BoldItalic"),

	/**
	 * The '<em><b>Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIC(2, "Italic", "Italic"),

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(3, "Normal", "Normal");

	/**
	 * The '<em><b>Bold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD
	 * @model name="Bold"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_VALUE = 0;

	/**
	 * The '<em><b>Bold Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_ITALIC
	 * @model name="BoldItalic"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_ITALIC_VALUE = 1;

	/**
	 * The '<em><b>Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIC
	 * @model name="Italic"
	 * @generated
	 * @ordered
	 */
	public static final int ITALIC_VALUE = 2;

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Font Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FontStyleType[] VALUES_ARRAY =
		new FontStyleType[] {
			BOLD,
			BOLD_ITALIC,
			ITALIC,
			NORMAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Font Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FontStyleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Style Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontStyleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontStyleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Style Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontStyleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontStyleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Style Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontStyleType get(int value) {
		switch (value) {
			case BOLD_VALUE: return BOLD;
			case BOLD_ITALIC_VALUE: return BOLD_ITALIC;
			case ITALIC_VALUE: return ITALIC;
			case NORMAL_VALUE: return NORMAL;
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
	private FontStyleType(int value, String name, String literal) {
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
	
} //FontStyleType
