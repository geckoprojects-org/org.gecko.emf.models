/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFunction Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TFunctionItem#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TFunctionItem#getOutputTypeRef <em>Output Type Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionItem()
 * @model extendedMetaData="name='tFunctionItem' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TFunctionItem extends TDMNElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TInformationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionItem_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TInformationItem> getParameters();

	/**
	 * Returns the value of the '<em><b>Output Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type Ref</em>' attribute.
	 * @see #setOutputTypeRef(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTFunctionItem_OutputTypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputTypeRef'"
	 * @generated
	 */
	String getOutputTypeRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TFunctionItem#getOutputTypeRef <em>Output Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type Ref</em>' attribute.
	 * @see #getOutputTypeRef()
	 * @generated
	 */
	void setOutputTypeRef(String value);

} // TFunctionItem
