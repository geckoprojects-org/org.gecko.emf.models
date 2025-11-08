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
 * A representation of the literals of the enumeration '<em><b>Machine Learning Approach Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getMachineLearningApproachType()
 * @model extendedMetaData="name='machineLearningApproachType'"
 * @generated
 */
@ProviderType
public enum MachineLearningApproachType implements Enumerator {
	/**
	 * The '<em><b>Supervised</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Supervised machine learning involves training an algorithm on labeled
	 *                         data to predict or classify new data based on the patterns learned from
	 *                         the labeled examples.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SUPERVISED_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERVISED(0, "supervised", "supervised"),

	/**
	 * The '<em><b>Unsupervised</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Unsupervised machine learning involves training algorithms on unlabeled
	 *                         data to discover patterns, structures, or relationships without explicit
	 *                         guidance, allowing the model to identify inherent structures or clusters
	 *                         within the data.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #UNSUPERVISED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPERVISED(1, "unsupervised", "unsupervised"),

	/**
	 * The '<em><b>Reinforcement Learning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Reinforcement learning is a type of machine learning where an agent learns
	 *                         to make decisions by interacting with an environment to maximize cumulative
	 *                         rewards, through trial and error.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REINFORCEMENT_LEARNING_VALUE
	 * @generated
	 * @ordered
	 */
	REINFORCEMENT_LEARNING(2, "reinforcementLearning", "reinforcement-learning"),

	/**
	 * The '<em><b>Semi Supervised</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Semi-supervised machine learning utilizes a combination of labeled and
	 *                         unlabeled data during training to improve model performance, leveraging
	 *                         the benefits of both supervised and unsupervised learning techniques.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SEMI_SUPERVISED_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_SUPERVISED(3, "semiSupervised", "semi-supervised"),

	/**
	 * The '<em><b>Self Supervised</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Self-supervised machine learning involves training models to predict parts
	 *                         of the input data from other parts of the same data, without requiring
	 *                         external labels, enabling learning from large amounts of unlabeled data.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SELF_SUPERVISED_VALUE
	 * @generated
	 * @ordered
	 */
	SELF_SUPERVISED(4, "selfSupervised", "self-supervised");

	/**
	 * The '<em><b>Supervised</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Supervised machine learning involves training an algorithm on labeled
	 *                         data to predict or classify new data based on the patterns learned from
	 *                         the labeled examples.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SUPERVISED
	 * @model name="supervised"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERVISED_VALUE = 0;

	/**
	 * The '<em><b>Unsupervised</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Unsupervised machine learning involves training algorithms on unlabeled
	 *                         data to discover patterns, structures, or relationships without explicit
	 *                         guidance, allowing the model to identify inherent structures or clusters
	 *                         within the data.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #UNSUPERVISED
	 * @model name="unsupervised"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPERVISED_VALUE = 1;

	/**
	 * The '<em><b>Reinforcement Learning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Reinforcement learning is a type of machine learning where an agent learns
	 *                         to make decisions by interacting with an environment to maximize cumulative
	 *                         rewards, through trial and error.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REINFORCEMENT_LEARNING
	 * @model name="reinforcementLearning" literal="reinforcement-learning"
	 * @generated
	 * @ordered
	 */
	public static final int REINFORCEMENT_LEARNING_VALUE = 2;

	/**
	 * The '<em><b>Semi Supervised</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Semi-supervised machine learning utilizes a combination of labeled and
	 *                         unlabeled data during training to improve model performance, leveraging
	 *                         the benefits of both supervised and unsupervised learning techniques.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SEMI_SUPERVISED
	 * @model name="semiSupervised" literal="semi-supervised"
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_SUPERVISED_VALUE = 3;

	/**
	 * The '<em><b>Self Supervised</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Self-supervised machine learning involves training models to predict parts
	 *                         of the input data from other parts of the same data, without requiring
	 *                         external labels, enabling learning from large amounts of unlabeled data.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SELF_SUPERVISED
	 * @model name="selfSupervised" literal="self-supervised"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_SUPERVISED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Machine Learning Approach Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MachineLearningApproachType[] VALUES_ARRAY =
		new MachineLearningApproachType[] {
			SUPERVISED,
			UNSUPERVISED,
			REINFORCEMENT_LEARNING,
			SEMI_SUPERVISED,
			SELF_SUPERVISED,
		};

	/**
	 * A public read-only list of all the '<em><b>Machine Learning Approach Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MachineLearningApproachType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Machine Learning Approach Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MachineLearningApproachType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MachineLearningApproachType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Machine Learning Approach Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MachineLearningApproachType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MachineLearningApproachType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Machine Learning Approach Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MachineLearningApproachType get(int value) {
		switch (value) {
			case SUPERVISED_VALUE: return SUPERVISED;
			case UNSUPERVISED_VALUE: return UNSUPERVISED;
			case REINFORCEMENT_LEARNING_VALUE: return REINFORCEMENT_LEARNING;
			case SEMI_SUPERVISED_VALUE: return SEMI_SUPERVISED;
			case SELF_SUPERVISED_VALUE: return SELF_SUPERVISED;
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
	private MachineLearningApproachType(int value, String name, String literal) {
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
	
} //MachineLearningApproachType
