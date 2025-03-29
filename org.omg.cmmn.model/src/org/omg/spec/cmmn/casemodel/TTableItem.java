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

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTableItem#getApplicabilityRuleRefs <em>Applicability Rule Refs</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTableItem#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTableItem()
 * @model abstract="true"
 *        extendedMetaData="name='tTableItem' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TTableItem extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Applicability Rule Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               applicabilityRuleRefs refers one or more "applicabilityRule" elements.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability Rule Refs</em>' attribute.
	 * @see #setApplicabilityRuleRefs(List)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTableItem_ApplicabilityRuleRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='applicabilityRuleRefs'"
	 * @generated
	 */
	List<String> getApplicabilityRuleRefs();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TTableItem#getApplicabilityRuleRefs <em>Applicability Rule Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability Rule Refs</em>' attribute.
	 * @see #getApplicabilityRuleRefs()
	 * @generated
	 */
	void setApplicabilityRuleRefs(List<String> value);

	/**
	 * Returns the value of the '<em><b>Authorized Role Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               authorizedRoleRefs refers zero or more "role" elements.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorized Role Refs</em>' attribute.
	 * @see #setAuthorizedRoleRefs(List)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTableItem_AuthorizedRoleRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='authorizedRoleRefs'"
	 * @generated
	 */
	List<String> getAuthorizedRoleRefs();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TTableItem#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorized Role Refs</em>' attribute.
	 * @see #getAuthorizedRoleRefs()
	 * @generated
	 */
	void setAuthorizedRoleRefs(List<String> value);

} // TTableItem
