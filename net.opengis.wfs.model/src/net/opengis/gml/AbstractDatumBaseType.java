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
 * A representation of the model object '<em><b>Abstract Datum Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for datum objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractDatumBaseType#getDatumName <em>Datum Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractDatumBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractDatumBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractDatumBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Datum Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this datum is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Name</em>' containment reference.
	 * @see #setDatumName(CodeType)
	 * @see net.opengis.gml.GMLPackage#getAbstractDatumBaseType_DatumName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datumName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getDatumName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractDatumBaseType#getDatumName <em>Datum Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Name</em>' containment reference.
	 * @see #getDatumName()
	 * @generated
	 */
	void setDatumName(CodeType value);

} // AbstractDatumBaseType
