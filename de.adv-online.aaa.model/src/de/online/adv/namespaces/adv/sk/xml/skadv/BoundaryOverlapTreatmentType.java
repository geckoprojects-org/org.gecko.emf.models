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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Boundary Overlap Treatment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Die Werte dieses Typs steuern, wie bei einer Flächenfüllung mit Graphics bei Überlappung mit dem Rand zu verfahren ist.
 * Beim Wert "clip" soll das Graphics am Rand abgeschnitten werden. 
 * Beim Wert "omit" soll das Graphics in diesem Falle ganz weggelassen werden.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundaryOverlapTreatmentType()
 * @model extendedMetaData="name='BoundaryOverlapTreatmentType'"
 * @generated
 */
@ProviderType
public enum BoundaryOverlapTreatmentType implements Enumerator {
	/**
	 * The '<em><b>Clip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Am Flächenrand angeschnittene Graphics sind am Rand abzuschneiden.
	 * <!-- end-model-doc -->
	 * @see #CLIP_VALUE
	 * @generated
	 * @ordered
	 */
	CLIP(0, "clip", "clip"),

	/**
	 * The '<em><b>Omit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Am Rand angeschnittene Graphics sind ganz wegzulassen.
	 * <!-- end-model-doc -->
	 * @see #OMIT_VALUE
	 * @generated
	 * @ordered
	 */
	OMIT(1, "omit", "omit");

	/**
	 * The '<em><b>Clip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Am Flächenrand angeschnittene Graphics sind am Rand abzuschneiden.
	 * <!-- end-model-doc -->
	 * @see #CLIP
	 * @model name="clip"
	 * @generated
	 * @ordered
	 */
	public static final int CLIP_VALUE = 0;

	/**
	 * The '<em><b>Omit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Am Rand angeschnittene Graphics sind ganz wegzulassen.
	 * <!-- end-model-doc -->
	 * @see #OMIT
	 * @model name="omit"
	 * @generated
	 * @ordered
	 */
	public static final int OMIT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Boundary Overlap Treatment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BoundaryOverlapTreatmentType[] VALUES_ARRAY =
		new BoundaryOverlapTreatmentType[] {
			CLIP,
			OMIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Boundary Overlap Treatment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BoundaryOverlapTreatmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Boundary Overlap Treatment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoundaryOverlapTreatmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoundaryOverlapTreatmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boundary Overlap Treatment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoundaryOverlapTreatmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoundaryOverlapTreatmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boundary Overlap Treatment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoundaryOverlapTreatmentType get(int value) {
		switch (value) {
			case CLIP_VALUE: return CLIP;
			case OMIT_VALUE: return OMIT;
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
	private BoundaryOverlapTreatmentType(int value, String name, String literal) {
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
	
} //BoundaryOverlapTreatmentType
