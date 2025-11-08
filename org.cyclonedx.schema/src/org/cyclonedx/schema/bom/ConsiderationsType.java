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
 * A representation of the model object '<em><b>Considerations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ConsiderationsType#getUsers <em>Users</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConsiderationsType#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConsiderationsType#getTechnicalLimitations <em>Technical Limitations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConsiderationsType#getPerformanceTradeoffs <em>Performance Tradeoffs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConsiderationsType#getEthicalConsiderations <em>Ethical Considerations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConsiderationsType#getEnvironmentalConsiderations <em>Environmental Considerations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ConsiderationsType#getFairnessAssessments <em>Fairness Assessments</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType()
 * @model extendedMetaData="name='considerations_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsiderationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Who are the intended users of the model?
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Users</em>' containment reference.
	 * @see #setUsers(UsersType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType_Users()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='users' namespace='##targetNamespace'"
	 * @generated
	 */
	UsersType getUsers();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConsiderationsType#getUsers <em>Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users</em>' containment reference.
	 * @see #getUsers()
	 * @generated
	 */
	void setUsers(UsersType value);

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     What are the intended use cases of the model?
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference.
	 * @see #setUseCases(UseCasesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType_UseCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useCases' namespace='##targetNamespace'"
	 * @generated
	 */
	UseCasesType getUseCases();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConsiderationsType#getUseCases <em>Use Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Cases</em>' containment reference.
	 * @see #getUseCases()
	 * @generated
	 */
	void setUseCases(UseCasesType value);

	/**
	 * Returns the value of the '<em><b>Technical Limitations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     What are the known technical limitations of the model? E.g. What kind(s) of data
	 *                                     should the model be expected not to perform well on? What are the factors that might
	 *                                     degrade model performance?
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technical Limitations</em>' containment reference.
	 * @see #setTechnicalLimitations(TechnicalLimitationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType_TechnicalLimitations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='technicalLimitations' namespace='##targetNamespace'"
	 * @generated
	 */
	TechnicalLimitationsType getTechnicalLimitations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConsiderationsType#getTechnicalLimitations <em>Technical Limitations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Limitations</em>' containment reference.
	 * @see #getTechnicalLimitations()
	 * @generated
	 */
	void setTechnicalLimitations(TechnicalLimitationsType value);

	/**
	 * Returns the value of the '<em><b>Performance Tradeoffs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     What are the known tradeoffs in accuracy/performance of the model?
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performance Tradeoffs</em>' containment reference.
	 * @see #setPerformanceTradeoffs(PerformanceTradeoffsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType_PerformanceTradeoffs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceTradeoffs' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceTradeoffsType getPerformanceTradeoffs();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConsiderationsType#getPerformanceTradeoffs <em>Performance Tradeoffs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Tradeoffs</em>' containment reference.
	 * @see #getPerformanceTradeoffs()
	 * @generated
	 */
	void setPerformanceTradeoffs(PerformanceTradeoffsType value);

	/**
	 * Returns the value of the '<em><b>Ethical Considerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     What are the ethical risks involved in the application of this model?
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ethical Considerations</em>' containment reference.
	 * @see #setEthicalConsiderations(EthicalConsiderationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType_EthicalConsiderations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ethicalConsiderations' namespace='##targetNamespace'"
	 * @generated
	 */
	EthicalConsiderationsType getEthicalConsiderations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConsiderationsType#getEthicalConsiderations <em>Ethical Considerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethical Considerations</em>' containment reference.
	 * @see #getEthicalConsiderations()
	 * @generated
	 */
	void setEthicalConsiderations(EthicalConsiderationsType value);

	/**
	 * Returns the value of the '<em><b>Environmental Considerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     What are the various environmental impacts the corresponding machine learning model has exhibited across its lifecycle?
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environmental Considerations</em>' containment reference.
	 * @see #setEnvironmentalConsiderations(EnvironmentalConsiderationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType_EnvironmentalConsiderations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentalConsiderations' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentalConsiderationsType getEnvironmentalConsiderations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConsiderationsType#getEnvironmentalConsiderations <em>Environmental Considerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmental Considerations</em>' containment reference.
	 * @see #getEnvironmentalConsiderations()
	 * @generated
	 */
	void setEnvironmentalConsiderations(EnvironmentalConsiderationsType value);

	/**
	 * Returns the value of the '<em><b>Fairness Assessments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     How does the model affect groups at risk of being systematically disadvantaged?
	 *                                     What are the harms and benefits to the various affected groups?
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fairness Assessments</em>' containment reference.
	 * @see #setFairnessAssessments(FairnessAssessmentsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getConsiderationsType_FairnessAssessments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fairnessAssessments' namespace='##targetNamespace'"
	 * @generated
	 */
	FairnessAssessmentsType getFairnessAssessments();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ConsiderationsType#getFairnessAssessments <em>Fairness Assessments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fairness Assessments</em>' containment reference.
	 * @see #getFairnessAssessments()
	 * @generated
	 */
	void setFairnessAssessments(FairnessAssessmentsType value);

} // ConsiderationsType
