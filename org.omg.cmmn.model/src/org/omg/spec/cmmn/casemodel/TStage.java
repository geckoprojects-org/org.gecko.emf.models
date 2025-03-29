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
 * A representation of the model object '<em><b>TStage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tStage defines the type for element "stage"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TStage#getPlanningTable <em>Planning Table</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TStage#getPlanItemDefinitionGroup <em>Plan Item Definition Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TStage#getPlanItemDefinition <em>Plan Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TStage#getExitCriterion <em>Exit Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TStage#isAutoComplete <em>Auto Complete</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTStage()
 * @model extendedMetaData="name='tStage' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TStage extends TPlanFragment {
	/**
	 * Returns the value of the '<em><b>Planning Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Table</em>' containment reference.
	 * @see #setPlanningTable(TPlanningTable)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTStage_PlanningTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='planningTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TPlanningTable getPlanningTable();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TStage#getPlanningTable <em>Planning Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Table</em>' containment reference.
	 * @see #getPlanningTable()
	 * @generated
	 */
	void setPlanningTable(TPlanningTable value);

	/**
	 * Returns the value of the '<em><b>Plan Item Definition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Item Definition Group</em>' attribute list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTStage_PlanItemDefinitionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='planItemDefinition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPlanItemDefinitionGroup();

	/**
	 * Returns the value of the '<em><b>Plan Item Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Item Definition</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTStage_PlanItemDefinition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='planItemDefinition' namespace='##targetNamespace' group='planItemDefinition:group'"
	 * @generated
	 */
	EList<TPlanItemDefinition> getPlanItemDefinition();

	/**
	 * Returns the value of the '<em><b>Exit Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TExitCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Criterion</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTStage_ExitCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exitCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TExitCriterion> getExitCriterion();

	/**
	 * Returns the value of the '<em><b>Auto Complete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Complete</em>' attribute.
	 * @see #isSetAutoComplete()
	 * @see #unsetAutoComplete()
	 * @see #setAutoComplete(boolean)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTStage_AutoComplete()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='autoComplete'"
	 * @generated
	 */
	boolean isAutoComplete();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TStage#isAutoComplete <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Complete</em>' attribute.
	 * @see #isSetAutoComplete()
	 * @see #unsetAutoComplete()
	 * @see #isAutoComplete()
	 * @generated
	 */
	void setAutoComplete(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.casemodel.TStage#isAutoComplete <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoComplete()
	 * @see #isAutoComplete()
	 * @see #setAutoComplete(boolean)
	 * @generated
	 */
	void unsetAutoComplete();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.casemodel.TStage#isAutoComplete <em>Auto Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Complete</em>' attribute is set.
	 * @see #unsetAutoComplete()
	 * @see #isAutoComplete()
	 * @see #setAutoComplete(boolean)
	 * @generated
	 */
	boolean isSetAutoComplete();

} // TStage
