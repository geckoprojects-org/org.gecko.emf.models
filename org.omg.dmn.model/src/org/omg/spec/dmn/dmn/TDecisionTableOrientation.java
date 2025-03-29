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
 * A representation of the literals of the enumeration '<em><b>TDecision Table Orientation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTableOrientation()
 * @model extendedMetaData="name='tDecisionTableOrientation'"
 * @generated
 */
@ProviderType
public enum TDecisionTableOrientation implements Enumerator {
	/**
	 * The '<em><b>Rule As Row</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_ROW_VALUE
	 * @generated
	 * @ordered
	 */
	RULE_AS_ROW(0, "RuleAsRow", "Rule-as-Row"),

	/**
	 * The '<em><b>Rule As Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	RULE_AS_COLUMN(1, "RuleAsColumn", "Rule-as-Column"),

	/**
	 * The '<em><b>Cross Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_TABLE(2, "CrossTable", "CrossTable");

	/**
	 * The '<em><b>Rule As Row</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_ROW
	 * @model name="RuleAsRow" literal="Rule-as-Row"
	 * @generated
	 * @ordered
	 */
	public static final int RULE_AS_ROW_VALUE = 0;

	/**
	 * The '<em><b>Rule As Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_AS_COLUMN
	 * @model name="RuleAsColumn" literal="Rule-as-Column"
	 * @generated
	 * @ordered
	 */
	public static final int RULE_AS_COLUMN_VALUE = 1;

	/**
	 * The '<em><b>Cross Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_TABLE
	 * @model name="CrossTable"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_TABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>TDecision Table Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TDecisionTableOrientation[] VALUES_ARRAY =
		new TDecisionTableOrientation[] {
			RULE_AS_ROW,
			RULE_AS_COLUMN,
			CROSS_TABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>TDecision Table Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TDecisionTableOrientation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TDecision Table Orientation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TDecisionTableOrientation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDecisionTableOrientation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDecision Table Orientation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TDecisionTableOrientation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDecisionTableOrientation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDecision Table Orientation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TDecisionTableOrientation get(int value) {
		switch (value) {
			case RULE_AS_ROW_VALUE: return RULE_AS_ROW;
			case RULE_AS_COLUMN_VALUE: return RULE_AS_COLUMN;
			case CROSS_TABLE_VALUE: return CROSS_TABLE;
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
	private TDecisionTableOrientation(int value, String name, String literal) {
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
	
} //TDecisionTableOrientation
