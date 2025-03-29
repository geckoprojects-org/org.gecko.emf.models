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
 * A representation of the model object '<em><b>TDecision Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getRule <em>Rule</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getHitPolicy <em>Hit Policy</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getOutputLabel <em>Output Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable()
 * @model extendedMetaData="name='tDecisionTable' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDecisionTable extends TExpression {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TInputClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TInputClause> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TOutputClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_Output()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TOutputClause> getOutput();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TRuleAnnotationClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TRuleAnnotationClause> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDecisionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDecisionRule> getRule();

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.spec.dmn.dmn.TBuiltinAggregator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
	 * @see #isSetAggregation()
	 * @see #unsetAggregation()
	 * @see #setAggregation(TBuiltinAggregator)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_Aggregation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregation'"
	 * @generated
	 */
	TBuiltinAggregator getAggregation();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
	 * @see #isSetAggregation()
	 * @see #unsetAggregation()
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(TBuiltinAggregator value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregation()
	 * @see #getAggregation()
	 * @see #setAggregation(TBuiltinAggregator)
	 * @generated
	 */
	void unsetAggregation();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getAggregation <em>Aggregation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation</em>' attribute is set.
	 * @see #unsetAggregation()
	 * @see #getAggregation()
	 * @see #setAggregation(TBuiltinAggregator)
	 * @generated
	 */
	boolean isSetAggregation();

	/**
	 * Returns the value of the '<em><b>Hit Policy</b></em>' attribute.
	 * The default value is <code>"UNIQUE"</code>.
	 * The literals are from the enumeration {@link org.omg.spec.dmn.dmn.THitPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Policy</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.THitPolicy
	 * @see #isSetHitPolicy()
	 * @see #unsetHitPolicy()
	 * @see #setHitPolicy(THitPolicy)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_HitPolicy()
	 * @model default="UNIQUE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='hitPolicy'"
	 * @generated
	 */
	THitPolicy getHitPolicy();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getHitPolicy <em>Hit Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Policy</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.THitPolicy
	 * @see #isSetHitPolicy()
	 * @see #unsetHitPolicy()
	 * @see #getHitPolicy()
	 * @generated
	 */
	void setHitPolicy(THitPolicy value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getHitPolicy <em>Hit Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHitPolicy()
	 * @see #getHitPolicy()
	 * @see #setHitPolicy(THitPolicy)
	 * @generated
	 */
	void unsetHitPolicy();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getHitPolicy <em>Hit Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hit Policy</em>' attribute is set.
	 * @see #unsetHitPolicy()
	 * @see #getHitPolicy()
	 * @see #setHitPolicy(THitPolicy)
	 * @generated
	 */
	boolean isSetHitPolicy();

	/**
	 * Returns the value of the '<em><b>Output Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Label</em>' attribute.
	 * @see #setOutputLabel(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_OutputLabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputLabel'"
	 * @generated
	 */
	String getOutputLabel();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getOutputLabel <em>Output Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Label</em>' attribute.
	 * @see #getOutputLabel()
	 * @generated
	 */
	void setOutputLabel(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Orientation</b></em>' attribute.
	 * The default value is <code>"Rule-as-Row"</code>.
	 * The literals are from the enumeration {@link org.omg.spec.dmn.dmn.TDecisionTableOrientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Orientation</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
	 * @see #isSetPreferredOrientation()
	 * @see #unsetPreferredOrientation()
	 * @see #setPreferredOrientation(TDecisionTableOrientation)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionTable_PreferredOrientation()
	 * @model default="Rule-as-Row" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='preferredOrientation'"
	 * @generated
	 */
	TDecisionTableOrientation getPreferredOrientation();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Orientation</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
	 * @see #isSetPreferredOrientation()
	 * @see #unsetPreferredOrientation()
	 * @see #getPreferredOrientation()
	 * @generated
	 */
	void setPreferredOrientation(TDecisionTableOrientation value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreferredOrientation()
	 * @see #getPreferredOrientation()
	 * @see #setPreferredOrientation(TDecisionTableOrientation)
	 * @generated
	 */
	void unsetPreferredOrientation();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TDecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preferred Orientation</em>' attribute is set.
	 * @see #unsetPreferredOrientation()
	 * @see #getPreferredOrientation()
	 * @see #setPreferredOrientation(TDecisionTableOrientation)
	 * @generated
	 */
	boolean isSetPreferredOrientation();

} // TDecisionTable
