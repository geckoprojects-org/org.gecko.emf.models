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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Decoration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * TextDecoration ist ein Aufzählungstyp, welcher die zusätzliche Gestaltung des Textes durch Linien steuert, also z.B. Unterstreichung.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTextDecorationType()
 * @model extendedMetaData="name='TextDecorationType'"
 * @generated
 */
@ProviderType
public enum TextDecorationType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Keine Modifikation des Textes.
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Underline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Text ist zu unterstreichen.
	 * <!-- end-model-doc -->
	 * @see #UNDERLINE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE(1, "underline", "underline"),

	/**
	 * The '<em><b>Line Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Text ist durchzustreichen.
	 * <!-- end-model-doc -->
	 * @see #LINE_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_THROUGH(2, "lineThrough", "lineThrough"),

	/**
	 * The '<em><b>Overline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Text wird mit einer Linie versehen, die über dem Text verläuft.
	 * <!-- end-model-doc -->
	 * @see #OVERLINE_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLINE(3, "overline", "overline");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Keine Modifikation des Textes.
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Underline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Text ist zu unterstreichen.
	 * <!-- end-model-doc -->
	 * @see #UNDERLINE
	 * @model name="underline"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_VALUE = 1;

	/**
	 * The '<em><b>Line Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Text ist durchzustreichen.
	 * <!-- end-model-doc -->
	 * @see #LINE_THROUGH
	 * @model name="lineThrough"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_THROUGH_VALUE = 2;

	/**
	 * The '<em><b>Overline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Text wird mit einer Linie versehen, die über dem Text verläuft.
	 * <!-- end-model-doc -->
	 * @see #OVERLINE
	 * @model name="overline"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLINE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Text Decoration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextDecorationType[] VALUES_ARRAY =
		new TextDecorationType[] {
			NONE,
			UNDERLINE,
			LINE_THROUGH,
			OVERLINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Decoration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextDecorationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Decoration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextDecorationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextDecorationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Decoration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextDecorationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextDecorationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Decoration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextDecorationType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case UNDERLINE_VALUE: return UNDERLINE;
			case LINE_THROUGH_VALUE: return LINE_THROUGH;
			case OVERLINE_VALUE: return OVERLINE;
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
	private TextDecorationType(int value, String name, String literal) {
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
	
} //TextDecorationType
