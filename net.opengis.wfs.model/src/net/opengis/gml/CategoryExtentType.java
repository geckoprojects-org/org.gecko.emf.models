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
 * A representation of the model object '<em><b>Category Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restriction of list type to store a 2-point range of ordinal values. If one member is a null, then this is a single ended interval.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getCategoryExtentType()
 * @model extendedMetaData="name='CategoryExtentType' kind='simple'"
 * @generated
 */
@ProviderType
public interface CategoryExtentType extends CodeOrNullListType {
} // CategoryExtentType
