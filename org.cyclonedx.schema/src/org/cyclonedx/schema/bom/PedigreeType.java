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
 * A representation of the model object '<em><b>Pedigree Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Component pedigree is a way to document complex supply chain scenarios where components are created,
 *                 distributed, modified, redistributed, combined with other components, etc. Pedigree supports viewing
 *                 this complex chain from the beginning, the end, or anywhere in the middle. It also provides a way to
 *                 document variants where the exact relation may not be known.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.PedigreeType#getAncestors <em>Ancestors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PedigreeType#getDescendants <em>Descendants</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PedigreeType#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PedigreeType#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PedigreeType#getPatches <em>Patches</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PedigreeType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PedigreeType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType()
 * @model extendedMetaData="name='pedigreeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PedigreeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ancestors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes zero or more components in which a component is derived
	 *                         from. This is commonly used to describe forks from existing projects where the forked version
	 *                         contains a ancestor node containing the original component it was forked from. For example,
	 *                         Component A is the original component. Component B is the component being used and documented
	 *                         in the BOM. However, Component B contains a pedigree node with a single ancestor documenting
	 *                         Component A - the original component from which Component B is derived from.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ancestors</em>' containment reference.
	 * @see #setAncestors(ComponentsType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType_Ancestors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ancestors' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType2 getAncestors();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PedigreeType#getAncestors <em>Ancestors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestors</em>' containment reference.
	 * @see #getAncestors()
	 * @generated
	 */
	void setAncestors(ComponentsType2 value);

	/**
	 * Returns the value of the '<em><b>Descendants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descendants are the exact opposite of ancestors. This provides a
	 *                         way to document all forks (and their forks) of an original or root component.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descendants</em>' containment reference.
	 * @see #setDescendants(ComponentsType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType_Descendants()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descendants' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType2 getDescendants();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PedigreeType#getDescendants <em>Descendants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descendants</em>' containment reference.
	 * @see #getDescendants()
	 * @generated
	 */
	void setDescendants(ComponentsType2 value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Variants describe relations where the relationship between the
	 *                         components are not known. For example, if Component A contains nearly identical code to
	 *                         Component B. They are both related, but it is unclear if one is derived from the other,
	 *                         or if they share a common ancestor.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference.
	 * @see #setVariants(ComponentsType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType_Variants()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variants' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType2 getVariants();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PedigreeType#getVariants <em>Variants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variants</em>' containment reference.
	 * @see #getVariants()
	 * @generated
	 */
	void setVariants(ComponentsType2 value);

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of zero or more commits which provide a trail describing
	 *                         how the component deviates from an ancestor, descendant, or variant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commits</em>' containment reference.
	 * @see #setCommits(CommitsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType_Commits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commits' namespace='##targetNamespace'"
	 * @generated
	 */
	CommitsType getCommits();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PedigreeType#getCommits <em>Commits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commits</em>' containment reference.
	 * @see #getCommits()
	 * @generated
	 */
	void setCommits(CommitsType value);

	/**
	 * Returns the value of the '<em><b>Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of zero or more patches describing how the component
	 *                         deviates from an ancestor, descendant, or variant. Patches may be complementary to commits
	 *                         or may be used in place of commits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patches</em>' containment reference.
	 * @see #setPatches(PatchesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType_Patches()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patches' namespace='##targetNamespace'"
	 * @generated
	 */
	PatchesType getPatches();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PedigreeType#getPatches <em>Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patches</em>' containment reference.
	 * @see #getPatches()
	 * @generated
	 */
	void setPatches(PatchesType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes, observations, and other non-structured commentary
	 *                         describing the components pedigree.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PedigreeType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPedigreeType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PedigreeType
