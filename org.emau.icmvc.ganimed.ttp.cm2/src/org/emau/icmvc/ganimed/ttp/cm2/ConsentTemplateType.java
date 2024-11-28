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
package org.emau.icmvc.ganimed.ttp.cm2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consent Template Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentTemplateType()
 * @model extendedMetaData="name='consentTemplateType'"
 * @generated
 */
@ProviderType
public enum ConsentTemplateType implements Enumerator {
	/**
	 * The '<em><b>CONSENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(0, "CONSENT", "CONSENT"),

	/**
	 * The '<em><b>CONSENTOPTOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENTOPTOUT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENTOPTOUT(1, "CONSENTOPTOUT", "CONSENT_OPT_OUT"),

	/**
	 * The '<em><b>REVOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	REVOCATION(2, "REVOCATION", "REVOCATION"),

	/**
	 * The '<em><b>OBJECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECTION_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECTION(3, "OBJECTION", "OBJECTION"),

	/**
	 * The '<em><b>REFUSAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSAL(4, "REFUSAL", "REFUSAL");

	/**
	 * The '<em><b>CONSENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 0;

	/**
	 * The '<em><b>CONSENTOPTOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENTOPTOUT
	 * @model literal="CONSENT_OPT_OUT"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENTOPTOUT_VALUE = 1;

	/**
	 * The '<em><b>REVOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVOCATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REVOCATION_VALUE = 2;

	/**
	 * The '<em><b>OBJECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBJECTION_VALUE = 3;

	/**
	 * The '<em><b>REFUSAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFUSAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Consent Template Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsentTemplateType[] VALUES_ARRAY =
		new ConsentTemplateType[] {
			CONSENT,
			CONSENTOPTOUT,
			REVOCATION,
			OBJECTION,
			REFUSAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Consent Template Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsentTemplateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consent Template Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentTemplateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentTemplateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Template Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentTemplateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentTemplateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Template Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentTemplateType get(int value) {
		switch (value) {
			case CONSENT_VALUE: return CONSENT;
			case CONSENTOPTOUT_VALUE: return CONSENTOPTOUT;
			case REVOCATION_VALUE: return REVOCATION;
			case OBJECTION_VALUE: return OBJECTION;
			case REFUSAL_VALUE: return REFUSAL;
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
	private ConsentTemplateType(int value, String name, String literal) {
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
	
} //ConsentTemplateType
