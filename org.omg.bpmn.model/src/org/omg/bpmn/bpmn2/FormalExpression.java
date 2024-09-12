/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.omg.bpmn.bpmn2;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.FormalExpression#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.FormalExpression#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.FormalExpression#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFormalExpression()
 * @model extendedMetaData="name='tFormalExpression' kind='mixed'"
 * @generated
 */
@ProviderType
public interface FormalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFormalExpression_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFormalExpression_Body()
	 * @model required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.FormalExpression#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Evaluates To Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluates To Type Ref</em>' reference.
	 * @see #setEvaluatesToTypeRef(ItemDefinition)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFormalExpression_EvaluatesToTypeRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='evaluatesToTypeRef'"
	 * @generated
	 */
	ItemDefinition getEvaluatesToTypeRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluates To Type Ref</em>' reference.
	 * @see #getEvaluatesToTypeRef()
	 * @generated
	 */
	void setEvaluatesToTypeRef(ItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFormalExpression_Language()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.FormalExpression#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // FormalExpression
