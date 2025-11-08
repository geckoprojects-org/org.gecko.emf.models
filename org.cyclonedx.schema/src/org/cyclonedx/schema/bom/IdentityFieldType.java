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
 * A representation of the literals of the enumeration '<em><b>Identity Field Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentityFieldType()
 * @model extendedMetaData="name='identityFieldType'"
 * @generated
 */
@ProviderType
public enum IdentityFieldType implements Enumerator {
	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(0, "group", "group"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(1, "name", "name"),

	/**
	 * The '<em><b>Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION(2, "version", "version"),

	/**
	 * The '<em><b>Purl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURL_VALUE
	 * @generated
	 * @ordered
	 */
	PURL(3, "purl", "purl"),

	/**
	 * The '<em><b>Cpe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPE_VALUE
	 * @generated
	 * @ordered
	 */
	CPE(4, "cpe", "cpe"),

	/**
	 * The '<em><b>Omnibor Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMNIBOR_ID_VALUE
	 * @generated
	 * @ordered
	 */
	OMNIBOR_ID(5, "omniborId", "omniborId"),

	/**
	 * The '<em><b>Swhid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWHID_VALUE
	 * @generated
	 * @ordered
	 */
	SWHID(6, "swhid", "swhid"),

	/**
	 * The '<em><b>Swid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWID_VALUE
	 * @generated
	 * @ordered
	 */
	SWID(7, "swid", "swid"),

	/**
	 * The '<em><b>Hash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASH_VALUE
	 * @generated
	 * @ordered
	 */
	HASH(8, "hash", "hash");

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP
	 * @model name="group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 0;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 1;

	/**
	 * The '<em><b>Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION
	 * @model name="version"
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_VALUE = 2;

	/**
	 * The '<em><b>Purl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURL
	 * @model name="purl"
	 * @generated
	 * @ordered
	 */
	public static final int PURL_VALUE = 3;

	/**
	 * The '<em><b>Cpe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPE
	 * @model name="cpe"
	 * @generated
	 * @ordered
	 */
	public static final int CPE_VALUE = 4;

	/**
	 * The '<em><b>Omnibor Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMNIBOR_ID
	 * @model name="omniborId"
	 * @generated
	 * @ordered
	 */
	public static final int OMNIBOR_ID_VALUE = 5;

	/**
	 * The '<em><b>Swhid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWHID
	 * @model name="swhid"
	 * @generated
	 * @ordered
	 */
	public static final int SWHID_VALUE = 6;

	/**
	 * The '<em><b>Swid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWID
	 * @model name="swid"
	 * @generated
	 * @ordered
	 */
	public static final int SWID_VALUE = 7;

	/**
	 * The '<em><b>Hash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASH
	 * @model name="hash"
	 * @generated
	 * @ordered
	 */
	public static final int HASH_VALUE = 8;

	/**
	 * An array of all the '<em><b>Identity Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentityFieldType[] VALUES_ARRAY =
		new IdentityFieldType[] {
			GROUP,
			NAME,
			VERSION,
			PURL,
			CPE,
			OMNIBOR_ID,
			SWHID,
			SWID,
			HASH,
		};

	/**
	 * A public read-only list of all the '<em><b>Identity Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentityFieldType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identity Field Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityFieldType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentityFieldType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identity Field Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityFieldType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentityFieldType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identity Field Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentityFieldType get(int value) {
		switch (value) {
			case GROUP_VALUE: return GROUP;
			case NAME_VALUE: return NAME;
			case VERSION_VALUE: return VERSION;
			case PURL_VALUE: return PURL;
			case CPE_VALUE: return CPE;
			case OMNIBOR_ID_VALUE: return OMNIBOR_ID;
			case SWHID_VALUE: return SWHID;
			case SWID_VALUE: return SWID;
			case HASH_VALUE: return HASH;
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
	private IdentityFieldType(int value, String name, String literal) {
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
	
} //IdentityFieldType
