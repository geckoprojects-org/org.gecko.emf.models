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
package org.omg.spec.cmmn.casemodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Type Enum Member1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getDecisionTypeEnumMember1()
 * @model extendedMetaData="name='DecisionTypeEnum_._member_._1'"
 * @generated
 */
@ProviderType
public enum DecisionTypeEnumMember1 implements Enumerator {
	/**
	 * The '<em><b>Http Www Omg Org Spec CMMN Decision Type DMN1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1(0, "httpWwwOmgOrgSpecCMMNDecisionTypeDMN1", "http://www.omg.org/spec/CMMN/DecisionType/DMN1"),

	/**
	 * The '<em><b>Http Www Omg Org Spec CMMN Decision Type Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN(1, "httpWwwOmgOrgSpecCMMNDecisionTypeUnknown", "http://www.omg.org/spec/CMMN/DecisionType/Unknown"),

	/**
	 * The '<em><b>Http Www Omg Org Spec CMMN Decision Type Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED(2, "httpWwwOmgOrgSpecCMMNDecisionTypeUnspecified", "http://www.omg.org/spec/CMMN/DecisionType/Unspecified");

	/**
	 * The '<em><b>Http Www Omg Org Spec CMMN Decision Type DMN1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1
	 * @model name="httpWwwOmgOrgSpecCMMNDecisionTypeDMN1" literal="http://www.omg.org/spec/CMMN/DecisionType/DMN1"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1_VALUE = 0;

	/**
	 * The '<em><b>Http Www Omg Org Spec CMMN Decision Type Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN
	 * @model name="httpWwwOmgOrgSpecCMMNDecisionTypeUnknown" literal="http://www.omg.org/spec/CMMN/DecisionType/Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN_VALUE = 1;

	/**
	 * The '<em><b>Http Www Omg Org Spec CMMN Decision Type Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED
	 * @model name="httpWwwOmgOrgSpecCMMNDecisionTypeUnspecified" literal="http://www.omg.org/spec/CMMN/DecisionType/Unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Decision Type Enum Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionTypeEnumMember1[] VALUES_ARRAY =
		new DecisionTypeEnumMember1[] {
			HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1,
			HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN,
			HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Type Enum Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionTypeEnumMember1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Type Enum Member1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionTypeEnumMember1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionTypeEnumMember1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Type Enum Member1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionTypeEnumMember1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionTypeEnumMember1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Type Enum Member1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionTypeEnumMember1 get(int value) {
		switch (value) {
			case HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1_VALUE: return HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1;
			case HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN_VALUE: return HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN;
			case HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED_VALUE: return HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED;
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
	private DecisionTypeEnumMember1(int value, String name, String literal) {
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
	
} //DecisionTypeEnumMember1
