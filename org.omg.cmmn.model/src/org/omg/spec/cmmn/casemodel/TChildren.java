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
 * A representation of the model object '<em><b>TChildren</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tChildren defines a container for zero or more "caseFileItem" elements.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TChildren#getCaseFileItem <em>Case File Item</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTChildren()
 * @model extendedMetaData="name='tChildren' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TChildren extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Case File Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TCaseFileItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         caseFileItem is the root element for CMMN data. 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case File Item</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTChildren_CaseFileItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseFileItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCaseFileItem> getCaseFileItem();

} // TChildren
