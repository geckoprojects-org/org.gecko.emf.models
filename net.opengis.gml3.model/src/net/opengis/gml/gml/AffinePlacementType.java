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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affine Placement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AffinePlacementType#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AffinePlacementType#getRefDirection <em>Ref Direction</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AffinePlacementType#getInDimension <em>In Dimension</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AffinePlacementType#getOutDimension <em>Out Dimension</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAffinePlacementType()
 * @model extendedMetaData="name='AffinePlacementType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AffinePlacementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(DirectPositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getAffinePlacementType_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AffinePlacementType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.VectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getAffinePlacementType_RefDirection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='refDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VectorType> getRefDirection();

	/**
	 * Returns the value of the '<em><b>In Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Dimension</em>' attribute.
	 * @see #setInDimension(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getAffinePlacementType_InDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='inDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getInDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AffinePlacementType#getInDimension <em>In Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Dimension</em>' attribute.
	 * @see #getInDimension()
	 * @generated
	 */
	void setInDimension(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Out Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Dimension</em>' attribute.
	 * @see #setOutDimension(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getAffinePlacementType_OutDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='outDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOutDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AffinePlacementType#getOutDimension <em>Out Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Dimension</em>' attribute.
	 * @see #getOutDimension()
	 * @generated
	 */
	void setOutDimension(BigInteger value);

} // AffinePlacementType
