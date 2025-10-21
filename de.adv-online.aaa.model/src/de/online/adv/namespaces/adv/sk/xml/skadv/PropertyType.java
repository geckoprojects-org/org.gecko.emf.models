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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PropertyType#getFirstStep <em>First Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PropertyType#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPropertyType()
 * @model extendedMetaData="name='PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PropertyType extends ExpressionType1 {
	/**
	 * Returns the value of the '<em><b>First Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Besonderer erster Schritt in einer Property-Definition zur Fixierung des Kontexts der weiteren Schritte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Step</em>' containment reference.
	 * @see #setFirstStep(FirstStepType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPropertyType_FirstStep()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='firstStep' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstStepType getFirstStep();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PropertyType#getFirstStep <em>First Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Step</em>' containment reference.
	 * @see #getFirstStep()
	 * @generated
	 */
	void setFirstStep(FirstStepType value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schritt n einer Property-Definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPropertyType_Step()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StepType1> getStep();

} // PropertyType
