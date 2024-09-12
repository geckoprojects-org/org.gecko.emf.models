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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Volume Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TopoVolumePropertyType#getTopoVolume <em>Topo Volume</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoVolumePropertyType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTopoVolumePropertyType()
 * @model extendedMetaData="name='TopoVolumePropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoVolumePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoVolume represents a homogeneous topological expression, a set of directed topologic solids, which if realised are isomorphic to a geometric solid primitive. The intended use of gml:TopoVolume is to appear within a solid feature to express the structural and geometric relationships of this solid feature to other features via the shared solid definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Volume</em>' containment reference.
	 * @see #setTopoVolume(TopoVolumeType)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoVolumePropertyType_TopoVolume()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoVolumeType getTopoVolume();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoVolumePropertyType#getTopoVolume <em>Topo Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Volume</em>' containment reference.
	 * @see #getTopoVolume()
	 * @generated
	 */
	void setTopoVolume(TopoVolumeType value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoVolumePropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoVolumePropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @generated
	 */
	void setOwns(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.TopoVolumePropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.TopoVolumePropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // TopoVolumePropertyType
