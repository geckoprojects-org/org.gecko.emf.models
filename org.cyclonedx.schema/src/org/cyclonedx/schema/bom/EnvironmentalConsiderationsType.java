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
 * A representation of the model object '<em><b>Environmental Considerations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Describes various environmental impact metrics.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.EnvironmentalConsiderationsType#getEnergyConsumptions <em>Energy Consumptions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnvironmentalConsiderationsType#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getEnvironmentalConsiderationsType()
 * @model extendedMetaData="name='environmentalConsiderationsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EnvironmentalConsiderationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Energy Consumptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.EnergyConsumptionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Describes energy consumption information incurred for one or more component lifecycle activities.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energy Consumptions</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnvironmentalConsiderationsType_EnergyConsumptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='energyConsumptions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnergyConsumptionsType> getEnergyConsumptions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document properties in a name/value store.
	 *                         This provides flexibility to include data not officially supported in the standard
	 *                         without having to use additional namespaces or create extensions. Property names
	 *                         of interest to the general public are encouraged to be registered in the
	 *                         CycloneDX Property Taxonomy - https://github.com/CycloneDX/cyclonedx-property-taxonomy.
	 *                         Formal registration is optional.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnvironmentalConsiderationsType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnvironmentalConsiderationsType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

} // EnvironmentalConsiderationsType
