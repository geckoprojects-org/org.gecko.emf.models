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
 * A representation of the model object '<em><b>Workspace Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 A named filesystem or data resource shareable by workflow tasks.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getResourceReferences <em>Resource References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getManagedDataType <em>Managed Data Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getVolumeRequest <em>Volume Request</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.WorkspaceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType()
 * @model extendedMetaData="name='workspaceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WorkspaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The unique identifier for the resource instance within its deployment context.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Uid()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getUid();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The name of the resource instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.AliasesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The names for the workspace as referenced by other workflow tasks. Effectively, a name mapping
	 *                         so other tasks can use their own local name in their steps.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Aliases()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aliases' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AliasesType> getAliases();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The description of the resource instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Resource References</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.ResourceReferencesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         References to component or service resources that are used to realize the resource instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource References</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_ResourceReferences()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resourceReferences' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ResourceReferencesType> getResourceReferences();

	/**
	 * Returns the value of the '<em><b>Access Mode</b></em>' attribute list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.AccessModeEnum}.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.AccessModeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Describes the read-write access control for the workspace relative to the owning resource instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Mode</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.AccessModeEnum
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_AccessMode()
	 * @model unique="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accessMode' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AccessModeEnum> getAccessMode();

	/**
	 * Returns the value of the '<em><b>Mount Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A path to a location on disk where the workspace will be available to the associated task's steps.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mount Path</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_MountPath()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mountPath' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getMountPath();

	/**
	 * Returns the value of the '<em><b>Managed Data Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The name of a domain-specific data type the workspace represents. This property is for CI/CD
	 *                         frameworks that are able to provide access to structured, managed data at a more granular level
	 *                         than a filesystem.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Data Type</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_ManagedDataType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='managedDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getManagedDataType();

	/**
	 * Returns the value of the '<em><b>Volume Request</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Identifies the reference to the request for a specific volume type and parameters.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Request</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_VolumeRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volumeRequest' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getVolumeRequest();

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.VolumeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Information about the actual volume instance allocated to the workspace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Volume()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VolumeType> getVolume();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.PropertiesType}.
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
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Properties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PropertiesType> getProperties();

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the workflow elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4" required="true"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.WorkspaceType#getBomRef <em>Bom Ref</em>}' attribute.
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getWorkspaceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':14' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // WorkspaceType
