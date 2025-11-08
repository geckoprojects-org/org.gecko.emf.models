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
 * A representation of the model object '<em><b>Dataflow Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DataflowType#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataflowType#getGovernance <em>Governance</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataflowType#getSource <em>Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataflowType#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataflowType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataflowType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataflowType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType()
 * @model extendedMetaData="name='dataflow_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataflowType extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the data classification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(DataClassificationType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	DataClassificationType getClassification();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataflowType#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(DataClassificationType value);

	/**
	 * Returns the value of the '<em><b>Governance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governance</em>' containment reference.
	 * @see #setGovernance(DataGovernance)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType_Governance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='governance' namespace='##targetNamespace'"
	 * @generated
	 */
	DataGovernance getGovernance();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataflowType#getGovernance <em>Governance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governance</em>' containment reference.
	 * @see #getGovernance()
	 * @generated
	 */
	void setGovernance(DataGovernance value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI, URL, or BOM-Link of the components or services the data came in from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataflowType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI, URL, or BOM-Link of the components or services the data is sent to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(DestinationType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	DestinationType getDestination();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataflowType#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(DestinationType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             Short description of the data content and usage.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataflowType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             Name for the defined data.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataflowType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                                             do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataflowType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DataflowType
