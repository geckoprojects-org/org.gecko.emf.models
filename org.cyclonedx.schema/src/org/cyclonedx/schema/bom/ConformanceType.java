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
 * A representation of the model object '<em><b>Conformance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ConformanceType#getScore <em>Score</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConformanceType#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConformanceType#getMitigationStrategies <em>Mitigation Strategies</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getConformanceType()
 * @model extendedMetaData="name='conformance_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConformanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The conformance of the claim between and inclusive of 0 and 1, where 1 is 100% conformance.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(BigDecimal)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConformanceType_Score()
	 * @model dataType="org.cyclonedx.schema.bom.ScoreType1" required="true"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getScore();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConformanceType#getScore <em>Score</em>}' attribute.
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
	 *                                                                         The rationale for the score of conformance.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConformanceType_Rationale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConformanceType#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Mitigation Strategies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The list of  `bom-ref` to the evidence provided describing the
	 *                                                                         mitigation strategies. Each mitigation strategy should include an
	 *                                                                         explanation of how any weaknesses in the evidence will be mitigated.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigation Strategies</em>' containment reference.
	 * @see #setMitigationStrategies(MitigationStrategiesType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConformanceType_MitigationStrategies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigationStrategies' namespace='##targetNamespace'"
	 * @generated
	 */
	MitigationStrategiesType1 getMitigationStrategies();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConformanceType#getMitigationStrategies <em>Mitigation Strategies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation Strategies</em>' containment reference.
	 * @see #getMitigationStrategies()
	 * @generated
	 */
	void setMitigationStrategies(MitigationStrategiesType1 value);

} // ConformanceType
