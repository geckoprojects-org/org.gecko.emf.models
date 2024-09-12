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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Unit Term Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.DerivationUnitTermType#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getDerivationUnitTermType()
 * @model extendedMetaData="name='DerivationUnitTermType' kind='empty'"
 * @generated
 */
@ProviderType
public interface DerivationUnitTermType extends UnitOfMeasureType {
	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getDerivationUnitTermType_Exponent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='exponent'"
	 * @generated
	 */
	BigInteger getExponent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DerivationUnitTermType#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(BigInteger value);

} // DerivationUnitTermType
