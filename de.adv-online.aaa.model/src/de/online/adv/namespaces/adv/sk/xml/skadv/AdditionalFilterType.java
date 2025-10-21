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
 * A representation of the model object '<em><b>Additional Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalFilterType#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalFilterType#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdditionalFilterType()
 * @model extendedMetaData="name='additionalFilter_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdditionalFilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese abstrakte Klasse bezeichnet einen Ausdruck.
	 * 
	 * Ausdrücke sind im allgemeinen Fall Sequenzen von Werten eines bestimmten einheitlichen Datentyps. 
	 * 
	 * Für die leere Sequenz ist der Typ "void" vorgesehen, der für das Fehlen eines Typs steht.
	 * 
	 * Sequenzen mit einem einzigen Wert sind gleichbedeutend mit dem Wert selbst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdditionalFilterType_ExpressionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='Expression:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese abstrakte Klasse bezeichnet einen Ausdruck.
	 * 
	 * Ausdrücke sind im allgemeinen Fall Sequenzen von Werten eines bestimmten einheitlichen Datentyps. 
	 * 
	 * Für die leere Sequenz ist der Typ "void" vorgesehen, der für das Fehlen eines Typs steht.
	 * 
	 * Sequenzen mit einem einzigen Wert sind gleichbedeutend mit dem Wert selbst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAdditionalFilterType_Expression()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Expression' namespace='##targetNamespace' group='Expression:group'"
	 * @generated
	 */
	ExpressionType1 getExpression();

} // AdditionalFilterType
