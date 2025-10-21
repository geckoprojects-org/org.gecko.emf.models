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

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#isIsAttr <em>Is Attr</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#getStepName <em>Step Name</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStepType()
 * @model extendedMetaData="name='StepType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prädikat eines Step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStepType_Predicate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateType getPredicate();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(PredicateType value);

	/**
	 * Returns the value of the '<em><b>Is Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Schritt geht auf ein Attribut im GML-Modell. Dies entspricht in XPath @name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Attr</em>' attribute.
	 * @see #isSetIsAttr()
	 * @see #unsetIsAttr()
	 * @see #setIsAttr(boolean)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStepType_IsAttr()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isAttr'"
	 * @generated
	 */
	boolean isIsAttr();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#isIsAttr <em>Is Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attr</em>' attribute.
	 * @see #isSetIsAttr()
	 * @see #unsetIsAttr()
	 * @see #isIsAttr()
	 * @generated
	 */
	void setIsAttr(boolean value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#isIsAttr <em>Is Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAttr()
	 * @see #isIsAttr()
	 * @see #setIsAttr(boolean)
	 * @generated
	 */
	void unsetIsAttr();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#isIsAttr <em>Is Attr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Attr</em>' attribute is set.
	 * @see #unsetIsAttr()
	 * @see #isIsAttr()
	 * @see #setIsAttr(boolean)
	 * @generated
	 */
	boolean isSetIsAttr();

	/**
	 * Returns the value of the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Schritts.
	 * 
	 * Es handelt sich um einen namensraumbehafteten Namen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Name</em>' attribute.
	 * @see #setStepName(QName)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getStepType_StepName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='stepName'"
	 * @generated
	 */
	QName getStepName();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType#getStepName <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Name</em>' attribute.
	 * @see #getStepName()
	 * @generated
	 */
	void setStepName(QName value);

} // StepType
