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
 * A representation of the model object '<em><b>Patch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.PatchType#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PatchType#getResolves <em>Resolves</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PatchType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PatchType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getPatchType()
 * @model extendedMetaData="name='patchType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PatchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patch file (or diff) that show changes.
	 *                         Refer to https://en.wikipedia.org/wiki/Diff
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diff</em>' containment reference.
	 * @see #setDiff(DiffType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPatchType_Diff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diff' namespace='##targetNamespace'"
	 * @generated
	 */
	DiffType getDiff();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PatchType#getDiff <em>Diff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff</em>' containment reference.
	 * @see #getDiff()
	 * @generated
	 */
	void setDiff(DiffType value);

	/**
	 * Returns the value of the '<em><b>Resolves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolves</em>' containment reference.
	 * @see #setResolves(ResolvesType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPatchType_Resolves()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolves' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvesType1 getResolves();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PatchType#getResolves <em>Resolves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolves</em>' containment reference.
	 * @see #getResolves()
	 * @generated
	 */
	void setResolves(ResolvesType1 value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPatchType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.PatchClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the purpose for the patch including the resolution of defects,
	 *                     security issues, or new behavior or functionality
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.PatchClassification
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(PatchClassification)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPatchType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	PatchClassification getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PatchType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.PatchClassification
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(PatchClassification value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.PatchType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PatchClassification)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.PatchType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PatchClassification)
	 * @generated
	 */
	boolean isSetType();

} // PatchType
