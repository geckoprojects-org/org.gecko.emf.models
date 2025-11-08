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
 * A representation of the literals of the enumeration '<em><b>Activity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getActivityType()
 * @model extendedMetaData="name='activity_._type'"
 * @generated
 */
@ProviderType
public enum ActivityType implements Enumerator {
	/**
	 * The '<em><b>Design</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model design including problem framing, goal definition and algorithm selection.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN(0, "design", "design"),

	/**
	 * The '<em><b>Data Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model data acquisition including search, selection and transfer.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DATA_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_COLLECTION(1, "dataCollection", "data-collection"),

	/**
	 * The '<em><b>Data Preparation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model data preparation including data cleaning, labeling and conversion.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DATA_PREPARATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PREPARATION(2, "dataPreparation", "data-preparation"),

	/**
	 * The '<em><b>Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model building, training and generalized tuning.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	TRAINING(3, "training", "training"),

	/**
	 * The '<em><b>Fine Tuning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     refining a trained model to produce desired outputs for a given problem space.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #FINE_TUNING_VALUE
	 * @generated
	 * @ordered
	 */
	FINE_TUNING(4, "fineTuning", "fine-tuning"),

	/**
	 * The '<em><b>Validation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model validation including model output evaluation and testing.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #VALIDATION_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATION(5, "validation", "validation"),

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     explicit model deployment to a target hosting infrastructure.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(6, "deployment", "deployment"),

	/**
	 * The '<em><b>Inference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     generating an output response from a hosted model from a set of inputs.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #INFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	INFERENCE(7, "inference", "inference"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     a lifecycle activity type whose description does not match currently defined values.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(8, "other", "other");

	/**
	 * The '<em><b>Design</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model design including problem framing, goal definition and algorithm selection.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DESIGN
	 * @model name="design"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_VALUE = 0;

	/**
	 * The '<em><b>Data Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model data acquisition including search, selection and transfer.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DATA_COLLECTION
	 * @model name="dataCollection" literal="data-collection"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_COLLECTION_VALUE = 1;

	/**
	 * The '<em><b>Data Preparation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model data preparation including data cleaning, labeling and conversion.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DATA_PREPARATION
	 * @model name="dataPreparation" literal="data-preparation"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PREPARATION_VALUE = 2;

	/**
	 * The '<em><b>Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model building, training and generalized tuning.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #TRAINING
	 * @model name="training"
	 * @generated
	 * @ordered
	 */
	public static final int TRAINING_VALUE = 3;

	/**
	 * The '<em><b>Fine Tuning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     refining a trained model to produce desired outputs for a given problem space.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #FINE_TUNING
	 * @model name="fineTuning" literal="fine-tuning"
	 * @generated
	 * @ordered
	 */
	public static final int FINE_TUNING_VALUE = 4;

	/**
	 * The '<em><b>Validation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     model validation including model output evaluation and testing.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #VALIDATION
	 * @model name="validation"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_VALUE = 5;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     explicit model deployment to a target hosting infrastructure.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #DEPLOYMENT
	 * @model name="deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 6;

	/**
	 * The '<em><b>Inference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     generating an output response from a hosted model from a set of inputs.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #INFERENCE
	 * @model name="inference"
	 * @generated
	 * @ordered
	 */
	public static final int INFERENCE_VALUE = 7;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     a lifecycle activity type whose description does not match currently defined values.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityType[] VALUES_ARRAY =
		new ActivityType[] {
			DESIGN,
			DATA_COLLECTION,
			DATA_PREPARATION,
			TRAINING,
			FINE_TUNING,
			VALIDATION,
			DEPLOYMENT,
			INFERENCE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityType get(int value) {
		switch (value) {
			case DESIGN_VALUE: return DESIGN;
			case DATA_COLLECTION_VALUE: return DATA_COLLECTION;
			case DATA_PREPARATION_VALUE: return DATA_PREPARATION;
			case TRAINING_VALUE: return TRAINING;
			case FINE_TUNING_VALUE: return FINE_TUNING;
			case VALIDATION_VALUE: return VALIDATION;
			case DEPLOYMENT_VALUE: return DEPLOYMENT;
			case INFERENCE_VALUE: return INFERENCE;
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
	private ActivityType(int value, String name, String literal) {
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
	
} //ActivityType
