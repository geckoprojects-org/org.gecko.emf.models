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
 * A representation of the literals of the enumeration '<em><b>Execution Environment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getExecutionEnvironmentType()
 * @model extendedMetaData="name='executionEnvironment_._type'"
 * @generated
 */
@ProviderType
public enum ExecutionEnvironmentType implements Enumerator {
	/**
	 * The '<em><b>Software Plain Ram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A software implementation running in plain unencrypted RAM.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_PLAIN_RAM_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_PLAIN_RAM(0, "softwarePlainRam", "software-plain-ram"),

	/**
	 * The '<em><b>Software Encrypted Ram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A software implementation running in encrypted RAM.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_ENCRYPTED_RAM_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_ENCRYPTED_RAM(1, "softwareEncryptedRam", "software-encrypted-ram"),

	/**
	 * The '<em><b>Software Tee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             A software implementation running in a trusted execution environment.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_TEE_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_TEE(2, "softwareTee", "software-tee"),

	/**
	 * The '<em><b>Hardware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             A hardware implementation.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #HARDWARE_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE(3, "hardware", "hardware"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             Another implementation environment.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             The execution environment is not known.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(5, "unknown", "unknown");

	/**
	 * The '<em><b>Software Plain Ram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A software implementation running in plain unencrypted RAM.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_PLAIN_RAM
	 * @model name="softwarePlainRam" literal="software-plain-ram"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_PLAIN_RAM_VALUE = 0;

	/**
	 * The '<em><b>Software Encrypted Ram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A software implementation running in encrypted RAM.
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_ENCRYPTED_RAM
	 * @model name="softwareEncryptedRam" literal="software-encrypted-ram"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_ENCRYPTED_RAM_VALUE = 1;

	/**
	 * The '<em><b>Software Tee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             A software implementation running in a trusted execution environment.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_TEE
	 * @model name="softwareTee" literal="software-tee"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_TEE_VALUE = 2;

	/**
	 * The '<em><b>Hardware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             A hardware implementation.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #HARDWARE
	 * @model name="hardware"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             Another implementation environment.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             The execution environment is not known.
	 *                                         
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Execution Environment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExecutionEnvironmentType[] VALUES_ARRAY =
		new ExecutionEnvironmentType[] {
			SOFTWARE_PLAIN_RAM,
			SOFTWARE_ENCRYPTED_RAM,
			SOFTWARE_TEE,
			HARDWARE,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Execution Environment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExecutionEnvironmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Execution Environment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionEnvironmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionEnvironmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Environment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionEnvironmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionEnvironmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Environment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionEnvironmentType get(int value) {
		switch (value) {
			case SOFTWARE_PLAIN_RAM_VALUE: return SOFTWARE_PLAIN_RAM;
			case SOFTWARE_ENCRYPTED_RAM_VALUE: return SOFTWARE_ENCRYPTED_RAM;
			case SOFTWARE_TEE_VALUE: return SOFTWARE_TEE;
			case HARDWARE_VALUE: return HARDWARE;
			case OTHER_VALUE: return OTHER;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private ExecutionEnvironmentType(int value, String name, String literal) {
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
	
} //ExecutionEnvironmentType
