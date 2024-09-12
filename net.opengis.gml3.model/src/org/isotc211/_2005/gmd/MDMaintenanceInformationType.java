/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DatePropertyType;

import org.isotc211._2005.gts.TMPeriodDurationPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Maintenance Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the scope and frequency of updating
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getMaintenanceAndUpdateFrequency <em>Maintenance And Update Frequency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getDateOfNextUpdate <em>Date Of Next Update</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getUserDefinedMaintenanceFrequency <em>User Defined Maintenance Frequency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getUpdateScope <em>Update Scope</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getUpdateScopeDescription <em>Update Scope Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getMaintenanceNote <em>Maintenance Note</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType()
 * @model extendedMetaData="name='MD_MaintenanceInformation_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDMaintenanceInformationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Maintenance And Update Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance And Update Frequency</em>' containment reference.
	 * @see #setMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType_MaintenanceAndUpdateFrequency()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maintenanceAndUpdateFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getMaintenanceAndUpdateFrequency <em>Maintenance And Update Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance And Update Frequency</em>' containment reference.
	 * @see #getMaintenanceAndUpdateFrequency()
	 * @generated
	 */
	void setMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Date Of Next Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Next Update</em>' containment reference.
	 * @see #setDateOfNextUpdate(DatePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType_DateOfNextUpdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateOfNextUpdate' namespace='##targetNamespace'"
	 * @generated
	 */
	DatePropertyType getDateOfNextUpdate();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getDateOfNextUpdate <em>Date Of Next Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Next Update</em>' containment reference.
	 * @see #getDateOfNextUpdate()
	 * @generated
	 */
	void setDateOfNextUpdate(DatePropertyType value);

	/**
	 * Returns the value of the '<em><b>User Defined Maintenance Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Maintenance Frequency</em>' containment reference.
	 * @see #setUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType_UserDefinedMaintenanceFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='userDefinedMaintenanceFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMaintenanceInformationType#getUserDefinedMaintenanceFrequency <em>User Defined Maintenance Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Maintenance Frequency</em>' containment reference.
	 * @see #getUserDefinedMaintenanceFrequency()
	 * @generated
	 */
	void setUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Update Scope</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDScopeCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Scope</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType_UpdateScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateScope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDScopeCodePropertyType> getUpdateScope();

	/**
	 * Returns the value of the '<em><b>Update Scope Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDScopeDescriptionPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Scope Description</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType_UpdateScopeDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateScopeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDScopeDescriptionPropertyType> getUpdateScopeDescription();

	/**
	 * Returns the value of the '<em><b>Maintenance Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Note</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType_MaintenanceNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maintenanceNote' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getMaintenanceNote();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMaintenanceInformationType_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getContact();

} // MDMaintenanceInformationType
