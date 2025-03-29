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
 * A representation of the model object '<em><b>TUser Event Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TUserEventListener#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTUserEventListener()
 * @model extendedMetaData="name='tUserEventListener' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TUserEventListener extends TEventListener {
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
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTUserEventListener_AuthorizedRoleRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='authorizedRoleRefs'"
	 * @generated
	 */
	List<String> getAuthorizedRoleRefs();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TUserEventListener#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorized Role Refs</em>' attribute.
	 * @see #getAuthorizedRoleRefs()
	 * @generated
	 */
	void setAuthorizedRoleRefs(List<String> value);

} // TUserEventListener
