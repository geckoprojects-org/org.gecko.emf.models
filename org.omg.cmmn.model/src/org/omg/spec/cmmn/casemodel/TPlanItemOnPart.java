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
 * A representation of the model object '<em><b>TPlan Item On Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getStandardEvent <em>Standard Event</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getExitCriterionRef <em>Exit Criterion Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemOnPart()
 * @model extendedMetaData="name='tPlanItemOnPart' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TPlanItemOnPart extends TOnPart {
	/**
	 * Returns the value of the '<em><b>Standard Event</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.spec.cmmn.casemodel.PlanItemTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Event</em>' attribute.
	 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
	 * @see #isSetStandardEvent()
	 * @see #unsetStandardEvent()
	 * @see #setStandardEvent(PlanItemTransition)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemOnPart_StandardEvent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='standardEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanItemTransition getStandardEvent();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getStandardEvent <em>Standard Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Event</em>' attribute.
	 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
	 * @see #isSetStandardEvent()
	 * @see #unsetStandardEvent()
	 * @see #getStandardEvent()
	 * @generated
	 */
	void setStandardEvent(PlanItemTransition value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getStandardEvent <em>Standard Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandardEvent()
	 * @see #getStandardEvent()
	 * @see #setStandardEvent(PlanItemTransition)
	 * @generated
	 */
	void unsetStandardEvent();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getStandardEvent <em>Standard Event</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standard Event</em>' attribute is set.
	 * @see #unsetStandardEvent()
	 * @see #getStandardEvent()
	 * @see #setStandardEvent(PlanItemTransition)
	 * @generated
	 */
	boolean isSetStandardEvent();

	/**
	 * Returns the value of the '<em><b>Exit Criterion Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               exitCriterionRef refers a "ExitCriterion" element that is contained in the
	 *               "planItem" referred by sourceRef
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Criterion Ref</em>' attribute.
	 * @see #setExitCriterionRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemOnPart_ExitCriterionRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='exitCriterionRef'"
	 * @generated
	 */
	String getExitCriterionRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getExitCriterionRef <em>Exit Criterion Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Criterion Ref</em>' attribute.
	 * @see #getExitCriterionRef()
	 * @generated
	 */
	void setExitCriterionRef(String value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               sourceRef refers a "planItem" element
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Ref</em>' attribute.
	 * @see #setSourceRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemOnPart_SourceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='sourceRef'"
	 * @generated
	 */
	String getSourceRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getSourceRef <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' attribute.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(String value);

} // TPlanItemOnPart
