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
package net.opengis.kml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>List Item Type Enum Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.kml.KMLPackage#getListItemTypeEnumType()
 * @model extendedMetaData="name='listItemTypeEnumType'"
 * @generated
 */
@ProviderType
public enum ListItemTypeEnumType implements Enumerator {
	/**
	 * The '<em><b>Radio Folder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_FOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_FOLDER(0, "radioFolder", "radioFolder"),

	/**
	 * The '<em><b>Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK(1, "check", "check"),

	/**
	 * The '<em><b>Check Hide Children</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_HIDE_CHILDREN_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_HIDE_CHILDREN(2, "checkHideChildren", "checkHideChildren"),

	/**
	 * The '<em><b>Check Off Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_OFF_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_OFF_ONLY(3, "checkOffOnly", "checkOffOnly");

	/**
	 * The '<em><b>Radio Folder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_FOLDER
	 * @model name="radioFolder"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_FOLDER_VALUE = 0;

	/**
	 * The '<em><b>Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK
	 * @model name="check"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_VALUE = 1;

	/**
	 * The '<em><b>Check Hide Children</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_HIDE_CHILDREN
	 * @model name="checkHideChildren"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_HIDE_CHILDREN_VALUE = 2;

	/**
	 * The '<em><b>Check Off Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_OFF_ONLY
	 * @model name="checkOffOnly"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_OFF_ONLY_VALUE = 3;

	/**
	 * An array of all the '<em><b>List Item Type Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ListItemTypeEnumType[] VALUES_ARRAY =
		new ListItemTypeEnumType[] {
			RADIO_FOLDER,
			CHECK,
			CHECK_HIDE_CHILDREN,
			CHECK_OFF_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>List Item Type Enum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ListItemTypeEnumType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>List Item Type Enum Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListItemTypeEnumType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListItemTypeEnumType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Item Type Enum Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListItemTypeEnumType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListItemTypeEnumType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Item Type Enum Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListItemTypeEnumType get(int value) {
		switch (value) {
			case RADIO_FOLDER_VALUE: return RADIO_FOLDER;
			case CHECK_VALUE: return CHECK;
			case CHECK_HIDE_CHILDREN_VALUE: return CHECK_HIDE_CHILDREN;
			case CHECK_OFF_ONLY_VALUE: return CHECK_OFF_ONLY;
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
	private ListItemTypeEnumType(int value, String name, String literal) {
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
	
} //ListItemTypeEnumType
