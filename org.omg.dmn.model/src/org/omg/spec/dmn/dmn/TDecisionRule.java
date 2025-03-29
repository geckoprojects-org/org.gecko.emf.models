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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDecision Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionRule#getInputEntry <em>Input Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionRule#getOutputEntry <em>Output Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionRule#getAnnotationEntry <em>Annotation Entry</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionRule()
 * @model extendedMetaData="name='tDecisionRule' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDecisionRule extends TDMNElement {
	/**
	 * Returns the value of the '<em><b>Input Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TUnaryTests}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Entry</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionRule_InputEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TUnaryTests> getInputEntry();

	/**
	 * Returns the value of the '<em><b>Output Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TLiteralExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Entry</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionRule_OutputEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outputEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TLiteralExpression> getOutputEntry();

	/**
	 * Returns the value of the '<em><b>Annotation Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TRuleAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Entry</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionRule_AnnotationEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotationEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TRuleAnnotation> getAnnotationEntry();

} // TDecisionRule
