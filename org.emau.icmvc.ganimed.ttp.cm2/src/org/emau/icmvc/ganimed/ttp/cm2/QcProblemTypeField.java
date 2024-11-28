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
 * A representation of the literals of the enumeration '<em><b>Qc Problem Type Field</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemTypeField()
 * @model extendedMetaData="name='qcProblemTypeField'"
 * @generated
 */
@ProviderType
public enum QcProblemTypeField implements Enumerator {
	/**
	 * The '<em><b>TEMPLATENAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATENAME_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATENAME(0, "TEMPLATENAME", "TEMPLATE_NAME"),

	/**
	 * The '<em><b>TEMPLATEVERSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATEVERSION_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATEVERSION(1, "TEMPLATEVERSION", "TEMPLATE_VERSION"),

	/**
	 * The '<em><b>MODULESTATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULESTATUS_VALUE
	 * @generated
	 * @ordered
	 */
	MODULESTATUS(2, "MODULESTATUS", "MODULE_STATUS"),

	/**
	 * The '<em><b>SIGNERIDVALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNERIDVALUE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNERIDVALUE(3, "SIGNERIDVALUE", "SIGNER_ID_VALUE"),

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTLOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTLOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPARTICIPANTLOCATION(4, "SIGNATUREPARTICIPANTLOCATION", "SIGNATURE_PARTICIPANT_LOCATION"),

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTDATE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPARTICIPANTDATE(5, "SIGNATUREPARTICIPANTDATE", "SIGNATURE_PARTICIPANT_DATE"),

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTDIGITAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTDIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPARTICIPANTDIGITAL(6, "SIGNATUREPARTICIPANTDIGITAL", "SIGNATURE_PARTICIPANT_DIGITAL"),

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTPAPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTPAPER_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPARTICIPANTPAPER(7, "SIGNATUREPARTICIPANTPAPER", "SIGNATURE_PARTICIPANT_PAPER"),

	/**
	 * The '<em><b>SIGNATUREPHYSICIANLOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANLOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPHYSICIANLOCATION(8, "SIGNATUREPHYSICIANLOCATION", "SIGNATURE_PHYSICIAN_LOCATION"),

	/**
	 * The '<em><b>SIGNATUREPHYSICIANDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANDATE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPHYSICIANDATE(9, "SIGNATUREPHYSICIANDATE", "SIGNATURE_PHYSICIAN_DATE"),

	/**
	 * The '<em><b>SIGNATUREPHYSICIANDIGITAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANDIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPHYSICIANDIGITAL(10, "SIGNATUREPHYSICIANDIGITAL", "SIGNATURE_PHYSICIAN_DIGITAL"),

	/**
	 * The '<em><b>SIGNATUREPHYSICIANPAPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANPAPER_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATUREPHYSICIANPAPER(11, "SIGNATUREPHYSICIANPAPER", "SIGNATURE_PHYSICIAN_PAPER"),

	/**
	 * The '<em><b>IDATFIRSTNAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATFIRSTNAME_VALUE
	 * @generated
	 * @ordered
	 */
	IDATFIRSTNAME(12, "IDATFIRSTNAME", "IDAT_FIRSTNAME"),

	/**
	 * The '<em><b>IDATLASTNAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATLASTNAME_VALUE
	 * @generated
	 * @ordered
	 */
	IDATLASTNAME(13, "IDATLASTNAME", "IDAT_LASTNAME"),

	/**
	 * The '<em><b>IDATBIRTHDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATBIRTHDATE_VALUE
	 * @generated
	 * @ordered
	 */
	IDATBIRTHDATE(14, "IDATBIRTHDATE", "IDAT_BIRTHDATE"),

	/**
	 * The '<em><b>IDATGENDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATGENDER_VALUE
	 * @generated
	 * @ordered
	 */
	IDATGENDER(15, "IDATGENDER", "IDAT_GENDER"),

