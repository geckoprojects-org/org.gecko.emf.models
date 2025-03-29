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
 * A representation of the model object '<em><b>THuman Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tHumanTask defines the type of element "humanTask"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.THumanTask#getPlanningTable <em>Planning Table</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.THumanTask#getPerformerRef <em>Performer Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTHumanTask()
 * @model extendedMetaData="name='tHumanTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface THumanTask extends TTask {
	/**
	 * Returns the value of the '<em><b>Planning Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Table</em>' containment reference.
	 * @see #setPlanningTable(TPlanningTable)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTHumanTask_PlanningTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='planningTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TPlanningTable getPlanningTable();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.THumanTask#getPlanningTable <em>Planning Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Table</em>' containment reference.
	 * @see #getPlanningTable()
	 * @generated
	 */
	void setPlanningTable(TPlanningTable value);

	/**
	 * Returns the value of the '<em><b>Performer Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               performerRef refers a "role" element
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer Ref</em>' attribute.
	 * @see #setPerformerRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTHumanTask_PerformerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='performerRef'"
	 * @generated
	 */
	String getPerformerRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.THumanTask#getPerformerRef <em>Performer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer Ref</em>' attribute.
	 * @see #getPerformerRef()
	 * @generated
	 */
	void setPerformerRef(String value);

} // THumanTask
