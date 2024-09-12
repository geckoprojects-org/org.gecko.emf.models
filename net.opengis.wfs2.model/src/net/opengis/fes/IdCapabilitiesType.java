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
package net.opengis.fes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link net.opengis.fes.IdCapabilitiesType#getResourceIdentifier <em>Resource Identifier</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getIdCapabilitiesType()
 * @model extendedMetaData="name='Id_CapabilitiesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.fes.ResourceIdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Identifier</em>' containment reference list.
	 * @see net.opengis.fes.FESPackage#getIdCapabilitiesType_ResourceIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResourceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceIdentifierType> getResourceIdentifier();

} // IdCapabilitiesType
