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
 * A representation of the model object '<em><b>TCase Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRefinement <em>Binding Refinement</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRef <em>Binding Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseParameter()
 * @model extendedMetaData="name='tCaseParameter' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCaseParameter extends TParameter {
	/**
	 * Returns the value of the '<em><b>Binding Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Refinement</em>' containment reference.
	 * @see #setBindingRefinement(TExpression)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseParameter_BindingRefinement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bindingRefinement' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getBindingRefinement();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRefinement <em>Binding Refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Refinement</em>' containment reference.
	 * @see #getBindingRefinement()
	 * @generated
	 */
	void setBindingRefinement(TExpression value);

	/**
	 * Returns the value of the '<em><b>Binding Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               bindingRef refers a "caseFileItem" element
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Ref</em>' attribute.
	 * @see #setBindingRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseParameter_BindingRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='bindingRef'"
	 * @generated
	 */
	String getBindingRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRef <em>Binding Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Ref</em>' attribute.
	 * @see #getBindingRef()
	 * @generated
	 */
	void setBindingRef(String value);

} // TCaseParameter
