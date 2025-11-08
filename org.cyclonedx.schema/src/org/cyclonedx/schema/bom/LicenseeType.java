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
 * A representation of the model object '<em><b>Licensee Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseeType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseeType#getIndividual <em>Individual</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseeType()
 * @model extendedMetaData="name='licensee_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LicenseeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that was granted the license
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseeType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getOrganization();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseeType#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual, not associated with an organization,
	 *                                                     that was granted the license
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(OrganizationalContact)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseeType_Individual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individual' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalContact getIndividual();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseeType#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(OrganizationalContact value);

} // LicenseeType
