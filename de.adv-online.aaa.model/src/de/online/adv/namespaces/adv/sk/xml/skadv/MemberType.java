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
 * A representation of the model object '<em><b>Member Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.MemberType#getSimpleGraphicGroup <em>Simple Graphic Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.MemberType#getSimpleGraphic <em>Simple Graphic</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getMemberType()
 * @model extendedMetaData="name='member_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MemberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Graphic Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SimpleGraphic ist eine abstrakte Klasse, die für verschiedene Arten einfacher Symboldefinitionen steht, die jeweils durch eine Flächen- oder Liniengeometrie oder eine Textdefinition beschrieben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Graphic Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getMemberType_SimpleGraphicGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='SimpleGraphic:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSimpleGraphicGroup();

	/**
	 * Returns the value of the '<em><b>Simple Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SimpleGraphic ist eine abstrakte Klasse, die für verschiedene Arten einfacher Symboldefinitionen steht, die jeweils durch eine Flächen- oder Liniengeometrie oder eine Textdefinition beschrieben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Graphic</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getMemberType_SimpleGraphic()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleGraphic' namespace='##targetNamespace' group='SimpleGraphic:group'"
	 * @generated
	 */
	SimpleGraphicType getSimpleGraphic();

} // MemberType
