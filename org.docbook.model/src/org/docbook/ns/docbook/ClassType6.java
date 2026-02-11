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
 * A representation of the literals of the enumeration '<em><b>Class Type6</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getClassType6()
 * @model extendedMetaData="name='class_._6_._type'"
 * @generated
 */
@ProviderType
public enum ClassType6 implements Enumerator {
	/**
	 * The '<em><b>Doi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI_VALUE
	 * @generated
	 * @ordered
	 */
	DOI(0, "doi", "doi"),

	/**
	 * The '<em><b>Isbn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISBN_VALUE
	 * @generated
	 * @ordered
	 */
	ISBN(1, "isbn", "isbn"),

	/**
	 * The '<em><b>Isrn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISRN_VALUE
	 * @generated
	 * @ordered
	 */
	ISRN(2, "isrn", "isrn"),

	/**
	 * The '<em><b>Issn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSN_VALUE
	 * @generated
	 * @ordered
	 */
	ISSN(3, "issn", "issn"),

	/**
	 * The '<em><b>Libraryofcongress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARYOFCONGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARYOFCONGRESS(4, "libraryofcongress", "libraryofcongress"),

	/**
	 * The '<em><b>Pubsnumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBSNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	PUBSNUMBER(5, "pubsnumber", "pubsnumber"),

	/**
	 * The '<em><b>Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_VALUE
	 * @generated
	 * @ordered
	 */
	URI(6, "uri", "uri"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "other", "other");

	/**
	 * The '<em><b>Doi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOI
	 * @model name="doi"
	 * @generated
	 * @ordered
	 */
	public static final int DOI_VALUE = 0;

	/**
	 * The '<em><b>Isbn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISBN
	 * @model name="isbn"
	 * @generated
	 * @ordered
	 */
	public static final int ISBN_VALUE = 1;

	/**
	 * The '<em><b>Isrn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISRN
	 * @model name="isrn"
	 * @generated
	 * @ordered
	 */
	public static final int ISRN_VALUE = 2;

	/**
	 * The '<em><b>Issn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSN
	 * @model name="issn"
	 * @generated
	 * @ordered
	 */
	public static final int ISSN_VALUE = 3;

	/**
	 * The '<em><b>Libraryofcongress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARYOFCONGRESS
	 * @model name="libraryofcongress"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARYOFCONGRESS_VALUE = 4;

	/**
	 * The '<em><b>Pubsnumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBSNUMBER
	 * @model name="pubsnumber"
	 * @generated
	 * @ordered
	 */
	public static final int PUBSNUMBER_VALUE = 5;

	/**
	 * The '<em><b>Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI
	 * @model name="uri"
	 * @generated
	 * @ordered
	 */
	public static final int URI_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Class Type6</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassType6[] VALUES_ARRAY =
		new ClassType6[] {
			DOI,
			ISBN,
			ISRN,
			ISSN,
			LIBRARYOFCONGRESS,
			PUBSNUMBER,
			URI,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Class Type6</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassType6> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Type6</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType6 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType6 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type6</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType6 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType6 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type6</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType6 get(int value) {
		switch (value) {
			case DOI_VALUE: return DOI;
			case ISBN_VALUE: return ISBN;
			case ISRN_VALUE: return ISRN;
			case ISSN_VALUE: return ISSN;
			case LIBRARYOFCONGRESS_VALUE: return LIBRARYOFCONGRESS;
			case PUBSNUMBER_VALUE: return PUBSNUMBER;
			case URI_VALUE: return URI;
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
	private ClassType6(int value, String name, String literal) {
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
	
} //ClassType6