	/**
	 * The '<em><b>IDATBIRTHPLACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATBIRTHPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	IDATBIRTHPLACE(16, "IDATBIRTHPLACE", "IDAT_BIRTHPLACE"),

	/**
	 * The '<em><b>IDATOTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATOTHER_VALUE
	 * @generated
	 * @ordered
	 */
	IDATOTHER(17, "IDATOTHER", "IDAT_OTHER"),

	/**
	 * The '<em><b>SCAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCAN_VALUE
	 * @generated
	 * @ordered
	 */
	SCAN(18, "SCAN", "SCAN"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(19, "OTHER", "OTHER");

	/**
	 * The '<em><b>TEMPLATENAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATENAME
	 * @model literal="TEMPLATE_NAME"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATENAME_VALUE = 0;

	/**
	 * The '<em><b>TEMPLATEVERSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATEVERSION
	 * @model literal="TEMPLATE_VERSION"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATEVERSION_VALUE = 1;

	/**
	 * The '<em><b>MODULESTATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULESTATUS
	 * @model literal="MODULE_STATUS"
	 * @generated
	 * @ordered
	 */
	public static final int MODULESTATUS_VALUE = 2;

	/**
	 * The '<em><b>SIGNERIDVALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNERIDVALUE
	 * @model literal="SIGNER_ID_VALUE"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNERIDVALUE_VALUE = 3;

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTLOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTLOCATION
	 * @model literal="SIGNATURE_PARTICIPANT_LOCATION"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPARTICIPANTLOCATION_VALUE = 4;

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTDATE
	 * @model literal="SIGNATURE_PARTICIPANT_DATE"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPARTICIPANTDATE_VALUE = 5;

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTDIGITAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTDIGITAL
	 * @model literal="SIGNATURE_PARTICIPANT_DIGITAL"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPARTICIPANTDIGITAL_VALUE = 6;

	/**
	 * The '<em><b>SIGNATUREPARTICIPANTPAPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPARTICIPANTPAPER
	 * @model literal="SIGNATURE_PARTICIPANT_PAPER"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPARTICIPANTPAPER_VALUE = 7;

	/**
	 * The '<em><b>SIGNATUREPHYSICIANLOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANLOCATION
	 * @model literal="SIGNATURE_PHYSICIAN_LOCATION"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPHYSICIANLOCATION_VALUE = 8;

	/**
	 * The '<em><b>SIGNATUREPHYSICIANDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANDATE
	 * @model literal="SIGNATURE_PHYSICIAN_DATE"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPHYSICIANDATE_VALUE = 9;

	/**
	 * The '<em><b>SIGNATUREPHYSICIANDIGITAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANDIGITAL
	 * @model literal="SIGNATURE_PHYSICIAN_DIGITAL"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPHYSICIANDIGITAL_VALUE = 10;

	/**
	 * The '<em><b>SIGNATUREPHYSICIANPAPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATUREPHYSICIANPAPER
	 * @model literal="SIGNATURE_PHYSICIAN_PAPER"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATUREPHYSICIANPAPER_VALUE = 11;

	/**
	 * The '<em><b>IDATFIRSTNAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATFIRSTNAME
	 * @model literal="IDAT_FIRSTNAME"
	 * @generated
	 * @ordered
	 */
	public static final int IDATFIRSTNAME_VALUE = 12;

	/**
	 * The '<em><b>IDATLASTNAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATLASTNAME
	 * @model literal="IDAT_LASTNAME"
	 * @generated
	 * @ordered
	 */
	public static final int IDATLASTNAME_VALUE = 13;

	/**
	 * The '<em><b>IDATBIRTHDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATBIRTHDATE
	 * @model literal="IDAT_BIRTHDATE"
	 * @generated
	 * @ordered
	 */
	public static final int IDATBIRTHDATE_VALUE = 14;

	/**
	 * The '<em><b>IDATGENDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATGENDER
	 * @model literal="IDAT_GENDER"
	 * @generated
	 * @ordered
	 */
	public static final int IDATGENDER_VALUE = 15;

	/**
	 * The '<em><b>IDATBIRTHPLACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATBIRTHPLACE
	 * @model literal="IDAT_BIRTHPLACE"
	 * @generated
	 * @ordered
	 */
	public static final int IDATBIRTHPLACE_VALUE = 16;

	/**
	 * The '<em><b>IDATOTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDATOTHER
	 * @model literal="IDAT_OTHER"
	 * @generated
	 * @ordered
	 */
	public static final int IDATOTHER_VALUE = 17;

	/**
	 * The '<em><b>SCAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCAN_VALUE = 18;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 19;

	/**
	 * An array of all the '<em><b>Qc Problem Type Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QcProblemTypeField[] VALUES_ARRAY =
		new QcProblemTypeField[] {
			TEMPLATENAME,
			TEMPLATEVERSION,
			MODULESTATUS,
			SIGNERIDVALUE,
			SIGNATUREPARTICIPANTLOCATION,
			SIGNATUREPARTICIPANTDATE,
			SIGNATUREPARTICIPANTDIGITAL,
			SIGNATUREPARTICIPANTPAPER,
			SIGNATUREPHYSICIANLOCATION,
			SIGNATUREPHYSICIANDATE,
			SIGNATUREPHYSICIANDIGITAL,
			SIGNATUREPHYSICIANPAPER,
			IDATFIRSTNAME,
			IDATLASTNAME,
			IDATBIRTHDATE,
			IDATGENDER,
			IDATBIRTHPLACE,
			IDATOTHER,
			SCAN,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Qc Problem Type Field</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QcProblemTypeField> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Qc Problem Type Field</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemTypeField get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QcProblemTypeField result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qc Problem Type Field</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemTypeField getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QcProblemTypeField result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Qc Problem Type Field</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QcProblemTypeField get(int value) {
		switch (value) {
			case TEMPLATENAME_VALUE: return TEMPLATENAME;
			case TEMPLATEVERSION_VALUE: return TEMPLATEVERSION;
			case MODULESTATUS_VALUE: return MODULESTATUS;
			case SIGNERIDVALUE_VALUE: return SIGNERIDVALUE;
			case SIGNATUREPARTICIPANTLOCATION_VALUE: return SIGNATUREPARTICIPANTLOCATION;
			case SIGNATUREPARTICIPANTDATE_VALUE: return SIGNATUREPARTICIPANTDATE;
			case SIGNATUREPARTICIPANTDIGITAL_VALUE: return SIGNATUREPARTICIPANTDIGITAL;
			case SIGNATUREPARTICIPANTPAPER_VALUE: return SIGNATUREPARTICIPANTPAPER;
			case SIGNATUREPHYSICIANLOCATION_VALUE: return SIGNATUREPHYSICIANLOCATION;
			case SIGNATUREPHYSICIANDATE_VALUE: return SIGNATUREPHYSICIANDATE;
			case SIGNATUREPHYSICIANDIGITAL_VALUE: return SIGNATUREPHYSICIANDIGITAL;
			case SIGNATUREPHYSICIANPAPER_VALUE: return SIGNATUREPHYSICIANPAPER;
			case IDATFIRSTNAME_VALUE: return IDATFIRSTNAME;
			case IDATLASTNAME_VALUE: return IDATLASTNAME;
			case IDATBIRTHDATE_VALUE: return IDATBIRTHDATE;
			case IDATGENDER_VALUE: return IDATGENDER;
			case IDATBIRTHPLACE_VALUE: return IDATBIRTHPLACE;
			case IDATOTHER_VALUE: return IDATOTHER;
			case SCAN_VALUE: return SCAN;
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
	private QcProblemTypeField(int value, String name, String literal) {
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
	
} //QcProblemTypeField
