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
 * A representation of the model object '<em><b>Temporal CS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A one-dimensional coordinate system containing a single time axis, used to describe the temporal position of a point in the specified time units from a specified time origin. A TemporalCS shall have one usesAxis association. 
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getTemporalCSType()
 * @model extendedMetaData="name='TemporalCSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemporalCSType extends AbstractCoordinateSystemType {
} // TemporalCSType
