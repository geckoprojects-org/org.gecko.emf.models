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
 * A representation of the model object '<em><b>For Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForType#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForType#getIn <em>In</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForType#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getForType()
 * @model extendedMetaData="name='ForType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ForType extends ExpressionType1 {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Variable im For-Konstrukt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getForType_Variable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableType getVariable();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForType#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableType value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Mengen-/Sequenzausdruck im For-Konstrukt. Dies ist eine der wenigen Stellen im Ausdruckskalkül, wo multiple Werte erlaubt sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(InType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getForType_In()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='in' namespace='##targetNamespace'"
	 * @generated
	 */
	InType getIn();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForType#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(InType value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausdruck, der für den Wert der Variablen ausgewertet wird und der als Teil der durch das "For" insgesamt generierten Sequenz betrachtet wird. 
	 * 
	 * Alle in ener For-Konstruktion per "return" angegebenen atomaren Ausrücke müssen denselben Typ aufweisen. Werden Sequenzen in "return" angegeben, so müssen deren atomare Elemente denselben Typ aufweisen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(ReturnType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getForType_Return()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='return' namespace='##targetNamespace'"
	 * @generated
	 */
	ReturnType getReturn();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForType#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnType value);

} // ForType
