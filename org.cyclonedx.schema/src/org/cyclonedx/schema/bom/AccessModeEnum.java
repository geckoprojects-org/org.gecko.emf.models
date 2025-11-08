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
package org.cyclonedx.schema.bom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getAccessModeEnum()
 * @model extendedMetaData="name='accessModeEnum'"
 * @generated
 */
@ProviderType
public enum AccessModeEnum implements Enumerator {
	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY(0, "readOnly", "read-only"),

	/**
	 * The '<em><b>Read Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE(1, "readWrite", "read-write"),

	/**
	 * The '<em><b>Read Write Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE_ONCE(2, "readWriteOnce", "read-write-once"),

	/**
	 * The '<em><b>Write Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_ONCE(3, "writeOnce", "write-once"),

	/**
	 * The '<em><b>Write Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_ONLY(4, "writeOnly", "write-only");

	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @model name="readOnly" literal="read-only"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Read Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE
	 * @model name="readWrite" literal="read-write"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_VALUE = 1;

	/**
	 * The '<em><b>Read Write Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ONCE
	 * @model name="readWriteOnce" literal="read-write-once"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_ONCE_VALUE = 2;

	/**
	 * The '<em><b>Write Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONCE
	 * @model name="writeOnce" literal="write-once"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ONCE_VALUE = 3;

	/**
	 * The '<em><b>Write Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY
	 * @model name="writeOnly" literal="write-only"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ONLY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Access Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessModeEnum[] VALUES_ARRAY =
		new AccessModeEnum[] {
			READ_ONLY,
			READ_WRITE,
			READ_WRITE_ONCE,
			WRITE_ONCE,
			WRITE_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessModeEnum get(int value) {
		switch (value) {
			case READ_ONLY_VALUE: return READ_ONLY;
			case READ_WRITE_VALUE: return READ_WRITE;
			case READ_WRITE_ONCE_VALUE: return READ_WRITE_ONCE;
			case WRITE_ONCE_VALUE: return WRITE_ONCE;
			case WRITE_ONLY_VALUE: return WRITE_ONLY;
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
	private AccessModeEnum(int value, String name, String literal) {
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
	
} //AccessModeEnum
