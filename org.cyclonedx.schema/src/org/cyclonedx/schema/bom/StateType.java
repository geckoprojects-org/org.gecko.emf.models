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
 * A representation of the literals of the enumeration '<em><b>State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getStateType()
 * @model extendedMetaData="name='state_._type'"
 * @generated
 */
@ProviderType
public enum StateType implements Enumerator {
	/**
	 * The '<em><b>Pre Activation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_ACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_ACTIVATION(0, "preActivation", "pre-activation"),

	/**
	 * The '<em><b>Active</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(1, "active", "active"),

	/**
	 * The '<em><b>Suspended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED(2, "suspended", "suspended"),

	/**
	 * The '<em><b>Deactivated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEACTIVATED(3, "deactivated", "deactivated"),

	/**
	 * The '<em><b>Compromised</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPROMISED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPROMISED(4, "compromised", "compromised"),

	/**
	 * The '<em><b>Destroyed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROYED_VALUE
	 * @generated
	 * @ordered
	 */
	DESTROYED(5, "destroyed", "destroyed");

	/**
	 * The '<em><b>Pre Activation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_ACTIVATION
	 * @model name="preActivation" literal="pre-activation"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_ACTIVATION_VALUE = 0;

	/**
	 * The '<em><b>Active</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE
	 * @model name="active"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 1;

	/**
	 * The '<em><b>Suspended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED
	 * @model name="suspended"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_VALUE = 2;

	/**
	 * The '<em><b>Deactivated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATED
	 * @model name="deactivated"
	 * @generated
	 * @ordered
	 */
	public static final int DEACTIVATED_VALUE = 3;

	/**
	 * The '<em><b>Compromised</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPROMISED
	 * @model name="compromised"
	 * @generated
	 * @ordered
	 */
	public static final int COMPROMISED_VALUE = 4;

	/**
	 * The '<em><b>Destroyed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROYED
	 * @model name="destroyed"
	 * @generated
	 * @ordered
	 */
	public static final int DESTROYED_VALUE = 5;

	/**
	 * An array of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateType[] VALUES_ARRAY =
		new StateType[] {
			PRE_ACTIVATION,
			ACTIVE,
			SUSPENDED,
			DEACTIVATED,
			COMPROMISED,
			DESTROYED,
		};

	/**
	 * A public read-only list of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateType get(int value) {
		switch (value) {
			case PRE_ACTIVATION_VALUE: return PRE_ACTIVATION;
			case ACTIVE_VALUE: return ACTIVE;
			case SUSPENDED_VALUE: return SUSPENDED;
			case DEACTIVATED_VALUE: return DEACTIVATED;
			case COMPROMISED_VALUE: return COMPROMISED;
			case DESTROYED_VALUE: return DESTROYED;
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
	private StateType(int value, String name, String literal) {
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
	
} //StateType
