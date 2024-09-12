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
 * A representation of the model object '<em><b>Prime Meridian Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for prime meridian objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.PrimeMeridianBaseType#getMeridianName <em>Meridian Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getPrimeMeridianBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='PrimeMeridianBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PrimeMeridianBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Meridian Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this prime meridian is identified. The meridianName most common value is Greenwich, and that value shall be used when the greenwichLongitude value is zero. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meridian Name</em>' containment reference.
	 * @see #setMeridianName(CodeType)
	 * @see net.opengis.gml.GMLPackage#getPrimeMeridianBaseType_MeridianName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='meridianName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getMeridianName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.PrimeMeridianBaseType#getMeridianName <em>Meridian Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meridian Name</em>' containment reference.
	 * @see #getMeridianName()
	 * @generated
	 */
	void setMeridianName(CodeType value);

} // PrimeMeridianBaseType
