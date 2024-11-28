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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consent Field</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getConsentField()
 * @model extendedMetaData="name='consentField'"
 * @generated
 */
@ProviderType
public enum ConsentField implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(1, "DATE", "DATE"),

	/**
	 * The '<em><b>CTVERSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTVERSION_VALUE
	 * @generated
	 * @ordered
	 */
	CTVERSION(2, "CTVERSION", "CT_VERSION"),

	/**
	 * The '<em><b>CTNAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTNAME_VALUE
	 * @generated
	 * @ordered
	 */
	CTNAME(3, "CTNAME", "CT_NAME"),

	/**
	 * The '<em><b>CTLABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTLABEL_VALUE
	 * @generated
	 * @ordered
	 */
	CTLABEL(4, "CTLABEL", "CT_LABEL"),

	/**
	 * The '<em><b>SIGNERID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNERID_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNERID(5, "SIGNERID", "SIGNER_ID"),

	/**
	 * The '<em><b>QCTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QCTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	QCTYPE(6, "QCTYPE", "QC_TYPE");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 1;

	/**
	 * The '<em><b>CTVERSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTVERSION
	 * @model literal="CT_VERSION"
	 * @generated
	 * @ordered
	 */
	public static final int CTVERSION_VALUE = 2;

	/**
	 * The '<em><b>CTNAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTNAME
	 * @model literal="CT_NAME"
	 * @generated
	 * @ordered
	 */
	public static final int CTNAME_VALUE = 3;

	/**
	 * The '<em><b>CTLABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTLABEL
	 * @model literal="CT_LABEL"
	 * @generated
	 * @ordered
	 */
	public static final int CTLABEL_VALUE = 4;

	/**
	 * The '<em><b>SIGNERID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNERID
	 * @model literal="SIGNER_ID"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNERID_VALUE = 5;

	/**
	 * The '<em><b>QCTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QCTYPE
	 * @model literal="QC_TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int QCTYPE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Consent Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsentField[] VALUES_ARRAY =
		new ConsentField[] {
			NONE,
			DATE,
			CTVERSION,
			CTNAME,
			CTLABEL,
			SIGNERID,
			QCTYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Consent Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsentField> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consent Field</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentField get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentField result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Field</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentField getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentField result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Field</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentField get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case DATE_VALUE: return DATE;
			case CTVERSION_VALUE: return CTVERSION;
			case CTNAME_VALUE: return CTNAME;
			case CTLABEL_VALUE: return CTLABEL;
			case SIGNERID_VALUE: return SIGNERID;
			case QCTYPE_VALUE: return QCTYPE;
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
	private ConsentField(int value, String name, String literal) {
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
	
} //ConsentField
