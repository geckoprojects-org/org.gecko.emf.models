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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType#getIn <em>In</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getQuantifierType()
 * @model abstract="true"
 *        extendedMetaData="name='QuantifierType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QuantifierType extends ExpressionType1 {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Variable im Some- oder Every-Konstrukt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableType3)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getQuantifierType_Variable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableType3 getVariable();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableType3 value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Mengen-/Sequenzausdruck im Some- oder Every-Konstrukt. Dies ist eine der wenigen Stellen im Ausdruckskalkül, wo multiple Werte erlaubt sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(InType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getQuantifierType_In()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='in' namespace='##targetNamespace'"
	 * @generated
	 */
	InType1 getIn();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(InType1 value);

	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aussage, die entsprechend der gewählten Quantifizierung erfüllt sein muss, so dass die Quantifizierung insgsamt erfüllt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfies</em>' containment reference.
	 * @see #setSatisfies(SatisfiesType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getQuantifierType_Satisfies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='satisfies' namespace='##targetNamespace'"
	 * @generated
	 */
	SatisfiesType getSatisfies();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType#getSatisfies <em>Satisfies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfies</em>' containment reference.
	 * @see #getSatisfies()
	 * @generated
	 */
	void setSatisfies(SatisfiesType value);

} // QuantifierType
