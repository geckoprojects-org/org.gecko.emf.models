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
 * A representation of the model object '<em><b>Geodesic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Geodesic consists of two distinct
 *    positions joined by a geodesic curve. The control points of
 *    a Geodesic shall lie on the geodesic between its start
 *    point and end points. Between these two points, a geodesic
 *    curve defined from ellipsoid or geoid model used by the
 *    co-ordinate reference systems may be used to interpolate
 *    other positions. Any other point in the controlPoint array
 *    must fall on this geodesic.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getGeodesicType()
 * @model extendedMetaData="name='GeodesicType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeodesicType extends GeodesicStringType {
} // GeodesicType
