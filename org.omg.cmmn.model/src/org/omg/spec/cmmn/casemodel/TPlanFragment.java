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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPlan Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tPlanFragment defines the type for element "planFragment"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanFragment#getPlanItem <em>Plan Item</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanFragment#getSentry <em>Sentry</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanFragment()
 * @model extendedMetaData="name='tPlanFragment' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TPlanFragment extends TPlanItemDefinition {
	/**
	 * Returns the value of the '<em><b>Plan Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TPlanItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Item</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanFragment_PlanItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='planItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TPlanItem> getPlanItem();

	/**
	 * Returns the value of the '<em><b>Sentry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TSentry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         sentry is the root element of "Sentry" in the Case Model and
	 *         comprises of zero or more OnParts and zero or one IfPart.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sentry</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanFragment_Sentry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sentry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TSentry> getSentry();

} // TPlanFragment
