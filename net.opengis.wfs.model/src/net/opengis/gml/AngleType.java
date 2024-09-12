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
 * A representation of the model object '<em><b>Angle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value of an angle quantity recorded as a single number, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for an angle, such as degrees or radians.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getAngleType()
 * @model extendedMetaData="name='AngleType' kind='simple'"
 * @generated
 */
@ProviderType
public interface AngleType extends MeasureType {
} // AngleType
