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
package org.omg.spec.bpmn.bpmn;

import java.math.BigInteger;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TStandard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#isTestBefore <em>Test Before</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTStandardLoopCharacteristics()
 * @model extendedMetaData="name='tStandardLoopCharacteristics' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TStandardLoopCharacteristics extends TLoopCharacteristics {
	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(TExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTStandardLoopCharacteristics_LoopCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loopCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getLoopCondition();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(TExpression value);

	/**
	 * Returns the value of the '<em><b>Loop Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Maximum</em>' attribute.
	 * @see #setLoopMaximum(BigInteger)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTStandardLoopCharacteristics_LoopMaximum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='loopMaximum'"
	 * @generated
	 */
	BigInteger getLoopMaximum();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Maximum</em>' attribute.
	 * @see #getLoopMaximum()
	 * @generated
	 */
	void setLoopMaximum(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Test Before</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Before</em>' attribute.
	 * @see #isSetTestBefore()
	 * @see #unsetTestBefore()
	 * @see #setTestBefore(boolean)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTStandardLoopCharacteristics_TestBefore()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='testBefore'"
	 * @generated
	 */
	boolean isTestBefore();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#isTestBefore <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Before</em>' attribute.
	 * @see #isSetTestBefore()
	 * @see #unsetTestBefore()
	 * @see #isTestBefore()
	 * @generated
	 */
	void setTestBefore(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#isTestBefore <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTestBefore()
	 * @see #isTestBefore()
	 * @see #setTestBefore(boolean)
	 * @generated
	 */
	void unsetTestBefore();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#isTestBefore <em>Test Before</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Before</em>' attribute is set.
	 * @see #unsetTestBefore()
	 * @see #isTestBefore()
	 * @see #setTestBefore(boolean)
	 * @generated
	 */
	boolean isSetTestBefore();

} // TStandardLoopCharacteristics
