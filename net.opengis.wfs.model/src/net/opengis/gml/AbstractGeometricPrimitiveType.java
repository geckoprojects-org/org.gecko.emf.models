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
 * A representation of the model object '<em><b>Abstract Geometric Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the abstract root type of the geometric primitives. A geometric primitive is a geometric object that is not 
 * 			decomposed further into other primitives in the system. All primitives are oriented in the direction implied by the sequence of their 
 * 			coordinate tuples.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.GMLPackage#getAbstractGeometricPrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGeometricPrimitiveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractGeometricPrimitiveType extends AbstractGeometryType {
} // AbstractGeometricPrimitiveType
