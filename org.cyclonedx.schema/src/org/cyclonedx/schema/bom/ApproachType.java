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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approach Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ApproachType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getApproachType()
 * @model extendedMetaData="name='approach_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ApproachType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.MachineLearningApproachType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Learning types describing the learning problem or hybrid learning problem.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.MachineLearningApproachType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(MachineLearningApproachType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getApproachType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	MachineLearningApproachType getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ApproachType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.MachineLearningApproachType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(MachineLearningApproachType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.ApproachType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(MachineLearningApproachType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.ApproachType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(MachineLearningApproachType)
	 * @generated
	 */
	boolean isSetType();

} // ApproachType
