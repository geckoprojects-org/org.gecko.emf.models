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
 * A representation of the literals of the enumeration '<em><b>Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getTypeType()
 * @model extendedMetaData="name='type_._type'"
 * @generated
 */
@ProviderType
public enum TypeType implements Enumerator {
	/**
	 * The '<em><b>Tls</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Transport Layer Security
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #TLS_VALUE
	 * @generated
	 * @ordered
	 */
	TLS(0, "tls", "tls"),

	/**
	 * The '<em><b>Ssh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Secure Shell
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SSH_VALUE
	 * @generated
	 * @ordered
	 */
	SSH(1, "ssh", "ssh"),

	/**
	 * The '<em><b>Ipsec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Internet Protocol Security
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #IPSEC_VALUE
	 * @generated
	 * @ordered
	 */
	IPSEC(2, "ipsec", "ipsec"),

	/**
	 * The '<em><b>Ike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Internet Key Exchange
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #IKE_VALUE
	 * @generated
	 * @ordered
	 */
	IKE(3, "ike", "ike"),

	/**
	 * The '<em><b>Sstp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Secure Socket Tunneling Protocol
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SSTP_VALUE
	 * @generated
	 * @ordered
	 */
	SSTP(4, "sstp", "sstp"),

	/**
	 * The '<em><b>Wpa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Wi-Fi Protected Access
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #WPA_VALUE
	 * @generated
	 * @ordered
	 */
	WPA(5, "wpa", "wpa"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another protocol type
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "other", "other"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The protocol type is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(7, "unknown", "unknown");

	/**
	 * The '<em><b>Tls</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Transport Layer Security
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #TLS
	 * @model name="tls"
	 * @generated
	 * @ordered
	 */
	public static final int TLS_VALUE = 0;

	/**
	 * The '<em><b>Ssh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Secure Shell
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SSH
	 * @model name="ssh"
	 * @generated
	 * @ordered
	 */
	public static final int SSH_VALUE = 1;

	/**
	 * The '<em><b>Ipsec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Internet Protocol Security
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #IPSEC
	 * @model name="ipsec"
	 * @generated
	 * @ordered
	 */
	public static final int IPSEC_VALUE = 2;

	/**
	 * The '<em><b>Ike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Internet Key Exchange
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #IKE
	 * @model name="ike"
	 * @generated
	 * @ordered
	 */
	public static final int IKE_VALUE = 3;

	/**
	 * The '<em><b>Sstp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Secure Socket Tunneling Protocol
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #SSTP
	 * @model name="sstp"
	 * @generated
	 * @ordered
	 */
	public static final int SSTP_VALUE = 4;

	/**
	 * The '<em><b>Wpa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Wi-Fi Protected Access
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #WPA
	 * @model name="wpa"
	 * @generated
	 * @ordered
	 */
	public static final int WPA_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Another protocol type
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The protocol type is not known
	 *                                             
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType[] VALUES_ARRAY =
		new TypeType[] {
			TLS,
			SSH,
			IPSEC,
			IKE,
			SSTP,
			WPA,
			OTHER,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType get(int value) {
		switch (value) {
			case TLS_VALUE: return TLS;
			case SSH_VALUE: return SSH;
			case IPSEC_VALUE: return IPSEC;
			case IKE_VALUE: return IKE;
			case SSTP_VALUE: return SSTP;
			case WPA_VALUE: return WPA;
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
	private TypeType(int value, String name, String literal) {
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
	
} //TypeType
