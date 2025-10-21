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
 * A representation of the literals of the enumeration '<em><b>Basic Object Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Dieser Aufzählungstyp unterscheidet REOs, NREOs und ZUSOs.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBasicObjectTypeType()
 * @model extendedMetaData="name='BasicObjectTypeType'"
 * @generated
 */
@ProviderType
public enum BasicObjectTypeType implements Enumerator {
	/**
	 * The '<em><b>Reo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REO_VALUE
	 * @generated
	 * @ordered
	 */
	REO(0, "reo", "reo"),

	/**
	 * The '<em><b>Nreo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NREO_VALUE
	 * @generated
	 * @ordered
	 */
	NREO(1, "nreo", "nreo"),

	/**
	 * The '<em><b>Zuso</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZUSO_VALUE
	 * @generated
	 * @ordered
	 */
	ZUSO(2, "zuso", "zuso");

	/**
	 * The '<em><b>Reo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REO
	 * @model name="reo"
	 * @generated
	 * @ordered
	 */
	public static final int REO_VALUE = 0;

	/**
	 * The '<em><b>Nreo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NREO
	 * @model name="nreo"
	 * @generated
	 * @ordered
	 */
	public static final int NREO_VALUE = 1;

	/**
	 * The '<em><b>Zuso</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZUSO
	 * @model name="zuso"
	 * @generated
	 * @ordered
	 */
	public static final int ZUSO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Basic Object Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasicObjectTypeType[] VALUES_ARRAY =
		new BasicObjectTypeType[] {
			REO,
			NREO,
			ZUSO,
		};

	/**
	 * A public read-only list of all the '<em><b>Basic Object Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BasicObjectTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basic Object Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BasicObjectTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasicObjectTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basic Object Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BasicObjectTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasicObjectTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basic Object Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BasicObjectTypeType get(int value) {
		switch (value) {
			case REO_VALUE: return REO;
			case NREO_VALUE: return NREO;
			case ZUSO_VALUE: return ZUSO;
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
	private BasicObjectTypeType(int value, String name, String literal) {
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
	
} //BasicObjectTypeType
