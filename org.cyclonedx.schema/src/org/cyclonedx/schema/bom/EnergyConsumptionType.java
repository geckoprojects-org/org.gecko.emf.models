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
 * A representation of the model object '<em><b>Energy Consumption Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Describes energy consumption information incurred for the specified lifecycle activity.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getEnergyProviders <em>Energy Providers</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivityEnergyCost <em>Activity Energy Cost</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostEquivalent <em>Co2 Cost Equivalent</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostOffset <em>Co2 Cost Offset</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyConsumptionType()
 * @model extendedMetaData="name='energyConsumptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EnergyConsumptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The type of activity that is part of a machine learning model development or operational lifecycle.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ActivityType
	 * @see #isSetActivity()
	 * @see #unsetActivity()
	 * @see #setActivity(ActivityType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyConsumptionType_Activity()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityType getActivity();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivity <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ActivityType
	 * @see #isSetActivity()
	 * @see #unsetActivity()
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ActivityType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivity <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivity()
	 * @see #getActivity()
	 * @see #setActivity(ActivityType)
	 * @generated
	 */
	void unsetActivity();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivity <em>Activity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activity</em>' attribute is set.
	 * @see #unsetActivity()
	 * @see #getActivity()
	 * @see #setActivity(ActivityType)
	 * @generated
	 */
	boolean isSetActivity();

	/**
	 * Returns the value of the '<em><b>Energy Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.EnergyProviderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The provider(s) of the energy consumed by the associated model development lifecycle activity.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energy Providers</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyConsumptionType_EnergyProviders()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='energyProviders' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnergyProviderType> getEnergyProviders();

	/**
	 * Returns the value of the '<em><b>Activity Energy Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The total energy cost associated with the model lifecycle activity.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Energy Cost</em>' containment reference.
	 * @see #setActivityEnergyCost(EnergyMeasureType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyConsumptionType_ActivityEnergyCost()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activityEnergyCost' namespace='##targetNamespace'"
	 * @generated
	 */
	EnergyMeasureType getActivityEnergyCost();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getActivityEnergyCost <em>Activity Energy Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Energy Cost</em>' containment reference.
	 * @see #getActivityEnergyCost()
	 * @generated
	 */
	void setActivityEnergyCost(EnergyMeasureType value);

	/**
	 * Returns the value of the '<em><b>Co2 Cost Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The CO2 cost (debit) equivalent to the total energy cost.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Co2 Cost Equivalent</em>' containment reference.
	 * @see #setCo2CostEquivalent(Co2MeasureType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyConsumptionType_Co2CostEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='co2CostEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	Co2MeasureType getCo2CostEquivalent();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostEquivalent <em>Co2 Cost Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co2 Cost Equivalent</em>' containment reference.
	 * @see #getCo2CostEquivalent()
	 * @generated
	 */
	void setCo2CostEquivalent(Co2MeasureType value);

	/**
	 * Returns the value of the '<em><b>Co2 Cost Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The CO2 offset (credit) for the CO2 equivalent cost.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Co2 Cost Offset</em>' containment reference.
	 * @see #setCo2CostOffset(Co2MeasureType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyConsumptionType_Co2CostOffset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='co2CostOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	Co2MeasureType getCo2CostOffset();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getCo2CostOffset <em>Co2 Cost Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co2 Cost Offset</em>' containment reference.
	 * @see #getCo2CostOffset()
	 * @generated
	 */
	void setCo2CostOffset(Co2MeasureType value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyConsumptionType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyConsumptionType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

} // EnergyConsumptionType
