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

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Responsible Party Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identification of, and means of communication with, person(s) and organisations associated with the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getIndividualName <em>Individual Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getOrganisationName <em>Organisation Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getPositionName <em>Position Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCIResponsiblePartyType()
 * @model extendedMetaData="name='CI_ResponsibleParty_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CIResponsiblePartyType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Individual Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Name</em>' containment reference.
	 * @see #setIndividualName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIResponsiblePartyType_IndividualName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individualName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getIndividualName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getIndividualName <em>Individual Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Name</em>' containment reference.
	 * @see #getIndividualName()
	 * @generated
	 */
	void setIndividualName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Organisation Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation Name</em>' containment reference.
	 * @see #setOrganisationName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIResponsiblePartyType_OrganisationName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organisationName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getOrganisationName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getOrganisationName <em>Organisation Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation Name</em>' containment reference.
	 * @see #getOrganisationName()
	 * @generated
	 */
	void setOrganisationName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Position Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Name</em>' containment reference.
	 * @see #setPositionName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIResponsiblePartyType_PositionName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getPositionName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getPositionName <em>Position Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Name</em>' containment reference.
	 * @see #getPositionName()
	 * @generated
	 */
	void setPositionName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Info</em>' containment reference.
	 * @see #setContactInfo(CIContactPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIResponsiblePartyType_ContactInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contactInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	CIContactPropertyType getContactInfo();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getContactInfo <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Info</em>' containment reference.
	 * @see #getContactInfo()
	 * @generated
	 */
	void setContactInfo(CIContactPropertyType value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CIRoleCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIResponsiblePartyType_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CIRoleCodePropertyType getRole();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIResponsiblePartyType#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CIRoleCodePropertyType value);

} // CIResponsiblePartyType
