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
package net.opengis.ogc;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.FilterCapabilitiesType#getSpatialCapabilities <em>Spatial Capabilities</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterCapabilitiesType#getScalarCapabilities <em>Scalar Capabilities</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterCapabilitiesType#getIdCapabilities <em>Id Capabilities</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getFilterCapabilitiesType()
 * @model extendedMetaData="name='Filter_Capabilities_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilterCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Spatial Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Capabilities</em>' containment reference.
	 * @see #setSpatialCapabilities(SpatialCapabilitiesType)
	 * @see net.opengis.ogc.OGCPackage#getFilterCapabilitiesType_SpatialCapabilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Spatial_Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	SpatialCapabilitiesType getSpatialCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.FilterCapabilitiesType#getSpatialCapabilities <em>Spatial Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Capabilities</em>' containment reference.
	 * @see #getSpatialCapabilities()
	 * @generated
	 */
	void setSpatialCapabilities(SpatialCapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Scalar Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Capabilities</em>' containment reference.
	 * @see #setScalarCapabilities(ScalarCapabilitiesType)
	 * @see net.opengis.ogc.OGCPackage#getFilterCapabilitiesType_ScalarCapabilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Scalar_Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	ScalarCapabilitiesType getScalarCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.FilterCapabilitiesType#getScalarCapabilities <em>Scalar Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Capabilities</em>' containment reference.
	 * @see #getScalarCapabilities()
	 * @generated
	 */
	void setScalarCapabilities(ScalarCapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Id Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Capabilities</em>' containment reference.
	 * @see #setIdCapabilities(IdCapabilitiesType)
	 * @see net.opengis.ogc.OGCPackage#getFilterCapabilitiesType_IdCapabilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Id_Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	IdCapabilitiesType getIdCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.FilterCapabilitiesType#getIdCapabilities <em>Id Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Capabilities</em>' containment reference.
	 * @see #getIdCapabilities()
	 * @generated
	 */
	void setIdCapabilities(IdCapabilitiesType value);

} // FilterCapabilitiesType
