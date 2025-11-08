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
 * A representation of the model object '<em><b>Tools Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ToolsType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ToolsType1#getTool <em>Tool</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ToolsType1#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ToolsType1#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getToolsType1()
 * @model extendedMetaData="name='tools_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ToolsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getToolsType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.ToolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DEPRECATED. Use tools\components or tools\services instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getToolsType1_Tool()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tool' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ToolType> getTool();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of software and hardware components used as tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ComponentsType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getToolsType1_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType2 getComponents();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ToolsType1#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(ComponentsType2 value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of services used as tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(ServicesType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getToolsType1_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicesType2 getServices();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ToolsType1#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesType2 value);

} // ToolsType1
