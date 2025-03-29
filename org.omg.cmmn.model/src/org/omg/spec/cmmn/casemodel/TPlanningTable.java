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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPlanning Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanningTable#getTableItemGroup <em>Table Item Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanningTable#getTableItem <em>Table Item</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanningTable#getApplicabilityRule <em>Applicability Rule</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanningTable()
 * @model extendedMetaData="name='tPlanningTable' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TPlanningTable extends TTableItem {
	/**
	 * Returns the value of the '<em><b>Table Item Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Item Group</em>' attribute list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanningTable_TableItemGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='tableItem:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTableItemGroup();

	/**
	 * Returns the value of the '<em><b>Table Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TTableItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Item</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanningTable_TableItem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableItem' namespace='##targetNamespace' group='tableItem:group'"
	 * @generated
	 */
	EList<TTableItem> getTableItem();

	/**
	 * Returns the value of the '<em><b>Applicability Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TApplicabilityRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability Rule</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanningTable_ApplicabilityRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicabilityRule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TApplicabilityRule> getApplicabilityRule();

} // TPlanningTable
