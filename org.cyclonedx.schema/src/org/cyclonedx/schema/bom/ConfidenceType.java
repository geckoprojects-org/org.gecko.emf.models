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

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ConfidenceType#getScore <em>Score</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConfidenceType#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getConfidenceType()
 * @model extendedMetaData="name='confidence_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConfidenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The confidence of the claim between and inclusive of 0 and 1, where 1 is 100% confidence.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(BigDecimal)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConfidenceType_Score()
	 * @model dataType="org.cyclonedx.schema.bom.ScoreType" required="true"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getScore();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConfidenceType#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The rationale for the confidence score.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConfidenceType_Rationale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConfidenceType#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

} // ConfidenceType
