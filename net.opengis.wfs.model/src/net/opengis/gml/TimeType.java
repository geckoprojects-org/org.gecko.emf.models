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
 * A representation of the model object '<em><b>Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value of a time or temporal quantity, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a time value, such as seconds or weeks.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getTimeType()
 * @model extendedMetaData="name='TimeType' kind='simple'"
 * @generated
 */
@ProviderType
public interface TimeType extends MeasureType {
} // TimeType
