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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Topology Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A temporal topology complex.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TimeTopologyComplexType#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTimeTopologyComplexType()
 * @model extendedMetaData="name='TimeTopologyComplexType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeTopologyComplexType extends AbstractTimeComplexType {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TimeTopologyPrimitivePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTimeTopologyComplexType_Primitive()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='primitive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeTopologyPrimitivePropertyType> getPrimitive();

} // TimeTopologyComplexType
