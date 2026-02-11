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
 * A representation of the literals of the enumeration '<em><b>Class Type10</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getClassType10()
 * @model extendedMetaData="name='class_._10_._type'"
 * @generated
 */
@ProviderType
public enum ClassType10 implements Enumerator {
	/**
	 * The '<em><b>Copyeditor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPYEDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	COPYEDITOR(0, "copyeditor", "copyeditor"),

	/**
	 * The '<em><b>Graphicdesigner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICDESIGNER_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHICDESIGNER(1, "graphicdesigner", "graphicdesigner"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "other", "other"),

	/**
	 * The '<em><b>Productioneditor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTIONEDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTIONEDITOR(3, "productioneditor", "productioneditor"),

	/**
	 * The '<em><b>Technicaleditor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICALEDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICALEDITOR(4, "technicaleditor", "technicaleditor"),

	/**
	 * The '<em><b>Translator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATOR_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSLATOR(5, "translator", "translator");

	/**
	 * The '<em><b>Copyeditor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPYEDITOR
	 * @model name="copyeditor"
	 * @generated
	 * @ordered
	 */
	public static final int COPYEDITOR_VALUE = 0;

	/**
	 * The '<em><b>Graphicdesigner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICDESIGNER
	 * @model name="graphicdesigner"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHICDESIGNER_VALUE = 1;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>Productioneditor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTIONEDITOR
	 * @model name="productioneditor"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTIONEDITOR_VALUE = 3;

	/**
	 * The '<em><b>Technicaleditor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICALEDITOR
	 * @model name="technicaleditor"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICALEDITOR_VALUE = 4;

	/**
	 * The '<em><b>Translator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATOR
	 * @model name="translator"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSLATOR_VALUE = 5;

	/**
	 * An array of all the '<em><b>Class Type10</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassType10[] VALUES_ARRAY =
		new ClassType10[] {
			COPYEDITOR,
			GRAPHICDESIGNER,
			OTHER,
			PRODUCTIONEDITOR,
			TECHNICALEDITOR,
			TRANSLATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Class Type10</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassType10> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Type10</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType10 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType10 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type10</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType10 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType10 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type10</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType10 get(int value) {
		switch (value) {
			case COPYEDITOR_VALUE: return COPYEDITOR;
			case GRAPHICDESIGNER_VALUE: return GRAPHICDESIGNER;
			case OTHER_VALUE: return OTHER;
			case PRODUCTIONEDITOR_VALUE: return PRODUCTIONEDITOR;
			case TECHNICALEDITOR_VALUE: return TECHNICALEDITOR;
			case TRANSLATOR_VALUE: return TRANSLATOR;
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
	private ClassType10(int value, String name, String literal) {
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
	
} //ClassType10
