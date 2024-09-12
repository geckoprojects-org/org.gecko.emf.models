/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.MappingRuleType#getRuleDefinition <em>Rule Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MappingRuleType#getRuleReference <em>Rule Reference</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getMappingRuleType()
 * @model extendedMetaData="name='MappingRuleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MappingRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Definition</em>' attribute.
	 * @see #setRuleDefinition(String)
	 * @see net.opengis.gml.gml.GMLPackage#getMappingRuleType_RuleDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ruleDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRuleDefinition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MappingRuleType#getRuleDefinition <em>Rule Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Definition</em>' attribute.
	 * @see #getRuleDefinition()
	 * @generated
	 */
	void setRuleDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Rule Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Reference</em>' containment reference.
	 * @see #setRuleReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getMappingRuleType_RuleReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getRuleReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MappingRuleType#getRuleReference <em>Rule Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Reference</em>' containment reference.
	 * @see #getRuleReference()
	 * @generated
	 */
	void setRuleReference(ReferenceType value);

} // MappingRuleType
