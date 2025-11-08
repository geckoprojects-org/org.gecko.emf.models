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
 * A representation of the model object '<em><b>Data Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DataType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataType1#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataType1#getDataflow <em>Dataflow</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType1()
 * @model extendedMetaData="name='data_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.DataClassificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEPRECATED: Specifies the data classification. THIS FIELD IS DEPRECATED AS OF v1.5. Use dataflow\classification instead
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType1_Classification()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DataClassificationType> getClassification();

	/**
	 * Returns the value of the '<em><b>Dataflow</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.DataflowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the data classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataflow</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType1_Dataflow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataflow' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataflowType> getDataflow();

} // DataType1
