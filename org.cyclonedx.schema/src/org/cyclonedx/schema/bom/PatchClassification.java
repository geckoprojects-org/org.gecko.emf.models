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
 * A representation of the literals of the enumeration '<em><b>Patch Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getPatchClassification()
 * @model extendedMetaData="name='patchClassification'"
 * @generated
 */
@ProviderType
public enum PatchClassification implements Enumerator {
	/**
	 * The '<em><b>Unofficial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch which is not developed by the creators or maintainers of the software
	 *                         being patched. Refer to https://en.wikipedia.org/wiki/Unofficial_patch
	 * <!-- end-model-doc -->
	 * @see #UNOFFICIAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNOFFICIAL(0, "unofficial", "unofficial"),

	/**
	 * The '<em><b>Monkey</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch which dynamically modifies runtime behavior.
	 *                         Refer to https://en.wikipedia.org/wiki/Monkey_patch
	 * <!-- end-model-doc -->
	 * @see #MONKEY_VALUE
	 * @generated
	 * @ordered
	 */
	MONKEY(1, "monkey", "monkey"),

	/**
	 * The '<em><b>Backport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch which takes code from a newer version of software and applies
	 *                         it to older versions of the same software. Refer to https://en.wikipedia.org/wiki/Backporting
	 * <!-- end-model-doc -->
	 * @see #BACKPORT_VALUE
	 * @generated
	 * @ordered
	 */
	BACKPORT(2, "backport", "backport"),

	/**
	 * The '<em><b>Cherry Pick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch created by selectively applying commits from other versions or
	 *                         branches of the same software.
	 * <!-- end-model-doc -->
	 * @see #CHERRY_PICK_VALUE
	 * @generated
	 * @ordered
	 */
	CHERRY_PICK(3, "cherryPick", "cherry-pick");

	/**
	 * The '<em><b>Unofficial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch which is not developed by the creators or maintainers of the software
	 *                         being patched. Refer to https://en.wikipedia.org/wiki/Unofficial_patch
	 * <!-- end-model-doc -->
	 * @see #UNOFFICIAL
	 * @model name="unofficial"
	 * @generated
	 * @ordered
	 */
	public static final int UNOFFICIAL_VALUE = 0;

	/**
	 * The '<em><b>Monkey</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch which dynamically modifies runtime behavior.
	 *                         Refer to https://en.wikipedia.org/wiki/Monkey_patch
	 * <!-- end-model-doc -->
	 * @see #MONKEY
	 * @model name="monkey"
	 * @generated
	 * @ordered
	 */
	public static final int MONKEY_VALUE = 1;

	/**
	 * The '<em><b>Backport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch which takes code from a newer version of software and applies
	 *                         it to older versions of the same software. Refer to https://en.wikipedia.org/wiki/Backporting
	 * <!-- end-model-doc -->
	 * @see #BACKPORT
	 * @model name="backport"
	 * @generated
	 * @ordered
	 */
	public static final int BACKPORT_VALUE = 2;

	/**
	 * The '<em><b>Cherry Pick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patch created by selectively applying commits from other versions or
	 *                         branches of the same software.
	 * <!-- end-model-doc -->
	 * @see #CHERRY_PICK
	 * @model name="cherryPick" literal="cherry-pick"
	 * @generated
	 * @ordered
	 */
	public static final int CHERRY_PICK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Patch Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PatchClassification[] VALUES_ARRAY =
		new PatchClassification[] {
			UNOFFICIAL,
			MONKEY,
			BACKPORT,
			CHERRY_PICK,
		};

	/**
	 * A public read-only list of all the '<em><b>Patch Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PatchClassification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Patch Classification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatchClassification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatchClassification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Patch Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatchClassification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatchClassification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Patch Classification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatchClassification get(int value) {
		switch (value) {
			case UNOFFICIAL_VALUE: return UNOFFICIAL;
			case MONKEY_VALUE: return MONKEY;
			case BACKPORT_VALUE: return BACKPORT;
			case CHERRY_PICK_VALUE: return CHERRY_PICK;
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
	private PatchClassification(int value, String name, String literal) {
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
	
} //PatchClassification
