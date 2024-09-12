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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.GridEnvelopeType#getLow <em>Low</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GridEnvelopeType#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getGridEnvelopeType()
 * @model extendedMetaData="name='GridEnvelopeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GridEnvelopeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(List)
	 * @see net.opengis.gml.gml.GMLPackage#getGridEnvelopeType_Low()
	 * @model dataType="net.opengis.gml.gml.IntegerList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getLow();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GridEnvelopeType#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(List)
	 * @see net.opengis.gml.gml.GMLPackage#getGridEnvelopeType_High()
	 * @model dataType="net.opengis.gml.gml.IntegerList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getHigh();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GridEnvelopeType#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(List<BigInteger> value);

} // GridEnvelopeType
