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
 * A representation of the literals of the enumeration '<em><b>Class Type19</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getClassType19()
 * @model extendedMetaData="name='class_._19_._type'"
 * @generated
 */
@ProviderType
public enum ClassType19 implements Enumerator {
	/**
	 * The '<em><b>Faq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAQ_VALUE
	 * @generated
	 * @ordered
	 */
	FAQ(0, "faq", "faq"),

	/**
	 * The '<em><b>Journalarticle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNALARTICLE_VALUE
	 * @generated
	 * @ordered
	 */
	JOURNALARTICLE(1, "journalarticle", "journalarticle"),

	/**
	 * The '<em><b>Productsheet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTSHEET_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTSHEET(2, "productsheet", "productsheet"),

	/**
	 * The '<em><b>Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFICATION(3, "specification", "specification"),

	/**
	 * The '<em><b>Techreport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHREPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TECHREPORT(4, "techreport", "techreport"),

	/**
	 * The '<em><b>Whitepaper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITEPAPER_VALUE
	 * @generated
	 * @ordered
	 */
	WHITEPAPER(5, "whitepaper", "whitepaper");

	/**
	 * The '<em><b>Faq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAQ
	 * @model name="faq"
	 * @generated
	 * @ordered
	 */
	public static final int FAQ_VALUE = 0;

	/**
	 * The '<em><b>Journalarticle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNALARTICLE
	 * @model name="journalarticle"
	 * @generated
	 * @ordered
	 */
	public static final int JOURNALARTICLE_VALUE = 1;

	/**
	 * The '<em><b>Productsheet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTSHEET
	 * @model name="productsheet"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTSHEET_VALUE = 2;

	/**
	 * The '<em><b>Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIFICATION
	 * @model name="specification"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION_VALUE = 3;

	/**
	 * The '<em><b>Techreport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHREPORT
	 * @model name="techreport"
	 * @generated
	 * @ordered
	 */
	public static final int TECHREPORT_VALUE = 4;

	/**
	 * The '<em><b>Whitepaper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITEPAPER
	 * @model name="whitepaper"
	 * @generated
	 * @ordered
	 */
	public static final int WHITEPAPER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Class Type19</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassType19[] VALUES_ARRAY =
		new ClassType19[] {
			FAQ,
			JOURNALARTICLE,
			PRODUCTSHEET,
			SPECIFICATION,
			TECHREPORT,
			WHITEPAPER,
		};

	/**
	 * A public read-only list of all the '<em><b>Class Type19</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassType19> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Type19</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType19 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType19 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type19</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType19 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType19 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type19</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType19 get(int value) {
		switch (value) {
			case FAQ_VALUE: return FAQ;
			case JOURNALARTICLE_VALUE: return JOURNALARTICLE;
			case PRODUCTSHEET_VALUE: return PRODUCTSHEET;
			case SPECIFICATION_VALUE: return SPECIFICATION;
			case TECHREPORT_VALUE: return TECHREPORT;
			case WHITEPAPER_VALUE: return WHITEPAPER;
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
	private ClassType19(int value, String name, String literal) {
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
	
} //ClassType19
