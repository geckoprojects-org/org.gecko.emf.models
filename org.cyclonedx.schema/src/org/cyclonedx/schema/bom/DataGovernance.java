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
 * A representation of the model object '<em><b>Data Governance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DataGovernance#getCustodians <em>Custodians</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataGovernance#getStewards <em>Stewards</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataGovernance#getOwners <em>Owners</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDataGovernance()
 * @model extendedMetaData="name='dataGovernance' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataGovernance extends EObject {
	/**
	 * Returns the value of the '<em><b>Custodians</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Data custodians are responsible for the safe custody, transport, and storage of data.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custodians</em>' containment reference.
	 * @see #setCustodians(CustodiansType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataGovernance_Custodians()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custodians' namespace='##targetNamespace'"
	 * @generated
	 */
	CustodiansType getCustodians();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataGovernance#getCustodians <em>Custodians</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodians</em>' containment reference.
	 * @see #getCustodians()
	 * @generated
	 */
	void setCustodians(CustodiansType value);

	/**
	 * Returns the value of the '<em><b>Stewards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Data stewards are responsible for data content, context, and associated business rules.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stewards</em>' containment reference.
	 * @see #setStewards(StewardsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataGovernance_Stewards()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stewards' namespace='##targetNamespace'"
	 * @generated
	 */
	StewardsType getStewards();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataGovernance#getStewards <em>Stewards</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stewards</em>' containment reference.
	 * @see #getStewards()
	 * @generated
	 */
	void setStewards(StewardsType value);

	/**
	 * Returns the value of the '<em><b>Owners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Data owners are concerned with risk and appropriate access to data.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owners</em>' containment reference.
	 * @see #setOwners(OwnersType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataGovernance_Owners()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owners' namespace='##targetNamespace'"
	 * @generated
	 */
	OwnersType getOwners();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataGovernance#getOwners <em>Owners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owners</em>' containment reference.
	 * @see #getOwners()
	 * @generated
	 */
	void setOwners(OwnersType value);

} // DataGovernance
