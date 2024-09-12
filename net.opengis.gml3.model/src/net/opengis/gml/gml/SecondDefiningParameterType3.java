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
 * A representation of the model object '<em><b>Second Defining Parameter Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.SecondDefiningParameterType3#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getSecondDefiningParameterType3()
 * @model extendedMetaData="name='secondDefiningParameter_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SecondDefiningParameterType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Second Defining Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #setSecondDefiningParameter(SecondDefiningParameterType2)
	 * @see net.opengis.gml.gml.GMLPackage#getSecondDefiningParameterType3_SecondDefiningParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SecondDefiningParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondDefiningParameterType2 getSecondDefiningParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.SecondDefiningParameterType3#getSecondDefiningParameter <em>Second Defining Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #getSecondDefiningParameter()
	 * @generated
	 */
	void setSecondDefiningParameter(SecondDefiningParameterType2 value);

} // SecondDefiningParameterType3
