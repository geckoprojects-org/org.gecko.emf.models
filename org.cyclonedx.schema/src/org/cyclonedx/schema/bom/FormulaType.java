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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Describes workflows and resources that captures rules and other aspects of how the associated
 *                 BOM component or service was formed.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.FormulaType#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulaType#getServices <em>Services</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulaType#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulaType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulaType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.FormulaType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulaType()
 * @model extendedMetaData="name='formulaType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FormulaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transient components that are used in tasks that constitute one or more of
	 *                         this formula's workflows
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ComponentsType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulaType_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType2 getComponents();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FormulaType#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(ComponentsType2 value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transient services that are used in tasks that constitute one or more of
	 *                         this formula's workflows
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(ServicesType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulaType_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicesType2 getServices();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FormulaType#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesType2 value);

	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of workflows that can be declared to accomplish specific orchestrated goals
	 *                         and independently triggered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workflows</em>' containment reference.
	 * @see #setWorkflows(WorkflowsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulaType_Workflows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workflows' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkflowsType getWorkflows();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FormulaType#getWorkflows <em>Workflows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflows</em>' containment reference.
	 * @see #getWorkflows()
	 * @generated
	 */
	void setWorkflows(WorkflowsType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document properties in a name/value store.
	 *                         This provides flexibility to include data not officially supported in the standard
	 *                         without having to use additional namespaces or create extensions. Property names
	 *                         of interest to the general public are encouraged to be registered in the
	 *                         CycloneDX Property Taxonomy - https://github.com/CycloneDX/cyclonedx-property-taxonomy.
	 *                         Formal registration is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulaType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FormulaType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the formula elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulaType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.FormulaType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFormulaType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // FormulaType
