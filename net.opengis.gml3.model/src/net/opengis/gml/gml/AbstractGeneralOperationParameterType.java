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
 * A representation of the model object '<em><b>Abstract General Operation Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractGeneralOperationParameterType#getMinimumOccurs <em>Minimum Occurs</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralOperationParameterType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGeneralOperationParameterType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractGeneralOperationParameterType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Minimum Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:minimumOccurs is the minimum number of times that values for this parameter group or parameter are required. If this attribute is omitted, the minimum number shall be one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Occurs</em>' attribute.
	 * @see #setMinimumOccurs(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralOperationParameterType_MinimumOccurs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='minimumOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinimumOccurs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractGeneralOperationParameterType#getMinimumOccurs <em>Minimum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Occurs</em>' attribute.
	 * @see #getMinimumOccurs()
	 * @generated
	 */
	void setMinimumOccurs(BigInteger value);

} // AbstractGeneralOperationParameterType
