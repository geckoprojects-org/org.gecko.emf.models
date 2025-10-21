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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType#getGroup <em>Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType#getPathElementGroup <em>Path Element Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType#getPathElement <em>Path Element</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType()
 * @model extendedMetaData="name='element_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Path Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse "PathElement" bündelt die weitgehend der SVG-Spezifikation nachgebildeten Beschreibungselemente für Pfade.
	 * 
	 * Pfade bestehen aus einer oder mehreren Pfadkomponenten, deren letztgesetzter Punkt, der laufende Punkt, immer Ausgangspunkt des nächsten anzuhängenden Geometriestücks ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Element Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType_PathElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" lower="2" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='PathElement:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getPathElementGroup();

	/**
	 * Returns the value of the '<em><b>Path Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.PathElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse "PathElement" bündelt die weitgehend der SVG-Spezifikation nachgebildeten Beschreibungselemente für Pfade.
	 * 
	 * Pfade bestehen aus einer oder mehreren Pfadkomponenten, deren letztgesetzter Punkt, der laufende Punkt, immer Ausgangspunkt des nächsten anzuhängenden Geometriestücks ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Element</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getElementType_PathElement()
	 * @model containment="true" lower="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PathElement' namespace='##targetNamespace' group='PathElement:group'"
	 * @generated
	 */
	EList<PathElementType> getPathElement();

} // ElementType
