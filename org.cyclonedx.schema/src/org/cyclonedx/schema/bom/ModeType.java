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
 * A representation of the literals of the enumeration '<em><b>Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getModeType()
 * @model extendedMetaData="name='mode_._type'"
 * @generated
 */
@ProviderType
public enum ModeType implements Enumerator {
	/**
	 * The '<em><b>Cbc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Cipher block chaining
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CBC_VALUE
	 * @generated
	 * @ordered
	 */
	CBC(0, "cbc", "cbc"),

	/**
	 * The '<em><b>Ecb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Electronic codebook
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #ECB_VALUE
	 * @generated
	 * @ordered
	 */
	ECB(1, "ecb", "ecb"),

	/**
	 * The '<em><b>Ccm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Counter with cipher block chaining message authentication code
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CCM_VALUE
	 * @generated
	 * @ordered
	 */
	CCM(2, "ccm", "ccm"),

	/**
	 * The '<em><b>Gcm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Galois/counter
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #GCM_VALUE
	 * @generated
	 * @ordered
	 */
	GCM(3, "gcm", "gcm"),

	/**
	 * The '<em><b>Cfb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Cipher feedback
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CFB_VALUE
	 * @generated
	 * @ordered
	 */
	CFB(4, "cfb", "cfb"),

	/**
	 * The '<em><b>Ofb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Output feedback
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OFB_VALUE
	 * @generated
	 * @ordered
	 */
	OFB(5, "ofb", "ofb"),

	/**
	 * The '<em><b>Ctr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Counter
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CTR_VALUE
	 * @generated
	 * @ordered
	 */
	CTR(6, "ctr", "ctr"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another mode of operation
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The mode of operation is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(8, "unknown", "unknown");

	/**
	 * The '<em><b>Cbc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Cipher block chaining
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CBC
	 * @model name="cbc"
	 * @generated
	 * @ordered
	 */
	public static final int CBC_VALUE = 0;

	/**
	 * The '<em><b>Ecb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Electronic codebook
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #ECB
	 * @model name="ecb"
	 * @generated
	 * @ordered
	 */
	public static final int ECB_VALUE = 1;

	/**
	 * The '<em><b>Ccm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Counter with cipher block chaining message authentication code
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CCM
	 * @model name="ccm"
	 * @generated
	 * @ordered
	 */
	public static final int CCM_VALUE = 2;

	/**
	 * The '<em><b>Gcm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Galois/counter
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #GCM
	 * @model name="gcm"
	 * @generated
	 * @ordered
	 */
	public static final int GCM_VALUE = 3;

	/**
	 * The '<em><b>Cfb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Cipher feedback
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CFB
	 * @model name="cfb"
	 * @generated
	 * @ordered
	 */
	public static final int CFB_VALUE = 4;

	/**
	 * The '<em><b>Ofb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Output feedback
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OFB
	 * @model name="ofb"
	 * @generated
	 * @ordered
	 */
	public static final int OFB_VALUE = 5;

	/**
	 * The '<em><b>Ctr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Counter
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #CTR
	 * @model name="ctr"
	 * @generated
	 * @ordered
	 */
	public static final int CTR_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another mode of operation
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The mode of operation is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 8;

	/**
	 * An array of all the '<em><b>Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModeType[] VALUES_ARRAY =
		new ModeType[] {
			CBC,
			ECB,
			CCM,
			GCM,
			CFB,
			OFB,
			CTR,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeType get(int value) {
		switch (value) {
			case CBC_VALUE: return CBC;
			case ECB_VALUE: return ECB;
			case CCM_VALUE: return CCM;
			case GCM_VALUE: return GCM;
			case CFB_VALUE: return CFB;
			case OFB_VALUE: return OFB;
			case CTR_VALUE: return CTR;
			case OTHER_VALUE: return OTHER;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private ModeType(int value, String name, String literal) {
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
	
} //ModeType
