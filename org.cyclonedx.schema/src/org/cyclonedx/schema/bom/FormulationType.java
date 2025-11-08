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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Describes how a component or service was manufactured or deployed. This is achieved through the use
 *                 of formulas, workflows, tasks, and steps, which declare the precise steps to reproduce along with the
 *                 observed formulas describing the steps which transpired in the manufacturing process.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.FormulationType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulationType#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulationType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulationType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulationType()
 * @model extendedMetaData="name='formulationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FormulationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.FormulaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulationType_Formula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formula' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FormulaType> getFormula();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulationType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                     do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulationType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // FormulationType
