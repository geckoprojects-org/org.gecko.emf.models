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
 * A representation of the model object '<em><b>Circle By Center Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CircleByCenterPoint is an ArcByCenterPoint with identical start and end angle to form a full circle. Again, this represenation can be used only in 2D.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getCircleByCenterPointType()
 * @model extendedMetaData="name='CircleByCenterPointType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CircleByCenterPointType extends ArcByCenterPointType {
} // CircleByCenterPointType
