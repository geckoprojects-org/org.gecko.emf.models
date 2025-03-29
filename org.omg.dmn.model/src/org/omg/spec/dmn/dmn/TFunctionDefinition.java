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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFunction Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionDefinition()
 * @model extendedMetaData="name='tFunctionDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TFunctionDefinition extends TExpression {
	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TInformationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionDefinition_FormalParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formalParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TInformationItem> getFormalParameter();

	/**
	 * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Group</em>' attribute list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionDefinition_ExpressionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='expression:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionDefinition_Expression()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='expression:group'"
	 * @generated
	 */
	TExpression getExpression();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"FEEL"</code>.
	 * The literals are from the enumeration {@link org.omg.spec.dmn.dmn.TFunctionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TFunctionKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(TFunctionKind)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionDefinition_Kind()
	 * @model default="FEEL" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	TFunctionKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TFunctionKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TFunctionKind value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(TFunctionKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(TFunctionKind)
	 * @generated
	 */
	boolean isSetKind();

} // TFunctionDefinition
