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
 * A representation of the model object '<em><b>Confidence Interval Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ConfidenceIntervalType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConfidenceIntervalType#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getConfidenceIntervalType()
 * @model extendedMetaData="name='confidenceInterval_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConfidenceIntervalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The lower bound of the confidence interval.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConfidenceIntervalType_LowerBound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='lowerBound' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConfidenceIntervalType#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The upper bound of the confidence interval.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConfidenceIntervalType_UpperBound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='upperBound' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConfidenceIntervalType#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

} // ConfidenceIntervalType
