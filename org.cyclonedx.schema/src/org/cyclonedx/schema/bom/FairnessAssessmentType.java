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
 * A representation of the model object '<em><b>Fairness Assessment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getGroupAtRisk <em>Group At Risk</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getBenefits <em>Benefits</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getHarms <em>Harms</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getMitigationStrategy <em>Mitigation Strategy</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getFairnessAssessmentType()
 * @model extendedMetaData="name='fairnessAssessment_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FairnessAssessmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group At Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The groups or individuals at risk of being systematically disadvantaged by the model.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group At Risk</em>' attribute.
	 * @see #setGroupAtRisk(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFairnessAssessmentType_GroupAtRisk()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='groupAtRisk' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupAtRisk();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getGroupAtRisk <em>Group At Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group At Risk</em>' attribute.
	 * @see #getGroupAtRisk()
	 * @generated
	 */
	void setGroupAtRisk(String value);

	/**
	 * Returns the value of the '<em><b>Benefits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             Expected benefits to the identified groups.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefits</em>' attribute.
	 * @see #setBenefits(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFairnessAssessmentType_Benefits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='benefits' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBenefits();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getBenefits <em>Benefits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefits</em>' attribute.
	 * @see #getBenefits()
	 * @generated
	 */
	void setBenefits(String value);

	/**
	 * Returns the value of the '<em><b>Harms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             Expected harms to the identified groups.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Harms</em>' attribute.
	 * @see #setHarms(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFairnessAssessmentType_Harms()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='harms' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHarms();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getHarms <em>Harms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Harms</em>' attribute.
	 * @see #getHarms()
	 * @generated
	 */
	void setHarms(String value);

	/**
	 * Returns the value of the '<em><b>Mitigation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             With respect to the benefits and harms outlined, please
	 *                                                             describe any mitigation strategy implemented.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigation Strategy</em>' attribute.
	 * @see #setMitigationStrategy(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFairnessAssessmentType_MitigationStrategy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='mitigationStrategy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMitigationStrategy();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FairnessAssessmentType#getMitigationStrategy <em>Mitigation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation Strategy</em>' attribute.
	 * @see #getMitigationStrategy()
	 * @generated
	 */
	void setMitigationStrategy(String value);

} // FairnessAssessmentType
