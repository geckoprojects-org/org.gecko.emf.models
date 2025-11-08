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
 * A representation of the literals of the enumeration '<em><b>Score Source Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *                 Specifies the severity or risk scoring methodology or standard used.
 *             
 * <!-- end-model-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getScoreSourceType()
 * @model extendedMetaData="name='scoreSourceType'"
 * @generated
 */
@ProviderType
public enum ScoreSourceType implements Enumerator {
	/**
	 * The '<em><b>CVS Sv2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v2.0 standard as defined at https://www.first.org/cvss/v2/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV2_VALUE
	 * @generated
	 * @ordered
	 */
	CVS_SV2(0, "CVSSv2", "CVSSv2"),

	/**
	 * The '<em><b>CVS Sv3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v3.0 standard as defined at https://www.first.org/cvss/v3-0/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV3_VALUE
	 * @generated
	 * @ordered
	 */
	CVS_SV3(1, "CVSSv3", "CVSSv3"),

	/**
	 * The '<em><b>CVS Sv31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v3.1 standard as defined at https://www.first.org/cvss/v3-1/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV31_VALUE
	 * @generated
	 * @ordered
	 */
	CVS_SV31(2, "CVSSv31", "CVSSv31"),

	/**
	 * The '<em><b>CVS Sv4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v4.0 standard as defined at https://www.first.org/cvss/v4-0/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV4_VALUE
	 * @generated
	 * @ordered
	 */
	CVS_SV4(3, "CVSSv4", "CVSSv4"),

	/**
	 * The '<em><b>OWASP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         OWASP Risk Rating as defined at https://owasp.org/www-community/OWASP_Risk_Rating_Methodology
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OWASP_VALUE
	 * @generated
	 * @ordered
	 */
	OWASP(4, "OWASP", "OWASP"),

	/**
	 * The '<em><b>SSVC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Stakeholder Specific Vulnerability Categorization as defined at https://github.com/CERTCC/SSVC
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SSVC_VALUE
	 * @generated
	 * @ordered
	 */
	SSVC(5, "SSVC", "SSVC"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Another severity or risk scoring methodology
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "other", "other");

	/**
	 * The '<em><b>CVS Sv2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v2.0 standard as defined at https://www.first.org/cvss/v2/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV2
	 * @model name="CVSSv2"
	 * @generated
	 * @ordered
	 */
	public static final int CVS_SV2_VALUE = 0;

	/**
	 * The '<em><b>CVS Sv3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v3.0 standard as defined at https://www.first.org/cvss/v3-0/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV3
	 * @model name="CVSSv3"
	 * @generated
	 * @ordered
	 */
	public static final int CVS_SV3_VALUE = 1;

	/**
	 * The '<em><b>CVS Sv31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v3.1 standard as defined at https://www.first.org/cvss/v3-1/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV31
	 * @model name="CVSSv31"
	 * @generated
	 * @ordered
	 */
	public static final int CVS_SV31_VALUE = 2;

	/**
	 * The '<em><b>CVS Sv4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Common Vulnerability Scoring System v4.0 standard as defined at https://www.first.org/cvss/v4-0/
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CVS_SV4
	 * @model name="CVSSv4"
	 * @generated
	 * @ordered
	 */
	public static final int CVS_SV4_VALUE = 3;

	/**
	 * The '<em><b>OWASP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         OWASP Risk Rating as defined at https://owasp.org/www-community/OWASP_Risk_Rating_Methodology
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OWASP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OWASP_VALUE = 4;

	/**
	 * The '<em><b>SSVC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Stakeholder Specific Vulnerability Categorization as defined at https://github.com/CERTCC/SSVC
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SSVC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SSVC_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Another severity or risk scoring methodology
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Score Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScoreSourceType[] VALUES_ARRAY =
		new ScoreSourceType[] {
			CVS_SV2,
			CVS_SV3,
			CVS_SV31,
			CVS_SV4,
			OWASP,
			SSVC,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Score Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScoreSourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Score Source Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScoreSourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScoreSourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Score Source Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScoreSourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScoreSourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Score Source Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScoreSourceType get(int value) {
		switch (value) {
			case CVS_SV2_VALUE: return CVS_SV2;
			case CVS_SV3_VALUE: return CVS_SV3;
			case CVS_SV31_VALUE: return CVS_SV31;
			case CVS_SV4_VALUE: return CVS_SV4;
			case OWASP_VALUE: return OWASP;
			case SSVC_VALUE: return SSVC;
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
	private ScoreSourceType(int value, String name, String literal) {
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
	
} //ScoreSourceType
