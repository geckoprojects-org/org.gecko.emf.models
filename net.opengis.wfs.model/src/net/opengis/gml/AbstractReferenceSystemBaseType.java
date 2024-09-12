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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Reference System Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for reference system objects, simplifying and restricting the DefinitionType as needed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractReferenceSystemBaseType#getSrsName <em>Srs Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractReferenceSystemBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractReferenceSystemBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractReferenceSystemBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Srs Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this reference system is identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs Name</em>' containment reference.
	 * @see #setSrsName(CodeType)
	 * @see net.opengis.gml.GMLPackage#getAbstractReferenceSystemBaseType_SrsName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='srsName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractReferenceSystemBaseType#getSrsName <em>Srs Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' containment reference.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(CodeType value);

} // AbstractReferenceSystemBaseType
