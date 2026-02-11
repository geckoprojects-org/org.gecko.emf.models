/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spatial Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getSpatialType()
 * @model extendedMetaData="name='spatial_._type'"
 * @generated
 */
@ProviderType
public enum SpatialType implements Enumerator {
	/**
	 * The '<em><b>Dcmipoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCMIPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	DCMIPOINT(0, "dcmipoint", "dcmipoint"),

	/**
	 * The '<em><b>Iso3166</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO3166_VALUE
	 * @generated
	 * @ordered
	 */
	ISO3166(1, "iso3166", "iso3166"),

	/**
	 * The '<em><b>Dcmibox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCMIBOX_VALUE
	 * @generated
	 * @ordered
	 */
	DCMIBOX(2, "dcmibox", "dcmibox"),

	/**
	 * The '<em><b>Tgn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TGN_VALUE
	 * @generated
	 * @ordered
	 */
	TGN(3, "tgn", "tgn"),

	/**
	 * The '<em><b>Otherspatial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERSPATIAL_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERSPATIAL(4, "otherspatial", "otherspatial");

	/**
	 * The '<em><b>Dcmipoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCMIPOINT
	 * @model name="dcmipoint"
	 * @generated
	 * @ordered
	 */
	public static final int DCMIPOINT_VALUE = 0;

	/**
	 * The '<em><b>Iso3166</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO3166
	 * @model name="iso3166"
	 * @generated
	 * @ordered
	 */
	public static final int ISO3166_VALUE = 1;

	/**
	 * The '<em><b>Dcmibox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCMIBOX
	 * @model name="dcmibox"
	 * @generated
	 * @ordered
	 */
	public static final int DCMIBOX_VALUE = 2;

	/**
	 * The '<em><b>Tgn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TGN
	 * @model name="tgn"
	 * @generated
	 * @ordered
	 */
	public static final int TGN_VALUE = 3;

	/**
	 * The '<em><b>Otherspatial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERSPATIAL
	 * @model name="otherspatial"
	 * @generated
	 * @ordered
	 */
	public static final int OTHERSPATIAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Spatial Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpatialType[] VALUES_ARRAY =
		new SpatialType[] {
			DCMIPOINT,
			ISO3166,
			DCMIBOX,
			TGN,
			OTHERSPATIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Spatial Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpatialType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spatial Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpatialType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpatialType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spatial Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpatialType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpatialType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spatial Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpatialType get(int value) {
		switch (value) {
			case DCMIPOINT_VALUE: return DCMIPOINT;
			case ISO3166_VALUE: return ISO3166;
			case DCMIBOX_VALUE: return DCMIBOX;
			case TGN_VALUE: return TGN;
			case OTHERSPATIAL_VALUE: return OTHERSPATIAL;
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
	private SpatialType(int value, String name, String literal) {
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
	
} //SpatialType
