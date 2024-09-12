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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.IdCapabilitiesType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ogc.IdCapabilitiesType#getEID <em>EID</em>}</li>
 *   <li>{@link net.opengis.ogc.IdCapabilitiesType#getFID <em>FID</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getIdCapabilitiesType()
 * @model extendedMetaData="name='Id_CapabilitiesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getIdCapabilitiesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>EID</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.EIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EID</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getIdCapabilitiesType_EID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EID' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EIDType> getEID();

	/**
	 * Returns the value of the '<em><b>FID</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.FIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FID</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getIdCapabilitiesType_FID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FID' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FIDType> getFID();

} // IdCapabilitiesType
