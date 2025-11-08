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
 * A representation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Represents resources and data output from a task at runtime by executor or task commands
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getResource <em>Resource</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getEnvironmentVars <em>Environment Vars</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getData <em>Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getSource <em>Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getTarget <em>Target</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.OutputType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType()
 * @model extendedMetaData="name='outputType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             A reference to an independent resource generated as output by the task.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceReferenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferenceType getResource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceReferenceType value);

	/**
	 * Returns the value of the '<em><b>Environment Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Outputs that have the form of environment variables.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment Vars</em>' containment reference.
	 * @see #setEnvironmentVars(EnvironmentVarsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_EnvironmentVars()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentVars' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentVarsType getEnvironmentVars();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getEnvironmentVars <em>Environment Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment Vars</em>' containment reference.
	 * @see #getEnvironmentVars()
	 * @generated
	 */
	void setEnvironmentVars(EnvironmentVarsType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Outputs that have the form of data.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(AttachedTextType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	AttachedTextType getData();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(AttachedTextType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.OutputTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Describes the type of data output.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.OutputTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(OutputTypeEnum)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputTypeEnum getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.OutputTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(OutputTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(OutputTypeEnum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.OutputType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(OutputTypeEnum)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Component or service that generated or provided the output from the task (e.g., a build tool)
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ResourceReferenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferenceType getSource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getSource <em>Source</em>}' containment reference.
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
	 *                         Component or service that received the output from the task
	 *                         (e.g., reference to an artifactory service with data flow value of outbound)
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ResourceReferenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferenceType getTarget();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getTarget <em>Target</em>}' containment reference.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.OutputType#getProperties <em>Properties</em>}' containment reference.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_Any()
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getOutputType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':8' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // OutputType
