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
 * A representation of the model object '<em><b>Targets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.TargetsType#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TargetsType#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TargetsType#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getTargetsType()
 * @model extendedMetaData="name='targets_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TargetsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The list of organizations which claims are made against.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference.
	 * @see #setOrganizations(OrganizationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTargetsType_Organizations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organizations' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationsType getOrganizations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TargetsType#getOrganizations <em>Organizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizations</em>' containment reference.
	 * @see #getOrganizations()
	 * @generated
	 */
	void setOrganizations(OrganizationsType value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The list of components which claims are made against.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ComponentsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTargetsType_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsType1 getComponents();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TargetsType#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(ComponentsType1 value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The list of services which claims are made against.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(ServicesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTargetsType_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	ServicesType getServices();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TargetsType#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(ServicesType value);

} // TargetsType
