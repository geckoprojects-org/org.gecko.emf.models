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
 * A representation of the model object '<em><b>Arc By Bulge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ArcByBulge is an arc string with only one arc unit, i.e. two control points and one bulge.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getArcByBulgeType()
 * @model extendedMetaData="name='ArcByBulgeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ArcByBulgeType extends ArcStringByBulgeType {
} // ArcByBulgeType
