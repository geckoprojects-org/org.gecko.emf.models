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
 * A representation of the model object '<em><b>Abstract Topology Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract type supplies the root or base type for all topological elements including primitives and complexes. It inherits AbstractGMLType and hence can be identified using the gml:id attribute.
 * <!-- end-model-doc -->
 *
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractTopologyType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTopologyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractTopologyType extends AbstractGMLType {
} // AbstractTopologyType
