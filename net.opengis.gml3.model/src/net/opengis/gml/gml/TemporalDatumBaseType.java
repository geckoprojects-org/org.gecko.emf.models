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
package net.opengis.gml.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Datum Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TemporalDatumBaseType partially defines the origin of a temporal coordinate reference system. This type restricts the AbstractDatumType to remove the "anchorDefinition" and "realizationEpoch" elements.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.gml.GMLPackage#getTemporalDatumBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='TemporalDatumBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemporalDatumBaseType extends AbstractDatumType {
} // TemporalDatumBaseType
