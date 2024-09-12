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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Point Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TopoPointPropertyType#getTopoPoint <em>Topo Point</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTopoPointPropertyType()
 * @model extendedMetaData="name='TopoPointPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoPointPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topo Point</em>' containment reference.
	 * @see #setTopoPoint(TopoPointType)
	 * @see net.opengis.gml.GMLPackage#getTopoPointPropertyType_TopoPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPointType getTopoPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopoPointPropertyType#getTopoPoint <em>Topo Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Point</em>' containment reference.
	 * @see #getTopoPoint()
	 * @generated
	 */
	void setTopoPoint(TopoPointType value);

} // TopoPointPropertyType
