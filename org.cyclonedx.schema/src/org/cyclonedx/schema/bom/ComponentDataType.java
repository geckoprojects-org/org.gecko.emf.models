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
 * A representation of the model object '<em><b>Component Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getContents <em>Contents</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getSensitiveData <em>Sensitive Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getGovernance <em>Governance</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentDataType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType()
 * @model extendedMetaData="name='componentDataType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ComponentDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ComponentDataTypeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The general theme or subject matter of the data being specified.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ComponentDataTypeEnumeration
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ComponentDataTypeEnumeration)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentDataTypeEnumeration getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ComponentDataTypeEnumeration
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentDataTypeEnumeration value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ComponentDataTypeEnumeration)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ComponentDataTypeEnumeration)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The name of the dataset.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getName <em>Name</em>}' attribute.
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
	 *                         The contents or references to the contents of the data being described.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference.
	 * @see #setContents(ContentsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_Contents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contents' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentsType1 getContents();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getContents <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' containment reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(ContentsType1 value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_Classification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getClassification <em>Classification</em>}' attribute.
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
	 *                         A description of any sensitive data in a dataset.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitive Data</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_SensitiveData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sensitiveData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getSensitiveData();

	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A collection of graphics that represent various measurements.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(GraphicsCollectionType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_Graphics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphics' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicsCollectionType getGraphics();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getGraphics <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics</em>' containment reference.
	 * @see #getGraphics()
	 * @generated
	 */
	void setGraphics(GraphicsCollectionType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A description of the dataset. Can describe size of dataset, whether it's used for source code,
	 *                         training, testing, or validation, etc.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Governance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governance</em>' containment reference.
	 * @see #setGovernance(DataGovernance)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_Governance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='governance' namespace='##targetNamespace'"
	 * @generated
	 */
	DataGovernance getGovernance();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getGovernance <em>Governance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governance</em>' containment reference.
	 * @see #getGovernance()
	 * @generated
	 */
	void setGovernance(DataGovernance value);

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the dataset elsewhere in the BOM.
	 *                     Every bom-ref must be unique within the BOM.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentDataType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentDataType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // ComponentDataType
