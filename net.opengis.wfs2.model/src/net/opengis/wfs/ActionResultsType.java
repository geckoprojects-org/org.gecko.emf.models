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
package net.opengis.wfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Results Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.ActionResultsType#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getActionResultsType()
 * @model extendedMetaData="name='ActionResultsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ActionResultsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.CreatedOrModifiedFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getActionResultsType_Feature()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Feature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CreatedOrModifiedFeatureType> getFeature();

} // ActionResultsType
