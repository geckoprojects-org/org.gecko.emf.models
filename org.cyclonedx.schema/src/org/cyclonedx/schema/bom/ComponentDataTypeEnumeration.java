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
 * A representation of the literals of the enumeration '<em><b>Component Data Type Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataTypeEnumeration()
 * @model extendedMetaData="name='componentDataTypeEnumeration'"
 * @generated
 */
@ProviderType
public enum ComponentDataTypeEnumeration implements Enumerator {
	/**
	 * The '<em><b>Source Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any type of code, code snippet, or data-as-code.
	 * <!-- end-model-doc -->
	 * @see #SOURCE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_CODE(0, "sourceCode", "source-code"),

	/**
	 * The '<em><b>Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters or settings that may be used by other components.
	 * <!-- end-model-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(1, "configuration", "configuration"),

	/**
	 * The '<em><b>Dataset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of data.
	 * <!-- end-model-doc -->
	 * @see #DATASET_VALUE
	 * @generated
	 * @ordered
	 */
	DATASET(2, "dataset", "dataset"),

	/**
	 * The '<em><b>Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data that can be used to create new instances of what the definition defines.
	 * <!-- end-model-doc -->
	 * @see #DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINITION(3, "definition", "definition"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other type of data that does not fit into existing definitions.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other");

	/**
	 * The '<em><b>Source Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any type of code, code snippet, or data-as-code.
	 * <!-- end-model-doc -->
	 * @see #SOURCE_CODE
	 * @model name="sourceCode" literal="source-code"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_CODE_VALUE = 0;

	/**
	 * The '<em><b>Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters or settings that may be used by other components.
	 * <!-- end-model-doc -->
	 * @see #CONFIGURATION
	 * @model name="configuration"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 1;

	/**
	 * The '<em><b>Dataset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of data.
	 * <!-- end-model-doc -->
	 * @see #DATASET
	 * @model name="dataset"
	 * @generated
	 * @ordered
	 */
	public static final int DATASET_VALUE = 2;

	/**
	 * The '<em><b>Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data that can be used to create new instances of what the definition defines.
	 * <!-- end-model-doc -->
	 * @see #DEFINITION
	 * @model name="definition"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITION_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other type of data that does not fit into existing definitions.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Component Data Type Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentDataTypeEnumeration[] VALUES_ARRAY =
		new ComponentDataTypeEnumeration[] {
			SOURCE_CODE,
			CONFIGURATION,
			DATASET,
			DEFINITION,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Data Type Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentDataTypeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Data Type Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentDataTypeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentDataTypeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Data Type Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentDataTypeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentDataTypeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Data Type Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentDataTypeEnumeration get(int value) {
		switch (value) {
			case SOURCE_CODE_VALUE: return SOURCE_CODE;
			case CONFIGURATION_VALUE: return CONFIGURATION;
			case DATASET_VALUE: return DATASET;
			case DEFINITION_VALUE: return DEFINITION;
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
	private ComponentDataTypeEnumeration(int value, String name, String literal) {
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
	
} //ComponentDataTypeEnumeration
