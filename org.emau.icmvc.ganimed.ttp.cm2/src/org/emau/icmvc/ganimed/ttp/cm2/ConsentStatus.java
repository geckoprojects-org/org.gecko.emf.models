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
 * A representation of the literals of the enumeration '<em><b>Consent Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentStatus()
 * @model extendedMetaData="name='consentStatus'"
 * @generated
 */
@ProviderType
public enum ConsentStatus implements Enumerator {
	/**
	 * The '<em><b>ACCEPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(0, "ACCEPTED", "ACCEPTED"),

	/**
	 * The '<em><b>DECLINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLINED_VALUE
	 * @generated
	 * @ordered
	 */
	DECLINED(1, "DECLINED", "DECLINED"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(2, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>NOTASKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTASKED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTASKED(3, "NOTASKED", "NOT_ASKED"),

	/**
	 * The '<em><b>NOTCHOSEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTCHOSEN_VALUE
	 * @generated
	 * @ordered
	 */
	NOTCHOSEN(4, "NOTCHOSEN", "NOT_CHOSEN"),

	/**
	 * The '<em><b>WITHDRAWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAWN(5, "WITHDRAWN", "WITHDRAWN"),

	/**
	 * The '<em><b>INVALIDATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALIDATED_VALUE
	 * @generated
	 * @ordered
	 */
	INVALIDATED(6, "INVALIDATED", "INVALIDATED"),

	/**
	 * The '<em><b>REFUSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSED_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSED(7, "REFUSED", "REFUSED"),

	/**
	 * The '<em><b>EXPIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPIRED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPIRED(8, "EXPIRED", "EXPIRED"),

	/**
	 * The '<em><b>OBJECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECTED(9, "OBJECTED", "OBJECTED"),

	/**
	 * The '<em><b>ACCEPTEDOPTOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTEDOPTOUT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTEDOPTOUT(10, "ACCEPTEDOPTOUT", "ACCEPTED_OPT_OUT");

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 0;

	/**
	 * The '<em><b>DECLINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECLINED_VALUE = 1;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 2;

	/**
	 * The '<em><b>NOTASKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTASKED
	 * @model literal="NOT_ASKED"
	 * @generated
	 * @ordered
	 */
	public static final int NOTASKED_VALUE = 3;

	/**
	 * The '<em><b>NOTCHOSEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTCHOSEN
	 * @model literal="NOT_CHOSEN"
	 * @generated
	 * @ordered
	 */
	public static final int NOTCHOSEN_VALUE = 4;

	/**
	 * The '<em><b>WITHDRAWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN_VALUE = 5;

	/**
	 * The '<em><b>INVALIDATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALIDATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVALIDATED_VALUE = 6;

	/**
	 * The '<em><b>REFUSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFUSED_VALUE = 7;

	/**
	 * The '<em><b>EXPIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPIRED_VALUE = 8;

	/**
	 * The '<em><b>OBJECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBJECTED_VALUE = 9;

	/**
	 * The '<em><b>ACCEPTEDOPTOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTEDOPTOUT
	 * @model literal="ACCEPTED_OPT_OUT"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTEDOPTOUT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Consent Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsentStatus[] VALUES_ARRAY =
		new ConsentStatus[] {
			ACCEPTED,
			DECLINED,
			UNKNOWN,
			NOTASKED,
			NOTCHOSEN,
			WITHDRAWN,
			INVALIDATED,
			REFUSED,
			EXPIRED,
			OBJECTED,
			ACCEPTEDOPTOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Consent Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsentStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consent Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentStatus get(int value) {
		switch (value) {
			case ACCEPTED_VALUE: return ACCEPTED;
			case DECLINED_VALUE: return DECLINED;
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOTASKED_VALUE: return NOTASKED;
			case NOTCHOSEN_VALUE: return NOTCHOSEN;
			case WITHDRAWN_VALUE: return WITHDRAWN;
			case INVALIDATED_VALUE: return INVALIDATED;
			case REFUSED_VALUE: return REFUSED;
			case EXPIRED_VALUE: return EXPIRED;
			case OBJECTED_VALUE: return OBJECTED;
			case ACCEPTEDOPTOUT_VALUE: return ACCEPTEDOPTOUT;
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
	private ConsentStatus(int value, String name, String literal) {
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
	
} //ConsentStatus
