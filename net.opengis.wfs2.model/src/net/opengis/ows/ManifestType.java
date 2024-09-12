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
package net.opengis.ows;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unordered list of one or more groups of references to remote and/or local resources. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.ManifestType#getReferenceGroup <em>Reference Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getManifestType()
 * @model extendedMetaData="name='ManifestType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ManifestType extends BasicIdentificationType {
	/**
	 * Returns the value of the '<em><b>Reference Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.ReferenceGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Group</em>' containment reference list.
	 * @see net.opengis.ows.OWSPackage#getManifestType_ReferenceGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReferenceGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceGroupType> getReferenceGroup();

} // ManifestType
