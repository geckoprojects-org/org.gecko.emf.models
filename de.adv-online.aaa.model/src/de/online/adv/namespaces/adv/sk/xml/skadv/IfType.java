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
 * A representation of the model object '<em><b>If Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfType#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfType#getThen <em>Then</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfType#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getIfType()
 * @model extendedMetaData="name='IfType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IfType extends ExpressionType1 {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Bedingung im If-Ausdruck wird als "boolean" ausgewertet. Sie entscheidet darüber, ob der "then"-Zweig oder der "else"-Zweig zum Wert des Gesamtausdrucks wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getIfType_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionType getCondition();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Ausdruck, der als Wert des "If" eingesetzt wird, falls "condition" zu "true" auswertet.
	 * 
	 * Es ist an dieser Stelle auch eine Menge/Sequenz erlaubt. Der Typ der Elemente oder des Asudrucks selbst muss mit dem bei "else" übereinstimmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(ThenType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getIfType_Then()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='then' namespace='##targetNamespace'"
	 * @generated
	 */
	ThenType getThen();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfType#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(ThenType value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Ausdruck, der als Wert des "If" eingesetzt wird, falls "condition" zu "false" auswertet.
	 * 
	 * Es ist an dieser Stelle auch eine Menge/Sequenz erlaubt. Der Typ der Elemente oder des Asudrucks selbst muss mit dem bei "then" übereinstimmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(ElseType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getIfType_Else()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='else' namespace='##targetNamespace'"
	 * @generated
	 */
	ElseType getElse();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfType#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ElseType value);

} // IfType
