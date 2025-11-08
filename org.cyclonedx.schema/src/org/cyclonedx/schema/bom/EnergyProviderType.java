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
 * A representation of the model object '<em><b>Energy Provider Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Describes the physical provider of energy used for model development or operations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyProviderType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyProviderType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergySource <em>Energy Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergyProvided <em>Energy Provided</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyProviderType#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.EnergyProviderType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyProviderType()
 * @model extendedMetaData="name='energyProviderType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EnergyProviderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A description of the energy provider.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyProviderType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The organization of the energy provider.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyProviderType_Organization()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getOrganization();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Energy Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.EnergySourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The energy source for the energy provider.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energy Source</em>' attribute.
	 * @see org.cyclonedx.schema.bom.EnergySourceType
	 * @see #isSetEnergySource()
	 * @see #unsetEnergySource()
	 * @see #setEnergySource(EnergySourceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyProviderType_EnergySource()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='energySource' namespace='##targetNamespace'"
	 * @generated
	 */
	EnergySourceType getEnergySource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergySource <em>Energy Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Source</em>' attribute.
	 * @see org.cyclonedx.schema.bom.EnergySourceType
	 * @see #isSetEnergySource()
	 * @see #unsetEnergySource()
	 * @see #getEnergySource()
	 * @generated
	 */
	void setEnergySource(EnergySourceType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergySource <em>Energy Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergySource()
	 * @see #getEnergySource()
	 * @see #setEnergySource(EnergySourceType)
	 * @generated
	 */
	void unsetEnergySource();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergySource <em>Energy Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Source</em>' attribute is set.
	 * @see #unsetEnergySource()
	 * @see #getEnergySource()
	 * @see #setEnergySource(EnergySourceType)
	 * @generated
	 */
	boolean isSetEnergySource();

	/**
	 * Returns the value of the '<em><b>Energy Provided</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The energy provided by the energy source for an associated activity.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energy Provided</em>' containment reference.
	 * @see #setEnergyProvided(EnergyMeasureType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyProviderType_EnergyProvided()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='energyProvided' namespace='##targetNamespace'"
	 * @generated
	 */
	EnergyMeasureType getEnergyProvided();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getEnergyProvided <em>Energy Provided</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Provided</em>' containment reference.
	 * @see #getEnergyProvided()
	 * @generated
	 */
	void setEnergyProvided(EnergyMeasureType value);

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External references provide a way to document systems, sites, and information that may be relevant but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External References</em>' containment reference.
	 * @see #setExternalReferences(ExternalReferences)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyProviderType_ExternalReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReferences getExternalReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getExternalReferences <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External References</em>' containment reference.
	 * @see #getExternalReferences()
	 * @generated
	 */
	void setExternalReferences(ExternalReferences value);

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the energy provider elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergyProviderType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.EnergyProviderType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // EnergyProviderType
