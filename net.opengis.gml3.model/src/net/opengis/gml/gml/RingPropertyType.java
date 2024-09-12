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
 * A representation of the model object '<em><b>Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property with the content model of gml:RingPropertyType encapsulates a ring to represent a component of a surface boundary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.RingPropertyType#getRing <em>Ring</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getRingPropertyType()
 * @model extendedMetaData="name='RingPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ring is used to represent a single connected component of a surface boundary as specified in ISO 19107:2003, 6.3.6.
	 * Every gml:curveMember references or contains one curve, i.e. any element which is substitutable for gml:AbstractCurve. In the context of a ring, the curves describe the boundary of the surface. The sequence of curves shall be contiguous and connected in a cycle.
	 * If provided, the aggregationType attribute shall have the value "sequence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring</em>' containment reference.
	 * @see #setRing(RingType)
	 * @see net.opengis.gml.gml.GMLPackage#getRingPropertyType_Ring()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ring' namespace='##targetNamespace'"
	 * @generated
	 */
	RingType getRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.RingPropertyType#getRing <em>Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring</em>' containment reference.
	 * @see #getRing()
	 * @generated
	 */
	void setRing(RingType value);

} // RingPropertyType
