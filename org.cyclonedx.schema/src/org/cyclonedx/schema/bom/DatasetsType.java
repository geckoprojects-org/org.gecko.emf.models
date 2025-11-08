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
 * A representation of the model object '<em><b>Datasets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DatasetsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DatasetsType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DatasetsType#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDatasetsType()
 * @model extendedMetaData="name='datasets_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DatasetsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDatasetsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a data component by the components bom-ref attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDatasetsType_Ref()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType1" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getRef();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.ComponentDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inline Data Information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDatasetsType_Dataset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ComponentDataType> getDataset();

} // DatasetsType
