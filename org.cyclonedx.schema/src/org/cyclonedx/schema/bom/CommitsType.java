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
 * A representation of the model object '<em><b>Commits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zero or more commits can be specified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CommitsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommitsType#getCommit <em>Commit</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommitsType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitsType()
 * @model extendedMetaData="name='commitsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CommitsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Commit</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.CommitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies an individual commit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commit</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitsType_Commit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='commit' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CommitType> getCommit();

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // CommitsType
