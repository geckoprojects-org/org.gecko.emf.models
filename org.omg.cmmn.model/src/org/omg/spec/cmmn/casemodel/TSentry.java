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
 * A representation of the model object '<em><b>TSentry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tSentry defines the type of element "sentry"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TSentry#getOnPartGroup <em>On Part Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TSentry#getOnPart <em>On Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TSentry#getIfPart <em>If Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TSentry#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTSentry()
 * @model extendedMetaData="name='tSentry' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TSentry extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>On Part Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Part Group</em>' attribute list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTSentry_OnPartGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='onPart:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOnPartGroup();

	/**
	 * Returns the value of the '<em><b>On Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TOnPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Part</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTSentry_OnPart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onPart' namespace='##targetNamespace' group='onPart:group'"
	 * @generated
	 */
	EList<TOnPart> getOnPart();

	/**
	 * Returns the value of the '<em><b>If Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Part</em>' containment reference.
	 * @see #setIfPart(TIfPart)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTSentry_IfPart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ifPart' namespace='##targetNamespace'"
	 * @generated
	 */
	TIfPart getIfPart();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TSentry#getIfPart <em>If Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Part</em>' containment reference.
	 * @see #getIfPart()
	 * @generated
	 */
	void setIfPart(TIfPart value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTSentry_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TSentry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TSentry
