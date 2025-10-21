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
 * A representation of the model object '<em><b>Interior Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType1#getFillGroup <em>Fill Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType1#getFill <em>Fill</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getInteriorType1()
 * @model extendedMetaData="name='interior_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InteriorType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Fill Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Fill enthält die Definition für die Signaturierung des Inneren einer Flächengeometrie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getInteriorType1_FillGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='Fill:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFillGroup();

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Fill enthält die Definition für die Signaturierung des Inneren einer Flächengeometrie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getInteriorType1_Fill()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fill' namespace='##targetNamespace' group='Fill:group'"
	 * @generated
	 */
	FillType getFill();

} // InteriorType1
