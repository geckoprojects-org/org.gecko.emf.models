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
 * A representation of the model object '<em><b>Trigger Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getResourceReferences <em>Resource References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getEvent <em>Event</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getTimeActivated <em>Time Activated</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TriggerType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType()
 * @model extendedMetaData="name='triggerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TriggerType extends EObject {
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Uid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getUid <em>Uid</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getName <em>Name</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_ResourceReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceReferencesType getResourceReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getResourceReferences <em>Resource References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource References</em>' containment reference.
	 * @see #getResourceReferences()
	 * @generated
	 */
	void setResourceReferences(ResourceReferencesType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.TriggerTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The source type of event which caused the trigger to fire.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.TriggerTypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TriggerTypeType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerTypeType getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.TriggerTypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TriggerTypeType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TriggerTypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TriggerTypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The event data that caused the associated trigger to activate.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EventType getEvent();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventType value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of conditions used to determine if a trigger should be activated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(ConditionsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Conditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditions' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionsType getConditions();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(ConditionsType value);

	/**
	 * Returns the value of the '<em><b>Time Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The date and time (timestamp) when the trigger was activated.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Activated</em>' attribute.
	 * @see #setTimeActivated(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_TimeActivated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='timeActivated' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimeActivated();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getTimeActivated <em>Time Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Activated</em>' attribute.
	 * @see #getTimeActivated()
	 * @generated
	 */
	void setTimeActivated(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Represents resources and data brought into a task at runtime by executor or task commands
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(InputsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Inputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	InputsType getInputs();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(InputsType value);

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
	 * @see #setOutputs(OutputsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Outputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputsType getOutputs();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(OutputsType value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getProperties <em>Properties</em>}' containment reference.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the trigger elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4" required="true"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TriggerType#getBomRef <em>Bom Ref</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTriggerType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TriggerType
