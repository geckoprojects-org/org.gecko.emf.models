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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType#getFirstStepGroup <em>First Step Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType#getFirstStep <em>First Step</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFirstStepType()
 * @model extendedMetaData="name='firstStep_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FirstStepType extends EObject {
	/**
	 * Returns the value of the '<em><b>First Step Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte FirstStep-Klasse leitet einen Property-Zugriff optional ein. Fehlt diese Einleitung, so wird der Property-Zugriff von einem angenommenen SelfStep eingeleitet.
	 * 
	 * Der FirstStep fixiert den Kontext der weiteren Steps.
	 * 
	 * FirstStep kann ein Prädikat tragen. Dieses wird dann im definierten Kontext interpretiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Step Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFirstStepType_FirstStepGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='FirstStep:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFirstStepGroup();

	/**
	 * Returns the value of the '<em><b>First Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte FirstStep-Klasse leitet einen Property-Zugriff optional ein. Fehlt diese Einleitung, so wird der Property-Zugriff von einem angenommenen SelfStep eingeleitet.
	 * 
	 * Der FirstStep fixiert den Kontext der weiteren Steps.
	 * 
	 * FirstStep kann ein Prädikat tragen. Dieses wird dann im definierten Kontext interpretiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Step</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFirstStepType_FirstStep()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FirstStep' namespace='##targetNamespace' group='FirstStep:group'"
	 * @generated
	 */
	FirstStepType1 getFirstStep();

} // FirstStepType
