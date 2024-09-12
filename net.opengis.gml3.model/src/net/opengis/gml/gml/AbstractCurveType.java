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
 * A representation of the model object '<em><b>Abstract Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:AbstractCurveType is an abstraction of a curve to support the different levels of complexity. The curve may always be viewed as a geometric primitive, i.e. is continuous.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractCurveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCurveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractCurveType extends AbstractGeometricPrimitiveType {
} // AbstractCurveType
