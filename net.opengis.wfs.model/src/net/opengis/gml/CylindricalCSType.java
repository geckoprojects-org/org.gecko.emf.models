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
 * A representation of the model object '<em><b>Cylindrical CS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A three-dimensional coordinate system consisting of a polar coordinate system extended by a straight coordinate axis perpendicular to the plane spanned by the polar coordinate system. A CylindricalCS shall have three usesAxis associations. 
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getCylindricalCSType()
 * @model extendedMetaData="name='CylindricalCSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CylindricalCSType extends AbstractCoordinateSystemType {
} // CylindricalCSType
