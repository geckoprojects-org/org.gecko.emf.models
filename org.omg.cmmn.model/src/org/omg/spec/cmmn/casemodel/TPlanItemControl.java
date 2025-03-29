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
package org.omg.spec.cmmn.casemodel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPlan Item Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tPlanItemcontrol defines the type of element "planItemControl".
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getRepetitionRule <em>Repetition Rule</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getRequiredRule <em>Required Rule</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getManualActivationRule <em>Manual Activation Rule</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemControl()
 * @model extendedMetaData="name='tPlanItemControl' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TPlanItemControl extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Repetition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         repetitionRule is the root element for specifying a 
	 *         repetition rule for a PlanItemDefinition element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repetition Rule</em>' containment reference.
	 * @see #setRepetitionRule(TRepetitionRule)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemControl_RepetitionRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repetitionRule' namespace='##targetNamespace'"
	 * @generated
	 */
	TRepetitionRule getRepetitionRule();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getRepetitionRule <em>Repetition Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Rule</em>' containment reference.
	 * @see #getRepetitionRule()
	 * @generated
	 */
	void setRepetitionRule(TRepetitionRule value);

	/**
	 * Returns the value of the '<em><b>Required Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         requiredRule is the root element for specifying a 
	 *         required rule for a PlanItemDefinition element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Rule</em>' containment reference.
	 * @see #setRequiredRule(TRequiredRule)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemControl_RequiredRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredRule' namespace='##targetNamespace'"
	 * @generated
	 */
	TRequiredRule getRequiredRule();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getRequiredRule <em>Required Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Rule</em>' containment reference.
	 * @see #getRequiredRule()
	 * @generated
	 */
	void setRequiredRule(TRequiredRule value);

	/**
	 * Returns the value of the '<em><b>Manual Activation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         manualActivationRule is the root element for specifying an 
	 *         manual activation rule for a PlanItemDefinition element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manual Activation Rule</em>' containment reference.
	 * @see #setManualActivationRule(TManualActivationRule)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemControl_ManualActivationRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manualActivationRule' namespace='##targetNamespace'"
	 * @generated
	 */
	TManualActivationRule getManualActivationRule();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getManualActivationRule <em>Manual Activation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Activation Rule</em>' containment reference.
	 * @see #getManualActivationRule()
	 * @generated
	 */
	void setManualActivationRule(TManualActivationRule value);

} // TPlanItemControl
