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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Notes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getFeaturedImage <em>Featured Image</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getSocialImage <em>Social Image</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getTags <em>Tags</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getResolves <em>Resolves</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReleaseNotesType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType()
 * @model extendedMetaData="name='releaseNotesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReleaseNotesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The software versioning type. It is recommended that the release type use one
	 *                         of 'major', 'minor', 'patch', 'pre-release', or 'internal'. Representing all possible software
	 *                         release types is not practical, so standardizing on the recommended values, whenever possible,
	 *                         is strongly encouraged.
	 *                         * major = A major release may contain significant changes or may introduce breaking changes.
	 *                         * minor = A minor release, also known as an update, may contain a smaller number of changes than major releases.
	 *                         * patch = Patch releases are typically unplanned and may resolve defects or important security issues.
	 *                         * pre-release = A pre-release may include alpha, beta, or release candidates and typically have
	 *                           limited support. They provide the ability to preview a release prior to its general availability.
	 *                         * internal = Internal releases are not for public consumption and are intended to be used exclusively
	 *                           by the project or manufacturer that produced it.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Type()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getType();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getTitle();

	/**
	 * Returns the value of the '<em><b>Featured Image</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to an image that may be prominently displayed with the release note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featured Image</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_FeaturedImage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featuredImage' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getFeaturedImage();

	/**
	 * Returns the value of the '<em><b>Social Image</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to an image that may be used in messaging on social media platforms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Social Image</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_SocialImage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='socialImage' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getSocialImage();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the release.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.XMLGregorianCalendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time (timestamp) when the release note was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Timestamp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XMLGregorianCalendar> getTimestamp();

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.AliasesType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Aliases()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aliases' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AliasesType1> getAliases();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.TagsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Tags()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tags' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TagsType> getTags();

	/**
	 * Returns the value of the '<em><b>Resolves</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.ResolvesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of issues that have been resolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolves</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Resolves()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resolves' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ResolvesType> getResolves();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.NotesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Notes()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NotesType> getNotes();

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Properties()
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax' group='#group:0'"
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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReleaseNotesType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ReleaseNotesType
