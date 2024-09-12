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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordinate reference system describing the position of points through two or more independent coordinate reference systems. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.CompoundCRSType#getIncludesCRS <em>Includes CRS</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getCompoundCRSType()
 * @model extendedMetaData="name='CompoundCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompoundCRSType extends AbstractReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Includes CRS</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.CoordinateReferenceSystemRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes CRS</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getCompoundCRSType_IncludesCRS()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='includesCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoordinateReferenceSystemRefType> getIncludesCRS();

} // CompoundCRSType
