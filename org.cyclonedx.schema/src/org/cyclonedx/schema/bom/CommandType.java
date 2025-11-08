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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CommandType#getExecuted <em>Executed</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommandType#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCommandType()
 * @model extendedMetaData="name='command_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CommandType extends EObject {
	/**
	 * Returns the value of the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 A text representation of the executed command.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executed</em>' attribute.
	 * @see #setExecuted(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommandType_Executed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='executed' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExecuted();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CommandType#getExecuted <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed</em>' attribute.
	 * @see #getExecuted()
	 * @generated
	 */
	void setExecuted(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document properties in a name/value store.
	 *                                                 This provides flexibility to include data not officially supported in the standard
	 *                                                 without having to use additional namespaces or create extensions. Property names
	 *                                                 of interest to the general public are encouraged to be registered in the
	 *                                                 CycloneDX Property Taxonomy - https://github.com/CycloneDX/cyclonedx-property-taxonomy.
	 *                                                 Formal registration is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommandType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CommandType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

} // CommandType
