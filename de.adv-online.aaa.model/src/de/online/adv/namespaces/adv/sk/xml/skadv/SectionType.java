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
 * A representation of the model object '<em><b>Section Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SectionType#getCompoundStrokeSectionGroup <em>Compound Stroke Section Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SectionType#getCompoundStrokeSection <em>Compound Stroke Section</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSectionType()
 * @model extendedMetaData="name='section_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compound Stroke Section Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine abstrakte CompoundStrokeSection definiert einen Abschnitt innerhalb eines CompoundStroke.
	 * 
	 * Das Property "length", gegeben in der Einheit, die durch "mapLengthFactor" vorgegeben ist (Default: mm/100) spezifiziert die Länge des jeweiligen Abschnitts. 
	 * 
	 * Es muss in einem CompoundStroke wenigstens eine CompoundStrokeSection existieren, die eine "length" > 0 aufweist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Stroke Section Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSectionType_CompoundStrokeSectionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='CompoundStrokeSection:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCompoundStrokeSectionGroup();

	/**
	 * Returns the value of the '<em><b>Compound Stroke Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine abstrakte CompoundStrokeSection definiert einen Abschnitt innerhalb eines CompoundStroke.
	 * 
	 * Das Property "length", gegeben in der Einheit, die durch "mapLengthFactor" vorgegeben ist (Default: mm/100) spezifiziert die Länge des jeweiligen Abschnitts. 
	 * 
	 * Es muss in einem CompoundStroke wenigstens eine CompoundStrokeSection existieren, die eine "length" > 0 aufweist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Stroke Section</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSectionType_CompoundStrokeSection()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompoundStrokeSection' namespace='##targetNamespace' group='CompoundStrokeSection:group'"
	 * @generated
	 */
	CompoundStrokeSectionType getCompoundStrokeSection();

} // SectionType
