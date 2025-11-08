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
 * A representation of the model object '<em><b>Credits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CreditsType#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CreditsType#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCreditsType()
 * @model extendedMetaData="name='credits_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CreditsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organizations credited with vulnerability discovery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference.
	 * @see #setOrganizations(OrganizationsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCreditsType_Organizations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizations' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationsType1 getOrganizations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CreditsType#getOrganizations <em>Organizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizations</em>' containment reference.
	 * @see #getOrganizations()
	 * @generated
	 */
	void setOrganizations(OrganizationsType1 value);

	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individuals, not associated with organizations, that are credited with vulnerability discovery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference.
	 * @see #setIndividuals(IndividualsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCreditsType_Individuals()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individuals' namespace='##targetNamespace'"
	 * @generated
	 */
	IndividualsType getIndividuals();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CreditsType#getIndividuals <em>Individuals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individuals</em>' containment reference.
	 * @see #getIndividuals()
	 * @generated
	 */
	void setIndividuals(IndividualsType value);

} // CreditsType
