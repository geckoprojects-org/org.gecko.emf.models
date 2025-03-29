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
 * A representation of the model object '<em><b>TCase File Item On Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getStandardEvent <em>Standard Event</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseFileItemOnPart()
 * @model extendedMetaData="name='tCaseFileItemOnPart' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCaseFileItemOnPart extends TOnPart {
	/**
	 * Returns the value of the '<em><b>Standard Event</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.spec.cmmn.casemodel.CaseFileItemTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Event</em>' attribute.
	 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
	 * @see #isSetStandardEvent()
	 * @see #unsetStandardEvent()
	 * @see #setStandardEvent(CaseFileItemTransition)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseFileItemOnPart_StandardEvent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='standardEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	CaseFileItemTransition getStandardEvent();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getStandardEvent <em>Standard Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Event</em>' attribute.
	 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
	 * @see #isSetStandardEvent()
	 * @see #unsetStandardEvent()
	 * @see #getStandardEvent()
	 * @generated
	 */
	void setStandardEvent(CaseFileItemTransition value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getStandardEvent <em>Standard Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandardEvent()
	 * @see #getStandardEvent()
	 * @see #setStandardEvent(CaseFileItemTransition)
	 * @generated
	 */
	void unsetStandardEvent();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getStandardEvent <em>Standard Event</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standard Event</em>' attribute is set.
	 * @see #unsetStandardEvent()
	 * @see #getStandardEvent()
	 * @see #setStandardEvent(CaseFileItemTransition)
	 * @generated
	 */
	boolean isSetStandardEvent();

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               sourceRef refers a "caseFileItem" element
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Ref</em>' attribute.
	 * @see #setSourceRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseFileItemOnPart_SourceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='sourceRef'"
	 * @generated
	 */
	String getSourceRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getSourceRef <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' attribute.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(String value);

} // TCaseFileItemOnPart
