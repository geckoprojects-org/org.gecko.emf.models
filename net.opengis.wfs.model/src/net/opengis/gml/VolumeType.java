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
 * A representation of the model object '<em><b>Volume Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value of a spatial volume quantity, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a volume, such as cubic metres or cubic feet.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getVolumeType()
 * @model extendedMetaData="name='VolumeType' kind='simple'"
 * @generated
 */
@ProviderType
public interface VolumeType extends MeasureType {
} // VolumeType
