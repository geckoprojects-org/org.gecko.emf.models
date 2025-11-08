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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DataType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataType#getContents <em>Contents</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataType#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataType#getSensitiveData <em>Sensitive Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataType#getGovernance <em>Governance</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType()
 * @model extendedMetaData="name='data_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The name of the data.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The contents or references to the contents of the data being described.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference.
	 * @see #setContents(ContentsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType_Contents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contents' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentsType getContents();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataType#getContents <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' containment reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(ContentsType value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType_Classification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataType#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(String value);

	/**
	 * Returns the value of the '<em><b>Sensitive Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             A description of any sensitive data.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitive Data</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType_SensitiveData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sensitiveData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getSensitiveData();

	/**
	 * Returns the value of the '<em><b>Governance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governance</em>' containment reference.
	 * @see #setGovernance(DataGovernance)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataType_Governance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='governance' namespace='##targetNamespace'"
	 * @generated
	 */
	DataGovernance getGovernance();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataType#getGovernance <em>Governance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governance</em>' containment reference.
	 * @see #getGovernance()
	 * @generated
	 */
	void setGovernance(DataGovernance value);

} // DataType
