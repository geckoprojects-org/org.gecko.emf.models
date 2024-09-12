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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear CS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A one-dimensional coordinate system that consists of the points that lie on the single axis described. The associated ordinate is the distance from the specified origin to the point along the axis. Example: usage of the line feature representing a road to describe points on or along that road. A LinearCS shall have one usesAxis association. 
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getLinearCSType()
 * @model extendedMetaData="name='LinearCSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LinearCSType extends AbstractCoordinateSystemType {
} // LinearCSType
