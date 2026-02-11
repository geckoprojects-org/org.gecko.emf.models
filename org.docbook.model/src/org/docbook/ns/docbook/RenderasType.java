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
 * A representation of the literals of the enumeration '<em><b>Renderas Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getRenderasType()
 * @model extendedMetaData="name='renderas_._type'"
 * @generated
 */
@ProviderType
public enum RenderasType implements Enumerator {
	/**
	 * The '<em><b>Sect1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT1_VALUE
	 * @generated
	 * @ordered
	 */
	SECT1(0, "sect1", "sect1"),

	/**
	 * The '<em><b>Sect2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT2_VALUE
	 * @generated
	 * @ordered
	 */
	SECT2(1, "sect2", "sect2"),

	/**
	 * The '<em><b>Sect3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT3_VALUE
	 * @generated
	 * @ordered
	 */
	SECT3(2, "sect3", "sect3"),

	/**
	 * The '<em><b>Sect4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT4_VALUE
	 * @generated
	 * @ordered
	 */
	SECT4(3, "sect4", "sect4"),

	/**
	 * The '<em><b>Sect5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT5_VALUE
	 * @generated
	 * @ordered
	 */
	SECT5(4, "sect5", "sect5"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other");

	/**
	 * The '<em><b>Sect1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT1
	 * @model name="sect1"
	 * @generated
	 * @ordered
	 */
	public static final int SECT1_VALUE = 0;

	/**
	 * The '<em><b>Sect2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT2
	 * @model name="sect2"
	 * @generated
	 * @ordered
	 */
	public static final int SECT2_VALUE = 1;

	/**
	 * The '<em><b>Sect3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT3
	 * @model name="sect3"
	 * @generated
	 * @ordered
	 */
	public static final int SECT3_VALUE = 2;

	/**
	 * The '<em><b>Sect4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT4
	 * @model name="sect4"
	 * @generated
	 * @ordered
	 */
	public static final int SECT4_VALUE = 3;

	/**
	 * The '<em><b>Sect5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECT5
	 * @model name="sect5"
	 * @generated
	 * @ordered
	 */
	public static final int SECT5_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Renderas Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RenderasType[] VALUES_ARRAY =
		new RenderasType[] {
			SECT1,
			SECT2,
			SECT3,
			SECT4,
			SECT5,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Renderas Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RenderasType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Renderas Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RenderasType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RenderasType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Renderas Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RenderasType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RenderasType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Renderas Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RenderasType get(int value) {
		switch (value) {
			case SECT1_VALUE: return SECT1;
			case SECT2_VALUE: return SECT2;
			case SECT3_VALUE: return SECT3;
			case SECT4_VALUE: return SECT4;
			case SECT5_VALUE: return SECT5;
			case OTHER_VALUE: return OTHER;
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
	private RenderasType(int value, String name, String literal) {
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
	
} //RenderasType
