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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getResourceReferences <em>Resource References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getTimeStart <em>Time Start</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getTimeEnd <em>Time End</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getWorkspaces <em>Workspaces</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getRuntimeTopology <em>Runtime Topology</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TaskType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType()
 * @model extendedMetaData="name='taskType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The unique identifier for the resource instance within its deployment context.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Uid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The name of the resource instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The description of the resource instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Resource References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         References to component or service resources that are used to realize the resource instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource References</em>' containment reference.
	 * @see #setResourceReferences(ResourceReferencesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_ResourceReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferencesType getResourceReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getResourceReferences <em>Resource References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource References</em>' containment reference.
	 * @see #getResourceReferences()
	 * @generated
	 */
	void setResourceReferences(ResourceReferencesType value);

	/**
	 * Returns the value of the '<em><b>Task Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Indicates the types of activities performed by the set of workflow tasks.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Types</em>' containment reference.
	 * @see #setTaskTypes(TaskTypesType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_TaskTypes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='taskTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskTypesType1 getTaskTypes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getTaskTypes <em>Task Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Types</em>' containment reference.
	 * @see #getTaskTypes()
	 * @generated
	 */
	void setTaskTypes(TaskTypesType1 value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The trigger that initiated the task.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(TriggerType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Trigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerType getTrigger();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerType value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The sequence of steps for the task.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference.
	 * @see #setSteps(StepsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Steps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='steps' namespace='##targetNamespace'"
	 * @generated
	 */
	StepsType1 getSteps();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getSteps <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' containment reference.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(StepsType1 value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Represents resources and data brought into a task at runtime by executor or task commands.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(InputsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Inputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	InputsType1 getInputs();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(InputsType1 value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Represents resources and data output from a task at runtime by executor or task commands
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(OutputsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Outputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputsType1 getOutputs();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(OutputsType1 value);

	/**
	 * Returns the value of the '<em><b>Time Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The date and time (timestamp) when the task started.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Start</em>' attribute.
	 * @see #setTimeStart(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_TimeStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='timeStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimeStart();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getTimeStart <em>Time Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Start</em>' attribute.
	 * @see #getTimeStart()
	 * @generated
	 */
	void setTimeStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Time End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The date and time (timestamp) when the task ended.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time End</em>' attribute.
	 * @see #setTimeEnd(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_TimeEnd()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='timeEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimeEnd();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getTimeEnd <em>Time End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time End</em>' attribute.
	 * @see #getTimeEnd()
	 * @generated
	 */
	void setTimeEnd(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Workspaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A set of named filesystem or data resource shareable by workflow tasks.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workspaces</em>' containment reference.
	 * @see #setWorkspaces(WorkspacesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Workspaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workspaces' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkspacesType getWorkspaces();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getWorkspaces <em>Workspaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspaces</em>' containment reference.
	 * @see #getWorkspaces()
	 * @generated
	 */
	void setWorkspaces(WorkspacesType value);

	/**
	 * Returns the value of the '<em><b>Runtime Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A graph of the component runtime topology for task's instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime Topology</em>' containment reference.
	 * @see #setRuntimeTopology(DependenciesType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_RuntimeTopology()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runtimeTopology' namespace='##targetNamespace'"
	 * @generated
	 */
	DependenciesType1 getRuntimeTopology();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getRuntimeTopology <em>Runtime Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Topology</em>' containment reference.
	 * @see #getRuntimeTopology()
	 * @generated
	 */
	void setRuntimeTopology(DependenciesType1 value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getProperties <em>Properties</em>}' containment reference.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':14' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the task elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4" required="true"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TaskType#getBomRef <em>Bom Ref</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':16' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TaskType
