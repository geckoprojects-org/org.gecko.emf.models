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
 * A representation of the model object '<em><b>TPlan Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getDefaultControl <em>Default Control</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='tPlanItemDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TPlanItemDefinition extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Control</em>' containment reference.
	 * @see #setDefaultControl(TPlanItemControl)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemDefinition_DefaultControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TPlanItemControl getDefaultControl();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getDefaultControl <em>Default Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Control</em>' containment reference.
	 * @see #getDefaultControl()
	 * @generated
	 */
	void setDefaultControl(TPlanItemControl value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItemDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TPlanItemDefinition
