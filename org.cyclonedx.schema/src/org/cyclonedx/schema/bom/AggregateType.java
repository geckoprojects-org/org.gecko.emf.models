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
 * A representation of the literals of the enumeration '<em><b>Aggregate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getAggregateType()
 * @model extendedMetaData="name='aggregateType'"
 * @generated
 */
@ProviderType
public enum AggregateType implements Enumerator {
	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is complete. No further relationships including constituent components, services, or dependencies are known to exist.
	 * <!-- end-model-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(0, "complete", "complete"),

	/**
	 * The '<em><b>Incomplete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Additional relationships exist and may include constituent components, services, or dependencies.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE(1, "incomplete", "incomplete"),

	/**
	 * The '<em><b>Incomplete First Party Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for first-party components, services, or their dependencies are represented.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_FIRST_PARTY_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE_FIRST_PARTY_ONLY(2, "incompleteFirstPartyOnly", "incomplete_first_party_only"),

	/**
	 * The '<em><b>Incomplete First Party Proprietary Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are proprietary.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY(3, "incompleteFirstPartyProprietaryOnly", "incomplete_first_party_proprietary_only"),

	/**
	 * The '<em><b>Incomplete First Party Opensource Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are opensource.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY(4, "incompleteFirstPartyOpensourceOnly", "incomplete_first_party_opensource_only"),

	/**
	 * The '<em><b>Incomplete Third Party Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_THIRD_PARTY_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE_THIRD_PARTY_ONLY(5, "incompleteThirdPartyOnly", "incomplete_third_party_only"),

	/**
	 * The '<em><b>Incomplete Third Party Proprietary Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are proprietary.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY(6, "incompleteThirdPartyProprietaryOnly", "incomplete_third_party_proprietary_only"),

	/**
	 * The '<em><b>Incomplete Third Party Opensource Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are opensource.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY(7, "incompleteThirdPartyOpensourceOnly", "incomplete_third_party_opensource_only"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship may be complete or incomplete. This usually signifies a 'best-effort' to obtain constituent components, services, or dependencies but the completeness is inconclusive.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(8, "unknown", "unknown"),

	/**
	 * The '<em><b>Not Specified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship completeness is not specified.
	 * <!-- end-model-doc -->
	 * @see #NOT_SPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SPECIFIED(9, "notSpecified", "not_specified");

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is complete. No further relationships including constituent components, services, or dependencies are known to exist.
	 * <!-- end-model-doc -->
	 * @see #COMPLETE
	 * @model name="complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 0;

	/**
	 * The '<em><b>Incomplete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Additional relationships exist and may include constituent components, services, or dependencies.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE
	 * @model name="incomplete"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_VALUE = 1;

	/**
	 * The '<em><b>Incomplete First Party Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for first-party components, services, or their dependencies are represented.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_FIRST_PARTY_ONLY
	 * @model name="incompleteFirstPartyOnly" literal="incomplete_first_party_only"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_FIRST_PARTY_ONLY_VALUE = 2;

	/**
	 * The '<em><b>Incomplete First Party Proprietary Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are proprietary.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY
	 * @model name="incompleteFirstPartyProprietaryOnly" literal="incomplete_first_party_proprietary_only"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY_VALUE = 3;

	/**
	 * The '<em><b>Incomplete First Party Opensource Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are opensource.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY
	 * @model name="incompleteFirstPartyOpensourceOnly" literal="incomplete_first_party_opensource_only"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY_VALUE = 4;

	/**
	 * The '<em><b>Incomplete Third Party Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_THIRD_PARTY_ONLY
	 * @model name="incompleteThirdPartyOnly" literal="incomplete_third_party_only"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_THIRD_PARTY_ONLY_VALUE = 5;

	/**
	 * The '<em><b>Incomplete Third Party Proprietary Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are proprietary.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY
	 * @model name="incompleteThirdPartyProprietaryOnly" literal="incomplete_third_party_proprietary_only"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY_VALUE = 6;

	/**
	 * The '<em><b>Incomplete Third Party Opensource Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship is incomplete. Only relationships for third-party components, services, or their dependencies are represented, limited specifically to those that are opensource.
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY
	 * @model name="incompleteThirdPartyOpensourceOnly" literal="incomplete_third_party_opensource_only"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY_VALUE = 7;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship may be complete or incomplete. This usually signifies a 'best-effort' to obtain constituent components, services, or dependencies but the completeness is inconclusive.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 8;

	/**
	 * The '<em><b>Not Specified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship completeness is not specified.
	 * <!-- end-model-doc -->
	 * @see #NOT_SPECIFIED
	 * @model name="notSpecified" literal="not_specified"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SPECIFIED_VALUE = 9;

	/**
	 * An array of all the '<em><b>Aggregate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggregateType[] VALUES_ARRAY =
		new AggregateType[] {
			COMPLETE,
			INCOMPLETE,
			INCOMPLETE_FIRST_PARTY_ONLY,
			INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY,
			INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY,
			INCOMPLETE_THIRD_PARTY_ONLY,
			INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY,
			INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY,
			UNKNOWN,
			NOT_SPECIFIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Aggregate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AggregateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aggregate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregateType get(int value) {
		switch (value) {
			case COMPLETE_VALUE: return COMPLETE;
			case INCOMPLETE_VALUE: return INCOMPLETE;
			case INCOMPLETE_FIRST_PARTY_ONLY_VALUE: return INCOMPLETE_FIRST_PARTY_ONLY;
			case INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY_VALUE: return INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY;
			case INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY_VALUE: return INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY;
			case INCOMPLETE_THIRD_PARTY_ONLY_VALUE: return INCOMPLETE_THIRD_PARTY_ONLY;
			case INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY_VALUE: return INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY;
			case INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY_VALUE: return INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY;
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOT_SPECIFIED_VALUE: return NOT_SPECIFIED;
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
	private AggregateType(int value, String name, String literal) {
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
	
} //AggregateType
