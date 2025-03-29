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
package org.omg.spec.dmn.dmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>THit Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTHitPolicy()
 * @model extendedMetaData="name='tHitPolicy'"
 * @generated
 */
@ProviderType
public enum THitPolicy implements Enumerator {
	/**
	 * The '<em><b>UNIQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE(0, "UNIQUE", "UNIQUE"),

	/**
	 * The '<em><b>FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(1, "FIRST", "FIRST"),

	/**
	 * The '<em><b>PRIORITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIORITY(2, "PRIORITY", "PRIORITY"),

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(3, "ANY", "ANY"),

	/**
	 * The '<em><b>COLLECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECT(4, "COLLECT", "COLLECT"),

	/**
	 * The '<em><b>RULEORDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULEORDER_VALUE
	 * @generated
	 * @ordered
	 */
	RULEORDER(5, "RULEORDER", "RULE ORDER"),

	/**
	 * The '<em><b>OUTPUTORDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUTORDER_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUTORDER(6, "OUTPUTORDER", "OUTPUT ORDER");

	/**
	 * The '<em><b>UNIQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_VALUE = 0;

	/**
	 * The '<em><b>FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 1;

	/**
	 * The '<em><b>PRIORITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY_VALUE = 2;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 3;

	/**
	 * The '<em><b>COLLECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLECT_VALUE = 4;

	/**
	 * The '<em><b>RULEORDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULEORDER
	 * @model literal="RULE ORDER"
	 * @generated
	 * @ordered
	 */
	public static final int RULEORDER_VALUE = 5;

	/**
	 * The '<em><b>OUTPUTORDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUTORDER
	 * @model literal="OUTPUT ORDER"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUTORDER_VALUE = 6;

	/**
	 * An array of all the '<em><b>THit Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final THitPolicy[] VALUES_ARRAY =
		new THitPolicy[] {
			UNIQUE,
			FIRST,
			PRIORITY,
			ANY,
			COLLECT,
			RULEORDER,
			OUTPUTORDER,
		};

	/**
	 * A public read-only list of all the '<em><b>THit Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<THitPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>THit Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static THitPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			THitPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>THit Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static THitPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			THitPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>THit Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static THitPolicy get(int value) {
		switch (value) {
			case UNIQUE_VALUE: return UNIQUE;
			case FIRST_VALUE: return FIRST;
			case PRIORITY_VALUE: return PRIORITY;
			case ANY_VALUE: return ANY;
			case COLLECT_VALUE: return COLLECT;
			case RULEORDER_VALUE: return RULEORDER;
			case OUTPUTORDER_VALUE: return OUTPUTORDER;
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
	private THitPolicy(int value, String name, String literal) {
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
	
} //THitPolicy
