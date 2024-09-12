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
 * A representation of the model object '<em><b>Abstract Topo Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractTopoPrimitiveType#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link net.opengis.gml.AbstractTopoPrimitiveType#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractTopoPrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTopoPrimitiveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractTopoPrimitiveType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Isolated</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.IsolatedPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getAbstractTopoPrimitiveType_Isolated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isolated' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IsolatedPropertyType> getIsolated();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(ContainerPropertyType)
	 * @see net.opengis.gml.GMLPackage#getAbstractTopoPrimitiveType_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerPropertyType getContainer();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractTopoPrimitiveType#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerPropertyType value);

} // AbstractTopoPrimitiveType
