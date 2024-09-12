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
package net.opengis.wfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Result Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.wfs.WFSPackage#getResultTypeType()
 * @model extendedMetaData="name='ResultTypeType'"
 * @generated
 */
@ProviderType
public enum ResultTypeType implements Enumerator {
	/**
	 * The '<em><b>Results</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Indicates that a complete response should be generated
	 *                   by the WFS.  That is, all response feature instances
	 *                   should be returned to the client.
	 *                
	 * <!-- end-model-doc -->
	 * @see #RESULTS_VALUE
	 * @generated
	 * @ordered
	 */
	RESULTS(0, "results", "results"),

	/**
	 * The '<em><b>Hits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Indicates that an empty response should be generated with
	 *                   the "numberOfFeatures" attribute set (i.e. no feature
	 *                   instances should be returned).  In this manner a client may
	 *                   determine the number of feature instances that a GetFeature
	 *                   request will return without having to actually get the 
	 *                   entire result set back.
	 *                
	 * <!-- end-model-doc -->
	 * @see #HITS_VALUE
	 * @generated
	 * @ordered
	 */
	HITS(1, "hits", "hits");

	/**
	 * The '<em><b>Results</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Indicates that a complete response should be generated
	 *                   by the WFS.  That is, all response feature instances
	 *                   should be returned to the client.
	 *                
	 * <!-- end-model-doc -->
	 * @see #RESULTS
	 * @model name="results"
	 * @generated
	 * @ordered
	 */
	public static final int RESULTS_VALUE = 0;

	/**
	 * The '<em><b>Hits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Indicates that an empty response should be generated with
	 *                   the "numberOfFeatures" attribute set (i.e. no feature
	 *                   instances should be returned).  In this manner a client may
	 *                   determine the number of feature instances that a GetFeature
	 *                   request will return without having to actually get the 
	 *                   entire result set back.
	 *                
	 * <!-- end-model-doc -->
	 * @see #HITS
	 * @model name="hits"
	 * @generated
	 * @ordered
	 */
	public static final int HITS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Result Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResultTypeType[] VALUES_ARRAY =
		new ResultTypeType[] {
			RESULTS,
			HITS,
		};

	/**
	 * A public read-only list of all the '<em><b>Result Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResultTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Result Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResultTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Result Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResultTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Result Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultTypeType get(int value) {
		switch (value) {
			case RESULTS_VALUE: return RESULTS;
			case HITS_VALUE: return HITS;
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
	private ResultTypeType(int value, String name, String literal) {
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
	
} //ResultTypeType
