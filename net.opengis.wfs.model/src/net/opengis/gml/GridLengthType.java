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
 * A representation of the model object '<em><b>Grid Length Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value of a length (or distance) quantity in a grid, where the grid spacing does not have any associated physical units, or does not have a constant physical spacing. This grid length will often be used in a digital image grid, where the base units are likely to be pixel spacings. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for length along the axes of a grid, such as pixel spacings or grid spacings.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getGridLengthType()
 * @model extendedMetaData="name='GridLengthType' kind='simple'"
 * @generated
 */
@ProviderType
public interface GridLengthType extends MeasureType {
} // GridLengthType
