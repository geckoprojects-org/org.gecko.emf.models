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
package net.opengis.wfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Identifier Generation Option Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.wfs.WFSPackage#getIdentifierGenerationOptionType()
 * @model extendedMetaData="name='IdentifierGenerationOptionType'"
 * @generated
 */
@ProviderType
public enum IdentifierGenerationOptionType implements Enumerator {
	/**
	 * The '<em><b>Use Existing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The UseExsiting value indicates that WFS should not
	 *                   generate a new feature identifier for the feature
	 *                   being inserted into the repositry.  Instead, the WFS
	 *                   should use the identifier encoded if the feature.  
	 *                   If a duplicate exists then the WFS should raise an
	 *                   exception.
	 *                
	 * <!-- end-model-doc -->
	 * @see #USE_EXISTING_VALUE
	 * @generated
	 * @ordered
	 */
	USE_EXISTING(0, "UseExisting", "UseExisting"),

	/**
	 * The '<em><b>Replace Duplicate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The ReplaceDuplicate value indicates that WFS should
	 *                   not generate a new feature identifier for the feature
	 *                   being inserted into the repositry.  Instead, the WFS
	 *                   should use the identifier encoded if the feature.  
	 *                   If a duplicate exists then the WFS should replace the
	 *                   existing feature instance with the one encoded in the
	 *                   Insert action.
	 *                
	 * <!-- end-model-doc -->
	 * @see #REPLACE_DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE_DUPLICATE(1, "ReplaceDuplicate", "ReplaceDuplicate"),

	/**
	 * The '<em><b>Generate New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The GenerateNew value indicates that WFS should
	 *                   generate a new unique feature identifier for the
	 *                   feature being inserted into the repositry.
	 *                
	 * <!-- end-model-doc -->
	 * @see #GENERATE_NEW_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATE_NEW(2, "GenerateNew", "GenerateNew");

	/**
	 * The '<em><b>Use Existing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The UseExsiting value indicates that WFS should not
	 *                   generate a new feature identifier for the feature
	 *                   being inserted into the repositry.  Instead, the WFS
	 *                   should use the identifier encoded if the feature.  
	 *                   If a duplicate exists then the WFS should raise an
	 *                   exception.
	 *                
	 * <!-- end-model-doc -->
	 * @see #USE_EXISTING
	 * @model name="UseExisting"
	 * @generated
	 * @ordered
	 */
	public static final int USE_EXISTING_VALUE = 0;

	/**
	 * The '<em><b>Replace Duplicate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The ReplaceDuplicate value indicates that WFS should
	 *                   not generate a new feature identifier for the feature
	 *                   being inserted into the repositry.  Instead, the WFS
	 *                   should use the identifier encoded if the feature.  
	 *                   If a duplicate exists then the WFS should replace the
	 *                   existing feature instance with the one encoded in the
	 *                   Insert action.
	 *                
	 * <!-- end-model-doc -->
	 * @see #REPLACE_DUPLICATE
	 * @model name="ReplaceDuplicate"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_DUPLICATE_VALUE = 1;

	/**
	 * The '<em><b>Generate New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The GenerateNew value indicates that WFS should
	 *                   generate a new unique feature identifier for the
	 *                   feature being inserted into the repositry.
	 *                
	 * <!-- end-model-doc -->
	 * @see #GENERATE_NEW
	 * @model name="GenerateNew"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_NEW_VALUE = 2;

	/**
	 * An array of all the '<em><b>Identifier Generation Option Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentifierGenerationOptionType[] VALUES_ARRAY =
		new IdentifierGenerationOptionType[] {
			USE_EXISTING,
			REPLACE_DUPLICATE,
			GENERATE_NEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Identifier Generation Option Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentifierGenerationOptionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identifier Generation Option Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierGenerationOptionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierGenerationOptionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Generation Option Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierGenerationOptionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierGenerationOptionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Generation Option Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierGenerationOptionType get(int value) {
		switch (value) {
			case USE_EXISTING_VALUE: return USE_EXISTING;
			case REPLACE_DUPLICATE_VALUE: return REPLACE_DUPLICATE;
			case GENERATE_NEW_VALUE: return GENERATE_NEW;
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
	private IdentifierGenerationOptionType(int value, String name, String literal) {
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
	
} //IdentifierGenerationOptionType
