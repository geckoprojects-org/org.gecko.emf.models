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
 * A representation of the literals of the enumeration '<em><b>Class Type13</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getClassType13()
 * @model extendedMetaData="name='class_._13_._type'"
 * @generated
 */
@ProviderType
public enum ClassType13 implements Enumerator {
	/**
	 * The '<em><b>Devicefile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICEFILE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICEFILE(0, "devicefile", "devicefile"),

	/**
	 * The '<em><b>Directory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTORY_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTORY(1, "directory", "directory"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(2, "extension", "extension"),

	/**
	 * The '<em><b>Headerfile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADERFILE_VALUE
	 * @generated
	 * @ordered
	 */
	HEADERFILE(3, "headerfile", "headerfile"),

	/**
	 * The '<em><b>Libraryfile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARYFILE_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARYFILE(4, "libraryfile", "libraryfile"),

	/**
	 * The '<em><b>Partition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_VALUE
	 * @generated
	 * @ordered
	 */
	PARTITION(5, "partition", "partition"),

	/**
	 * The '<em><b>Symlink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMLINK_VALUE
	 * @generated
	 * @ordered
	 */
	SYMLINK(6, "symlink", "symlink");

	/**
	 * The '<em><b>Devicefile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICEFILE
	 * @model name="devicefile"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICEFILE_VALUE = 0;

	/**
	 * The '<em><b>Directory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTORY
	 * @model name="directory"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTORY_VALUE = 1;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 2;

	/**
	 * The '<em><b>Headerfile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADERFILE
	 * @model name="headerfile"
	 * @generated
	 * @ordered
	 */
	public static final int HEADERFILE_VALUE = 3;

	/**
	 * The '<em><b>Libraryfile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARYFILE
	 * @model name="libraryfile"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARYFILE_VALUE = 4;

	/**
	 * The '<em><b>Partition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION
	 * @model name="partition"
	 * @generated
	 * @ordered
	 */
	public static final int PARTITION_VALUE = 5;

	/**
	 * The '<em><b>Symlink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMLINK
	 * @model name="symlink"
	 * @generated
	 * @ordered
	 */
	public static final int SYMLINK_VALUE = 6;

	/**
	 * An array of all the '<em><b>Class Type13</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassType13[] VALUES_ARRAY =
		new ClassType13[] {
			DEVICEFILE,
			DIRECTORY,
			EXTENSION,
			HEADERFILE,
			LIBRARYFILE,
			PARTITION,
			SYMLINK,
		};

	/**
	 * A public read-only list of all the '<em><b>Class Type13</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassType13> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Type13</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType13 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType13 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type13</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType13 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassType13 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Type13</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassType13 get(int value) {
		switch (value) {
			case DEVICEFILE_VALUE: return DEVICEFILE;
			case DIRECTORY_VALUE: return DIRECTORY;
			case EXTENSION_VALUE: return EXTENSION;
			case HEADERFILE_VALUE: return HEADERFILE;
			case LIBRARYFILE_VALUE: return LIBRARYFILE;
			case PARTITION_VALUE: return PARTITION;
			case SYMLINK_VALUE: return SYMLINK;
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
	private ClassType13(int value, String name, String literal) {
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
	
} //ClassType13
