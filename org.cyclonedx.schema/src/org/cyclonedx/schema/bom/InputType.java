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
 * A representation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Type that represents various input data types and formats.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getResource <em>Resource</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getEnvironmentVars <em>Environment Vars</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getSource <em>Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getTarget <em>Target</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.InputType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType()
 * @model extendedMetaData="name='inputType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             A reference to an independent resource provided as an input to a task by the workflow runtime.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceReferenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferenceType getResource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.InputType#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceReferenceType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Inputs that have the form of parameters with names and values.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType getParameters();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.InputType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType value);

	/**
	 * Returns the value of the '<em><b>Environment Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Inputs that have the form of parameters with names and values.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment Vars</em>' containment reference.
	 * @see #setEnvironmentVars(EnvironmentVarsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_EnvironmentVars()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentVars' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentVarsType1 getEnvironmentVars();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.InputType#getEnvironmentVars <em>Environment Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment Vars</em>' containment reference.
	 * @see #getEnvironmentVars()
	 * @generated
	 */
	void setEnvironmentVars(EnvironmentVarsType1 value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Inputs that have the form of data.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(AttachedTextType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	AttachedTextType getData();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.InputType#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(AttachedTextType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A references to the component or service that provided the input to the task
	 *                         (e.g., reference to a service with data flow value of inbound)
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ResourceReferenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferenceType getSource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.InputType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ResourceReferenceType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A reference to the component or service that received or stored the input if not the task
	 *                         itself (e.g., a local, named storage workspace)
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ResourceReferenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferenceType getTarget();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.InputType#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ResourceReferenceType value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.InputType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getInputType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':8' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // InputType
