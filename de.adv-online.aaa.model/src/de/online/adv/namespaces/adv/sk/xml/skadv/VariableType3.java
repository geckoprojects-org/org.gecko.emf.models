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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableType3#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVariableType3()
 * @model extendedMetaData="name='variable_._2_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VariableType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Klasse Variable steht für eine Expression, die durch eine Variable ausgedrückt wird.
	 * 
	 * Hinweis: 
	 * Das Ausdrucksmodell sieht nur wenige Möglichkeiten vor, Variablen zu setzen, nämlich das Some-Prädikat und die For-Schleife. 
	 * 
	 * Zusätzlich können Variablen von der Umgebung bereitgestellt werden. Im Design vom Januar 2014 ist nur eine solche Variable aus der Umgebung vorgesehen. Sie wird durch die PlacementRules MaximumAdjacentLineString und
	 * MaximumAdjacentSurface bereitgestellt, heißt $emit und bezeichnet das laufende Referenzobjekt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVariableType3_Variable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableType1 getVariable();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableType3#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableType1 value);

} // VariableType3
