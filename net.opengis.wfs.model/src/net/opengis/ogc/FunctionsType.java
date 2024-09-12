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
package net.opengis.ogc;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.FunctionsType#getFunctionNames <em>Function Names</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getFunctionsType()
 * @model extendedMetaData="name='FunctionsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FunctionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Names</em>' containment reference.
	 * @see #setFunctionNames(FunctionNamesType)
	 * @see net.opengis.ogc.OGCPackage#getFunctionsType_FunctionNames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FunctionNames' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionNamesType getFunctionNames();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.FunctionsType#getFunctionNames <em>Function Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Names</em>' containment reference.
	 * @see #getFunctionNames()
	 * @generated
	 */
	void setFunctionNames(FunctionNamesType value);

} // FunctionsType
