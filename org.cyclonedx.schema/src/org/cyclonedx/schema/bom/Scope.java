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
 * A representation of the literals of the enumeration '<em><b>Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getScope()
 * @model extendedMetaData="name='scope'"
 * @generated
 */
@ProviderType
public enum Scope implements Enumerator {
	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component is required for runtime
	 * <!-- end-model-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(0, "required", "required"),

	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component is optional at runtime. Optional components are components that
	 *                         are not capable of being called due to them not be installed or otherwise accessible by any means.
	 *                         Components that are installed but due to configuration or other restrictions are prohibited from
	 *                         being called must be scoped as 'required'.
	 * <!-- end-model-doc -->
	 * @see #OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL(1, "optional", "optional"),

	/**
	 * The '<em><b>Excluded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Components that are excluded provide the ability to document component usage
	 *                         for test and other non-runtime purposes. Excluded components are not reachable within a call
	 *                         graph at runtime.
	 * <!-- end-model-doc -->
	 * @see #EXCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUDED(2, "excluded", "excluded");

	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component is required for runtime
	 * <!-- end-model-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component is optional at runtime. Optional components are components that
	 *                         are not capable of being called due to them not be installed or otherwise accessible by any means.
	 *                         Components that are installed but due to configuration or other restrictions are prohibited from
	 *                         being called must be scoped as 'required'.
	 * <!-- end-model-doc -->
	 * @see #OPTIONAL
	 * @model name="optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_VALUE = 1;

	/**
	 * The '<em><b>Excluded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Components that are excluded provide the ability to document component usage
	 *                         for test and other non-runtime purposes. Excluded components are not reachable within a call
	 *                         graph at runtime.
	 * <!-- end-model-doc -->
	 * @see #EXCLUDED
	 * @model name="excluded"
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUDED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Scope[] VALUES_ARRAY =
		new Scope[] {
			REQUIRED,
			OPTIONAL,
			EXCLUDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Scope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scope get(int value) {
		switch (value) {
			case REQUIRED_VALUE: return REQUIRED;
			case OPTIONAL_VALUE: return OPTIONAL;
			case EXCLUDED_VALUE: return EXCLUDED;
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
	private Scope(int value, String name, String literal) {
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
	
} //Scope
